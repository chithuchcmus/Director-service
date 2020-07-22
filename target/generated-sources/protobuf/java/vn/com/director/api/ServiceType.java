// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: direct.proto

package vn.com.director.api;

/**
 * Protobuf enum {@code director.api.ServiceType}
 */
public enum ServiceType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNKNOWN = 0;</code>
   */
  UNKNOWN(0),
  /**
   * <code>TESSERACT = 1;</code>
   */
  TESSERACT(1),
  /**
   * <code>AI2 = 2;</code>
   */
  AI2(2),
  /**
   * <code>AI3 = 3;</code>
   */
  AI3(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNKNOWN = 0;</code>
   */
  public static final int UNKNOWN_VALUE = 0;
  /**
   * <code>TESSERACT = 1;</code>
   */
  public static final int TESSERACT_VALUE = 1;
  /**
   * <code>AI2 = 2;</code>
   */
  public static final int AI2_VALUE = 2;
  /**
   * <code>AI3 = 3;</code>
   */
  public static final int AI3_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ServiceType valueOf(int value) {
    return forNumber(value);
  }

  public static ServiceType forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN;
      case 1: return TESSERACT;
      case 2: return AI2;
      case 3: return AI3;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ServiceType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ServiceType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ServiceType>() {
          public ServiceType findValueByNumber(int number) {
            return ServiceType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return vn.com.director.api.Direct.getDescriptor().getEnumTypes().get(0);
  }

  private static final ServiceType[] VALUES = values();

  public static ServiceType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ServiceType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:director.api.ServiceType)
}

