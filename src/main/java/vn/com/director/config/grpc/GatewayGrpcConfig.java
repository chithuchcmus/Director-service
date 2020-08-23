package vn.com.director.config.grpc;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import vn.com.director.api.GatewayServiceGrpc;

@ConfigurationProperties(prefix = "gateway.client")
@Configuration
@ComponentScan(basePackages = "vn.com.director.config.grpc")
@Data
@NoArgsConstructor
public class GatewayGrpcConfig extends GrpcClientConfig<GatewayServiceGrpc.GatewayServiceBlockingStub> {

    public static final String NAME = "gatewayStub";

    @Override
    public String stubName() {
        return NAME;
    }

    @Override
    public GatewayServiceGrpc.GatewayServiceBlockingStub createStub() {
        return GatewayServiceGrpc.newBlockingStub(createChannel());

    }
}
