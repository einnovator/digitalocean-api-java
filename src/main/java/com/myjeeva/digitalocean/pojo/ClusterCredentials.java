/**
 * The MIT License
 *
 * <p>Copyright (c) 2013-2020 Jeevanandam M. (jeeva@myjeeva.com)
 *
 * <p>Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * <p>The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * <p>THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.myjeeva.digitalocean.pojo;

import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * Kubernetes Cluster Credentials.
 *
 * @author EInnovator (support@einnovator.org)
 */
public class ClusterCredentials extends Base {

  private static final long serialVersionUID = 5958407274594550472L;

  /** The URL used to access the cluster API server. */
  private String server;

  /**
   * A base64 encoding of bytes representing the certificate authority data for accessing the
   * cluster.
   */
  @SerializedName("certificate_authority_data")
  private String certificateAuthorityData;

  /**
   * An access token used to authenticate with the cluster. This is only returned for clusters with
   * support for token-based authentication.
   */
  private String token;

  /**
   * A time value given in ISO8601 combined date and time format that represents when the access
   * token expires.
   */
  @SerializedName("expires_at")
  private String expiresAt;

  /**
   * A base64 encoding of bytes representing the x509 client certificate data for access the
   * cluster. This is only returned for clusters without support for token-based authentication.
   */
  @SerializedName("client_certificate_data")
  private String clientCertificateData;

  /**
   * AA base64 encoding of bytes representing the x509 client key data for access the cluster. This
   * is only returned for clusters without support for token-based authentication.
   */
  @SerializedName("client_key_data")
  private String clientKeyData;

  public ClusterCredentials() {}

  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }

  /**
   * Get the value of property {@code server}.
   *
   * @return the value of {@code server}
   */
  public String getServer() {
    return server;
  }

  /**
   * Set the value of property {@code server}.
   *
   * @param server the value of {@code server}
   */
  public void setServer(String server) {
    this.server = server;
  }

  /**
   * Get the value of property {@code certificateAuthorityData}.
   *
   * @return the value of {@code certificateAuthorityData}
   */
  public String getCertificateAuthorityData() {
    return certificateAuthorityData;
  }

  /**
   * Set the value of property {@code certificateAuthorityData}.
   *
   * @param certificateAuthorityData the value of {@code certificateAuthorityData}
   */
  public void setCertificateAuthorityData(String certificateAuthorityData) {
    this.certificateAuthorityData = certificateAuthorityData;
  }

  /**
   * Get the value of property {@code token}.
   *
   * @return the value of {@code token}
   */
  public String getToken() {
    return token;
  }

  /**
   * Set the value of property {@code token}.
   *
   * @param token the value of {@code token}
   */
  public void setToken(String token) {
    this.token = token;
  }

  /**
   * Get the value of property {@code expiresAt}.
   *
   * @return the value of {@code expiresAt}
   */
  public String getExpiresAt() {
    return expiresAt;
  }

  /**
   * Set the value of property {@code expiresAt}.
   *
   * @param expiresAt the value of {@code expiresAt}
   */
  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   * Get the value of property {@code clientCertificateData}.
   *
   * @return the value of {@code clientCertificateData}
   */
  public String getClientCertificateData() {
    return clientCertificateData;
  }

  /**
   * Set the value of property {@code clientCertificateData}.
   *
   * @param clientCertificateData the value of {@code clientCertificateData}
   */
  public void setClientCertificateData(String clientCertificateData) {
    this.clientCertificateData = clientCertificateData;
  }

  /**
   * Get the value of property {@code clientKeyData}.
   *
   * @return the value of {@code clientKeyData}
   */
  public String getClientKeyData() {
    return clientKeyData;
  }

  /**
   * Set the value of property {@code clientKeyData}.
   *
   * @param clientKeyData the value of {@code clientKeyData}
   */
  public void setClientKeyData(String clientKeyData) {
    this.clientKeyData = clientKeyData;
  }
}
