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

public interface ResourcePolicyHourlyCycleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.ResourcePolicyHourlyCycle)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output only] Duration of the time window, automatically chosen to be smallest possible in the given scenario.
   * </pre>
   *
   * <code>string duration = 155471252;</code>
   *
   * @return The duration.
   */
  java.lang.String getDuration();
  /**
   *
   *
   * <pre>
   * [Output only] Duration of the time window, automatically chosen to be smallest possible in the given scenario.
   * </pre>
   *
   * <code>string duration = 155471252;</code>
   *
   * @return The bytes for duration.
   */
  com.google.protobuf.ByteString getDurationBytes();

  /**
   *
   *
   * <pre>
   * Defines a schedule with units measured in hours. The value determines how many hours pass between the start of each cycle.
   * </pre>
   *
   * <code>int32 hours_in_cycle = 258327676;</code>
   *
   * @return The hoursInCycle.
   */
  int getHoursInCycle();

  /**
   *
   *
   * <pre>
   * Time within the window to start the operations. It must be in format "HH:MM", where HH : [00-23] and MM : [00-00] GMT.
   * </pre>
   *
   * <code>string start_time = 37467274;</code>
   *
   * @return The startTime.
   */
  java.lang.String getStartTime();
  /**
   *
   *
   * <pre>
   * Time within the window to start the operations. It must be in format "HH:MM", where HH : [00-23] and MM : [00-00] GMT.
   * </pre>
   *
   * <code>string start_time = 37467274;</code>
   *
   * @return The bytes for startTime.
   */
  com.google.protobuf.ByteString getStartTimeBytes();
}
