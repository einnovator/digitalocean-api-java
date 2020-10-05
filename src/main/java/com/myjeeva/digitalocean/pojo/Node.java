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
 * A Node part of a NodePool in a Kubernetes Cluster.
 *
 * @author EInnovator (support@einnovator.org)
 */
public class Node extends Base {

  private static final long serialVersionUID = 5958407274594550472L;

  /** A unique ID that can be used to identify and reference the node. */
  private String id;

  /** An automatically generated, human-readable name for the node. */
  private String name;

  /**
   * An object containing a "state" attribute whose value is set to a string indicating the current
   * status of the node. Potential values include running, provisioning, and errored.
   */
  @SerializedName("status")
  private Object status;

  /**
   * A time value given in ISO8601 combined date and time format that represents when the node was
   * created.
   */
  @SerializedName("created_at")
  private String createdAt;

  /**
   * A time value given in ISO8601 combined date and time format that represents when the node was
   * last updated.
   */
  @SerializedName("updated_at")
  private String updatedAt;

  public Node() {
    // Default Constructor
  }

  public Node(String name) {
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
}
