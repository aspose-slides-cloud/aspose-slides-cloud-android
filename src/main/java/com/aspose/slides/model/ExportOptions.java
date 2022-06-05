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
import com.aspose.slides.model.FontFallbackRule;
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
 * Represents export options for whole presentation.
 */
@ApiModel(description = "Represents export options for whole presentation.")
public class ExportOptions {
  @SerializedName(value = "defaultRegularFont", alternate = { "DefaultRegularFont" })
  private String defaultRegularFont;

  @SerializedName(value = "fontFallbackRules", alternate = { "FontFallbackRules" })
  private List<FontFallbackRule> fontFallbackRules = null;

  @SerializedName(value = "format", alternate = { "Format" })
  private String format;


  public ExportOptions() {
    super();
  }

  public ExportOptions defaultRegularFont(String defaultRegularFont) {
    this.defaultRegularFont = defaultRegularFont;
    return this;
  }

   /**
   * Default regular font for rendering the presentation. 
   * @return defaultRegularFont
  **/
  @ApiModelProperty(value = "Default regular font for rendering the presentation. ")
  public String getDefaultRegularFont() {
    return defaultRegularFont;
  }

  public void setDefaultRegularFont(String defaultRegularFont) {
    this.defaultRegularFont = defaultRegularFont;
  }

  public ExportOptions fontFallbackRules(List<FontFallbackRule> fontFallbackRules) {
    this.fontFallbackRules = fontFallbackRules;
    return this;
  }

  public ExportOptions addFontFallbackRulesItem(FontFallbackRule fontFallbackRulesItem) {
    if (this.fontFallbackRules == null) {
      this.fontFallbackRules = new ArrayList<FontFallbackRule>();
    }
    this.fontFallbackRules.add(fontFallbackRulesItem);
    return this;
  }

   /**
   * Gets of sets list of font fallback rules.
   * @return fontFallbackRules
  **/
  @ApiModelProperty(value = "Gets of sets list of font fallback rules.")
  public List<FontFallbackRule> getFontFallbackRules() {
    return fontFallbackRules;
  }

  public void setFontFallbackRules(List<FontFallbackRule> fontFallbackRules) {
    this.fontFallbackRules = fontFallbackRules;
  }

   /**
   * Get format
   * @return format
  **/
  @ApiModelProperty(value = "")
  public String getFormat() {
    return format;
  }

  protected void setFormat(String format) {
    this.format = format;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportOptions exportOptions = (ExportOptions) o;
    return true && Objects.equals(this.defaultRegularFont, exportOptions.defaultRegularFont) && Objects.equals(this.fontFallbackRules, exportOptions.fontFallbackRules) && Objects.equals(this.format, exportOptions.format);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultRegularFont, fontFallbackRules, format);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportOptions {\n");
    
    sb.append("    defaultRegularFont: ").append(toIndentedString(defaultRegularFont)).append("\n");
    sb.append("    fontFallbackRules: ").append(toIndentedString(fontFallbackRules)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
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
