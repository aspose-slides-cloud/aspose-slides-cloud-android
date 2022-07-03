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
import com.aspose.slides.model.ResourceBase;
import com.aspose.slides.model.ResourceUri;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

/**
 * Represents Format Scheme for slide&#39;s theme
 */
@ApiModel(description = "Represents Format Scheme for slide's theme")
public class FormatScheme extends ResourceBase {
  @SerializedName(value = "backgroundStyles", alternate = { "BackgroundStyles" })
  private List<FillFormat> backgroundStyles = null;

  @SerializedName(value = "effectStyles", alternate = { "EffectStyles" })
  private List<EffectFormat> effectStyles = null;

  @SerializedName(value = "fillStyles", alternate = { "FillStyles" })
  private List<FillFormat> fillStyles = null;

  @SerializedName(value = "lineStyles", alternate = { "LineStyles" })
  private List<LineFormat> lineStyles = null;


  public FormatScheme() {
    super();
  }

  public FormatScheme backgroundStyles(List<FillFormat> backgroundStyles) {
    this.backgroundStyles = backgroundStyles;
    return this;
  }

  public FormatScheme addBackgroundStylesItem(FillFormat backgroundStylesItem) {
    if (this.backgroundStyles == null) {
      this.backgroundStyles = new ArrayList<FillFormat>();
    }
    this.backgroundStyles.add(backgroundStylesItem);
    return this;
  }

   /**
   * Background styles.
   * @return backgroundStyles
  **/
  @ApiModelProperty(value = "Background styles.")
  public List<FillFormat> getBackgroundStyles() {
    return backgroundStyles;
  }

  public void setBackgroundStyles(List<FillFormat> backgroundStyles) {
    this.backgroundStyles = backgroundStyles;
  }

  public FormatScheme effectStyles(List<EffectFormat> effectStyles) {
    this.effectStyles = effectStyles;
    return this;
  }

  public FormatScheme addEffectStylesItem(EffectFormat effectStylesItem) {
    if (this.effectStyles == null) {
      this.effectStyles = new ArrayList<EffectFormat>();
    }
    this.effectStyles.add(effectStylesItem);
    return this;
  }

   /**
   * Effect styles.
   * @return effectStyles
  **/
  @ApiModelProperty(value = "Effect styles.")
  public List<EffectFormat> getEffectStyles() {
    return effectStyles;
  }

  public void setEffectStyles(List<EffectFormat> effectStyles) {
    this.effectStyles = effectStyles;
  }

  public FormatScheme fillStyles(List<FillFormat> fillStyles) {
    this.fillStyles = fillStyles;
    return this;
  }

  public FormatScheme addFillStylesItem(FillFormat fillStylesItem) {
    if (this.fillStyles == null) {
      this.fillStyles = new ArrayList<FillFormat>();
    }
    this.fillStyles.add(fillStylesItem);
    return this;
  }

   /**
   * Fill styles.
   * @return fillStyles
  **/
  @ApiModelProperty(value = "Fill styles.")
  public List<FillFormat> getFillStyles() {
    return fillStyles;
  }

  public void setFillStyles(List<FillFormat> fillStyles) {
    this.fillStyles = fillStyles;
  }

  public FormatScheme lineStyles(List<LineFormat> lineStyles) {
    this.lineStyles = lineStyles;
    return this;
  }

  public FormatScheme addLineStylesItem(LineFormat lineStylesItem) {
    if (this.lineStyles == null) {
      this.lineStyles = new ArrayList<LineFormat>();
    }
    this.lineStyles.add(lineStylesItem);
    return this;
  }

   /**
   * Line style.
   * @return lineStyles
  **/
  @ApiModelProperty(value = "Line style.")
  public List<LineFormat> getLineStyles() {
    return lineStyles;
  }

  public void setLineStyles(List<LineFormat> lineStyles) {
    this.lineStyles = lineStyles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormatScheme formatScheme = (FormatScheme) o;
    return true && Objects.equals(this.backgroundStyles, formatScheme.backgroundStyles) && Objects.equals(this.effectStyles, formatScheme.effectStyles) && Objects.equals(this.fillStyles, formatScheme.fillStyles) && Objects.equals(this.lineStyles, formatScheme.lineStyles) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundStyles, effectStyles, fillStyles, lineStyles, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormatScheme {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    backgroundStyles: ").append(toIndentedString(backgroundStyles)).append("\n");
    sb.append("    effectStyles: ").append(toIndentedString(effectStyles)).append("\n");
    sb.append("    fillStyles: ").append(toIndentedString(fillStyles)).append("\n");
    sb.append("    lineStyles: ").append(toIndentedString(lineStyles)).append("\n");
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
