/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/confidentialcomputing/v1/service.proto

package com.google.cloud.confidentialcomputing.v1;

/**
 *
 *
 * <pre>
 * Options to modify claims in the token to generate custom-purpose tokens.
 * </pre>
 *
 * Protobuf type {@code google.cloud.confidentialcomputing.v1.TokenOptions}
 */
public final class TokenOptions extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.confidentialcomputing.v1.TokenOptions)
    TokenOptionsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TokenOptions.newBuilder() to construct.
  private TokenOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TokenOptions() {
    audience_ = "";
    nonce_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TokenOptions();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.confidentialcomputing.v1.ServiceProto
        .internal_static_google_cloud_confidentialcomputing_v1_TokenOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.confidentialcomputing.v1.ServiceProto
        .internal_static_google_cloud_confidentialcomputing_v1_TokenOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.confidentialcomputing.v1.TokenOptions.class,
            com.google.cloud.confidentialcomputing.v1.TokenOptions.Builder.class);
  }

  public static final int AUDIENCE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object audience_ = "";
  /**
   *
   *
   * <pre>
   * Optional. Optional string to issue the token with a custom audience claim.
   * Required if one or more nonces are specified.
   * </pre>
   *
   * <code>string audience = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The audience.
   */
  @java.lang.Override
  public java.lang.String getAudience() {
    java.lang.Object ref = audience_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      audience_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. Optional string to issue the token with a custom audience claim.
   * Required if one or more nonces are specified.
   * </pre>
   *
   * <code>string audience = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for audience.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAudienceBytes() {
    java.lang.Object ref = audience_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      audience_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NONCE_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList nonce_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * Optional. Optional parameter to place one or more nonces in the eat_nonce
   * claim in the output token. The minimum size for JSON-encoded EATs is 10
   * bytes and the maximum size is 74 bytes.
   * </pre>
   *
   * <code>repeated string nonce = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the nonce.
   */
  public com.google.protobuf.ProtocolStringList getNonceList() {
    return nonce_;
  }
  /**
   *
   *
   * <pre>
   * Optional. Optional parameter to place one or more nonces in the eat_nonce
   * claim in the output token. The minimum size for JSON-encoded EATs is 10
   * bytes and the maximum size is 74 bytes.
   * </pre>
   *
   * <code>repeated string nonce = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of nonce.
   */
  public int getNonceCount() {
    return nonce_.size();
  }
  /**
   *
   *
   * <pre>
   * Optional. Optional parameter to place one or more nonces in the eat_nonce
   * claim in the output token. The minimum size for JSON-encoded EATs is 10
   * bytes and the maximum size is 74 bytes.
   * </pre>
   *
   * <code>repeated string nonce = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The nonce at the given index.
   */
  public java.lang.String getNonce(int index) {
    return nonce_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Optional. Optional parameter to place one or more nonces in the eat_nonce
   * claim in the output token. The minimum size for JSON-encoded EATs is 10
   * bytes and the maximum size is 74 bytes.
   * </pre>
   *
   * <code>repeated string nonce = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the nonce at the given index.
   */
  public com.google.protobuf.ByteString getNonceBytes(int index) {
    return nonce_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(audience_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, audience_);
    }
    for (int i = 0; i < nonce_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nonce_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(audience_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, audience_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < nonce_.size(); i++) {
        dataSize += computeStringSizeNoTag(nonce_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getNonceList().size();
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.confidentialcomputing.v1.TokenOptions)) {
      return super.equals(obj);
    }
    com.google.cloud.confidentialcomputing.v1.TokenOptions other =
        (com.google.cloud.confidentialcomputing.v1.TokenOptions) obj;

    if (!getAudience().equals(other.getAudience())) return false;
    if (!getNonceList().equals(other.getNonceList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + AUDIENCE_FIELD_NUMBER;
    hash = (53 * hash) + getAudience().hashCode();
    if (getNonceCount() > 0) {
      hash = (37 * hash) + NONCE_FIELD_NUMBER;
      hash = (53 * hash) + getNonceList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.confidentialcomputing.v1.TokenOptions parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.confidentialcomputing.v1.TokenOptions parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.confidentialcomputing.v1.TokenOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.confidentialcomputing.v1.TokenOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.confidentialcomputing.v1.TokenOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.confidentialcomputing.v1.TokenOptions parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.confidentialcomputing.v1.TokenOptions parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.confidentialcomputing.v1.TokenOptions parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.confidentialcomputing.v1.TokenOptions parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.confidentialcomputing.v1.TokenOptions parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.confidentialcomputing.v1.TokenOptions parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.confidentialcomputing.v1.TokenOptions parseFrom(
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
      com.google.cloud.confidentialcomputing.v1.TokenOptions prototype) {
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
   * Options to modify claims in the token to generate custom-purpose tokens.
   * </pre>
   *
   * Protobuf type {@code google.cloud.confidentialcomputing.v1.TokenOptions}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.confidentialcomputing.v1.TokenOptions)
      com.google.cloud.confidentialcomputing.v1.TokenOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.confidentialcomputing.v1.ServiceProto
          .internal_static_google_cloud_confidentialcomputing_v1_TokenOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.confidentialcomputing.v1.ServiceProto
          .internal_static_google_cloud_confidentialcomputing_v1_TokenOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.confidentialcomputing.v1.TokenOptions.class,
              com.google.cloud.confidentialcomputing.v1.TokenOptions.Builder.class);
    }

    // Construct using com.google.cloud.confidentialcomputing.v1.TokenOptions.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      audience_ = "";
      nonce_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.confidentialcomputing.v1.ServiceProto
          .internal_static_google_cloud_confidentialcomputing_v1_TokenOptions_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.confidentialcomputing.v1.TokenOptions getDefaultInstanceForType() {
      return com.google.cloud.confidentialcomputing.v1.TokenOptions.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.confidentialcomputing.v1.TokenOptions build() {
      com.google.cloud.confidentialcomputing.v1.TokenOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.confidentialcomputing.v1.TokenOptions buildPartial() {
      com.google.cloud.confidentialcomputing.v1.TokenOptions result =
          new com.google.cloud.confidentialcomputing.v1.TokenOptions(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.confidentialcomputing.v1.TokenOptions result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.audience_ = audience_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        nonce_.makeImmutable();
        result.nonce_ = nonce_;
      }
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
      if (other instanceof com.google.cloud.confidentialcomputing.v1.TokenOptions) {
        return mergeFrom((com.google.cloud.confidentialcomputing.v1.TokenOptions) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.confidentialcomputing.v1.TokenOptions other) {
      if (other == com.google.cloud.confidentialcomputing.v1.TokenOptions.getDefaultInstance())
        return this;
      if (!other.getAudience().isEmpty()) {
        audience_ = other.audience_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.nonce_.isEmpty()) {
        if (nonce_.isEmpty()) {
          nonce_ = other.nonce_;
          bitField0_ |= 0x00000002;
        } else {
          ensureNonceIsMutable();
          nonce_.addAll(other.nonce_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
                audience_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureNonceIsMutable();
                nonce_.add(s);
                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.lang.Object audience_ = "";
    /**
     *
     *
     * <pre>
     * Optional. Optional string to issue the token with a custom audience claim.
     * Required if one or more nonces are specified.
     * </pre>
     *
     * <code>string audience = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The audience.
     */
    public java.lang.String getAudience() {
      java.lang.Object ref = audience_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        audience_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Optional string to issue the token with a custom audience claim.
     * Required if one or more nonces are specified.
     * </pre>
     *
     * <code>string audience = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for audience.
     */
    public com.google.protobuf.ByteString getAudienceBytes() {
      java.lang.Object ref = audience_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        audience_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Optional string to issue the token with a custom audience claim.
     * Required if one or more nonces are specified.
     * </pre>
     *
     * <code>string audience = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The audience to set.
     * @return This builder for chaining.
     */
    public Builder setAudience(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      audience_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Optional string to issue the token with a custom audience claim.
     * Required if one or more nonces are specified.
     * </pre>
     *
     * <code>string audience = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAudience() {
      audience_ = getDefaultInstance().getAudience();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Optional string to issue the token with a custom audience claim.
     * Required if one or more nonces are specified.
     * </pre>
     *
     * <code>string audience = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for audience to set.
     * @return This builder for chaining.
     */
    public Builder setAudienceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      audience_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList nonce_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureNonceIsMutable() {
      if (!nonce_.isModifiable()) {
        nonce_ = new com.google.protobuf.LazyStringArrayList(nonce_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     *
     *
     * <pre>
     * Optional. Optional parameter to place one or more nonces in the eat_nonce
     * claim in the output token. The minimum size for JSON-encoded EATs is 10
     * bytes and the maximum size is 74 bytes.
     * </pre>
     *
     * <code>repeated string nonce = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return A list containing the nonce.
     */
    public com.google.protobuf.ProtocolStringList getNonceList() {
      nonce_.makeImmutable();
      return nonce_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Optional parameter to place one or more nonces in the eat_nonce
     * claim in the output token. The minimum size for JSON-encoded EATs is 10
     * bytes and the maximum size is 74 bytes.
     * </pre>
     *
     * <code>repeated string nonce = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The count of nonce.
     */
    public int getNonceCount() {
      return nonce_.size();
    }
    /**
     *
     *
     * <pre>
     * Optional. Optional parameter to place one or more nonces in the eat_nonce
     * claim in the output token. The minimum size for JSON-encoded EATs is 10
     * bytes and the maximum size is 74 bytes.
     * </pre>
     *
     * <code>repeated string nonce = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param index The index of the element to return.
     * @return The nonce at the given index.
     */
    public java.lang.String getNonce(int index) {
      return nonce_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Optional. Optional parameter to place one or more nonces in the eat_nonce
     * claim in the output token. The minimum size for JSON-encoded EATs is 10
     * bytes and the maximum size is 74 bytes.
     * </pre>
     *
     * <code>repeated string nonce = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the nonce at the given index.
     */
    public com.google.protobuf.ByteString getNonceBytes(int index) {
      return nonce_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Optional. Optional parameter to place one or more nonces in the eat_nonce
     * claim in the output token. The minimum size for JSON-encoded EATs is 10
     * bytes and the maximum size is 74 bytes.
     * </pre>
     *
     * <code>repeated string nonce = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param index The index to set the value at.
     * @param value The nonce to set.
     * @return This builder for chaining.
     */
    public Builder setNonce(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureNonceIsMutable();
      nonce_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Optional parameter to place one or more nonces in the eat_nonce
     * claim in the output token. The minimum size for JSON-encoded EATs is 10
     * bytes and the maximum size is 74 bytes.
     * </pre>
     *
     * <code>repeated string nonce = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The nonce to add.
     * @return This builder for chaining.
     */
    public Builder addNonce(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureNonceIsMutable();
      nonce_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Optional parameter to place one or more nonces in the eat_nonce
     * claim in the output token. The minimum size for JSON-encoded EATs is 10
     * bytes and the maximum size is 74 bytes.
     * </pre>
     *
     * <code>repeated string nonce = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param values The nonce to add.
     * @return This builder for chaining.
     */
    public Builder addAllNonce(java.lang.Iterable<java.lang.String> values) {
      ensureNonceIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, nonce_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Optional parameter to place one or more nonces in the eat_nonce
     * claim in the output token. The minimum size for JSON-encoded EATs is 10
     * bytes and the maximum size is 74 bytes.
     * </pre>
     *
     * <code>repeated string nonce = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNonce() {
      nonce_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Optional parameter to place one or more nonces in the eat_nonce
     * claim in the output token. The minimum size for JSON-encoded EATs is 10
     * bytes and the maximum size is 74 bytes.
     * </pre>
     *
     * <code>repeated string nonce = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes of the nonce to add.
     * @return This builder for chaining.
     */
    public Builder addNonceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureNonceIsMutable();
      nonce_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
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

    // @@protoc_insertion_point(builder_scope:google.cloud.confidentialcomputing.v1.TokenOptions)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.confidentialcomputing.v1.TokenOptions)
  private static final com.google.cloud.confidentialcomputing.v1.TokenOptions DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.confidentialcomputing.v1.TokenOptions();
  }

  public static com.google.cloud.confidentialcomputing.v1.TokenOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TokenOptions> PARSER =
      new com.google.protobuf.AbstractParser<TokenOptions>() {
        @java.lang.Override
        public TokenOptions parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<TokenOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TokenOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.confidentialcomputing.v1.TokenOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
