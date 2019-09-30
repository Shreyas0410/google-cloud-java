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
// source: google/cloud/automl/v1/annotation_payload.proto

package com.google.cloud.automl.v1;

public interface AnnotationPayloadOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1.AnnotationPayload)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Annotation details for translation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.TranslationAnnotation translation = 2;</code>
   */
  boolean hasTranslation();
  /**
   *
   *
   * <pre>
   * Annotation details for translation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.TranslationAnnotation translation = 2;</code>
   */
  com.google.cloud.automl.v1.TranslationAnnotation getTranslation();
  /**
   *
   *
   * <pre>
   * Annotation details for translation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.TranslationAnnotation translation = 2;</code>
   */
  com.google.cloud.automl.v1.TranslationAnnotationOrBuilder getTranslationOrBuilder();

  public com.google.cloud.automl.v1.AnnotationPayload.DetailCase getDetailCase();
}
