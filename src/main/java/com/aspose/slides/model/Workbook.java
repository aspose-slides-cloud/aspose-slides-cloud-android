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
import com.aspose.slides.model.DataSource;
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
 * Represents Excel spreadsheet data source.
 */
@ApiModel(description = "Represents Excel spreadsheet data source.")
public class Workbook extends DataSource {
  @SerializedName(value = "worksheetIndex", alternate = { "WorksheetIndex" })
  private Integer worksheetIndex;

  @SerializedName(value = "columnIndex", alternate = { "ColumnIndex" })
  private Integer columnIndex;

  @SerializedName(value = "rowIndex", alternate = { "RowIndex" })
  private Integer rowIndex;


  public Workbook() {
    super();
    setType(TypeEnum.WORKBOOK);
  }

  public Workbook worksheetIndex(Integer worksheetIndex) {
    this.worksheetIndex = worksheetIndex;
    return this;
  }

   /**
   * Worksheet index.
   * @return worksheetIndex
  **/
  @ApiModelProperty(required = true, value = "Worksheet index.")
  public Integer getWorksheetIndex() {
    return worksheetIndex;
  }

  public void setWorksheetIndex(Integer worksheetIndex) {
    this.worksheetIndex = worksheetIndex;
  }

  public Workbook columnIndex(Integer columnIndex) {
    this.columnIndex = columnIndex;
    return this;
  }

   /**
   * Column index of the first value.
   * @return columnIndex
  **/
  @ApiModelProperty(required = true, value = "Column index of the first value.")
  public Integer getColumnIndex() {
    return columnIndex;
  }

  public void setColumnIndex(Integer columnIndex) {
    this.columnIndex = columnIndex;
  }

  public Workbook rowIndex(Integer rowIndex) {
    this.rowIndex = rowIndex;
    return this;
  }

   /**
   * Row index of the first value.
   * @return rowIndex
  **/
  @ApiModelProperty(required = true, value = "Row index of the first value.")
  public Integer getRowIndex() {
    return rowIndex;
  }

  public void setRowIndex(Integer rowIndex) {
    this.rowIndex = rowIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Workbook workbook = (Workbook) o;
    return true && Objects.equals(this.worksheetIndex, workbook.worksheetIndex) && Objects.equals(this.columnIndex, workbook.columnIndex) && Objects.equals(this.rowIndex, workbook.rowIndex) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(worksheetIndex, columnIndex, rowIndex, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workbook {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    worksheetIndex: ").append(toIndentedString(worksheetIndex)).append("\n");
    sb.append("    columnIndex: ").append(toIndentedString(columnIndex)).append("\n");
    sb.append("    rowIndex: ").append(toIndentedString(rowIndex)).append("\n");
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

  static {
      typeDeterminers.put("Type", TypeEnum.WORKBOOK);
  }
}
