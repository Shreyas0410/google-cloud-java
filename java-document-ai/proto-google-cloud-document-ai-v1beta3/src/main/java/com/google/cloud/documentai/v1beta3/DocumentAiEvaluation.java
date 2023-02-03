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
// source: google/cloud/documentai/v1beta3/evaluation.proto

package com.google.cloud.documentai.v1beta3;

public final class DocumentAiEvaluation {
  private DocumentAiEvaluation() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_Evaluation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_Evaluation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_Evaluation_Counters_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_Evaluation_Counters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_Evaluation_Metrics_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_Evaluation_Metrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_Evaluation_ConfidenceLevelMetrics_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_Evaluation_ConfidenceLevelMetrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_Evaluation_MultiConfidenceMetrics_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_Evaluation_MultiConfidenceMetrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_Evaluation_EntityMetricsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_Evaluation_EntityMetricsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/documentai/v1beta3/evalua"
          + "tion.proto\022\037google.cloud.documentai.v1be"
          + "ta3\032\031google/api/resource.proto\032\037google/p"
          + "rotobuf/timestamp.proto\"\215\016\n\nEvaluation\022\014"
          + "\n\004name\030\001 \001(\t\022/\n\013create_time\030\002 \001(\0132\032.goog"
          + "le.protobuf.Timestamp\022O\n\021document_counte"
          + "rs\030\005 \001(\01324.google.cloud.documentai.v1bet"
          + "a3.Evaluation.Counters\022`\n\024all_entities_m"
          + "etrics\030\003 \001(\0132B.google.cloud.documentai.v"
          + "1beta3.Evaluation.MultiConfidenceMetrics"
          + "\022V\n\016entity_metrics\030\004 \003(\0132>.google.cloud."
          + "documentai.v1beta3.Evaluation.EntityMetr"
          + "icsEntry\022\024\n\014kms_key_name\030\006 \001(\t\022\034\n\024kms_ke"
          + "y_version_name\030\007 \001(\t\032\215\001\n\010Counters\022\035\n\025inp"
          + "ut_documents_count\030\001 \001(\005\022\037\n\027invalid_docu"
          + "ments_count\030\002 \001(\005\022\036\n\026failed_documents_co"
          + "unt\030\003 \001(\005\022!\n\031evaluated_documents_count\030\004"
          + " \001(\005\032\315\002\n\007Metrics\022\021\n\tprecision\030\001 \001(\002\022\016\n\006r"
          + "ecall\030\002 \001(\002\022\020\n\010f1_score\030\003 \001(\002\022#\n\033predict"
          + "ed_occurrences_count\030\004 \001(\005\022&\n\036ground_tru"
          + "th_occurrences_count\030\005 \001(\005\022 \n\030predicted_"
          + "document_count\030\n \001(\005\022#\n\033ground_truth_doc"
          + "ument_count\030\013 \001(\005\022\034\n\024true_positives_coun"
          + "t\030\006 \001(\005\022\035\n\025false_positives_count\030\007 \001(\005\022\035"
          + "\n\025false_negatives_count\030\010 \001(\005\022\035\n\025total_d"
          + "ocuments_count\030\t \001(\005\032x\n\026ConfidenceLevelM"
          + "etrics\022\030\n\020confidence_level\030\001 \001(\002\022D\n\007metr"
          + "ics\030\002 \001(\01323.google.cloud.documentai.v1be"
          + "ta3.Evaluation.Metrics\032\200\004\n\026MultiConfiden"
          + "ceMetrics\022d\n\030confidence_level_metrics\030\001 "
          + "\003(\0132B.google.cloud.documentai.v1beta3.Ev"
          + "aluation.ConfidenceLevelMetrics\022j\n\036confi"
          + "dence_level_metrics_exact\030\004 \003(\0132B.google"
          + ".cloud.documentai.v1beta3.Evaluation.Con"
          + "fidenceLevelMetrics\022\r\n\005auprc\030\002 \001(\002\022#\n\033es"
          + "timated_calibration_error\030\003 \001(\002\022\023\n\013auprc"
          + "_exact\030\005 \001(\002\022)\n!estimated_calibration_er"
          + "ror_exact\030\006 \001(\002\022d\n\014metrics_type\030\007 \001(\0162N."
          + "google.cloud.documentai.v1beta3.Evaluati"
          + "on.MultiConfidenceMetrics.MetricsType\":\n"
          + "\013MetricsType\022\034\n\030METRICS_TYPE_UNSPECIFIED"
          + "\020\000\022\r\n\tAGGREGATE\020\001\032x\n\022EntityMetricsEntry\022"
          + "\013\n\003key\030\001 \001(\t\022Q\n\005value\030\002 \001(\0132B.google.clo"
          + "ud.documentai.v1beta3.Evaluation.MultiCo"
          + "nfidenceMetrics:\0028\001:\251\001\352A\245\001\n$documentai.g"
          + "oogleapis.com/Evaluation\022}projects/{proj"
          + "ect}/locations/{location}/processors/{pr"
          + "ocessor}/processorVersions/{processor_ve"
          + "rsion}/evaluations/{evaluation}B\353\001\n#com."
          + "google.cloud.documentai.v1beta3B\024Documen"
          + "tAiEvaluationP\001ZCcloud.google.com/go/doc"
          + "umentai/apiv1beta3/documentaipb;document"
          + "aipb\252\002\037Google.Cloud.DocumentAI.V1Beta3\312\002"
          + "\037Google\\Cloud\\DocumentAI\\V1beta3\352\002\"Googl"
          + "e::Cloud::DocumentAI::V1beta3b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_documentai_v1beta3_Evaluation_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_documentai_v1beta3_Evaluation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_Evaluation_descriptor,
            new java.lang.String[] {
              "Name",
              "CreateTime",
              "DocumentCounters",
              "AllEntitiesMetrics",
              "EntityMetrics",
              "KmsKeyName",
              "KmsKeyVersionName",
            });
    internal_static_google_cloud_documentai_v1beta3_Evaluation_Counters_descriptor =
        internal_static_google_cloud_documentai_v1beta3_Evaluation_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_documentai_v1beta3_Evaluation_Counters_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_Evaluation_Counters_descriptor,
            new java.lang.String[] {
              "InputDocumentsCount",
              "InvalidDocumentsCount",
              "FailedDocumentsCount",
              "EvaluatedDocumentsCount",
            });
    internal_static_google_cloud_documentai_v1beta3_Evaluation_Metrics_descriptor =
        internal_static_google_cloud_documentai_v1beta3_Evaluation_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_documentai_v1beta3_Evaluation_Metrics_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_Evaluation_Metrics_descriptor,
            new java.lang.String[] {
              "Precision",
              "Recall",
              "F1Score",
              "PredictedOccurrencesCount",
              "GroundTruthOccurrencesCount",
              "PredictedDocumentCount",
              "GroundTruthDocumentCount",
              "TruePositivesCount",
              "FalsePositivesCount",
              "FalseNegativesCount",
              "TotalDocumentsCount",
            });
    internal_static_google_cloud_documentai_v1beta3_Evaluation_ConfidenceLevelMetrics_descriptor =
        internal_static_google_cloud_documentai_v1beta3_Evaluation_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_documentai_v1beta3_Evaluation_ConfidenceLevelMetrics_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_Evaluation_ConfidenceLevelMetrics_descriptor,
            new java.lang.String[] {
              "ConfidenceLevel", "Metrics",
            });
    internal_static_google_cloud_documentai_v1beta3_Evaluation_MultiConfidenceMetrics_descriptor =
        internal_static_google_cloud_documentai_v1beta3_Evaluation_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_documentai_v1beta3_Evaluation_MultiConfidenceMetrics_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_Evaluation_MultiConfidenceMetrics_descriptor,
            new java.lang.String[] {
              "ConfidenceLevelMetrics",
              "ConfidenceLevelMetricsExact",
              "Auprc",
              "EstimatedCalibrationError",
              "AuprcExact",
              "EstimatedCalibrationErrorExact",
              "MetricsType",
            });
    internal_static_google_cloud_documentai_v1beta3_Evaluation_EntityMetricsEntry_descriptor =
        internal_static_google_cloud_documentai_v1beta3_Evaluation_descriptor
            .getNestedTypes()
            .get(4);
    internal_static_google_cloud_documentai_v1beta3_Evaluation_EntityMetricsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_Evaluation_EntityMetricsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
