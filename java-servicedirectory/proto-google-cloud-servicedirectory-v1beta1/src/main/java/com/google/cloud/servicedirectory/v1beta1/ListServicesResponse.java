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
// source: google/cloud/servicedirectory/v1beta1/registration_service.proto

package com.google.cloud.servicedirectory.v1beta1;

/**
 *
 *
 * <pre>
 * The response message for [RegistrationService.ListServices][google.cloud.servicedirectory.v1beta1.RegistrationService.ListServices].
 * </pre>
 *
 * Protobuf type {@code google.cloud.servicedirectory.v1beta1.ListServicesResponse}
 */
public final class ListServicesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.servicedirectory.v1beta1.ListServicesResponse)
    ListServicesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListServicesResponse.newBuilder() to construct.
  private ListServicesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListServicesResponse() {
    services_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListServicesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListServicesResponse(
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                services_ =
                    new java.util.ArrayList<com.google.cloud.servicedirectory.v1beta1.Service>();
                mutable_bitField0_ |= 0x00000001;
              }
              services_.add(
                  input.readMessage(
                      com.google.cloud.servicedirectory.v1beta1.Service.parser(),
                      extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        services_ = java.util.Collections.unmodifiableList(services_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.servicedirectory.v1beta1.RegistrationServiceProto
        .internal_static_google_cloud_servicedirectory_v1beta1_ListServicesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.servicedirectory.v1beta1.RegistrationServiceProto
        .internal_static_google_cloud_servicedirectory_v1beta1_ListServicesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.servicedirectory.v1beta1.ListServicesResponse.class,
            com.google.cloud.servicedirectory.v1beta1.ListServicesResponse.Builder.class);
  }

  public static final int SERVICES_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.servicedirectory.v1beta1.Service> services_;
  /**
   *
   *
   * <pre>
   * The list of services.
   * </pre>
   *
   * <code>repeated .google.cloud.servicedirectory.v1beta1.Service services = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.servicedirectory.v1beta1.Service> getServicesList() {
    return services_;
  }
  /**
   *
   *
   * <pre>
   * The list of services.
   * </pre>
   *
   * <code>repeated .google.cloud.servicedirectory.v1beta1.Service services = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.servicedirectory.v1beta1.ServiceOrBuilder>
      getServicesOrBuilderList() {
    return services_;
  }
  /**
   *
   *
   * <pre>
   * The list of services.
   * </pre>
   *
   * <code>repeated .google.cloud.servicedirectory.v1beta1.Service services = 1;</code>
   */
  @java.lang.Override
  public int getServicesCount() {
    return services_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of services.
   * </pre>
   *
   * <code>repeated .google.cloud.servicedirectory.v1beta1.Service services = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.servicedirectory.v1beta1.Service getServices(int index) {
    return services_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of services.
   * </pre>
   *
   * <code>repeated .google.cloud.servicedirectory.v1beta1.Service services = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.servicedirectory.v1beta1.ServiceOrBuilder getServicesOrBuilder(
      int index) {
    return services_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < services_.size(); i++) {
      output.writeMessage(1, services_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < services_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, services_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.servicedirectory.v1beta1.ListServicesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.servicedirectory.v1beta1.ListServicesResponse other =
        (com.google.cloud.servicedirectory.v1beta1.ListServicesResponse) obj;

    if (!getServicesList().equals(other.getServicesList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getServicesCount() > 0) {
      hash = (37 * hash) + SERVICES_FIELD_NUMBER;
      hash = (53 * hash) + getServicesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.servicedirectory.v1beta1.ListServicesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.servicedirectory.v1beta1.ListServicesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.servicedirectory.v1beta1.ListServicesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.servicedirectory.v1beta1.ListServicesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.servicedirectory.v1beta1.ListServicesResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.servicedirectory.v1beta1.ListServicesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.servicedirectory.v1beta1.ListServicesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.servicedirectory.v1beta1.ListServicesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.servicedirectory.v1beta1.ListServicesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.servicedirectory.v1beta1.ListServicesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.servicedirectory.v1beta1.ListServicesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.servicedirectory.v1beta1.ListServicesResponse parseFrom(
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
      com.google.cloud.servicedirectory.v1beta1.ListServicesResponse prototype) {
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
   * The response message for [RegistrationService.ListServices][google.cloud.servicedirectory.v1beta1.RegistrationService.ListServices].
   * </pre>
   *
   * Protobuf type {@code google.cloud.servicedirectory.v1beta1.ListServicesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.servicedirectory.v1beta1.ListServicesResponse)
      com.google.cloud.servicedirectory.v1beta1.ListServicesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.servicedirectory.v1beta1.RegistrationServiceProto
          .internal_static_google_cloud_servicedirectory_v1beta1_ListServicesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.servicedirectory.v1beta1.RegistrationServiceProto
          .internal_static_google_cloud_servicedirectory_v1beta1_ListServicesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.servicedirectory.v1beta1.ListServicesResponse.class,
              com.google.cloud.servicedirectory.v1beta1.ListServicesResponse.Builder.class);
    }

    // Construct using com.google.cloud.servicedirectory.v1beta1.ListServicesResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getServicesFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (servicesBuilder_ == null) {
        services_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        servicesBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.servicedirectory.v1beta1.RegistrationServiceProto
          .internal_static_google_cloud_servicedirectory_v1beta1_ListServicesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.servicedirectory.v1beta1.ListServicesResponse
        getDefaultInstanceForType() {
      return com.google.cloud.servicedirectory.v1beta1.ListServicesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.servicedirectory.v1beta1.ListServicesResponse build() {
      com.google.cloud.servicedirectory.v1beta1.ListServicesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.servicedirectory.v1beta1.ListServicesResponse buildPartial() {
      com.google.cloud.servicedirectory.v1beta1.ListServicesResponse result =
          new com.google.cloud.servicedirectory.v1beta1.ListServicesResponse(this);
      int from_bitField0_ = bitField0_;
      if (servicesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          services_ = java.util.Collections.unmodifiableList(services_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.services_ = services_;
      } else {
        result.services_ = servicesBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.servicedirectory.v1beta1.ListServicesResponse) {
        return mergeFrom((com.google.cloud.servicedirectory.v1beta1.ListServicesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.servicedirectory.v1beta1.ListServicesResponse other) {
      if (other
          == com.google.cloud.servicedirectory.v1beta1.ListServicesResponse.getDefaultInstance())
        return this;
      if (servicesBuilder_ == null) {
        if (!other.services_.isEmpty()) {
          if (services_.isEmpty()) {
            services_ = other.services_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureServicesIsMutable();
            services_.addAll(other.services_);
          }
          onChanged();
        }
      } else {
        if (!other.services_.isEmpty()) {
          if (servicesBuilder_.isEmpty()) {
            servicesBuilder_.dispose();
            servicesBuilder_ = null;
            services_ = other.services_;
            bitField0_ = (bitField0_ & ~0x00000001);
            servicesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getServicesFieldBuilder()
                    : null;
          } else {
            servicesBuilder_.addAllMessages(other.services_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      com.google.cloud.servicedirectory.v1beta1.ListServicesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.servicedirectory.v1beta1.ListServicesResponse)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.servicedirectory.v1beta1.Service> services_ =
        java.util.Collections.emptyList();

    private void ensureServicesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        services_ =
            new java.util.ArrayList<com.google.cloud.servicedirectory.v1beta1.Service>(services_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.servicedirectory.v1beta1.Service,
            com.google.cloud.servicedirectory.v1beta1.Service.Builder,
            com.google.cloud.servicedirectory.v1beta1.ServiceOrBuilder>
        servicesBuilder_;

    /**
     *
     *
     * <pre>
     * The list of services.
     * </pre>
     *
     * <code>repeated .google.cloud.servicedirectory.v1beta1.Service services = 1;</code>
     */
    public java.util.List<com.google.cloud.servicedirectory.v1beta1.Service> getServicesList() {
      if (servicesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(services_);
      } else {
        return servicesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of services.
     * </pre>
     *
     * <code>repeated .google.cloud.servicedirectory.v1beta1.Service services = 1;</code>
     */
    public int getServicesCount() {
      if (servicesBuilder_ == null) {
        return services_.size();
      } else {
        return servicesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of services.
     * </pre>
     *
     * <code>repeated .google.cloud.servicedirectory.v1beta1.Service services = 1;</code>
     */
    public com.google.cloud.servicedirectory.v1beta1.Service getServices(int index) {
      if (servicesBuilder_ == null) {
        return services_.get(index);
      } else {
        return servicesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of services.
     * </pre>
     *
     * <code>repeated .google.cloud.servicedirectory.v1beta1.Service services = 1;</code>
     */
    public Builder setServices(int index, com.google.cloud.servicedirectory.v1beta1.Service value) {
      if (servicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServicesIsMutable();
        services_.set(index, value);
        onChanged();
      } else {
        servicesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of services.
     * </pre>
     *
     * <code>repeated .google.cloud.servicedirectory.v1beta1.Service services = 1;</code>
     */
    public Builder setServices(
        int index, com.google.cloud.servicedirectory.v1beta1.Service.Builder builderForValue) {
      if (servicesBuilder_ == null) {
        ensureServicesIsMutable();
        services_.set(index, builderForValue.build());
        onChanged();
      } else {
        servicesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of services.
     * </pre>
     *
     * <code>repeated .google.cloud.servicedirectory.v1beta1.Service services = 1;</code>
     */
    public Builder addServices(com.google.cloud.servicedirectory.v1beta1.Service value) {
      if (servicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServicesIsMutable();
        services_.add(value);
        onChanged();
      } else {
        servicesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of services.
     * </pre>
     *
     * <code>repeated .google.cloud.servicedirectory.v1beta1.Service services = 1;</code>
     */
    public Builder addServices(int index, com.google.cloud.servicedirectory.v1beta1.Service value) {
      if (servicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServicesIsMutable();
        services_.add(index, value);
        onChanged();
      } else {
        servicesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of services.
     * </pre>
     *
     * <code>repeated .google.cloud.servicedirectory.v1beta1.Service services = 1;</code>
     */
    public Builder addServices(
        com.google.cloud.servicedirectory.v1beta1.Service.Builder builderForValue) {
      if (servicesBuilder_ == null) {
        ensureServicesIsMutable();
        services_.add(builderForValue.build());
        onChanged();
      } else {
        servicesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of services.
     * </pre>
     *
     * <code>repeated .google.cloud.servicedirectory.v1beta1.Service services = 1;</code>
     */
    public Builder addServices(
        int index, com.google.cloud.servicedirectory.v1beta1.Service.Builder builderForValue) {
      if (servicesBuilder_ == null) {
        ensureServicesIsMutable();
        services_.add(index, builderForValue.build());
        onChanged();
      } else {
        servicesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of services.
     * </pre>
     *
     * <code>repeated .google.cloud.servicedirectory.v1beta1.Service services = 1;</code>
     */
    public Builder addAllServices(
        java.lang.Iterable<? extends com.google.cloud.servicedirectory.v1beta1.Service> values) {
      if (servicesBuilder_ == null) {
        ensureServicesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, services_);
        onChanged();
      } else {
        servicesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of services.
     * </pre>
     *
     * <code>repeated .google.cloud.servicedirectory.v1beta1.Service services = 1;</code>
     */
    public Builder clearServices() {
      if (servicesBuilder_ == null) {
        services_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        servicesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of services.
     * </pre>
     *
     * <code>repeated .google.cloud.servicedirectory.v1beta1.Service services = 1;</code>
     */
    public Builder removeServices(int index) {
      if (servicesBuilder_ == null) {
        ensureServicesIsMutable();
        services_.remove(index);
        onChanged();
      } else {
        servicesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of services.
     * </pre>
     *
     * <code>repeated .google.cloud.servicedirectory.v1beta1.Service services = 1;</code>
     */
    public com.google.cloud.servicedirectory.v1beta1.Service.Builder getServicesBuilder(int index) {
      return getServicesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of services.
     * </pre>
     *
     * <code>repeated .google.cloud.servicedirectory.v1beta1.Service services = 1;</code>
     */
    public com.google.cloud.servicedirectory.v1beta1.ServiceOrBuilder getServicesOrBuilder(
        int index) {
      if (servicesBuilder_ == null) {
        return services_.get(index);
      } else {
        return servicesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of services.
     * </pre>
     *
     * <code>repeated .google.cloud.servicedirectory.v1beta1.Service services = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.servicedirectory.v1beta1.ServiceOrBuilder>
        getServicesOrBuilderList() {
      if (servicesBuilder_ != null) {
        return servicesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(services_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of services.
     * </pre>
     *
     * <code>repeated .google.cloud.servicedirectory.v1beta1.Service services = 1;</code>
     */
    public com.google.cloud.servicedirectory.v1beta1.Service.Builder addServicesBuilder() {
      return getServicesFieldBuilder()
          .addBuilder(com.google.cloud.servicedirectory.v1beta1.Service.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of services.
     * </pre>
     *
     * <code>repeated .google.cloud.servicedirectory.v1beta1.Service services = 1;</code>
     */
    public com.google.cloud.servicedirectory.v1beta1.Service.Builder addServicesBuilder(int index) {
      return getServicesFieldBuilder()
          .addBuilder(
              index, com.google.cloud.servicedirectory.v1beta1.Service.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of services.
     * </pre>
     *
     * <code>repeated .google.cloud.servicedirectory.v1beta1.Service services = 1;</code>
     */
    public java.util.List<com.google.cloud.servicedirectory.v1beta1.Service.Builder>
        getServicesBuilderList() {
      return getServicesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.servicedirectory.v1beta1.Service,
            com.google.cloud.servicedirectory.v1beta1.Service.Builder,
            com.google.cloud.servicedirectory.v1beta1.ServiceOrBuilder>
        getServicesFieldBuilder() {
      if (servicesBuilder_ == null) {
        servicesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.servicedirectory.v1beta1.Service,
                com.google.cloud.servicedirectory.v1beta1.Service.Builder,
                com.google.cloud.servicedirectory.v1beta1.ServiceOrBuilder>(
                services_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        services_ = null;
      }
      return servicesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.servicedirectory.v1beta1.ListServicesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.servicedirectory.v1beta1.ListServicesResponse)
  private static final com.google.cloud.servicedirectory.v1beta1.ListServicesResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.servicedirectory.v1beta1.ListServicesResponse();
  }

  public static com.google.cloud.servicedirectory.v1beta1.ListServicesResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListServicesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListServicesResponse>() {
        @java.lang.Override
        public ListServicesResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListServicesResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListServicesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListServicesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.servicedirectory.v1beta1.ListServicesResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
