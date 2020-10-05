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
 * Lint diagnostics result.
 *
 * @author EInnovator (support@einnovator.org)
 */
public class LintResult extends Base {

  private static final long serialVersionUID = 5958407274594550472L;

  /** Id of the clusterlint run that can be used later to fetch the diagnostics. */
  @SerializedName("run_id")
  private String runId;

  /**
   * A time value given in ISO8601 combined date and time format that represents when the schedule
   * clusterlint run request was made.
   */
  @SerializedName("requested_at")
  private String requestedAt;

  /**
   * A time value given in ISO8601 combined date and time format that represents when the schedule
   * clusterlint run request was completed.
   */
  @SerializedName("completed_at")
  private String completedAt;

  /** An array of diagnostics reporting potential problems for the given cluster. */
  @SerializedName("diagnostics")
  private LintEntry diagnostics;

  /** Create instance of {@code LintResult}. */
  public LintResult() {}

  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }

  /**
   * Get the value of property {@code runId}.
   *
   * @return the value of {@code runId}
   */
  public String getRunId() {
    return runId;
  }

  /**
   * Set the value of property {@code runId}.
   *
   * @param runId the value of {@code runId}
   */
  public void setRunId(String runId) {
    this.runId = runId;
  }

  /**
   * Get the value of property {@code requestedAt}.
   *
   * @return the value of {@code requestedAt}
   */
  public String getRequestedAt() {
    return requestedAt;
  }

  /**
   * Set the value of property {@code requestedAt}.
   *
   * @param requestedAt the value of {@code requestedAt}
   */
  public void setRequestedAt(String requestedAt) {
    this.requestedAt = requestedAt;
  }

  /**
   * Get the value of property {@code completedAt}.
   *
   * @return the value of {@code completedAt}
   */
  public String getCompletedAt() {
    return completedAt;
  }

  /**
   * Set the value of property {@code completedAt}.
   *
   * @param completedAt the value of {@code completedAt}
   */
  public void setCompletedAt(String completedAt) {
    this.completedAt = completedAt;
  }

  /**
   * Get the value of property {@code diagnostics}.
   *
   * @return the value of {@code diagnostics}
   */
  public LintEntry getDiagnostics() {
    return diagnostics;
  }

  /**
   * Set the value of property {@code diagnostics}.
   *
   * @param diagnostics the value of {@code diagnostics}
   */
  public void setDiagnostics(LintEntry diagnostics) {
    this.diagnostics = diagnostics;
  }
}
