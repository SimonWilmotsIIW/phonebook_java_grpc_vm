package be.cloud;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: PhoneBook.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PhoneBookGrpc {

  private PhoneBookGrpc() {}

  public static final String SERVICE_NAME = "be.cloud.PhoneBook";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<be.cloud.Person,
      be.cloud.Success> getAddPersonMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addPerson",
      requestType = be.cloud.Person.class,
      responseType = be.cloud.Success.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<be.cloud.Person,
      be.cloud.Success> getAddPersonMethod() {
    io.grpc.MethodDescriptor<be.cloud.Person, be.cloud.Success> getAddPersonMethod;
    if ((getAddPersonMethod = PhoneBookGrpc.getAddPersonMethod) == null) {
      synchronized (PhoneBookGrpc.class) {
        if ((getAddPersonMethod = PhoneBookGrpc.getAddPersonMethod) == null) {
          PhoneBookGrpc.getAddPersonMethod = getAddPersonMethod =
              io.grpc.MethodDescriptor.<be.cloud.Person, be.cloud.Success>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addPerson"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  be.cloud.Person.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  be.cloud.Success.getDefaultInstance()))
              .setSchemaDescriptor(new PhoneBookMethodDescriptorSupplier("addPerson"))
              .build();
        }
      }
    }
    return getAddPersonMethod;
  }

  private static volatile io.grpc.MethodDescriptor<be.cloud.Person,
      be.cloud.PhoneNumber> getGetPhoneNumberByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPhoneNumberByName",
      requestType = be.cloud.Person.class,
      responseType = be.cloud.PhoneNumber.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<be.cloud.Person,
      be.cloud.PhoneNumber> getGetPhoneNumberByNameMethod() {
    io.grpc.MethodDescriptor<be.cloud.Person, be.cloud.PhoneNumber> getGetPhoneNumberByNameMethod;
    if ((getGetPhoneNumberByNameMethod = PhoneBookGrpc.getGetPhoneNumberByNameMethod) == null) {
      synchronized (PhoneBookGrpc.class) {
        if ((getGetPhoneNumberByNameMethod = PhoneBookGrpc.getGetPhoneNumberByNameMethod) == null) {
          PhoneBookGrpc.getGetPhoneNumberByNameMethod = getGetPhoneNumberByNameMethod =
              io.grpc.MethodDescriptor.<be.cloud.Person, be.cloud.PhoneNumber>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getPhoneNumberByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  be.cloud.Person.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  be.cloud.PhoneNumber.getDefaultInstance()))
              .setSchemaDescriptor(new PhoneBookMethodDescriptorSupplier("getPhoneNumberByName"))
              .build();
        }
      }
    }
    return getGetPhoneNumberByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<be.cloud.PhoneNumber,
      be.cloud.Person> getgetNameByPhoneNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getNameByPhoneNumber",
      requestType = be.cloud.PhoneNumber.class,
      responseType = be.cloud.Person.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<be.cloud.PhoneNumber,
      be.cloud.Person> getgetNameByPhoneNumberMethod() {
    io.grpc.MethodDescriptor<be.cloud.PhoneNumber, be.cloud.Person> getgetNameByPhoneNumberMethod;
    if ((getgetNameByPhoneNumberMethod = PhoneBookGrpc.getgetNameByPhoneNumberMethod) == null) {
      synchronized (PhoneBookGrpc.class) {
        if ((getgetNameByPhoneNumberMethod = PhoneBookGrpc.getgetNameByPhoneNumberMethod) == null) {
          PhoneBookGrpc.getgetNameByPhoneNumberMethod = getgetNameByPhoneNumberMethod =
              io.grpc.MethodDescriptor.<be.cloud.PhoneNumber, be.cloud.Person>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getNameByPhoneNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  be.cloud.PhoneNumber.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  be.cloud.Person.getDefaultInstance()))
              .setSchemaDescriptor(new PhoneBookMethodDescriptorSupplier("getNameByPhoneNumber"))
              .build();
        }
      }
    }
    return getgetNameByPhoneNumberMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PhoneBookStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PhoneBookStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PhoneBookStub>() {
        @java.lang.Override
        public PhoneBookStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PhoneBookStub(channel, callOptions);
        }
      };
    return PhoneBookStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PhoneBookBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PhoneBookBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PhoneBookBlockingStub>() {
        @java.lang.Override
        public PhoneBookBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PhoneBookBlockingStub(channel, callOptions);
        }
      };
    return PhoneBookBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PhoneBookFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PhoneBookFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PhoneBookFutureStub>() {
        @java.lang.Override
        public PhoneBookFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PhoneBookFutureStub(channel, callOptions);
        }
      };
    return PhoneBookFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PhoneBookImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *moet altijd message teruggeven (bool) gaat niet
     * </pre>
     */
    public void addPerson(be.cloud.Person request,
        io.grpc.stub.StreamObserver<be.cloud.Success> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddPersonMethod(), responseObserver);
    }

    /**
     */
    public void getPhoneNumberByName(be.cloud.Person request,
        io.grpc.stub.StreamObserver<be.cloud.PhoneNumber> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPhoneNumberByNameMethod(), responseObserver);
    }

    /**
     */
    public void getNameByPhoneNumber(be.cloud.PhoneNumber request,
        io.grpc.stub.StreamObserver<be.cloud.Person> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getgetNameByPhoneNumberMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddPersonMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                be.cloud.Person,
                be.cloud.Success>(
                  this, METHODID_ADD_PERSON)))
          .addMethod(
            getGetPhoneNumberByNameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                be.cloud.Person,
                be.cloud.PhoneNumber>(
                  this, METHODID_GET_PHONE_NUMBER_BY_NAME)))
          .addMethod(
            getgetNameByPhoneNumberMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                be.cloud.PhoneNumber,
                be.cloud.Person>(
                  this, METHODID_GET_NAME_BY_PHONE_NUMBER)))
          .build();
    }
  }

  /**
   */
  public static final class PhoneBookStub extends io.grpc.stub.AbstractAsyncStub<PhoneBookStub> {
    private PhoneBookStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PhoneBookStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PhoneBookStub(channel, callOptions);
    }

    /**
     * <pre>
     *moet altijd message teruggeven (bool) gaat niet
     * </pre>
     */
    public void addPerson(be.cloud.Person request,
        io.grpc.stub.StreamObserver<be.cloud.Success> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddPersonMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPhoneNumberByName(be.cloud.Person request,
        io.grpc.stub.StreamObserver<be.cloud.PhoneNumber> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPhoneNumberByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNameByPhoneNumber(be.cloud.PhoneNumber request,
        io.grpc.stub.StreamObserver<be.cloud.Person> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getgetNameByPhoneNumberMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PhoneBookBlockingStub extends io.grpc.stub.AbstractBlockingStub<PhoneBookBlockingStub> {
    private PhoneBookBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PhoneBookBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PhoneBookBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *moet altijd message teruggeven (bool) gaat niet
     * </pre>
     */
    public be.cloud.Success addPerson(be.cloud.Person request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddPersonMethod(), getCallOptions(), request);
    }

    /**
     */
    public be.cloud.PhoneNumber getPhoneNumberByName(be.cloud.Person request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPhoneNumberByNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public be.cloud.Person getNameByPhoneNumber(be.cloud.PhoneNumber request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getgetNameByPhoneNumberMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PhoneBookFutureStub extends io.grpc.stub.AbstractFutureStub<PhoneBookFutureStub> {
    private PhoneBookFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PhoneBookFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PhoneBookFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *moet altijd message teruggeven (bool) gaat niet
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<be.cloud.Success> addPerson(
        be.cloud.Person request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddPersonMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<be.cloud.PhoneNumber> getPhoneNumberByName(
        be.cloud.Person request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPhoneNumberByNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<be.cloud.Person> getNameByPhoneNumber(
        be.cloud.PhoneNumber request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getgetNameByPhoneNumberMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_PERSON = 0;
  private static final int METHODID_GET_PHONE_NUMBER_BY_NAME = 1;
  private static final int METHODID_GET_NAME_BY_PHONE_NUMBER = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PhoneBookImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PhoneBookImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_PERSON:
          serviceImpl.addPerson((be.cloud.Person) request,
              (io.grpc.stub.StreamObserver<be.cloud.Success>) responseObserver);
          break;
        case METHODID_GET_PHONE_NUMBER_BY_NAME:
          serviceImpl.getPhoneNumberByName((be.cloud.Person) request,
              (io.grpc.stub.StreamObserver<be.cloud.PhoneNumber>) responseObserver);
          break;
        case METHODID_GET_NAME_BY_PHONE_NUMBER:
          serviceImpl.getNameByPhoneNumber((be.cloud.PhoneNumber) request,
              (io.grpc.stub.StreamObserver<be.cloud.Person>) responseObserver);
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

  private static abstract class PhoneBookBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PhoneBookBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return be.cloud.PhoneBookOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PhoneBook");
    }
  }

  private static final class PhoneBookFileDescriptorSupplier
      extends PhoneBookBaseDescriptorSupplier {
    PhoneBookFileDescriptorSupplier() {}
  }

  private static final class PhoneBookMethodDescriptorSupplier
      extends PhoneBookBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PhoneBookMethodDescriptorSupplier(String methodName) {
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
      synchronized (PhoneBookGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PhoneBookFileDescriptorSupplier())
              .addMethod(getAddPersonMethod())
              .addMethod(getGetPhoneNumberByNameMethod())
              .addMethod(getgetNameByPhoneNumberMethod())
              .build();
        }
      }
    }
    return result;
  }
}
