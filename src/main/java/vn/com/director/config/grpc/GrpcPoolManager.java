package vn.com.director.config.grpc;

import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.stub.AbstractStub;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;
import vn.com.director.util.JsonUtils;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author huyvha
 */
@Slf4j
//
@Service
public class GrpcPoolManager {

    @Autowired(required = false)
    private GrpcClientConfig[] configs;

    private ConcurrentHashMap<String, Pair<GrpcClientConfig, List<AbstractStub>>> pool = new ConcurrentHashMap<>();
    private AtomicInteger currentIdx = new AtomicInteger(0);

    public <T> T getStub(String stubName) {
        Pair<GrpcClientConfig, List<AbstractStub>> item = pool.get(stubName);
        List<AbstractStub> stubPool = item.getRight();
        GrpcClientConfig config = item.getLeft();
        int index = currentIdx.getAndIncrement() % config.grpc.getPoolSize();
        if (currentIdx.get() >= 10000) {
            currentIdx.set(0);
        }
        return (T) stubPool.get(index);
    }

    @PostConstruct
    private void initialize() {
        if (configs == null) {
            return;
        }
        log.info("Initialize gRPC clients pool");
        Arrays.stream(configs).forEach(this::initStubs);
    }

    private void initStubs(GrpcClientConfig config) {
        log.info("Initialize pool for {} with config {}", config.stubName(), JsonUtils.printGson(config.getGrpc()));
        List<AbstractStub> stubs = IntStream.range(0, config.grpc.getPoolSize())
                .mapToObj(i -> (AbstractStub) config.createStub())
                .collect(Collectors.toList());
        pool.put(config.stubName(), Pair.of(config, stubs));
    }

    @PreDestroy
    public void shutdown() {
        log.info("Shutting down gRPC clients pool");
        pool.entrySet()
                .stream()
                .flatMap(t -> t.getValue().getRight().stream())
                .map(AbstractStub::getChannel)
                .forEach(this::tryShutdownChannel);
        log.info("gRPC clients pool destroyed");
    }

    private void tryShutdownChannel(Channel channel) {
        if (channel instanceof ManagedChannel) {
            ((ManagedChannel) channel).shutdown();
            return;
        }

        try {
            Field channelField = ReflectionUtils.findField(channel.getClass(), "channel");
            channelField.setAccessible(true);
            ManagedChannel managedChannel = (ManagedChannel) channelField.get(channel);
            managedChannel.shutdown();
            log.info("Shutdown ManagedChannel");
        } catch (Exception e) {
            log.error("Error while trying to shutdown 'channel'", e);
        }
    }

}
