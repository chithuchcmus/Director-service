package vn.com.director.client.gateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.director.api.*;
import vn.com.director.config.AppConfig;
import vn.com.director.config.grpc.GatewayGrpcConfig;
import vn.com.director.config.grpc.GrpcPoolManager;
import vn.com.director.util.JsonUtils;

import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class GatewayClientImpl implements GatewayClient {
    @Autowired
    private GrpcPoolManager poolManager;

    @Autowired
    private AppConfig appConfig;

    @Override
    public ProcessResponse process(ProcessRequest request) {
        log.info("process gateway request: {}", JsonUtils.printGson(request));
        GatewayServiceGrpc.GatewayServiceBlockingStub stub = poolManager.getStub(GatewayGrpcConfig.NAME);
        ProcessResponse response = stub.withDeadlineAfter(appConfig.getGateWayTimeOut(), TimeUnit.SECONDS).process(request);
        log.info("process gateway response: {}", JsonUtils.printGson(response));
        return response;
    }

    @Override
    public GetStatusResponse getStatus(GetStatusRequest request) {
        log.info("getStatus gateway request: {}", JsonUtils.printGson(request));
        GatewayServiceGrpc.GatewayServiceBlockingStub stub = poolManager.getStub(GatewayGrpcConfig.NAME);
        GetStatusResponse response = stub.withDeadlineAfter(appConfig.getGateWayTimeOut(), TimeUnit.SECONDS).getStatus(request);
        log.info("get status gateway response: {}", JsonUtils.printGson(response));
        return response;
    }
}
