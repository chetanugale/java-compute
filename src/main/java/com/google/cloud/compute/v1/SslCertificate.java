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
package com.google.cloud.compute.v1;

import com.google.api.core.BetaApi;
import com.google.api.gax.httpjson.ApiMessage;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
/**
 * Represents an SSL Certificate resource.
 *
 * <p>Google Compute Engine has two SSL Certificate resources:
 *
 * <p>&#42; [Global](/compute/docs/reference/rest/{$api_version}/sslCertificates) &#42;
 * [Regional](/compute/docs/reference/rest/{$api_version}/regionSslCertificates)
 *
 * <p>The sslCertificates are used by: - external HTTPS load balancers - SSL proxy load balancers
 *
 * <p>The regionSslCertificates are used by internal HTTPS load balancers.
 *
 * <p>Optionally, certificate file contents that you upload can contain a set of up to five
 * PEM-encoded certificates. The API call creates an object (sslCertificate) that holds this data.
 * You can use SSL keys and certificates to secure connections to a load balancer. For more
 * information, read Creating and using SSL certificates and SSL certificates quotas and limits. (==
 * resource_for {$api_version}.sslCertificates ==) (== resource_for
 * {$api_version}.regionSslCertificates ==)
 */
public final class SslCertificate implements ApiMessage {
  private final String certificate;
  private final String creationTimestamp;
  private final String description;
  private final String expireTime;
  private final String id;
  private final String kind;
  private final SslCertificateManagedSslCertificate managed;
  private final String name;
  private final String privateKey;
  private final String region;
  private final String selfLink;
  private final SslCertificateSelfManagedSslCertificate selfManaged;
  private final List<String> subjectAlternativeNames;
  private final String type;

  private SslCertificate() {
    this.certificate = null;
    this.creationTimestamp = null;
    this.description = null;
    this.expireTime = null;
    this.id = null;
    this.kind = null;
    this.managed = null;
    this.name = null;
    this.privateKey = null;
    this.region = null;
    this.selfLink = null;
    this.selfManaged = null;
    this.subjectAlternativeNames = null;
    this.type = null;
  }

  private SslCertificate(
      String certificate,
      String creationTimestamp,
      String description,
      String expireTime,
      String id,
      String kind,
      SslCertificateManagedSslCertificate managed,
      String name,
      String privateKey,
      String region,
      String selfLink,
      SslCertificateSelfManagedSslCertificate selfManaged,
      List<String> subjectAlternativeNames,
      String type) {
    this.certificate = certificate;
    this.creationTimestamp = creationTimestamp;
    this.description = description;
    this.expireTime = expireTime;
    this.id = id;
    this.kind = kind;
    this.managed = managed;
    this.name = name;
    this.privateKey = privateKey;
    this.region = region;
    this.selfLink = selfLink;
    this.selfManaged = selfManaged;
    this.subjectAlternativeNames = subjectAlternativeNames;
    this.type = type;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("certificate".equals(fieldName)) {
      return certificate;
    }
    if ("creationTimestamp".equals(fieldName)) {
      return creationTimestamp;
    }
    if ("description".equals(fieldName)) {
      return description;
    }
    if ("expireTime".equals(fieldName)) {
      return expireTime;
    }
    if ("id".equals(fieldName)) {
      return id;
    }
    if ("kind".equals(fieldName)) {
      return kind;
    }
    if ("managed".equals(fieldName)) {
      return managed;
    }
    if ("name".equals(fieldName)) {
      return name;
    }
    if ("privateKey".equals(fieldName)) {
      return privateKey;
    }
    if ("region".equals(fieldName)) {
      return region;
    }
    if ("selfLink".equals(fieldName)) {
      return selfLink;
    }
    if ("selfManaged".equals(fieldName)) {
      return selfManaged;
    }
    if ("subjectAlternativeNames".equals(fieldName)) {
      return subjectAlternativeNames;
    }
    if ("type".equals(fieldName)) {
      return type;
    }
    return null;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  @Nullable
  @Override
  /**
   * The fields that should be serialized (even if they have empty values). If the containing
   * message object has a non-null fieldmask, then all the fields in the field mask (and only those
   * fields in the field mask) will be serialized. If the containing object does not have a
   * fieldmask, then only non-empty fields will be serialized.
   */
  public List<String> getFieldMask() {
    return null;
  }

  /**
   * A local certificate file. The certificate must be in PEM format. The certificate chain must be
   * no greater than 5 certs long. The chain must include at least one intermediate cert.
   */
  public String getCertificate() {
    return certificate;
  }

  /** [Output Only] Creation timestamp in RFC3339 text format. */
  public String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   */
  public String getDescription() {
    return description;
  }

  /** [Output Only] Expire time of the certificate. RFC3339 */
  public String getExpireTime() {
    return expireTime;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   */
  public String getId() {
    return id;
  }

  /** [Output Only] Type of the resource. Always compute#sslCertificate for SSL certificates. */
  public String getKind() {
    return kind;
  }

  /** Configuration and status of a managed SSL certificate. */
  public SslCertificateManagedSslCertificate getManaged() {
    return managed;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]&#42;[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   */
  public String getName() {
    return name;
  }

  /** A write-only private key in PEM format. Only insert requests will include this field. */
  public String getPrivateKey() {
    return privateKey;
  }

  /**
   * [Output Only] URL of the region where the regional SSL Certificate resides. This field is not
   * applicable to global SSL Certificate.
   */
  public String getRegion() {
    return region;
  }

  /** [Output only] Server-defined URL for the resource. */
  public String getSelfLink() {
    return selfLink;
  }

  /** Configuration and status of a self-managed SSL certificate. */
  public SslCertificateSelfManagedSslCertificate getSelfManaged() {
    return selfManaged;
  }

  /** [Output Only] Domains associated with the certificate via Subject Alternative Name. */
  public List<String> getSubjectAlternativeNamesList() {
    return subjectAlternativeNames;
  }

  /**
   * (Optional) Specifies the type of SSL certificate, either "SELF_MANAGED" or "MANAGED". If not
   * specified, the certificate is self-managed and the fields certificate and private_key are used.
   */
  public String getType() {
    return type;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(SslCertificate prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static SslCertificate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final SslCertificate DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new SslCertificate();
  }

  public static class Builder {
    private String certificate;
    private String creationTimestamp;
    private String description;
    private String expireTime;
    private String id;
    private String kind;
    private SslCertificateManagedSslCertificate managed;
    private String name;
    private String privateKey;
    private String region;
    private String selfLink;
    private SslCertificateSelfManagedSslCertificate selfManaged;
    private List<String> subjectAlternativeNames;
    private String type;

    Builder() {}

    public Builder mergeFrom(SslCertificate other) {
      if (other == SslCertificate.getDefaultInstance()) return this;
      if (other.getCertificate() != null) {
        this.certificate = other.certificate;
      }
      if (other.getCreationTimestamp() != null) {
        this.creationTimestamp = other.creationTimestamp;
      }
      if (other.getDescription() != null) {
        this.description = other.description;
      }
      if (other.getExpireTime() != null) {
        this.expireTime = other.expireTime;
      }
      if (other.getId() != null) {
        this.id = other.id;
      }
      if (other.getKind() != null) {
        this.kind = other.kind;
      }
      if (other.getManaged() != null) {
        this.managed = other.managed;
      }
      if (other.getName() != null) {
        this.name = other.name;
      }
      if (other.getPrivateKey() != null) {
        this.privateKey = other.privateKey;
      }
      if (other.getRegion() != null) {
        this.region = other.region;
      }
      if (other.getSelfLink() != null) {
        this.selfLink = other.selfLink;
      }
      if (other.getSelfManaged() != null) {
        this.selfManaged = other.selfManaged;
      }
      if (other.getSubjectAlternativeNamesList() != null) {
        this.subjectAlternativeNames = other.subjectAlternativeNames;
      }
      if (other.getType() != null) {
        this.type = other.type;
      }
      return this;
    }

    Builder(SslCertificate source) {
      this.certificate = source.certificate;
      this.creationTimestamp = source.creationTimestamp;
      this.description = source.description;
      this.expireTime = source.expireTime;
      this.id = source.id;
      this.kind = source.kind;
      this.managed = source.managed;
      this.name = source.name;
      this.privateKey = source.privateKey;
      this.region = source.region;
      this.selfLink = source.selfLink;
      this.selfManaged = source.selfManaged;
      this.subjectAlternativeNames = source.subjectAlternativeNames;
      this.type = source.type;
    }

    /**
     * A local certificate file. The certificate must be in PEM format. The certificate chain must
     * be no greater than 5 certs long. The chain must include at least one intermediate cert.
     */
    public String getCertificate() {
      return certificate;
    }

    /**
     * A local certificate file. The certificate must be in PEM format. The certificate chain must
     * be no greater than 5 certs long. The chain must include at least one intermediate cert.
     */
    public Builder setCertificate(String certificate) {
      this.certificate = certificate;
      return this;
    }

    /** [Output Only] Creation timestamp in RFC3339 text format. */
    public String getCreationTimestamp() {
      return creationTimestamp;
    }

    /** [Output Only] Creation timestamp in RFC3339 text format. */
    public Builder setCreationTimestamp(String creationTimestamp) {
      this.creationTimestamp = creationTimestamp;
      return this;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     */
    public String getDescription() {
      return description;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /** [Output Only] Expire time of the certificate. RFC3339 */
    public String getExpireTime() {
      return expireTime;
    }

    /** [Output Only] Expire time of the certificate. RFC3339 */
    public Builder setExpireTime(String expireTime) {
      this.expireTime = expireTime;
      return this;
    }

    /**
     * [Output Only] The unique identifier for the resource. This identifier is defined by the
     * server.
     */
    public String getId() {
      return id;
    }

    /**
     * [Output Only] The unique identifier for the resource. This identifier is defined by the
     * server.
     */
    public Builder setId(String id) {
      this.id = id;
      return this;
    }

    /** [Output Only] Type of the resource. Always compute#sslCertificate for SSL certificates. */
    public String getKind() {
      return kind;
    }

    /** [Output Only] Type of the resource. Always compute#sslCertificate for SSL certificates. */
    public Builder setKind(String kind) {
      this.kind = kind;
      return this;
    }

    /** Configuration and status of a managed SSL certificate. */
    public SslCertificateManagedSslCertificate getManaged() {
      return managed;
    }

    /** Configuration and status of a managed SSL certificate. */
    public Builder setManaged(SslCertificateManagedSslCertificate managed) {
      this.managed = managed;
      return this;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be
     * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `[a-z]([-a-z0-9]&#42;[a-z0-9])?` which means the first
     * character must be a lowercase letter, and all following characters must be a dash, lowercase
     * letter, or digit, except the last character, which cannot be a dash.
     */
    public String getName() {
      return name;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be
     * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `[a-z]([-a-z0-9]&#42;[a-z0-9])?` which means the first
     * character must be a lowercase letter, and all following characters must be a dash, lowercase
     * letter, or digit, except the last character, which cannot be a dash.
     */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /** A write-only private key in PEM format. Only insert requests will include this field. */
    public String getPrivateKey() {
      return privateKey;
    }

    /** A write-only private key in PEM format. Only insert requests will include this field. */
    public Builder setPrivateKey(String privateKey) {
      this.privateKey = privateKey;
      return this;
    }

    /**
     * [Output Only] URL of the region where the regional SSL Certificate resides. This field is not
     * applicable to global SSL Certificate.
     */
    public String getRegion() {
      return region;
    }

    /**
     * [Output Only] URL of the region where the regional SSL Certificate resides. This field is not
     * applicable to global SSL Certificate.
     */
    public Builder setRegion(String region) {
      this.region = region;
      return this;
    }

    /** [Output only] Server-defined URL for the resource. */
    public String getSelfLink() {
      return selfLink;
    }

    /** [Output only] Server-defined URL for the resource. */
    public Builder setSelfLink(String selfLink) {
      this.selfLink = selfLink;
      return this;
    }

    /** Configuration and status of a self-managed SSL certificate. */
    public SslCertificateSelfManagedSslCertificate getSelfManaged() {
      return selfManaged;
    }

    /** Configuration and status of a self-managed SSL certificate. */
    public Builder setSelfManaged(SslCertificateSelfManagedSslCertificate selfManaged) {
      this.selfManaged = selfManaged;
      return this;
    }

    /** [Output Only] Domains associated with the certificate via Subject Alternative Name. */
    public List<String> getSubjectAlternativeNamesList() {
      return subjectAlternativeNames;
    }

    /** [Output Only] Domains associated with the certificate via Subject Alternative Name. */
    public Builder addAllSubjectAlternativeNames(List<String> subjectAlternativeNames) {
      if (this.subjectAlternativeNames == null) {
        this.subjectAlternativeNames = new LinkedList<>();
      }
      this.subjectAlternativeNames.addAll(subjectAlternativeNames);
      return this;
    }

    /** [Output Only] Domains associated with the certificate via Subject Alternative Name. */
    public Builder addSubjectAlternativeNames(String subjectAlternativeNames) {
      if (this.subjectAlternativeNames == null) {
        this.subjectAlternativeNames = new LinkedList<>();
      }
      this.subjectAlternativeNames.add(subjectAlternativeNames);
      return this;
    }

    /**
     * (Optional) Specifies the type of SSL certificate, either "SELF_MANAGED" or "MANAGED". If not
     * specified, the certificate is self-managed and the fields certificate and private_key are
     * used.
     */
    public String getType() {
      return type;
    }

    /**
     * (Optional) Specifies the type of SSL certificate, either "SELF_MANAGED" or "MANAGED". If not
     * specified, the certificate is self-managed and the fields certificate and private_key are
     * used.
     */
    public Builder setType(String type) {
      this.type = type;
      return this;
    }

    public SslCertificate build() {

      return new SslCertificate(
          certificate,
          creationTimestamp,
          description,
          expireTime,
          id,
          kind,
          managed,
          name,
          privateKey,
          region,
          selfLink,
          selfManaged,
          subjectAlternativeNames,
          type);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setCertificate(this.certificate);
      newBuilder.setCreationTimestamp(this.creationTimestamp);
      newBuilder.setDescription(this.description);
      newBuilder.setExpireTime(this.expireTime);
      newBuilder.setId(this.id);
      newBuilder.setKind(this.kind);
      newBuilder.setManaged(this.managed);
      newBuilder.setName(this.name);
      newBuilder.setPrivateKey(this.privateKey);
      newBuilder.setRegion(this.region);
      newBuilder.setSelfLink(this.selfLink);
      newBuilder.setSelfManaged(this.selfManaged);
      newBuilder.addAllSubjectAlternativeNames(this.subjectAlternativeNames);
      newBuilder.setType(this.type);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "SslCertificate{"
        + "certificate="
        + certificate
        + ", "
        + "creationTimestamp="
        + creationTimestamp
        + ", "
        + "description="
        + description
        + ", "
        + "expireTime="
        + expireTime
        + ", "
        + "id="
        + id
        + ", "
        + "kind="
        + kind
        + ", "
        + "managed="
        + managed
        + ", "
        + "name="
        + name
        + ", "
        + "privateKey="
        + privateKey
        + ", "
        + "region="
        + region
        + ", "
        + "selfLink="
        + selfLink
        + ", "
        + "selfManaged="
        + selfManaged
        + ", "
        + "subjectAlternativeNames="
        + subjectAlternativeNames
        + ", "
        + "type="
        + type
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SslCertificate) {
      SslCertificate that = (SslCertificate) o;
      return Objects.equals(this.certificate, that.getCertificate())
          && Objects.equals(this.creationTimestamp, that.getCreationTimestamp())
          && Objects.equals(this.description, that.getDescription())
          && Objects.equals(this.expireTime, that.getExpireTime())
          && Objects.equals(this.id, that.getId())
          && Objects.equals(this.kind, that.getKind())
          && Objects.equals(this.managed, that.getManaged())
          && Objects.equals(this.name, that.getName())
          && Objects.equals(this.privateKey, that.getPrivateKey())
          && Objects.equals(this.region, that.getRegion())
          && Objects.equals(this.selfLink, that.getSelfLink())
          && Objects.equals(this.selfManaged, that.getSelfManaged())
          && Objects.equals(this.subjectAlternativeNames, that.getSubjectAlternativeNamesList())
          && Objects.equals(this.type, that.getType());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        certificate,
        creationTimestamp,
        description,
        expireTime,
        id,
        kind,
        managed,
        name,
        privateKey,
        region,
        selfLink,
        selfManaged,
        subjectAlternativeNames,
        type);
  }
}
