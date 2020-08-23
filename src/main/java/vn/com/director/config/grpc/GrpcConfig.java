package vn.com.director.config.grpc;

import lombok.Getter;
import lombok.Setter;

/**
 * @author huyvha
 */
@Getter
@Setter
public class GrpcConfig {
    private String target;
    private boolean useSSL;
    private int poolSize;
//    private int deadlineMs;
//    private boolean isKeepAlive;
//    private int keepAliveMinutes;
}
