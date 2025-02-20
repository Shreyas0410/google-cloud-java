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
// source: google/cloud/deploy/v1/release_render_payload.proto

package com.google.cloud.deploy.v1;

public interface ReleaseRenderEventOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.ReleaseRenderEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Debug message for when a render transition occurs. Provides further
   * details as rendering progresses through render states.
   * </pre>
   *
   * <code>string message = 1;</code>
   *
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   *
   *
   * <pre>
   * Debug message for when a render transition occurs. Provides further
   * details as rendering progresses through render states.
   * </pre>
   *
   * <code>string message = 1;</code>
   *
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString getMessageBytes();

  /**
   *
   *
   * <pre>
   * The name of the `Release`.
   * </pre>
   *
   * <code>string release = 2;</code>
   *
   * @return The release.
   */
  java.lang.String getRelease();
  /**
   *
   *
   * <pre>
   * The name of the `Release`.
   * </pre>
   *
   * <code>string release = 2;</code>
   *
   * @return The bytes for release.
   */
  com.google.protobuf.ByteString getReleaseBytes();
}
