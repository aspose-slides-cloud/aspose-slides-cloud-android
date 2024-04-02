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
import com.aspose.slides.model.ImageExportOptionsBase;
import com.aspose.slides.model.SlidesLayoutOptions;
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
 * Provides options that control how a presentation is saved in TIFF format.
 */
@ApiModel(description = "Provides options that control how a presentation is saved in TIFF format.")
public class TiffExportOptions extends ImageExportOptionsBase {
  /**
   * Compression type.
   */
  @JsonAdapter(CompressionEnum.Adapter.class)
  public enum CompressionEnum {
    DEFAULT("Default"),
    
    NONE("None"),
    
    CCITT3("CCITT3"),
    
    CCITT4("CCITT4"),
    
    LZW("LZW"),
    
    RLE("RLE");

    private String value;

    CompressionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CompressionEnum fromValue(String text) {
      for (CompressionEnum b : CompressionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CompressionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CompressionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CompressionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CompressionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "compression", alternate = { "Compression" })
  private CompressionEnum compression;

  @SerializedName(value = "dpiX", alternate = { "DpiX" })
  private Integer dpiX;

  @SerializedName(value = "dpiY", alternate = { "DpiY" })
  private Integer dpiY;

  @SerializedName(value = "showHiddenSlides", alternate = { "ShowHiddenSlides" })
  private Boolean showHiddenSlides;

  /**
   * Specifies the pixel format for the generated images. Read/write ImagePixelFormat.
   */
  @JsonAdapter(PixelFormatEnum.Adapter.class)
  public enum PixelFormatEnum {
    FORMAT1BPPINDEXED("Format1bppIndexed"),
    
    FORMAT4BPPINDEXED("Format4bppIndexed"),
    
    FORMAT8BPPINDEXED("Format8bppIndexed"),
    
    FORMAT24BPPRGB("Format24bppRgb"),
    
    FORMAT32BPPARGB("Format32bppArgb");

    private String value;

    PixelFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PixelFormatEnum fromValue(String text) {
      for (PixelFormatEnum b : PixelFormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PixelFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PixelFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PixelFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PixelFormatEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "pixelFormat", alternate = { "PixelFormat" })
  private PixelFormatEnum pixelFormat;

  @SerializedName(value = "slidesLayoutOptions", alternate = { "SlidesLayoutOptions" })
  private SlidesLayoutOptions slidesLayoutOptions;

  /**
   * Specifies the algorithm for converting a color image into a black and white image. This option will applied only if Aspose.Slides.Export.TiffOptions.CompressionType is set to Aspose.Slides.Export.TiffCompressionTypes.CCITT4 or Aspose.Slides.Export.TiffCompressionTypes.CCITT3.
   */
  @JsonAdapter(BwConversionModeEnum.Adapter.class)
  public enum BwConversionModeEnum {
    DEFAULT("Default"),
    
    DITHERING("Dithering"),
    
    DITHERINGFLOYDSTEINBERG("DitheringFloydSteinberg"),
    
    AUTO("Auto"),
    
    AUTOOTSU("AutoOtsu"),
    
    THRESHOLD25("Threshold25"),
    
    THRESHOLD50("Threshold50"),
    
    THRESHOLD75("Threshold75");

    private String value;

    BwConversionModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BwConversionModeEnum fromValue(String text) {
      for (BwConversionModeEnum b : BwConversionModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BwConversionModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BwConversionModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BwConversionModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BwConversionModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "bwConversionMode", alternate = { "BwConversionMode" })
  private BwConversionModeEnum bwConversionMode;


  public TiffExportOptions() {
    super();
    setFormat("TIFF");
  }

  public TiffExportOptions compression(CompressionEnum compression) {
    this.compression = compression;
    return this;
  }

   /**
   * Compression type.
   * @return compression
  **/
  @ApiModelProperty(value = "Compression type.")
  public CompressionEnum getCompression() {
    return compression;
  }

  public void setCompression(CompressionEnum compression) {
    this.compression = compression;
  }

  public TiffExportOptions dpiX(Integer dpiX) {
    this.dpiX = dpiX;
    return this;
  }

   /**
   * Horizontal resolution, in dots per inch.
   * @return dpiX
  **/
  @ApiModelProperty(value = "Horizontal resolution, in dots per inch.")
  public Integer getDpiX() {
    return dpiX;
  }

  public void setDpiX(Integer dpiX) {
    this.dpiX = dpiX;
  }

  public TiffExportOptions dpiY(Integer dpiY) {
    this.dpiY = dpiY;
    return this;
  }

   /**
   * Vertical resolution, in dots per inch.
   * @return dpiY
  **/
  @ApiModelProperty(value = "Vertical resolution, in dots per inch.")
  public Integer getDpiY() {
    return dpiY;
  }

  public void setDpiY(Integer dpiY) {
    this.dpiY = dpiY;
  }

  public TiffExportOptions showHiddenSlides(Boolean showHiddenSlides) {
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

  public TiffExportOptions pixelFormat(PixelFormatEnum pixelFormat) {
    this.pixelFormat = pixelFormat;
    return this;
  }

   /**
   * Specifies the pixel format for the generated images. Read/write ImagePixelFormat.
   * @return pixelFormat
  **/
  @ApiModelProperty(value = "Specifies the pixel format for the generated images. Read/write ImagePixelFormat.")
  public PixelFormatEnum getPixelFormat() {
    return pixelFormat;
  }

  public void setPixelFormat(PixelFormatEnum pixelFormat) {
    this.pixelFormat = pixelFormat;
  }

  public TiffExportOptions slidesLayoutOptions(SlidesLayoutOptions slidesLayoutOptions) {
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

  public TiffExportOptions bwConversionMode(BwConversionModeEnum bwConversionMode) {
    this.bwConversionMode = bwConversionMode;
    return this;
  }

   /**
   * Specifies the algorithm for converting a color image into a black and white image. This option will applied only if Aspose.Slides.Export.TiffOptions.CompressionType is set to Aspose.Slides.Export.TiffCompressionTypes.CCITT4 or Aspose.Slides.Export.TiffCompressionTypes.CCITT3.
   * @return bwConversionMode
  **/
  @ApiModelProperty(value = "Specifies the algorithm for converting a color image into a black and white image. This option will applied only if Aspose.Slides.Export.TiffOptions.CompressionType is set to Aspose.Slides.Export.TiffCompressionTypes.CCITT4 or Aspose.Slides.Export.TiffCompressionTypes.CCITT3.")
  public BwConversionModeEnum getBwConversionMode() {
    return bwConversionMode;
  }

  public void setBwConversionMode(BwConversionModeEnum bwConversionMode) {
    this.bwConversionMode = bwConversionMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TiffExportOptions tiffExportOptions = (TiffExportOptions) o;
    return true && Objects.equals(this.compression, tiffExportOptions.compression) && Objects.equals(this.dpiX, tiffExportOptions.dpiX) && Objects.equals(this.dpiY, tiffExportOptions.dpiY) && Objects.equals(this.showHiddenSlides, tiffExportOptions.showHiddenSlides) && Objects.equals(this.pixelFormat, tiffExportOptions.pixelFormat) && Objects.equals(this.slidesLayoutOptions, tiffExportOptions.slidesLayoutOptions) && Objects.equals(this.bwConversionMode, tiffExportOptions.bwConversionMode) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compression, dpiX, dpiY, showHiddenSlides, pixelFormat, slidesLayoutOptions, bwConversionMode, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TiffExportOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    compression: ").append(toIndentedString(compression)).append("\n");
    sb.append("    dpiX: ").append(toIndentedString(dpiX)).append("\n");
    sb.append("    dpiY: ").append(toIndentedString(dpiY)).append("\n");
    sb.append("    showHiddenSlides: ").append(toIndentedString(showHiddenSlides)).append("\n");
    sb.append("    pixelFormat: ").append(toIndentedString(pixelFormat)).append("\n");
    sb.append("    slidesLayoutOptions: ").append(toIndentedString(slidesLayoutOptions)).append("\n");
    sb.append("    bwConversionMode: ").append(toIndentedString(bwConversionMode)).append("\n");
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
