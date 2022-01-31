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
// source: google/cloud/aiplatform/v1beta1/model_service.proto

package com.google.cloud.aiplatform.v1beta1;

public final class ModelServiceProto {
  private ModelServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_UploadModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UploadModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_UploadModelOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UploadModelOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_UploadModelResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UploadModelResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_GetModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_GetModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListModelsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListModelsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListModelsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListModelsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_UpdateModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UpdateModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeleteModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeleteModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExportModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExportModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExportModelRequest_OutputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExportModelRequest_OutputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExportModelOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExportModelOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExportModelOperationMetadata_OutputInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExportModelOperationMetadata_OutputInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExportModelResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExportModelResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_GetModelEvaluationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_GetModelEvaluationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListModelEvaluationsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListModelEvaluationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListModelEvaluationsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListModelEvaluationsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_GetModelEvaluationSliceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_GetModelEvaluationSliceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListModelEvaluationSlicesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListModelEvaluationSlicesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListModelEvaluationSlicesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListModelEvaluationSlicesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/aiplatform/v1beta1/model_"
          + "service.proto\022\037google.cloud.aiplatform.v"
          + "1beta1\032\034google/api/annotations.proto\032\027go"
          + "ogle/api/client.proto\032\037google/api/field_"
          + "behavior.proto\032\031google/api/resource.prot"
          + "o\0325google/cloud/aiplatform/v1beta1/encry"
          + "ption_spec.proto\0321google/cloud/aiplatfor"
          + "m/v1beta1/explanation.proto\032(google/clou"
          + "d/aiplatform/v1beta1/io.proto\032+google/cl"
          + "oud/aiplatform/v1beta1/model.proto\0326goog"
          + "le/cloud/aiplatform/v1beta1/model_evalua"
          + "tion.proto\032<google/cloud/aiplatform/v1be"
          + "ta1/model_evaluation_slice.proto\032/google"
          + "/cloud/aiplatform/v1beta1/operation.prot"
          + "o\032#google/longrunning/operations.proto\032 "
          + "google/protobuf/field_mask.proto\"\213\001\n\022Upl"
          + "oadModelRequest\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n"
          + "!locations.googleapis.com/Location\022:\n\005mo"
          + "del\030\002 \001(\0132&.google.cloud.aiplatform.v1be"
          + "ta1.ModelB\003\340A\002\"s\n\034UploadModelOperationMe"
          + "tadata\022S\n\020generic_metadata\030\001 \001(\01329.googl"
          + "e.cloud.aiplatform.v1beta1.GenericOperat"
          + "ionMetadata\"J\n\023UploadModelResponse\0223\n\005mo"
          + "del\030\001 \001(\tB$\372A!\n\037aiplatform.googleapis.co"
          + "m/Model\"H\n\017GetModelRequest\0225\n\004name\030\001 \001(\t"
          + "B\'\340A\002\372A!\n\037aiplatform.googleapis.com/Mode"
          + "l\"\264\001\n\021ListModelsRequest\0229\n\006parent\030\001 \001(\tB"
          + ")\340A\002\372A#\n!locations.googleapis.com/Locati"
          + "on\022\016\n\006filter\030\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005\022\022\n"
          + "\npage_token\030\004 \001(\t\022-\n\tread_mask\030\005 \001(\0132\032.g"
          + "oogle.protobuf.FieldMask\"e\n\022ListModelsRe"
          + "sponse\0226\n\006models\030\001 \003(\0132&.google.cloud.ai"
          + "platform.v1beta1.Model\022\027\n\017next_page_toke"
          + "n\030\002 \001(\t\"\206\001\n\022UpdateModelRequest\022:\n\005model\030"
          + "\001 \001(\0132&.google.cloud.aiplatform.v1beta1."
          + "ModelB\003\340A\002\0224\n\013update_mask\030\002 \001(\0132\032.google"
          + ".protobuf.FieldMaskB\003\340A\002\"K\n\022DeleteModelR"
          + "equest\0225\n\004name\030\001 \001(\tB\'\340A\002\372A!\n\037aiplatform"
          + ".googleapis.com/Model\"\375\002\n\022ExportModelReq"
          + "uest\0225\n\004name\030\001 \001(\tB\'\340A\002\372A!\n\037aiplatform.g"
          + "oogleapis.com/Model\022\\\n\routput_config\030\002 \001"
          + "(\0132@.google.cloud.aiplatform.v1beta1.Exp"
          + "ortModelRequest.OutputConfigB\003\340A\002\032\321\001\n\014Ou"
          + "tputConfig\022\030\n\020export_format_id\030\001 \001(\t\022M\n\024"
          + "artifact_destination\030\003 \001(\0132/.google.clou"
          + "d.aiplatform.v1beta1.GcsDestination\022X\n\021i"
          + "mage_destination\030\004 \001(\0132=.google.cloud.ai"
          + "platform.v1beta1.ContainerRegistryDestin"
          + "ation\"\246\002\n\034ExportModelOperationMetadata\022S"
          + "\n\020generic_metadata\030\001 \001(\01329.google.cloud."
          + "aiplatform.v1beta1.GenericOperationMetad"
          + "ata\022b\n\013output_info\030\002 \001(\0132H.google.cloud."
          + "aiplatform.v1beta1.ExportModelOperationM"
          + "etadata.OutputInfoB\003\340A\003\032M\n\nOutputInfo\022 \n"
          + "\023artifact_output_uri\030\002 \001(\tB\003\340A\003\022\035\n\020image"
          + "_output_uri\030\003 \001(\tB\003\340A\003\"\025\n\023ExportModelRes"
          + "ponse\"\\\n\031GetModelEvaluationRequest\022?\n\004na"
          + "me\030\001 \001(\tB1\340A\002\372A+\n)aiplatform.googleapis."
          + "com/ModelEvaluation\"\274\001\n\033ListModelEvaluat"
          + "ionsRequest\0227\n\006parent\030\001 \001(\tB\'\340A\002\372A!\n\037aip"
          + "latform.googleapis.com/Model\022\016\n\006filter\030\002"
          + " \001(\t\022\021\n\tpage_size\030\003 \001(\005\022\022\n\npage_token\030\004 "
          + "\001(\t\022-\n\tread_mask\030\005 \001(\0132\032.google.protobuf"
          + ".FieldMask\"\204\001\n\034ListModelEvaluationsRespo"
          + "nse\022K\n\021model_evaluations\030\001 \003(\01320.google."
          + "cloud.aiplatform.v1beta1.ModelEvaluation"
          + "\022\027\n\017next_page_token\030\002 \001(\t\"f\n\036GetModelEva"
          + "luationSliceRequest\022D\n\004name\030\001 \001(\tB6\340A\002\372A"
          + "0\n.aiplatform.googleapis.com/ModelEvalua"
          + "tionSlice\"\313\001\n ListModelEvaluationSlicesR"
          + "equest\022A\n\006parent\030\001 \001(\tB1\340A\002\372A+\n)aiplatfo"
          + "rm.googleapis.com/ModelEvaluation\022\016\n\006fil"
          + "ter\030\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005\022\022\n\npage_tok"
          + "en\030\004 \001(\t\022-\n\tread_mask\030\005 \001(\0132\032.google.pro"
          + "tobuf.FieldMask\"\224\001\n!ListModelEvaluationS"
          + "licesResponse\022V\n\027model_evaluation_slices"
          + "\030\001 \003(\01325.google.cloud.aiplatform.v1beta1"
          + ".ModelEvaluationSlice\022\027\n\017next_page_token"
          + "\030\002 \001(\t2\336\021\n\014ModelService\022\352\001\n\013UploadModel\022"
          + "3.google.cloud.aiplatform.v1beta1.Upload"
          + "ModelRequest\032\035.google.longrunning.Operat"
          + "ion\"\206\001\202\323\344\223\002;\"6/v1beta1/{parent=projects/"
          + "*/locations/*}/models:upload:\001*\332A\014parent"
          + ",model\312A3\n\023UploadModelResponse\022\034UploadMo"
          + "delOperationMetadata\022\244\001\n\010GetModel\0220.goog"
          + "le.cloud.aiplatform.v1beta1.GetModelRequ"
          + "est\032&.google.cloud.aiplatform.v1beta1.Mo"
          + "del\">\202\323\344\223\0021\022//v1beta1/{name=projects/*/l"
          + "ocations/*/models/*}\332A\004name\022\267\001\n\nListMode"
          + "ls\0222.google.cloud.aiplatform.v1beta1.Lis"
          + "tModelsRequest\0323.google.cloud.aiplatform"
          + ".v1beta1.ListModelsResponse\"@\202\323\344\223\0021\022//v1"
          + "beta1/{parent=projects/*/locations/*}/mo"
          + "dels\332A\006parent\022\304\001\n\013UpdateModel\0223.google.c"
          + "loud.aiplatform.v1beta1.UpdateModelReque"
          + "st\032&.google.cloud.aiplatform.v1beta1.Mod"
          + "el\"X\202\323\344\223\002>25/v1beta1/{model.name=project"
          + "s/*/locations/*/models/*}:\005model\332A\021model"
          + ",update_mask\022\324\001\n\013DeleteModel\0223.google.cl"
          + "oud.aiplatform.v1beta1.DeleteModelReques"
          + "t\032\035.google.longrunning.Operation\"q\202\323\344\223\0021"
          + "*//v1beta1/{name=projects/*/locations/*/"
          + "models/*}\332A\004name\312A0\n\025google.protobuf.Emp"
          + "ty\022\027DeleteOperationMetadata\022\360\001\n\013ExportMo"
          + "del\0223.google.cloud.aiplatform.v1beta1.Ex"
          + "portModelRequest\032\035.google.longrunning.Op"
          + "eration\"\214\001\202\323\344\223\002;\"6/v1beta1/{name=project"
          + "s/*/locations/*/models/*}:export:\001*\332A\022na"
          + "me,output_config\312A3\n\023ExportModelResponse"
          + "\022\034ExportModelOperationMetadata\022\320\001\n\022GetMo"
          + "delEvaluation\022:.google.cloud.aiplatform."
          + "v1beta1.GetModelEvaluationRequest\0320.goog"
          + "le.cloud.aiplatform.v1beta1.ModelEvaluat"
          + "ion\"L\202\323\344\223\002?\022=/v1beta1/{name=projects/*/l"
          + "ocations/*/models/*/evaluations/*}\332A\004nam"
          + "e\022\343\001\n\024ListModelEvaluations\022<.google.clou"
          + "d.aiplatform.v1beta1.ListModelEvaluation"
          + "sRequest\032=.google.cloud.aiplatform.v1bet"
          + "a1.ListModelEvaluationsResponse\"N\202\323\344\223\002?\022"
          + "=/v1beta1/{parent=projects/*/locations/*"
          + "/models/*}/evaluations\332A\006parent\022\350\001\n\027GetM"
          + "odelEvaluationSlice\022?.google.cloud.aipla"
          + "tform.v1beta1.GetModelEvaluationSliceReq"
          + "uest\0325.google.cloud.aiplatform.v1beta1.M"
          + "odelEvaluationSlice\"U\202\323\344\223\002H\022F/v1beta1/{n"
          + "ame=projects/*/locations/*/models/*/eval"
          + "uations/*/slices/*}\332A\004name\022\373\001\n\031ListModel"
          + "EvaluationSlices\022A.google.cloud.aiplatfo"
          + "rm.v1beta1.ListModelEvaluationSlicesRequ"
          + "est\032B.google.cloud.aiplatform.v1beta1.Li"
          + "stModelEvaluationSlicesResponse\"W\202\323\344\223\002H\022"
          + "F/v1beta1/{parent=projects/*/locations/*"
          + "/models/*/evaluations/*}/slices\332A\006parent"
          + "\032M\312A\031aiplatform.googleapis.com\322A.https:/"
          + "/www.googleapis.com/auth/cloud-platformB"
          + "\356\001\n#com.google.cloud.aiplatform.v1beta1B"
          + "\021ModelServiceProtoP\001ZIgoogle.golang.org/"
          + "genproto/googleapis/cloud/aiplatform/v1b"
          + "eta1;aiplatform\252\002\037Google.Cloud.AIPlatfor"
          + "m.V1Beta1\312\002\037Google\\Cloud\\AIPlatform\\V1be"
          + "ta1\352\002\"Google::Cloud::AIPlatform::V1beta1"
          + "b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ExplanationProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ModelProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ModelEvaluationProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ModelEvaluationSliceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.OperationProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_UploadModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_UploadModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_UploadModelRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Model",
            });
    internal_static_google_cloud_aiplatform_v1beta1_UploadModelOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_UploadModelOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_UploadModelOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_UploadModelResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_UploadModelResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_UploadModelResponse_descriptor,
            new java.lang.String[] {
              "Model",
            });
    internal_static_google_cloud_aiplatform_v1beta1_GetModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_GetModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_GetModelRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListModelsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_ListModelsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListModelsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken", "ReadMask",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListModelsResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_ListModelsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListModelsResponse_descriptor,
            new java.lang.String[] {
              "Models", "NextPageToken",
            });
    internal_static_google_cloud_aiplatform_v1beta1_UpdateModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1beta1_UpdateModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_UpdateModelRequest_descriptor,
            new java.lang.String[] {
              "Model", "UpdateMask",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeleteModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1beta1_DeleteModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeleteModelRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExportModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1beta1_ExportModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExportModelRequest_descriptor,
            new java.lang.String[] {
              "Name", "OutputConfig",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExportModelRequest_OutputConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ExportModelRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ExportModelRequest_OutputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExportModelRequest_OutputConfig_descriptor,
            new java.lang.String[] {
              "ExportFormatId", "ArtifactDestination", "ImageDestination",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExportModelOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_aiplatform_v1beta1_ExportModelOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExportModelOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata", "OutputInfo",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExportModelOperationMetadata_OutputInfo_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ExportModelOperationMetadata_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ExportModelOperationMetadata_OutputInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExportModelOperationMetadata_OutputInfo_descriptor,
            new java.lang.String[] {
              "ArtifactOutputUri", "ImageOutputUri",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExportModelResponse_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_aiplatform_v1beta1_ExportModelResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExportModelResponse_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_aiplatform_v1beta1_GetModelEvaluationRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_aiplatform_v1beta1_GetModelEvaluationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_GetModelEvaluationRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListModelEvaluationsRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_aiplatform_v1beta1_ListModelEvaluationsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListModelEvaluationsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken", "ReadMask",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListModelEvaluationsResponse_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_aiplatform_v1beta1_ListModelEvaluationsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListModelEvaluationsResponse_descriptor,
            new java.lang.String[] {
              "ModelEvaluations", "NextPageToken",
            });
    internal_static_google_cloud_aiplatform_v1beta1_GetModelEvaluationSliceRequest_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_aiplatform_v1beta1_GetModelEvaluationSliceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_GetModelEvaluationSliceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListModelEvaluationSlicesRequest_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_aiplatform_v1beta1_ListModelEvaluationSlicesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListModelEvaluationSlicesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken", "ReadMask",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListModelEvaluationSlicesResponse_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_aiplatform_v1beta1_ListModelEvaluationSlicesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListModelEvaluationSlicesResponse_descriptor,
            new java.lang.String[] {
              "ModelEvaluationSlices", "NextPageToken",
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
    com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ExplanationProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ModelProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ModelEvaluationProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ModelEvaluationSliceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.OperationProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
