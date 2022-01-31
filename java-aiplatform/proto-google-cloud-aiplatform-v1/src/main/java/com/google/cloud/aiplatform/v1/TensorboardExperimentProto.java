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
// source: google/cloud/aiplatform/v1/tensorboard_experiment.proto

package com.google.cloud.aiplatform.v1;

public final class TensorboardExperimentProto {
  private TensorboardExperimentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_TensorboardExperiment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_TensorboardExperiment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_TensorboardExperiment_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_TensorboardExperiment_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n7google/cloud/aiplatform/v1/tensorboard"
          + "_experiment.proto\022\032google.cloud.aiplatfo"
          + "rm.v1\032\034google/api/annotations.proto\032\037goo"
          + "gle/api/field_behavior.proto\032\031google/api"
          + "/resource.proto\032\037google/protobuf/timesta"
          + "mp.proto\"\367\003\n\025TensorboardExperiment\022\021\n\004na"
          + "me\030\001 \001(\tB\003\340A\003\022\024\n\014display_name\030\002 \001(\t\022\023\n\013d"
          + "escription\030\003 \001(\t\0224\n\013create_time\030\004 \001(\0132\032."
          + "google.protobuf.TimestampB\003\340A\003\0224\n\013update"
          + "_time\030\005 \001(\0132\032.google.protobuf.TimestampB"
          + "\003\340A\003\022M\n\006labels\030\006 \003(\0132=.google.cloud.aipl"
          + "atform.v1.TensorboardExperiment.LabelsEn"
          + "try\022\014\n\004etag\030\007 \001(\t\022\023\n\006source\030\010 \001(\tB\003\340A\005\032-"
          + "\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001("
          + "\t:\0028\001:\222\001\352A\216\001\n/aiplatform.googleapis.com/"
          + "TensorboardExperiment\022[projects/{project"
          + "}/locations/{location}/tensorboards/{ten"
          + "sorboard}/experiments/{experiment}B\336\001\n\036c"
          + "om.google.cloud.aiplatform.v1B\032Tensorboa"
          + "rdExperimentProtoP\001ZDgoogle.golang.org/g"
          + "enproto/googleapis/cloud/aiplatform/v1;a"
          + "iplatform\252\002\032Google.Cloud.AIPlatform.V1\312\002"
          + "\032Google\\Cloud\\AIPlatform\\V1\352\002\035Google::Cl"
          + "oud::AIPlatform::V1b\006proto3"
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
    internal_static_google_cloud_aiplatform_v1_TensorboardExperiment_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_TensorboardExperiment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_TensorboardExperiment_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "CreateTime",
              "UpdateTime",
              "Labels",
              "Etag",
              "Source",
            });
    internal_static_google_cloud_aiplatform_v1_TensorboardExperiment_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_TensorboardExperiment_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_TensorboardExperiment_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_TensorboardExperiment_LabelsEntry_descriptor,
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
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
