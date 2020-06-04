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
// source: google/cloud/tasks/v2beta2/target.proto

package com.google.cloud.tasks.v2beta2;

/**
 *
 *
 * <pre>
 * The pull message contains data that can be used by the caller of
 * [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] to process the task.
 * This proto can only be used for tasks in a queue which has
 * [pull_target][google.cloud.tasks.v2beta2.Queue.pull_target] set.
 * </pre>
 *
 * Protobuf type {@code google.cloud.tasks.v2beta2.PullMessage}
 */
public final class PullMessage extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.tasks.v2beta2.PullMessage)
    PullMessageOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PullMessage.newBuilder() to construct.
  private PullMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PullMessage() {
    payload_ = com.google.protobuf.ByteString.EMPTY;
    tag_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PullMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private PullMessage(
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
              payload_ = input.readBytes();
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              tag_ = s;
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
    return com.google.cloud.tasks.v2beta2.TargetProto
        .internal_static_google_cloud_tasks_v2beta2_PullMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.tasks.v2beta2.TargetProto
        .internal_static_google_cloud_tasks_v2beta2_PullMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.tasks.v2beta2.PullMessage.class,
            com.google.cloud.tasks.v2beta2.PullMessage.Builder.class);
  }

  public static final int PAYLOAD_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString payload_;
  /**
   *
   *
   * <pre>
   * A data payload consumed by the worker to execute the task.
   * </pre>
   *
   * <code>bytes payload = 1;</code>
   *
   * @return The payload.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPayload() {
    return payload_;
  }

  public static final int TAG_FIELD_NUMBER = 2;
  private volatile java.lang.Object tag_;
  /**
   *
   *
   * <pre>
   * The task's tag.
   * Tags allow similar tasks to be processed in a batch. If you label
   * tasks with a tag, your worker can
   * [lease tasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] with the same tag using
   * [filter][google.cloud.tasks.v2beta2.LeaseTasksRequest.filter]. For example, if you want to
   * aggregate the events associated with a specific user once a day,
   * you could tag tasks with the user ID.
   * The task's tag can only be set when the
   * [task is created][google.cloud.tasks.v2beta2.CloudTasks.CreateTask].
   * The tag must be less than 500 characters.
   * SDK compatibility: Although the SDK allows tags to be either
   * string or
   * [bytes](https://cloud.google.com/appengine/docs/standard/java/javadoc/com/google/appengine/api/taskqueue/TaskOptions.html#tag-byte:A-),
   * only UTF-8 encoded tags can be used in Cloud Tasks. If a tag isn't UTF-8
   * encoded, the tag will be empty when the task is returned by Cloud Tasks.
   * </pre>
   *
   * <code>string tag = 2;</code>
   *
   * @return The tag.
   */
  @java.lang.Override
  public java.lang.String getTag() {
    java.lang.Object ref = tag_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tag_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The task's tag.
   * Tags allow similar tasks to be processed in a batch. If you label
   * tasks with a tag, your worker can
   * [lease tasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] with the same tag using
   * [filter][google.cloud.tasks.v2beta2.LeaseTasksRequest.filter]. For example, if you want to
   * aggregate the events associated with a specific user once a day,
   * you could tag tasks with the user ID.
   * The task's tag can only be set when the
   * [task is created][google.cloud.tasks.v2beta2.CloudTasks.CreateTask].
   * The tag must be less than 500 characters.
   * SDK compatibility: Although the SDK allows tags to be either
   * string or
   * [bytes](https://cloud.google.com/appengine/docs/standard/java/javadoc/com/google/appengine/api/taskqueue/TaskOptions.html#tag-byte:A-),
   * only UTF-8 encoded tags can be used in Cloud Tasks. If a tag isn't UTF-8
   * encoded, the tag will be empty when the task is returned by Cloud Tasks.
   * </pre>
   *
   * <code>string tag = 2;</code>
   *
   * @return The bytes for tag.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTagBytes() {
    java.lang.Object ref = tag_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      tag_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!payload_.isEmpty()) {
      output.writeBytes(1, payload_);
    }
    if (!getTagBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, tag_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!payload_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(1, payload_);
    }
    if (!getTagBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, tag_);
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
    if (!(obj instanceof com.google.cloud.tasks.v2beta2.PullMessage)) {
      return super.equals(obj);
    }
    com.google.cloud.tasks.v2beta2.PullMessage other =
        (com.google.cloud.tasks.v2beta2.PullMessage) obj;

    if (!getPayload().equals(other.getPayload())) return false;
    if (!getTag().equals(other.getTag())) return false;
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
    hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
    hash = (53 * hash) + getPayload().hashCode();
    hash = (37 * hash) + TAG_FIELD_NUMBER;
    hash = (53 * hash) + getTag().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.tasks.v2beta2.PullMessage parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tasks.v2beta2.PullMessage parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta2.PullMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tasks.v2beta2.PullMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta2.PullMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tasks.v2beta2.PullMessage parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta2.PullMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2beta2.PullMessage parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta2.PullMessage parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2beta2.PullMessage parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta2.PullMessage parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2beta2.PullMessage parseFrom(
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

  public static Builder newBuilder(com.google.cloud.tasks.v2beta2.PullMessage prototype) {
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
   * The pull message contains data that can be used by the caller of
   * [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] to process the task.
   * This proto can only be used for tasks in a queue which has
   * [pull_target][google.cloud.tasks.v2beta2.Queue.pull_target] set.
   * </pre>
   *
   * Protobuf type {@code google.cloud.tasks.v2beta2.PullMessage}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.tasks.v2beta2.PullMessage)
      com.google.cloud.tasks.v2beta2.PullMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.tasks.v2beta2.TargetProto
          .internal_static_google_cloud_tasks_v2beta2_PullMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.tasks.v2beta2.TargetProto
          .internal_static_google_cloud_tasks_v2beta2_PullMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.tasks.v2beta2.PullMessage.class,
              com.google.cloud.tasks.v2beta2.PullMessage.Builder.class);
    }

    // Construct using com.google.cloud.tasks.v2beta2.PullMessage.newBuilder()
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
      payload_ = com.google.protobuf.ByteString.EMPTY;

      tag_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.tasks.v2beta2.TargetProto
          .internal_static_google_cloud_tasks_v2beta2_PullMessage_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta2.PullMessage getDefaultInstanceForType() {
      return com.google.cloud.tasks.v2beta2.PullMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta2.PullMessage build() {
      com.google.cloud.tasks.v2beta2.PullMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta2.PullMessage buildPartial() {
      com.google.cloud.tasks.v2beta2.PullMessage result =
          new com.google.cloud.tasks.v2beta2.PullMessage(this);
      result.payload_ = payload_;
      result.tag_ = tag_;
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
      if (other instanceof com.google.cloud.tasks.v2beta2.PullMessage) {
        return mergeFrom((com.google.cloud.tasks.v2beta2.PullMessage) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.tasks.v2beta2.PullMessage other) {
      if (other == com.google.cloud.tasks.v2beta2.PullMessage.getDefaultInstance()) return this;
      if (other.getPayload() != com.google.protobuf.ByteString.EMPTY) {
        setPayload(other.getPayload());
      }
      if (!other.getTag().isEmpty()) {
        tag_ = other.tag_;
        onChanged();
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
      com.google.cloud.tasks.v2beta2.PullMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.tasks.v2beta2.PullMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString payload_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * A data payload consumed by the worker to execute the task.
     * </pre>
     *
     * <code>bytes payload = 1;</code>
     *
     * @return The payload.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getPayload() {
      return payload_;
    }
    /**
     *
     *
     * <pre>
     * A data payload consumed by the worker to execute the task.
     * </pre>
     *
     * <code>bytes payload = 1;</code>
     *
     * @param value The payload to set.
     * @return This builder for chaining.
     */
    public Builder setPayload(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }

      payload_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A data payload consumed by the worker to execute the task.
     * </pre>
     *
     * <code>bytes payload = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPayload() {

      payload_ = getDefaultInstance().getPayload();
      onChanged();
      return this;
    }

    private java.lang.Object tag_ = "";
    /**
     *
     *
     * <pre>
     * The task's tag.
     * Tags allow similar tasks to be processed in a batch. If you label
     * tasks with a tag, your worker can
     * [lease tasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] with the same tag using
     * [filter][google.cloud.tasks.v2beta2.LeaseTasksRequest.filter]. For example, if you want to
     * aggregate the events associated with a specific user once a day,
     * you could tag tasks with the user ID.
     * The task's tag can only be set when the
     * [task is created][google.cloud.tasks.v2beta2.CloudTasks.CreateTask].
     * The tag must be less than 500 characters.
     * SDK compatibility: Although the SDK allows tags to be either
     * string or
     * [bytes](https://cloud.google.com/appengine/docs/standard/java/javadoc/com/google/appengine/api/taskqueue/TaskOptions.html#tag-byte:A-),
     * only UTF-8 encoded tags can be used in Cloud Tasks. If a tag isn't UTF-8
     * encoded, the tag will be empty when the task is returned by Cloud Tasks.
     * </pre>
     *
     * <code>string tag = 2;</code>
     *
     * @return The tag.
     */
    public java.lang.String getTag() {
      java.lang.Object ref = tag_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tag_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The task's tag.
     * Tags allow similar tasks to be processed in a batch. If you label
     * tasks with a tag, your worker can
     * [lease tasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] with the same tag using
     * [filter][google.cloud.tasks.v2beta2.LeaseTasksRequest.filter]. For example, if you want to
     * aggregate the events associated with a specific user once a day,
     * you could tag tasks with the user ID.
     * The task's tag can only be set when the
     * [task is created][google.cloud.tasks.v2beta2.CloudTasks.CreateTask].
     * The tag must be less than 500 characters.
     * SDK compatibility: Although the SDK allows tags to be either
     * string or
     * [bytes](https://cloud.google.com/appengine/docs/standard/java/javadoc/com/google/appengine/api/taskqueue/TaskOptions.html#tag-byte:A-),
     * only UTF-8 encoded tags can be used in Cloud Tasks. If a tag isn't UTF-8
     * encoded, the tag will be empty when the task is returned by Cloud Tasks.
     * </pre>
     *
     * <code>string tag = 2;</code>
     *
     * @return The bytes for tag.
     */
    public com.google.protobuf.ByteString getTagBytes() {
      java.lang.Object ref = tag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        tag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The task's tag.
     * Tags allow similar tasks to be processed in a batch. If you label
     * tasks with a tag, your worker can
     * [lease tasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] with the same tag using
     * [filter][google.cloud.tasks.v2beta2.LeaseTasksRequest.filter]. For example, if you want to
     * aggregate the events associated with a specific user once a day,
     * you could tag tasks with the user ID.
     * The task's tag can only be set when the
     * [task is created][google.cloud.tasks.v2beta2.CloudTasks.CreateTask].
     * The tag must be less than 500 characters.
     * SDK compatibility: Although the SDK allows tags to be either
     * string or
     * [bytes](https://cloud.google.com/appengine/docs/standard/java/javadoc/com/google/appengine/api/taskqueue/TaskOptions.html#tag-byte:A-),
     * only UTF-8 encoded tags can be used in Cloud Tasks. If a tag isn't UTF-8
     * encoded, the tag will be empty when the task is returned by Cloud Tasks.
     * </pre>
     *
     * <code>string tag = 2;</code>
     *
     * @param value The tag to set.
     * @return This builder for chaining.
     */
    public Builder setTag(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      tag_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The task's tag.
     * Tags allow similar tasks to be processed in a batch. If you label
     * tasks with a tag, your worker can
     * [lease tasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] with the same tag using
     * [filter][google.cloud.tasks.v2beta2.LeaseTasksRequest.filter]. For example, if you want to
     * aggregate the events associated with a specific user once a day,
     * you could tag tasks with the user ID.
     * The task's tag can only be set when the
     * [task is created][google.cloud.tasks.v2beta2.CloudTasks.CreateTask].
     * The tag must be less than 500 characters.
     * SDK compatibility: Although the SDK allows tags to be either
     * string or
     * [bytes](https://cloud.google.com/appengine/docs/standard/java/javadoc/com/google/appengine/api/taskqueue/TaskOptions.html#tag-byte:A-),
     * only UTF-8 encoded tags can be used in Cloud Tasks. If a tag isn't UTF-8
     * encoded, the tag will be empty when the task is returned by Cloud Tasks.
     * </pre>
     *
     * <code>string tag = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTag() {

      tag_ = getDefaultInstance().getTag();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The task's tag.
     * Tags allow similar tasks to be processed in a batch. If you label
     * tasks with a tag, your worker can
     * [lease tasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] with the same tag using
     * [filter][google.cloud.tasks.v2beta2.LeaseTasksRequest.filter]. For example, if you want to
     * aggregate the events associated with a specific user once a day,
     * you could tag tasks with the user ID.
     * The task's tag can only be set when the
     * [task is created][google.cloud.tasks.v2beta2.CloudTasks.CreateTask].
     * The tag must be less than 500 characters.
     * SDK compatibility: Although the SDK allows tags to be either
     * string or
     * [bytes](https://cloud.google.com/appengine/docs/standard/java/javadoc/com/google/appengine/api/taskqueue/TaskOptions.html#tag-byte:A-),
     * only UTF-8 encoded tags can be used in Cloud Tasks. If a tag isn't UTF-8
     * encoded, the tag will be empty when the task is returned by Cloud Tasks.
     * </pre>
     *
     * <code>string tag = 2;</code>
     *
     * @param value The bytes for tag to set.
     * @return This builder for chaining.
     */
    public Builder setTagBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      tag_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.tasks.v2beta2.PullMessage)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.tasks.v2beta2.PullMessage)
  private static final com.google.cloud.tasks.v2beta2.PullMessage DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.tasks.v2beta2.PullMessage();
  }

  public static com.google.cloud.tasks.v2beta2.PullMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PullMessage> PARSER =
      new com.google.protobuf.AbstractParser<PullMessage>() {
        @java.lang.Override
        public PullMessage parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new PullMessage(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<PullMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PullMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.tasks.v2beta2.PullMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
