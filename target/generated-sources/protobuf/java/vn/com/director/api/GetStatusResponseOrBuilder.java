// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gateway.proto

package vn.com.director.api;

public interface GetStatusResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.gateway.v1.GetStatusResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 return_code = 1;</code>
   */
  int getReturnCode();

  /**
   * <code>string return_message = 2;</code>
   */
  java.lang.String getReturnMessage();
  /**
   * <code>string return_message = 2;</code>
   */
  com.google.protobuf.ByteString
      getReturnMessageBytes();

  /**
   * <pre>
   * data is JSON string, has field id
   * </pre>
   *
   * <code>string data = 3;</code>
   */
  java.lang.String getData();
  /**
   * <pre>
   * data is JSON string, has field id
   * </pre>
   *
   * <code>string data = 3;</code>
   */
  com.google.protobuf.ByteString
      getDataBytes();
}
