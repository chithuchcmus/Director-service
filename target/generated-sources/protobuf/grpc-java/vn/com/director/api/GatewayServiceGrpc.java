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
    comments = "Source: gateway.proto")
public final class GatewayServiceGrpc {

  private GatewayServiceGrpc() {}

  public static final String SERVICE_NAME = "api.gateway.v1.GatewayService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<vn.com.director.api.PingRequest,
      vn.com.director.api.PingResponse> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ping",
      requestType = vn.com.director.api.PingRequest.class,
      responseType = vn.com.director.api.PingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<vn.com.director.api.PingRequest,
      vn.com.director.api.PingResponse> getPingMethod() {
    io.grpc.MethodDescriptor<vn.com.director.api.PingRequest, vn.com.director.api.PingResponse> getPingMethod;
    if ((getPingMethod = GatewayServiceGrpc.getPingMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getPingMethod = GatewayServiceGrpc.getPingMethod) == null) {
          GatewayServiceGrpc.getPingMethod = getPingMethod = 
              io.grpc.MethodDescriptor.<vn.com.director.api.PingRequest, vn.com.director.api.PingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.gateway.v1.GatewayService", "Ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vn.com.director.api.PingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vn.com.director.api.PingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("Ping"))
                  .build();
          }
        }
     }
     return getPingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<vn.com.director.api.ProcessRequest,
      vn.com.director.api.ProcessResponse> getProcessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Process",
      requestType = vn.com.director.api.ProcessRequest.class,
      responseType = vn.com.director.api.ProcessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<vn.com.director.api.ProcessRequest,
      vn.com.director.api.ProcessResponse> getProcessMethod() {
    io.grpc.MethodDescriptor<vn.com.director.api.ProcessRequest, vn.com.director.api.ProcessResponse> getProcessMethod;
    if ((getProcessMethod = GatewayServiceGrpc.getProcessMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getProcessMethod = GatewayServiceGrpc.getProcessMethod) == null) {
          GatewayServiceGrpc.getProcessMethod = getProcessMethod = 
              io.grpc.MethodDescriptor.<vn.com.director.api.ProcessRequest, vn.com.director.api.ProcessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.gateway.v1.GatewayService", "Process"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vn.com.director.api.ProcessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vn.com.director.api.ProcessResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("Process"))
                  .build();
          }
        }
     }
     return getProcessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<vn.com.director.api.GetStatusRequest,
      vn.com.director.api.GetStatusResponse> getGetStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStatus",
      requestType = vn.com.director.api.GetStatusRequest.class,
      responseType = vn.com.director.api.GetStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<vn.com.director.api.GetStatusRequest,
      vn.com.director.api.GetStatusResponse> getGetStatusMethod() {
    io.grpc.MethodDescriptor<vn.com.director.api.GetStatusRequest, vn.com.director.api.GetStatusResponse> getGetStatusMethod;
    if ((getGetStatusMethod = GatewayServiceGrpc.getGetStatusMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getGetStatusMethod = GatewayServiceGrpc.getGetStatusMethod) == null) {
          GatewayServiceGrpc.getGetStatusMethod = getGetStatusMethod = 
              io.grpc.MethodDescriptor.<vn.com.director.api.GetStatusRequest, vn.com.director.api.GetStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.gateway.v1.GatewayService", "GetStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vn.com.director.api.GetStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vn.com.director.api.GetStatusResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("GetStatus"))
                  .build();
          }
        }
     }
     return getGetStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GatewayServiceStub newStub(io.grpc.Channel channel) {
    return new GatewayServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GatewayServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GatewayServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GatewayServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GatewayServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GatewayServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void ping(vn.com.director.api.PingRequest request,
        io.grpc.stub.StreamObserver<vn.com.director.api.PingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }

    /**
     */
    public void process(vn.com.director.api.ProcessRequest request,
        io.grpc.stub.StreamObserver<vn.com.director.api.ProcessResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getProcessMethod(), responseObserver);
    }

    /**
     */
    public void getStatus(vn.com.director.api.GetStatusRequest request,
        io.grpc.stub.StreamObserver<vn.com.director.api.GetStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                vn.com.director.api.PingRequest,
                vn.com.director.api.PingResponse>(
                  this, METHODID_PING)))
          .addMethod(
            getProcessMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                vn.com.director.api.ProcessRequest,
                vn.com.director.api.ProcessResponse>(
                  this, METHODID_PROCESS)))
          .addMethod(
            getGetStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                vn.com.director.api.GetStatusRequest,
                vn.com.director.api.GetStatusResponse>(
                  this, METHODID_GET_STATUS)))
          .build();
    }
  }

  /**
   */
  public static final class GatewayServiceStub extends io.grpc.stub.AbstractStub<GatewayServiceStub> {
    private GatewayServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GatewayServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GatewayServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GatewayServiceStub(channel, callOptions);
    }

    /**
     */
    public void ping(vn.com.director.api.PingRequest request,
        io.grpc.stub.StreamObserver<vn.com.director.api.PingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void process(vn.com.director.api.ProcessRequest request,
        io.grpc.stub.StreamObserver<vn.com.director.api.ProcessResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProcessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStatus(vn.com.director.api.GetStatusRequest request,
        io.grpc.stub.StreamObserver<vn.com.director.api.GetStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GatewayServiceBlockingStub extends io.grpc.stub.AbstractStub<GatewayServiceBlockingStub> {
    private GatewayServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GatewayServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GatewayServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GatewayServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public vn.com.director.api.PingResponse ping(vn.com.director.api.PingRequest request) {
      return blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }

    /**
     */
    public vn.com.director.api.ProcessResponse process(vn.com.director.api.ProcessRequest request) {
      return blockingUnaryCall(
          getChannel(), getProcessMethod(), getCallOptions(), request);
    }

    /**
     */
    public vn.com.director.api.GetStatusResponse getStatus(vn.com.director.api.GetStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GatewayServiceFutureStub extends io.grpc.stub.AbstractStub<GatewayServiceFutureStub> {
    private GatewayServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GatewayServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GatewayServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GatewayServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<vn.com.director.api.PingResponse> ping(
        vn.com.director.api.PingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<vn.com.director.api.ProcessResponse> process(
        vn.com.director.api.ProcessRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getProcessMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<vn.com.director.api.GetStatusResponse> getStatus(
        vn.com.director.api.GetStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;
  private static final int METHODID_PROCESS = 1;
  private static final int METHODID_GET_STATUS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GatewayServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GatewayServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PING:
          serviceImpl.ping((vn.com.director.api.PingRequest) request,
              (io.grpc.stub.StreamObserver<vn.com.director.api.PingResponse>) responseObserver);
          break;
        case METHODID_PROCESS:
          serviceImpl.process((vn.com.director.api.ProcessRequest) request,
              (io.grpc.stub.StreamObserver<vn.com.director.api.ProcessResponse>) responseObserver);
          break;
        case METHODID_GET_STATUS:
          serviceImpl.getStatus((vn.com.director.api.GetStatusRequest) request,
              (io.grpc.stub.StreamObserver<vn.com.director.api.GetStatusResponse>) responseObserver);
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

  private static abstract class GatewayServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GatewayServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return vn.com.director.api.Gateway.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GatewayService");
    }
  }

  private static final class GatewayServiceFileDescriptorSupplier
      extends GatewayServiceBaseDescriptorSupplier {
    GatewayServiceFileDescriptorSupplier() {}
  }

  private static final class GatewayServiceMethodDescriptorSupplier
      extends GatewayServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GatewayServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GatewayServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GatewayServiceFileDescriptorSupplier())
              .addMethod(getPingMethod())
              .addMethod(getProcessMethod())
              .addMethod(getGetStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
