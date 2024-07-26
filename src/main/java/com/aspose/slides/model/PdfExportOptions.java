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
import com.aspose.slides.model.AccessPermissions;
import com.aspose.slides.model.ExportOptions;
import com.aspose.slides.model.FontFallbackRule;
import com.aspose.slides.model.FontSubstRule;
import com.aspose.slides.model.SlidesLayoutOptions;
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
 * Provides options that control how a presentation is saved in Pdf format.
 */
@ApiModel(description = "Provides options that control how a presentation is saved in Pdf format.")
public class PdfExportOptions extends ExportOptions {
  /**
   * Specifies compression type to be used for all textual content in the document.
   */
  @JsonAdapter(TextCompressionEnum.Adapter.class)
  public enum TextCompressionEnum {
    NONE("None"),
    
    FLATE("Flate");

    private String value;

    TextCompressionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TextCompressionEnum fromValue(String text) {
      for (TextCompressionEnum b : TextCompressionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TextCompressionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TextCompressionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TextCompressionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TextCompressionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "textCompression", alternate = { "TextCompression" })
  private TextCompressionEnum textCompression;

  @SerializedName(value = "embedFullFonts", alternate = { "EmbedFullFonts" })
  private Boolean embedFullFonts;

  /**
   * Desired conformance level for generated PDF document.
   */
  @JsonAdapter(ComplianceEnum.Adapter.class)
  public enum ComplianceEnum {
    PDF15("Pdf15"),
    
    PDF16("Pdf16"),
    
    PDF17("Pdf17"),
    
    PDFA1B("PdfA1b"),
    
    PDFA1A("PdfA1a"),
    
    PDFA2B("PdfA2b"),
    
    PDFA2A("PdfA2a"),
    
    PDFA3B("PdfA3b"),
    
    PDFA3A("PdfA3a"),
    
    PDFUA("PdfUa"),
    
    PDFA2U("PdfA2u");

    private String value;

    ComplianceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ComplianceEnum fromValue(String text) {
      for (ComplianceEnum b : ComplianceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ComplianceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ComplianceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ComplianceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ComplianceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "compliance", alternate = { "Compliance" })
  private ComplianceEnum compliance;

  @SerializedName(value = "sufficientResolution", alternate = { "SufficientResolution" })
  private Double sufficientResolution;

  @SerializedName(value = "jpegQuality", alternate = { "JpegQuality" })
  private Integer jpegQuality;

  @SerializedName(value = "drawSlidesFrame", alternate = { "DrawSlidesFrame" })
  private Boolean drawSlidesFrame;

  @SerializedName(value = "showHiddenSlides", alternate = { "ShowHiddenSlides" })
  private Boolean showHiddenSlides;

  @SerializedName(value = "saveMetafilesAsPng", alternate = { "SaveMetafilesAsPng" })
  private Boolean saveMetafilesAsPng;

  @SerializedName(value = "password", alternate = { "Password" })
  private String password;

  @SerializedName(value = "embedTrueTypeFontsForASCII", alternate = { "EmbedTrueTypeFontsForASCII" })
  private Boolean embedTrueTypeFontsForASCII;

  @SerializedName(value = "additionalCommonFontFamilies", alternate = { "AdditionalCommonFontFamilies" })
  private List<String> additionalCommonFontFamilies = null;

  @SerializedName(value = "slidesLayoutOptions", alternate = { "SlidesLayoutOptions" })
  private SlidesLayoutOptions slidesLayoutOptions;

  @SerializedName(value = "imageTransparentColor", alternate = { "ImageTransparentColor" })
  private String imageTransparentColor;

  @SerializedName(value = "applyImageTransparent", alternate = { "ApplyImageTransparent" })
  private Boolean applyImageTransparent;

  @SerializedName(value = "accessPermissions", alternate = { "AccessPermissions" })
  private AccessPermissions accessPermissions;

  @SerializedName(value = "hideInk", alternate = { "HideInk" })
  private Boolean hideInk;

  @SerializedName(value = "interpretMaskOpAsOpacity", alternate = { "InterpretMaskOpAsOpacity" })
  private Boolean interpretMaskOpAsOpacity;

  @SerializedName(value = "rasterizeUnsupportedFontStyles", alternate = { "RasterizeUnsupportedFontStyles" })
  private Boolean rasterizeUnsupportedFontStyles;


  public PdfExportOptions() {
    super();
    setFormat("PDF");
  }

  public PdfExportOptions textCompression(TextCompressionEnum textCompression) {
    this.textCompression = textCompression;
    return this;
  }

   /**
   * Specifies compression type to be used for all textual content in the document.
   * @return textCompression
  **/
  @ApiModelProperty(value = "Specifies compression type to be used for all textual content in the document.")
  public TextCompressionEnum getTextCompression() {
    return textCompression;
  }

  public void setTextCompression(TextCompressionEnum textCompression) {
    this.textCompression = textCompression;
  }

  public PdfExportOptions embedFullFonts(Boolean embedFullFonts) {
    this.embedFullFonts = embedFullFonts;
    return this;
  }

   /**
   * Determines if all characters of font should be embedded or only used subset.
   * @return embedFullFonts
  **/
  @ApiModelProperty(value = "Determines if all characters of font should be embedded or only used subset.")
  public Boolean isEmbedFullFonts() {
    return embedFullFonts;
  }

  public void setEmbedFullFonts(Boolean embedFullFonts) {
    this.embedFullFonts = embedFullFonts;
  }

  public PdfExportOptions compliance(ComplianceEnum compliance) {
    this.compliance = compliance;
    return this;
  }

   /**
   * Desired conformance level for generated PDF document.
   * @return compliance
  **/
  @ApiModelProperty(value = "Desired conformance level for generated PDF document.")
  public ComplianceEnum getCompliance() {
    return compliance;
  }

  public void setCompliance(ComplianceEnum compliance) {
    this.compliance = compliance;
  }

  public PdfExportOptions sufficientResolution(Double sufficientResolution) {
    this.sufficientResolution = sufficientResolution;
    return this;
  }

   /**
   * Returns or sets a value determining resolution of images inside PDF document.  Property affects on file size, time of export and image quality. The default value is 96.
   * @return sufficientResolution
  **/
  @ApiModelProperty(value = "Returns or sets a value determining resolution of images inside PDF document.  Property affects on file size, time of export and image quality. The default value is 96.")
  public Double getSufficientResolution() {
    return sufficientResolution;
  }

  public void setSufficientResolution(Double sufficientResolution) {
    this.sufficientResolution = sufficientResolution;
  }

  public PdfExportOptions jpegQuality(Integer jpegQuality) {
    this.jpegQuality = jpegQuality;
    return this;
  }

   /**
   * Returns or sets a value determining the quality of the JPEG images inside PDF document.
   * @return jpegQuality
  **/
  @ApiModelProperty(value = "Returns or sets a value determining the quality of the JPEG images inside PDF document.")
  public Integer getJpegQuality() {
    return jpegQuality;
  }

  public void setJpegQuality(Integer jpegQuality) {
    this.jpegQuality = jpegQuality;
  }

  public PdfExportOptions drawSlidesFrame(Boolean drawSlidesFrame) {
    this.drawSlidesFrame = drawSlidesFrame;
    return this;
  }

   /**
   * True to draw black frame around each slide.
   * @return drawSlidesFrame
  **/
  @ApiModelProperty(value = "True to draw black frame around each slide.")
  public Boolean isDrawSlidesFrame() {
    return drawSlidesFrame;
  }

  public void setDrawSlidesFrame(Boolean drawSlidesFrame) {
    this.drawSlidesFrame = drawSlidesFrame;
  }

  public PdfExportOptions showHiddenSlides(Boolean showHiddenSlides) {
    this.showHiddenSlides = showHiddenSlides;
    return this;
  }

   /**
   * Specifies whether the generated document should include hidden slides or not. Default is false. 
   * @return showHiddenSlides
  **/
  @ApiModelProperty(value = "Specifies whether the generated document should include hidden slides or not. Default is false. ")
  public Boolean isShowHiddenSlides() {
    return showHiddenSlides;
  }

  public void setShowHiddenSlides(Boolean showHiddenSlides) {
    this.showHiddenSlides = showHiddenSlides;
  }

  public PdfExportOptions saveMetafilesAsPng(Boolean saveMetafilesAsPng) {
    this.saveMetafilesAsPng = saveMetafilesAsPng;
    return this;
  }

   /**
   * True to convert all metafiles used in a presentation to the PNG images.
   * @return saveMetafilesAsPng
  **/
  @ApiModelProperty(value = "True to convert all metafiles used in a presentation to the PNG images.")
  public Boolean isSaveMetafilesAsPng() {
    return saveMetafilesAsPng;
  }

  public void setSaveMetafilesAsPng(Boolean saveMetafilesAsPng) {
    this.saveMetafilesAsPng = saveMetafilesAsPng;
  }

  public PdfExportOptions password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Setting user password to protect the PDF document. 
   * @return password
  **/
  @ApiModelProperty(value = "Setting user password to protect the PDF document. ")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public PdfExportOptions embedTrueTypeFontsForASCII(Boolean embedTrueTypeFontsForASCII) {
    this.embedTrueTypeFontsForASCII = embedTrueTypeFontsForASCII;
    return this;
  }

   /**
   * Determines if Aspose.Slides will embed common fonts for ASCII (33..127 code range) text. Fonts for character codes greater than 127 are always embedded. Common fonts list includes PDF&#39;s base 14 fonts and additional user specified fonts.
   * @return embedTrueTypeFontsForASCII
  **/
  @ApiModelProperty(value = "Determines if Aspose.Slides will embed common fonts for ASCII (33..127 code range) text. Fonts for character codes greater than 127 are always embedded. Common fonts list includes PDF's base 14 fonts and additional user specified fonts.")
  public Boolean isEmbedTrueTypeFontsForASCII() {
    return embedTrueTypeFontsForASCII;
  }

  public void setEmbedTrueTypeFontsForASCII(Boolean embedTrueTypeFontsForASCII) {
    this.embedTrueTypeFontsForASCII = embedTrueTypeFontsForASCII;
  }

  public PdfExportOptions additionalCommonFontFamilies(List<String> additionalCommonFontFamilies) {
    this.additionalCommonFontFamilies = additionalCommonFontFamilies;
    return this;
  }

  public PdfExportOptions addAdditionalCommonFontFamiliesItem(String additionalCommonFontFamiliesItem) {
    if (this.additionalCommonFontFamilies == null) {
      this.additionalCommonFontFamilies = new ArrayList<String>();
    }
    this.additionalCommonFontFamilies.add(additionalCommonFontFamiliesItem);
    return this;
  }

   /**
   * Returns or sets an array of user-defined names of font families which Aspose.Slides should consider common.
   * @return additionalCommonFontFamilies
  **/
  @ApiModelProperty(value = "Returns or sets an array of user-defined names of font families which Aspose.Slides should consider common.")
  public List<String> getAdditionalCommonFontFamilies() {
    return additionalCommonFontFamilies;
  }

  public void setAdditionalCommonFontFamilies(List<String> additionalCommonFontFamilies) {
    this.additionalCommonFontFamilies = additionalCommonFontFamilies;
  }

  public PdfExportOptions slidesLayoutOptions(SlidesLayoutOptions slidesLayoutOptions) {
    this.slidesLayoutOptions = slidesLayoutOptions;
    return this;
  }

   /**
   * Slides layouting options
   * @return slidesLayoutOptions
  **/
  @ApiModelProperty(value = "Slides layouting options")
  public SlidesLayoutOptions getSlidesLayoutOptions() {
    return slidesLayoutOptions;
  }

  public void setSlidesLayoutOptions(SlidesLayoutOptions slidesLayoutOptions) {
    this.slidesLayoutOptions = slidesLayoutOptions;
  }

  public PdfExportOptions imageTransparentColor(String imageTransparentColor) {
    this.imageTransparentColor = imageTransparentColor;
    return this;
  }

   /**
   * Image transparent color.
   * @return imageTransparentColor
  **/
  @ApiModelProperty(value = "Image transparent color.")
  public String getImageTransparentColor() {
    return imageTransparentColor;
  }

  public void setImageTransparentColor(String imageTransparentColor) {
    this.imageTransparentColor = imageTransparentColor;
  }

  public PdfExportOptions applyImageTransparent(Boolean applyImageTransparent) {
    this.applyImageTransparent = applyImageTransparent;
    return this;
  }

   /**
   * True to apply specified ImageTransparentColor  to an image.
   * @return applyImageTransparent
  **/
  @ApiModelProperty(value = "True to apply specified ImageTransparentColor  to an image.")
  public Boolean isApplyImageTransparent() {
    return applyImageTransparent;
  }

  public void setApplyImageTransparent(Boolean applyImageTransparent) {
    this.applyImageTransparent = applyImageTransparent;
  }

  public PdfExportOptions accessPermissions(AccessPermissions accessPermissions) {
    this.accessPermissions = accessPermissions;
    return this;
  }

   /**
   * Access permissions that should be granted when the document is opened with user access.  Default is AccessPermissions.None.             
   * @return accessPermissions
  **/
  @ApiModelProperty(value = "Access permissions that should be granted when the document is opened with user access.  Default is AccessPermissions.None.             ")
  public AccessPermissions getAccessPermissions() {
    return accessPermissions;
  }

  public void setAccessPermissions(AccessPermissions accessPermissions) {
    this.accessPermissions = accessPermissions;
  }

  public PdfExportOptions hideInk(Boolean hideInk) {
    this.hideInk = hideInk;
    return this;
  }

   /**
   * True to hide Ink elements in exported document.
   * @return hideInk
  **/
  @ApiModelProperty(value = "True to hide Ink elements in exported document.")
  public Boolean isHideInk() {
    return hideInk;
  }

  public void setHideInk(Boolean hideInk) {
    this.hideInk = hideInk;
  }

  public PdfExportOptions interpretMaskOpAsOpacity(Boolean interpretMaskOpAsOpacity) {
    this.interpretMaskOpAsOpacity = interpretMaskOpAsOpacity;
    return this;
  }

   /**
   * True to use ROP operation or Opacity for rendering brush.
   * @return interpretMaskOpAsOpacity
  **/
  @ApiModelProperty(value = "True to use ROP operation or Opacity for rendering brush.")
  public Boolean isInterpretMaskOpAsOpacity() {
    return interpretMaskOpAsOpacity;
  }

  public void setInterpretMaskOpAsOpacity(Boolean interpretMaskOpAsOpacity) {
    this.interpretMaskOpAsOpacity = interpretMaskOpAsOpacity;
  }

  public PdfExportOptions rasterizeUnsupportedFontStyles(Boolean rasterizeUnsupportedFontStyles) {
    this.rasterizeUnsupportedFontStyles = rasterizeUnsupportedFontStyles;
    return this;
  }

   /**
   * True if text should be rasterized as a bitmap and saved to PDF when the font does not support bold styling. This approach can enhance the quality of text in the resulting PDF for certain fonts.
   * @return rasterizeUnsupportedFontStyles
  **/
  @ApiModelProperty(value = "True if text should be rasterized as a bitmap and saved to PDF when the font does not support bold styling. This approach can enhance the quality of text in the resulting PDF for certain fonts.")
  public Boolean isRasterizeUnsupportedFontStyles() {
    return rasterizeUnsupportedFontStyles;
  }

  public void setRasterizeUnsupportedFontStyles(Boolean rasterizeUnsupportedFontStyles) {
    this.rasterizeUnsupportedFontStyles = rasterizeUnsupportedFontStyles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfExportOptions pdfExportOptions = (PdfExportOptions) o;
    return true && Objects.equals(this.textCompression, pdfExportOptions.textCompression) && Objects.equals(this.embedFullFonts, pdfExportOptions.embedFullFonts) && Objects.equals(this.compliance, pdfExportOptions.compliance) && Objects.equals(this.sufficientResolution, pdfExportOptions.sufficientResolution) && Objects.equals(this.jpegQuality, pdfExportOptions.jpegQuality) && Objects.equals(this.drawSlidesFrame, pdfExportOptions.drawSlidesFrame) && Objects.equals(this.showHiddenSlides, pdfExportOptions.showHiddenSlides) && Objects.equals(this.saveMetafilesAsPng, pdfExportOptions.saveMetafilesAsPng) && Objects.equals(this.password, pdfExportOptions.password) && Objects.equals(this.embedTrueTypeFontsForASCII, pdfExportOptions.embedTrueTypeFontsForASCII) && Objects.equals(this.additionalCommonFontFamilies, pdfExportOptions.additionalCommonFontFamilies) && Objects.equals(this.slidesLayoutOptions, pdfExportOptions.slidesLayoutOptions) && Objects.equals(this.imageTransparentColor, pdfExportOptions.imageTransparentColor) && Objects.equals(this.applyImageTransparent, pdfExportOptions.applyImageTransparent) && Objects.equals(this.accessPermissions, pdfExportOptions.accessPermissions) && Objects.equals(this.hideInk, pdfExportOptions.hideInk) && Objects.equals(this.interpretMaskOpAsOpacity, pdfExportOptions.interpretMaskOpAsOpacity) && Objects.equals(this.rasterizeUnsupportedFontStyles, pdfExportOptions.rasterizeUnsupportedFontStyles) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textCompression, embedFullFonts, compliance, sufficientResolution, jpegQuality, drawSlidesFrame, showHiddenSlides, saveMetafilesAsPng, password, embedTrueTypeFontsForASCII, additionalCommonFontFamilies, slidesLayoutOptions, imageTransparentColor, applyImageTransparent, accessPermissions, hideInk, interpretMaskOpAsOpacity, rasterizeUnsupportedFontStyles, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfExportOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    textCompression: ").append(toIndentedString(textCompression)).append("\n");
    sb.append("    embedFullFonts: ").append(toIndentedString(embedFullFonts)).append("\n");
    sb.append("    compliance: ").append(toIndentedString(compliance)).append("\n");
    sb.append("    sufficientResolution: ").append(toIndentedString(sufficientResolution)).append("\n");
    sb.append("    jpegQuality: ").append(toIndentedString(jpegQuality)).append("\n");
    sb.append("    drawSlidesFrame: ").append(toIndentedString(drawSlidesFrame)).append("\n");
    sb.append("    showHiddenSlides: ").append(toIndentedString(showHiddenSlides)).append("\n");
    sb.append("    saveMetafilesAsPng: ").append(toIndentedString(saveMetafilesAsPng)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    embedTrueTypeFontsForASCII: ").append(toIndentedString(embedTrueTypeFontsForASCII)).append("\n");
    sb.append("    additionalCommonFontFamilies: ").append(toIndentedString(additionalCommonFontFamilies)).append("\n");
    sb.append("    slidesLayoutOptions: ").append(toIndentedString(slidesLayoutOptions)).append("\n");
    sb.append("    imageTransparentColor: ").append(toIndentedString(imageTransparentColor)).append("\n");
    sb.append("    applyImageTransparent: ").append(toIndentedString(applyImageTransparent)).append("\n");
    sb.append("    accessPermissions: ").append(toIndentedString(accessPermissions)).append("\n");
    sb.append("    hideInk: ").append(toIndentedString(hideInk)).append("\n");
    sb.append("    interpretMaskOpAsOpacity: ").append(toIndentedString(interpretMaskOpAsOpacity)).append("\n");
    sb.append("    rasterizeUnsupportedFontStyles: ").append(toIndentedString(rasterizeUnsupportedFontStyles)).append("\n");
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
