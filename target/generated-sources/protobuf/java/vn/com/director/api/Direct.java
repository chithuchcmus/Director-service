// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: direct.proto

package vn.com.director.api;

public final class Direct {
  private Direct() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_director_api_DirectRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_director_api_DirectRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_director_api_DirectResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_director_api_DirectResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_director_api_StatusDirectRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_director_api_StatusDirectRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014direct.proto\022\014director.api\"d\n\rDirectRe" +
      "quest\022\021\n\trequestID\030\001 \001(\t\022\014\n\004data\030\002 \001(\t\022\020" +
      "\n\010clientID\030\003 \001(\005\022\023\n\013requestDate\030\004 \001(\003\022\013\n" +
      "\003sig\030\005 \001(\t\"G\n\016DirectResponse\022\023\n\013return_c" +
      "ode\030\001 \001(\005\022\017\n\007transID\030\002 \001(\t\022\017\n\007message\030\003 " +
      "\001(\t\"Z\n\023StatusDirectRequest\022\017\n\007transID\030\001 " +
      "\001(\t\022\020\n\010clientID\030\002 \001(\005\022\023\n\013requestDate\030\003 \001" +
      "(\003\022\013\n\003sig\030\004 \001(\t*;\n\013ServiceType\022\013\n\007UNKNOW" +
      "N\020\000\022\r\n\tTESSERACT\020\001\022\020\n\014LANGUAGETOOL\020\002*\032\n\013" +
      "RequestType\022\013\n\007AI_TYPE\020\0002\261\001\n\017DirectorSer" +
      "vice\022J\n\rprocessDirect\022\033.director.api.Dir" +
      "ectRequest\032\034.director.api.DirectResponse" +
      "\022R\n\017getStatusDirect\022!.director.api.Statu" +
      "sDirectRequest\032\034.director.api.DirectResp" +
      "onseB\027\n\023vn.com.director.apiP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_director_api_DirectRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_director_api_DirectRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_director_api_DirectRequest_descriptor,
        new java.lang.String[] { "RequestID", "Data", "ClientID", "RequestDate", "Sig", });
    internal_static_director_api_DirectResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_director_api_DirectResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_director_api_DirectResponse_descriptor,
        new java.lang.String[] { "ReturnCode", "TransID", "Message", });
    internal_static_director_api_StatusDirectRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_director_api_StatusDirectRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_director_api_StatusDirectRequest_descriptor,
        new java.lang.String[] { "TransID", "ClientID", "RequestDate", "Sig", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
