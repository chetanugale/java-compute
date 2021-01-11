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
 * Configuration for an App Engine network endpoint group (NEG). The service is optional, may be provided explicitly or in the URL mask. The version is optional and can only be provided explicitly or in the URL mask when service is present.
 * Note: App Engine service must be in the same project and located in the same region as the Serverless NEG.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.NetworkEndpointGroupAppEngine}
 */
public final class NetworkEndpointGroupAppEngine extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.NetworkEndpointGroupAppEngine)
    NetworkEndpointGroupAppEngineOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use NetworkEndpointGroupAppEngine.newBuilder() to construct.
  private NetworkEndpointGroupAppEngine(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private NetworkEndpointGroupAppEngine() {
    service_ = "";
    urlMask_ = "";
    version_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new NetworkEndpointGroupAppEngine();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private NetworkEndpointGroupAppEngine(
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
          case 665380546:
            {
              java.lang.String s = input.readStringRequireUtf8();

              version_ = s;
              break;
            }
          case 826818018:
            {
              java.lang.String s = input.readStringRequireUtf8();

              urlMask_ = s;
              break;
            }
          case 840840618:
            {
              java.lang.String s = input.readStringRequireUtf8();

              service_ = s;
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
        .internal_static_google_cloud_compute_v1_NetworkEndpointGroupAppEngine_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_NetworkEndpointGroupAppEngine_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.NetworkEndpointGroupAppEngine.class,
            com.google.cloud.compute.v1.NetworkEndpointGroupAppEngine.Builder.class);
  }

  public static final int SERVICE_FIELD_NUMBER = 105105077;
  private volatile java.lang.Object service_;
  /**
   *
   *
   * <pre>
   * Optional serving service.
   * The service name is case-sensitive and must be 1-63 characters long.
   * Example value: "default", "my-service".
   * </pre>
   *
   * <code>string service = 105105077;</code>
   *
   * @return The service.
   */
  @java.lang.Override
  public java.lang.String getService() {
    java.lang.Object ref = service_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      service_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional serving service.
   * The service name is case-sensitive and must be 1-63 characters long.
   * Example value: "default", "my-service".
   * </pre>
   *
   * <code>string service = 105105077;</code>
   *
   * @return The bytes for service.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getServiceBytes() {
    java.lang.Object ref = service_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      service_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int URL_MASK_FIELD_NUMBER = 103352252;
  private volatile java.lang.Object urlMask_;
  /**
   *
   *
   * <pre>
   * A template to parse service and version fields from a request URL. URL mask allows for routing to multiple App Engine services without having to create multiple Network Endpoint Groups and backend services.
   * For example, the request URLs "foo1-dot-appname.appspot.com/v1" and "foo1-dot-appname.appspot.com/v2" can be backed by the same Serverless NEG with URL mask "-dot-appname.appspot.com/". The URL mask will parse them to { service = "foo1", version = "v1" } and { service = "foo1", version = "v2" } respectively.
   * </pre>
   *
   * <code>string url_mask = 103352252;</code>
   *
   * @return The urlMask.
   */
  @java.lang.Override
  public java.lang.String getUrlMask() {
    java.lang.Object ref = urlMask_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      urlMask_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A template to parse service and version fields from a request URL. URL mask allows for routing to multiple App Engine services without having to create multiple Network Endpoint Groups and backend services.
   * For example, the request URLs "foo1-dot-appname.appspot.com/v1" and "foo1-dot-appname.appspot.com/v2" can be backed by the same Serverless NEG with URL mask "-dot-appname.appspot.com/". The URL mask will parse them to { service = "foo1", version = "v1" } and { service = "foo1", version = "v2" } respectively.
   * </pre>
   *
   * <code>string url_mask = 103352252;</code>
   *
   * @return The bytes for urlMask.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getUrlMaskBytes() {
    java.lang.Object ref = urlMask_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      urlMask_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERSION_FIELD_NUMBER = 83172568;
  private volatile java.lang.Object version_;
  /**
   *
   *
   * <pre>
   * Optional serving version.
   * The version name is case-sensitive and must be 1-100 characters long.
   * Example value: "v1", "v2".
   * </pre>
   *
   * <code>string version = 83172568;</code>
   *
   * @return The version.
   */
  @java.lang.Override
  public java.lang.String getVersion() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      version_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional serving version.
   * The version name is case-sensitive and must be 1-100 characters long.
   * Example value: "v1", "v2".
   * </pre>
   *
   * <code>string version = 83172568;</code>
   *
   * @return The bytes for version.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getVersionBytes() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      version_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getVersionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 83172568, version_);
    }
    if (!getUrlMaskBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 103352252, urlMask_);
    }
    if (!getServiceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 105105077, service_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getVersionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(83172568, version_);
    }
    if (!getUrlMaskBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(103352252, urlMask_);
    }
    if (!getServiceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(105105077, service_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.NetworkEndpointGroupAppEngine)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.NetworkEndpointGroupAppEngine other =
        (com.google.cloud.compute.v1.NetworkEndpointGroupAppEngine) obj;

    if (!getService().equals(other.getService())) return false;
    if (!getUrlMask().equals(other.getUrlMask())) return false;
    if (!getVersion().equals(other.getVersion())) return false;
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
    hash = (37 * hash) + SERVICE_FIELD_NUMBER;
    hash = (53 * hash) + getService().hashCode();
    hash = (37 * hash) + URL_MASK_FIELD_NUMBER;
    hash = (53 * hash) + getUrlMask().hashCode();
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupAppEngine parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupAppEngine parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupAppEngine parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupAppEngine parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupAppEngine parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupAppEngine parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupAppEngine parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupAppEngine parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupAppEngine parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupAppEngine parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupAppEngine parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupAppEngine parseFrom(
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
      com.google.cloud.compute.v1.NetworkEndpointGroupAppEngine prototype) {
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
   * Configuration for an App Engine network endpoint group (NEG). The service is optional, may be provided explicitly or in the URL mask. The version is optional and can only be provided explicitly or in the URL mask when service is present.
   * Note: App Engine service must be in the same project and located in the same region as the Serverless NEG.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.NetworkEndpointGroupAppEngine}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.NetworkEndpointGroupAppEngine)
      com.google.cloud.compute.v1.NetworkEndpointGroupAppEngineOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_NetworkEndpointGroupAppEngine_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_NetworkEndpointGroupAppEngine_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.NetworkEndpointGroupAppEngine.class,
              com.google.cloud.compute.v1.NetworkEndpointGroupAppEngine.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.NetworkEndpointGroupAppEngine.newBuilder()
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
      service_ = "";

      urlMask_ = "";

      version_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_NetworkEndpointGroupAppEngine_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NetworkEndpointGroupAppEngine getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.NetworkEndpointGroupAppEngine.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NetworkEndpointGroupAppEngine build() {
      com.google.cloud.compute.v1.NetworkEndpointGroupAppEngine result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NetworkEndpointGroupAppEngine buildPartial() {
      com.google.cloud.compute.v1.NetworkEndpointGroupAppEngine result =
          new com.google.cloud.compute.v1.NetworkEndpointGroupAppEngine(this);
      result.service_ = service_;
      result.urlMask_ = urlMask_;
      result.version_ = version_;
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
      if (other instanceof com.google.cloud.compute.v1.NetworkEndpointGroupAppEngine) {
        return mergeFrom((com.google.cloud.compute.v1.NetworkEndpointGroupAppEngine) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.NetworkEndpointGroupAppEngine other) {
      if (other == com.google.cloud.compute.v1.NetworkEndpointGroupAppEngine.getDefaultInstance())
        return this;
      if (!other.getService().isEmpty()) {
        service_ = other.service_;
        onChanged();
      }
      if (!other.getUrlMask().isEmpty()) {
        urlMask_ = other.urlMask_;
        onChanged();
      }
      if (!other.getVersion().isEmpty()) {
        version_ = other.version_;
        onChanged();
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
      com.google.cloud.compute.v1.NetworkEndpointGroupAppEngine parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.compute.v1.NetworkEndpointGroupAppEngine) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object service_ = "";
    /**
     *
     *
     * <pre>
     * Optional serving service.
     * The service name is case-sensitive and must be 1-63 characters long.
     * Example value: "default", "my-service".
     * </pre>
     *
     * <code>string service = 105105077;</code>
     *
     * @return The service.
     */
    public java.lang.String getService() {
      java.lang.Object ref = service_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        service_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional serving service.
     * The service name is case-sensitive and must be 1-63 characters long.
     * Example value: "default", "my-service".
     * </pre>
     *
     * <code>string service = 105105077;</code>
     *
     * @return The bytes for service.
     */
    public com.google.protobuf.ByteString getServiceBytes() {
      java.lang.Object ref = service_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        service_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional serving service.
     * The service name is case-sensitive and must be 1-63 characters long.
     * Example value: "default", "my-service".
     * </pre>
     *
     * <code>string service = 105105077;</code>
     *
     * @param value The service to set.
     * @return This builder for chaining.
     */
    public Builder setService(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      service_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional serving service.
     * The service name is case-sensitive and must be 1-63 characters long.
     * Example value: "default", "my-service".
     * </pre>
     *
     * <code>string service = 105105077;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearService() {

      service_ = getDefaultInstance().getService();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional serving service.
     * The service name is case-sensitive and must be 1-63 characters long.
     * Example value: "default", "my-service".
     * </pre>
     *
     * <code>string service = 105105077;</code>
     *
     * @param value The bytes for service to set.
     * @return This builder for chaining.
     */
    public Builder setServiceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      service_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object urlMask_ = "";
    /**
     *
     *
     * <pre>
     * A template to parse service and version fields from a request URL. URL mask allows for routing to multiple App Engine services without having to create multiple Network Endpoint Groups and backend services.
     * For example, the request URLs "foo1-dot-appname.appspot.com/v1" and "foo1-dot-appname.appspot.com/v2" can be backed by the same Serverless NEG with URL mask "-dot-appname.appspot.com/". The URL mask will parse them to { service = "foo1", version = "v1" } and { service = "foo1", version = "v2" } respectively.
     * </pre>
     *
     * <code>string url_mask = 103352252;</code>
     *
     * @return The urlMask.
     */
    public java.lang.String getUrlMask() {
      java.lang.Object ref = urlMask_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        urlMask_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A template to parse service and version fields from a request URL. URL mask allows for routing to multiple App Engine services without having to create multiple Network Endpoint Groups and backend services.
     * For example, the request URLs "foo1-dot-appname.appspot.com/v1" and "foo1-dot-appname.appspot.com/v2" can be backed by the same Serverless NEG with URL mask "-dot-appname.appspot.com/". The URL mask will parse them to { service = "foo1", version = "v1" } and { service = "foo1", version = "v2" } respectively.
     * </pre>
     *
     * <code>string url_mask = 103352252;</code>
     *
     * @return The bytes for urlMask.
     */
    public com.google.protobuf.ByteString getUrlMaskBytes() {
      java.lang.Object ref = urlMask_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        urlMask_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A template to parse service and version fields from a request URL. URL mask allows for routing to multiple App Engine services without having to create multiple Network Endpoint Groups and backend services.
     * For example, the request URLs "foo1-dot-appname.appspot.com/v1" and "foo1-dot-appname.appspot.com/v2" can be backed by the same Serverless NEG with URL mask "-dot-appname.appspot.com/". The URL mask will parse them to { service = "foo1", version = "v1" } and { service = "foo1", version = "v2" } respectively.
     * </pre>
     *
     * <code>string url_mask = 103352252;</code>
     *
     * @param value The urlMask to set.
     * @return This builder for chaining.
     */
    public Builder setUrlMask(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      urlMask_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A template to parse service and version fields from a request URL. URL mask allows for routing to multiple App Engine services without having to create multiple Network Endpoint Groups and backend services.
     * For example, the request URLs "foo1-dot-appname.appspot.com/v1" and "foo1-dot-appname.appspot.com/v2" can be backed by the same Serverless NEG with URL mask "-dot-appname.appspot.com/". The URL mask will parse them to { service = "foo1", version = "v1" } and { service = "foo1", version = "v2" } respectively.
     * </pre>
     *
     * <code>string url_mask = 103352252;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUrlMask() {

      urlMask_ = getDefaultInstance().getUrlMask();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A template to parse service and version fields from a request URL. URL mask allows for routing to multiple App Engine services without having to create multiple Network Endpoint Groups and backend services.
     * For example, the request URLs "foo1-dot-appname.appspot.com/v1" and "foo1-dot-appname.appspot.com/v2" can be backed by the same Serverless NEG with URL mask "-dot-appname.appspot.com/". The URL mask will parse them to { service = "foo1", version = "v1" } and { service = "foo1", version = "v2" } respectively.
     * </pre>
     *
     * <code>string url_mask = 103352252;</code>
     *
     * @param value The bytes for urlMask to set.
     * @return This builder for chaining.
     */
    public Builder setUrlMaskBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      urlMask_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object version_ = "";
    /**
     *
     *
     * <pre>
     * Optional serving version.
     * The version name is case-sensitive and must be 1-100 characters long.
     * Example value: "v1", "v2".
     * </pre>
     *
     * <code>string version = 83172568;</code>
     *
     * @return The version.
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        version_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional serving version.
     * The version name is case-sensitive and must be 1-100 characters long.
     * Example value: "v1", "v2".
     * </pre>
     *
     * <code>string version = 83172568;</code>
     *
     * @return The bytes for version.
     */
    public com.google.protobuf.ByteString getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional serving version.
     * The version name is case-sensitive and must be 1-100 characters long.
     * Example value: "v1", "v2".
     * </pre>
     *
     * <code>string version = 83172568;</code>
     *
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      version_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional serving version.
     * The version name is case-sensitive and must be 1-100 characters long.
     * Example value: "v1", "v2".
     * </pre>
     *
     * <code>string version = 83172568;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearVersion() {

      version_ = getDefaultInstance().getVersion();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional serving version.
     * The version name is case-sensitive and must be 1-100 characters long.
     * Example value: "v1", "v2".
     * </pre>
     *
     * <code>string version = 83172568;</code>
     *
     * @param value The bytes for version to set.
     * @return This builder for chaining.
     */
    public Builder setVersionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      version_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.NetworkEndpointGroupAppEngine)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.NetworkEndpointGroupAppEngine)
  private static final com.google.cloud.compute.v1.NetworkEndpointGroupAppEngine DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.NetworkEndpointGroupAppEngine();
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupAppEngine getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NetworkEndpointGroupAppEngine> PARSER =
      new com.google.protobuf.AbstractParser<NetworkEndpointGroupAppEngine>() {
        @java.lang.Override
        public NetworkEndpointGroupAppEngine parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new NetworkEndpointGroupAppEngine(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<NetworkEndpointGroupAppEngine> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NetworkEndpointGroupAppEngine> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.NetworkEndpointGroupAppEngine getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
