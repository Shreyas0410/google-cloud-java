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
// source: google/cloud/aiplatform/v1/execution.proto

package com.google.cloud.aiplatform.v1;

public final class ExecutionProto {
  private ExecutionProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Execution_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Execution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Execution_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Execution_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n*google/cloud/aiplatform/v1/execution.p"
          + "roto\022\032google.cloud.aiplatform.v1\032\034google"
          + "/api/annotations.proto\032\037google/api/field"
          + "_behavior.proto\032\031google/api/resource.pro"
          + "to\032&google/cloud/aiplatform/v1/value.pro"
          + "to\032\034google/protobuf/struct.proto\032\037google"
          + "/protobuf/timestamp.proto\"\301\005\n\tExecution\022"
          + "\021\n\004name\030\001 \001(\tB\003\340A\003\022\024\n\014display_name\030\002 \001(\t"
          + "\022:\n\005state\030\006 \001(\0162+.google.cloud.aiplatfor"
          + "m.v1.Execution.State\022\014\n\004etag\030\t \001(\t\022A\n\006la"
          + "bels\030\n \003(\01321.google.cloud.aiplatform.v1."
          + "Execution.LabelsEntry\0224\n\013create_time\030\013 \001"
          + "(\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n\013u"
          + "pdate_time\030\014 \001(\0132\032.google.protobuf.Times"
          + "tampB\003\340A\003\022\024\n\014schema_title\030\r \001(\t\022\026\n\016schem"
          + "a_version\030\016 \001(\t\022)\n\010metadata\030\017 \001(\0132\027.goog"
          + "le.protobuf.Struct\022\023\n\013description\030\020 \001(\t\032"
          + "-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001"
          + "(\t:\0028\001\"i\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\007"
          + "\n\003NEW\020\001\022\013\n\007RUNNING\020\002\022\014\n\010COMPLETE\020\003\022\n\n\006FA"
          + "ILED\020\004\022\n\n\006CACHED\020\005\022\r\n\tCANCELLED\020\006:\211\001\352A\205\001"
          + "\n#aiplatform.googleapis.com/Execution\022^p"
          + "rojects/{project}/locations/{location}/m"
          + "etadataStores/{metadata_store}/execution"
          + "s/{execution}B\322\001\n\036com.google.cloud.aipla"
          + "tform.v1B\016ExecutionProtoP\001ZDgoogle.golan"
          + "g.org/genproto/googleapis/cloud/aiplatfo"
          + "rm/v1;aiplatform\252\002\032Google.Cloud.AIPlatfo"
          + "rm.V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Goo"
          + "gle::Cloud::AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.ValueProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_Execution_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Execution_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Execution_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "State",
              "Etag",
              "Labels",
              "CreateTime",
              "UpdateTime",
              "SchemaTitle",
              "SchemaVersion",
              "Metadata",
              "Description",
            });
    internal_static_google_cloud_aiplatform_v1_Execution_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_Execution_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Execution_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Execution_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ValueProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
