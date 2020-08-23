package vn.com.director.config;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;

@Getter
@Setter
@ConfigurationProperties(prefix = "gateway")
@Configuration
@Data
@NoArgsConstructor
public class GateWayConfig implements Serializable {
    private int numberRetry;
    private long timeSleep;
    private int clientID;
    private String clientKey;
}
