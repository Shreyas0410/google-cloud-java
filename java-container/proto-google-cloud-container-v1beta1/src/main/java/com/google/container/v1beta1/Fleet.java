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
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

/**
 *
 *
 * <pre>
 * Fleet is the fleet configuration for the cluster.
 * </pre>
 *
 * Protobuf type {@code google.container.v1beta1.Fleet}
 */
public final class Fleet extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1beta1.Fleet)
    FleetOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Fleet.newBuilder() to construct.
  private Fleet(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Fleet() {
    project_ = "";
    membership_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Fleet();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_Fleet_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_Fleet_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1beta1.Fleet.class,
            com.google.container.v1beta1.Fleet.Builder.class);
  }

  public static final int PROJECT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object project_ = "";
  /**
   *
   *
   * <pre>
   * The Fleet host project(project ID or project number) where this cluster
   * will be registered to. This field cannot be changed after the cluster has
   * been registered.
   * </pre>
   *
   * <code>string project = 1;</code>
   *
   * @return The project.
   */
  @java.lang.Override
  public java.lang.String getProject() {
    java.lang.Object ref = project_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      project_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The Fleet host project(project ID or project number) where this cluster
   * will be registered to. This field cannot be changed after the cluster has
   * been registered.
   * </pre>
   *
   * <code>string project = 1;</code>
   *
   * @return The bytes for project.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getProjectBytes() {
    java.lang.Object ref = project_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      project_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MEMBERSHIP_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object membership_ = "";
  /**
   *
   *
   * <pre>
   * [Output only] The full resource name of the registered fleet membership of
   * the cluster, in the format
   * `//gkehub.googleapis.com/projects/&#42;&#47;locations/&#42;&#47;memberships/&#42;`.
   * </pre>
   *
   * <code>string membership = 2;</code>
   *
   * @return The membership.
   */
  @java.lang.Override
  public java.lang.String getMembership() {
    java.lang.Object ref = membership_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      membership_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * [Output only] The full resource name of the registered fleet membership of
   * the cluster, in the format
   * `//gkehub.googleapis.com/projects/&#42;&#47;locations/&#42;&#47;memberships/&#42;`.
   * </pre>
   *
   * <code>string membership = 2;</code>
   *
   * @return The bytes for membership.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMembershipBytes() {
    java.lang.Object ref = membership_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      membership_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRE_REGISTERED_FIELD_NUMBER = 3;
  private boolean preRegistered_ = false;
  /**
   *
   *
   * <pre>
   * [Output only] Whether the cluster has been registered through the fleet
   * API.
   * </pre>
   *
   * <code>bool pre_registered = 3;</code>
   *
   * @return The preRegistered.
   */
  @java.lang.Override
  public boolean getPreRegistered() {
    return preRegistered_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(project_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, project_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(membership_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, membership_);
    }
    if (preRegistered_ != false) {
      output.writeBool(3, preRegistered_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(project_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, project_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(membership_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, membership_);
    }
    if (preRegistered_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, preRegistered_);
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
    if (!(obj instanceof com.google.container.v1beta1.Fleet)) {
      return super.equals(obj);
    }
    com.google.container.v1beta1.Fleet other = (com.google.container.v1beta1.Fleet) obj;

    if (!getProject().equals(other.getProject())) return false;
    if (!getMembership().equals(other.getMembership())) return false;
    if (getPreRegistered() != other.getPreRegistered()) return false;
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
    hash = (37 * hash) + PROJECT_FIELD_NUMBER;
    hash = (53 * hash) + getProject().hashCode();
    hash = (37 * hash) + MEMBERSHIP_FIELD_NUMBER;
    hash = (53 * hash) + getMembership().hashCode();
    hash = (37 * hash) + PRE_REGISTERED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getPreRegistered());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1beta1.Fleet parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.Fleet parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.Fleet parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.Fleet parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.Fleet parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.Fleet parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.Fleet parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.Fleet parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.Fleet parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.Fleet parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.Fleet parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.Fleet parseFrom(
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

  public static Builder newBuilder(com.google.container.v1beta1.Fleet prototype) {
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
   * Fleet is the fleet configuration for the cluster.
   * </pre>
   *
   * Protobuf type {@code google.container.v1beta1.Fleet}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1beta1.Fleet)
      com.google.container.v1beta1.FleetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_Fleet_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_Fleet_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1beta1.Fleet.class,
              com.google.container.v1beta1.Fleet.Builder.class);
    }

    // Construct using com.google.container.v1beta1.Fleet.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      project_ = "";
      membership_ = "";
      preRegistered_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_Fleet_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1beta1.Fleet getDefaultInstanceForType() {
      return com.google.container.v1beta1.Fleet.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1beta1.Fleet build() {
      com.google.container.v1beta1.Fleet result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1beta1.Fleet buildPartial() {
      com.google.container.v1beta1.Fleet result = new com.google.container.v1beta1.Fleet(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.container.v1beta1.Fleet result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.project_ = project_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.membership_ = membership_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.preRegistered_ = preRegistered_;
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
      if (other instanceof com.google.container.v1beta1.Fleet) {
        return mergeFrom((com.google.container.v1beta1.Fleet) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1beta1.Fleet other) {
      if (other == com.google.container.v1beta1.Fleet.getDefaultInstance()) return this;
      if (!other.getProject().isEmpty()) {
        project_ = other.project_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getMembership().isEmpty()) {
        membership_ = other.membership_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getPreRegistered() != false) {
        setPreRegistered(other.getPreRegistered());
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
                project_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                membership_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                preRegistered_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

    private java.lang.Object project_ = "";
    /**
     *
     *
     * <pre>
     * The Fleet host project(project ID or project number) where this cluster
     * will be registered to. This field cannot be changed after the cluster has
     * been registered.
     * </pre>
     *
     * <code>string project = 1;</code>
     *
     * @return The project.
     */
    public java.lang.String getProject() {
      java.lang.Object ref = project_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        project_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The Fleet host project(project ID or project number) where this cluster
     * will be registered to. This field cannot be changed after the cluster has
     * been registered.
     * </pre>
     *
     * <code>string project = 1;</code>
     *
     * @return The bytes for project.
     */
    public com.google.protobuf.ByteString getProjectBytes() {
      java.lang.Object ref = project_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        project_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The Fleet host project(project ID or project number) where this cluster
     * will be registered to. This field cannot be changed after the cluster has
     * been registered.
     * </pre>
     *
     * <code>string project = 1;</code>
     *
     * @param value The project to set.
     * @return This builder for chaining.
     */
    public Builder setProject(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      project_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Fleet host project(project ID or project number) where this cluster
     * will be registered to. This field cannot be changed after the cluster has
     * been registered.
     * </pre>
     *
     * <code>string project = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProject() {
      project_ = getDefaultInstance().getProject();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Fleet host project(project ID or project number) where this cluster
     * will be registered to. This field cannot be changed after the cluster has
     * been registered.
     * </pre>
     *
     * <code>string project = 1;</code>
     *
     * @param value The bytes for project to set.
     * @return This builder for chaining.
     */
    public Builder setProjectBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      project_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object membership_ = "";
    /**
     *
     *
     * <pre>
     * [Output only] The full resource name of the registered fleet membership of
     * the cluster, in the format
     * `//gkehub.googleapis.com/projects/&#42;&#47;locations/&#42;&#47;memberships/&#42;`.
     * </pre>
     *
     * <code>string membership = 2;</code>
     *
     * @return The membership.
     */
    public java.lang.String getMembership() {
      java.lang.Object ref = membership_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        membership_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * [Output only] The full resource name of the registered fleet membership of
     * the cluster, in the format
     * `//gkehub.googleapis.com/projects/&#42;&#47;locations/&#42;&#47;memberships/&#42;`.
     * </pre>
     *
     * <code>string membership = 2;</code>
     *
     * @return The bytes for membership.
     */
    public com.google.protobuf.ByteString getMembershipBytes() {
      java.lang.Object ref = membership_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        membership_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * [Output only] The full resource name of the registered fleet membership of
     * the cluster, in the format
     * `//gkehub.googleapis.com/projects/&#42;&#47;locations/&#42;&#47;memberships/&#42;`.
     * </pre>
     *
     * <code>string membership = 2;</code>
     *
     * @param value The membership to set.
     * @return This builder for chaining.
     */
    public Builder setMembership(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      membership_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output only] The full resource name of the registered fleet membership of
     * the cluster, in the format
     * `//gkehub.googleapis.com/projects/&#42;&#47;locations/&#42;&#47;memberships/&#42;`.
     * </pre>
     *
     * <code>string membership = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMembership() {
      membership_ = getDefaultInstance().getMembership();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output only] The full resource name of the registered fleet membership of
     * the cluster, in the format
     * `//gkehub.googleapis.com/projects/&#42;&#47;locations/&#42;&#47;memberships/&#42;`.
     * </pre>
     *
     * <code>string membership = 2;</code>
     *
     * @param value The bytes for membership to set.
     * @return This builder for chaining.
     */
    public Builder setMembershipBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      membership_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private boolean preRegistered_;
    /**
     *
     *
     * <pre>
     * [Output only] Whether the cluster has been registered through the fleet
     * API.
     * </pre>
     *
     * <code>bool pre_registered = 3;</code>
     *
     * @return The preRegistered.
     */
    @java.lang.Override
    public boolean getPreRegistered() {
      return preRegistered_;
    }
    /**
     *
     *
     * <pre>
     * [Output only] Whether the cluster has been registered through the fleet
     * API.
     * </pre>
     *
     * <code>bool pre_registered = 3;</code>
     *
     * @param value The preRegistered to set.
     * @return This builder for chaining.
     */
    public Builder setPreRegistered(boolean value) {

      preRegistered_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output only] Whether the cluster has been registered through the fleet
     * API.
     * </pre>
     *
     * <code>bool pre_registered = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPreRegistered() {
      bitField0_ = (bitField0_ & ~0x00000004);
      preRegistered_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.container.v1beta1.Fleet)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1beta1.Fleet)
  private static final com.google.container.v1beta1.Fleet DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1beta1.Fleet();
  }

  public static com.google.container.v1beta1.Fleet getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Fleet> PARSER =
      new com.google.protobuf.AbstractParser<Fleet>() {
        @java.lang.Override
        public Fleet parsePartialFrom(
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

  public static com.google.protobuf.Parser<Fleet> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Fleet> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1beta1.Fleet getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
