package vn.com.director.exception;

/**
 * Error thrown when the Grpc Client could not be initialized.
 *
 * @author huyvha
 */
public class GrpcClientSSLInitializationException extends RuntimeException {
    public GrpcClientSSLInitializationException(Throwable e) {
        super(e);
    }
}
