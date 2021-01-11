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

public interface SecurityPolicyRuleMatcherOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.SecurityPolicyRuleMatcher)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The configuration options available when specifying versioned_expr. This field must be specified if versioned_expr is specified and cannot be specified if versioned_expr is not specified.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig config = 255820610;</code>
   *
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   *
   *
   * <pre>
   * The configuration options available when specifying versioned_expr. This field must be specified if versioned_expr is specified and cannot be specified if versioned_expr is not specified.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig config = 255820610;</code>
   *
   * @return The config.
   */
  com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig getConfig();
  /**
   *
   *
   * <pre>
   * The configuration options available when specifying versioned_expr. This field must be specified if versioned_expr is specified and cannot be specified if versioned_expr is not specified.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig config = 255820610;</code>
   */
  com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfigOrBuilder getConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * User defined CEVAL expression. A CEVAL expression is used to specify match criteria such as origin.ip, source.region_code and contents in the request header.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Expr expr = 3127797;</code>
   *
   * @return Whether the expr field is set.
   */
  boolean hasExpr();
  /**
   *
   *
   * <pre>
   * User defined CEVAL expression. A CEVAL expression is used to specify match criteria such as origin.ip, source.region_code and contents in the request header.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Expr expr = 3127797;</code>
   *
   * @return The expr.
   */
  com.google.cloud.compute.v1.Expr getExpr();
  /**
   *
   *
   * <pre>
   * User defined CEVAL expression. A CEVAL expression is used to specify match criteria such as origin.ip, source.region_code and contents in the request header.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Expr expr = 3127797;</code>
   */
  com.google.cloud.compute.v1.ExprOrBuilder getExprOrBuilder();

  /**
   *
   *
   * <pre>
   * Preconfigured versioned expression. If this field is specified, config must also be specified. Available preconfigured expressions along with their requirements are: SRC_IPS_V1 - must specify the corresponding src_ip_range field in config.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.SecurityPolicyRuleMatcher.VersionedExpr versioned_expr = 53850557;
   * </code>
   *
   * @return The enum numeric value on the wire for versionedExpr.
   */
  int getVersionedExprValue();
  /**
   *
   *
   * <pre>
   * Preconfigured versioned expression. If this field is specified, config must also be specified. Available preconfigured expressions along with their requirements are: SRC_IPS_V1 - must specify the corresponding src_ip_range field in config.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.SecurityPolicyRuleMatcher.VersionedExpr versioned_expr = 53850557;
   * </code>
   *
   * @return The versionedExpr.
   */
  com.google.cloud.compute.v1.SecurityPolicyRuleMatcher.VersionedExpr getVersionedExpr();
}
