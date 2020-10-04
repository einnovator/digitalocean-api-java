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

import java.util.Map;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.google.gson.annotations.SerializedName;

/**
 * A NodePool.
 *
 * @author EInnovator (support@einnovator.org)
 */
public class NodePool extends Base {

  private static final long serialVersionUID = 5958407274594550472L;

 /**
  * The slug identifier for the type of Droplet to be used as workers in the node pool.
  */
  private String size;

  /**
   * A human-readable name for the node pool.
   */
  @SerializedName("name")
  private String name;

  /**
   * The number of Droplet instances in the node pool.
   */
  private Integer count;

  /**
   * An object containing a set of Kubernetes labels. The keys are user-defined.	
   */
  private Map<String, String> labels;

  /**
 * An object specifying the details of a specific worker node in a node pool. 
 */
  private Node[] nodes;
  
  /**
   * A boolean value indicating whether auto-scaling is enabled for this node pool. This requires DOKS versions at least 1.13.10-do.3, 1.14.6-do.3, or 1.15.3-do.3.
   */
  @SerializedName("auto_scale")
  private Boolean autoScale;

  /**
   * min_nodes	integer	The minimum number of nodes that this node pool can be auto-scaled to. This will fail validation if the additional nodes will exceed your account droplet limit.	
   */
  @SerializedName("min_nodes")
  private Integer minNodes;

  /**
   * The maximum number of nodes that this node pool can be auto-scaled to. This can be 0, but your cluster must contain at least 1 node across all node pools.
   */
  @SerializedName("max_nodes")
  private Integer maxNodes;

  public NodePool() {
  }

  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }

	/**
	 * Get the value of property {@code size}.
	 *
	 * @return the value of {@code size}
	 */
	public String getSize() {
		return size;
	}

	/**
	 * Set the value of property {@code size}.
	 *
	 * @param size the value of {@code size}
	 */
	public void setSize(String size) {
		this.size = size;
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
	 * Get the value of property {@code count}.
	 *
	 * @return the value of {@code count}
	 */
	public Integer getCount() {
		return count;
	}

	/**
	 * Set the value of property {@code count}.
	 *
	 * @param count the value of {@code count}
	 */
	public void setCount(Integer count) {
		this.count = count;
	}

	/**
	 * Get the value of property {@code labels}.
	 *
	 * @return the value of {@code labels}
	 */
	public Map<String, String> getLabels() {
		return labels;
	}

	/**
	 * Set the value of property {@code labels}.
	 *
	 * @param labels the value of {@code labels}
	 */
	public void setLabels(Map<String, String> labels) {
		this.labels = labels;
	}

	/**
	 * Get the value of property {@code nodes}.
	 *
	 * @return the value of {@code nodes}
	 */
	public Node[] getNodes() {
		return nodes;
	}

	/**
	 * Set the value of property {@code nodes}.
	 *
	 * @param nodes the value of {@code nodes}
	 */
	public void setNodes(Node[] nodes) {
		this.nodes = nodes;
	}

	/**
	 * Get the value of property {@code autoScale}.
	 *
	 * @return the value of {@code autoScale}
	 */
	public Boolean getAutoScale() {
		return autoScale;
	}

	/**
	 * Set the value of property {@code autoScale}.
	 *
	 * @param autoScale the value of {@code autoScale}
	 */
	public void setAutoScale(Boolean autoScale) {
		this.autoScale = autoScale;
	}

	/**
	 * Get the value of property {@code minNodes}.
	 *
	 * @return the value of {@code minNodes}
	 */
	public Integer getMinNodes() {
		return minNodes;
	}

	/**
	 * Set the value of property {@code minNodes}.
	 *
	 * @param minNodes the value of {@code minNodes}
	 */
	public void setMinNodes(Integer minNodes) {
		this.minNodes = minNodes;
	}

	/**
	 * Get the value of property {@code maxNodes}.
	 *
	 * @return the value of {@code maxNodes}
	 */
	public Integer getMaxNodes() {
		return maxNodes;
	}

	/**
	 * Set the value of property {@code maxNodes}.
	 *
	 * @param maxNodes the value of {@code maxNodes}
	 */
	public void setMaxNodes(Integer maxNodes) {
		this.maxNodes = maxNodes;
	}

  
}
