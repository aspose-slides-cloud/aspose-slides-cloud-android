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
import com.aspose.slides.model.DataPoint;
import com.aspose.slides.model.EffectFormat;
import com.aspose.slides.model.FillFormat;
import com.aspose.slides.model.LineFormat;
import com.aspose.slides.model.SeriesMarker;
import com.aspose.slides.model.ThreeDFormat;
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
 * One value chart data point.
 */
@ApiModel(description = "One value chart data point.")
public class OneValueChartDataPoint extends DataPoint {
  @SerializedName(value = "value", alternate = { "Value" })
  private Double value;

  @SerializedName(value = "valueFormula", alternate = { "ValueFormula" })
  private String valueFormula;

  @SerializedName(value = "setAsTotal", alternate = { "SetAsTotal" })
  private Boolean setAsTotal;

  @SerializedName(value = "invertIfNegative", alternate = { "InvertIfNegative" })
  private Boolean invertIfNegative;


  public OneValueChartDataPoint() {
    super();
    setType(TypeEnum.ONEVALUE);
  }

  public OneValueChartDataPoint value(Double value) {
    this.value = value;
    return this;
  }

   /**
   * Value.
   * @return value
  **/
  @ApiModelProperty(value = "Value.")
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  public OneValueChartDataPoint valueFormula(String valueFormula) {
    this.valueFormula = valueFormula;
    return this;
  }

   /**
   * Spreadsheet formula in A1-style.
   * @return valueFormula
  **/
  @ApiModelProperty(value = "Spreadsheet formula in A1-style.")
  public String getValueFormula() {
    return valueFormula;
  }

  public void setValueFormula(String valueFormula) {
    this.valueFormula = valueFormula;
  }

  public OneValueChartDataPoint setAsTotal(Boolean setAsTotal) {
    this.setAsTotal = setAsTotal;
    return this;
  }

   /**
   * SetAsTotal. Applied to Waterfall data points only.
   * @return setAsTotal
  **/
  @ApiModelProperty(value = "SetAsTotal. Applied to Waterfall data points only.")
  public Boolean isSetAsTotal() {
    return setAsTotal;
  }

  public void setSetAsTotal(Boolean setAsTotal) {
    this.setAsTotal = setAsTotal;
  }

  public OneValueChartDataPoint invertIfNegative(Boolean invertIfNegative) {
    this.invertIfNegative = invertIfNegative;
    return this;
  }

   /**
   * True if the data point shall invert its colors if the value is negative. Applies to bar, column and bubble series.
   * @return invertIfNegative
  **/
  @ApiModelProperty(value = "True if the data point shall invert its colors if the value is negative. Applies to bar, column and bubble series.")
  public Boolean isInvertIfNegative() {
    return invertIfNegative;
  }

  public void setInvertIfNegative(Boolean invertIfNegative) {
    this.invertIfNegative = invertIfNegative;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OneValueChartDataPoint oneValueChartDataPoint = (OneValueChartDataPoint) o;
    return true && Objects.equals(this.value, oneValueChartDataPoint.value) && Objects.equals(this.valueFormula, oneValueChartDataPoint.valueFormula) && Objects.equals(this.setAsTotal, oneValueChartDataPoint.setAsTotal) && Objects.equals(this.invertIfNegative, oneValueChartDataPoint.invertIfNegative) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, valueFormula, setAsTotal, invertIfNegative, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OneValueChartDataPoint {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueFormula: ").append(toIndentedString(valueFormula)).append("\n");
    sb.append("    setAsTotal: ").append(toIndentedString(setAsTotal)).append("\n");
    sb.append("    invertIfNegative: ").append(toIndentedString(invertIfNegative)).append("\n");
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
      typeDeterminers.put("Type", TypeEnum.ONEVALUE);
  }
}
