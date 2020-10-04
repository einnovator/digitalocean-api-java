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

import com.google.gson.annotations.SerializedName;

/**
 * Lint Metada about the Kubernetes API object the diagnostic is reported on.
 *
 * @author EInnovator (support@einnovator.org)
 */
public class LintMeta extends Base {

  private static final long serialVersionUID = 5958407274594550472L;

  /**
   * Name of the object
   */
  @SerializedName("name")
  private String name;

  /**
   * The kind of Kubernetes API object
   */
  @SerializedName("kind")
  private String kind;

  /**
   * The namespace the object resides in the cluster..
   */
  @SerializedName("namespace")
  private String namespace;

  /**
   * Create instance of {@code LintMeta}.
   *
   */
  public LintMeta() {
	}

  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
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
	 * Get the value of property {@code kind}.
	 *
	 * @return the value of {@code kind}
	 */
	public String getKind() {
		return kind;
	}

	/**
	 * Set the value of property {@code kind}.
	 *
	 * @param kind the value of {@code kind}
	 */
	public void setKind(String kind) {
		this.kind = kind;
	}

	/**
	 * Get the value of property {@code namespace}.
	 *
	 * @return the value of {@code namespace}
	 */
	public String getNamespace() {
		return namespace;
	}

	/**
	 * Set the value of property {@code namespace}.
	 *
	 * @param namespace the value of {@code namespace}
	 */
	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	
  
	
}
