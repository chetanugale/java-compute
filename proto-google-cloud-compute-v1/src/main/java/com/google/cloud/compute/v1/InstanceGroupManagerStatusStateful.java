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

/**
 *
 *
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.InstanceGroupManagerStatusStateful}
 */
public final class InstanceGroupManagerStatusStateful extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.InstanceGroupManagerStatusStateful)
    InstanceGroupManagerStatusStatefulOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InstanceGroupManagerStatusStateful.newBuilder() to construct.
  private InstanceGroupManagerStatusStateful(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InstanceGroupManagerStatusStateful() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InstanceGroupManagerStatusStateful();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private InstanceGroupManagerStatusStateful(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 883793792:
            {
              hasStatefulConfig_ = input.readBool();
              break;
            }
          case 2062636362:
            {
              com.google.cloud.compute.v1.InstanceGroupManagerStatusStatefulPerInstanceConfigs
                      .Builder
                  subBuilder = null;
              if (perInstanceConfigs_ != null) {
                subBuilder = perInstanceConfigs_.toBuilder();
              }
              perInstanceConfigs_ =
                  input.readMessage(
                      com.google.cloud.compute.v1
                          .InstanceGroupManagerStatusStatefulPerInstanceConfigs.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(perInstanceConfigs_);
                perInstanceConfigs_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstanceGroupManagerStatusStateful_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstanceGroupManagerStatusStateful_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.InstanceGroupManagerStatusStateful.class,
            com.google.cloud.compute.v1.InstanceGroupManagerStatusStateful.Builder.class);
  }

  public static final int HAS_STATEFUL_CONFIG_FIELD_NUMBER = 110474224;
  private boolean hasStatefulConfig_;
  /**
   *
   *
   * <pre>
   * [Output Only] A bit indicating whether the managed instance group has stateful configuration, that is, if you have configured any items in a stateful policy or in per-instance configs. The group might report that it has no stateful config even when there is still some preserved state on a managed instance, for example, if you have deleted all PICs but not yet applied those deletions.
   * </pre>
   *
   * <code>bool has_stateful_config = 110474224;</code>
   *
   * @return The hasStatefulConfig.
   */
  @java.lang.Override
  public boolean getHasStatefulConfig() {
    return hasStatefulConfig_;
  }

  public static final int PER_INSTANCE_CONFIGS_FIELD_NUMBER = 257829545;
  private com.google.cloud.compute.v1.InstanceGroupManagerStatusStatefulPerInstanceConfigs
      perInstanceConfigs_;
  /**
   *
   *
   * <pre>
   * [Output Only] Status of per-instance configs on the instance.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.InstanceGroupManagerStatusStatefulPerInstanceConfigs per_instance_configs = 257829545;
   * </code>
   *
   * @return Whether the perInstanceConfigs field is set.
   */
  @java.lang.Override
  public boolean hasPerInstanceConfigs() {
    return perInstanceConfigs_ != null;
  }
  /**
   *
   *
   * <pre>
   * [Output Only] Status of per-instance configs on the instance.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.InstanceGroupManagerStatusStatefulPerInstanceConfigs per_instance_configs = 257829545;
   * </code>
   *
   * @return The perInstanceConfigs.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.InstanceGroupManagerStatusStatefulPerInstanceConfigs
      getPerInstanceConfigs() {
    return perInstanceConfigs_ == null
        ? com.google.cloud.compute.v1.InstanceGroupManagerStatusStatefulPerInstanceConfigs
            .getDefaultInstance()
        : perInstanceConfigs_;
  }
  /**
   *
   *
   * <pre>
   * [Output Only] Status of per-instance configs on the instance.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.InstanceGroupManagerStatusStatefulPerInstanceConfigs per_instance_configs = 257829545;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.InstanceGroupManagerStatusStatefulPerInstanceConfigsOrBuilder
      getPerInstanceConfigsOrBuilder() {
    return getPerInstanceConfigs();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (hasStatefulConfig_ != false) {
      output.writeBool(110474224, hasStatefulConfig_);
    }
    if (perInstanceConfigs_ != null) {
      output.writeMessage(257829545, getPerInstanceConfigs());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hasStatefulConfig_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(110474224, hasStatefulConfig_);
    }
    if (perInstanceConfigs_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              257829545, getPerInstanceConfigs());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.compute.v1.InstanceGroupManagerStatusStateful)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.InstanceGroupManagerStatusStateful other =
        (com.google.cloud.compute.v1.InstanceGroupManagerStatusStateful) obj;

    if (getHasStatefulConfig() != other.getHasStatefulConfig()) return false;
    if (hasPerInstanceConfigs() != other.hasPerInstanceConfigs()) return false;
    if (hasPerInstanceConfigs()) {
      if (!getPerInstanceConfigs().equals(other.getPerInstanceConfigs())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + HAS_STATEFUL_CONFIG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getHasStatefulConfig());
    if (hasPerInstanceConfigs()) {
      hash = (37 * hash) + PER_INSTANCE_CONFIGS_FIELD_NUMBER;
      hash = (53 * hash) + getPerInstanceConfigs().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerStatusStateful parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerStatusStateful parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerStatusStateful parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerStatusStateful parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerStatusStateful parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerStatusStateful parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerStatusStateful parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerStatusStateful parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerStatusStateful parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerStatusStateful parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerStatusStateful parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerStatusStateful parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.compute.v1.InstanceGroupManagerStatusStateful prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.InstanceGroupManagerStatusStateful}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.InstanceGroupManagerStatusStateful)
      com.google.cloud.compute.v1.InstanceGroupManagerStatusStatefulOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceGroupManagerStatusStateful_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceGroupManagerStatusStateful_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.InstanceGroupManagerStatusStateful.class,
              com.google.cloud.compute.v1.InstanceGroupManagerStatusStateful.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.InstanceGroupManagerStatusStateful.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      hasStatefulConfig_ = false;

      if (perInstanceConfigsBuilder_ == null) {
        perInstanceConfigs_ = null;
      } else {
        perInstanceConfigs_ = null;
        perInstanceConfigsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceGroupManagerStatusStateful_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceGroupManagerStatusStateful
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.InstanceGroupManagerStatusStateful.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceGroupManagerStatusStateful build() {
      com.google.cloud.compute.v1.InstanceGroupManagerStatusStateful result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceGroupManagerStatusStateful buildPartial() {
      com.google.cloud.compute.v1.InstanceGroupManagerStatusStateful result =
          new com.google.cloud.compute.v1.InstanceGroupManagerStatusStateful(this);
      result.hasStatefulConfig_ = hasStatefulConfig_;
      if (perInstanceConfigsBuilder_ == null) {
        result.perInstanceConfigs_ = perInstanceConfigs_;
      } else {
        result.perInstanceConfigs_ = perInstanceConfigsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.compute.v1.InstanceGroupManagerStatusStateful) {
        return mergeFrom((com.google.cloud.compute.v1.InstanceGroupManagerStatusStateful) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.InstanceGroupManagerStatusStateful other) {
      if (other
          == com.google.cloud.compute.v1.InstanceGroupManagerStatusStateful.getDefaultInstance())
        return this;
      if (other.getHasStatefulConfig() != false) {
        setHasStatefulConfig(other.getHasStatefulConfig());
      }
      if (other.hasPerInstanceConfigs()) {
        mergePerInstanceConfigs(other.getPerInstanceConfigs());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.compute.v1.InstanceGroupManagerStatusStateful parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.compute.v1.InstanceGroupManagerStatusStateful)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean hasStatefulConfig_;
    /**
     *
     *
     * <pre>
     * [Output Only] A bit indicating whether the managed instance group has stateful configuration, that is, if you have configured any items in a stateful policy or in per-instance configs. The group might report that it has no stateful config even when there is still some preserved state on a managed instance, for example, if you have deleted all PICs but not yet applied those deletions.
     * </pre>
     *
     * <code>bool has_stateful_config = 110474224;</code>
     *
     * @return The hasStatefulConfig.
     */
    @java.lang.Override
    public boolean getHasStatefulConfig() {
      return hasStatefulConfig_;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A bit indicating whether the managed instance group has stateful configuration, that is, if you have configured any items in a stateful policy or in per-instance configs. The group might report that it has no stateful config even when there is still some preserved state on a managed instance, for example, if you have deleted all PICs but not yet applied those deletions.
     * </pre>
     *
     * <code>bool has_stateful_config = 110474224;</code>
     *
     * @param value The hasStatefulConfig to set.
     * @return This builder for chaining.
     */
    public Builder setHasStatefulConfig(boolean value) {

      hasStatefulConfig_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A bit indicating whether the managed instance group has stateful configuration, that is, if you have configured any items in a stateful policy or in per-instance configs. The group might report that it has no stateful config even when there is still some preserved state on a managed instance, for example, if you have deleted all PICs but not yet applied those deletions.
     * </pre>
     *
     * <code>bool has_stateful_config = 110474224;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearHasStatefulConfig() {

      hasStatefulConfig_ = false;
      onChanged();
      return this;
    }

    private com.google.cloud.compute.v1.InstanceGroupManagerStatusStatefulPerInstanceConfigs
        perInstanceConfigs_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.InstanceGroupManagerStatusStatefulPerInstanceConfigs,
            com.google.cloud.compute.v1.InstanceGroupManagerStatusStatefulPerInstanceConfigs
                .Builder,
            com.google.cloud.compute.v1
                .InstanceGroupManagerStatusStatefulPerInstanceConfigsOrBuilder>
        perInstanceConfigsBuilder_;
    /**
     *
     *
     * <pre>
     * [Output Only] Status of per-instance configs on the instance.
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.InstanceGroupManagerStatusStatefulPerInstanceConfigs per_instance_configs = 257829545;
     * </code>
     *
     * @return Whether the perInstanceConfigs field is set.
     */
    public boolean hasPerInstanceConfigs() {
      return perInstanceConfigsBuilder_ != null || perInstanceConfigs_ != null;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Status of per-instance configs on the instance.
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.InstanceGroupManagerStatusStatefulPerInstanceConfigs per_instance_configs = 257829545;
     * </code>
     *
     * @return The perInstanceConfigs.
     */
    public com.google.cloud.compute.v1.InstanceGroupManagerStatusStatefulPerInstanceConfigs
        getPerInstanceConfigs() {
      if (perInstanceConfigsBuilder_ == null) {
        return perInstanceConfigs_ == null
            ? com.google.cloud.compute.v1.InstanceGroupManagerStatusStatefulPerInstanceConfigs
                .getDefaultInstance()
            : perInstanceConfigs_;
      } else {
        return perInstanceConfigsBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Status of per-instance configs on the instance.
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.InstanceGroupManagerStatusStatefulPerInstanceConfigs per_instance_configs = 257829545;
     * </code>
     */
    public Builder setPerInstanceConfigs(
        com.google.cloud.compute.v1.InstanceGroupManagerStatusStatefulPerInstanceConfigs value) {
      if (perInstanceConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        perInstanceConfigs_ = value;
        onChanged();
      } else {
        perInstanceConfigsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Status of per-instance configs on the instance.
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.InstanceGroupManagerStatusStatefulPerInstanceConfigs per_instance_configs = 257829545;
     * </code>
     */
    public Builder setPerInstanceConfigs(
        com.google.cloud.compute.v1.InstanceGroupManagerStatusStatefulPerInstanceConfigs.Builder
            builderForValue) {
      if (perInstanceConfigsBuilder_ == null) {
        perInstanceConfigs_ = builderForValue.build();
        onChanged();
      } else {
        perInstanceConfigsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Status of per-instance configs on the instance.
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.InstanceGroupManagerStatusStatefulPerInstanceConfigs per_instance_configs = 257829545;
     * </code>
     */
    public Builder mergePerInstanceConfigs(
        com.google.cloud.compute.v1.InstanceGroupManagerStatusStatefulPerInstanceConfigs value) {
      if (perInstanceConfigsBuilder_ == null) {
        if (perInstanceConfigs_ != null) {
          perInstanceConfigs_ =
              com.google.cloud.compute.v1.InstanceGroupManagerStatusStatefulPerInstanceConfigs
                  .newBuilder(perInstanceConfigs_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          perInstanceConfigs_ = value;
        }
        onChanged();
      } else {
        perInstanceConfigsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Status of per-instance configs on the instance.
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.InstanceGroupManagerStatusStatefulPerInstanceConfigs per_instance_configs = 257829545;
     * </code>
     */
    public Builder clearPerInstanceConfigs() {
      if (perInstanceConfigsBuilder_ == null) {
        perInstanceConfigs_ = null;
        onChanged();
      } else {
        perInstanceConfigs_ = null;
        perInstanceConfigsBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Status of per-instance configs on the instance.
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.InstanceGroupManagerStatusStatefulPerInstanceConfigs per_instance_configs = 257829545;
     * </code>
     */
    public com.google.cloud.compute.v1.InstanceGroupManagerStatusStatefulPerInstanceConfigs.Builder
        getPerInstanceConfigsBuilder() {

      onChanged();
      return getPerInstanceConfigsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Status of per-instance configs on the instance.
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.InstanceGroupManagerStatusStatefulPerInstanceConfigs per_instance_configs = 257829545;
     * </code>
     */
    public com.google.cloud.compute.v1.InstanceGroupManagerStatusStatefulPerInstanceConfigsOrBuilder
        getPerInstanceConfigsOrBuilder() {
      if (perInstanceConfigsBuilder_ != null) {
        return perInstanceConfigsBuilder_.getMessageOrBuilder();
      } else {
        return perInstanceConfigs_ == null
            ? com.google.cloud.compute.v1.InstanceGroupManagerStatusStatefulPerInstanceConfigs
                .getDefaultInstance()
            : perInstanceConfigs_;
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Status of per-instance configs on the instance.
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.InstanceGroupManagerStatusStatefulPerInstanceConfigs per_instance_configs = 257829545;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.InstanceGroupManagerStatusStatefulPerInstanceConfigs,
            com.google.cloud.compute.v1.InstanceGroupManagerStatusStatefulPerInstanceConfigs
                .Builder,
            com.google.cloud.compute.v1
                .InstanceGroupManagerStatusStatefulPerInstanceConfigsOrBuilder>
        getPerInstanceConfigsFieldBuilder() {
      if (perInstanceConfigsBuilder_ == null) {
        perInstanceConfigsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.compute.v1.InstanceGroupManagerStatusStatefulPerInstanceConfigs,
                com.google.cloud.compute.v1.InstanceGroupManagerStatusStatefulPerInstanceConfigs
                    .Builder,
                com.google.cloud.compute.v1
                    .InstanceGroupManagerStatusStatefulPerInstanceConfigsOrBuilder>(
                getPerInstanceConfigs(), getParentForChildren(), isClean());
        perInstanceConfigs_ = null;
      }
      return perInstanceConfigsBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.InstanceGroupManagerStatusStateful)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.InstanceGroupManagerStatusStateful)
  private static final com.google.cloud.compute.v1.InstanceGroupManagerStatusStateful
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.InstanceGroupManagerStatusStateful();
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerStatusStateful
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InstanceGroupManagerStatusStateful> PARSER =
      new com.google.protobuf.AbstractParser<InstanceGroupManagerStatusStateful>() {
        @java.lang.Override
        public InstanceGroupManagerStatusStateful parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new InstanceGroupManagerStatusStateful(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<InstanceGroupManagerStatusStateful> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstanceGroupManagerStatusStateful> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.InstanceGroupManagerStatusStateful
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
