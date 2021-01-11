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

public interface InterconnectDiagnosticsLinkLACPStatusOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InterconnectDiagnosticsLinkLACPStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * System ID of the port on Google's side of the LACP exchange.
   * </pre>
   *
   * <code>string google_system_id = 91210405;</code>
   *
   * @return The googleSystemId.
   */
  java.lang.String getGoogleSystemId();
  /**
   *
   *
   * <pre>
   * System ID of the port on Google's side of the LACP exchange.
   * </pre>
   *
   * <code>string google_system_id = 91210405;</code>
   *
   * @return The bytes for googleSystemId.
   */
  com.google.protobuf.ByteString getGoogleSystemIdBytes();

  /**
   *
   *
   * <pre>
   * System ID of the port on the neighbor's side of the LACP exchange.
   * </pre>
   *
   * <code>string neighbor_system_id = 75385886;</code>
   *
   * @return The neighborSystemId.
   */
  java.lang.String getNeighborSystemId();
  /**
   *
   *
   * <pre>
   * System ID of the port on the neighbor's side of the LACP exchange.
   * </pre>
   *
   * <code>string neighbor_system_id = 75385886;</code>
   *
   * @return The bytes for neighborSystemId.
   */
  com.google.protobuf.ByteString getNeighborSystemIdBytes();

  /**
   *
   *
   * <pre>
   * The state of a LACP link, which can take one of the following values:
   * - ACTIVE: The link is configured and active within the bundle.
   * - DETACHED: The link is not configured within the bundle. This means that the rest of the object should be empty.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.InterconnectDiagnosticsLinkLACPStatus.State state = 109757585;
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * The state of a LACP link, which can take one of the following values:
   * - ACTIVE: The link is configured and active within the bundle.
   * - DETACHED: The link is not configured within the bundle. This means that the rest of the object should be empty.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.InterconnectDiagnosticsLinkLACPStatus.State state = 109757585;
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.compute.v1.InterconnectDiagnosticsLinkLACPStatus.State getState();
}
