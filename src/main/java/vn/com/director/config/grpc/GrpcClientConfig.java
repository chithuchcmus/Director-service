package vn.com.director.config.grpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.NegotiationType;
import io.grpc.netty.NettyChannelBuilder;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.SslProvider;
import lombok.Getter;
import lombok.Setter;
import vn.com.director.exception.GrpcClientSSLInitializationException;

import javax.net.ssl.SSLException;

/**
 * @author huyvha
 */
@Getter
@Setter
public abstract class GrpcClientConfig<T> {

    protected GrpcConfig grpc;

    public abstract String stubName();

    public abstract T createStub();

    protected ManagedChannel createChannel() {
        ManagedChannel channel;
        if (grpc.isUseSSL()) {
            try {
                channel = NettyChannelBuilder.forTarget(grpc.getTarget())
                        .negotiationType(NegotiationType.TLS)
                        .sslContext(GrpcSslContexts.configure(SslContextBuilder.forClient(), SslProvider.OPENSSL)
                                .build())
                        .build();
            } catch (SSLException e) {
                throw new GrpcClientSSLInitializationException(e);
            }
        } else {
            channel = ManagedChannelBuilder.forTarget(grpc.getTarget()).usePlaintext().build();
        }

        return channel;
    }

}
