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

public interface NodeGroupNodeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.NodeGroupNode)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Accelerators for this node.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AcceleratorConfig accelerators = 1141608;</code>
   */
  java.util.List<com.google.cloud.compute.v1.AcceleratorConfig> getAcceleratorsList();
  /**
   *
   *
   * <pre>
   * Accelerators for this node.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AcceleratorConfig accelerators = 1141608;</code>
   */
  com.google.cloud.compute.v1.AcceleratorConfig getAccelerators(int index);
  /**
   *
   *
   * <pre>
   * Accelerators for this node.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AcceleratorConfig accelerators = 1141608;</code>
   */
  int getAcceleratorsCount();
  /**
   *
   *
   * <pre>
   * Accelerators for this node.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AcceleratorConfig accelerators = 1141608;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.AcceleratorConfigOrBuilder>
      getAcceleratorsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Accelerators for this node.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AcceleratorConfig accelerators = 1141608;</code>
   */
  com.google.cloud.compute.v1.AcceleratorConfigOrBuilder getAcceleratorsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * CPU overcommit.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.NodeGroupNode.CpuOvercommitType cpu_overcommit_type = 247727959;
   * </code>
   *
   * @return The enum numeric value on the wire for cpuOvercommitType.
   */
  int getCpuOvercommitTypeValue();
  /**
   *
   *
   * <pre>
   * CPU overcommit.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.NodeGroupNode.CpuOvercommitType cpu_overcommit_type = 247727959;
   * </code>
   *
   * @return The cpuOvercommitType.
   */
  com.google.cloud.compute.v1.NodeGroupNode.CpuOvercommitType getCpuOvercommitType();

  /**
   *
   *
   * <pre>
   * Local disk configurations.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.LocalDisk disks = 95594102;</code>
   */
  java.util.List<com.google.cloud.compute.v1.LocalDisk> getDisksList();
  /**
   *
   *
   * <pre>
   * Local disk configurations.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.LocalDisk disks = 95594102;</code>
   */
  com.google.cloud.compute.v1.LocalDisk getDisks(int index);
  /**
   *
   *
   * <pre>
   * Local disk configurations.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.LocalDisk disks = 95594102;</code>
   */
  int getDisksCount();
  /**
   *
   *
   * <pre>
   * Local disk configurations.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.LocalDisk disks = 95594102;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.LocalDiskOrBuilder> getDisksOrBuilderList();
  /**
   *
   *
   * <pre>
   * Local disk configurations.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.LocalDisk disks = 95594102;</code>
   */
  com.google.cloud.compute.v1.LocalDiskOrBuilder getDisksOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Instances scheduled on this node.
   * </pre>
   *
   * <code>repeated string instances = 29097598;</code>
   *
   * @return A list containing the instances.
   */
  java.util.List<java.lang.String> getInstancesList();
  /**
   *
   *
   * <pre>
   * Instances scheduled on this node.
   * </pre>
   *
   * <code>repeated string instances = 29097598;</code>
   *
   * @return The count of instances.
   */
  int getInstancesCount();
  /**
   *
   *
   * <pre>
   * Instances scheduled on this node.
   * </pre>
   *
   * <code>repeated string instances = 29097598;</code>
   *
   * @param index The index of the element to return.
   * @return The instances at the given index.
   */
  java.lang.String getInstances(int index);
  /**
   *
   *
   * <pre>
   * Instances scheduled on this node.
   * </pre>
   *
   * <code>repeated string instances = 29097598;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the instances at the given index.
   */
  com.google.protobuf.ByteString getInstancesBytes(int index);

  /**
   *
   *
   * <pre>
   * The name of the node.
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
   * The name of the node.
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
   * The type of this node.
   * </pre>
   *
   * <code>string node_type = 197397335;</code>
   *
   * @return The nodeType.
   */
  java.lang.String getNodeType();
  /**
   *
   *
   * <pre>
   * The type of this node.
   * </pre>
   *
   * <code>string node_type = 197397335;</code>
   *
   * @return The bytes for nodeType.
   */
  com.google.protobuf.ByteString getNodeTypeBytes();

  /**
   *
   *
   * <pre>
   * Binding properties for the physical server.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.ServerBinding server_binding = 208179593;</code>
   *
   * @return Whether the serverBinding field is set.
   */
  boolean hasServerBinding();
  /**
   *
   *
   * <pre>
   * Binding properties for the physical server.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.ServerBinding server_binding = 208179593;</code>
   *
   * @return The serverBinding.
   */
  com.google.cloud.compute.v1.ServerBinding getServerBinding();
  /**
   *
   *
   * <pre>
   * Binding properties for the physical server.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.ServerBinding server_binding = 208179593;</code>
   */
  com.google.cloud.compute.v1.ServerBindingOrBuilder getServerBindingOrBuilder();

  /**
   *
   *
   * <pre>
   * Server ID associated with this node.
   * </pre>
   *
   * <code>string server_id = 70997911;</code>
   *
   * @return The serverId.
   */
  java.lang.String getServerId();
  /**
   *
   *
   * <pre>
   * Server ID associated with this node.
   * </pre>
   *
   * <code>string server_id = 70997911;</code>
   *
   * @return The bytes for serverId.
   */
  com.google.protobuf.ByteString getServerIdBytes();

  /**
   * <code>.google.cloud.compute.v1.NodeGroupNode.Status status = 181260274;</code>
   *
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.google.cloud.compute.v1.NodeGroupNode.Status status = 181260274;</code>
   *
   * @return The status.
   */
  com.google.cloud.compute.v1.NodeGroupNode.Status getStatus();
}
