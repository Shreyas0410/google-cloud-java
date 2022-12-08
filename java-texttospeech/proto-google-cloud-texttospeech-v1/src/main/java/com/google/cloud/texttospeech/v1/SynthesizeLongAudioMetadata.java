/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/texttospeech/v1/cloud_tts_lrs.proto

package com.google.cloud.texttospeech.v1;

/**
 *
 *
 * <pre>
 * Metadata for response returned by the `SynthesizeLongAudio` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata}
 */
public final class SynthesizeLongAudioMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata)
    SynthesizeLongAudioMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SynthesizeLongAudioMetadata.newBuilder() to construct.
  private SynthesizeLongAudioMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SynthesizeLongAudioMetadata() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SynthesizeLongAudioMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.texttospeech.v1.TextToSpeechLongAudioSynthesisProto
        .internal_static_google_cloud_texttospeech_v1_SynthesizeLongAudioMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.texttospeech.v1.TextToSpeechLongAudioSynthesisProto
        .internal_static_google_cloud_texttospeech_v1_SynthesizeLongAudioMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata.class,
            com.google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata.Builder.class);
  }

  public static final int START_TIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp startTime_;
  /**
   *
   *
   * <pre>
   * Time when the request was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   *
   * @return Whether the startTime field is set.
   */
  @java.lang.Override
  public boolean hasStartTime() {
    return startTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * Time when the request was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   *
   * @return The startTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getStartTime() {
    return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
  }
  /**
   *
   *
   * <pre>
   * Time when the request was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder() {
    return getStartTime();
  }

  public static final int LAST_UPDATE_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp lastUpdateTime_;
  /**
   *
   *
   * <pre>
   * Time of the most recent processing update.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_update_time = 2;</code>
   *
   * @return Whether the lastUpdateTime field is set.
   */
  @java.lang.Override
  public boolean hasLastUpdateTime() {
    return lastUpdateTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * Time of the most recent processing update.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_update_time = 2;</code>
   *
   * @return The lastUpdateTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getLastUpdateTime() {
    return lastUpdateTime_ == null
        ? com.google.protobuf.Timestamp.getDefaultInstance()
        : lastUpdateTime_;
  }
  /**
   *
   *
   * <pre>
   * Time of the most recent processing update.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_update_time = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getLastUpdateTimeOrBuilder() {
    return getLastUpdateTime();
  }

  public static final int PROGRESS_PERCENTAGE_FIELD_NUMBER = 3;
  private double progressPercentage_;
  /**
   *
   *
   * <pre>
   * The progress of the most recent processing update in percentage, ie. 70.0%.
   * </pre>
   *
   * <code>double progress_percentage = 3;</code>
   *
   * @return The progressPercentage.
   */
  @java.lang.Override
  public double getProgressPercentage() {
    return progressPercentage_;
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
    if (startTime_ != null) {
      output.writeMessage(1, getStartTime());
    }
    if (lastUpdateTime_ != null) {
      output.writeMessage(2, getLastUpdateTime());
    }
    if (java.lang.Double.doubleToRawLongBits(progressPercentage_) != 0) {
      output.writeDouble(3, progressPercentage_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (startTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getStartTime());
    }
    if (lastUpdateTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getLastUpdateTime());
    }
    if (java.lang.Double.doubleToRawLongBits(progressPercentage_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(3, progressPercentage_);
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
    if (!(obj instanceof com.google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata other =
        (com.google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata) obj;

    if (hasStartTime() != other.hasStartTime()) return false;
    if (hasStartTime()) {
      if (!getStartTime().equals(other.getStartTime())) return false;
    }
    if (hasLastUpdateTime() != other.hasLastUpdateTime()) return false;
    if (hasLastUpdateTime()) {
      if (!getLastUpdateTime().equals(other.getLastUpdateTime())) return false;
    }
    if (java.lang.Double.doubleToLongBits(getProgressPercentage())
        != java.lang.Double.doubleToLongBits(other.getProgressPercentage())) return false;
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
    if (hasStartTime()) {
      hash = (37 * hash) + START_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getStartTime().hashCode();
    }
    if (hasLastUpdateTime()) {
      hash = (37 * hash) + LAST_UPDATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getLastUpdateTime().hashCode();
    }
    hash = (37 * hash) + PROGRESS_PERCENTAGE_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashLong(
                java.lang.Double.doubleToLongBits(getProgressPercentage()));
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata parseFrom(
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
      com.google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata prototype) {
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
   * Metadata for response returned by the `SynthesizeLongAudio` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata)
      com.google.cloud.texttospeech.v1.SynthesizeLongAudioMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.texttospeech.v1.TextToSpeechLongAudioSynthesisProto
          .internal_static_google_cloud_texttospeech_v1_SynthesizeLongAudioMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.texttospeech.v1.TextToSpeechLongAudioSynthesisProto
          .internal_static_google_cloud_texttospeech_v1_SynthesizeLongAudioMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata.class,
              com.google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata.Builder.class);
    }

    // Construct using com.google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (startTimeBuilder_ == null) {
        startTime_ = null;
      } else {
        startTime_ = null;
        startTimeBuilder_ = null;
      }
      if (lastUpdateTimeBuilder_ == null) {
        lastUpdateTime_ = null;
      } else {
        lastUpdateTime_ = null;
        lastUpdateTimeBuilder_ = null;
      }
      progressPercentage_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.texttospeech.v1.TextToSpeechLongAudioSynthesisProto
          .internal_static_google_cloud_texttospeech_v1_SynthesizeLongAudioMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata
        getDefaultInstanceForType() {
      return com.google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata build() {
      com.google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata buildPartial() {
      com.google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata result =
          new com.google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata(this);
      if (startTimeBuilder_ == null) {
        result.startTime_ = startTime_;
      } else {
        result.startTime_ = startTimeBuilder_.build();
      }
      if (lastUpdateTimeBuilder_ == null) {
        result.lastUpdateTime_ = lastUpdateTime_;
      } else {
        result.lastUpdateTime_ = lastUpdateTimeBuilder_.build();
      }
      result.progressPercentage_ = progressPercentage_;
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
      if (other instanceof com.google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata) {
        return mergeFrom((com.google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata other) {
      if (other
          == com.google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata.getDefaultInstance())
        return this;
      if (other.hasStartTime()) {
        mergeStartTime(other.getStartTime());
      }
      if (other.hasLastUpdateTime()) {
        mergeLastUpdateTime(other.getLastUpdateTime());
      }
      if (other.getProgressPercentage() != 0D) {
        setProgressPercentage(other.getProgressPercentage());
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
                input.readMessage(getStartTimeFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
            case 18:
              {
                input.readMessage(getLastUpdateTimeFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 18
            case 25:
              {
                progressPercentage_ = input.readDouble();

                break;
              } // case 25
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

    private com.google.protobuf.Timestamp startTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        startTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 1;</code>
     *
     * @return Whether the startTime field is set.
     */
    public boolean hasStartTime() {
      return startTimeBuilder_ != null || startTime_ != null;
    }
    /**
     *
     *
     * <pre>
     * Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 1;</code>
     *
     * @return The startTime.
     */
    public com.google.protobuf.Timestamp getStartTime() {
      if (startTimeBuilder_ == null) {
        return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
      } else {
        return startTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 1;</code>
     */
    public Builder setStartTime(com.google.protobuf.Timestamp value) {
      if (startTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        startTime_ = value;
        onChanged();
      } else {
        startTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 1;</code>
     */
    public Builder setStartTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (startTimeBuilder_ == null) {
        startTime_ = builderForValue.build();
        onChanged();
      } else {
        startTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 1;</code>
     */
    public Builder mergeStartTime(com.google.protobuf.Timestamp value) {
      if (startTimeBuilder_ == null) {
        if (startTime_ != null) {
          startTime_ =
              com.google.protobuf.Timestamp.newBuilder(startTime_).mergeFrom(value).buildPartial();
        } else {
          startTime_ = value;
        }
        onChanged();
      } else {
        startTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 1;</code>
     */
    public Builder clearStartTime() {
      if (startTimeBuilder_ == null) {
        startTime_ = null;
        onChanged();
      } else {
        startTime_ = null;
        startTimeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 1;</code>
     */
    public com.google.protobuf.Timestamp.Builder getStartTimeBuilder() {

      onChanged();
      return getStartTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 1;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder() {
      if (startTimeBuilder_ != null) {
        return startTimeBuilder_.getMessageOrBuilder();
      } else {
        return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getStartTimeFieldBuilder() {
      if (startTimeBuilder_ == null) {
        startTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getStartTime(), getParentForChildren(), isClean());
        startTime_ = null;
      }
      return startTimeBuilder_;
    }

    private com.google.protobuf.Timestamp lastUpdateTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        lastUpdateTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Time of the most recent processing update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_update_time = 2;</code>
     *
     * @return Whether the lastUpdateTime field is set.
     */
    public boolean hasLastUpdateTime() {
      return lastUpdateTimeBuilder_ != null || lastUpdateTime_ != null;
    }
    /**
     *
     *
     * <pre>
     * Time of the most recent processing update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_update_time = 2;</code>
     *
     * @return The lastUpdateTime.
     */
    public com.google.protobuf.Timestamp getLastUpdateTime() {
      if (lastUpdateTimeBuilder_ == null) {
        return lastUpdateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : lastUpdateTime_;
      } else {
        return lastUpdateTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Time of the most recent processing update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_update_time = 2;</code>
     */
    public Builder setLastUpdateTime(com.google.protobuf.Timestamp value) {
      if (lastUpdateTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lastUpdateTime_ = value;
        onChanged();
      } else {
        lastUpdateTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Time of the most recent processing update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_update_time = 2;</code>
     */
    public Builder setLastUpdateTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (lastUpdateTimeBuilder_ == null) {
        lastUpdateTime_ = builderForValue.build();
        onChanged();
      } else {
        lastUpdateTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Time of the most recent processing update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_update_time = 2;</code>
     */
    public Builder mergeLastUpdateTime(com.google.protobuf.Timestamp value) {
      if (lastUpdateTimeBuilder_ == null) {
        if (lastUpdateTime_ != null) {
          lastUpdateTime_ =
              com.google.protobuf.Timestamp.newBuilder(lastUpdateTime_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          lastUpdateTime_ = value;
        }
        onChanged();
      } else {
        lastUpdateTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Time of the most recent processing update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_update_time = 2;</code>
     */
    public Builder clearLastUpdateTime() {
      if (lastUpdateTimeBuilder_ == null) {
        lastUpdateTime_ = null;
        onChanged();
      } else {
        lastUpdateTime_ = null;
        lastUpdateTimeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Time of the most recent processing update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_update_time = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getLastUpdateTimeBuilder() {

      onChanged();
      return getLastUpdateTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Time of the most recent processing update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_update_time = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getLastUpdateTimeOrBuilder() {
      if (lastUpdateTimeBuilder_ != null) {
        return lastUpdateTimeBuilder_.getMessageOrBuilder();
      } else {
        return lastUpdateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : lastUpdateTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * Time of the most recent processing update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_update_time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getLastUpdateTimeFieldBuilder() {
      if (lastUpdateTimeBuilder_ == null) {
        lastUpdateTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getLastUpdateTime(), getParentForChildren(), isClean());
        lastUpdateTime_ = null;
      }
      return lastUpdateTimeBuilder_;
    }

    private double progressPercentage_;
    /**
     *
     *
     * <pre>
     * The progress of the most recent processing update in percentage, ie. 70.0%.
     * </pre>
     *
     * <code>double progress_percentage = 3;</code>
     *
     * @return The progressPercentage.
     */
    @java.lang.Override
    public double getProgressPercentage() {
      return progressPercentage_;
    }
    /**
     *
     *
     * <pre>
     * The progress of the most recent processing update in percentage, ie. 70.0%.
     * </pre>
     *
     * <code>double progress_percentage = 3;</code>
     *
     * @param value The progressPercentage to set.
     * @return This builder for chaining.
     */
    public Builder setProgressPercentage(double value) {

      progressPercentage_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The progress of the most recent processing update in percentage, ie. 70.0%.
     * </pre>
     *
     * <code>double progress_percentage = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProgressPercentage() {

      progressPercentage_ = 0D;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata)
  private static final com.google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata();
  }

  public static com.google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SynthesizeLongAudioMetadata> PARSER =
      new com.google.protobuf.AbstractParser<SynthesizeLongAudioMetadata>() {
        @java.lang.Override
        public SynthesizeLongAudioMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<SynthesizeLongAudioMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SynthesizeLongAudioMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
