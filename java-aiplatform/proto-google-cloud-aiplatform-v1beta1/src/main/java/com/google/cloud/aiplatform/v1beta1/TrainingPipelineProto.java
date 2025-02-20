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
// source: google/cloud/aiplatform/v1beta1/training_pipeline.proto

package com.google.cloud.aiplatform.v1beta1;

public final class TrainingPipelineProto {
  private TrainingPipelineProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_TrainingPipeline_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_TrainingPipeline_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_TrainingPipeline_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_TrainingPipeline_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_InputDataConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_InputDataConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FractionSplit_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FractionSplit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FilterSplit_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FilterSplit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PredefinedSplit_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PredefinedSplit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_TimestampSplit_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_TimestampSplit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_StratifiedSplit_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_StratifiedSplit_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n7google/cloud/aiplatform/v1beta1/traini"
          + "ng_pipeline.proto\022\037google.cloud.aiplatfo"
          + "rm.v1beta1\032\037google/api/field_behavior.pr"
          + "oto\032\031google/api/resource.proto\0325google/c"
          + "loud/aiplatform/v1beta1/encryption_spec."
          + "proto\032(google/cloud/aiplatform/v1beta1/i"
          + "o.proto\032+google/cloud/aiplatform/v1beta1"
          + "/model.proto\0324google/cloud/aiplatform/v1"
          + "beta1/pipeline_state.proto\032\034google/proto"
          + "buf/struct.proto\032\037google/protobuf/timest"
          + "amp.proto\032\027google/rpc/status.proto\"\264\010\n\020T"
          + "rainingPipeline\022\022\n\004name\030\001 \001(\tB\004\342A\001\003\022\032\n\014d"
          + "isplay_name\030\002 \001(\tB\004\342A\001\002\022K\n\021input_data_co"
          + "nfig\030\003 \001(\01320.google.cloud.aiplatform.v1b"
          + "eta1.InputDataConfig\022&\n\030training_task_de"
          + "finition\030\004 \001(\tB\004\342A\001\002\022:\n\024training_task_in"
          + "puts\030\005 \001(\0132\026.google.protobuf.ValueB\004\342A\001\002"
          + "\022<\n\026training_task_metadata\030\006 \001(\0132\026.googl"
          + "e.protobuf.ValueB\004\342A\001\003\022?\n\017model_to_uploa"
          + "d\030\007 \001(\0132&.google.cloud.aiplatform.v1beta"
          + "1.Model\022\026\n\010model_id\030\026 \001(\tB\004\342A\001\001\022\032\n\014paren"
          + "t_model\030\025 \001(\tB\004\342A\001\001\022C\n\005state\030\t \001(\0162..goo"
          + "gle.cloud.aiplatform.v1beta1.PipelineSta"
          + "teB\004\342A\001\003\022\'\n\005error\030\n \001(\0132\022.google.rpc.Sta"
          + "tusB\004\342A\001\003\0225\n\013create_time\030\013 \001(\0132\032.google."
          + "protobuf.TimestampB\004\342A\001\003\0224\n\nstart_time\030\014"
          + " \001(\0132\032.google.protobuf.TimestampB\004\342A\001\003\0222"
          + "\n\010end_time\030\r \001(\0132\032.google.protobuf.Times"
          + "tampB\004\342A\001\003\0225\n\013update_time\030\016 \001(\0132\032.google"
          + ".protobuf.TimestampB\004\342A\001\003\022M\n\006labels\030\017 \003("
          + "\0132=.google.cloud.aiplatform.v1beta1.Trai"
          + "ningPipeline.LabelsEntry\022H\n\017encryption_s"
          + "pec\030\022 \001(\0132/.google.cloud.aiplatform.v1be"
          + "ta1.EncryptionSpec\032-\n\013LabelsEntry\022\013\n\003key"
          + "\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:~\352A{\n*aiplatfo"
          + "rm.googleapis.com/TrainingPipeline\022Mproj"
          + "ects/{project}/locations/{location}/trai"
          + "ningPipelines/{training_pipeline}\"\323\005\n\017In"
          + "putDataConfig\022H\n\016fraction_split\030\002 \001(\0132.."
          + "google.cloud.aiplatform.v1beta1.Fraction"
          + "SplitH\000\022D\n\014filter_split\030\003 \001(\0132,.google.c"
          + "loud.aiplatform.v1beta1.FilterSplitH\000\022L\n"
          + "\020predefined_split\030\004 \001(\01320.google.cloud.a"
          + "iplatform.v1beta1.PredefinedSplitH\000\022J\n\017t"
          + "imestamp_split\030\005 \001(\0132/.google.cloud.aipl"
          + "atform.v1beta1.TimestampSplitH\000\022L\n\020strat"
          + "ified_split\030\014 \001(\01320.google.cloud.aiplatf"
          + "orm.v1beta1.StratifiedSplitH\000\022J\n\017gcs_des"
          + "tination\030\010 \001(\0132/.google.cloud.aiplatform"
          + ".v1beta1.GcsDestinationH\001\022T\n\024bigquery_de"
          + "stination\030\n \001(\01324.google.cloud.aiplatfor"
          + "m.v1beta1.BigQueryDestinationH\001\022\030\n\ndatas"
          + "et_id\030\001 \001(\tB\004\342A\001\002\022\032\n\022annotations_filter\030"
          + "\006 \001(\t\022\035\n\025annotation_schema_uri\030\t \001(\t\022\026\n\016"
          + "saved_query_id\030\007 \001(\t\022!\n\031persist_ml_use_a"
          + "ssignment\030\013 \001(\010B\007\n\005splitB\r\n\013destination\""
          + "^\n\rFractionSplit\022\031\n\021training_fraction\030\001 "
          + "\001(\001\022\033\n\023validation_fraction\030\002 \001(\001\022\025\n\rtest"
          + "_fraction\030\003 \001(\001\"h\n\013FilterSplit\022\035\n\017traini"
          + "ng_filter\030\001 \001(\tB\004\342A\001\002\022\037\n\021validation_filt"
          + "er\030\002 \001(\tB\004\342A\001\002\022\031\n\013test_filter\030\003 \001(\tB\004\342A\001"
          + "\002\"$\n\017PredefinedSplit\022\021\n\003key\030\001 \001(\tB\004\342A\001\002\""
          + "r\n\016TimestampSplit\022\031\n\021training_fraction\030\001"
          + " \001(\001\022\033\n\023validation_fraction\030\002 \001(\001\022\025\n\rtes"
          + "t_fraction\030\003 \001(\001\022\021\n\003key\030\004 \001(\tB\004\342A\001\002\"s\n\017S"
          + "tratifiedSplit\022\031\n\021training_fraction\030\001 \001("
          + "\001\022\033\n\023validation_fraction\030\002 \001(\001\022\025\n\rtest_f"
          + "raction\030\003 \001(\001\022\021\n\003key\030\004 \001(\tB\004\342A\001\002B\354\001\n#com"
          + ".google.cloud.aiplatform.v1beta1B\025Traini"
          + "ngPipelineProtoP\001ZCcloud.google.com/go/a"
          + "iplatform/apiv1beta1/aiplatformpb;aiplat"
          + "formpb\252\002\037Google.Cloud.AIPlatform.V1Beta1"
          + "\312\002\037Google\\Cloud\\AIPlatform\\V1beta1\352\002\"Goo"
          + "gle::Cloud::AIPlatform::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ModelProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.PipelineStateProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_TrainingPipeline_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_TrainingPipeline_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_TrainingPipeline_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "InputDataConfig",
              "TrainingTaskDefinition",
              "TrainingTaskInputs",
              "TrainingTaskMetadata",
              "ModelToUpload",
              "ModelId",
              "ParentModel",
              "State",
              "Error",
              "CreateTime",
              "StartTime",
              "EndTime",
              "UpdateTime",
              "Labels",
              "EncryptionSpec",
            });
    internal_static_google_cloud_aiplatform_v1beta1_TrainingPipeline_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_TrainingPipeline_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_TrainingPipeline_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_TrainingPipeline_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_InputDataConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_InputDataConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_InputDataConfig_descriptor,
            new java.lang.String[] {
              "FractionSplit",
              "FilterSplit",
              "PredefinedSplit",
              "TimestampSplit",
              "StratifiedSplit",
              "GcsDestination",
              "BigqueryDestination",
              "DatasetId",
              "AnnotationsFilter",
              "AnnotationSchemaUri",
              "SavedQueryId",
              "PersistMlUseAssignment",
              "Split",
              "Destination",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FractionSplit_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_FractionSplit_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FractionSplit_descriptor,
            new java.lang.String[] {
              "TrainingFraction", "ValidationFraction", "TestFraction",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FilterSplit_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_FilterSplit_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FilterSplit_descriptor,
            new java.lang.String[] {
              "TrainingFilter", "ValidationFilter", "TestFilter",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PredefinedSplit_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_PredefinedSplit_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PredefinedSplit_descriptor,
            new java.lang.String[] {
              "Key",
            });
    internal_static_google_cloud_aiplatform_v1beta1_TimestampSplit_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_TimestampSplit_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_TimestampSplit_descriptor,
            new java.lang.String[] {
              "TrainingFraction", "ValidationFraction", "TestFraction", "Key",
            });
    internal_static_google_cloud_aiplatform_v1beta1_StratifiedSplit_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1beta1_StratifiedSplit_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_StratifiedSplit_descriptor,
            new java.lang.String[] {
              "TrainingFraction", "ValidationFraction", "TestFraction", "Key",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ModelProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.PipelineStateProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
