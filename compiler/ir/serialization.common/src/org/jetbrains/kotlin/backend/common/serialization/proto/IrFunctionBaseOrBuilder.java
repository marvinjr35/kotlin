// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compiler/ir/serialization.common/src/KotlinIr.proto

package org.jetbrains.kotlin.backend.common.serialization.proto;

public interface IrFunctionBaseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.jetbrains.kotlin.backend.common.serialization.proto.IrFunctionBase)
    org.jetbrains.kotlin.protobuf.MessageLiteOrBuilder {

  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase base = 1;</code>
   */
  boolean hasBase();
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase base = 1;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase getBase();

  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.String name = 2;</code>
   */
  boolean hasName();
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.String name = 2;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.String getName();

  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.Visibility visibility = 3;</code>
   */
  boolean hasVisibility();
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.Visibility visibility = 3;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.Visibility getVisibility();

  /**
   * <code>required bool is_inline = 4;</code>
   */
  boolean hasIsInline();
  /**
   * <code>required bool is_inline = 4;</code>
   */
  boolean getIsInline();

  /**
   * <code>required bool is_external = 5;</code>
   */
  boolean hasIsExternal();
  /**
   * <code>required bool is_external = 5;</code>
   */
  boolean getIsExternal();

  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeParameterContainer type_parameters = 6;</code>
   */
  boolean hasTypeParameters();
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeParameterContainer type_parameters = 6;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeParameterContainer getTypeParameters();

  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrValueParameter dispatch_receiver = 7;</code>
   */
  boolean hasDispatchReceiver();
  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrValueParameter dispatch_receiver = 7;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrValueParameter getDispatchReceiver();

  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrValueParameter extension_receiver = 8;</code>
   */
  boolean hasExtensionReceiver();
  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrValueParameter extension_receiver = 8;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrValueParameter getExtensionReceiver();

  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrValueParameter value_parameter = 9;</code>
   */
  java.util.List<org.jetbrains.kotlin.backend.common.serialization.proto.IrValueParameter> 
      getValueParameterList();
  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrValueParameter value_parameter = 9;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrValueParameter getValueParameter(int index);
  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrValueParameter value_parameter = 9;</code>
   */
  int getValueParameterCount();

  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrStatement body = 10;</code>
   */
  boolean hasBody();
  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrStatement body = 10;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrStatement getBody();

  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex return_type = 11;</code>
   */
  boolean hasReturnType();
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex return_type = 11;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex getReturnType();
}