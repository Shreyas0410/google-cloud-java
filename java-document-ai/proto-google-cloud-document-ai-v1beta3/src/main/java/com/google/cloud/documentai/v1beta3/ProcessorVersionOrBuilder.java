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
// source: google/cloud/documentai/v1beta3/processor.proto

package com.google.cloud.documentai.v1beta3;

public interface ProcessorVersionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1beta3.ProcessorVersion)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the processor version.
   * Format:
   * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processor_version}`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The resource name of the processor version.
   * Format:
   * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processor_version}`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The display name of the processor version.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The display name of the processor version.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The schema of the processor version. Describes the output.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.DocumentSchema document_schema = 12;</code>
   *
   * @return Whether the documentSchema field is set.
   */
  boolean hasDocumentSchema();
  /**
   *
   *
   * <pre>
   * The schema of the processor version. Describes the output.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.DocumentSchema document_schema = 12;</code>
   *
   * @return The documentSchema.
   */
  com.google.cloud.documentai.v1beta3.DocumentSchema getDocumentSchema();
  /**
   *
   *
   * <pre>
   * The schema of the processor version. Describes the output.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.DocumentSchema document_schema = 12;</code>
   */
  com.google.cloud.documentai.v1beta3.DocumentSchemaOrBuilder getDocumentSchemaOrBuilder();

  /**
   *
   *
   * <pre>
   * The state of the processor version.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.ProcessorVersion.State state = 6;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * The state of the processor version.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.ProcessorVersion.State state = 6;</code>
   *
   * @return The state.
   */
  com.google.cloud.documentai.v1beta3.ProcessorVersion.State getState();

  /**
   *
   *
   * <pre>
   * The time the processor version was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * The time the processor version was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * The time the processor version was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The most recently invoked evaluation for the processor version.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.EvaluationReference latest_evaluation = 8;</code>
   *
   * @return Whether the latestEvaluation field is set.
   */
  boolean hasLatestEvaluation();
  /**
   *
   *
   * <pre>
   * The most recently invoked evaluation for the processor version.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.EvaluationReference latest_evaluation = 8;</code>
   *
   * @return The latestEvaluation.
   */
  com.google.cloud.documentai.v1beta3.EvaluationReference getLatestEvaluation();
  /**
   *
   *
   * <pre>
   * The most recently invoked evaluation for the processor version.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.EvaluationReference latest_evaluation = 8;</code>
   */
  com.google.cloud.documentai.v1beta3.EvaluationReferenceOrBuilder getLatestEvaluationOrBuilder();

  /**
   *
   *
   * <pre>
   * The KMS key name used for encryption.
   * </pre>
   *
   * <code>string kms_key_name = 9;</code>
   *
   * @return The kmsKeyName.
   */
  java.lang.String getKmsKeyName();
  /**
   *
   *
   * <pre>
   * The KMS key name used for encryption.
   * </pre>
   *
   * <code>string kms_key_name = 9;</code>
   *
   * @return The bytes for kmsKeyName.
   */
  com.google.protobuf.ByteString getKmsKeyNameBytes();

  /**
   *
   *
   * <pre>
   * The KMS key version with which data is encrypted.
   * </pre>
   *
   * <code>string kms_key_version_name = 10;</code>
   *
   * @return The kmsKeyVersionName.
   */
  java.lang.String getKmsKeyVersionName();
  /**
   *
   *
   * <pre>
   * The KMS key version with which data is encrypted.
   * </pre>
   *
   * <code>string kms_key_version_name = 10;</code>
   *
   * @return The bytes for kmsKeyVersionName.
   */
  com.google.protobuf.ByteString getKmsKeyVersionNameBytes();

  /**
   *
   *
   * <pre>
   * Denotes that this `ProcessorVersion` is managed by Google.
   * </pre>
   *
   * <code>bool google_managed = 11;</code>
   *
   * @return The googleManaged.
   */
  boolean getGoogleManaged();

  /**
   *
   *
   * <pre>
   * If set, information about the eventual deprecation of this version.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.ProcessorVersion.DeprecationInfo deprecation_info = 13;
   * </code>
   *
   * @return Whether the deprecationInfo field is set.
   */
  boolean hasDeprecationInfo();
  /**
   *
   *
   * <pre>
   * If set, information about the eventual deprecation of this version.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.ProcessorVersion.DeprecationInfo deprecation_info = 13;
   * </code>
   *
   * @return The deprecationInfo.
   */
  com.google.cloud.documentai.v1beta3.ProcessorVersion.DeprecationInfo getDeprecationInfo();
  /**
   *
   *
   * <pre>
   * If set, information about the eventual deprecation of this version.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.ProcessorVersion.DeprecationInfo deprecation_info = 13;
   * </code>
   */
  com.google.cloud.documentai.v1beta3.ProcessorVersion.DeprecationInfoOrBuilder
      getDeprecationInfoOrBuilder();
}
