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
import com.aspose.slides.model.ImageTransformEffect;
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
 * Represents a Color Change effect.
 */
@ApiModel(description = "Represents a Color Change effect.")
public class ColorChangeEffect extends ImageTransformEffect {
  @SerializedName(value = "fromColor", alternate = { "FromColor" })
  private String fromColor;

  @SerializedName(value = "toColor", alternate = { "ToColor" })
  private String toColor;


  public ColorChangeEffect() {
    super();
    setType(TypeEnum.COLORCHANGE);
  }

  public ColorChangeEffect fromColor(String fromColor) {
    this.fromColor = fromColor;
    return this;
  }

   /**
   * Color which will be replaced.
   * @return fromColor
  **/
  @ApiModelProperty(value = "Color which will be replaced.")
  public String getFromColor() {
    return fromColor;
  }

  public void setFromColor(String fromColor) {
    this.fromColor = fromColor;
  }

  public ColorChangeEffect toColor(String toColor) {
    this.toColor = toColor;
    return this;
  }

   /**
   * Color which will replace.
   * @return toColor
  **/
  @ApiModelProperty(value = "Color which will replace.")
  public String getToColor() {
    return toColor;
  }

  public void setToColor(String toColor) {
    this.toColor = toColor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColorChangeEffect colorChangeEffect = (ColorChangeEffect) o;
    return true && Objects.equals(this.fromColor, colorChangeEffect.fromColor) && Objects.equals(this.toColor, colorChangeEffect.toColor) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromColor, toColor, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColorChangeEffect {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    fromColor: ").append(toIndentedString(fromColor)).append("\n");
    sb.append("    toColor: ").append(toIndentedString(toColor)).append("\n");
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
      typeDeterminers.put("Type", TypeEnum.COLORCHANGE);
  }
}
