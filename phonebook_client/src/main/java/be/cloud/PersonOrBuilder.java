// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PhoneBook.proto

package be.cloud;

public interface PersonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:be.cloud.Person)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>int32 id = 2;</code>
   */
  int getId();

  /**
   * <code>string email = 3;</code>
   */
  java.lang.String getEmail();
  /**
   * <code>string email = 3;</code>
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>.be.cloud.PhoneNumber number = 4;</code>
   */
  boolean hasNumber();
  /**
   * <code>.be.cloud.PhoneNumber number = 4;</code>
   */
  be.cloud.PhoneNumber getNumber();
  /**
   * <code>.be.cloud.PhoneNumber number = 4;</code>
   */
  be.cloud.PhoneNumberOrBuilder getNumberOrBuilder();
}