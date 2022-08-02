package Singer;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: signer.proto")
public final class signGrpc {

  private signGrpc() {}

  public static final String SERVICE_NAME = "sign";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Singer.Signer.signRequest,
      Singer.Signer.signReply> getSignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sign",
      requestType = Singer.Signer.signRequest.class,
      responseType = Singer.Signer.signReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Singer.Signer.signRequest,
      Singer.Signer.signReply> getSignMethod() {
    io.grpc.MethodDescriptor<Singer.Signer.signRequest, Singer.Signer.signReply> getSignMethod;
    if ((getSignMethod = signGrpc.getSignMethod) == null) {
      synchronized (signGrpc.class) {
        if ((getSignMethod = signGrpc.getSignMethod) == null) {
          signGrpc.getSignMethod = getSignMethod = 
              io.grpc.MethodDescriptor.<Singer.Signer.signRequest, Singer.Signer.signReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "sign", "sign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Singer.Signer.signRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Singer.Signer.signReply.getDefaultInstance()))
                  .setSchemaDescriptor(new signMethodDescriptorSupplier("sign"))
                  .build();
          }
        }
     }
     return getSignMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static signStub newStub(io.grpc.Channel channel) {
    return new signStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static signBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new signBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static signFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new signFutureStub(channel);
  }

  /**
   */
  public static abstract class signImplBase implements io.grpc.BindableService {

    /**
     */
    public void sign(Singer.Signer.signRequest request,
        io.grpc.stub.StreamObserver<Singer.Signer.signReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSignMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSignMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Singer.Signer.signRequest,
                Singer.Signer.signReply>(
                  this, METHODID_SIGN)))
          .build();
    }
  }

  /**
   */
  public static final class signStub extends io.grpc.stub.AbstractStub<signStub> {
    private signStub(io.grpc.Channel channel) {
      super(channel);
    }

    private signStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected signStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new signStub(channel, callOptions);
    }

    /**
     */
    public void sign(Singer.Signer.signRequest request,
        io.grpc.stub.StreamObserver<Singer.Signer.signReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSignMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class signBlockingStub extends io.grpc.stub.AbstractStub<signBlockingStub> {
    private signBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private signBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected signBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new signBlockingStub(channel, callOptions);
    }

    /**
     */
    public Singer.Signer.signReply sign(Singer.Signer.signRequest request) {
      return blockingUnaryCall(
          getChannel(), getSignMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class signFutureStub extends io.grpc.stub.AbstractStub<signFutureStub> {
    private signFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private signFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected signFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new signFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Singer.Signer.signReply> sign(
        Singer.Signer.signRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSignMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SIGN = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final signImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(signImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SIGN:
          serviceImpl.sign((Singer.Signer.signRequest) request,
              (io.grpc.stub.StreamObserver<Singer.Signer.signReply>) responseObserver);
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

  private static abstract class signBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    signBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Singer.Signer.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("sign");
    }
  }

  private static final class signFileDescriptorSupplier
      extends signBaseDescriptorSupplier {
    signFileDescriptorSupplier() {}
  }

  private static final class signMethodDescriptorSupplier
      extends signBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    signMethodDescriptorSupplier(String methodName) {
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
      synchronized (signGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new signFileDescriptorSupplier())
              .addMethod(getSignMethod())
              .build();
        }
      }
    }
    return result;
  }
}
