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
import java.util.List;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * A Kubernetes cluster.
 *
 * @author EInnovator (support@einnovator.org)
 */
public class Cluster extends Base {

  private static final long serialVersionUID = 5958407274594550472L;

  /** A unique ID that can be used to identify and reference a Kubernetes cluster. */
  private String id;

  /** A human-readable name for a Kubernetes cluster. */
  private String name;

  /** The base URL of the API server on the Kubernetes master node. */
  private String endpoint;

  /** The slug identifier for the region where the Kubernetes cluster is located. */
  private String region;

  /**
   * The slug identifier for the version of Kubernetes used for the cluster. If set to a minor
   * version (e.g. "1.14"), the latest version within it will be used (e.g. "1.14.6-do.1"); if set
   * to "latest", the latest published version will be used.
   */
  private String version;

  /**
   * A boolean value indicating whether the cluster will be automatically upgraded to new patch
   * releases during its maintenance window.
   */
  @SerializedName("auto_upgrade")
  private Boolean autoUpgrade;

  /**
   * A boolean value indicating whether surge upgrade is enabled/disabled for the cluster. Surge
   * upgrade makes cluster upgrades fast and reliable by bringing up new nodes before destroying the
   * outdated nodes.
   */
  @SerializedName("surge_upgrade")
  private Boolean surgeUpgrade;

  /** The public IPv4 address of the Kubernetes master node. */
  private String ipv4;

  /**
   * The range of IP addresses in the overlay network of the Kubernetes cluster in CIDR notation.
   */
  @SerializedName("cluster_subnet")
  private String clusterSubnet;

  /**
   * The range of assignable IP addresses for services running in the Kubernetes cluster in CIDR
   * notation.
   */
  @SerializedName("service_subnet")
  private String serviceSubnet;

  /** A string specifying the UUID of the VPC to which the Kubernetes cluster is assigned. */
  @SerializedName("vpc_uuid")
  private String vpcUuid;

  /**
   * An array of tags applied to the Kubernetes cluster. All clusters are automatically tagged "k8s"
   * and "k8s:$K8S_CLUSTER_ID."
   */
  private String[] tags;

  /** An object specifying the maintenance window policy for the Kubernetes cluster. */
  private MaintenancePolicy maintenancePolicy;

  /** An object specifying the details of the worker nodes available to the Kubernetes cluster. */
  @SerializedName("node_pools")
  private List<NodePool> nodePools;

  /**
   * A time value given in ISO8601 combined date and time format that represents when the Kubernetes
   * cluster was created.
   */
  @SerializedName("created_at")
  private String createdAt;

  /**
   * A time value given in ISO8601 combined date and time format that represents when the Kubernetes
   * cluster was last updated.
   */
  @SerializedName("updated_at")
  private String updatedAt;

  /**
   * An object containing a "state" attribute whose value is set to a string indicating the current
   * status of the node. Potential values include running, provisioning, and errored.
   */
  private Object status;

  public Cluster() {
    // Default Constructor
  }

  public Cluster(String name) {
    this.name = name;
  }

  public Cluster(String id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }

  /**
   * Get the value of property {@code id}.
   *
   * @return the value of {@code id}
   */
  public String getId() {
    return id;
  }

  /**
   * Set the value of property {@code id}.
   *
   * @param id the value of {@code id}
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Get the value of property {@code name}.
   *
   * @return the value of {@code name}
   */
  public String getName() {
    return name;
  }

  /**
   * Set the value of property {@code name}.
   *
   * @param name the value of {@code name}
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Get the value of property {@code endpoint}.
   *
   * @return the value of {@code endpoint}
   */
  public String getEndpoint() {
    return endpoint;
  }

  /**
   * Set the value of property {@code endpoint}.
   *
   * @param endpoint the value of {@code endpoint}
   */
  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  /**
   * Get the value of property {@code region}.
   *
   * @return the value of {@code region}
   */
  public String getRegion() {
    return region;
  }

  /**
   * Set the value of property {@code region}.
   *
   * @param region the value of {@code region}
   */
  public void setRegion(String region) {
    this.region = region;
  }

  /**
   * Get the value of property {@code version}.
   *
   * @return the value of {@code version}
   */
  public String getVersion() {
    return version;
  }

  /**
   * Set the value of property {@code version}.
   *
   * @param version the value of {@code version}
   */
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * Get the value of property {@code autoUpgrade}.
   *
   * @return the value of {@code autoUpgrade}
   */
  public Boolean getAutoUpgrade() {
    return autoUpgrade;
  }

  /**
   * Set the value of property {@code autoUpgrade}.
   *
   * @param autoUpgrade the value of {@code autoUpgrade}
   */
  public void setAutoUpgrade(Boolean autoUpgrade) {
    this.autoUpgrade = autoUpgrade;
  }

  /**
   * Get the value of property {@code surgeUpgrade}.
   *
   * @return the value of {@code surgeUpgrade}
   */
  public Boolean getSurgeUpgrade() {
    return surgeUpgrade;
  }

  /**
   * Set the value of property {@code surgeUpgrade}.
   *
   * @param surgeUpgrade the value of {@code surgeUpgrade}
   */
  public void setSurgeUpgrade(Boolean surgeUpgrade) {
    this.surgeUpgrade = surgeUpgrade;
  }

  /**
   * Get the value of property {@code ipv4}.
   *
   * @return the value of {@code ipv4}
   */
  public String getIpv4() {
    return ipv4;
  }

  /**
   * Set the value of property {@code ipv4}.
   *
   * @param ipv4 the value of {@code ipv4}
   */
  public void setIpv4(String ipv4) {
    this.ipv4 = ipv4;
  }

  /**
   * Get the value of property {@code clusterSubnet}.
   *
   * @return the value of {@code clusterSubnet}
   */
  public String getClusterSubnet() {
    return clusterSubnet;
  }

  /**
   * Set the value of property {@code clusterSubnet}.
   *
   * @param clusterSubnet the value of {@code clusterSubnet}
   */
  public void setClusterSubnet(String clusterSubnet) {
    this.clusterSubnet = clusterSubnet;
  }

  /**
   * Get the value of property {@code serviceSubnet}.
   *
   * @return the value of {@code serviceSubnet}
   */
  public String getServiceSubnet() {
    return serviceSubnet;
  }

  /**
   * Set the value of property {@code serviceSubnet}.
   *
   * @param serviceSubnet the value of {@code serviceSubnet}
   */
  public void setServiceSubnet(String serviceSubnet) {
    this.serviceSubnet = serviceSubnet;
  }

  /**
   * Get the value of property {@code vpcUuid}.
   *
   * @return the value of {@code vpcUuid}
   */
  public String getVpcUuid() {
    return vpcUuid;
  }

  /**
   * Set the value of property {@code vpcUuid}.
   *
   * @param vpcUuid the value of {@code vpcUuid}
   */
  public void setVpcUuid(String vpcUuid) {
    this.vpcUuid = vpcUuid;
  }

  /**
   * Get the value of property {@code tags}.
   *
   * @return the value of {@code tags}
   */
  public String[] getTags() {
    return tags;
  }

  /**
   * Set the value of property {@code tags}.
   *
   * @param tags the value of {@code tags}
   */
  public void setTags(String[] tags) {
    this.tags = tags;
  }

  /**
   * Get the value of property {@code maintenancePolicy}.
   *
   * @return the value of {@code maintenancePolicy}
   */
  public MaintenancePolicy getMaintenancePolicy() {
    return maintenancePolicy;
  }

  /**
   * Set the value of property {@code maintenancePolicy}.
   *
   * @param maintenancePolicy the value of {@code maintenancePolicy}
   */
  public void setMaintenancePolicy(MaintenancePolicy maintenancePolicy) {
    this.maintenancePolicy = maintenancePolicy;
  }

  /**
   * Get the value of property {@code nodePools}.
   *
   * @return the value of {@code nodePools}
   */
  public List<NodePool> getNodePools() {
    return nodePools;
  }

  /**
   * Set the value of property {@code nodePools}.
   *
   * @param nodePools the value of {@code nodePools}
   */
  public void setNodePools(List<NodePool> nodePools) {
    this.nodePools = nodePools;
  }

  /**
   * Get the value of property {@code createdAt}.
   *
   * @return the value of {@code createdAt}
   */
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * Set the value of property {@code createdAt}.
   *
   * @param createdAt the value of {@code createdAt}
   */
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Get the value of property {@code updatedAt}.
   *
   * @return the value of {@code updatedAt}
   */
  public String getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Set the value of property {@code updatedAt}.
   *
   * @param updatedAt the value of {@code updatedAt}
   */
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * Get the value of property {@code status}.
   *
   * @return the value of {@code status}
   */
  public Object getStatus() {
    return status;
  }

  /**
   * Set the value of property {@code status}.
   *
   * @param status the value of {@code status}
   */
  public void setStatus(Object status) {
    this.status = status;
  }
}
