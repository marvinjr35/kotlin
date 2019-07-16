// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compiler/ir/serialization.common/src/KotlinIr.proto

package org.jetbrains.kotlin.backend.common.serialization.proto;

/**
 * Protobuf type {@code org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression}
 */
public final class IrExpression extends
    org.jetbrains.kotlin.protobuf.GeneratedMessageLite implements
    // @@protoc_insertion_point(message_implements:org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression)
    IrExpressionOrBuilder {
  // Use IrExpression.newBuilder() to construct.
  private IrExpression(org.jetbrains.kotlin.protobuf.GeneratedMessageLite.Builder builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private IrExpression(boolean noInit) { this.unknownFields = org.jetbrains.kotlin.protobuf.ByteString.EMPTY;}

  private static final IrExpression defaultInstance;
  public static IrExpression getDefaultInstance() {
    return defaultInstance;
  }

  public IrExpression getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final org.jetbrains.kotlin.protobuf.ByteString unknownFields;
  private IrExpression(
      org.jetbrains.kotlin.protobuf.CodedInputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    initFields();
    int mutable_bitField0_ = 0;
    org.jetbrains.kotlin.protobuf.ByteString.Output unknownFieldsOutput =
        org.jetbrains.kotlin.protobuf.ByteString.newOutput();
    org.jetbrains.kotlin.protobuf.CodedOutputStream unknownFieldsCodedOutput =
        org.jetbrains.kotlin.protobuf.CodedOutputStream.newInstance(
            unknownFieldsOutput);
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(input, unknownFieldsCodedOutput,
                                   extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            org.jetbrains.kotlin.backend.common.serialization.proto.IrOperation.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
              subBuilder = operation_.toBuilder();
            }
            operation_ = input.readMessage(org.jetbrains.kotlin.backend.common.serialization.proto.IrOperation.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(operation_);
              operation_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
          case 18: {
            org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex.Builder subBuilder = null;
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
              subBuilder = type_.toBuilder();
            }
            type_ = input.readMessage(org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(type_);
              type_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000002;
            break;
          }
          case 26: {
            org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates.Builder subBuilder = null;
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
              subBuilder = coordinates_.toBuilder();
            }
            coordinates_ = input.readMessage(org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(coordinates_);
              coordinates_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000004;
            break;
          }
        }
      }
    } catch (org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
    } finally {
      try {
        unknownFieldsCodedOutput.flush();
      } catch (java.io.IOException e) {
      // Should not happen
      } finally {
        unknownFields = unknownFieldsOutput.toByteString();
      }
      makeExtensionsImmutable();
    }
  }
  public static org.jetbrains.kotlin.protobuf.Parser<IrExpression> PARSER =
      new org.jetbrains.kotlin.protobuf.AbstractParser<IrExpression>() {
    public IrExpression parsePartialFrom(
        org.jetbrains.kotlin.protobuf.CodedInputStream input,
        org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
      return new IrExpression(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public org.jetbrains.kotlin.protobuf.Parser<IrExpression> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int OPERATION_FIELD_NUMBER = 1;
  private org.jetbrains.kotlin.backend.common.serialization.proto.IrOperation operation_;
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrOperation operation = 1;</code>
   */
  public boolean hasOperation() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrOperation operation = 1;</code>
   */
  public org.jetbrains.kotlin.backend.common.serialization.proto.IrOperation getOperation() {
    return operation_;
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex type_;
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex type = 2;</code>
   */
  public boolean hasType() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex type = 2;</code>
   */
  public org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex getType() {
    return type_;
  }

  public static final int COORDINATES_FIELD_NUMBER = 3;
  private org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates coordinates_;
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates coordinates = 3;</code>
   */
  public boolean hasCoordinates() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates coordinates = 3;</code>
   */
  public org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates getCoordinates() {
    return coordinates_;
  }

  private void initFields() {
    operation_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrOperation.getDefaultInstance();
    type_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex.getDefaultInstance();
    coordinates_ = org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates.getDefaultInstance();
  }
  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasOperation()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasType()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasCoordinates()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!getOperation().isInitialized()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!getType().isInitialized()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!getCoordinates().isInitialized()) {
      memoizedIsInitialized = 0;
      return false;
    }
    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(org.jetbrains.kotlin.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeMessage(1, operation_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeMessage(2, type_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeMessage(3, coordinates_);
    }
    output.writeRawBytes(unknownFields);
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeMessageSize(1, operation_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeMessageSize(2, type_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeMessageSize(3, coordinates_);
    }
    size += unknownFields.size();
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  protected java.lang.Object writeReplace()
      throws java.io.ObjectStreamException {
    return super.writeReplace();
  }

  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression parseFrom(
      org.jetbrains.kotlin.protobuf.ByteString data)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression parseFrom(
      org.jetbrains.kotlin.protobuf.ByteString data,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression parseFrom(byte[] data)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression parseFrom(
      byte[] data,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression parseFrom(
      java.io.InputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression parseDelimitedFrom(
      java.io.InputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression parseFrom(
      org.jetbrains.kotlin.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression parseFrom(
      org.jetbrains.kotlin.protobuf.CodedInputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  /**
   * Protobuf type {@code org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression}
   */
  public static final class Builder extends
      org.jetbrains.kotlin.protobuf.GeneratedMessageLite.Builder<
        org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression, Builder>
      implements
      // @@protoc_insertion_point(builder_implements:org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression)
      org.jetbrains.kotlin.backend.common.serialization.proto.IrExpressionOrBuilder {
    // Construct using org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      operation_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrOperation.getDefaultInstance();
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex.getDefaultInstance();
      bitField0_ = (bitField0_ & ~0x00000002);
      coordinates_ = org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates.getDefaultInstance();
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression getDefaultInstanceForType() {
      return org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.getDefaultInstance();
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression build() {
      org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression buildPartial() {
      org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression result = new org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.operation_ = operation_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.type_ = type_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.coordinates_ = coordinates_;
      result.bitField0_ = to_bitField0_;
      return result;
    }

    public Builder mergeFrom(org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression other) {
      if (other == org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.getDefaultInstance()) return this;
      if (other.hasOperation()) {
        mergeOperation(other.getOperation());
      }
      if (other.hasType()) {
        mergeType(other.getType());
      }
      if (other.hasCoordinates()) {
        mergeCoordinates(other.getCoordinates());
      }
      setUnknownFields(
          getUnknownFields().concat(other.unknownFields));
      return this;
    }

    public final boolean isInitialized() {
      if (!hasOperation()) {
        
        return false;
      }
      if (!hasType()) {
        
        return false;
      }
      if (!hasCoordinates()) {
        
        return false;
      }
      if (!getOperation().isInitialized()) {
        
        return false;
      }
      if (!getType().isInitialized()) {
        
        return false;
      }
      if (!getCoordinates().isInitialized()) {
        
        return false;
      }
      return true;
    }

    public Builder mergeFrom(
        org.jetbrains.kotlin.protobuf.CodedInputStream input,
        org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private org.jetbrains.kotlin.backend.common.serialization.proto.IrOperation operation_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrOperation.getDefaultInstance();
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrOperation operation = 1;</code>
     */
    public boolean hasOperation() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrOperation operation = 1;</code>
     */
    public org.jetbrains.kotlin.backend.common.serialization.proto.IrOperation getOperation() {
      return operation_;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrOperation operation = 1;</code>
     */
    public Builder setOperation(org.jetbrains.kotlin.backend.common.serialization.proto.IrOperation value) {
      if (value == null) {
        throw new NullPointerException();
      }
      operation_ = value;

      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrOperation operation = 1;</code>
     */
    public Builder setOperation(
        org.jetbrains.kotlin.backend.common.serialization.proto.IrOperation.Builder builderForValue) {
      operation_ = builderForValue.build();

      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrOperation operation = 1;</code>
     */
    public Builder mergeOperation(org.jetbrains.kotlin.backend.common.serialization.proto.IrOperation value) {
      if (((bitField0_ & 0x00000001) == 0x00000001) &&
          operation_ != org.jetbrains.kotlin.backend.common.serialization.proto.IrOperation.getDefaultInstance()) {
        operation_ =
          org.jetbrains.kotlin.backend.common.serialization.proto.IrOperation.newBuilder(operation_).mergeFrom(value).buildPartial();
      } else {
        operation_ = value;
      }

      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrOperation operation = 1;</code>
     */
    public Builder clearOperation() {
      operation_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrOperation.getDefaultInstance();

      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    private org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex type_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex.getDefaultInstance();
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex type = 2;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex type = 2;</code>
     */
    public org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex getType() {
      return type_;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex type = 2;</code>
     */
    public Builder setType(org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex value) {
      if (value == null) {
        throw new NullPointerException();
      }
      type_ = value;

      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex type = 2;</code>
     */
    public Builder setType(
        org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex.Builder builderForValue) {
      type_ = builderForValue.build();

      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex type = 2;</code>
     */
    public Builder mergeType(org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex value) {
      if (((bitField0_ & 0x00000002) == 0x00000002) &&
          type_ != org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex.getDefaultInstance()) {
        type_ =
          org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex.newBuilder(type_).mergeFrom(value).buildPartial();
      } else {
        type_ = value;
      }

      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex type = 2;</code>
     */
    public Builder clearType() {
      type_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex.getDefaultInstance();

      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    private org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates coordinates_ = org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates.getDefaultInstance();
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates coordinates = 3;</code>
     */
    public boolean hasCoordinates() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates coordinates = 3;</code>
     */
    public org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates getCoordinates() {
      return coordinates_;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates coordinates = 3;</code>
     */
    public Builder setCoordinates(org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates value) {
      if (value == null) {
        throw new NullPointerException();
      }
      coordinates_ = value;

      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates coordinates = 3;</code>
     */
    public Builder setCoordinates(
        org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates.Builder builderForValue) {
      coordinates_ = builderForValue.build();

      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates coordinates = 3;</code>
     */
    public Builder mergeCoordinates(org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates value) {
      if (((bitField0_ & 0x00000004) == 0x00000004) &&
          coordinates_ != org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates.getDefaultInstance()) {
        coordinates_ =
          org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates.newBuilder(coordinates_).mergeFrom(value).buildPartial();
      } else {
        coordinates_ = value;
      }

      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates coordinates = 3;</code>
     */
    public Builder clearCoordinates() {
      coordinates_ = org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates.getDefaultInstance();

      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression)
  }

  static {
    defaultInstance = new IrExpression(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression)
}
