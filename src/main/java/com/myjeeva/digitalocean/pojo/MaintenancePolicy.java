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
 * Represents Domain (TLD) attributes of DigitalOcean DNS. Revised as per v2 API data structure.
 *
 * @author EInnovator (support@einnovator.org)
 */
public class MaintenancePolicy extends Base {

  private static final long serialVersionUID = 5958407274594550472L;

  /**
   * The start time in UTC of the maintenance window policy in 24-hour clock format / HH:MM notation (e.g., 15:00).
   */
  @SerializedName("start_time")
  private String startTime;

  /**
   * The day of the maintenance window policy. May be one of "monday" through "sunday", or "any" to indicate an arbitrary week day.
   */
  @SerializedName("day")
  private String day;
  
  public MaintenancePolicy() {
  }


  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }


	/**
	 * Get the value of property {@code startTime}.
	 *
	 * @return the value of {@code startTime}
	 */
	public String getStartTime() {
		return startTime;
	}


	/**
	 * Set the value of property {@code startTime}.
	 *
	 * @param startTime the value of {@code startTime}
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}


	/**
	 * Get the value of property {@code day}.
	 *
	 * @return the value of {@code day}
	 */
	public String getDay() {
		return day;
	}


	/**
	 * Set the value of property {@code day}.
	 *
	 * @param day the value of {@code day}
	 */
	public void setDay(String day) {
		this.day = day;
	}

  
}
