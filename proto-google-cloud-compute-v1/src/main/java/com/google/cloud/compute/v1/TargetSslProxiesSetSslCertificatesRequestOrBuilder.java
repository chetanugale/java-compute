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

public interface TargetSslProxiesSetSslCertificatesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.TargetSslProxiesSetSslCertificatesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * New set of URLs to SslCertificate resources to associate with this TargetSslProxy. Currently exactly one ssl certificate must be specified.
   * </pre>
   *
   * <code>repeated string ssl_certificates = 97571087;</code>
   *
   * @return A list containing the sslCertificates.
   */
  java.util.List<java.lang.String> getSslCertificatesList();
  /**
   *
   *
   * <pre>
   * New set of URLs to SslCertificate resources to associate with this TargetSslProxy. Currently exactly one ssl certificate must be specified.
   * </pre>
   *
   * <code>repeated string ssl_certificates = 97571087;</code>
   *
   * @return The count of sslCertificates.
   */
  int getSslCertificatesCount();
  /**
   *
   *
   * <pre>
   * New set of URLs to SslCertificate resources to associate with this TargetSslProxy. Currently exactly one ssl certificate must be specified.
   * </pre>
   *
   * <code>repeated string ssl_certificates = 97571087;</code>
   *
   * @param index The index of the element to return.
   * @return The sslCertificates at the given index.
   */
  java.lang.String getSslCertificates(int index);
  /**
   *
   *
   * <pre>
   * New set of URLs to SslCertificate resources to associate with this TargetSslProxy. Currently exactly one ssl certificate must be specified.
   * </pre>
   *
   * <code>repeated string ssl_certificates = 97571087;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the sslCertificates at the given index.
   */
  com.google.protobuf.ByteString getSslCertificatesBytes(int index);
}
