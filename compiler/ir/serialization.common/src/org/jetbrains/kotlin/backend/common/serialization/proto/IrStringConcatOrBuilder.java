// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compiler/ir/serialization.common/src/KotlinIr.proto

package org.jetbrains.kotlin.backend.common.serialization.proto;

public interface IrStringConcatOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.jetbrains.kotlin.backend.common.serialization.proto.IrStringConcat)
    org.jetbrains.kotlin.protobuf.MessageLiteOrBuilder {

  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression argument = 1;</code>
   */
  java.util.List<org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression> 
      getArgumentList();
  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression argument = 1;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression getArgument(int index);
  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression argument = 1;</code>
   */
  int getArgumentCount();
}