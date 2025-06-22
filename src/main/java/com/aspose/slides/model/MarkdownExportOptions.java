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
import com.aspose.slides.model.ExportOptions;
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
import java.util.List;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

/**
 * Provides options that control how a presentation is saved in Html5 format.
 */
@ApiModel(description = "Provides options that control how a presentation is saved in Html5 format.")
public class MarkdownExportOptions extends ExportOptions {
  /**
   * Specifies markdown specification to convert presentation. Default is TextOnly.
   */
  @JsonAdapter(ExportTypeEnum.Adapter.class)
  public enum ExportTypeEnum {
    SEQUENTIAL("Sequential"),
    
    TEXTONLY("TextOnly"),
    
    VISUAL("Visual");

    private String value;

    ExportTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExportTypeEnum fromValue(String text) {
      for (ExportTypeEnum b : ExportTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ExportTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExportTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExportTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ExportTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "exportType", alternate = { "ExportType" })
  private ExportTypeEnum exportType;

  /**
   * Specifies markdown specification to convert presentation. Default is MultiMarkdown.
   */
  @JsonAdapter(FlavorEnum.Adapter.class)
  public enum FlavorEnum {
    GITHUB("Github"),
    
    GRUBER("Gruber"),
    
    MULTIMARKDOWN("MultiMarkdown"),
    
    COMMONMARK("CommonMark"),
    
    MARKDOWNEXTRA("MarkdownExtra"),
    
    PANDOC("Pandoc"),
    
    KRAMDOWN("Kramdown"),
    
    MARKUA("Markua"),
    
    MARUKU("Maruku"),
    
    MARKDOWN2("Markdown2"),
    
    REMARKABLE("Remarkable"),
    
    SHOWDOWN("Showdown"),
    
    GHOST("Ghost"),
    
    GITLAB("GitLab"),
    
    HAROOPAD("Haroopad"),
    
    IAWRITER("IaWriter"),
    
    REDCARPET("Redcarpet"),
    
    SCHOLARLYMARKDOWN("ScholarlyMarkdown"),
    
    TAIGA("Taiga"),
    
    TRELLO("Trello"),
    
    S9ETEXTFORMATTER("S9ETextFormatter"),
    
    XWIKI("XWiki"),
    
    STACKOVERFLOW("StackOverflow"),
    
    DEFAULT("Default");

    private String value;

    FlavorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FlavorEnum fromValue(String text) {
      for (FlavorEnum b : FlavorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FlavorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FlavorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FlavorEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FlavorEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "flavor", alternate = { "Flavor" })
  private FlavorEnum flavor;

  /**
   * Specifies whether the generated document should have new lines of \\\\r(Macintosh), \\\\n(Unix) or \\\\r\\\\n(Windows). Default is Unix.
   */
  @JsonAdapter(NewLineTypeEnum.Adapter.class)
  public enum NewLineTypeEnum {
    WINDOWS("Windows"),
    
    UNIX("Unix"),
    
    MAC("Mac");

    private String value;

    NewLineTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NewLineTypeEnum fromValue(String text) {
      for (NewLineTypeEnum b : NewLineTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<NewLineTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NewLineTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NewLineTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return NewLineTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "newLineType", alternate = { "NewLineType" })
  private NewLineTypeEnum newLineType;

  @SerializedName(value = "imagesSaveFolderName", alternate = { "ImagesSaveFolderName" })
  private String imagesSaveFolderName;

  @SerializedName(value = "showSlideNumber", alternate = { "ShowSlideNumber" })
  private Boolean showSlideNumber;

  @SerializedName(value = "showComments", alternate = { "ShowComments" })
  private Boolean showComments;

  @SerializedName(value = "showHiddenSlides", alternate = { "ShowHiddenSlides" })
  private Boolean showHiddenSlides;

  @SerializedName(value = "removeEmptyLines", alternate = { "RemoveEmptyLines" })
  private Boolean removeEmptyLines;

  /**
   * Specifies how repeated space characters are preserved to maintain visual alignment. 
   */
  @JsonAdapter(HandleRepeatedSpacesEnum.Adapter.class)
  public enum HandleRepeatedSpacesEnum {
    NONE("None"),
    
    ALTERNATESPACESTONBSP("AlternateSpacesToNbsp"),
    
    MULTIPLESPACESTONBSP("MultipleSpacesToNbsp");

    private String value;

    HandleRepeatedSpacesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HandleRepeatedSpacesEnum fromValue(String text) {
      for (HandleRepeatedSpacesEnum b : HandleRepeatedSpacesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<HandleRepeatedSpacesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HandleRepeatedSpacesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HandleRepeatedSpacesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return HandleRepeatedSpacesEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "handleRepeatedSpaces", alternate = { "HandleRepeatedSpaces" })
  private HandleRepeatedSpacesEnum handleRepeatedSpaces;

  @SerializedName(value = "slideNumberFormat", alternate = { "SlideNumberFormat" })
  private String slideNumberFormat;


  public MarkdownExportOptions() {
    super();
    setFormat("MD");
  }

  public MarkdownExportOptions exportType(ExportTypeEnum exportType) {
    this.exportType = exportType;
    return this;
  }

   /**
   * Specifies markdown specification to convert presentation. Default is TextOnly.
   * @return exportType
  **/
  @ApiModelProperty(value = "Specifies markdown specification to convert presentation. Default is TextOnly.")
  public ExportTypeEnum getExportType() {
    return exportType;
  }

  public void setExportType(ExportTypeEnum exportType) {
    this.exportType = exportType;
  }

  public MarkdownExportOptions flavor(FlavorEnum flavor) {
    this.flavor = flavor;
    return this;
  }

   /**
   * Specifies markdown specification to convert presentation. Default is MultiMarkdown.
   * @return flavor
  **/
  @ApiModelProperty(value = "Specifies markdown specification to convert presentation. Default is MultiMarkdown.")
  public FlavorEnum getFlavor() {
    return flavor;
  }

  public void setFlavor(FlavorEnum flavor) {
    this.flavor = flavor;
  }

  public MarkdownExportOptions newLineType(NewLineTypeEnum newLineType) {
    this.newLineType = newLineType;
    return this;
  }

   /**
   * Specifies whether the generated document should have new lines of \\\\r(Macintosh), \\\\n(Unix) or \\\\r\\\\n(Windows). Default is Unix.
   * @return newLineType
  **/
  @ApiModelProperty(value = "Specifies whether the generated document should have new lines of \\\\r(Macintosh), \\\\n(Unix) or \\\\r\\\\n(Windows). Default is Unix.")
  public NewLineTypeEnum getNewLineType() {
    return newLineType;
  }

  public void setNewLineType(NewLineTypeEnum newLineType) {
    this.newLineType = newLineType;
  }

  public MarkdownExportOptions imagesSaveFolderName(String imagesSaveFolderName) {
    this.imagesSaveFolderName = imagesSaveFolderName;
    return this;
  }

   /**
   * Specifies folder name to save images. Default is Images. 
   * @return imagesSaveFolderName
  **/
  @ApiModelProperty(value = "Specifies folder name to save images. Default is Images. ")
  public String getImagesSaveFolderName() {
    return imagesSaveFolderName;
  }

  public void setImagesSaveFolderName(String imagesSaveFolderName) {
    this.imagesSaveFolderName = imagesSaveFolderName;
  }

  public MarkdownExportOptions showSlideNumber(Boolean showSlideNumber) {
    this.showSlideNumber = showSlideNumber;
    return this;
  }

   /**
   * Specifies whether the generated document should include slide number. Default is false. 
   * @return showSlideNumber
  **/
  @ApiModelProperty(value = "Specifies whether the generated document should include slide number. Default is false. ")
  public Boolean isShowSlideNumber() {
    return showSlideNumber;
  }

  public void setShowSlideNumber(Boolean showSlideNumber) {
    this.showSlideNumber = showSlideNumber;
  }

  public MarkdownExportOptions showComments(Boolean showComments) {
    this.showComments = showComments;
    return this;
  }

   /**
   * Specifies whether the generated document should include comments. Default is false. 
   * @return showComments
  **/
  @ApiModelProperty(value = "Specifies whether the generated document should include comments. Default is false. ")
  public Boolean isShowComments() {
    return showComments;
  }

  public void setShowComments(Boolean showComments) {
    this.showComments = showComments;
  }

  public MarkdownExportOptions showHiddenSlides(Boolean showHiddenSlides) {
    this.showHiddenSlides = showHiddenSlides;
    return this;
  }

   /**
   * Specifies whether the generated document should include hidden slides. Default is false. 
   * @return showHiddenSlides
  **/
  @ApiModelProperty(value = "Specifies whether the generated document should include hidden slides. Default is false. ")
  public Boolean isShowHiddenSlides() {
    return showHiddenSlides;
  }

  public void setShowHiddenSlides(Boolean showHiddenSlides) {
    this.showHiddenSlides = showHiddenSlides;
  }

  public MarkdownExportOptions removeEmptyLines(Boolean removeEmptyLines) {
    this.removeEmptyLines = removeEmptyLines;
    return this;
  }

   /**
   * true to remove empty or whitespace-only lines from the final Markdown output. Default is false. 
   * @return removeEmptyLines
  **/
  @ApiModelProperty(value = "true to remove empty or whitespace-only lines from the final Markdown output. Default is false. ")
  public Boolean isRemoveEmptyLines() {
    return removeEmptyLines;
  }

  public void setRemoveEmptyLines(Boolean removeEmptyLines) {
    this.removeEmptyLines = removeEmptyLines;
  }

  public MarkdownExportOptions handleRepeatedSpaces(HandleRepeatedSpacesEnum handleRepeatedSpaces) {
    this.handleRepeatedSpaces = handleRepeatedSpaces;
    return this;
  }

   /**
   * Specifies how repeated space characters are preserved to maintain visual alignment. 
   * @return handleRepeatedSpaces
  **/
  @ApiModelProperty(value = "Specifies how repeated space characters are preserved to maintain visual alignment. ")
  public HandleRepeatedSpacesEnum getHandleRepeatedSpaces() {
    return handleRepeatedSpaces;
  }

  public void setHandleRepeatedSpaces(HandleRepeatedSpacesEnum handleRepeatedSpaces) {
    this.handleRepeatedSpaces = handleRepeatedSpaces;
  }

  public MarkdownExportOptions slideNumberFormat(String slideNumberFormat) {
    this.slideNumberFormat = slideNumberFormat;
    return this;
  }

   /**
   * The format of slide number headers. 
   * @return slideNumberFormat
  **/
  @ApiModelProperty(value = "The format of slide number headers. ")
  public String getSlideNumberFormat() {
    return slideNumberFormat;
  }

  public void setSlideNumberFormat(String slideNumberFormat) {
    this.slideNumberFormat = slideNumberFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarkdownExportOptions markdownExportOptions = (MarkdownExportOptions) o;
    return true && Objects.equals(this.exportType, markdownExportOptions.exportType) && Objects.equals(this.flavor, markdownExportOptions.flavor) && Objects.equals(this.newLineType, markdownExportOptions.newLineType) && Objects.equals(this.imagesSaveFolderName, markdownExportOptions.imagesSaveFolderName) && Objects.equals(this.showSlideNumber, markdownExportOptions.showSlideNumber) && Objects.equals(this.showComments, markdownExportOptions.showComments) && Objects.equals(this.showHiddenSlides, markdownExportOptions.showHiddenSlides) && Objects.equals(this.removeEmptyLines, markdownExportOptions.removeEmptyLines) && Objects.equals(this.handleRepeatedSpaces, markdownExportOptions.handleRepeatedSpaces) && Objects.equals(this.slideNumberFormat, markdownExportOptions.slideNumberFormat) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportType, flavor, newLineType, imagesSaveFolderName, showSlideNumber, showComments, showHiddenSlides, removeEmptyLines, handleRepeatedSpaces, slideNumberFormat, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarkdownExportOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    exportType: ").append(toIndentedString(exportType)).append("\n");
    sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
    sb.append("    newLineType: ").append(toIndentedString(newLineType)).append("\n");
    sb.append("    imagesSaveFolderName: ").append(toIndentedString(imagesSaveFolderName)).append("\n");
    sb.append("    showSlideNumber: ").append(toIndentedString(showSlideNumber)).append("\n");
    sb.append("    showComments: ").append(toIndentedString(showComments)).append("\n");
    sb.append("    showHiddenSlides: ").append(toIndentedString(showHiddenSlides)).append("\n");
    sb.append("    removeEmptyLines: ").append(toIndentedString(removeEmptyLines)).append("\n");
    sb.append("    handleRepeatedSpaces: ").append(toIndentedString(handleRepeatedSpaces)).append("\n");
    sb.append("    slideNumberFormat: ").append(toIndentedString(slideNumberFormat)).append("\n");
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
