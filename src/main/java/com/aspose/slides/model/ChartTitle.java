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
import com.aspose.slides.model.EffectFormat;
import com.aspose.slides.model.FillFormat;
import com.aspose.slides.model.LineFormat;
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
 * Represents chart title
 */
@ApiModel(description = "Represents chart title")
public class ChartTitle {
  @SerializedName(value = "text", alternate = { "Text" })
  private String text;

  @SerializedName(value = "x", alternate = { "X" })
  private Double x;

  @SerializedName(value = "y", alternate = { "Y" })
  private Double y;

  @SerializedName(value = "width", alternate = { "Width" })
  private Double width;

  @SerializedName(value = "height", alternate = { "Height" })
  private Double height;

  @SerializedName(value = "overlay", alternate = { "Overlay" })
  private Boolean overlay;

  @SerializedName(value = "fillFormat", alternate = { "FillFormat" })
  private FillFormat fillFormat;

  @SerializedName(value = "effectFormat", alternate = { "EffectFormat" })
  private EffectFormat effectFormat;

  @SerializedName(value = "lineFormat", alternate = { "LineFormat" })
  private LineFormat lineFormat;


  public ChartTitle() {
    super();
  }

  public ChartTitle text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get or sets the text.
   * @return text
  **/
  @ApiModelProperty(value = "Get or sets the text.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public ChartTitle x(Double x) {
    this.x = x;
    return this;
  }

   /**
   * the X location
   * @return x
  **/
  @ApiModelProperty(value = "the X location")
  public Double getX() {
    return x;
  }

  public void setX(Double x) {
    this.x = x;
  }

  public ChartTitle y(Double y) {
    this.y = y;
    return this;
  }

   /**
   * the Y location
   * @return y
  **/
  @ApiModelProperty(value = "the Y location")
  public Double getY() {
    return y;
  }

  public void setY(Double y) {
    this.y = y;
  }

  public ChartTitle width(Double width) {
    this.width = width;
    return this;
  }

   /**
   * Width
   * @return width
  **/
  @ApiModelProperty(value = "Width")
  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public ChartTitle height(Double height) {
    this.height = height;
    return this;
  }

   /**
   * Height
   * @return height
  **/
  @ApiModelProperty(value = "Height")
  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public ChartTitle overlay(Boolean overlay) {
    this.overlay = overlay;
    return this;
  }

   /**
   * true if other elements are allowed to overlay the legend
   * @return overlay
  **/
  @ApiModelProperty(value = "true if other elements are allowed to overlay the legend")
  public Boolean isOverlay() {
    return overlay;
  }

  public void setOverlay(Boolean overlay) {
    this.overlay = overlay;
  }

  public ChartTitle fillFormat(FillFormat fillFormat) {
    this.fillFormat = fillFormat;
    return this;
  }

   /**
   * Get or sets the fill format.
   * @return fillFormat
  **/
  @ApiModelProperty(value = "Get or sets the fill format.")
  public FillFormat getFillFormat() {
    return fillFormat;
  }

  public void setFillFormat(FillFormat fillFormat) {
    this.fillFormat = fillFormat;
  }

  public ChartTitle effectFormat(EffectFormat effectFormat) {
    this.effectFormat = effectFormat;
    return this;
  }

   /**
   * Get or sets the effect format.
   * @return effectFormat
  **/
  @ApiModelProperty(value = "Get or sets the effect format.")
  public EffectFormat getEffectFormat() {
    return effectFormat;
  }

  public void setEffectFormat(EffectFormat effectFormat) {
    this.effectFormat = effectFormat;
  }

  public ChartTitle lineFormat(LineFormat lineFormat) {
    this.lineFormat = lineFormat;
    return this;
  }

   /**
   * Get or sets the line format.
   * @return lineFormat
  **/
  @ApiModelProperty(value = "Get or sets the line format.")
  public LineFormat getLineFormat() {
    return lineFormat;
  }

  public void setLineFormat(LineFormat lineFormat) {
    this.lineFormat = lineFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChartTitle chartTitle = (ChartTitle) o;
    return true && Objects.equals(this.text, chartTitle.text) && Objects.equals(this.x, chartTitle.x) && Objects.equals(this.y, chartTitle.y) && Objects.equals(this.width, chartTitle.width) && Objects.equals(this.height, chartTitle.height) && Objects.equals(this.overlay, chartTitle.overlay) && Objects.equals(this.fillFormat, chartTitle.fillFormat) && Objects.equals(this.effectFormat, chartTitle.effectFormat) && Objects.equals(this.lineFormat, chartTitle.lineFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, x, y, width, height, overlay, fillFormat, effectFormat, lineFormat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartTitle {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    overlay: ").append(toIndentedString(overlay)).append("\n");
    sb.append("    fillFormat: ").append(toIndentedString(fillFormat)).append("\n");
    sb.append("    effectFormat: ").append(toIndentedString(effectFormat)).append("\n");
    sb.append("    lineFormat: ").append(toIndentedString(lineFormat)).append("\n");
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
