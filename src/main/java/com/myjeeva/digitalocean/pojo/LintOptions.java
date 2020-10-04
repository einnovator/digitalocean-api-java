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
 * Options to Kubernetes cluster lint operation.
 *
 * @author EInnovator (support@einnovator.org)
 */
public class LintOptions extends Base {

  private static final long serialVersionUID = 5958407274594550472L;

  /**
   * An array of check groups that will be run when clusterlint executes checks.
   */
  @SerializedName("include_groups")
  private String[] includeGroups;

  /**
  * An array of checks that will be run when clusterlint executes checks.
  */
  @SerializedName("include_groups")
  private String[] includeChecks;

 
  /**
  * An array of check groups that will be omitted when clusterlint executes checks.
  */
  @SerializedName("exclude_groups")
  private String[] excludeGroups;
  

  /**
  * An array of checks that will be run when clusterlint executes checks.
  */
  @SerializedName("exclude_checks")
  private String[] excludeChecks;

  public LintOptions() {
  }

  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }

	/**
	 * Get the value of property {@code includeGroups}.
	 *
	 * @return the value of {@code includeGroups}
	 */
	public String[] getIncludeGroups() {
		return includeGroups;
	}

	/**
	 * Set the value of property {@code includeGroups}.
	 *
	 * @param includeGroups the value of {@code includeGroups}
	 */
	public void setIncludeGroups(String[] includeGroups) {
		this.includeGroups = includeGroups;
	}

	/**
	 * Get the value of property {@code includeChecks}.
	 *
	 * @return the value of {@code includeChecks}
	 */
	public String[] getIncludeChecks() {
		return includeChecks;
	}

	/**
	 * Set the value of property {@code includeChecks}.
	 *
	 * @param includeChecks the value of {@code includeChecks}
	 */
	public void setIncludeChecks(String[] includeChecks) {
		this.includeChecks = includeChecks;
	}

	/**
	 * Get the value of property {@code excludeGroups}.
	 *
	 * @return the value of {@code excludeGroups}
	 */
	public String[] getExcludeGroups() {
		return excludeGroups;
	}

	/**
	 * Set the value of property {@code excludeGroups}.
	 *
	 * @param excludeGroups the value of {@code excludeGroups}
	 */
	public void setExcludeGroups(String[] excludeGroups) {
		this.excludeGroups = excludeGroups;
	}

	/**
	 * Get the value of property {@code excludeChecks}.
	 *
	 * @return the value of {@code excludeChecks}
	 */
	public String[] getExcludeChecks() {
		return excludeChecks;
	}

	/**
	 * Set the value of property {@code excludeChecks}.
	 *
	 * @param excludeChecks the value of {@code excludeChecks}
	 */
	public void setExcludeChecks(String[] excludeChecks) {
		this.excludeChecks = excludeChecks;
	}
	
	
}
