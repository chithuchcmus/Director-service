package vn.com.director.config;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Getter
@Setter
@ConfigurationProperties(prefix = "app")
@Configuration
@Data
@NoArgsConstructor
public class AppConfig {
    private int numberRetryGetStatus;
    private long secondSleepBeforeGetStatus;
    private int secondProcessInLock;
    private int secondTransLogInCache;
    private int gateWayTimeOut;
    private Map<Integer, String> clientInfo;
}
