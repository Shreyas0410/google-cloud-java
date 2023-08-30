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
// source: google/cloud/contentwarehouse/v1/pipeline_service.proto

package com.google.cloud.contentwarehouse.v1;

public final class PipelineServiceProto {
  private PipelineServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_RunPipelineRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_RunPipelineRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n7google/cloud/contentwarehouse/v1/pipel"
          + "ine_service.proto\022 google.cloud.contentw"
          + "arehouse.v1\032\034google/api/annotations.prot"
          + "o\032\027google/api/client.proto\032\037google/api/f"
          + "ield_behavior.proto\032\031google/api/resource"
          + ".proto\032-google/cloud/contentwarehouse/v1"
          + "/common.proto\0320google/cloud/contentwareh"
          + "ouse/v1/pipelines.proto\032#google/longrunn"
          + "ing/operations.proto\"\272\004\n\022RunPipelineRequ"
          + "est\022?\n\004name\030\001 \001(\tB1\342A\001\002\372A*\n(contentwareh"
          + "ouse.googleapis.com/Location\022R\n\023gcs_inge"
          + "st_pipeline\030\002 \001(\01323.google.cloud.content"
          + "warehouse.v1.GcsIngestPipelineH\000\022|\n*gcs_"
          + "ingest_with_doc_ai_processors_pipeline\030\003"
          + " \001(\0132F.google.cloud.contentwarehouse.v1."
          + "GcsIngestWithDocAiProcessorsPipelineH\000\022T"
          + "\n\023export_cdw_pipeline\030\004 \001(\01325.google.clo"
          + "ud.contentwarehouse.v1.ExportToCdwPipeli"
          + "neH\000\022b\n\034process_with_doc_ai_pipeline\030\005 \001"
          + "(\0132:.google.cloud.contentwarehouse.v1.Pr"
          + "ocessWithDocAiPipelineH\000\022K\n\020request_meta"
          + "data\030\006 \001(\01321.google.cloud.contentwarehou"
          + "se.v1.RequestMetadataB\n\n\010pipeline2\271\002\n\017Pi"
          + "pelineService\022\320\001\n\013RunPipeline\0224.google.c"
          + "loud.contentwarehouse.v1.RunPipelineRequ"
          + "est\032\035.google.longrunning.Operation\"l\312A*\n"
          + "\023RunPipelineResponse\022\023RunPipelineMetadat"
          + "a\332A\004name\202\323\344\223\0022\"-/v1/{name=projects/*/loc"
          + "ations/*}:runPipeline:\001*\032S\312A\037contentware"
          + "house.googleapis.com\322A.https://www.googl"
          + "eapis.com/auth/cloud-platformB\374\001\n$com.go"
          + "ogle.cloud.contentwarehouse.v1B\024Pipeline"
          + "ServiceProtoP\001ZPcloud.google.com/go/cont"
          + "entwarehouse/apiv1/contentwarehousepb;co"
          + "ntentwarehousepb\252\002 Google.Cloud.ContentW"
          + "arehouse.V1\312\002 Google\\Cloud\\ContentWareho"
          + "use\\V1\352\002#Google::Cloud::ContentWarehouse"
          + "::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.contentwarehouse.v1.CommonProto.getDescriptor(),
              com.google.cloud.contentwarehouse.v1.PipelinesProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
            });
    internal_static_google_cloud_contentwarehouse_v1_RunPipelineRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_contentwarehouse_v1_RunPipelineRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_RunPipelineRequest_descriptor,
            new java.lang.String[] {
              "Name",
              "GcsIngestPipeline",
              "GcsIngestWithDocAiProcessorsPipeline",
              "ExportCdwPipeline",
              "ProcessWithDocAiPipeline",
              "RequestMetadata",
              "Pipeline",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.contentwarehouse.v1.CommonProto.getDescriptor();
    com.google.cloud.contentwarehouse.v1.PipelinesProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
