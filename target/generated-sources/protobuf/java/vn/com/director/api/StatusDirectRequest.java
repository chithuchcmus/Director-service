// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: direct.proto

package vn.com.director.api;

/**
 * Protobuf type {@code director.api.StatusDirectRequest}
 */
public  final class StatusDirectRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:director.api.StatusDirectRequest)
    StatusDirectRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StatusDirectRequest.newBuilder() to construct.
  private StatusDirectRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StatusDirectRequest() {
    transID_ = "";
    sig_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StatusDirectRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            transID_ = s;
            break;
          }
          case 16: {

            clientID_ = input.readInt32();
            break;
          }
          case 24: {

            requestDate_ = input.readInt64();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            sig_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return vn.com.director.api.Direct.internal_static_director_api_StatusDirectRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return vn.com.director.api.Direct.internal_static_director_api_StatusDirectRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            vn.com.director.api.StatusDirectRequest.class, vn.com.director.api.StatusDirectRequest.Builder.class);
  }

  public static final int TRANSID_FIELD_NUMBER = 1;
  private volatile java.lang.Object transID_;
  /**
   * <code>string transID = 1;</code>
   */
  public java.lang.String getTransID() {
    java.lang.Object ref = transID_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      transID_ = s;
      return s;
    }
  }
  /**
   * <code>string transID = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTransIDBytes() {
    java.lang.Object ref = transID_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      transID_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLIENTID_FIELD_NUMBER = 2;
  private int clientID_;
  /**
   * <code>int32 clientID = 2;</code>
   */
  public int getClientID() {
    return clientID_;
  }

  public static final int REQUESTDATE_FIELD_NUMBER = 3;
  private long requestDate_;
  /**
   * <code>int64 requestDate = 3;</code>
   */
  public long getRequestDate() {
    return requestDate_;
  }

  public static final int SIG_FIELD_NUMBER = 4;
  private volatile java.lang.Object sig_;
  /**
   * <code>string sig = 4;</code>
   */
  public java.lang.String getSig() {
    java.lang.Object ref = sig_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sig_ = s;
      return s;
    }
  }
  /**
   * <code>string sig = 4;</code>
   */
  public com.google.protobuf.ByteString
      getSigBytes() {
    java.lang.Object ref = sig_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sig_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getTransIDBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, transID_);
    }
    if (clientID_ != 0) {
      output.writeInt32(2, clientID_);
    }
    if (requestDate_ != 0L) {
      output.writeInt64(3, requestDate_);
    }
    if (!getSigBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, sig_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTransIDBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, transID_);
    }
    if (clientID_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, clientID_);
    }
    if (requestDate_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, requestDate_);
    }
    if (!getSigBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, sig_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof vn.com.director.api.StatusDirectRequest)) {
      return super.equals(obj);
    }
    vn.com.director.api.StatusDirectRequest other = (vn.com.director.api.StatusDirectRequest) obj;

    if (!getTransID()
        .equals(other.getTransID())) return false;
    if (getClientID()
        != other.getClientID()) return false;
    if (getRequestDate()
        != other.getRequestDate()) return false;
    if (!getSig()
        .equals(other.getSig())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TRANSID_FIELD_NUMBER;
    hash = (53 * hash) + getTransID().hashCode();
    hash = (37 * hash) + CLIENTID_FIELD_NUMBER;
    hash = (53 * hash) + getClientID();
    hash = (37 * hash) + REQUESTDATE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRequestDate());
    hash = (37 * hash) + SIG_FIELD_NUMBER;
    hash = (53 * hash) + getSig().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static vn.com.director.api.StatusDirectRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static vn.com.director.api.StatusDirectRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static vn.com.director.api.StatusDirectRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static vn.com.director.api.StatusDirectRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static vn.com.director.api.StatusDirectRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static vn.com.director.api.StatusDirectRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static vn.com.director.api.StatusDirectRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static vn.com.director.api.StatusDirectRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static vn.com.director.api.StatusDirectRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static vn.com.director.api.StatusDirectRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static vn.com.director.api.StatusDirectRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static vn.com.director.api.StatusDirectRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(vn.com.director.api.StatusDirectRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code director.api.StatusDirectRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:director.api.StatusDirectRequest)
      vn.com.director.api.StatusDirectRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return vn.com.director.api.Direct.internal_static_director_api_StatusDirectRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return vn.com.director.api.Direct.internal_static_director_api_StatusDirectRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              vn.com.director.api.StatusDirectRequest.class, vn.com.director.api.StatusDirectRequest.Builder.class);
    }

    // Construct using vn.com.director.api.StatusDirectRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      transID_ = "";

      clientID_ = 0;

      requestDate_ = 0L;

      sig_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return vn.com.director.api.Direct.internal_static_director_api_StatusDirectRequest_descriptor;
    }

    @java.lang.Override
    public vn.com.director.api.StatusDirectRequest getDefaultInstanceForType() {
      return vn.com.director.api.StatusDirectRequest.getDefaultInstance();
    }

    @java.lang.Override
    public vn.com.director.api.StatusDirectRequest build() {
      vn.com.director.api.StatusDirectRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public vn.com.director.api.StatusDirectRequest buildPartial() {
      vn.com.director.api.StatusDirectRequest result = new vn.com.director.api.StatusDirectRequest(this);
      result.transID_ = transID_;
      result.clientID_ = clientID_;
      result.requestDate_ = requestDate_;
      result.sig_ = sig_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof vn.com.director.api.StatusDirectRequest) {
        return mergeFrom((vn.com.director.api.StatusDirectRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(vn.com.director.api.StatusDirectRequest other) {
      if (other == vn.com.director.api.StatusDirectRequest.getDefaultInstance()) return this;
      if (!other.getTransID().isEmpty()) {
        transID_ = other.transID_;
        onChanged();
      }
      if (other.getClientID() != 0) {
        setClientID(other.getClientID());
      }
      if (other.getRequestDate() != 0L) {
        setRequestDate(other.getRequestDate());
      }
      if (!other.getSig().isEmpty()) {
        sig_ = other.sig_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      vn.com.director.api.StatusDirectRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (vn.com.director.api.StatusDirectRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object transID_ = "";
    /**
     * <code>string transID = 1;</code>
     */
    public java.lang.String getTransID() {
      java.lang.Object ref = transID_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        transID_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string transID = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTransIDBytes() {
      java.lang.Object ref = transID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        transID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string transID = 1;</code>
     */
    public Builder setTransID(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      transID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string transID = 1;</code>
     */
    public Builder clearTransID() {
      
      transID_ = getDefaultInstance().getTransID();
      onChanged();
      return this;
    }
    /**
     * <code>string transID = 1;</code>
     */
    public Builder setTransIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      transID_ = value;
      onChanged();
      return this;
    }

    private int clientID_ ;
    /**
     * <code>int32 clientID = 2;</code>
     */
    public int getClientID() {
      return clientID_;
    }
    /**
     * <code>int32 clientID = 2;</code>
     */
    public Builder setClientID(int value) {
      
      clientID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 clientID = 2;</code>
     */
    public Builder clearClientID() {
      
      clientID_ = 0;
      onChanged();
      return this;
    }

    private long requestDate_ ;
    /**
     * <code>int64 requestDate = 3;</code>
     */
    public long getRequestDate() {
      return requestDate_;
    }
    /**
     * <code>int64 requestDate = 3;</code>
     */
    public Builder setRequestDate(long value) {
      
      requestDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 requestDate = 3;</code>
     */
    public Builder clearRequestDate() {
      
      requestDate_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object sig_ = "";
    /**
     * <code>string sig = 4;</code>
     */
    public java.lang.String getSig() {
      java.lang.Object ref = sig_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sig_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sig = 4;</code>
     */
    public com.google.protobuf.ByteString
        getSigBytes() {
      java.lang.Object ref = sig_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sig_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sig = 4;</code>
     */
    public Builder setSig(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sig_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string sig = 4;</code>
     */
    public Builder clearSig() {
      
      sig_ = getDefaultInstance().getSig();
      onChanged();
      return this;
    }
    /**
     * <code>string sig = 4;</code>
     */
    public Builder setSigBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sig_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:director.api.StatusDirectRequest)
  }

  // @@protoc_insertion_point(class_scope:director.api.StatusDirectRequest)
  private static final vn.com.director.api.StatusDirectRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new vn.com.director.api.StatusDirectRequest();
  }

  public static vn.com.director.api.StatusDirectRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StatusDirectRequest>
      PARSER = new com.google.protobuf.AbstractParser<StatusDirectRequest>() {
    @java.lang.Override
    public StatusDirectRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StatusDirectRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StatusDirectRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StatusDirectRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public vn.com.director.api.StatusDirectRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
