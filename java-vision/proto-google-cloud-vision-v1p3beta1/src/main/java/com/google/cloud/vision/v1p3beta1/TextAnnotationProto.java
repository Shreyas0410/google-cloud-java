/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/vision/v1p3beta1/text_annotation.proto

package com.google.cloud.vision.v1p3beta1;

public final class TextAnnotationProto {
  private TextAnnotationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vision_v1p3beta1_TextAnnotation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1p3beta1_TextAnnotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vision_v1p3beta1_TextAnnotation_DetectedLanguage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1p3beta1_TextAnnotation_DetectedLanguage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vision_v1p3beta1_TextAnnotation_DetectedBreak_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1p3beta1_TextAnnotation_DetectedBreak_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vision_v1p3beta1_TextAnnotation_TextProperty_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1p3beta1_TextAnnotation_TextProperty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vision_v1p3beta1_Page_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1p3beta1_Page_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vision_v1p3beta1_Block_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1p3beta1_Block_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vision_v1p3beta1_Paragraph_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1p3beta1_Paragraph_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vision_v1p3beta1_Word_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1p3beta1_Word_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vision_v1p3beta1_Symbol_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1p3beta1_Symbol_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/vision/v1p3beta1/text_ann"
          + "otation.proto\022\035google.cloud.vision.v1p3b"
          + "eta1\032\034google/api/annotations.proto\032,goog"
          + "le/cloud/vision/v1p3beta1/geometry.proto"
          + "\"\262\004\n\016TextAnnotation\0222\n\005pages\030\001 \003(\0132#.goo"
          + "gle.cloud.vision.v1p3beta1.Page\022\014\n\004text\030"
          + "\002 \001(\t\032=\n\020DetectedLanguage\022\025\n\rlanguage_co"
          + "de\030\001 \001(\t\022\022\n\nconfidence\030\002 \001(\002\032\334\001\n\rDetecte"
          + "dBreak\022S\n\004type\030\001 \001(\0162E.google.cloud.visi"
          + "on.v1p3beta1.TextAnnotation.DetectedBrea"
          + "k.BreakType\022\021\n\tis_prefix\030\002 \001(\010\"c\n\tBreakT"
          + "ype\022\013\n\007UNKNOWN\020\000\022\t\n\005SPACE\020\001\022\016\n\nSURE_SPAC"
          + "E\020\002\022\022\n\016EOL_SURE_SPACE\020\003\022\n\n\006HYPHEN\020\004\022\016\n\nL"
          + "INE_BREAK\020\005\032\277\001\n\014TextProperty\022Z\n\022detected"
          + "_languages\030\001 \003(\0132>.google.cloud.vision.v"
          + "1p3beta1.TextAnnotation.DetectedLanguage"
          + "\022S\n\016detected_break\030\002 \001(\0132;.google.cloud."
          + "vision.v1p3beta1.TextAnnotation.Detected"
          + "Break\"\275\001\n\004Page\022L\n\010property\030\001 \001(\0132:.googl"
          + "e.cloud.vision.v1p3beta1.TextAnnotation."
          + "TextProperty\022\r\n\005width\030\002 \001(\005\022\016\n\006height\030\003 "
          + "\001(\005\0224\n\006blocks\030\004 \003(\0132$.google.cloud.visio"
          + "n.v1p3beta1.Block\022\022\n\nconfidence\030\005 \001(\002\"\202\003"
          + "\n\005Block\022L\n\010property\030\001 \001(\0132:.google.cloud"
          + ".vision.v1p3beta1.TextAnnotation.TextPro"
          + "perty\022A\n\014bounding_box\030\002 \001(\0132+.google.clo"
          + "ud.vision.v1p3beta1.BoundingPoly\022<\n\npara"
          + "graphs\030\003 \003(\0132(.google.cloud.vision.v1p3b"
          + "eta1.Paragraph\022B\n\nblock_type\030\004 \001(\0162..goo"
          + "gle.cloud.vision.v1p3beta1.Block.BlockTy"
          + "pe\022\022\n\nconfidence\030\005 \001(\002\"R\n\tBlockType\022\013\n\007U"
          + "NKNOWN\020\000\022\010\n\004TEXT\020\001\022\t\n\005TABLE\020\002\022\013\n\007PICTURE"
          + "\020\003\022\t\n\005RULER\020\004\022\013\n\007BARCODE\020\005\"\344\001\n\tParagraph"
          + "\022L\n\010property\030\001 \001(\0132:.google.cloud.vision"
          + ".v1p3beta1.TextAnnotation.TextProperty\022A"
          + "\n\014bounding_box\030\002 \001(\0132+.google.cloud.visi"
          + "on.v1p3beta1.BoundingPoly\0222\n\005words\030\003 \003(\013"
          + "2#.google.cloud.vision.v1p3beta1.Word\022\022\n"
          + "\nconfidence\030\004 \001(\002\"\343\001\n\004Word\022L\n\010property\030\001"
          + " \001(\0132:.google.cloud.vision.v1p3beta1.Tex"
          + "tAnnotation.TextProperty\022A\n\014bounding_box"
          + "\030\002 \001(\0132+.google.cloud.vision.v1p3beta1.B"
          + "oundingPoly\0226\n\007symbols\030\003 \003(\0132%.google.cl"
          + "oud.vision.v1p3beta1.Symbol\022\022\n\nconfidenc"
          + "e\030\004 \001(\002\"\273\001\n\006Symbol\022L\n\010property\030\001 \001(\0132:.g"
          + "oogle.cloud.vision.v1p3beta1.TextAnnotat"
          + "ion.TextProperty\022A\n\014bounding_box\030\002 \001(\0132+"
          + ".google.cloud.vision.v1p3beta1.BoundingP"
          + "oly\022\014\n\004text\030\003 \001(\t\022\022\n\nconfidence\030\004 \001(\002B\202\001"
          + "\n!com.google.cloud.vision.v1p3beta1B\023Tex"
          + "tAnnotationProtoP\001ZCgoogle.golang.org/ge"
          + "nproto/googleapis/cloud/vision/v1p3beta1"
          + ";vision\370\001\001b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.cloud.vision.v1p3beta1.GeometryProto.getDescriptor(),
            });
    internal_static_google_cloud_vision_v1p3beta1_TextAnnotation_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_vision_v1p3beta1_TextAnnotation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vision_v1p3beta1_TextAnnotation_descriptor,
            new java.lang.String[] {
              "Pages", "Text",
            });
    internal_static_google_cloud_vision_v1p3beta1_TextAnnotation_DetectedLanguage_descriptor =
        internal_static_google_cloud_vision_v1p3beta1_TextAnnotation_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_vision_v1p3beta1_TextAnnotation_DetectedLanguage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vision_v1p3beta1_TextAnnotation_DetectedLanguage_descriptor,
            new java.lang.String[] {
              "LanguageCode", "Confidence",
            });
    internal_static_google_cloud_vision_v1p3beta1_TextAnnotation_DetectedBreak_descriptor =
        internal_static_google_cloud_vision_v1p3beta1_TextAnnotation_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_vision_v1p3beta1_TextAnnotation_DetectedBreak_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vision_v1p3beta1_TextAnnotation_DetectedBreak_descriptor,
            new java.lang.String[] {
              "Type", "IsPrefix",
            });
    internal_static_google_cloud_vision_v1p3beta1_TextAnnotation_TextProperty_descriptor =
        internal_static_google_cloud_vision_v1p3beta1_TextAnnotation_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_vision_v1p3beta1_TextAnnotation_TextProperty_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vision_v1p3beta1_TextAnnotation_TextProperty_descriptor,
            new java.lang.String[] {
              "DetectedLanguages", "DetectedBreak",
            });
    internal_static_google_cloud_vision_v1p3beta1_Page_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_vision_v1p3beta1_Page_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vision_v1p3beta1_Page_descriptor,
            new java.lang.String[] {
              "Property", "Width", "Height", "Blocks", "Confidence",
            });
    internal_static_google_cloud_vision_v1p3beta1_Block_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_vision_v1p3beta1_Block_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vision_v1p3beta1_Block_descriptor,
            new java.lang.String[] {
              "Property", "BoundingBox", "Paragraphs", "BlockType", "Confidence",
            });
    internal_static_google_cloud_vision_v1p3beta1_Paragraph_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_vision_v1p3beta1_Paragraph_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vision_v1p3beta1_Paragraph_descriptor,
            new java.lang.String[] {
              "Property", "BoundingBox", "Words", "Confidence",
            });
    internal_static_google_cloud_vision_v1p3beta1_Word_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_vision_v1p3beta1_Word_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vision_v1p3beta1_Word_descriptor,
            new java.lang.String[] {
              "Property", "BoundingBox", "Symbols", "Confidence",
            });
    internal_static_google_cloud_vision_v1p3beta1_Symbol_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_vision_v1p3beta1_Symbol_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vision_v1p3beta1_Symbol_descriptor,
            new java.lang.String[] {
              "Property", "BoundingBox", "Text", "Confidence",
            });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.vision.v1p3beta1.GeometryProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
