package com.myjeeva.digitalocean.pojo;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * A list of NodePool.
 *
 * @author EInnovator (support@einnovator.org)
 */
public class NodePools extends Base {

  /** */
  private static final long serialVersionUID = 8318617726271096639L;

  @SerializedName("node_pools")
  private List<NodePool> nodePools;

  public NodePools() {}

  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }

  /** @return the nodePools */
  public List<NodePool> getNodePools() {
    return nodePools;
  }

  /** @param nodePools the nodePools to set */
  public void setNodePools(List<NodePool> nodePools) {
    this.nodePools = nodePools;
  }
}
