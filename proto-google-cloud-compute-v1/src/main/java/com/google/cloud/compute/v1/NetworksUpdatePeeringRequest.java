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
 * Protobuf type {@code google.cloud.compute.v1.NetworksUpdatePeeringRequest}
 */
public final class NetworksUpdatePeeringRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.NetworksUpdatePeeringRequest)
    NetworksUpdatePeeringRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use NetworksUpdatePeeringRequest.newBuilder() to construct.
  private NetworksUpdatePeeringRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private NetworksUpdatePeeringRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new NetworksUpdatePeeringRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private NetworksUpdatePeeringRequest(
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
          case 483930490:
            {
              com.google.cloud.compute.v1.NetworkPeering.Builder subBuilder = null;
              if (networkPeering_ != null) {
                subBuilder = networkPeering_.toBuilder();
              }
              networkPeering_ =
                  input.readMessage(
                      com.google.cloud.compute.v1.NetworkPeering.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(networkPeering_);
                networkPeering_ = subBuilder.buildPartial();
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
        .internal_static_google_cloud_compute_v1_NetworksUpdatePeeringRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_NetworksUpdatePeeringRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.NetworksUpdatePeeringRequest.class,
            com.google.cloud.compute.v1.NetworksUpdatePeeringRequest.Builder.class);
  }

  public static final int NETWORK_PEERING_FIELD_NUMBER = 60491311;
  private com.google.cloud.compute.v1.NetworkPeering networkPeering_;
  /**
   * <code>.google.cloud.compute.v1.NetworkPeering network_peering = 60491311;</code>
   *
   * @return Whether the networkPeering field is set.
   */
  @java.lang.Override
  public boolean hasNetworkPeering() {
    return networkPeering_ != null;
  }
  /**
   * <code>.google.cloud.compute.v1.NetworkPeering network_peering = 60491311;</code>
   *
   * @return The networkPeering.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.NetworkPeering getNetworkPeering() {
    return networkPeering_ == null
        ? com.google.cloud.compute.v1.NetworkPeering.getDefaultInstance()
        : networkPeering_;
  }
  /** <code>.google.cloud.compute.v1.NetworkPeering network_peering = 60491311;</code> */
  @java.lang.Override
  public com.google.cloud.compute.v1.NetworkPeeringOrBuilder getNetworkPeeringOrBuilder() {
    return getNetworkPeering();
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
    if (networkPeering_ != null) {
      output.writeMessage(60491311, getNetworkPeering());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (networkPeering_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(60491311, getNetworkPeering());
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
    if (!(obj instanceof com.google.cloud.compute.v1.NetworksUpdatePeeringRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.NetworksUpdatePeeringRequest other =
        (com.google.cloud.compute.v1.NetworksUpdatePeeringRequest) obj;

    if (hasNetworkPeering() != other.hasNetworkPeering()) return false;
    if (hasNetworkPeering()) {
      if (!getNetworkPeering().equals(other.getNetworkPeering())) return false;
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
    if (hasNetworkPeering()) {
      hash = (37 * hash) + NETWORK_PEERING_FIELD_NUMBER;
      hash = (53 * hash) + getNetworkPeering().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.NetworksUpdatePeeringRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.NetworksUpdatePeeringRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NetworksUpdatePeeringRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.NetworksUpdatePeeringRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NetworksUpdatePeeringRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.NetworksUpdatePeeringRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NetworksUpdatePeeringRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.NetworksUpdatePeeringRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NetworksUpdatePeeringRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.NetworksUpdatePeeringRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NetworksUpdatePeeringRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.NetworksUpdatePeeringRequest parseFrom(
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
      com.google.cloud.compute.v1.NetworksUpdatePeeringRequest prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.NetworksUpdatePeeringRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.NetworksUpdatePeeringRequest)
      com.google.cloud.compute.v1.NetworksUpdatePeeringRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_NetworksUpdatePeeringRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_NetworksUpdatePeeringRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.NetworksUpdatePeeringRequest.class,
              com.google.cloud.compute.v1.NetworksUpdatePeeringRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.NetworksUpdatePeeringRequest.newBuilder()
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
      if (networkPeeringBuilder_ == null) {
        networkPeering_ = null;
      } else {
        networkPeering_ = null;
        networkPeeringBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_NetworksUpdatePeeringRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NetworksUpdatePeeringRequest getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.NetworksUpdatePeeringRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NetworksUpdatePeeringRequest build() {
      com.google.cloud.compute.v1.NetworksUpdatePeeringRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NetworksUpdatePeeringRequest buildPartial() {
      com.google.cloud.compute.v1.NetworksUpdatePeeringRequest result =
          new com.google.cloud.compute.v1.NetworksUpdatePeeringRequest(this);
      if (networkPeeringBuilder_ == null) {
        result.networkPeering_ = networkPeering_;
      } else {
        result.networkPeering_ = networkPeeringBuilder_.build();
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
      if (other instanceof com.google.cloud.compute.v1.NetworksUpdatePeeringRequest) {
        return mergeFrom((com.google.cloud.compute.v1.NetworksUpdatePeeringRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.NetworksUpdatePeeringRequest other) {
      if (other == com.google.cloud.compute.v1.NetworksUpdatePeeringRequest.getDefaultInstance())
        return this;
      if (other.hasNetworkPeering()) {
        mergeNetworkPeering(other.getNetworkPeering());
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
      com.google.cloud.compute.v1.NetworksUpdatePeeringRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.compute.v1.NetworksUpdatePeeringRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.compute.v1.NetworkPeering networkPeering_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.NetworkPeering,
            com.google.cloud.compute.v1.NetworkPeering.Builder,
            com.google.cloud.compute.v1.NetworkPeeringOrBuilder>
        networkPeeringBuilder_;
    /**
     * <code>.google.cloud.compute.v1.NetworkPeering network_peering = 60491311;</code>
     *
     * @return Whether the networkPeering field is set.
     */
    public boolean hasNetworkPeering() {
      return networkPeeringBuilder_ != null || networkPeering_ != null;
    }
    /**
     * <code>.google.cloud.compute.v1.NetworkPeering network_peering = 60491311;</code>
     *
     * @return The networkPeering.
     */
    public com.google.cloud.compute.v1.NetworkPeering getNetworkPeering() {
      if (networkPeeringBuilder_ == null) {
        return networkPeering_ == null
            ? com.google.cloud.compute.v1.NetworkPeering.getDefaultInstance()
            : networkPeering_;
      } else {
        return networkPeeringBuilder_.getMessage();
      }
    }
    /** <code>.google.cloud.compute.v1.NetworkPeering network_peering = 60491311;</code> */
    public Builder setNetworkPeering(com.google.cloud.compute.v1.NetworkPeering value) {
      if (networkPeeringBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        networkPeering_ = value;
        onChanged();
      } else {
        networkPeeringBuilder_.setMessage(value);
      }

      return this;
    }
    /** <code>.google.cloud.compute.v1.NetworkPeering network_peering = 60491311;</code> */
    public Builder setNetworkPeering(
        com.google.cloud.compute.v1.NetworkPeering.Builder builderForValue) {
      if (networkPeeringBuilder_ == null) {
        networkPeering_ = builderForValue.build();
        onChanged();
      } else {
        networkPeeringBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /** <code>.google.cloud.compute.v1.NetworkPeering network_peering = 60491311;</code> */
    public Builder mergeNetworkPeering(com.google.cloud.compute.v1.NetworkPeering value) {
      if (networkPeeringBuilder_ == null) {
        if (networkPeering_ != null) {
          networkPeering_ =
              com.google.cloud.compute.v1.NetworkPeering.newBuilder(networkPeering_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          networkPeering_ = value;
        }
        onChanged();
      } else {
        networkPeeringBuilder_.mergeFrom(value);
      }

      return this;
    }
    /** <code>.google.cloud.compute.v1.NetworkPeering network_peering = 60491311;</code> */
    public Builder clearNetworkPeering() {
      if (networkPeeringBuilder_ == null) {
        networkPeering_ = null;
        onChanged();
      } else {
        networkPeering_ = null;
        networkPeeringBuilder_ = null;
      }

      return this;
    }
    /** <code>.google.cloud.compute.v1.NetworkPeering network_peering = 60491311;</code> */
    public com.google.cloud.compute.v1.NetworkPeering.Builder getNetworkPeeringBuilder() {

      onChanged();
      return getNetworkPeeringFieldBuilder().getBuilder();
    }
    /** <code>.google.cloud.compute.v1.NetworkPeering network_peering = 60491311;</code> */
    public com.google.cloud.compute.v1.NetworkPeeringOrBuilder getNetworkPeeringOrBuilder() {
      if (networkPeeringBuilder_ != null) {
        return networkPeeringBuilder_.getMessageOrBuilder();
      } else {
        return networkPeering_ == null
            ? com.google.cloud.compute.v1.NetworkPeering.getDefaultInstance()
            : networkPeering_;
      }
    }
    /** <code>.google.cloud.compute.v1.NetworkPeering network_peering = 60491311;</code> */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.NetworkPeering,
            com.google.cloud.compute.v1.NetworkPeering.Builder,
            com.google.cloud.compute.v1.NetworkPeeringOrBuilder>
        getNetworkPeeringFieldBuilder() {
      if (networkPeeringBuilder_ == null) {
        networkPeeringBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.compute.v1.NetworkPeering,
                com.google.cloud.compute.v1.NetworkPeering.Builder,
                com.google.cloud.compute.v1.NetworkPeeringOrBuilder>(
                getNetworkPeering(), getParentForChildren(), isClean());
        networkPeering_ = null;
      }
      return networkPeeringBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.NetworksUpdatePeeringRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.NetworksUpdatePeeringRequest)
  private static final com.google.cloud.compute.v1.NetworksUpdatePeeringRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.NetworksUpdatePeeringRequest();
  }

  public static com.google.cloud.compute.v1.NetworksUpdatePeeringRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NetworksUpdatePeeringRequest> PARSER =
      new com.google.protobuf.AbstractParser<NetworksUpdatePeeringRequest>() {
        @java.lang.Override
        public NetworksUpdatePeeringRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new NetworksUpdatePeeringRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<NetworksUpdatePeeringRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NetworksUpdatePeeringRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.NetworksUpdatePeeringRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
