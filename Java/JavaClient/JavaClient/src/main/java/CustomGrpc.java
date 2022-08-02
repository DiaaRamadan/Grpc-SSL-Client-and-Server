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
    comments = "Source: custom.proto")
public final class CustomGrpc {

  private CustomGrpc() {}

  public static final String SERVICE_NAME = "Custom";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<CustomOuterClass.CustomLookupModel,
      CustomOuterClass.CustomModel> getGetCustomInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCustomInfo",
      requestType = CustomOuterClass.CustomLookupModel.class,
      responseType = CustomOuterClass.CustomModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CustomOuterClass.CustomLookupModel,
      CustomOuterClass.CustomModel> getGetCustomInfoMethod() {
    io.grpc.MethodDescriptor<CustomOuterClass.CustomLookupModel, CustomOuterClass.CustomModel> getGetCustomInfoMethod;
    if ((getGetCustomInfoMethod = CustomGrpc.getGetCustomInfoMethod) == null) {
      synchronized (CustomGrpc.class) {
        if ((getGetCustomInfoMethod = CustomGrpc.getGetCustomInfoMethod) == null) {
          CustomGrpc.getGetCustomInfoMethod = getGetCustomInfoMethod = 
              io.grpc.MethodDescriptor.<CustomOuterClass.CustomLookupModel, CustomOuterClass.CustomModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Custom", "getCustomInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CustomOuterClass.CustomLookupModel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CustomOuterClass.CustomModel.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomMethodDescriptorSupplier("getCustomInfo"))
                  .build();
          }
        }
     }
     return getGetCustomInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomStub newStub(io.grpc.Channel channel) {
    return new CustomStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CustomBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CustomFutureStub(channel);
  }

  /**
   */
  public static abstract class CustomImplBase implements io.grpc.BindableService {

    /**
     */
    public void getCustomInfo(CustomOuterClass.CustomLookupModel request,
        io.grpc.stub.StreamObserver<CustomOuterClass.CustomModel> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCustomInfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCustomInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                CustomOuterClass.CustomLookupModel,
                CustomOuterClass.CustomModel>(
                  this, METHODID_GET_CUSTOM_INFO)))
          .build();
    }
  }

  /**
   */
  public static final class CustomStub extends io.grpc.stub.AbstractStub<CustomStub> {
    private CustomStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomStub(channel, callOptions);
    }

    /**
     */
    public void getCustomInfo(CustomOuterClass.CustomLookupModel request,
        io.grpc.stub.StreamObserver<CustomOuterClass.CustomModel> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCustomInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CustomBlockingStub extends io.grpc.stub.AbstractStub<CustomBlockingStub> {
    private CustomBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomBlockingStub(channel, callOptions);
    }

    /**
     */
    public CustomOuterClass.CustomModel getCustomInfo(CustomOuterClass.CustomLookupModel request) {
      return blockingUnaryCall(
          getChannel(), getGetCustomInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CustomFutureStub extends io.grpc.stub.AbstractStub<CustomFutureStub> {
    private CustomFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<CustomOuterClass.CustomModel> getCustomInfo(
        CustomOuterClass.CustomLookupModel request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCustomInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CUSTOM_INFO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CustomImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CustomImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CUSTOM_INFO:
          serviceImpl.getCustomInfo((CustomOuterClass.CustomLookupModel) request,
              (io.grpc.stub.StreamObserver<CustomOuterClass.CustomModel>) responseObserver);
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

  private static abstract class CustomBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return CustomOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Custom");
    }
  }

  private static final class CustomFileDescriptorSupplier
      extends CustomBaseDescriptorSupplier {
    CustomFileDescriptorSupplier() {}
  }

  private static final class CustomMethodDescriptorSupplier
      extends CustomBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CustomMethodDescriptorSupplier(String methodName) {
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
      synchronized (CustomGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomFileDescriptorSupplier())
              .addMethod(getGetCustomInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
