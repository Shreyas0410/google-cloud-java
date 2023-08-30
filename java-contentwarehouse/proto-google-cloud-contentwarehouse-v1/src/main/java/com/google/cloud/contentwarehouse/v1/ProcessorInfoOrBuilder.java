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
// source: google/cloud/contentwarehouse/v1/pipelines.proto

package com.google.cloud.contentwarehouse.v1;

public interface ProcessorInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.ProcessorInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The processor resource name.
   * Format is `projects/{project}/locations/{location}/processors/{processor}`,
   * or
   * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processorVersion}`
   * </pre>
   *
   * <code>string processor_name = 1;</code>
   *
   * @return The processorName.
   */
  java.lang.String getProcessorName();
  /**
   *
   *
   * <pre>
   * The processor resource name.
   * Format is `projects/{project}/locations/{location}/processors/{processor}`,
   * or
   * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processorVersion}`
   * </pre>
   *
   * <code>string processor_name = 1;</code>
   *
   * @return The bytes for processorName.
   */
  com.google.protobuf.ByteString getProcessorNameBytes();

  /**
   *
   *
   * <pre>
   * The processor will process the documents with this document type.
   * </pre>
   *
   * <code>string document_type = 2;</code>
   *
   * @return The documentType.
   */
  java.lang.String getDocumentType();
  /**
   *
   *
   * <pre>
   * The processor will process the documents with this document type.
   * </pre>
   *
   * <code>string document_type = 2;</code>
   *
   * @return The bytes for documentType.
   */
  com.google.protobuf.ByteString getDocumentTypeBytes();

  /**
   *
   *
   * <pre>
   * The Document schema resource name. All documents processed by this
   * processor will use this schema.
   * Format:
   * projects/{project_number}/locations/{location}/documentSchemas/{document_schema_id}.
   * </pre>
   *
   * <code>string schema_name = 3;</code>
   *
   * @return The schemaName.
   */
  java.lang.String getSchemaName();
  /**
   *
   *
   * <pre>
   * The Document schema resource name. All documents processed by this
   * processor will use this schema.
   * Format:
   * projects/{project_number}/locations/{location}/documentSchemas/{document_schema_id}.
   * </pre>
   *
   * <code>string schema_name = 3;</code>
   *
   * @return The bytes for schemaName.
   */
  com.google.protobuf.ByteString getSchemaNameBytes();
}
