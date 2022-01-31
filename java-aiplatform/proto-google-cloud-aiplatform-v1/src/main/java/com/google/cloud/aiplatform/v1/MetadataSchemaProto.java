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
// source: google/cloud/aiplatform/v1/metadata_schema.proto

package com.google.cloud.aiplatform.v1;

public final class MetadataSchemaProto {
  private MetadataSchemaProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_MetadataSchema_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_MetadataSchema_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/aiplatform/v1/metadata_sc"
          + "hema.proto\022\032google.cloud.aiplatform.v1\032\034"
          + "google/api/annotations.proto\032\037google/api"
          + "/field_behavior.proto\032\031google/api/resour"
          + "ce.proto\032\037google/protobuf/timestamp.prot"
          + "o\"\200\004\n\016MetadataSchema\022\021\n\004name\030\001 \001(\tB\003\340A\003\022"
          + "\026\n\016schema_version\030\002 \001(\t\022\023\n\006schema\030\003 \001(\tB"
          + "\003\340A\002\022R\n\013schema_type\030\004 \001(\0162=.google.cloud"
          + ".aiplatform.v1.MetadataSchema.MetadataSc"
          + "hemaType\0224\n\013create_time\030\005 \001(\0132\032.google.p"
          + "rotobuf.TimestampB\003\340A\003\022\023\n\013description\030\006 "
          + "\001(\t\"s\n\022MetadataSchemaType\022$\n METADATA_SC"
          + "HEMA_TYPE_UNSPECIFIED\020\000\022\021\n\rARTIFACT_TYPE"
          + "\020\001\022\022\n\016EXECUTION_TYPE\020\002\022\020\n\014CONTEXT_TYPE\020\003"
          + ":\231\001\352A\225\001\n(aiplatform.googleapis.com/Metad"
          + "ataSchema\022iprojects/{project}/locations/"
          + "{location}/metadataStores/{metadata_stor"
          + "e}/metadataSchemas/{metadata_schema}B\327\001\n"
          + "\036com.google.cloud.aiplatform.v1B\023Metadat"
          + "aSchemaProtoP\001ZDgoogle.golang.org/genpro"
          + "to/googleapis/cloud/aiplatform/v1;aiplat"
          + "form\252\002\032Google.Cloud.AIPlatform.V1\312\002\032Goog"
          + "le\\Cloud\\AIPlatform\\V1\352\002\035Google::Cloud::"
          + "AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_MetadataSchema_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_MetadataSchema_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_MetadataSchema_descriptor,
            new java.lang.String[] {
              "Name", "SchemaVersion", "Schema", "SchemaType", "CreateTime", "Description",
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
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
