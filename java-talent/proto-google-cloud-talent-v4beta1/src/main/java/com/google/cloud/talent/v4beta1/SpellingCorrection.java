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
// source: google/cloud/talent/v4beta1/common.proto

package com.google.cloud.talent.v4beta1;

/**
 *
 *
 * <pre>
 * Spell check result.
 * </pre>
 *
 * Protobuf type {@code google.cloud.talent.v4beta1.SpellingCorrection}
 */
public final class SpellingCorrection extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.talent.v4beta1.SpellingCorrection)
    SpellingCorrectionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SpellingCorrection.newBuilder() to construct.
  private SpellingCorrection(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SpellingCorrection() {
    correctedText_ = "";
    correctedHtml_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SpellingCorrection();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.talent.v4beta1.CommonProto
        .internal_static_google_cloud_talent_v4beta1_SpellingCorrection_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.talent.v4beta1.CommonProto
        .internal_static_google_cloud_talent_v4beta1_SpellingCorrection_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.talent.v4beta1.SpellingCorrection.class,
            com.google.cloud.talent.v4beta1.SpellingCorrection.Builder.class);
  }

  public static final int CORRECTED_FIELD_NUMBER = 1;
  private boolean corrected_ = false;
  /**
   *
   *
   * <pre>
   * Indicates if the query was corrected by the spell checker.
   * </pre>
   *
   * <code>bool corrected = 1;</code>
   *
   * @return The corrected.
   */
  @java.lang.Override
  public boolean getCorrected() {
    return corrected_;
  }

  public static final int CORRECTED_TEXT_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object correctedText_ = "";
  /**
   *
   *
   * <pre>
   * Correction output consisting of the corrected keyword string.
   * </pre>
   *
   * <code>string corrected_text = 2;</code>
   *
   * @return The correctedText.
   */
  @java.lang.Override
  public java.lang.String getCorrectedText() {
    java.lang.Object ref = correctedText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      correctedText_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Correction output consisting of the corrected keyword string.
   * </pre>
   *
   * <code>string corrected_text = 2;</code>
   *
   * @return The bytes for correctedText.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCorrectedTextBytes() {
    java.lang.Object ref = correctedText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      correctedText_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CORRECTED_HTML_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object correctedHtml_ = "";
  /**
   *
   *
   * <pre>
   * Corrected output with html tags to highlight the corrected words.
   * Corrected words are called out with the "&lt;b&gt;&lt;i&gt;...&lt;/i&gt;&lt;/b&gt;" html tags.
   *
   * For example, the user input query is "software enginear", where the second
   * word, "enginear," is incorrect. It should be "engineer". When spelling
   * correction is enabled, this value is
   * "software &lt;b&gt;&lt;i&gt;engineer&lt;/i&gt;&lt;/b&gt;".
   * </pre>
   *
   * <code>string corrected_html = 3;</code>
   *
   * @return The correctedHtml.
   */
  @java.lang.Override
  public java.lang.String getCorrectedHtml() {
    java.lang.Object ref = correctedHtml_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      correctedHtml_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Corrected output with html tags to highlight the corrected words.
   * Corrected words are called out with the "&lt;b&gt;&lt;i&gt;...&lt;/i&gt;&lt;/b&gt;" html tags.
   *
   * For example, the user input query is "software enginear", where the second
   * word, "enginear," is incorrect. It should be "engineer". When spelling
   * correction is enabled, this value is
   * "software &lt;b&gt;&lt;i&gt;engineer&lt;/i&gt;&lt;/b&gt;".
   * </pre>
   *
   * <code>string corrected_html = 3;</code>
   *
   * @return The bytes for correctedHtml.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCorrectedHtmlBytes() {
    java.lang.Object ref = correctedHtml_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      correctedHtml_ = b;
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
    if (corrected_ != false) {
      output.writeBool(1, corrected_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(correctedText_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, correctedText_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(correctedHtml_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, correctedHtml_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (corrected_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, corrected_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(correctedText_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, correctedText_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(correctedHtml_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, correctedHtml_);
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
    if (!(obj instanceof com.google.cloud.talent.v4beta1.SpellingCorrection)) {
      return super.equals(obj);
    }
    com.google.cloud.talent.v4beta1.SpellingCorrection other =
        (com.google.cloud.talent.v4beta1.SpellingCorrection) obj;

    if (getCorrected() != other.getCorrected()) return false;
    if (!getCorrectedText().equals(other.getCorrectedText())) return false;
    if (!getCorrectedHtml().equals(other.getCorrectedHtml())) return false;
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
    hash = (37 * hash) + CORRECTED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getCorrected());
    hash = (37 * hash) + CORRECTED_TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getCorrectedText().hashCode();
    hash = (37 * hash) + CORRECTED_HTML_FIELD_NUMBER;
    hash = (53 * hash) + getCorrectedHtml().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.talent.v4beta1.SpellingCorrection parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.SpellingCorrection parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.SpellingCorrection parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.SpellingCorrection parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.SpellingCorrection parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.SpellingCorrection parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.SpellingCorrection parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.SpellingCorrection parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.SpellingCorrection parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.SpellingCorrection parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.SpellingCorrection parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.SpellingCorrection parseFrom(
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

  public static Builder newBuilder(com.google.cloud.talent.v4beta1.SpellingCorrection prototype) {
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
   * Spell check result.
   * </pre>
   *
   * Protobuf type {@code google.cloud.talent.v4beta1.SpellingCorrection}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.talent.v4beta1.SpellingCorrection)
      com.google.cloud.talent.v4beta1.SpellingCorrectionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.talent.v4beta1.CommonProto
          .internal_static_google_cloud_talent_v4beta1_SpellingCorrection_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.talent.v4beta1.CommonProto
          .internal_static_google_cloud_talent_v4beta1_SpellingCorrection_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.talent.v4beta1.SpellingCorrection.class,
              com.google.cloud.talent.v4beta1.SpellingCorrection.Builder.class);
    }

    // Construct using com.google.cloud.talent.v4beta1.SpellingCorrection.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      corrected_ = false;
      correctedText_ = "";
      correctedHtml_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.talent.v4beta1.CommonProto
          .internal_static_google_cloud_talent_v4beta1_SpellingCorrection_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.SpellingCorrection getDefaultInstanceForType() {
      return com.google.cloud.talent.v4beta1.SpellingCorrection.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.SpellingCorrection build() {
      com.google.cloud.talent.v4beta1.SpellingCorrection result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.SpellingCorrection buildPartial() {
      com.google.cloud.talent.v4beta1.SpellingCorrection result =
          new com.google.cloud.talent.v4beta1.SpellingCorrection(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.talent.v4beta1.SpellingCorrection result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.corrected_ = corrected_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.correctedText_ = correctedText_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.correctedHtml_ = correctedHtml_;
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
      if (other instanceof com.google.cloud.talent.v4beta1.SpellingCorrection) {
        return mergeFrom((com.google.cloud.talent.v4beta1.SpellingCorrection) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.talent.v4beta1.SpellingCorrection other) {
      if (other == com.google.cloud.talent.v4beta1.SpellingCorrection.getDefaultInstance())
        return this;
      if (other.getCorrected() != false) {
        setCorrected(other.getCorrected());
      }
      if (!other.getCorrectedText().isEmpty()) {
        correctedText_ = other.correctedText_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getCorrectedHtml().isEmpty()) {
        correctedHtml_ = other.correctedHtml_;
        bitField0_ |= 0x00000004;
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
            case 8:
              {
                corrected_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                correctedText_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                correctedHtml_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

    private boolean corrected_;
    /**
     *
     *
     * <pre>
     * Indicates if the query was corrected by the spell checker.
     * </pre>
     *
     * <code>bool corrected = 1;</code>
     *
     * @return The corrected.
     */
    @java.lang.Override
    public boolean getCorrected() {
      return corrected_;
    }
    /**
     *
     *
     * <pre>
     * Indicates if the query was corrected by the spell checker.
     * </pre>
     *
     * <code>bool corrected = 1;</code>
     *
     * @param value The corrected to set.
     * @return This builder for chaining.
     */
    public Builder setCorrected(boolean value) {

      corrected_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Indicates if the query was corrected by the spell checker.
     * </pre>
     *
     * <code>bool corrected = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCorrected() {
      bitField0_ = (bitField0_ & ~0x00000001);
      corrected_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object correctedText_ = "";
    /**
     *
     *
     * <pre>
     * Correction output consisting of the corrected keyword string.
     * </pre>
     *
     * <code>string corrected_text = 2;</code>
     *
     * @return The correctedText.
     */
    public java.lang.String getCorrectedText() {
      java.lang.Object ref = correctedText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        correctedText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Correction output consisting of the corrected keyword string.
     * </pre>
     *
     * <code>string corrected_text = 2;</code>
     *
     * @return The bytes for correctedText.
     */
    public com.google.protobuf.ByteString getCorrectedTextBytes() {
      java.lang.Object ref = correctedText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        correctedText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Correction output consisting of the corrected keyword string.
     * </pre>
     *
     * <code>string corrected_text = 2;</code>
     *
     * @param value The correctedText to set.
     * @return This builder for chaining.
     */
    public Builder setCorrectedText(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      correctedText_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Correction output consisting of the corrected keyword string.
     * </pre>
     *
     * <code>string corrected_text = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCorrectedText() {
      correctedText_ = getDefaultInstance().getCorrectedText();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Correction output consisting of the corrected keyword string.
     * </pre>
     *
     * <code>string corrected_text = 2;</code>
     *
     * @param value The bytes for correctedText to set.
     * @return This builder for chaining.
     */
    public Builder setCorrectedTextBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      correctedText_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object correctedHtml_ = "";
    /**
     *
     *
     * <pre>
     * Corrected output with html tags to highlight the corrected words.
     * Corrected words are called out with the "&lt;b&gt;&lt;i&gt;...&lt;/i&gt;&lt;/b&gt;" html tags.
     *
     * For example, the user input query is "software enginear", where the second
     * word, "enginear," is incorrect. It should be "engineer". When spelling
     * correction is enabled, this value is
     * "software &lt;b&gt;&lt;i&gt;engineer&lt;/i&gt;&lt;/b&gt;".
     * </pre>
     *
     * <code>string corrected_html = 3;</code>
     *
     * @return The correctedHtml.
     */
    public java.lang.String getCorrectedHtml() {
      java.lang.Object ref = correctedHtml_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        correctedHtml_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Corrected output with html tags to highlight the corrected words.
     * Corrected words are called out with the "&lt;b&gt;&lt;i&gt;...&lt;/i&gt;&lt;/b&gt;" html tags.
     *
     * For example, the user input query is "software enginear", where the second
     * word, "enginear," is incorrect. It should be "engineer". When spelling
     * correction is enabled, this value is
     * "software &lt;b&gt;&lt;i&gt;engineer&lt;/i&gt;&lt;/b&gt;".
     * </pre>
     *
     * <code>string corrected_html = 3;</code>
     *
     * @return The bytes for correctedHtml.
     */
    public com.google.protobuf.ByteString getCorrectedHtmlBytes() {
      java.lang.Object ref = correctedHtml_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        correctedHtml_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Corrected output with html tags to highlight the corrected words.
     * Corrected words are called out with the "&lt;b&gt;&lt;i&gt;...&lt;/i&gt;&lt;/b&gt;" html tags.
     *
     * For example, the user input query is "software enginear", where the second
     * word, "enginear," is incorrect. It should be "engineer". When spelling
     * correction is enabled, this value is
     * "software &lt;b&gt;&lt;i&gt;engineer&lt;/i&gt;&lt;/b&gt;".
     * </pre>
     *
     * <code>string corrected_html = 3;</code>
     *
     * @param value The correctedHtml to set.
     * @return This builder for chaining.
     */
    public Builder setCorrectedHtml(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      correctedHtml_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Corrected output with html tags to highlight the corrected words.
     * Corrected words are called out with the "&lt;b&gt;&lt;i&gt;...&lt;/i&gt;&lt;/b&gt;" html tags.
     *
     * For example, the user input query is "software enginear", where the second
     * word, "enginear," is incorrect. It should be "engineer". When spelling
     * correction is enabled, this value is
     * "software &lt;b&gt;&lt;i&gt;engineer&lt;/i&gt;&lt;/b&gt;".
     * </pre>
     *
     * <code>string corrected_html = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCorrectedHtml() {
      correctedHtml_ = getDefaultInstance().getCorrectedHtml();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Corrected output with html tags to highlight the corrected words.
     * Corrected words are called out with the "&lt;b&gt;&lt;i&gt;...&lt;/i&gt;&lt;/b&gt;" html tags.
     *
     * For example, the user input query is "software enginear", where the second
     * word, "enginear," is incorrect. It should be "engineer". When spelling
     * correction is enabled, this value is
     * "software &lt;b&gt;&lt;i&gt;engineer&lt;/i&gt;&lt;/b&gt;".
     * </pre>
     *
     * <code>string corrected_html = 3;</code>
     *
     * @param value The bytes for correctedHtml to set.
     * @return This builder for chaining.
     */
    public Builder setCorrectedHtmlBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      correctedHtml_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.talent.v4beta1.SpellingCorrection)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.talent.v4beta1.SpellingCorrection)
  private static final com.google.cloud.talent.v4beta1.SpellingCorrection DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.talent.v4beta1.SpellingCorrection();
  }

  public static com.google.cloud.talent.v4beta1.SpellingCorrection getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SpellingCorrection> PARSER =
      new com.google.protobuf.AbstractParser<SpellingCorrection>() {
        @java.lang.Override
        public SpellingCorrection parsePartialFrom(
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

  public static com.google.protobuf.Parser<SpellingCorrection> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SpellingCorrection> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.talent.v4beta1.SpellingCorrection getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
