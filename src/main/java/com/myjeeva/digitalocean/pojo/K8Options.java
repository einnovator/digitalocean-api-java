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

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * Kubernetes Options.
 *
 * @author EInnovator (support@einnovator.org)
 */
public class K8Options extends Base {

  private static final long serialVersionUID = 5958407274594550472L;

  /**
   * An array containing sets of "kubernetes_version" and "slug" attributes corresponding to an available version of Kubernetes.
   */
  private Object[] versions;

  /**
  * An array containing sets of "name" and "slug" attributes corresponding to a region where the Kubernetes service is available.
  */
  private  Object[] regions;

 
  /**
  * An array containing sets of "name" and "slug" attributes corresponding to a Droplet size available for use in Kubernetes node pools.
  */
  private Object[] sizes;
  
	
  public K8Options() {
  }

  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }

	/**
	 * Get the value of property {@code versions}.
	 *
	 * @return the value of {@code versions}
	 */
	public Object[] getVersions() {
		return versions;
	}

	/**
	 * Set the value of property {@code versions}.
	 *
	 * @param versions the value of {@code versions}
	 */
	public void setVersions(Object[] versions) {
		this.versions = versions;
	}

	/**
	 * Get the value of property {@code regions}.
	 *
	 * @return the value of {@code regions}
	 */
	public Object[] getRegions() {
		return regions;
	}

	/**
	 * Set the value of property {@code regions}.
	 *
	 * @param regions the value of {@code regions}
	 */
	public void setRegions(Object[] regions) {
		this.regions = regions;
	}

	/**
	 * Get the value of property {@code sizes}.
	 *
	 * @return the value of {@code sizes}
	 */
	public Object[] getSizes() {
		return sizes;
	}

	/**
	 * Set the value of property {@code sizes}.
	 *
	 * @param sizes the value of {@code sizes}
	 */
	public void setSizes(Object[] sizes) {
		this.sizes = sizes;
	}

}
