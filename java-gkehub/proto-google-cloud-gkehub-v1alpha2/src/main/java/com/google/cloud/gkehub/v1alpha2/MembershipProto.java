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
// source: google/cloud/gkehub/v1alpha2/membership.proto

package com.google.cloud.gkehub.v1alpha2;

public final class MembershipProto {
  private MembershipProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha2_Membership_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha2_Membership_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha2_Membership_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha2_Membership_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha2_MembershipEndpoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha2_MembershipEndpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha2_KubernetesResource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha2_KubernetesResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha2_ResourceOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha2_ResourceOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha2_GkeCluster_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha2_GkeCluster_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha2_OnPremCluster_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha2_OnPremCluster_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha2_MultiCloudCluster_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha2_MultiCloudCluster_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha2_KubernetesMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha2_KubernetesMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha2_Authority_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha2_Authority_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha2_MembershipState_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha2_MembershipState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha2_ListMembershipsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha2_ListMembershipsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha2_ListMembershipsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha2_ListMembershipsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha2_GetMembershipRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha2_GetMembershipRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha2_CreateMembershipRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha2_CreateMembershipRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha2_DeleteMembershipRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha2_DeleteMembershipRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha2_UpdateMembershipRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha2_UpdateMembershipRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha2_GenerateConnectManifestRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha2_GenerateConnectManifestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha2_GenerateConnectManifestResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha2_GenerateConnectManifestResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha2_ConnectAgentResource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha2_ConnectAgentResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha2_ResourceManifest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha2_ResourceManifest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha2_TypeMeta_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha2_TypeMeta_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha2_InitializeHubRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha2_InitializeHubRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha2_InitializeHubResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha2_InitializeHubResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha2_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha2_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/gkehub/v1alpha2/membershi"
          + "p.proto\022\034google.cloud.gkehub.v1alpha2\032\034g"
          + "oogle/api/annotations.proto\032\027google/api/"
          + "client.proto\032\037google/api/field_behavior."
          + "proto\032\031google/api/resource.proto\032#google"
          + "/longrunning/operations.proto\032 google/pr"
          + "otobuf/field_mask.proto\032\037google/protobuf"
          + "/timestamp.proto\"\276\007\n\nMembership\022\021\n\004name\030"
          + "\001 \001(\tB\003\340A\003\022I\n\006labels\030\002 \003(\01324.google.clou"
          + "d.gkehub.v1alpha2.Membership.LabelsEntry"
          + "B\003\340A\001\022\030\n\013description\030\003 \001(\tB\003\340A\003\022I\n\010endpo"
          + "int\030\004 \001(\01320.google.cloud.gkehub.v1alpha2"
          + ".MembershipEndpointB\003\340A\001H\000\022A\n\005state\030\005 \001("
          + "\0132-.google.cloud.gkehub.v1alpha2.Members"
          + "hipStateB\003\340A\003\0224\n\013create_time\030\006 \001(\0132\032.goo"
          + "gle.protobuf.TimestampB\003\340A\003\0224\n\013update_ti"
          + "me\030\007 \001(\0132\032.google.protobuf.TimestampB\003\340A"
          + "\003\0224\n\013delete_time\030\010 \001(\0132\032.google.protobuf"
          + ".TimestampB\003\340A\003\022\030\n\013external_id\030\t \001(\tB\003\340A"
          + "\001\022?\n\tauthority\030\n \001(\0132\'.google.cloud.gkeh"
          + "ub.v1alpha2.AuthorityB\003\340A\001\022=\n\024last_conne"
          + "ction_time\030\013 \001(\0132\032.google.protobuf.Times"
          + "tampB\003\340A\003\022\026\n\tunique_id\030\014 \001(\tB\003\340A\003\022]\n\023inf"
          + "rastructure_type\030\r \001(\0162;.google.cloud.gk"
          + "ehub.v1alpha2.Membership.InfrastructureT"
          + "ypeB\003\340A\001\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005"
          + "value\030\002 \001(\t:\0028\001\"W\n\022InfrastructureType\022#\n"
          + "\037INFRASTRUCTURE_TYPE_UNSPECIFIED\020\000\022\013\n\007ON"
          + "_PREM\020\001\022\017\n\013MULTI_CLOUD\020\002:g\352Ad\n gkehub.go"
          + "ogleapis.com/Membership\022@projects/{proje"
          + "ct}/locations/{location}/memberships/{me"
          + "mbership}B\006\n\004type\"\254\003\n\022MembershipEndpoint"
          + "\022D\n\013gke_cluster\030\001 \001(\0132(.google.cloud.gke"
          + "hub.v1alpha2.GkeClusterB\003\340A\001H\000\022K\n\017on_pre"
          + "m_cluster\030\004 \001(\0132+.google.cloud.gkehub.v1"
          + "alpha2.OnPremClusterB\003\340A\001H\000\022S\n\023multi_clo"
          + "ud_cluster\030\005 \001(\0132/.google.cloud.gkehub.v"
          + "1alpha2.MultiCloudClusterB\003\340A\001H\000\022R\n\023kube"
          + "rnetes_metadata\030\002 \001(\01320.google.cloud.gke"
          + "hub.v1alpha2.KubernetesMetadataB\003\340A\003\022R\n\023"
          + "kubernetes_resource\030\003 \001(\01320.google.cloud"
          + ".gkehub.v1alpha2.KubernetesResourceB\003\340A\001"
          + "B\006\n\004type\"\252\002\n\022KubernetesResource\022#\n\026membe"
          + "rship_cr_manifest\030\001 \001(\tB\003\340A\004\022Q\n\024membersh"
          + "ip_resources\030\003 \003(\0132..google.cloud.gkehub"
          + ".v1alpha2.ResourceManifestB\003\340A\003\022N\n\021conne"
          + "ct_resources\030\004 \003(\0132..google.cloud.gkehub"
          + ".v1alpha2.ResourceManifestB\003\340A\003\022L\n\020resou"
          + "rce_options\030\005 \001(\0132-.google.cloud.gkehub."
          + "v1alpha2.ResourceOptionsB\003\340A\001\"c\n\017Resourc"
          + "eOptions\022\034\n\017connect_version\030\001 \001(\tB\003\340A\001\022\030"
          + "\n\013v1beta1_crd\030\002 \001(\010B\003\340A\001\022\030\n\013k8s_version\030"
          + "\003 \001(\tB\003\340A\001\"F\n\nGkeCluster\022\032\n\rresource_lin"
          + "k\030\001 \001(\tB\003\340A\005\022\034\n\017cluster_missing\030\002 \001(\010B\003\340"
          + "A\003\"e\n\rOnPremCluster\022\032\n\rresource_link\030\001 \001"
          + "(\tB\003\340A\005\022\034\n\017cluster_missing\030\002 \001(\010B\003\340A\003\022\032\n"
          + "\radmin_cluster\030\003 \001(\010B\003\340A\005\"M\n\021MultiCloudC"
          + "luster\022\032\n\rresource_link\030\001 \001(\tB\003\340A\005\022\034\n\017cl"
          + "uster_missing\030\002 \001(\010B\003\340A\003\"\337\001\n\022KubernetesM"
          + "etadata\022*\n\035kubernetes_api_server_version"
          + "\030\001 \001(\tB\003\340A\003\022\035\n\020node_provider_id\030\002 \001(\tB\003\340"
          + "A\003\022\027\n\nnode_count\030\003 \001(\005B\003\340A\003\022\027\n\nvcpu_coun"
          + "t\030\004 \001(\005B\003\340A\003\022\026\n\tmemory_mb\030\005 \001(\005B\003\340A\003\0224\n\013"
          + "update_time\030d \001(\0132\032.google.protobuf.Time"
          + "stampB\003\340A\003\"}\n\tAuthority\022\023\n\006issuer\030\001 \001(\tB"
          + "\003\340A\001\022\026\n\toidc_jwks\030\005 \001(\014B\003\340A\001\022\036\n\021identity"
          + "_provider\030\003 \001(\tB\003\340A\003\022#\n\026workload_identit"
          + "y_pool\030\004 \001(\tB\003\340A\003\"\301\001\n\017MembershipState\022E\n"
          + "\004code\030\001 \001(\01622.google.cloud.gkehub.v1alph"
          + "a2.MembershipState.CodeB\003\340A\003\"g\n\004Code\022\024\n\020"
          + "CODE_UNSPECIFIED\020\000\022\014\n\010CREATING\020\001\022\t\n\005READ"
          + "Y\020\002\022\014\n\010DELETING\020\003\022\014\n\010UPDATING\020\004\022\024\n\020SERVI"
          + "CE_UPDATING\020\005\"\257\001\n\026ListMembershipsRequest"
          + "\0228\n\006parent\030\001 \001(\tB(\340A\002\372A\"\022 gkehub.googlea"
          + "pis.com/Membership\022\026\n\tpage_size\030\002 \001(\005B\003\340"
          + "A\001\022\027\n\npage_token\030\003 \001(\tB\003\340A\001\022\023\n\006filter\030\004 "
          + "\001(\tB\003\340A\001\022\025\n\010order_by\030\005 \001(\tB\003\340A\001\"\204\001\n\027List"
          + "MembershipsResponse\022;\n\tresources\030\001 \003(\0132("
          + ".google.cloud.gkehub.v1alpha2.Membership"
          + "\022\027\n\017next_page_token\030\002 \001(\t\022\023\n\013unreachable"
          + "\030\003 \003(\t\"N\n\024GetMembershipRequest\0226\n\004name\030\001"
          + " \001(\tB(\340A\002\372A\"\n gkehub.googleapis.com/Memb"
          + "ership\"\260\001\n\027CreateMembershipRequest\0228\n\006pa"
          + "rent\030\001 \001(\tB(\340A\002\372A\"\022 gkehub.googleapis.co"
          + "m/Membership\022\032\n\rmembership_id\030\002 \001(\tB\003\340A\002"
          + "\022?\n\010resource\030\003 \001(\0132(.google.cloud.gkehub"
          + ".v1alpha2.MembershipB\003\340A\002\"Q\n\027DeleteMembe"
          + "rshipRequest\0226\n\004name\030\001 \001(\tB(\340A\002\372A\"\n gkeh"
          + "ub.googleapis.com/Membership\"\243\001\n\027UpdateM"
          + "embershipRequest\022\021\n\004name\030\001 \001(\tB\003\340A\002\0224\n\013u"
          + "pdate_mask\030\002 \001(\0132\032.google.protobuf.Field"
          + "MaskB\003\340A\002\022?\n\010resource\030\003 \001(\0132(.google.clo"
          + "ud.gkehub.v1alpha2.MembershipB\003\340A\002\"\315\001\n\036G"
          + "enerateConnectManifestRequest\022\021\n\004name\030\001 "
          + "\001(\tB\003\340A\002\022\026\n\tnamespace\030\002 \001(\tB\003\340A\001\022\022\n\005prox"
          + "y\030\003 \001(\014B\003\340A\001\022\024\n\007version\030\004 \001(\tB\003\340A\001\022\027\n\nis"
          + "_upgrade\030\005 \001(\010B\003\340A\001\022\025\n\010registry\030\006 \001(\tB\003\340"
          + "A\001\022&\n\031image_pull_secret_content\030\007 \001(\014B\003\340"
          + "A\001\"g\n\037GenerateConnectManifestResponse\022D\n"
          + "\010manifest\030\001 \003(\01322.google.cloud.gkehub.v1"
          + "alpha2.ConnectAgentResource\"^\n\024ConnectAg"
          + "entResource\0224\n\004type\030\001 \001(\0132&.google.cloud"
          + ".gkehub.v1alpha2.TypeMeta\022\020\n\010manifest\030\002 "
          + "\001(\t\"<\n\020ResourceManifest\022\020\n\010manifest\030\001 \001("
          + "\t\022\026\n\016cluster_scoped\030\002 \001(\010\"-\n\010TypeMeta\022\014\n"
          + "\004kind\030\001 \001(\t\022\023\n\013api_version\030\002 \001(\t\",\n\024Init"
          + "ializeHubRequest\022\024\n\007project\030\001 \001(\tB\003\340A\002\"Q"
          + "\n\025InitializeHubResponse\022\030\n\020service_ident"
          + "ity\030\001 \001(\t\022\036\n\026workload_identity_pool\030\002 \001("
          + "\t\"\371\001\n\021OperationMetadata\0224\n\013create_time\030\001"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0221\n"
          + "\010end_time\030\002 \001(\0132\032.google.protobuf.Timest"
          + "ampB\003\340A\003\022\023\n\006target\030\003 \001(\tB\003\340A\003\022\021\n\004verb\030\004 "
          + "\001(\tB\003\340A\003\022\032\n\rstatus_detail\030\005 \001(\tB\003\340A\003\022\035\n\020"
          + "cancel_requested\030\006 \001(\010B\003\340A\003\022\030\n\013api_versi"
          + "on\030\007 \001(\tB\003\340A\0032\333\014\n\006GkeHub\022\306\001\n\017ListMembers"
          + "hips\0224.google.cloud.gkehub.v1alpha2.List"
          + "MembershipsRequest\0325.google.cloud.gkehub"
          + ".v1alpha2.ListMembershipsResponse\"F\202\323\344\223\002"
          + "7\0225/v1alpha2/{parent=projects/*/location"
          + "s/*}/memberships\332A\006parent\022\263\001\n\rGetMembers"
          + "hip\0222.google.cloud.gkehub.v1alpha2.GetMe"
          + "mbershipRequest\032(.google.cloud.gkehub.v1"
          + "alpha2.Membership\"D\202\323\344\223\0027\0225/v1alpha2/{na"
          + "me=projects/*/locations/*/memberships/*}"
          + "\332A\004name\022\364\001\n\020CreateMembership\0225.google.cl"
          + "oud.gkehub.v1alpha2.CreateMembershipRequ"
          + "est\032\035.google.longrunning.Operation\"\211\001\202\323\344"
          + "\223\002A\"5/v1alpha2/{parent=projects/*/locati"
          + "ons/*}/memberships:\010resource\332A\035parent,re"
          + "source,membership_id\312A\037\n\nMembership\022\021Ope"
          + "rationMetadata\022\333\001\n\020DeleteMembership\0225.go"
          + "ogle.cloud.gkehub.v1alpha2.DeleteMembers"
          + "hipRequest\032\035.google.longrunning.Operatio"
          + "n\"q\202\323\344\223\0027*5/v1alpha2/{name=projects/*/lo"
          + "cations/*/memberships/*}\332A\004name\312A*\n\025goog"
          + "le.protobuf.Empty\022\021OperationMetadata\022\360\001\n"
          + "\020UpdateMembership\0225.google.cloud.gkehub."
          + "v1alpha2.UpdateMembershipRequest\032\035.googl"
          + "e.longrunning.Operation\"\205\001\202\323\344\223\002A25/v1alp"
          + "ha2/{name=projects/*/locations/*/members"
          + "hips/*}:\010resource\332A\031name,resource,update"
          + "_mask\312A\037\n\nMembership\022\021OperationMetadata\022"
          + "\355\001\n\027GenerateConnectManifest\022<.google.clo"
          + "ud.gkehub.v1alpha2.GenerateConnectManife"
          + "stRequest\032=.google.cloud.gkehub.v1alpha2"
          + ".GenerateConnectManifestResponse\"U\202\323\344\223\002O"
          + "\022M/v1alpha2/{name=projects/*/locations/*"
          + "/memberships/*}:generateConnectManifest\022"
          + "\316\001\n\rInitializeHub\0222.google.cloud.gkehub."
          + "v1alpha2.InitializeHubRequest\0323.google.c"
          + "loud.gkehub.v1alpha2.InitializeHubRespon"
          + "se\"T\202\323\344\223\002N\"I/v1alpha2/{project=projects/"
          + "*/locations/global/memberships}:initiali"
          + "zeHub:\001*\032I\312A\025gkehub.googleapis.com\322A.htt"
          + "ps://www.googleapis.com/auth/cloud-platf"
          + "ormB\317\001\n com.google.cloud.gkehub.v1alpha2"
          + "B\017MembershipProtoP\001Z8cloud.google.com/go"
          + "/gkehub/apiv1alpha2/gkehubpb;gkehubpb\252\002\034"
          + "Google.Cloud.GkeHub.V1Alpha2\312\002\034Google\\Cl"
          + "oud\\GkeHub\\V1alpha2\352\002\037Google::Cloud::Gke"
          + "Hub::V1alpha2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_gkehub_v1alpha2_Membership_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_gkehub_v1alpha2_Membership_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha2_Membership_descriptor,
            new java.lang.String[] {
              "Name",
              "Labels",
              "Description",
              "Endpoint",
              "State",
              "CreateTime",
              "UpdateTime",
              "DeleteTime",
              "ExternalId",
              "Authority",
              "LastConnectionTime",
              "UniqueId",
              "InfrastructureType",
              "Type",
            });
    internal_static_google_cloud_gkehub_v1alpha2_Membership_LabelsEntry_descriptor =
        internal_static_google_cloud_gkehub_v1alpha2_Membership_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_gkehub_v1alpha2_Membership_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha2_Membership_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_gkehub_v1alpha2_MembershipEndpoint_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_gkehub_v1alpha2_MembershipEndpoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha2_MembershipEndpoint_descriptor,
            new java.lang.String[] {
              "GkeCluster",
              "OnPremCluster",
              "MultiCloudCluster",
              "KubernetesMetadata",
              "KubernetesResource",
              "Type",
            });
    internal_static_google_cloud_gkehub_v1alpha2_KubernetesResource_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_gkehub_v1alpha2_KubernetesResource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha2_KubernetesResource_descriptor,
            new java.lang.String[] {
              "MembershipCrManifest", "MembershipResources", "ConnectResources", "ResourceOptions",
            });
    internal_static_google_cloud_gkehub_v1alpha2_ResourceOptions_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_gkehub_v1alpha2_ResourceOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha2_ResourceOptions_descriptor,
            new java.lang.String[] {
              "ConnectVersion", "V1Beta1Crd", "K8SVersion",
            });
    internal_static_google_cloud_gkehub_v1alpha2_GkeCluster_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_gkehub_v1alpha2_GkeCluster_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha2_GkeCluster_descriptor,
            new java.lang.String[] {
              "ResourceLink", "ClusterMissing",
            });
    internal_static_google_cloud_gkehub_v1alpha2_OnPremCluster_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_gkehub_v1alpha2_OnPremCluster_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha2_OnPremCluster_descriptor,
            new java.lang.String[] {
              "ResourceLink", "ClusterMissing", "AdminCluster",
            });
    internal_static_google_cloud_gkehub_v1alpha2_MultiCloudCluster_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_gkehub_v1alpha2_MultiCloudCluster_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha2_MultiCloudCluster_descriptor,
            new java.lang.String[] {
              "ResourceLink", "ClusterMissing",
            });
    internal_static_google_cloud_gkehub_v1alpha2_KubernetesMetadata_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_gkehub_v1alpha2_KubernetesMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha2_KubernetesMetadata_descriptor,
            new java.lang.String[] {
              "KubernetesApiServerVersion",
              "NodeProviderId",
              "NodeCount",
              "VcpuCount",
              "MemoryMb",
              "UpdateTime",
            });
    internal_static_google_cloud_gkehub_v1alpha2_Authority_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_gkehub_v1alpha2_Authority_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha2_Authority_descriptor,
            new java.lang.String[] {
              "Issuer", "OidcJwks", "IdentityProvider", "WorkloadIdentityPool",
            });
    internal_static_google_cloud_gkehub_v1alpha2_MembershipState_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_gkehub_v1alpha2_MembershipState_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha2_MembershipState_descriptor,
            new java.lang.String[] {
              "Code",
            });
    internal_static_google_cloud_gkehub_v1alpha2_ListMembershipsRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_gkehub_v1alpha2_ListMembershipsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha2_ListMembershipsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_gkehub_v1alpha2_ListMembershipsResponse_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_gkehub_v1alpha2_ListMembershipsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha2_ListMembershipsResponse_descriptor,
            new java.lang.String[] {
              "Resources", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_gkehub_v1alpha2_GetMembershipRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_gkehub_v1alpha2_GetMembershipRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha2_GetMembershipRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_gkehub_v1alpha2_CreateMembershipRequest_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_gkehub_v1alpha2_CreateMembershipRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha2_CreateMembershipRequest_descriptor,
            new java.lang.String[] {
              "Parent", "MembershipId", "Resource",
            });
    internal_static_google_cloud_gkehub_v1alpha2_DeleteMembershipRequest_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_gkehub_v1alpha2_DeleteMembershipRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha2_DeleteMembershipRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_gkehub_v1alpha2_UpdateMembershipRequest_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_gkehub_v1alpha2_UpdateMembershipRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha2_UpdateMembershipRequest_descriptor,
            new java.lang.String[] {
              "Name", "UpdateMask", "Resource",
            });
    internal_static_google_cloud_gkehub_v1alpha2_GenerateConnectManifestRequest_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_gkehub_v1alpha2_GenerateConnectManifestRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha2_GenerateConnectManifestRequest_descriptor,
            new java.lang.String[] {
              "Name",
              "Namespace",
              "Proxy",
              "Version",
              "IsUpgrade",
              "Registry",
              "ImagePullSecretContent",
            });
    internal_static_google_cloud_gkehub_v1alpha2_GenerateConnectManifestResponse_descriptor =
        getDescriptor().getMessageTypes().get(17);
    internal_static_google_cloud_gkehub_v1alpha2_GenerateConnectManifestResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha2_GenerateConnectManifestResponse_descriptor,
            new java.lang.String[] {
              "Manifest",
            });
    internal_static_google_cloud_gkehub_v1alpha2_ConnectAgentResource_descriptor =
        getDescriptor().getMessageTypes().get(18);
    internal_static_google_cloud_gkehub_v1alpha2_ConnectAgentResource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha2_ConnectAgentResource_descriptor,
            new java.lang.String[] {
              "Type", "Manifest",
            });
    internal_static_google_cloud_gkehub_v1alpha2_ResourceManifest_descriptor =
        getDescriptor().getMessageTypes().get(19);
    internal_static_google_cloud_gkehub_v1alpha2_ResourceManifest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha2_ResourceManifest_descriptor,
            new java.lang.String[] {
              "Manifest", "ClusterScoped",
            });
    internal_static_google_cloud_gkehub_v1alpha2_TypeMeta_descriptor =
        getDescriptor().getMessageTypes().get(20);
    internal_static_google_cloud_gkehub_v1alpha2_TypeMeta_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha2_TypeMeta_descriptor,
            new java.lang.String[] {
              "Kind", "ApiVersion",
            });
    internal_static_google_cloud_gkehub_v1alpha2_InitializeHubRequest_descriptor =
        getDescriptor().getMessageTypes().get(21);
    internal_static_google_cloud_gkehub_v1alpha2_InitializeHubRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha2_InitializeHubRequest_descriptor,
            new java.lang.String[] {
              "Project",
            });
    internal_static_google_cloud_gkehub_v1alpha2_InitializeHubResponse_descriptor =
        getDescriptor().getMessageTypes().get(22);
    internal_static_google_cloud_gkehub_v1alpha2_InitializeHubResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha2_InitializeHubResponse_descriptor,
            new java.lang.String[] {
              "ServiceIdentity", "WorkloadIdentityPool",
            });
    internal_static_google_cloud_gkehub_v1alpha2_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(23);
    internal_static_google_cloud_gkehub_v1alpha2_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha2_OperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "EndTime",
              "Target",
              "Verb",
              "StatusDetail",
              "CancelRequested",
              "ApiVersion",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
