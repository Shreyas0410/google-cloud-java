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
// source: google/cloud/vision/v1p4beta1/product_search_service.proto

package com.google.cloud.vision.v1p4beta1;

public interface ProductSetPurgeConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p4beta1.ProductSetPurgeConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The ProductSet that contains the Products to delete. If a Product is a
   * member of product_set_id in addition to other ProductSets, the Product will
   * still be deleted.
   * </pre>
   *
   * <code>string product_set_id = 1;</code>
   *
   * @return The productSetId.
   */
  java.lang.String getProductSetId();
  /**
   *
   *
   * <pre>
   * The ProductSet that contains the Products to delete. If a Product is a
   * member of product_set_id in addition to other ProductSets, the Product will
   * still be deleted.
   * </pre>
   *
   * <code>string product_set_id = 1;</code>
   *
   * @return The bytes for productSetId.
   */
  com.google.protobuf.ByteString getProductSetIdBytes();
}
