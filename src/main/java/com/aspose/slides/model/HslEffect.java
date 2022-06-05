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
 * Represents a Hue/Saturation/Luminance effect.
 */
@ApiModel(description = "Represents a Hue/Saturation/Luminance effect.")
public class HslEffect extends ImageTransformEffect {
  @SerializedName(value = "hue", alternate = { "Hue" })
  private Double hue;

  @SerializedName(value = "saturation", alternate = { "Saturation" })
  private Double saturation;

  @SerializedName(value = "luminance", alternate = { "Luminance" })
  private Double luminance;


  public HslEffect() {
    super();
    setType(TypeEnum.HSL);
  }

  public HslEffect hue(Double hue) {
    this.hue = hue;
    return this;
  }

   /**
   * Hue
   * @return hue
  **/
  @ApiModelProperty(required = true, value = "Hue")
  public Double getHue() {
    return hue;
  }

  public void setHue(Double hue) {
    this.hue = hue;
  }

  public HslEffect saturation(Double saturation) {
    this.saturation = saturation;
    return this;
  }

   /**
   * Saturation
   * @return saturation
  **/
  @ApiModelProperty(required = true, value = "Saturation")
  public Double getSaturation() {
    return saturation;
  }

  public void setSaturation(Double saturation) {
    this.saturation = saturation;
  }

  public HslEffect luminance(Double luminance) {
    this.luminance = luminance;
    return this;
  }

   /**
   * Luminance
   * @return luminance
  **/
  @ApiModelProperty(required = true, value = "Luminance")
  public Double getLuminance() {
    return luminance;
  }

  public void setLuminance(Double luminance) {
    this.luminance = luminance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HslEffect hslEffect = (HslEffect) o;
    return true && Objects.equals(this.hue, hslEffect.hue) && Objects.equals(this.saturation, hslEffect.saturation) && Objects.equals(this.luminance, hslEffect.luminance) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hue, saturation, luminance, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HslEffect {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    hue: ").append(toIndentedString(hue)).append("\n");
    sb.append("    saturation: ").append(toIndentedString(saturation)).append("\n");
    sb.append("    luminance: ").append(toIndentedString(luminance)).append("\n");
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
      typeDeterminers.put("Type", TypeEnum.HSL);
  }
}
