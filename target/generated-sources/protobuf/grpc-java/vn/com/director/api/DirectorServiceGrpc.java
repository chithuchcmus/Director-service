package vn.com.director.api;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: direct.proto")
public final class DirectorServiceGrpc {

  private DirectorServiceGrpc() {}

  public static final String SERVICE_NAME = "director.api.DirectorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<vn.com.director.api.DirectRequest,
      vn.com.director.api.DirectResponse> getProcessDirectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "processDirect",
      requestType = vn.com.director.api.DirectRequest.class,
      responseType = vn.com.director.api.DirectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<vn.com.director.api.DirectRequest,
      vn.com.director.api.DirectResponse> getProcessDirectMethod() {
    io.grpc.MethodDescriptor<vn.com.director.api.DirectRequest, vn.com.director.api.DirectResponse> getProcessDirectMethod;
    if ((getProcessDirectMethod = DirectorServiceGrpc.getProcessDirectMethod) == null) {
      synchronized (DirectorServiceGrpc.class) {
        if ((getProcessDirectMethod = DirectorServiceGrpc.getProcessDirectMethod) == null) {
          DirectorServiceGrpc.getProcessDirectMethod = getProcessDirectMethod = 
              io.grpc.MethodDescriptor.<vn.com.director.api.DirectRequest, vn.com.director.api.DirectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "director.api.DirectorService", "processDirect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vn.com.director.api.DirectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vn.com.director.api.DirectResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DirectorServiceMethodDescriptorSupplier("processDirect"))
                  .build();
          }
        }
     }
     return getProcessDirectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<vn.com.director.api.StatusDirectRequest,
      vn.com.director.api.DirectResponse> getGetStatusDirectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getStatusDirect",
      requestType = vn.com.director.api.StatusDirectRequest.class,
      responseType = vn.com.director.api.DirectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<vn.com.director.api.StatusDirectRequest,
      vn.com.director.api.DirectResponse> getGetStatusDirectMethod() {
    io.grpc.MethodDescriptor<vn.com.director.api.StatusDirectRequest, vn.com.director.api.DirectResponse> getGetStatusDirectMethod;
    if ((getGetStatusDirectMethod = DirectorServiceGrpc.getGetStatusDirectMethod) == null) {
      synchronized (DirectorServiceGrpc.class) {
        if ((getGetStatusDirectMethod = DirectorServiceGrpc.getGetStatusDirectMethod) == null) {
          DirectorServiceGrpc.getGetStatusDirectMethod = getGetStatusDirectMethod = 
              io.grpc.MethodDescriptor.<vn.com.director.api.StatusDirectRequest, vn.com.director.api.DirectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "director.api.DirectorService", "getStatusDirect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vn.com.director.api.StatusDirectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vn.com.director.api.DirectResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DirectorServiceMethodDescriptorSupplier("getStatusDirect"))
                  .build();
          }
        }
     }
     return getGetStatusDirectMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DirectorServiceStub newStub(io.grpc.Channel channel) {
    return new DirectorServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DirectorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DirectorServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DirectorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DirectorServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class DirectorServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void processDirect(vn.com.director.api.DirectRequest request,
        io.grpc.stub.StreamObserver<vn.com.director.api.DirectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getProcessDirectMethod(), responseObserver);
    }

    /**
     */
    public void getStatusDirect(vn.com.director.api.StatusDirectRequest request,
        io.grpc.stub.StreamObserver<vn.com.director.api.DirectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStatusDirectMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getProcessDirectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                vn.com.director.api.DirectRequest,
                vn.com.director.api.DirectResponse>(
                  this, METHODID_PROCESS_DIRECT)))
          .addMethod(
            getGetStatusDirectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                vn.com.director.api.StatusDirectRequest,
                vn.com.director.api.DirectResponse>(
                  this, METHODID_GET_STATUS_DIRECT)))
          .build();
    }
  }

  /**
   */
  public static final class DirectorServiceStub extends io.grpc.stub.AbstractStub<DirectorServiceStub> {
    private DirectorServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DirectorServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DirectorServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DirectorServiceStub(channel, callOptions);
    }

    /**
     */
    public void processDirect(vn.com.director.api.DirectRequest request,
        io.grpc.stub.StreamObserver<vn.com.director.api.DirectResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProcessDirectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStatusDirect(vn.com.director.api.StatusDirectRequest request,
        io.grpc.stub.StreamObserver<vn.com.director.api.DirectResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStatusDirectMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DirectorServiceBlockingStub extends io.grpc.stub.AbstractStub<DirectorServiceBlockingStub> {
    private DirectorServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DirectorServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DirectorServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DirectorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public vn.com.director.api.DirectResponse processDirect(vn.com.director.api.DirectRequest request) {
      return blockingUnaryCall(
          getChannel(), getProcessDirectMethod(), getCallOptions(), request);
    }

    /**
     */
    public vn.com.director.api.DirectResponse getStatusDirect(vn.com.director.api.StatusDirectRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetStatusDirectMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DirectorServiceFutureStub extends io.grpc.stub.AbstractStub<DirectorServiceFutureStub> {
    private DirectorServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DirectorServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DirectorServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DirectorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<vn.com.director.api.DirectResponse> processDirect(
        vn.com.director.api.DirectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getProcessDirectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<vn.com.director.api.DirectResponse> getStatusDirect(
        vn.com.director.api.StatusDirectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStatusDirectMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PROCESS_DIRECT = 0;
  private static final int METHODID_GET_STATUS_DIRECT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DirectorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DirectorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PROCESS_DIRECT:
          serviceImpl.processDirect((vn.com.director.api.DirectRequest) request,
              (io.grpc.stub.StreamObserver<vn.com.director.api.DirectResponse>) responseObserver);
          break;
        case METHODID_GET_STATUS_DIRECT:
          serviceImpl.getStatusDirect((vn.com.director.api.StatusDirectRequest) request,
              (io.grpc.stub.StreamObserver<vn.com.director.api.DirectResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DirectorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DirectorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return vn.com.director.api.Direct.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DirectorService");
    }
  }

  private static final class DirectorServiceFileDescriptorSupplier
      extends DirectorServiceBaseDescriptorSupplier {
    DirectorServiceFileDescriptorSupplier() {}
  }

  private static final class DirectorServiceMethodDescriptorSupplier
      extends DirectorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DirectorServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DirectorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DirectorServiceFileDescriptorSupplier())
              .addMethod(getProcessDirectMethod())
              .addMethod(getGetStatusDirectMethod())
              .build();
        }
      }
    }
    return result;
  }
}
