// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compiler/ir/serialization.common/src/KotlinIr.proto

package org.jetbrains.kotlin.backend.common.serialization.proto;

public interface IrVarargElementOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.jetbrains.kotlin.backend.common.serialization.proto.IrVarargElement)
    org.jetbrains.kotlin.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression expression = 1;</code>
   */
  boolean hasExpression();
  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression expression = 1;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression getExpression();

  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrSpreadElement spread_element = 2;</code>
   */
  boolean hasSpreadElement();
  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrSpreadElement spread_element = 2;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrSpreadElement getSpreadElement();
}