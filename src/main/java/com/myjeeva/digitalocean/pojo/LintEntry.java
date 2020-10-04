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
 * Lint diagnostics result entry.
 *
 * @author EInnovator (support@einnovator.org)
 */
public class LintEntry extends Base {

  private static final long serialVersionUID = 5958407274594550472L;

  /**
   * The clusterlint check that resulted in the diagnostic.
   */
  @SerializedName("check_name")
  private String checkName;

  /**
   * Can be one of error, warning or suggestion.
   */
  @SerializedName("severity")
  private String severity;

  /**
   * Feedback about the object for users to fix.
   */
  @SerializedName("message")
  private String message;

  /**
   * Metadata about the Kubernetes API object the diagnostic is reported on.
   */
  private LintMeta object;

  /**
   * Create instance of {@code LintEntry}.
   *
   */
  public LintEntry() {
	}
  
  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }

	/**
	 * Get the value of property {@code checkName}.
	 *
	 * @return the value of {@code checkName}
	 */
	public String getCheckName() {
		return checkName;
	}

	/**
	 * Set the value of property {@code checkName}.
	 *
	 * @param checkName the value of {@code checkName}
	 */
	public void setCheckName(String checkName) {
		this.checkName = checkName;
	}

	/**
	 * Get the value of property {@code severity}.
	 *
	 * @return the value of {@code severity}
	 */
	public String getSeverity() {
		return severity;
	}

	/**
	 * Set the value of property {@code severity}.
	 *
	 * @param severity the value of {@code severity}
	 */
	public void setSeverity(String severity) {
		this.severity = severity;
	}

	/**
	 * Get the value of property {@code message}.
	 *
	 * @return the value of {@code message}
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Set the value of property {@code message}.
	 *
	 * @param message the value of {@code message}
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Get the value of property {@code object}.
	 *
	 * @return the value of {@code object}
	 */
	public LintMeta getObject() {
		return object;
	}

	/**
	 * Set the value of property {@code object}.
	 *
	 * @param object the value of {@code object}
	 */
	public void setObject(LintMeta object) {
		this.object = object;
	}
	
}
