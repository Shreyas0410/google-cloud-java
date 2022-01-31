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
// source: google/cloud/aiplatform/v1/model_deployment_monitoring_job.proto

package com.google.cloud.aiplatform.v1;

public final class ModelDeploymentMonitoringJobProto {
  private ModelDeploymentMonitoringJobProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ModelDeploymentMonitoringJob_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelDeploymentMonitoringJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ModelDeploymentMonitoringJob_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelDeploymentMonitoringJob_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ModelDeploymentMonitoringBigQueryTable_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelDeploymentMonitoringBigQueryTable_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ModelDeploymentMonitoringObjectiveConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelDeploymentMonitoringObjectiveConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ModelDeploymentMonitoringScheduleConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelDeploymentMonitoringScheduleConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringStatsAnomalies_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringStatsAnomalies_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringStatsAnomalies_FeatureHistoricStatsAnomalies_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringStatsAnomalies_FeatureHistoricStatsAnomalies_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n@google/cloud/aiplatform/v1/model_deplo"
          + "yment_monitoring_job.proto\022\032google.cloud"
          + ".aiplatform.v1\032\034google/api/annotations.p"
          + "roto\032\037google/api/field_behavior.proto\032\031g"
          + "oogle/api/resource.proto\0320google/cloud/a"
          + "iplatform/v1/encryption_spec.proto\0329goog"
          + "le/cloud/aiplatform/v1/feature_monitorin"
          + "g_stats.proto\032#google/cloud/aiplatform/v"
          + "1/io.proto\032*google/cloud/aiplatform/v1/j"
          + "ob_state.proto\0321google/cloud/aiplatform/"
          + "v1/model_monitoring.proto\032\036google/protob"
          + "uf/duration.proto\032\034google/protobuf/struc"
          + "t.proto\032\037google/protobuf/timestamp.proto"
          + "\032\027google/rpc/status.proto\"\251\016\n\034ModelDeplo"
          + "ymentMonitoringJob\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\031\n"
          + "\014display_name\030\002 \001(\tB\003\340A\002\022<\n\010endpoint\030\003 \001"
          + "(\tB*\340A\002\372A$\n\"aiplatform.googleapis.com/En"
          + "dpoint\0228\n\005state\030\004 \001(\0162$.google.cloud.aip"
          + "latform.v1.JobStateB\003\340A\003\022m\n\016schedule_sta"
          + "te\030\005 \001(\0162P.google.cloud.aiplatform.v1.Mo"
          + "delDeploymentMonitoringJob.MonitoringSch"
          + "eduleStateB\003\340A\003\022\200\001\n-model_deployment_mon"
          + "itoring_objective_configs\030\006 \003(\0132D.google"
          + ".cloud.aiplatform.v1.ModelDeploymentMoni"
          + "toringObjectiveConfigB\003\340A\002\022}\n+model_depl"
          + "oyment_monitoring_schedule_config\030\007 \001(\0132"
          + "C.google.cloud.aiplatform.v1.ModelDeploy"
          + "mentMonitoringScheduleConfigB\003\340A\002\022T\n\031log"
          + "ging_sampling_strategy\030\010 \001(\0132,.google.cl"
          + "oud.aiplatform.v1.SamplingStrategyB\003\340A\002\022"
          + "]\n\035model_monitoring_alert_config\030\017 \001(\01326"
          + ".google.cloud.aiplatform.v1.ModelMonitor"
          + "ingAlertConfig\022#\n\033predict_instance_schem"
          + "a_uri\030\t \001(\t\0227\n\027sample_predict_instance\030\023"
          + " \001(\0132\026.google.protobuf.Value\022$\n\034analysis"
          + "_instance_schema_uri\030\020 \001(\t\022`\n\017bigquery_t"
          + "ables\030\n \003(\0132B.google.cloud.aiplatform.v1"
          + ".ModelDeploymentMonitoringBigQueryTableB"
          + "\003\340A\003\022*\n\007log_ttl\030\021 \001(\0132\031.google.protobuf."
          + "Duration\022T\n\006labels\030\013 \003(\0132D.google.cloud."
          + "aiplatform.v1.ModelDeploymentMonitoringJ"
          + "ob.LabelsEntry\0224\n\013create_time\030\014 \001(\0132\032.go"
          + "ogle.protobuf.TimestampB\003\340A\003\0224\n\013update_t"
          + "ime\030\r \001(\0132\032.google.protobuf.TimestampB\003\340"
          + "A\003\022;\n\022next_schedule_time\030\016 \001(\0132\032.google."
          + "protobuf.TimestampB\003\340A\003\022R\n\036stats_anomali"
          + "es_base_directory\030\024 \001(\0132*.google.cloud.a"
          + "iplatform.v1.GcsDestination\022C\n\017encryptio"
          + "n_spec\030\025 \001(\0132*.google.cloud.aiplatform.v"
          + "1.EncryptionSpec\022\'\n\037enable_monitoring_pi"
          + "peline_logs\030\026 \001(\010\022&\n\005error\030\027 \001(\0132\022.googl"
          + "e.rpc.StatusB\003\340A\003\032-\n\013LabelsEntry\022\013\n\003key\030"
          + "\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"k\n\027MonitoringSc"
          + "heduleState\022)\n%MONITORING_SCHEDULE_STATE"
          + "_UNSPECIFIED\020\000\022\013\n\007PENDING\020\001\022\013\n\007OFFLINE\020\002"
          + "\022\013\n\007RUNNING\020\003:\245\001\352A\241\001\n6aiplatform.googlea"
          + "pis.com/ModelDeploymentMonitoringJob\022gpr"
          + "ojects/{project}/locations/{location}/mo"
          + "delDeploymentMonitoringJobs/{model_deplo"
          + "yment_monitoring_job}\"\210\003\n&ModelDeploymen"
          + "tMonitoringBigQueryTable\022`\n\nlog_source\030\001"
          + " \001(\0162L.google.cloud.aiplatform.v1.ModelD"
          + "eploymentMonitoringBigQueryTable.LogSour"
          + "ce\022\\\n\010log_type\030\002 \001(\0162J.google.cloud.aipl"
          + "atform.v1.ModelDeploymentMonitoringBigQu"
          + "eryTable.LogType\022\033\n\023bigquery_table_path\030"
          + "\003 \001(\t\"B\n\tLogSource\022\032\n\026LOG_SOURCE_UNSPECI"
          + "FIED\020\000\022\014\n\010TRAINING\020\001\022\013\n\007SERVING\020\002\"=\n\007Log"
          + "Type\022\030\n\024LOG_TYPE_UNSPECIFIED\020\000\022\013\n\007PREDIC"
          + "T\020\001\022\013\n\007EXPLAIN\020\002\"\233\001\n(ModelDeploymentMoni"
          + "toringObjectiveConfig\022\031\n\021deployed_model_"
          + "id\030\001 \001(\t\022T\n\020objective_config\030\002 \001(\0132:.goo"
          + "gle.cloud.aiplatform.v1.ModelMonitoringO"
          + "bjectiveConfig\"c\n\'ModelDeploymentMonitor"
          + "ingScheduleConfig\0228\n\020monitor_interval\030\001 "
          + "\001(\0132\031.google.protobuf.DurationB\003\340A\002\"\254\004\n\035"
          + "ModelMonitoringStatsAnomalies\022U\n\tobjecti"
          + "ve\030\001 \001(\0162B.google.cloud.aiplatform.v1.Mo"
          + "delDeploymentMonitoringObjectiveType\022\031\n\021"
          + "deployed_model_id\030\002 \001(\t\022\025\n\ranomaly_count"
          + "\030\003 \001(\005\022n\n\rfeature_stats\030\004 \003(\0132W.google.c"
          + "loud.aiplatform.v1.ModelMonitoringStatsA"
          + "nomalies.FeatureHistoricStatsAnomalies\032\221"
          + "\002\n\035FeatureHistoricStatsAnomalies\022\034\n\024feat"
          + "ure_display_name\030\001 \001(\t\022>\n\tthreshold\030\003 \001("
          + "\0132+.google.cloud.aiplatform.v1.Threshold"
          + "Config\022G\n\016training_stats\030\004 \001(\0132/.google."
          + "cloud.aiplatform.v1.FeatureStatsAnomaly\022"
          + "I\n\020prediction_stats\030\005 \003(\0132/.google.cloud"
          + ".aiplatform.v1.FeatureStatsAnomaly*\316\001\n&M"
          + "odelDeploymentMonitoringObjectiveType\022:\n"
          + "6MODEL_DEPLOYMENT_MONITORING_OBJECTIVE_T"
          + "YPE_UNSPECIFIED\020\000\022\024\n\020RAW_FEATURE_SKEW\020\001\022"
          + "\025\n\021RAW_FEATURE_DRIFT\020\002\022\034\n\030FEATURE_ATTRIB"
          + "UTION_SKEW\020\003\022\035\n\031FEATURE_ATTRIBUTION_DRIF"
          + "T\020\004B\345\001\n\036com.google.cloud.aiplatform.v1B!"
          + "ModelDeploymentMonitoringJobProtoP\001ZDgoo"
          + "gle.golang.org/genproto/googleapis/cloud"
          + "/aiplatform/v1;aiplatform\252\002\032Google.Cloud"
          + ".AIPlatform.V1\312\002\032Google\\Cloud\\AIPlatform"
          + "\\V1\352\002\035Google::Cloud::AIPlatform::V1b\006pro"
          + "to3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.FeatureMonitoringStatsProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.IoProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.JobStateProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.ModelMonitoringProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_ModelDeploymentMonitoringJob_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_ModelDeploymentMonitoringJob_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ModelDeploymentMonitoringJob_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Endpoint",
              "State",
              "ScheduleState",
              "ModelDeploymentMonitoringObjectiveConfigs",
              "ModelDeploymentMonitoringScheduleConfig",
              "LoggingSamplingStrategy",
              "ModelMonitoringAlertConfig",
              "PredictInstanceSchemaUri",
              "SamplePredictInstance",
              "AnalysisInstanceSchemaUri",
              "BigqueryTables",
              "LogTtl",
              "Labels",
              "CreateTime",
              "UpdateTime",
              "NextScheduleTime",
              "StatsAnomaliesBaseDirectory",
              "EncryptionSpec",
              "EnableMonitoringPipelineLogs",
              "Error",
            });
    internal_static_google_cloud_aiplatform_v1_ModelDeploymentMonitoringJob_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_ModelDeploymentMonitoringJob_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_ModelDeploymentMonitoringJob_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ModelDeploymentMonitoringJob_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_ModelDeploymentMonitoringBigQueryTable_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_ModelDeploymentMonitoringBigQueryTable_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ModelDeploymentMonitoringBigQueryTable_descriptor,
            new java.lang.String[] {
              "LogSource", "LogType", "BigqueryTablePath",
            });
    internal_static_google_cloud_aiplatform_v1_ModelDeploymentMonitoringObjectiveConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_ModelDeploymentMonitoringObjectiveConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ModelDeploymentMonitoringObjectiveConfig_descriptor,
            new java.lang.String[] {
              "DeployedModelId", "ObjectiveConfig",
            });
    internal_static_google_cloud_aiplatform_v1_ModelDeploymentMonitoringScheduleConfig_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_ModelDeploymentMonitoringScheduleConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ModelDeploymentMonitoringScheduleConfig_descriptor,
            new java.lang.String[] {
              "MonitorInterval",
            });
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringStatsAnomalies_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringStatsAnomalies_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ModelMonitoringStatsAnomalies_descriptor,
            new java.lang.String[] {
              "Objective", "DeployedModelId", "AnomalyCount", "FeatureStats",
            });
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringStatsAnomalies_FeatureHistoricStatsAnomalies_descriptor =
        internal_static_google_cloud_aiplatform_v1_ModelMonitoringStatsAnomalies_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringStatsAnomalies_FeatureHistoricStatsAnomalies_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ModelMonitoringStatsAnomalies_FeatureHistoricStatsAnomalies_descriptor,
            new java.lang.String[] {
              "FeatureDisplayName", "Threshold", "TrainingStats", "PredictionStats",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1.FeatureMonitoringStatsProto.getDescriptor();
    com.google.cloud.aiplatform.v1.IoProto.getDescriptor();
    com.google.cloud.aiplatform.v1.JobStateProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ModelMonitoringProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
