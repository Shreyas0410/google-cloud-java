/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p3beta1/product_search_service.proto

package com.google.cloud.vision.v1p3beta1;

/**
 *
 *
 * <pre>
 * Request message for the `ImportProductSets` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1p3beta1.ImportProductSetsRequest}
 */
public final class ImportProductSetsRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1p3beta1.ImportProductSetsRequest)
    ImportProductSetsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ImportProductSetsRequest.newBuilder() to construct.
  private ImportProductSetsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ImportProductSetsRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ImportProductSetsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ImportProductSetsRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              com.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfig.Builder subBuilder =
                  null;
              if (inputConfig_ != null) {
                subBuilder = inputConfig_.toBuilder();
              }
              inputConfig_ =
                  input.readMessage(
                      com.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfig.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(inputConfig_);
                inputConfig_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.vision.v1p3beta1.ProductSearchServiceProto
        .internal_static_google_cloud_vision_v1p3beta1_ImportProductSetsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1p3beta1.ProductSearchServiceProto
        .internal_static_google_cloud_vision_v1p3beta1_ImportProductSetsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest.class,
            com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * The project in which the ProductSets should be imported.
   * Format is `projects/PROJECT_ID/locations/LOC_ID`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The parent.
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The project in which the ProductSets should be imported.
   * Format is `projects/PROJECT_ID/locations/LOC_ID`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The bytes for parent.
   */
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INPUT_CONFIG_FIELD_NUMBER = 2;
  private com.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfig inputConfig_;
  /**
   *
   *
   * <pre>
   * The input content for the list of requests.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfig input_config = 2;</code>
   *
   * @return Whether the inputConfig field is set.
   */
  public boolean hasInputConfig() {
    return inputConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * The input content for the list of requests.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfig input_config = 2;</code>
   *
   * @return The inputConfig.
   */
  public com.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfig getInputConfig() {
    return inputConfig_ == null
        ? com.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfig.getDefaultInstance()
        : inputConfig_;
  }
  /**
   *
   *
   * <pre>
   * The input content for the list of requests.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfig input_config = 2;</code>
   */
  public com.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfigOrBuilder
      getInputConfigOrBuilder() {
    return getInputConfig();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (inputConfig_ != null) {
      output.writeMessage(2, getInputConfig());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (inputConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getInputConfig());
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
    if (!(obj instanceof com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest other =
        (com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasInputConfig() != other.hasInputConfig()) return false;
    if (hasInputConfig()) {
      if (!getInputConfig().equals(other.getInputConfig())) return false;
    }
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasInputConfig()) {
      hash = (37 * hash) + INPUT_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getInputConfig().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request message for the `ImportProductSets` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1p3beta1.ImportProductSetsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1p3beta1.ImportProductSetsRequest)
      com.google.cloud.vision.v1p3beta1.ImportProductSetsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vision.v1p3beta1.ProductSearchServiceProto
          .internal_static_google_cloud_vision_v1p3beta1_ImportProductSetsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1p3beta1.ProductSearchServiceProto
          .internal_static_google_cloud_vision_v1p3beta1_ImportProductSetsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest.class,
              com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest.Builder.class);
    }

    // Construct using com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (inputConfigBuilder_ == null) {
        inputConfig_ = null;
      } else {
        inputConfig_ = null;
        inputConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vision.v1p3beta1.ProductSearchServiceProto
          .internal_static_google_cloud_vision_v1p3beta1_ImportProductSetsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest getDefaultInstanceForType() {
      return com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest build() {
      com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest buildPartial() {
      com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest result =
          new com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest(this);
      result.parent_ = parent_;
      if (inputConfigBuilder_ == null) {
        result.inputConfig_ = inputConfig_;
      } else {
        result.inputConfig_ = inputConfigBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest) {
        return mergeFrom((com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest other) {
      if (other == com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasInputConfig()) {
        mergeInputConfig(other.getInputConfig());
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
      com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * The project in which the ProductSets should be imported.
     * Format is `projects/PROJECT_ID/locations/LOC_ID`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The project in which the ProductSets should be imported.
     * Format is `projects/PROJECT_ID/locations/LOC_ID`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The project in which the ProductSets should be imported.
     * Format is `projects/PROJECT_ID/locations/LOC_ID`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The project in which the ProductSets should be imported.
     * Format is `projects/PROJECT_ID/locations/LOC_ID`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The project in which the ProductSets should be imported.
     * Format is `projects/PROJECT_ID/locations/LOC_ID`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfig inputConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfig,
            com.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfig.Builder,
            com.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfigOrBuilder>
        inputConfigBuilder_;
    /**
     *
     *
     * <pre>
     * The input content for the list of requests.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfig input_config = 2;</code>
     *
     * @return Whether the inputConfig field is set.
     */
    public boolean hasInputConfig() {
      return inputConfigBuilder_ != null || inputConfig_ != null;
    }
    /**
     *
     *
     * <pre>
     * The input content for the list of requests.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfig input_config = 2;</code>
     *
     * @return The inputConfig.
     */
    public com.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfig getInputConfig() {
      if (inputConfigBuilder_ == null) {
        return inputConfig_ == null
            ? com.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfig.getDefaultInstance()
            : inputConfig_;
      } else {
        return inputConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The input content for the list of requests.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfig input_config = 2;</code>
     */
    public Builder setInputConfig(
        com.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfig value) {
      if (inputConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        inputConfig_ = value;
        onChanged();
      } else {
        inputConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The input content for the list of requests.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfig input_config = 2;</code>
     */
    public Builder setInputConfig(
        com.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfig.Builder builderForValue) {
      if (inputConfigBuilder_ == null) {
        inputConfig_ = builderForValue.build();
        onChanged();
      } else {
        inputConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The input content for the list of requests.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfig input_config = 2;</code>
     */
    public Builder mergeInputConfig(
        com.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfig value) {
      if (inputConfigBuilder_ == null) {
        if (inputConfig_ != null) {
          inputConfig_ =
              com.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfig.newBuilder(
                      inputConfig_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          inputConfig_ = value;
        }
        onChanged();
      } else {
        inputConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The input content for the list of requests.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfig input_config = 2;</code>
     */
    public Builder clearInputConfig() {
      if (inputConfigBuilder_ == null) {
        inputConfig_ = null;
        onChanged();
      } else {
        inputConfig_ = null;
        inputConfigBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The input content for the list of requests.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfig input_config = 2;</code>
     */
    public com.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfig.Builder
        getInputConfigBuilder() {

      onChanged();
      return getInputConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The input content for the list of requests.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfig input_config = 2;</code>
     */
    public com.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfigOrBuilder
        getInputConfigOrBuilder() {
      if (inputConfigBuilder_ != null) {
        return inputConfigBuilder_.getMessageOrBuilder();
      } else {
        return inputConfig_ == null
            ? com.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfig.getDefaultInstance()
            : inputConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * The input content for the list of requests.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfig input_config = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfig,
            com.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfig.Builder,
            com.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfigOrBuilder>
        getInputConfigFieldBuilder() {
      if (inputConfigBuilder_ == null) {
        inputConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfig,
                com.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfig.Builder,
                com.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfigOrBuilder>(
                getInputConfig(), getParentForChildren(), isClean());
        inputConfig_ = null;
      }
      return inputConfigBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1p3beta1.ImportProductSetsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1p3beta1.ImportProductSetsRequest)
  private static final com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest();
  }

  public static com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImportProductSetsRequest> PARSER =
      new com.google.protobuf.AbstractParser<ImportProductSetsRequest>() {
        @java.lang.Override
        public ImportProductSetsRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ImportProductSetsRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ImportProductSetsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImportProductSetsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
