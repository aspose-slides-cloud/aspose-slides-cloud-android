/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose">
 *   Copyright (c) 2018 Aspose.Slides for Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package com.aspose.slides.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

/**
 * Operation progress.
 */
@ApiModel(description = "Operation progress.")
public class OperationProgress {
  @SerializedName(value = "description", alternate = { "Description" })
  private String description;

  @SerializedName(value = "stepIndex", alternate = { "StepIndex" })
  private Integer stepIndex;

  @SerializedName(value = "stepCount", alternate = { "StepCount" })
  private Integer stepCount;


  public OperationProgress() {
    super();
  }

  public OperationProgress description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description.
   * @return description
  **/
  @ApiModelProperty(value = "Description.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OperationProgress stepIndex(Integer stepIndex) {
    this.stepIndex = stepIndex;
    return this;
  }

   /**
   * Current Step Index.
   * @return stepIndex
  **/
  @ApiModelProperty(required = true, value = "Current Step Index.")
  public Integer getStepIndex() {
    return stepIndex;
  }

  public void setStepIndex(Integer stepIndex) {
    this.stepIndex = stepIndex;
  }

  public OperationProgress stepCount(Integer stepCount) {
    this.stepCount = stepCount;
    return this;
  }

   /**
   * Current Step Index.
   * @return stepCount
  **/
  @ApiModelProperty(required = true, value = "Current Step Index.")
  public Integer getStepCount() {
    return stepCount;
  }

  public void setStepCount(Integer stepCount) {
    this.stepCount = stepCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationProgress operationProgress = (OperationProgress) o;
    return true && Objects.equals(this.description, operationProgress.description) && Objects.equals(this.stepIndex, operationProgress.stepIndex) && Objects.equals(this.stepCount, operationProgress.stepCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, stepIndex, stepCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationProgress {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    stepIndex: ").append(toIndentedString(stepIndex)).append("\n");
    sb.append("    stepCount: ").append(toIndentedString(stepCount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }



  private static final Map<String, Object> typeDeterminers = new Hashtable<String, Object>();

}
