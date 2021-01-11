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
 * Write a Cloud Audit log
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.LogConfigCloudAuditOptions}
 */
public final class LogConfigCloudAuditOptions extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.LogConfigCloudAuditOptions)
    LogConfigCloudAuditOptionsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use LogConfigCloudAuditOptions.newBuilder() to construct.
  private LogConfigCloudAuditOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LogConfigCloudAuditOptions() {
    logName_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LogConfigCloudAuditOptions();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private LogConfigCloudAuditOptions(
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
          case 1075828016:
            {
              int rawValue = input.readEnum();

              logName_ = rawValue;
              break;
            }
          case 1742892994:
            {
              com.google.cloud.compute.v1.AuthorizationLoggingOptions.Builder subBuilder = null;
              if (authorizationLoggingOptions_ != null) {
                subBuilder = authorizationLoggingOptions_.toBuilder();
              }
              authorizationLoggingOptions_ =
                  input.readMessage(
                      com.google.cloud.compute.v1.AuthorizationLoggingOptions.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(authorizationLoggingOptions_);
                authorizationLoggingOptions_ = subBuilder.buildPartial();
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
        .internal_static_google_cloud_compute_v1_LogConfigCloudAuditOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_LogConfigCloudAuditOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.LogConfigCloudAuditOptions.class,
            com.google.cloud.compute.v1.LogConfigCloudAuditOptions.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * The log_name to populate in the Cloud Audit Record.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.compute.v1.LogConfigCloudAuditOptions.LogName}
   */
  public enum LogName implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_LOG_NAME = 0;</code>
     */
    UNDEFINED_LOG_NAME(0),
    /** <code>ADMIN_ACTIVITY = 159067679;</code> */
    ADMIN_ACTIVITY(159067679),
    /** <code>DATA_ACCESS = 238070681;</code> */
    DATA_ACCESS(238070681),
    /** <code>UNSPECIFIED_LOG_NAME = 142079726;</code> */
    UNSPECIFIED_LOG_NAME(142079726),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_LOG_NAME = 0;</code>
     */
    public static final int UNDEFINED_LOG_NAME_VALUE = 0;
    /** <code>ADMIN_ACTIVITY = 159067679;</code> */
    public static final int ADMIN_ACTIVITY_VALUE = 159067679;
    /** <code>DATA_ACCESS = 238070681;</code> */
    public static final int DATA_ACCESS_VALUE = 238070681;
    /** <code>UNSPECIFIED_LOG_NAME = 142079726;</code> */
    public static final int UNSPECIFIED_LOG_NAME_VALUE = 142079726;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static LogName valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static LogName forNumber(int value) {
      switch (value) {
        case 0:
          return UNDEFINED_LOG_NAME;
        case 159067679:
          return ADMIN_ACTIVITY;
        case 238070681:
          return DATA_ACCESS;
        case 142079726:
          return UNSPECIFIED_LOG_NAME;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<LogName> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<LogName> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<LogName>() {
          public LogName findValueByNumber(int number) {
            return LogName.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.compute.v1.LogConfigCloudAuditOptions.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final LogName[] VALUES = values();

    public static LogName valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private LogName(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.compute.v1.LogConfigCloudAuditOptions.LogName)
  }

  public static final int AUTHORIZATION_LOGGING_OPTIONS_FIELD_NUMBER = 217861624;
  private com.google.cloud.compute.v1.AuthorizationLoggingOptions authorizationLoggingOptions_;
  /**
   *
   *
   * <pre>
   * Information used by the Cloud Audit Logging pipeline.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.AuthorizationLoggingOptions authorization_logging_options = 217861624;
   * </code>
   *
   * @return Whether the authorizationLoggingOptions field is set.
   */
  @java.lang.Override
  public boolean hasAuthorizationLoggingOptions() {
    return authorizationLoggingOptions_ != null;
  }
  /**
   *
   *
   * <pre>
   * Information used by the Cloud Audit Logging pipeline.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.AuthorizationLoggingOptions authorization_logging_options = 217861624;
   * </code>
   *
   * @return The authorizationLoggingOptions.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.AuthorizationLoggingOptions getAuthorizationLoggingOptions() {
    return authorizationLoggingOptions_ == null
        ? com.google.cloud.compute.v1.AuthorizationLoggingOptions.getDefaultInstance()
        : authorizationLoggingOptions_;
  }
  /**
   *
   *
   * <pre>
   * Information used by the Cloud Audit Logging pipeline.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.AuthorizationLoggingOptions authorization_logging_options = 217861624;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.AuthorizationLoggingOptionsOrBuilder
      getAuthorizationLoggingOptionsOrBuilder() {
    return getAuthorizationLoggingOptions();
  }

  public static final int LOG_NAME_FIELD_NUMBER = 134478502;
  private int logName_;
  /**
   *
   *
   * <pre>
   * The log_name to populate in the Cloud Audit Record.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.LogConfigCloudAuditOptions.LogName log_name = 134478502;</code>
   *
   * @return The enum numeric value on the wire for logName.
   */
  @java.lang.Override
  public int getLogNameValue() {
    return logName_;
  }
  /**
   *
   *
   * <pre>
   * The log_name to populate in the Cloud Audit Record.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.LogConfigCloudAuditOptions.LogName log_name = 134478502;</code>
   *
   * @return The logName.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.LogConfigCloudAuditOptions.LogName getLogName() {
    @SuppressWarnings("deprecation")
    com.google.cloud.compute.v1.LogConfigCloudAuditOptions.LogName result =
        com.google.cloud.compute.v1.LogConfigCloudAuditOptions.LogName.valueOf(logName_);
    return result == null
        ? com.google.cloud.compute.v1.LogConfigCloudAuditOptions.LogName.UNRECOGNIZED
        : result;
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
    if (logName_
        != com.google.cloud.compute.v1.LogConfigCloudAuditOptions.LogName.UNDEFINED_LOG_NAME
            .getNumber()) {
      output.writeEnum(134478502, logName_);
    }
    if (authorizationLoggingOptions_ != null) {
      output.writeMessage(217861624, getAuthorizationLoggingOptions());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (logName_
        != com.google.cloud.compute.v1.LogConfigCloudAuditOptions.LogName.UNDEFINED_LOG_NAME
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(134478502, logName_);
    }
    if (authorizationLoggingOptions_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              217861624, getAuthorizationLoggingOptions());
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
    if (!(obj instanceof com.google.cloud.compute.v1.LogConfigCloudAuditOptions)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.LogConfigCloudAuditOptions other =
        (com.google.cloud.compute.v1.LogConfigCloudAuditOptions) obj;

    if (hasAuthorizationLoggingOptions() != other.hasAuthorizationLoggingOptions()) return false;
    if (hasAuthorizationLoggingOptions()) {
      if (!getAuthorizationLoggingOptions().equals(other.getAuthorizationLoggingOptions()))
        return false;
    }
    if (logName_ != other.logName_) return false;
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
    if (hasAuthorizationLoggingOptions()) {
      hash = (37 * hash) + AUTHORIZATION_LOGGING_OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getAuthorizationLoggingOptions().hashCode();
    }
    hash = (37 * hash) + LOG_NAME_FIELD_NUMBER;
    hash = (53 * hash) + logName_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.LogConfigCloudAuditOptions parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.LogConfigCloudAuditOptions parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.LogConfigCloudAuditOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.LogConfigCloudAuditOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.LogConfigCloudAuditOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.LogConfigCloudAuditOptions parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.LogConfigCloudAuditOptions parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.LogConfigCloudAuditOptions parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.LogConfigCloudAuditOptions parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.LogConfigCloudAuditOptions parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.LogConfigCloudAuditOptions parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.LogConfigCloudAuditOptions parseFrom(
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
      com.google.cloud.compute.v1.LogConfigCloudAuditOptions prototype) {
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
   * Write a Cloud Audit log
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.LogConfigCloudAuditOptions}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.LogConfigCloudAuditOptions)
      com.google.cloud.compute.v1.LogConfigCloudAuditOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_LogConfigCloudAuditOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_LogConfigCloudAuditOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.LogConfigCloudAuditOptions.class,
              com.google.cloud.compute.v1.LogConfigCloudAuditOptions.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.LogConfigCloudAuditOptions.newBuilder()
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
      if (authorizationLoggingOptionsBuilder_ == null) {
        authorizationLoggingOptions_ = null;
      } else {
        authorizationLoggingOptions_ = null;
        authorizationLoggingOptionsBuilder_ = null;
      }
      logName_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_LogConfigCloudAuditOptions_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.LogConfigCloudAuditOptions getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.LogConfigCloudAuditOptions.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.LogConfigCloudAuditOptions build() {
      com.google.cloud.compute.v1.LogConfigCloudAuditOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.LogConfigCloudAuditOptions buildPartial() {
      com.google.cloud.compute.v1.LogConfigCloudAuditOptions result =
          new com.google.cloud.compute.v1.LogConfigCloudAuditOptions(this);
      if (authorizationLoggingOptionsBuilder_ == null) {
        result.authorizationLoggingOptions_ = authorizationLoggingOptions_;
      } else {
        result.authorizationLoggingOptions_ = authorizationLoggingOptionsBuilder_.build();
      }
      result.logName_ = logName_;
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
      if (other instanceof com.google.cloud.compute.v1.LogConfigCloudAuditOptions) {
        return mergeFrom((com.google.cloud.compute.v1.LogConfigCloudAuditOptions) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.LogConfigCloudAuditOptions other) {
      if (other == com.google.cloud.compute.v1.LogConfigCloudAuditOptions.getDefaultInstance())
        return this;
      if (other.hasAuthorizationLoggingOptions()) {
        mergeAuthorizationLoggingOptions(other.getAuthorizationLoggingOptions());
      }
      if (other.logName_ != 0) {
        setLogNameValue(other.getLogNameValue());
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
      com.google.cloud.compute.v1.LogConfigCloudAuditOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.compute.v1.LogConfigCloudAuditOptions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.compute.v1.AuthorizationLoggingOptions authorizationLoggingOptions_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.AuthorizationLoggingOptions,
            com.google.cloud.compute.v1.AuthorizationLoggingOptions.Builder,
            com.google.cloud.compute.v1.AuthorizationLoggingOptionsOrBuilder>
        authorizationLoggingOptionsBuilder_;
    /**
     *
     *
     * <pre>
     * Information used by the Cloud Audit Logging pipeline.
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.AuthorizationLoggingOptions authorization_logging_options = 217861624;
     * </code>
     *
     * @return Whether the authorizationLoggingOptions field is set.
     */
    public boolean hasAuthorizationLoggingOptions() {
      return authorizationLoggingOptionsBuilder_ != null || authorizationLoggingOptions_ != null;
    }
    /**
     *
     *
     * <pre>
     * Information used by the Cloud Audit Logging pipeline.
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.AuthorizationLoggingOptions authorization_logging_options = 217861624;
     * </code>
     *
     * @return The authorizationLoggingOptions.
     */
    public com.google.cloud.compute.v1.AuthorizationLoggingOptions
        getAuthorizationLoggingOptions() {
      if (authorizationLoggingOptionsBuilder_ == null) {
        return authorizationLoggingOptions_ == null
            ? com.google.cloud.compute.v1.AuthorizationLoggingOptions.getDefaultInstance()
            : authorizationLoggingOptions_;
      } else {
        return authorizationLoggingOptionsBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Information used by the Cloud Audit Logging pipeline.
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.AuthorizationLoggingOptions authorization_logging_options = 217861624;
     * </code>
     */
    public Builder setAuthorizationLoggingOptions(
        com.google.cloud.compute.v1.AuthorizationLoggingOptions value) {
      if (authorizationLoggingOptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        authorizationLoggingOptions_ = value;
        onChanged();
      } else {
        authorizationLoggingOptionsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Information used by the Cloud Audit Logging pipeline.
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.AuthorizationLoggingOptions authorization_logging_options = 217861624;
     * </code>
     */
    public Builder setAuthorizationLoggingOptions(
        com.google.cloud.compute.v1.AuthorizationLoggingOptions.Builder builderForValue) {
      if (authorizationLoggingOptionsBuilder_ == null) {
        authorizationLoggingOptions_ = builderForValue.build();
        onChanged();
      } else {
        authorizationLoggingOptionsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Information used by the Cloud Audit Logging pipeline.
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.AuthorizationLoggingOptions authorization_logging_options = 217861624;
     * </code>
     */
    public Builder mergeAuthorizationLoggingOptions(
        com.google.cloud.compute.v1.AuthorizationLoggingOptions value) {
      if (authorizationLoggingOptionsBuilder_ == null) {
        if (authorizationLoggingOptions_ != null) {
          authorizationLoggingOptions_ =
              com.google.cloud.compute.v1.AuthorizationLoggingOptions.newBuilder(
                      authorizationLoggingOptions_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          authorizationLoggingOptions_ = value;
        }
        onChanged();
      } else {
        authorizationLoggingOptionsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Information used by the Cloud Audit Logging pipeline.
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.AuthorizationLoggingOptions authorization_logging_options = 217861624;
     * </code>
     */
    public Builder clearAuthorizationLoggingOptions() {
      if (authorizationLoggingOptionsBuilder_ == null) {
        authorizationLoggingOptions_ = null;
        onChanged();
      } else {
        authorizationLoggingOptions_ = null;
        authorizationLoggingOptionsBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Information used by the Cloud Audit Logging pipeline.
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.AuthorizationLoggingOptions authorization_logging_options = 217861624;
     * </code>
     */
    public com.google.cloud.compute.v1.AuthorizationLoggingOptions.Builder
        getAuthorizationLoggingOptionsBuilder() {

      onChanged();
      return getAuthorizationLoggingOptionsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Information used by the Cloud Audit Logging pipeline.
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.AuthorizationLoggingOptions authorization_logging_options = 217861624;
     * </code>
     */
    public com.google.cloud.compute.v1.AuthorizationLoggingOptionsOrBuilder
        getAuthorizationLoggingOptionsOrBuilder() {
      if (authorizationLoggingOptionsBuilder_ != null) {
        return authorizationLoggingOptionsBuilder_.getMessageOrBuilder();
      } else {
        return authorizationLoggingOptions_ == null
            ? com.google.cloud.compute.v1.AuthorizationLoggingOptions.getDefaultInstance()
            : authorizationLoggingOptions_;
      }
    }
    /**
     *
     *
     * <pre>
     * Information used by the Cloud Audit Logging pipeline.
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.AuthorizationLoggingOptions authorization_logging_options = 217861624;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.AuthorizationLoggingOptions,
            com.google.cloud.compute.v1.AuthorizationLoggingOptions.Builder,
            com.google.cloud.compute.v1.AuthorizationLoggingOptionsOrBuilder>
        getAuthorizationLoggingOptionsFieldBuilder() {
      if (authorizationLoggingOptionsBuilder_ == null) {
        authorizationLoggingOptionsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.compute.v1.AuthorizationLoggingOptions,
                com.google.cloud.compute.v1.AuthorizationLoggingOptions.Builder,
                com.google.cloud.compute.v1.AuthorizationLoggingOptionsOrBuilder>(
                getAuthorizationLoggingOptions(), getParentForChildren(), isClean());
        authorizationLoggingOptions_ = null;
      }
      return authorizationLoggingOptionsBuilder_;
    }

    private int logName_ = 0;
    /**
     *
     *
     * <pre>
     * The log_name to populate in the Cloud Audit Record.
     * </pre>
     *
     * <code>.google.cloud.compute.v1.LogConfigCloudAuditOptions.LogName log_name = 134478502;
     * </code>
     *
     * @return The enum numeric value on the wire for logName.
     */
    @java.lang.Override
    public int getLogNameValue() {
      return logName_;
    }
    /**
     *
     *
     * <pre>
     * The log_name to populate in the Cloud Audit Record.
     * </pre>
     *
     * <code>.google.cloud.compute.v1.LogConfigCloudAuditOptions.LogName log_name = 134478502;
     * </code>
     *
     * @param value The enum numeric value on the wire for logName to set.
     * @return This builder for chaining.
     */
    public Builder setLogNameValue(int value) {

      logName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The log_name to populate in the Cloud Audit Record.
     * </pre>
     *
     * <code>.google.cloud.compute.v1.LogConfigCloudAuditOptions.LogName log_name = 134478502;
     * </code>
     *
     * @return The logName.
     */
    @java.lang.Override
    public com.google.cloud.compute.v1.LogConfigCloudAuditOptions.LogName getLogName() {
      @SuppressWarnings("deprecation")
      com.google.cloud.compute.v1.LogConfigCloudAuditOptions.LogName result =
          com.google.cloud.compute.v1.LogConfigCloudAuditOptions.LogName.valueOf(logName_);
      return result == null
          ? com.google.cloud.compute.v1.LogConfigCloudAuditOptions.LogName.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The log_name to populate in the Cloud Audit Record.
     * </pre>
     *
     * <code>.google.cloud.compute.v1.LogConfigCloudAuditOptions.LogName log_name = 134478502;
     * </code>
     *
     * @param value The logName to set.
     * @return This builder for chaining.
     */
    public Builder setLogName(
        com.google.cloud.compute.v1.LogConfigCloudAuditOptions.LogName value) {
      if (value == null) {
        throw new NullPointerException();
      }

      logName_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The log_name to populate in the Cloud Audit Record.
     * </pre>
     *
     * <code>.google.cloud.compute.v1.LogConfigCloudAuditOptions.LogName log_name = 134478502;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLogName() {

      logName_ = 0;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.LogConfigCloudAuditOptions)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.LogConfigCloudAuditOptions)
  private static final com.google.cloud.compute.v1.LogConfigCloudAuditOptions DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.LogConfigCloudAuditOptions();
  }

  public static com.google.cloud.compute.v1.LogConfigCloudAuditOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LogConfigCloudAuditOptions> PARSER =
      new com.google.protobuf.AbstractParser<LogConfigCloudAuditOptions>() {
        @java.lang.Override
        public LogConfigCloudAuditOptions parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new LogConfigCloudAuditOptions(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<LogConfigCloudAuditOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LogConfigCloudAuditOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.LogConfigCloudAuditOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
