package com.myjeeva.digitalocean.pojo;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * A list of Cluster.
 *
 * @author EInnovator (support@einnovator.org)
 */
public class Clusters extends Base {

  /** */
  private static final long serialVersionUID = 8318617726271096639L;

  @SerializedName("kubernetes_clusters")
  private List<Cluster> clusters;

  public Clusters() {}

  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }

  /** @return the clusters */
  public List<Cluster> getClusters() {
    return clusters;
  }

  /** @param clusters the clusters to set */
  public void setClusters(List<Cluster> clusters) {
    this.clusters = clusters;
  }
}
