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

public interface NetworksAddPeeringRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.NetworksAddPeeringRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * This field will be deprecated soon. Use exchange_subnet_routes in network_peering instead. Indicates whether full mesh connectivity is created and managed automatically between peered networks. Currently this field should always be true since Google Compute Engine will automatically create and manage subnetwork routes between two networks when peering state is ACTIVE.
   * </pre>
   *
   * <code>bool auto_create_routes = 57454941;</code>
   *
   * @return The autoCreateRoutes.
   */
  boolean getAutoCreateRoutes();

  /**
   *
   *
   * <pre>
   * Name of the peering, which should conform to RFC1035.
   * </pre>
   *
   * <code>string name = 3373707;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Name of the peering, which should conform to RFC1035.
   * </pre>
   *
   * <code>string name = 3373707;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Network peering parameters. In order to specify route policies for peering using import and export custom routes, you must specify all peering related parameters (name, peer network, exchange_subnet_routes) in the network_peering field. The corresponding fields in NetworksAddPeeringRequest will be deprecated soon.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.NetworkPeering network_peering = 60491311;</code>
   *
   * @return Whether the networkPeering field is set.
   */
  boolean hasNetworkPeering();
  /**
   *
   *
   * <pre>
   * Network peering parameters. In order to specify route policies for peering using import and export custom routes, you must specify all peering related parameters (name, peer network, exchange_subnet_routes) in the network_peering field. The corresponding fields in NetworksAddPeeringRequest will be deprecated soon.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.NetworkPeering network_peering = 60491311;</code>
   *
   * @return The networkPeering.
   */
  com.google.cloud.compute.v1.NetworkPeering getNetworkPeering();
  /**
   *
   *
   * <pre>
   * Network peering parameters. In order to specify route policies for peering using import and export custom routes, you must specify all peering related parameters (name, peer network, exchange_subnet_routes) in the network_peering field. The corresponding fields in NetworksAddPeeringRequest will be deprecated soon.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.NetworkPeering network_peering = 60491311;</code>
   */
  com.google.cloud.compute.v1.NetworkPeeringOrBuilder getNetworkPeeringOrBuilder();

  /**
   *
   *
   * <pre>
   * URL of the peer network. It can be either full URL or partial URL. The peer network may belong to a different project. If the partial URL does not contain project, it is assumed that the peer network is in the same project as the current network.
   * </pre>
   *
   * <code>string peer_network = 232190033;</code>
   *
   * @return The peerNetwork.
   */
  java.lang.String getPeerNetwork();
  /**
   *
   *
   * <pre>
   * URL of the peer network. It can be either full URL or partial URL. The peer network may belong to a different project. If the partial URL does not contain project, it is assumed that the peer network is in the same project as the current network.
   * </pre>
   *
   * <code>string peer_network = 232190033;</code>
   *
   * @return The bytes for peerNetwork.
   */
  com.google.protobuf.ByteString getPeerNetworkBytes();
}
