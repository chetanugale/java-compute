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

public interface ManagedInstanceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.ManagedInstance)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] The current action that the managed instance group has scheduled for the instance. Possible values:
   * - NONE The instance is running, and the managed instance group does not have any scheduled actions for this instance.
   * - CREATING The managed instance group is creating this instance. If the group fails to create this instance, it will try again until it is successful.
   * - CREATING_WITHOUT_RETRIES The managed instance group is attempting to create this instance only once. If the group fails to create this instance, it does not try again and the group's targetSize value is decreased instead.
   * - RECREATING The managed instance group is recreating this instance.
   * - DELETING The managed instance group is permanently deleting this instance.
   * - ABANDONING The managed instance group is abandoning this instance. The instance will be removed from the instance group and from any target pools that are associated with this group.
   * - RESTARTING The managed instance group is restarting the instance.
   * - REFRESHING The managed instance group is applying configuration changes to the instance without stopping it. For example, the group can update the target pool list for an instance without stopping that instance.
   * - VERIFYING The managed instance group has created the instance and it is in the process of being verified.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.ManagedInstance.CurrentAction current_action = 178475964;</code>
   *
   * @return The enum numeric value on the wire for currentAction.
   */
  int getCurrentActionValue();
  /**
   *
   *
   * <pre>
   * [Output Only] The current action that the managed instance group has scheduled for the instance. Possible values:
   * - NONE The instance is running, and the managed instance group does not have any scheduled actions for this instance.
   * - CREATING The managed instance group is creating this instance. If the group fails to create this instance, it will try again until it is successful.
   * - CREATING_WITHOUT_RETRIES The managed instance group is attempting to create this instance only once. If the group fails to create this instance, it does not try again and the group's targetSize value is decreased instead.
   * - RECREATING The managed instance group is recreating this instance.
   * - DELETING The managed instance group is permanently deleting this instance.
   * - ABANDONING The managed instance group is abandoning this instance. The instance will be removed from the instance group and from any target pools that are associated with this group.
   * - RESTARTING The managed instance group is restarting the instance.
   * - REFRESHING The managed instance group is applying configuration changes to the instance without stopping it. For example, the group can update the target pool list for an instance without stopping that instance.
   * - VERIFYING The managed instance group has created the instance and it is in the process of being verified.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.ManagedInstance.CurrentAction current_action = 178475964;</code>
   *
   * @return The currentAction.
   */
  com.google.cloud.compute.v1.ManagedInstance.CurrentAction getCurrentAction();

  /**
   *
   *
   * <pre>
   * [Output only] The unique identifier for this resource. This field is empty when instance does not exist.
   * </pre>
   *
   * <code>string id = 3355;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * [Output only] The unique identifier for this resource. This field is empty when instance does not exist.
   * </pre>
   *
   * <code>string id = 3355;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The URL of the instance. The URL can exist even if the instance has not yet been created.
   * </pre>
   *
   * <code>string instance = 18257045;</code>
   *
   * @return The instance.
   */
  java.lang.String getInstance();
  /**
   *
   *
   * <pre>
   * [Output Only] The URL of the instance. The URL can exist even if the instance has not yet been created.
   * </pre>
   *
   * <code>string instance = 18257045;</code>
   *
   * @return The bytes for instance.
   */
  com.google.protobuf.ByteString getInstanceBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Health state of the instance per health-check.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.ManagedInstanceInstanceHealth instance_health = 114231622;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.ManagedInstanceInstanceHealth> getInstanceHealthList();
  /**
   *
   *
   * <pre>
   * [Output Only] Health state of the instance per health-check.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.ManagedInstanceInstanceHealth instance_health = 114231622;
   * </code>
   */
  com.google.cloud.compute.v1.ManagedInstanceInstanceHealth getInstanceHealth(int index);
  /**
   *
   *
   * <pre>
   * [Output Only] Health state of the instance per health-check.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.ManagedInstanceInstanceHealth instance_health = 114231622;
   * </code>
   */
  int getInstanceHealthCount();
  /**
   *
   *
   * <pre>
   * [Output Only] Health state of the instance per health-check.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.ManagedInstanceInstanceHealth instance_health = 114231622;
   * </code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.ManagedInstanceInstanceHealthOrBuilder>
      getInstanceHealthOrBuilderList();
  /**
   *
   *
   * <pre>
   * [Output Only] Health state of the instance per health-check.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.ManagedInstanceInstanceHealth instance_health = 114231622;
   * </code>
   */
  com.google.cloud.compute.v1.ManagedInstanceInstanceHealthOrBuilder getInstanceHealthOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * [Output Only] The status of the instance. This field is empty when the instance does not exist.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.ManagedInstance.InstanceStatus instance_status = 174577372;
   * </code>
   *
   * @return The enum numeric value on the wire for instanceStatus.
   */
  int getInstanceStatusValue();
  /**
   *
   *
   * <pre>
   * [Output Only] The status of the instance. This field is empty when the instance does not exist.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.ManagedInstance.InstanceStatus instance_status = 174577372;
   * </code>
   *
   * @return The instanceStatus.
   */
  com.google.cloud.compute.v1.ManagedInstance.InstanceStatus getInstanceStatus();

  /**
   *
   *
   * <pre>
   * [Output Only] Information about the last attempt to create or delete the instance.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.ManagedInstanceLastAttempt last_attempt = 166336036;</code>
   *
   * @return Whether the lastAttempt field is set.
   */
  boolean hasLastAttempt();
  /**
   *
   *
   * <pre>
   * [Output Only] Information about the last attempt to create or delete the instance.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.ManagedInstanceLastAttempt last_attempt = 166336036;</code>
   *
   * @return The lastAttempt.
   */
  com.google.cloud.compute.v1.ManagedInstanceLastAttempt getLastAttempt();
  /**
   *
   *
   * <pre>
   * [Output Only] Information about the last attempt to create or delete the instance.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.ManagedInstanceLastAttempt last_attempt = 166336036;</code>
   */
  com.google.cloud.compute.v1.ManagedInstanceLastAttemptOrBuilder getLastAttemptOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] Preserved state applied from per-instance config for this instance.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.PreservedState preserved_state_from_config = 98661858;</code>
   *
   * @return Whether the preservedStateFromConfig field is set.
   */
  boolean hasPreservedStateFromConfig();
  /**
   *
   *
   * <pre>
   * [Output Only] Preserved state applied from per-instance config for this instance.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.PreservedState preserved_state_from_config = 98661858;</code>
   *
   * @return The preservedStateFromConfig.
   */
  com.google.cloud.compute.v1.PreservedState getPreservedStateFromConfig();
  /**
   *
   *
   * <pre>
   * [Output Only] Preserved state applied from per-instance config for this instance.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.PreservedState preserved_state_from_config = 98661858;</code>
   */
  com.google.cloud.compute.v1.PreservedStateOrBuilder getPreservedStateFromConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] Preserved state generated based on stateful policy for this instance.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.PreservedState preserved_state_from_policy = 202348498;</code>
   *
   * @return Whether the preservedStateFromPolicy field is set.
   */
  boolean hasPreservedStateFromPolicy();
  /**
   *
   *
   * <pre>
   * [Output Only] Preserved state generated based on stateful policy for this instance.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.PreservedState preserved_state_from_policy = 202348498;</code>
   *
   * @return The preservedStateFromPolicy.
   */
  com.google.cloud.compute.v1.PreservedState getPreservedStateFromPolicy();
  /**
   *
   *
   * <pre>
   * [Output Only] Preserved state generated based on stateful policy for this instance.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.PreservedState preserved_state_from_policy = 202348498;</code>
   */
  com.google.cloud.compute.v1.PreservedStateOrBuilder getPreservedStateFromPolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] Intended version of this instance.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.ManagedInstanceVersion version = 83172568;</code>
   *
   * @return Whether the version field is set.
   */
  boolean hasVersion();
  /**
   *
   *
   * <pre>
   * [Output Only] Intended version of this instance.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.ManagedInstanceVersion version = 83172568;</code>
   *
   * @return The version.
   */
  com.google.cloud.compute.v1.ManagedInstanceVersion getVersion();
  /**
   *
   *
   * <pre>
   * [Output Only] Intended version of this instance.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.ManagedInstanceVersion version = 83172568;</code>
   */
  com.google.cloud.compute.v1.ManagedInstanceVersionOrBuilder getVersionOrBuilder();
}
