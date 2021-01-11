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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface SerialPortOutputOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.SerialPortOutput)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] The contents of the console output.
   * </pre>
   *
   * <code>string contents = 237984538;</code>
   *
   * @return The contents.
   */
  java.lang.String getContents();
  /**
   *
   *
   * <pre>
   * [Output Only] The contents of the console output.
   * </pre>
   *
   * <code>string contents = 237984538;</code>
   *
   * @return The bytes for contents.
   */
  com.google.protobuf.ByteString getContentsBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#serialPortOutput for serial port output.
   * </pre>
   *
   * <code>string kind = 3292052;</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#serialPortOutput for serial port output.
   * </pre>
   *
   * <code>string kind = 3292052;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The position of the next byte of content, regardless of whether the content exists, following the output returned in the `contents` property. Use this value in the next request as the start parameter.
   * </pre>
   *
   * <code>string next = 3377907;</code>
   *
   * @return The next.
   */
  java.lang.String getNext();
  /**
   *
   *
   * <pre>
   * [Output Only] The position of the next byte of content, regardless of whether the content exists, following the output returned in the `contents` property. Use this value in the next request as the start parameter.
   * </pre>
   *
   * <code>string next = 3377907;</code>
   *
   * @return The bytes for next.
   */
  com.google.protobuf.ByteString getNextBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for this resource.
   * </pre>
   *
   * <code>string self_link = 187779341;</code>
   *
   * @return The selfLink.
   */
  java.lang.String getSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for this resource.
   * </pre>
   *
   * <code>string self_link = 187779341;</code>
   *
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString getSelfLinkBytes();

  /**
   *
   *
   * <pre>
   * The starting byte position of the output that was returned. This should match the start parameter sent with the request. If the serial console output exceeds the size of the buffer (1 MB), older output is overwritten by newer content. The output start value will indicate the byte position of the output that was returned, which might be different than the `start` value that was specified in the request.
   * </pre>
   *
   * <code>string start = 109757538;</code>
   *
   * @return The start.
   */
  java.lang.String getStart();
  /**
   *
   *
   * <pre>
   * The starting byte position of the output that was returned. This should match the start parameter sent with the request. If the serial console output exceeds the size of the buffer (1 MB), older output is overwritten by newer content. The output start value will indicate the byte position of the output that was returned, which might be different than the `start` value that was specified in the request.
   * </pre>
   *
   * <code>string start = 109757538;</code>
   *
   * @return The bytes for start.
   */
  com.google.protobuf.ByteString getStartBytes();
}
