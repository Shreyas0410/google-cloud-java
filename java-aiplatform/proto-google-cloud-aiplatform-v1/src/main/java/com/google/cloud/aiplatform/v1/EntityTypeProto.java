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
// source: google/cloud/aiplatform/v1/entity_type.proto

package com.google.cloud.aiplatform.v1;

public final class EntityTypeProto {
  private EntityTypeProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_EntityType_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_EntityType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_EntityType_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_EntityType_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/aiplatform/v1/entity_type"
          + ".proto\022\032google.cloud.aiplatform.v1\032\037goog"
          + "le/api/field_behavior.proto\032\031google/api/"
          + "resource.proto\0328google/cloud/aiplatform/"
          + "v1/featurestore_monitoring.proto\032\037google"
          + "/protobuf/timestamp.proto\"\306\004\n\nEntityType"
          + "\022\022\n\004name\030\001 \001(\tB\004\342A\001\005\022\031\n\013description\030\002 \001("
          + "\tB\004\342A\001\001\0225\n\013create_time\030\003 \001(\0132\032.google.pr"
          + "otobuf.TimestampB\004\342A\001\003\0225\n\013update_time\030\004 "
          + "\001(\0132\032.google.protobuf.TimestampB\004\342A\001\003\022H\n"
          + "\006labels\030\006 \003(\01322.google.cloud.aiplatform."
          + "v1.EntityType.LabelsEntryB\004\342A\001\001\022\022\n\004etag\030"
          + "\007 \001(\tB\004\342A\001\001\022Y\n\021monitoring_config\030\010 \001(\01328"
          + ".google.cloud.aiplatform.v1.Featurestore"
          + "MonitoringConfigB\004\342A\001\001\022&\n\030offline_storag"
          + "e_ttl_days\030\n \001(\005B\004\342A\001\001\032-\n\013LabelsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:\212\001\352A\206\001\n$ai"
          + "platform.googleapis.com/EntityType\022^proj"
          + "ects/{project}/locations/{location}/feat"
          + "urestores/{featurestore}/entityTypes/{en"
          + "tity_type}B\315\001\n\036com.google.cloud.aiplatfo"
          + "rm.v1B\017EntityTypeProtoP\001Z>cloud.google.c"
          + "om/go/aiplatform/apiv1/aiplatformpb;aipl"
          + "atformpb\252\002\032Google.Cloud.AIPlatform.V1\312\002\032"
          + "Google\\Cloud\\AIPlatform\\V1\352\002\035Google::Clo"
          + "ud::AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.FeaturestoreMonitoringProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_EntityType_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_EntityType_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_EntityType_descriptor,
            new java.lang.String[] {
              "Name",
              "Description",
              "CreateTime",
              "UpdateTime",
              "Labels",
              "Etag",
              "MonitoringConfig",
              "OfflineStorageTtlDays",
            });
    internal_static_google_cloud_aiplatform_v1_EntityType_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_EntityType_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_EntityType_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_EntityType_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.FeaturestoreMonitoringProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
