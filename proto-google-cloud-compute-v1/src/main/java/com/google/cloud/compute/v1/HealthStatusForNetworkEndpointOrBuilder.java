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

public interface HealthStatusForNetworkEndpointOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.HealthStatusForNetworkEndpoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * URL of the backend service associated with the health state of the network endpoint.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.BackendServiceReference backend_service = 38510602;</code>
   *
   * @return Whether the backendService field is set.
   */
  boolean hasBackendService();
  /**
   *
   *
   * <pre>
   * URL of the backend service associated with the health state of the network endpoint.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.BackendServiceReference backend_service = 38510602;</code>
   *
   * @return The backendService.
   */
  com.google.cloud.compute.v1.BackendServiceReference getBackendService();
  /**
   *
   *
   * <pre>
   * URL of the backend service associated with the health state of the network endpoint.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.BackendServiceReference backend_service = 38510602;</code>
   */
  com.google.cloud.compute.v1.BackendServiceReferenceOrBuilder getBackendServiceOrBuilder();

  /**
   *
   *
   * <pre>
   * URL of the forwarding rule associated with the health state of the network endpoint.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.ForwardingRuleReference forwarding_rule = 1528574;</code>
   *
   * @return Whether the forwardingRule field is set.
   */
  boolean hasForwardingRule();
  /**
   *
   *
   * <pre>
   * URL of the forwarding rule associated with the health state of the network endpoint.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.ForwardingRuleReference forwarding_rule = 1528574;</code>
   *
   * @return The forwardingRule.
   */
  com.google.cloud.compute.v1.ForwardingRuleReference getForwardingRule();
  /**
   *
   *
   * <pre>
   * URL of the forwarding rule associated with the health state of the network endpoint.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.ForwardingRuleReference forwarding_rule = 1528574;</code>
   */
  com.google.cloud.compute.v1.ForwardingRuleReferenceOrBuilder getForwardingRuleOrBuilder();

  /**
   *
   *
   * <pre>
   * URL of the health check associated with the health state of the network endpoint.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HealthCheckReference health_check = 40441189;</code>
   *
   * @return Whether the healthCheck field is set.
   */
  boolean hasHealthCheck();
  /**
   *
   *
   * <pre>
   * URL of the health check associated with the health state of the network endpoint.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HealthCheckReference health_check = 40441189;</code>
   *
   * @return The healthCheck.
   */
  com.google.cloud.compute.v1.HealthCheckReference getHealthCheck();
  /**
   *
   *
   * <pre>
   * URL of the health check associated with the health state of the network endpoint.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HealthCheckReference health_check = 40441189;</code>
   */
  com.google.cloud.compute.v1.HealthCheckReferenceOrBuilder getHealthCheckOrBuilder();

  /**
   *
   *
   * <pre>
   * URL of the health check service associated with the health state of the network endpoint.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HealthCheckServiceReference health_check_service = 139939291;
   * </code>
   *
   * @return Whether the healthCheckService field is set.
   */
  boolean hasHealthCheckService();
  /**
   *
   *
   * <pre>
   * URL of the health check service associated with the health state of the network endpoint.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HealthCheckServiceReference health_check_service = 139939291;
   * </code>
   *
   * @return The healthCheckService.
   */
  com.google.cloud.compute.v1.HealthCheckServiceReference getHealthCheckService();
  /**
   *
   *
   * <pre>
   * URL of the health check service associated with the health state of the network endpoint.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HealthCheckServiceReference health_check_service = 139939291;
   * </code>
   */
  com.google.cloud.compute.v1.HealthCheckServiceReferenceOrBuilder getHealthCheckServiceOrBuilder();

  /**
   *
   *
   * <pre>
   * Health state of the network endpoint determined based on the health checks configured.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.HealthStatusForNetworkEndpoint.HealthState health_state = 55571694;
   * </code>
   *
   * @return The enum numeric value on the wire for healthState.
   */
  int getHealthStateValue();
  /**
   *
   *
   * <pre>
   * Health state of the network endpoint determined based on the health checks configured.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.HealthStatusForNetworkEndpoint.HealthState health_state = 55571694;
   * </code>
   *
   * @return The healthState.
   */
  com.google.cloud.compute.v1.HealthStatusForNetworkEndpoint.HealthState getHealthState();
}
