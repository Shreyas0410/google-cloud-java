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
// source: google/cloud/datacatalog/v1/policytagmanager.proto

package com.google.cloud.datacatalog.v1;

public final class PolicyTagManagerProto {
  private PolicyTagManagerProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_Taxonomy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_Taxonomy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_Taxonomy_Service_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_Taxonomy_Service_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_PolicyTag_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_PolicyTag_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_CreateTaxonomyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_CreateTaxonomyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_DeleteTaxonomyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_DeleteTaxonomyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_UpdateTaxonomyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_UpdateTaxonomyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_ListTaxonomiesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_ListTaxonomiesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_ListTaxonomiesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_ListTaxonomiesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_GetTaxonomyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_GetTaxonomyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_CreatePolicyTagRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_CreatePolicyTagRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_DeletePolicyTagRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_DeletePolicyTagRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_UpdatePolicyTagRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_UpdatePolicyTagRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_ListPolicyTagsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_ListPolicyTagsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_ListPolicyTagsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_ListPolicyTagsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_GetPolicyTagRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_GetPolicyTagRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/datacatalog/v1/policytagm"
          + "anager.proto\022\033google.cloud.datacatalog.v"
          + "1\032\034google/api/annotations.proto\032\027google/"
          + "api/client.proto\032\037google/api/field_behav"
          + "ior.proto\032\031google/api/resource.proto\032(go"
          + "ogle/cloud/datacatalog/v1/common.proto\032,"
          + "google/cloud/datacatalog/v1/timestamps.p"
          + "roto\032\036google/iam/v1/iam_policy.proto\032\032go"
          + "ogle/iam/v1/policy.proto\032\033google/protobu"
          + "f/empty.proto\032 google/protobuf/field_mas"
          + "k.proto\"\362\004\n\010Taxonomy\022\022\n\004name\030\001 \001(\tB\004\342A\001\003"
          + "\022\032\n\014display_name\030\002 \001(\tB\004\342A\001\002\022\031\n\013descript"
          + "ion\030\003 \001(\tB\004\342A\001\001\022\036\n\020policy_tag_count\030\004 \001("
          + "\005B\004\342A\001\003\022P\n\023taxonomy_timestamps\030\005 \001(\0132-.g"
          + "oogle.cloud.datacatalog.v1.SystemTimesta"
          + "mpsB\004\342A\001\003\022V\n\026activated_policy_types\030\006 \003("
          + "\01620.google.cloud.datacatalog.v1.Taxonomy"
          + ".PolicyTypeB\004\342A\001\001\022D\n\007service\030\007 \001(\0132-.goo"
          + "gle.cloud.datacatalog.v1.Taxonomy.Servic"
          + "eB\004\342A\001\003\032V\n\007Service\0229\n\004name\030\001 \001(\0162+.googl"
          + "e.cloud.datacatalog.v1.ManagingSystem\022\020\n"
          + "\010identity\030\002 \001(\t\"J\n\nPolicyType\022\033\n\027POLICY_"
          + "TYPE_UNSPECIFIED\020\000\022\037\n\033FINE_GRAINED_ACCES"
          + "S_CONTROL\020\001:g\352Ad\n#datacatalog.googleapis"
          + ".com/Taxonomy\022=projects/{project}/locati"
          + "ons/{location}/taxonomies/{taxonomy}\"\217\002\n"
          + "\tPolicyTag\022\022\n\004name\030\001 \001(\tB\004\342A\001\003\022\032\n\014displa"
          + "y_name\030\002 \001(\tB\004\342A\001\002\022\023\n\013description\030\003 \001(\t\022"
          + "\031\n\021parent_policy_tag\030\004 \001(\t\022\037\n\021child_poli"
          + "cy_tags\030\005 \003(\tB\004\342A\001\003:\200\001\352A}\n$datacatalog.g"
          + "oogleapis.com/PolicyTag\022Uprojects/{proje"
          + "ct}/locations/{location}/taxonomies/{tax"
          + "onomy}/policyTags/{policy_tag}\"\216\001\n\025Creat"
          + "eTaxonomyRequest\022<\n\006parent\030\001 \001(\tB,\342A\001\002\372A"
          + "%\022#datacatalog.googleapis.com/Taxonomy\0227"
          + "\n\010taxonomy\030\002 \001(\0132%.google.cloud.datacata"
          + "log.v1.Taxonomy\"S\n\025DeleteTaxonomyRequest"
          + "\022:\n\004name\030\001 \001(\tB,\342A\001\002\372A%\n#datacatalog.goo"
          + "gleapis.com/Taxonomy\"\201\001\n\025UpdateTaxonomyR"
          + "equest\0227\n\010taxonomy\030\001 \001(\0132%.google.cloud."
          + "datacatalog.v1.Taxonomy\022/\n\013update_mask\030\002"
          + " \001(\0132\032.google.protobuf.FieldMask\"\214\001\n\025Lis"
          + "tTaxonomiesRequest\022<\n\006parent\030\001 \001(\tB,\342A\001\002"
          + "\372A%\022#datacatalog.googleapis.com/Taxonomy"
          + "\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\022"
          + "\016\n\006filter\030\004 \001(\t\"l\n\026ListTaxonomiesRespons"
          + "e\0229\n\ntaxonomies\030\001 \003(\0132%.google.cloud.dat"
          + "acatalog.v1.Taxonomy\022\027\n\017next_page_token\030"
          + "\002 \001(\t\"P\n\022GetTaxonomyRequest\022:\n\004name\030\001 \001("
          + "\tB,\342A\001\002\372A%\n#datacatalog.googleapis.com/T"
          + "axonomy\"\223\001\n\026CreatePolicyTagRequest\022=\n\006pa"
          + "rent\030\001 \001(\tB-\342A\001\002\372A&\022$datacatalog.googlea"
          + "pis.com/PolicyTag\022:\n\npolicy_tag\030\002 \001(\0132&."
          + "google.cloud.datacatalog.v1.PolicyTag\"U\n"
          + "\026DeletePolicyTagRequest\022;\n\004name\030\001 \001(\tB-\342"
          + "A\001\002\372A&\n$datacatalog.googleapis.com/Polic"
          + "yTag\"\205\001\n\026UpdatePolicyTagRequest\022:\n\npolic"
          + "y_tag\030\001 \001(\0132&.google.cloud.datacatalog.v"
          + "1.PolicyTag\022/\n\013update_mask\030\002 \001(\0132\032.googl"
          + "e.protobuf.FieldMask\"}\n\025ListPolicyTagsRe"
          + "quest\022=\n\006parent\030\001 \001(\tB-\342A\001\002\372A&\022$datacata"
          + "log.googleapis.com/PolicyTag\022\021\n\tpage_siz"
          + "e\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"n\n\026ListPolic"
          + "yTagsResponse\022;\n\013policy_tags\030\001 \003(\0132&.goo"
          + "gle.cloud.datacatalog.v1.PolicyTag\022\027\n\017ne"
          + "xt_page_token\030\002 \001(\t\"R\n\023GetPolicyTagReque"
          + "st\022;\n\004name\030\001 \001(\tB-\342A\001\002\372A&\n$datacatalog.g"
          + "oogleapis.com/PolicyTag2\273\025\n\020PolicyTagMan"
          + "ager\022\277\001\n\016CreateTaxonomy\0222.google.cloud.d"
          + "atacatalog.v1.CreateTaxonomyRequest\032%.go"
          + "ogle.cloud.datacatalog.v1.Taxonomy\"R\332A\017p"
          + "arent,taxonomy\202\323\344\223\002:\"./v1/{parent=projec"
          + "ts/*/locations/*}/taxonomies:\010taxonomy\022\233"
          + "\001\n\016DeleteTaxonomy\0222.google.cloud.datacat"
          + "alog.v1.DeleteTaxonomyRequest\032\026.google.p"
          + "rotobuf.Empty\"=\332A\004name\202\323\344\223\0020*./v1/{name="
          + "projects/*/locations/*/taxonomies/*}\022\301\001\n"
          + "\016UpdateTaxonomy\0222.google.cloud.datacatal"
          + "og.v1.UpdateTaxonomyRequest\032%.google.clo"
          + "ud.datacatalog.v1.Taxonomy\"T\332A\010taxonomy\202"
          + "\323\344\223\002C27/v1/{taxonomy.name=projects/*/loc"
          + "ations/*/taxonomies/*}:\010taxonomy\022\272\001\n\016Lis"
          + "tTaxonomies\0222.google.cloud.datacatalog.v"
          + "1.ListTaxonomiesRequest\0323.google.cloud.d"
          + "atacatalog.v1.ListTaxonomiesResponse\"?\332A"
          + "\006parent\202\323\344\223\0020\022./v1/{parent=projects/*/lo"
          + "cations/*}/taxonomies\022\244\001\n\013GetTaxonomy\022/."
          + "google.cloud.datacatalog.v1.GetTaxonomyR"
          + "equest\032%.google.cloud.datacatalog.v1.Tax"
          + "onomy\"=\332A\004name\202\323\344\223\0020\022./v1/{name=projects"
          + "/*/locations/*/taxonomies/*}\022\323\001\n\017CreateP"
          + "olicyTag\0223.google.cloud.datacatalog.v1.C"
          + "reatePolicyTagRequest\032&.google.cloud.dat"
          + "acatalog.v1.PolicyTag\"c\332A\021parent,policy_"
          + "tag\202\323\344\223\002I\";/v1/{parent=projects/*/locati"
          + "ons/*/taxonomies/*}/policyTags:\npolicy_t"
          + "ag\022\252\001\n\017DeletePolicyTag\0223.google.cloud.da"
          + "tacatalog.v1.DeletePolicyTagRequest\032\026.go"
          + "ogle.protobuf.Empty\"J\332A\004name\202\323\344\223\002=*;/v1/"
          + "{name=projects/*/locations/*/taxonomies/"
          + "*/policyTags/*}\022\327\001\n\017UpdatePolicyTag\0223.go"
          + "ogle.cloud.datacatalog.v1.UpdatePolicyTa"
          + "gRequest\032&.google.cloud.datacatalog.v1.P"
          + "olicyTag\"g\332A\npolicy_tag\202\323\344\223\002T2F/v1/{poli"
          + "cy_tag.name=projects/*/locations/*/taxon"
          + "omies/*/policyTags/*}:\npolicy_tag\022\307\001\n\016Li"
          + "stPolicyTags\0222.google.cloud.datacatalog."
          + "v1.ListPolicyTagsRequest\0323.google.cloud."
          + "datacatalog.v1.ListPolicyTagsResponse\"L\332"
          + "A\006parent\202\323\344\223\002=\022;/v1/{parent=projects/*/l"
          + "ocations/*/taxonomies/*}/policyTags\022\264\001\n\014"
          + "GetPolicyTag\0220.google.cloud.datacatalog."
          + "v1.GetPolicyTagRequest\032&.google.cloud.da"
          + "tacatalog.v1.PolicyTag\"J\332A\004name\202\323\344\223\002=\022;/"
          + "v1/{name=projects/*/locations/*/taxonomi"
          + "es/*/policyTags/*}\022\352\001\n\014GetIamPolicy\022\".go"
          + "ogle.iam.v1.GetIamPolicyRequest\032\025.google"
          + ".iam.v1.Policy\"\236\001\202\323\344\223\002\227\001\"?/v1/{resource="
          + "projects/*/locations/*/taxonomies/*}:get"
          + "IamPolicy:\001*ZQ\"L/v1/{resource=projects/*"
          + "/locations/*/taxonomies/*/policyTags/*}:"
          + "getIamPolicy:\001*\022\352\001\n\014SetIamPolicy\022\".googl"
          + "e.iam.v1.SetIamPolicyRequest\032\025.google.ia"
          + "m.v1.Policy\"\236\001\202\323\344\223\002\227\001\"?/v1/{resource=pro"
          + "jects/*/locations/*/taxonomies/*}:setIam"
          + "Policy:\001*ZQ\"L/v1/{resource=projects/*/lo"
          + "cations/*/taxonomies/*/policyTags/*}:set"
          + "IamPolicy:\001*\022\226\002\n\022TestIamPermissions\022(.go"
          + "ogle.iam.v1.TestIamPermissionsRequest\032)."
          + "google.iam.v1.TestIamPermissionsResponse"
          + "\"\252\001\202\323\344\223\002\243\001\"E/v1/{resource=projects/*/loc"
          + "ations/*/taxonomies/*}:testIamPermission"
          + "s:\001*ZW\"R/v1/{resource=projects/*/locatio"
          + "ns/*/taxonomies/*/policyTags/*}:testIamP"
          + "ermissions:\001*\032N\312A\032datacatalog.googleapis"
          + ".com\322A.https://www.googleapis.com/auth/c"
          + "loud-platformB\335\001\n\037com.google.cloud.datac"
          + "atalog.v1B\025PolicyTagManagerProtoP\001ZAclou"
          + "d.google.com/go/datacatalog/apiv1/dataca"
          + "talogpb;datacatalogpb\370\001\001\252\002\033Google.Cloud."
          + "DataCatalog.V1\312\002\033Google\\Cloud\\DataCatalo"
          + "g\\V1\352\002\036Google::Cloud::DataCatalog::V1b\006p"
          + "roto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.datacatalog.v1.Common.getDescriptor(),
              com.google.cloud.datacatalog.v1.Timestamps.getDescriptor(),
              com.google.iam.v1.IamPolicyProto.getDescriptor(),
              com.google.iam.v1.PolicyProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_datacatalog_v1_Taxonomy_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datacatalog_v1_Taxonomy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_Taxonomy_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "PolicyTagCount",
              "TaxonomyTimestamps",
              "ActivatedPolicyTypes",
              "Service",
            });
    internal_static_google_cloud_datacatalog_v1_Taxonomy_Service_descriptor =
        internal_static_google_cloud_datacatalog_v1_Taxonomy_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_datacatalog_v1_Taxonomy_Service_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_Taxonomy_Service_descriptor,
            new java.lang.String[] {
              "Name", "Identity",
            });
    internal_static_google_cloud_datacatalog_v1_PolicyTag_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_datacatalog_v1_PolicyTag_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_PolicyTag_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "Description", "ParentPolicyTag", "ChildPolicyTags",
            });
    internal_static_google_cloud_datacatalog_v1_CreateTaxonomyRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_datacatalog_v1_CreateTaxonomyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_CreateTaxonomyRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Taxonomy",
            });
    internal_static_google_cloud_datacatalog_v1_DeleteTaxonomyRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_datacatalog_v1_DeleteTaxonomyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_DeleteTaxonomyRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_datacatalog_v1_UpdateTaxonomyRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_datacatalog_v1_UpdateTaxonomyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_UpdateTaxonomyRequest_descriptor,
            new java.lang.String[] {
              "Taxonomy", "UpdateMask",
            });
    internal_static_google_cloud_datacatalog_v1_ListTaxonomiesRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_datacatalog_v1_ListTaxonomiesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_ListTaxonomiesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_cloud_datacatalog_v1_ListTaxonomiesResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_datacatalog_v1_ListTaxonomiesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_ListTaxonomiesResponse_descriptor,
            new java.lang.String[] {
              "Taxonomies", "NextPageToken",
            });
    internal_static_google_cloud_datacatalog_v1_GetTaxonomyRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_datacatalog_v1_GetTaxonomyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_GetTaxonomyRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_datacatalog_v1_CreatePolicyTagRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_datacatalog_v1_CreatePolicyTagRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_CreatePolicyTagRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PolicyTag",
            });
    internal_static_google_cloud_datacatalog_v1_DeletePolicyTagRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_datacatalog_v1_DeletePolicyTagRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_DeletePolicyTagRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_datacatalog_v1_UpdatePolicyTagRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_datacatalog_v1_UpdatePolicyTagRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_UpdatePolicyTagRequest_descriptor,
            new java.lang.String[] {
              "PolicyTag", "UpdateMask",
            });
    internal_static_google_cloud_datacatalog_v1_ListPolicyTagsRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_datacatalog_v1_ListPolicyTagsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_ListPolicyTagsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_datacatalog_v1_ListPolicyTagsResponse_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_datacatalog_v1_ListPolicyTagsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_ListPolicyTagsResponse_descriptor,
            new java.lang.String[] {
              "PolicyTags", "NextPageToken",
            });
    internal_static_google_cloud_datacatalog_v1_GetPolicyTagRequest_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_datacatalog_v1_GetPolicyTagRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_GetPolicyTagRequest_descriptor,
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
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.datacatalog.v1.Common.getDescriptor();
    com.google.cloud.datacatalog.v1.Timestamps.getDescriptor();
    com.google.iam.v1.IamPolicyProto.getDescriptor();
    com.google.iam.v1.PolicyProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
