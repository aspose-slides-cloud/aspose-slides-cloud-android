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
import com.aspose.slides.model.FontSubstRule;
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

  @SerializedName(value = "deleteEmbeddedBinaryObjects", alternate = { "DeleteEmbeddedBinaryObjects" })
  private Boolean deleteEmbeddedBinaryObjects;

  /**
   * Default regular font for rendering the presentation. 
   */
  @JsonAdapter(GradientStyleEnum.Adapter.class)
  public enum GradientStyleEnum {
    DEFAULT("Default"),
    
    POWERPOINTUI("PowerPointUI");

    private String value;

    GradientStyleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GradientStyleEnum fromValue(String text) {
      for (GradientStyleEnum b : GradientStyleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<GradientStyleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GradientStyleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GradientStyleEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return GradientStyleEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "gradientStyle", alternate = { "GradientStyle" })
  private GradientStyleEnum gradientStyle;

  @SerializedName(value = "fontFallbackRules", alternate = { "FontFallbackRules" })
  private List<FontFallbackRule> fontFallbackRules = null;

  @SerializedName(value = "fontSubstRules", alternate = { "FontSubstRules" })
  private List<FontSubstRule> fontSubstRules = null;

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

  public ExportOptions deleteEmbeddedBinaryObjects(Boolean deleteEmbeddedBinaryObjects) {
    this.deleteEmbeddedBinaryObjects = deleteEmbeddedBinaryObjects;
    return this;
  }

   /**
   * True to delete delete all embedded binary objects.
   * @return deleteEmbeddedBinaryObjects
  **/
  @ApiModelProperty(value = "True to delete delete all embedded binary objects.")
  public Boolean isDeleteEmbeddedBinaryObjects() {
    return deleteEmbeddedBinaryObjects;
  }

  public void setDeleteEmbeddedBinaryObjects(Boolean deleteEmbeddedBinaryObjects) {
    this.deleteEmbeddedBinaryObjects = deleteEmbeddedBinaryObjects;
  }

  public ExportOptions gradientStyle(GradientStyleEnum gradientStyle) {
    this.gradientStyle = gradientStyle;
    return this;
  }

   /**
   * Default regular font for rendering the presentation. 
   * @return gradientStyle
  **/
  @ApiModelProperty(value = "Default regular font for rendering the presentation. ")
  public GradientStyleEnum getGradientStyle() {
    return gradientStyle;
  }

  public void setGradientStyle(GradientStyleEnum gradientStyle) {
    this.gradientStyle = gradientStyle;
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

  public ExportOptions fontSubstRules(List<FontSubstRule> fontSubstRules) {
    this.fontSubstRules = fontSubstRules;
    return this;
  }

  public ExportOptions addFontSubstRulesItem(FontSubstRule fontSubstRulesItem) {
    if (this.fontSubstRules == null) {
      this.fontSubstRules = new ArrayList<FontSubstRule>();
    }
    this.fontSubstRules.add(fontSubstRulesItem);
    return this;
  }

   /**
   * Gets of sets list of font substitution rules.
   * @return fontSubstRules
  **/
  @ApiModelProperty(value = "Gets of sets list of font substitution rules.")
  public List<FontSubstRule> getFontSubstRules() {
    return fontSubstRules;
  }

  public void setFontSubstRules(List<FontSubstRule> fontSubstRules) {
    this.fontSubstRules = fontSubstRules;
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
    return true && Objects.equals(this.defaultRegularFont, exportOptions.defaultRegularFont) && Objects.equals(this.deleteEmbeddedBinaryObjects, exportOptions.deleteEmbeddedBinaryObjects) && Objects.equals(this.gradientStyle, exportOptions.gradientStyle) && Objects.equals(this.fontFallbackRules, exportOptions.fontFallbackRules) && Objects.equals(this.fontSubstRules, exportOptions.fontSubstRules) && Objects.equals(this.format, exportOptions.format);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultRegularFont, deleteEmbeddedBinaryObjects, gradientStyle, fontFallbackRules, fontSubstRules, format);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportOptions {\n");
    
    sb.append("    defaultRegularFont: ").append(toIndentedString(defaultRegularFont)).append("\n");
    sb.append("    deleteEmbeddedBinaryObjects: ").append(toIndentedString(deleteEmbeddedBinaryObjects)).append("\n");
    sb.append("    gradientStyle: ").append(toIndentedString(gradientStyle)).append("\n");
    sb.append("    fontFallbackRules: ").append(toIndentedString(fontFallbackRules)).append("\n");
    sb.append("    fontSubstRules: ").append(toIndentedString(fontSubstRules)).append("\n");
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
