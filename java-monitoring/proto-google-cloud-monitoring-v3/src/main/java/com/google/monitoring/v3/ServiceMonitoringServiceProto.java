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
// source: google/monitoring/v3/service_service.proto

package com.google.monitoring.v3;

public final class ServiceMonitoringServiceProto {
  private ServiceMonitoringServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_CreateServiceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_CreateServiceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_GetServiceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_GetServiceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListServicesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListServicesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListServicesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListServicesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_UpdateServiceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_UpdateServiceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_DeleteServiceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_DeleteServiceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_CreateServiceLevelObjectiveRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_CreateServiceLevelObjectiveRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_GetServiceLevelObjectiveRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_GetServiceLevelObjectiveRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListServiceLevelObjectivesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListServiceLevelObjectivesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListServiceLevelObjectivesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListServiceLevelObjectivesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_UpdateServiceLevelObjectiveRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_UpdateServiceLevelObjectiveRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_DeleteServiceLevelObjectiveRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_DeleteServiceLevelObjectiveRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n*google/monitoring/v3/service_service.p"
          + "roto\022\024google.monitoring.v3\032\034google/api/a"
          + "nnotations.proto\032\027google/api/client.prot"
          + "o\032\037google/api/field_behavior.proto\032#goog"
          + "le/api/monitored_resource.proto\032\031google/"
          + "api/resource.proto\032\"google/monitoring/v3"
          + "/service.proto\032\033google/protobuf/empty.pr"
          + "oto\032 google/protobuf/field_mask.proto\"\232\001"
          + "\n\024CreateServiceRequest\0229\n\006parent\030\001 \001(\tB)"
          + "\340A\002\372A#\022!monitoring.googleapis.com/Servic"
          + "e\022\022\n\nservice_id\030\003 \001(\t\0223\n\007service\030\002 \001(\0132\035"
          + ".google.monitoring.v3.ServiceB\003\340A\002\"L\n\021Ge"
          + "tServiceRequest\0227\n\004name\030\001 \001(\tB)\340A\002\372A#\n!m"
          + "onitoring.googleapis.com/Service\"\207\001\n\023Lis"
          + "tServicesRequest\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#"
          + "\022!monitoring.googleapis.com/Service\022\016\n\006f"
          + "ilter\030\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005\022\022\n\npage_t"
          + "oken\030\004 \001(\t\"`\n\024ListServicesResponse\022/\n\010se"
          + "rvices\030\001 \003(\0132\035.google.monitoring.v3.Serv"
          + "ice\022\027\n\017next_page_token\030\002 \001(\t\"|\n\024UpdateSe"
          + "rviceRequest\0223\n\007service\030\001 \001(\0132\035.google.m"
          + "onitoring.v3.ServiceB\003\340A\002\022/\n\013update_mask"
          + "\030\002 \001(\0132\032.google.protobuf.FieldMask\"O\n\024De"
          + "leteServiceRequest\0227\n\004name\030\001 \001(\tB)\340A\002\372A#"
          + "\n!monitoring.googleapis.com/Service\"\326\001\n\""
          + "CreateServiceLevelObjectiveRequest\0229\n\006pa"
          + "rent\030\001 \001(\tB)\340A\002\372A#\n!monitoring.googleapi"
          + "s.com/Service\022\"\n\032service_level_objective"
          + "_id\030\003 \001(\t\022Q\n\027service_level_objective\030\002 \001"
          + "(\0132+.google.monitoring.v3.ServiceLevelOb"
          + "jectiveB\003\340A\002\"\250\001\n\037GetServiceLevelObjectiv"
          + "eRequest\022E\n\004name\030\001 \001(\tB7\340A\002\372A1\n/monitori"
          + "ng.googleapis.com/ServiceLevelObjective\022"
          + ">\n\004view\030\002 \001(\01620.google.monitoring.v3.Ser"
          + "viceLevelObjective.View\"\325\001\n!ListServiceL"
          + "evelObjectivesRequest\0229\n\006parent\030\001 \001(\tB)\340"
          + "A\002\372A#\n!monitoring.googleapis.com/Service"
          + "\022\016\n\006filter\030\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005\022\022\n\np"
          + "age_token\030\004 \001(\t\022>\n\004view\030\005 \001(\01620.google.m"
          + "onitoring.v3.ServiceLevelObjective.View\""
          + "\214\001\n\"ListServiceLevelObjectivesResponse\022M"
          + "\n\030service_level_objectives\030\001 \003(\0132+.googl"
          + "e.monitoring.v3.ServiceLevelObjective\022\027\n"
          + "\017next_page_token\030\002 \001(\t\"\250\001\n\"UpdateService"
          + "LevelObjectiveRequest\022Q\n\027service_level_o"
          + "bjective\030\001 \001(\0132+.google.monitoring.v3.Se"
          + "rviceLevelObjectiveB\003\340A\002\022/\n\013update_mask\030"
          + "\002 \001(\0132\032.google.protobuf.FieldMask\"k\n\"Del"
          + "eteServiceLevelObjectiveRequest\022E\n\004name\030"
          + "\001 \001(\tB7\340A\002\372A1\n/monitoring.googleapis.com"
          + "/ServiceLevelObjective2\352\017\n\030ServiceMonito"
          + "ringService\022\227\001\n\rCreateService\022*.google.m"
          + "onitoring.v3.CreateServiceRequest\032\035.goog"
          + "le.monitoring.v3.Service\";\202\323\344\223\002$\"\031/v3/{p"
          + "arent=*/*}/services:\007service\332A\016parent,se"
          + "rvice\022~\n\nGetService\022\'.google.monitoring."
          + "v3.GetServiceRequest\032\035.google.monitoring"
          + ".v3.Service\"(\202\323\344\223\002\033\022\031/v3/{name=*/*/servi"
          + "ces/*}\332A\004name\022\221\001\n\014ListServices\022).google."
          + "monitoring.v3.ListServicesRequest\032*.goog"
          + "le.monitoring.v3.ListServicesResponse\"*\202"
          + "\323\344\223\002\033\022\031/v3/{parent=*/*}/services\332A\006paren"
          + "t\022\230\001\n\rUpdateService\022*.google.monitoring."
          + "v3.UpdateServiceRequest\032\035.google.monitor"
          + "ing.v3.Service\"<\202\323\344\223\002,2!/v3/{service.nam"
          + "e=*/*/services/*}:\007service\332A\007service\022}\n\r"
          + "DeleteService\022*.google.monitoring.v3.Del"
          + "eteServiceRequest\032\026.google.protobuf.Empt"
          + "y\"(\202\323\344\223\002\033*\031/v3/{name=*/*/services/*}\332A\004n"
          + "ame\022\372\001\n\033CreateServiceLevelObjective\0228.go"
          + "ogle.monitoring.v3.CreateServiceLevelObj"
          + "ectiveRequest\032+.google.monitoring.v3.Ser"
          + "viceLevelObjective\"t\202\323\344\223\002M\"2/v3/{parent="
          + "*/*/services/*}/serviceLevelObjectives:\027"
          + "service_level_objective\332A\036parent,service"
          + "_level_objective\022\301\001\n\030GetServiceLevelObje"
          + "ctive\0225.google.monitoring.v3.GetServiceL"
          + "evelObjectiveRequest\032+.google.monitoring"
          + ".v3.ServiceLevelObjective\"A\202\323\344\223\0024\0222/v3/{"
          + "name=*/*/services/*/serviceLevelObjectiv"
          + "es/*}\332A\004name\022\324\001\n\032ListServiceLevelObjecti"
          + "ves\0227.google.monitoring.v3.ListServiceLe"
          + "velObjectivesRequest\0328.google.monitoring"
          + ".v3.ListServiceLevelObjectivesResponse\"C"
          + "\202\323\344\223\0024\0222/v3/{parent=*/*/services/*}/serv"
          + "iceLevelObjectives\332A\006parent\022\214\002\n\033UpdateSe"
          + "rviceLevelObjective\0228.google.monitoring."
          + "v3.UpdateServiceLevelObjectiveRequest\032+."
          + "google.monitoring.v3.ServiceLevelObjecti"
          + "ve\"\205\001\202\323\344\223\002e2J/v3/{service_level_objectiv"
          + "e.name=*/*/services/*/serviceLevelObject"
          + "ives/*}:\027service_level_objective\332A\027servi"
          + "ce_level_objective\022\262\001\n\033DeleteServiceLeve"
          + "lObjective\0228.google.monitoring.v3.Delete"
          + "ServiceLevelObjectiveRequest\032\026.google.pr"
          + "otobuf.Empty\"A\202\323\344\223\0024*2/v3/{name=*/*/serv"
          + "ices/*/serviceLevelObjectives/*}\332A\004name\032"
          + "\251\001\312A\031monitoring.googleapis.com\322A\211\001https:"
          + "//www.googleapis.com/auth/cloud-platform"
          + ",https://www.googleapis.com/auth/monitor"
          + "ing,https://www.googleapis.com/auth/moni"
          + "toring.readB\265\001\n\030com.google.monitoring.v3"
          + "B\035ServiceMonitoringServiceProtoP\001Z>googl"
          + "e.golang.org/genproto/googleapis/monitor"
          + "ing/v3;monitoring\252\002\032Google.Cloud.Monitor"
          + "ing.V3\312\002\032Google\\Cloud\\Monitoring\\V3b\006pro"
          + "to3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.MonitoredResourceProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.monitoring.v3.ServiceMonitoringProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_monitoring_v3_CreateServiceRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_v3_CreateServiceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_CreateServiceRequest_descriptor,
            new java.lang.String[] {
              "Parent", "ServiceId", "Service",
            });
    internal_static_google_monitoring_v3_GetServiceRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_monitoring_v3_GetServiceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_GetServiceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_monitoring_v3_ListServicesRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_monitoring_v3_ListServicesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListServicesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken",
            });
    internal_static_google_monitoring_v3_ListServicesResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_monitoring_v3_ListServicesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListServicesResponse_descriptor,
            new java.lang.String[] {
              "Services", "NextPageToken",
            });
    internal_static_google_monitoring_v3_UpdateServiceRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_monitoring_v3_UpdateServiceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_UpdateServiceRequest_descriptor,
            new java.lang.String[] {
              "Service", "UpdateMask",
            });
    internal_static_google_monitoring_v3_DeleteServiceRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_monitoring_v3_DeleteServiceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_DeleteServiceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_monitoring_v3_CreateServiceLevelObjectiveRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_monitoring_v3_CreateServiceLevelObjectiveRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_CreateServiceLevelObjectiveRequest_descriptor,
            new java.lang.String[] {
              "Parent", "ServiceLevelObjectiveId", "ServiceLevelObjective",
            });
    internal_static_google_monitoring_v3_GetServiceLevelObjectiveRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_monitoring_v3_GetServiceLevelObjectiveRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_GetServiceLevelObjectiveRequest_descriptor,
            new java.lang.String[] {
              "Name", "View",
            });
    internal_static_google_monitoring_v3_ListServiceLevelObjectivesRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_monitoring_v3_ListServiceLevelObjectivesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListServiceLevelObjectivesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken", "View",
            });
    internal_static_google_monitoring_v3_ListServiceLevelObjectivesResponse_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_monitoring_v3_ListServiceLevelObjectivesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListServiceLevelObjectivesResponse_descriptor,
            new java.lang.String[] {
              "ServiceLevelObjectives", "NextPageToken",
            });
    internal_static_google_monitoring_v3_UpdateServiceLevelObjectiveRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_monitoring_v3_UpdateServiceLevelObjectiveRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_UpdateServiceLevelObjectiveRequest_descriptor,
            new java.lang.String[] {
              "ServiceLevelObjective", "UpdateMask",
            });
    internal_static_google_monitoring_v3_DeleteServiceLevelObjectiveRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_monitoring_v3_DeleteServiceLevelObjectiveRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_DeleteServiceLevelObjectiveRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.MonitoredResourceProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.monitoring.v3.ServiceMonitoringProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
