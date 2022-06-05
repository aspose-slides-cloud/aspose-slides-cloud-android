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
 * Represents a Blur effect that is applied to the entire shape, including its fill. All color channels, including alpha, are affected.
 */
@ApiModel(description = "Represents a Blur effect that is applied to the entire shape, including its fill. All color channels, including alpha, are affected.")
public class BlurImageEffect extends ImageTransformEffect {
  @SerializedName(value = "radius", alternate = { "Radius" })
  private Double radius;

  @SerializedName(value = "grow", alternate = { "Grow" })
  private Boolean grow;


  public BlurImageEffect() {
    super();
    setType(TypeEnum.BLUR);
  }

  public BlurImageEffect radius(Double radius) {
    this.radius = radius;
    return this;
  }

   /**
   * Returns or sets blur radius.
   * @return radius
  **/
  @ApiModelProperty(required = true, value = "Returns or sets blur radius.")
  public Double getRadius() {
    return radius;
  }

  public void setRadius(Double radius) {
    this.radius = radius;
  }

  public BlurImageEffect grow(Boolean grow) {
    this.grow = grow;
    return this;
  }

   /**
   * Determines whether the bounds of the object should be grown as a result of the blurring. True indicates the bounds are grown while false indicates that they are not.
   * @return grow
  **/
  @ApiModelProperty(required = true, value = "Determines whether the bounds of the object should be grown as a result of the blurring. True indicates the bounds are grown while false indicates that they are not.")
  public Boolean isGrow() {
    return grow;
  }

  public void setGrow(Boolean grow) {
    this.grow = grow;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlurImageEffect blurImageEffect = (BlurImageEffect) o;
    return true && Objects.equals(this.radius, blurImageEffect.radius) && Objects.equals(this.grow, blurImageEffect.grow) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(radius, grow, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlurImageEffect {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    radius: ").append(toIndentedString(radius)).append("\n");
    sb.append("    grow: ").append(toIndentedString(grow)).append("\n");
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
      typeDeterminers.put("Type", TypeEnum.BLUR);
  }
}
