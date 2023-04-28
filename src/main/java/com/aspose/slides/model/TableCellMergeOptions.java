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
 * Table cells merge options
 */
@ApiModel(description = "Table cells merge options")
public class TableCellMergeOptions {
  @SerializedName(value = "firstRowIndex", alternate = { "FirstRowIndex" })
  private Integer firstRowIndex;

  @SerializedName(value = "firstCellIndex", alternate = { "FirstCellIndex" })
  private Integer firstCellIndex;

  @SerializedName(value = "lastRowIndex", alternate = { "LastRowIndex" })
  private Integer lastRowIndex;

  @SerializedName(value = "lastCellIndex", alternate = { "LastCellIndex" })
  private Integer lastCellIndex;

  @SerializedName(value = "allowSplitting", alternate = { "AllowSplitting" })
  private Boolean allowSplitting;


  public TableCellMergeOptions() {
    super();
  }

  public TableCellMergeOptions firstRowIndex(Integer firstRowIndex) {
    this.firstRowIndex = firstRowIndex;
    return this;
  }

   /**
   * Row index of the first cell
   * @return firstRowIndex
  **/
  @ApiModelProperty(required = true, value = "Row index of the first cell")
  public Integer getFirstRowIndex() {
    return firstRowIndex;
  }

  public void setFirstRowIndex(Integer firstRowIndex) {
    this.firstRowIndex = firstRowIndex;
  }

  public TableCellMergeOptions firstCellIndex(Integer firstCellIndex) {
    this.firstCellIndex = firstCellIndex;
    return this;
  }

   /**
   * First cell index in the row
   * @return firstCellIndex
  **/
  @ApiModelProperty(required = true, value = "First cell index in the row")
  public Integer getFirstCellIndex() {
    return firstCellIndex;
  }

  public void setFirstCellIndex(Integer firstCellIndex) {
    this.firstCellIndex = firstCellIndex;
  }

  public TableCellMergeOptions lastRowIndex(Integer lastRowIndex) {
    this.lastRowIndex = lastRowIndex;
    return this;
  }

   /**
   * Row index of the last cell
   * @return lastRowIndex
  **/
  @ApiModelProperty(required = true, value = "Row index of the last cell")
  public Integer getLastRowIndex() {
    return lastRowIndex;
  }

  public void setLastRowIndex(Integer lastRowIndex) {
    this.lastRowIndex = lastRowIndex;
  }

  public TableCellMergeOptions lastCellIndex(Integer lastCellIndex) {
    this.lastCellIndex = lastCellIndex;
    return this;
  }

   /**
   * Last cell index in the row
   * @return lastCellIndex
  **/
  @ApiModelProperty(required = true, value = "Last cell index in the row")
  public Integer getLastCellIndex() {
    return lastCellIndex;
  }

  public void setLastCellIndex(Integer lastCellIndex) {
    this.lastCellIndex = lastCellIndex;
  }

  public TableCellMergeOptions allowSplitting(Boolean allowSplitting) {
    this.allowSplitting = allowSplitting;
    return this;
  }

   /**
   * Allow splitting
   * @return allowSplitting
  **/
  @ApiModelProperty(required = true, value = "Allow splitting")
  public Boolean isAllowSplitting() {
    return allowSplitting;
  }

  public void setAllowSplitting(Boolean allowSplitting) {
    this.allowSplitting = allowSplitting;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableCellMergeOptions tableCellMergeOptions = (TableCellMergeOptions) o;
    return true && Objects.equals(this.firstRowIndex, tableCellMergeOptions.firstRowIndex) && Objects.equals(this.firstCellIndex, tableCellMergeOptions.firstCellIndex) && Objects.equals(this.lastRowIndex, tableCellMergeOptions.lastRowIndex) && Objects.equals(this.lastCellIndex, tableCellMergeOptions.lastCellIndex) && Objects.equals(this.allowSplitting, tableCellMergeOptions.allowSplitting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstRowIndex, firstCellIndex, lastRowIndex, lastCellIndex, allowSplitting);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableCellMergeOptions {\n");
    
    sb.append("    firstRowIndex: ").append(toIndentedString(firstRowIndex)).append("\n");
    sb.append("    firstCellIndex: ").append(toIndentedString(firstCellIndex)).append("\n");
    sb.append("    lastRowIndex: ").append(toIndentedString(lastRowIndex)).append("\n");
    sb.append("    lastCellIndex: ").append(toIndentedString(lastCellIndex)).append("\n");
    sb.append("    allowSplitting: ").append(toIndentedString(allowSplitting)).append("\n");
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
