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
 * Represents font substitution rule.
 */
@ApiModel(description = "Represents font substitution rule.")
public class FontSubstRule {
  @SerializedName(value = "sourceFont", alternate = { "SourceFont" })
  private String sourceFont;

  @SerializedName(value = "targetFont", alternate = { "TargetFont" })
  private String targetFont;

  @SerializedName(value = "notFoundOnly", alternate = { "NotFoundOnly" })
  private Boolean notFoundOnly;


  public FontSubstRule() {
    super();
  }

  public FontSubstRule sourceFont(String sourceFont) {
    this.sourceFont = sourceFont;
    return this;
  }

   /**
   * Font to substitute.
   * @return sourceFont
  **/
  @ApiModelProperty(value = "Font to substitute.")
  public String getSourceFont() {
    return sourceFont;
  }

  public void setSourceFont(String sourceFont) {
    this.sourceFont = sourceFont;
  }

  public FontSubstRule targetFont(String targetFont) {
    this.targetFont = targetFont;
    return this;
  }

   /**
   * Substitution font.
   * @return targetFont
  **/
  @ApiModelProperty(value = "Substitution font.")
  public String getTargetFont() {
    return targetFont;
  }

  public void setTargetFont(String targetFont) {
    this.targetFont = targetFont;
  }

  public FontSubstRule notFoundOnly(Boolean notFoundOnly) {
    this.notFoundOnly = notFoundOnly;
    return this;
  }

   /**
   * Substitute when font is not found. Default: true.
   * @return notFoundOnly
  **/
  @ApiModelProperty(value = "Substitute when font is not found. Default: true.")
  public Boolean isNotFoundOnly() {
    return notFoundOnly;
  }

  public void setNotFoundOnly(Boolean notFoundOnly) {
    this.notFoundOnly = notFoundOnly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FontSubstRule fontSubstRule = (FontSubstRule) o;
    return true && Objects.equals(this.sourceFont, fontSubstRule.sourceFont) && Objects.equals(this.targetFont, fontSubstRule.targetFont) && Objects.equals(this.notFoundOnly, fontSubstRule.notFoundOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceFont, targetFont, notFoundOnly);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FontSubstRule {\n");
    
    sb.append("    sourceFont: ").append(toIndentedString(sourceFont)).append("\n");
    sb.append("    targetFont: ").append(toIndentedString(targetFont)).append("\n");
    sb.append("    notFoundOnly: ").append(toIndentedString(notFoundOnly)).append("\n");
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
