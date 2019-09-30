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
// source: google/cloud/automl/v1/prediction_service.proto

package com.google.cloud.automl.v1;

/**
 *
 *
 * <pre>
 * Request message for [PredictionService.Predict][google.cloud.automl.v1.PredictionService.Predict].
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1.PredictRequest}
 */
public final class PredictRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1.PredictRequest)
    PredictRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PredictRequest.newBuilder() to construct.
  private PredictRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PredictRequest() {
    name_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private PredictRequest(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
          case 18:
            {
              com.google.cloud.automl.v1.ExamplePayload.Builder subBuilder = null;
              if (payload_ != null) {
                subBuilder = payload_.toBuilder();
              }
              payload_ =
                  input.readMessage(
                      com.google.cloud.automl.v1.ExamplePayload.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(payload_);
                payload_ = subBuilder.buildPartial();
              }

              break;
            }
          case 26:
            {
              if (!((mutable_bitField0_ & 0x00000004) != 0)) {
                params_ =
                    com.google.protobuf.MapField.newMapField(ParamsDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000004;
              }
              com.google.protobuf.MapEntry<java.lang.String, java.lang.String> params__ =
                  input.readMessage(
                      ParamsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              params_.getMutableMap().put(params__.getKey(), params__.getValue());
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
    return com.google.cloud.automl.v1.PredictionServiceProto
        .internal_static_google_cloud_automl_v1_PredictRequest_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(int number) {
    switch (number) {
      case 3:
        return internalGetParams();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1.PredictionServiceProto
        .internal_static_google_cloud_automl_v1_PredictRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1.PredictRequest.class,
            com.google.cloud.automl.v1.PredictRequest.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Name of the model requested to serve the prediction.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Name of the model requested to serve the prediction.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAYLOAD_FIELD_NUMBER = 2;
  private com.google.cloud.automl.v1.ExamplePayload payload_;
  /**
   *
   *
   * <pre>
   * Required. Payload to perform a prediction on. The payload must match the
   * problem type that the model was trained to solve.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.ExamplePayload payload = 2;</code>
   */
  public boolean hasPayload() {
    return payload_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Payload to perform a prediction on. The payload must match the
   * problem type that the model was trained to solve.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.ExamplePayload payload = 2;</code>
   */
  public com.google.cloud.automl.v1.ExamplePayload getPayload() {
    return payload_ == null
        ? com.google.cloud.automl.v1.ExamplePayload.getDefaultInstance()
        : payload_;
  }
  /**
   *
   *
   * <pre>
   * Required. Payload to perform a prediction on. The payload must match the
   * problem type that the model was trained to solve.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.ExamplePayload payload = 2;</code>
   */
  public com.google.cloud.automl.v1.ExamplePayloadOrBuilder getPayloadOrBuilder() {
    return getPayload();
  }

  public static final int PARAMS_FIELD_NUMBER = 3;

  private static final class ParamsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
            com.google.cloud.automl.v1.PredictionServiceProto
                .internal_static_google_cloud_automl_v1_PredictRequest_ParamsEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING,
            "",
            com.google.protobuf.WireFormat.FieldType.STRING,
            "");
  }

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> params_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetParams() {
    if (params_ == null) {
      return com.google.protobuf.MapField.emptyMapField(ParamsDefaultEntryHolder.defaultEntry);
    }
    return params_;
  }

  public int getParamsCount() {
    return internalGetParams().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * Additional domain-specific parameters, any string must be up to 25000
   * characters long.
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 3;</code>
   */
  public boolean containsParams(java.lang.String key) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    return internalGetParams().getMap().containsKey(key);
  }
  /** Use {@link #getParamsMap()} instead. */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getParams() {
    return getParamsMap();
  }
  /**
   *
   *
   * <pre>
   * Additional domain-specific parameters, any string must be up to 25000
   * characters long.
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 3;</code>
   */
  public java.util.Map<java.lang.String, java.lang.String> getParamsMap() {
    return internalGetParams().getMap();
  }
  /**
   *
   *
   * <pre>
   * Additional domain-specific parameters, any string must be up to 25000
   * characters long.
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 3;</code>
   */
  public java.lang.String getParamsOrDefault(java.lang.String key, java.lang.String defaultValue) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetParams().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * Additional domain-specific parameters, any string must be up to 25000
   * characters long.
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 3;</code>
   */
  public java.lang.String getParamsOrThrow(java.lang.String key) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetParams().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (payload_ != null) {
      output.writeMessage(2, getPayload());
    }
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetParams(), ParamsDefaultEntryHolder.defaultEntry, 3);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (payload_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getPayload());
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
        internalGetParams().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String> params__ =
          ParamsDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, params__);
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
    if (!(obj instanceof com.google.cloud.automl.v1.PredictRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1.PredictRequest other =
        (com.google.cloud.automl.v1.PredictRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasPayload() != other.hasPayload()) return false;
    if (hasPayload()) {
      if (!getPayload().equals(other.getPayload())) return false;
    }
    if (!internalGetParams().equals(other.internalGetParams())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasPayload()) {
      hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
      hash = (53 * hash) + getPayload().hashCode();
    }
    if (!internalGetParams().getMap().isEmpty()) {
      hash = (37 * hash) + PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetParams().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1.PredictRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.PredictRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.PredictRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.PredictRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.PredictRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.PredictRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.PredictRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.PredictRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.PredictRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.PredictRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.PredictRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.PredictRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.automl.v1.PredictRequest prototype) {
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
   * Request message for [PredictionService.Predict][google.cloud.automl.v1.PredictionService.Predict].
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1.PredictRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1.PredictRequest)
      com.google.cloud.automl.v1.PredictRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.automl.v1.PredictionServiceProto
          .internal_static_google_cloud_automl_v1_PredictRequest_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 3:
          return internalGetParams();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
      switch (number) {
        case 3:
          return internalGetMutableParams();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1.PredictionServiceProto
          .internal_static_google_cloud_automl_v1_PredictRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1.PredictRequest.class,
              com.google.cloud.automl.v1.PredictRequest.Builder.class);
    }

    // Construct using com.google.cloud.automl.v1.PredictRequest.newBuilder()
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
      name_ = "";

      if (payloadBuilder_ == null) {
        payload_ = null;
      } else {
        payload_ = null;
        payloadBuilder_ = null;
      }
      internalGetMutableParams().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.automl.v1.PredictionServiceProto
          .internal_static_google_cloud_automl_v1_PredictRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.PredictRequest getDefaultInstanceForType() {
      return com.google.cloud.automl.v1.PredictRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.PredictRequest build() {
      com.google.cloud.automl.v1.PredictRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.PredictRequest buildPartial() {
      com.google.cloud.automl.v1.PredictRequest result =
          new com.google.cloud.automl.v1.PredictRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.name_ = name_;
      if (payloadBuilder_ == null) {
        result.payload_ = payload_;
      } else {
        result.payload_ = payloadBuilder_.build();
      }
      result.params_ = internalGetParams();
      result.params_.makeImmutable();
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.cloud.automl.v1.PredictRequest) {
        return mergeFrom((com.google.cloud.automl.v1.PredictRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.automl.v1.PredictRequest other) {
      if (other == com.google.cloud.automl.v1.PredictRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasPayload()) {
        mergePayload(other.getPayload());
      }
      internalGetMutableParams().mergeFrom(other.internalGetParams());
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
      com.google.cloud.automl.v1.PredictRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.automl.v1.PredictRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Name of the model requested to serve the prediction.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the model requested to serve the prediction.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the model requested to serve the prediction.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the model requested to serve the prediction.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the model requested to serve the prediction.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.automl.v1.ExamplePayload payload_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.automl.v1.ExamplePayload,
            com.google.cloud.automl.v1.ExamplePayload.Builder,
            com.google.cloud.automl.v1.ExamplePayloadOrBuilder>
        payloadBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Payload to perform a prediction on. The payload must match the
     * problem type that the model was trained to solve.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.ExamplePayload payload = 2;</code>
     */
    public boolean hasPayload() {
      return payloadBuilder_ != null || payload_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. Payload to perform a prediction on. The payload must match the
     * problem type that the model was trained to solve.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.ExamplePayload payload = 2;</code>
     */
    public com.google.cloud.automl.v1.ExamplePayload getPayload() {
      if (payloadBuilder_ == null) {
        return payload_ == null
            ? com.google.cloud.automl.v1.ExamplePayload.getDefaultInstance()
            : payload_;
      } else {
        return payloadBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Payload to perform a prediction on. The payload must match the
     * problem type that the model was trained to solve.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.ExamplePayload payload = 2;</code>
     */
    public Builder setPayload(com.google.cloud.automl.v1.ExamplePayload value) {
      if (payloadBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        payload_ = value;
        onChanged();
      } else {
        payloadBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Payload to perform a prediction on. The payload must match the
     * problem type that the model was trained to solve.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.ExamplePayload payload = 2;</code>
     */
    public Builder setPayload(com.google.cloud.automl.v1.ExamplePayload.Builder builderForValue) {
      if (payloadBuilder_ == null) {
        payload_ = builderForValue.build();
        onChanged();
      } else {
        payloadBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Payload to perform a prediction on. The payload must match the
     * problem type that the model was trained to solve.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.ExamplePayload payload = 2;</code>
     */
    public Builder mergePayload(com.google.cloud.automl.v1.ExamplePayload value) {
      if (payloadBuilder_ == null) {
        if (payload_ != null) {
          payload_ =
              com.google.cloud.automl.v1.ExamplePayload.newBuilder(payload_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          payload_ = value;
        }
        onChanged();
      } else {
        payloadBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Payload to perform a prediction on. The payload must match the
     * problem type that the model was trained to solve.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.ExamplePayload payload = 2;</code>
     */
    public Builder clearPayload() {
      if (payloadBuilder_ == null) {
        payload_ = null;
        onChanged();
      } else {
        payload_ = null;
        payloadBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Payload to perform a prediction on. The payload must match the
     * problem type that the model was trained to solve.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.ExamplePayload payload = 2;</code>
     */
    public com.google.cloud.automl.v1.ExamplePayload.Builder getPayloadBuilder() {

      onChanged();
      return getPayloadFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Payload to perform a prediction on. The payload must match the
     * problem type that the model was trained to solve.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.ExamplePayload payload = 2;</code>
     */
    public com.google.cloud.automl.v1.ExamplePayloadOrBuilder getPayloadOrBuilder() {
      if (payloadBuilder_ != null) {
        return payloadBuilder_.getMessageOrBuilder();
      } else {
        return payload_ == null
            ? com.google.cloud.automl.v1.ExamplePayload.getDefaultInstance()
            : payload_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Payload to perform a prediction on. The payload must match the
     * problem type that the model was trained to solve.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.ExamplePayload payload = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.automl.v1.ExamplePayload,
            com.google.cloud.automl.v1.ExamplePayload.Builder,
            com.google.cloud.automl.v1.ExamplePayloadOrBuilder>
        getPayloadFieldBuilder() {
      if (payloadBuilder_ == null) {
        payloadBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.automl.v1.ExamplePayload,
                com.google.cloud.automl.v1.ExamplePayload.Builder,
                com.google.cloud.automl.v1.ExamplePayloadOrBuilder>(
                getPayload(), getParentForChildren(), isClean());
        payload_ = null;
      }
      return payloadBuilder_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> params_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetParams() {
      if (params_ == null) {
        return com.google.protobuf.MapField.emptyMapField(ParamsDefaultEntryHolder.defaultEntry);
      }
      return params_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableParams() {
      onChanged();
      ;
      if (params_ == null) {
        params_ = com.google.protobuf.MapField.newMapField(ParamsDefaultEntryHolder.defaultEntry);
      }
      if (!params_.isMutable()) {
        params_ = params_.copy();
      }
      return params_;
    }

    public int getParamsCount() {
      return internalGetParams().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * Additional domain-specific parameters, any string must be up to 25000
     * characters long.
     * </pre>
     *
     * <code>map&lt;string, string&gt; params = 3;</code>
     */
    public boolean containsParams(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      return internalGetParams().getMap().containsKey(key);
    }
    /** Use {@link #getParamsMap()} instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getParams() {
      return getParamsMap();
    }
    /**
     *
     *
     * <pre>
     * Additional domain-specific parameters, any string must be up to 25000
     * characters long.
     * </pre>
     *
     * <code>map&lt;string, string&gt; params = 3;</code>
     */
    public java.util.Map<java.lang.String, java.lang.String> getParamsMap() {
      return internalGetParams().getMap();
    }
    /**
     *
     *
     * <pre>
     * Additional domain-specific parameters, any string must be up to 25000
     * characters long.
     * </pre>
     *
     * <code>map&lt;string, string&gt; params = 3;</code>
     */
    public java.lang.String getParamsOrDefault(
        java.lang.String key, java.lang.String defaultValue) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetParams().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Additional domain-specific parameters, any string must be up to 25000
     * characters long.
     * </pre>
     *
     * <code>map&lt;string, string&gt; params = 3;</code>
     */
    public java.lang.String getParamsOrThrow(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetParams().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearParams() {
      internalGetMutableParams().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Additional domain-specific parameters, any string must be up to 25000
     * characters long.
     * </pre>
     *
     * <code>map&lt;string, string&gt; params = 3;</code>
     */
    public Builder removeParams(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      internalGetMutableParams().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMutableParams() {
      return internalGetMutableParams().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * Additional domain-specific parameters, any string must be up to 25000
     * characters long.
     * </pre>
     *
     * <code>map&lt;string, string&gt; params = 3;</code>
     */
    public Builder putParams(java.lang.String key, java.lang.String value) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      if (value == null) {
        throw new java.lang.NullPointerException();
      }
      internalGetMutableParams().getMutableMap().put(key, value);
      return this;
    }
    /**
     *
     *
     * <pre>
     * Additional domain-specific parameters, any string must be up to 25000
     * characters long.
     * </pre>
     *
     * <code>map&lt;string, string&gt; params = 3;</code>
     */
    public Builder putAllParams(java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableParams().getMutableMap().putAll(values);
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1.PredictRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1.PredictRequest)
  private static final com.google.cloud.automl.v1.PredictRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1.PredictRequest();
  }

  public static com.google.cloud.automl.v1.PredictRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PredictRequest> PARSER =
      new com.google.protobuf.AbstractParser<PredictRequest>() {
        @java.lang.Override
        public PredictRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new PredictRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<PredictRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PredictRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.automl.v1.PredictRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
