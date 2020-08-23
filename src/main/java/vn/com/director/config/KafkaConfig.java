package vn.com.director.config;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@ConfigurationProperties(prefix = "kafka-producer-config")
@Configuration
@Data
@NoArgsConstructor
public class KafkaConfig {
    private String webBackendBootstrapServers;
    private String webBackendResultTopic;
    private String autoOffsetReset;
    private boolean enableAutoCommit;
    private String autoCommitIntervalMs;
    private int sessionTimeoutMs;
}
