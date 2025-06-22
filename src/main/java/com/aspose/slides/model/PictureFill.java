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
import com.aspose.slides.model.FillFormat;
import com.aspose.slides.model.ImageTransformEffect;
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
 * Picture fill.
 */
@ApiModel(description = "Picture fill.")
public class PictureFill extends FillFormat {
  @SerializedName(value = "cropBottom", alternate = { "CropBottom" })
  private Double cropBottom;

  @SerializedName(value = "cropLeft", alternate = { "CropLeft" })
  private Double cropLeft;

  @SerializedName(value = "cropRight", alternate = { "CropRight" })
  private Double cropRight;

  @SerializedName(value = "cropTop", alternate = { "CropTop" })
  private Double cropTop;

  @SerializedName(value = "dpi", alternate = { "Dpi" })
  private Integer dpi;

  @SerializedName(value = "tileOffsetX", alternate = { "TileOffsetX" })
  private Double tileOffsetX;

  @SerializedName(value = "tileOffsetY", alternate = { "TileOffsetY" })
  private Double tileOffsetY;

  @SerializedName(value = "tileScaleX", alternate = { "TileScaleX" })
  private Double tileScaleX;

  @SerializedName(value = "tileScaleY", alternate = { "TileScaleY" })
  private Double tileScaleY;

  /**
   * The way texture is aligned within the shape. This setting controls the starting point of the texture pattern and how it repeats across the shape.
   */
  @JsonAdapter(TileAlignmentEnum.Adapter.class)
  public enum TileAlignmentEnum {
    TOPLEFT("TopLeft"),
    
    TOP("Top"),
    
    TOPRIGHT("TopRight"),
    
    LEFT("Left"),
    
    CENTER("Center"),
    
    RIGHT("Right"),
    
    BOTTOMLEFT("BottomLeft"),
    
    BOTTOM("Bottom"),
    
    BOTTOMRIGHT("BottomRight"),
    
    NOTDEFINED("NotDefined");

    private String value;

    TileAlignmentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TileAlignmentEnum fromValue(String text) {
      for (TileAlignmentEnum b : TileAlignmentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TileAlignmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TileAlignmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TileAlignmentEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TileAlignmentEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "tileAlignment", alternate = { "TileAlignment" })
  private TileAlignmentEnum tileAlignment;

  /**
   * Flips the texture tile around its horizontal, vertical or both axis.
   */
  @JsonAdapter(TileFlipEnum.Adapter.class)
  public enum TileFlipEnum {
    NOFLIP("NoFlip"),
    
    FLIPX("FlipX"),
    
    FLIPY("FlipY"),
    
    FLIPBOTH("FlipBoth"),
    
    NOTDEFINED("NotDefined");

    private String value;

    TileFlipEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TileFlipEnum fromValue(String text) {
      for (TileFlipEnum b : TileFlipEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TileFlipEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TileFlipEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TileFlipEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TileFlipEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "tileFlip", alternate = { "TileFlip" })
  private TileFlipEnum tileFlip;

  @SerializedName(value = "image", alternate = { "Image" })
  private ResourceUri image;

  @SerializedName(value = "base64Data", alternate = { "Base64Data" })
  private String base64Data;

  @SerializedName(value = "svgData", alternate = { "SvgData" })
  private String svgData;

  @SerializedName(value = "deletePictureCroppedAreas", alternate = { "DeletePictureCroppedAreas" })
  private Boolean deletePictureCroppedAreas;

  @SerializedName(value = "resolution", alternate = { "Resolution" })
  private Double resolution;

  /**
   * Fill mode.
   */
  @JsonAdapter(PictureFillModeEnum.Adapter.class)
  public enum PictureFillModeEnum {
    TILE("Tile"),
    
    STRETCH("Stretch");

    private String value;

    PictureFillModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PictureFillModeEnum fromValue(String text) {
      for (PictureFillModeEnum b : PictureFillModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PictureFillModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PictureFillModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PictureFillModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PictureFillModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "pictureFillMode", alternate = { "PictureFillMode" })
  private PictureFillModeEnum pictureFillMode;

  @SerializedName(value = "imageTransformList", alternate = { "ImageTransformList" })
  private List<ImageTransformEffect> imageTransformList = null;


  public PictureFill() {
    super();
    setType(TypeEnum.PICTURE);
  }

  public PictureFill cropBottom(Double cropBottom) {
    this.cropBottom = cropBottom;
    return this;
  }

   /**
   * Percentage of image height that is cropped from the bottom.
   * @return cropBottom
  **/
  @ApiModelProperty(required = true, value = "Percentage of image height that is cropped from the bottom.")
  public Double getCropBottom() {
    return cropBottom;
  }

  public void setCropBottom(Double cropBottom) {
    this.cropBottom = cropBottom;
  }

  public PictureFill cropLeft(Double cropLeft) {
    this.cropLeft = cropLeft;
    return this;
  }

   /**
   * Percentage of image height that is cropped from the left.
   * @return cropLeft
  **/
  @ApiModelProperty(required = true, value = "Percentage of image height that is cropped from the left.")
  public Double getCropLeft() {
    return cropLeft;
  }

  public void setCropLeft(Double cropLeft) {
    this.cropLeft = cropLeft;
  }

  public PictureFill cropRight(Double cropRight) {
    this.cropRight = cropRight;
    return this;
  }

   /**
   * Percentage of image height that is cropped from the right.
   * @return cropRight
  **/
  @ApiModelProperty(required = true, value = "Percentage of image height that is cropped from the right.")
  public Double getCropRight() {
    return cropRight;
  }

  public void setCropRight(Double cropRight) {
    this.cropRight = cropRight;
  }

  public PictureFill cropTop(Double cropTop) {
    this.cropTop = cropTop;
    return this;
  }

   /**
   * Percentage of image height that is cropped from the top.
   * @return cropTop
  **/
  @ApiModelProperty(required = true, value = "Percentage of image height that is cropped from the top.")
  public Double getCropTop() {
    return cropTop;
  }

  public void setCropTop(Double cropTop) {
    this.cropTop = cropTop;
  }

  public PictureFill dpi(Integer dpi) {
    this.dpi = dpi;
    return this;
  }

   /**
   * Picture resolution.
   * @return dpi
  **/
  @ApiModelProperty(required = true, value = "Picture resolution.")
  public Integer getDpi() {
    return dpi;
  }

  public void setDpi(Integer dpi) {
    this.dpi = dpi;
  }

  public PictureFill tileOffsetX(Double tileOffsetX) {
    this.tileOffsetX = tileOffsetX;
    return this;
  }

   /**
   * The horizontal offset of the texture from the shape&#39;s origin in points. A positive value moves the texture to the right, while a negative value moves it to the left.
   * @return tileOffsetX
  **/
  @ApiModelProperty(value = "The horizontal offset of the texture from the shape's origin in points. A positive value moves the texture to the right, while a negative value moves it to the left.")
  public Double getTileOffsetX() {
    return tileOffsetX;
  }

  public void setTileOffsetX(Double tileOffsetX) {
    this.tileOffsetX = tileOffsetX;
  }

  public PictureFill tileOffsetY(Double tileOffsetY) {
    this.tileOffsetY = tileOffsetY;
    return this;
  }

   /**
   * The vertical offset of the texture from the shape&#39;s origin in points. A positive value moves the texture down, while a negative value moves it up.
   * @return tileOffsetY
  **/
  @ApiModelProperty(value = "The vertical offset of the texture from the shape's origin in points. A positive value moves the texture down, while a negative value moves it up.")
  public Double getTileOffsetY() {
    return tileOffsetY;
  }

  public void setTileOffsetY(Double tileOffsetY) {
    this.tileOffsetY = tileOffsetY;
  }

  public PictureFill tileScaleX(Double tileScaleX) {
    this.tileScaleX = tileScaleX;
    return this;
  }

   /**
   * The horizontal scale for the texture fill as a percentage.
   * @return tileScaleX
  **/
  @ApiModelProperty(value = "The horizontal scale for the texture fill as a percentage.")
  public Double getTileScaleX() {
    return tileScaleX;
  }

  public void setTileScaleX(Double tileScaleX) {
    this.tileScaleX = tileScaleX;
  }

  public PictureFill tileScaleY(Double tileScaleY) {
    this.tileScaleY = tileScaleY;
    return this;
  }

   /**
   * The vertical scale for the texture fill as a percentage.
   * @return tileScaleY
  **/
  @ApiModelProperty(value = "The vertical scale for the texture fill as a percentage.")
  public Double getTileScaleY() {
    return tileScaleY;
  }

  public void setTileScaleY(Double tileScaleY) {
    this.tileScaleY = tileScaleY;
  }

  public PictureFill tileAlignment(TileAlignmentEnum tileAlignment) {
    this.tileAlignment = tileAlignment;
    return this;
  }

   /**
   * The way texture is aligned within the shape. This setting controls the starting point of the texture pattern and how it repeats across the shape.
   * @return tileAlignment
  **/
  @ApiModelProperty(value = "The way texture is aligned within the shape. This setting controls the starting point of the texture pattern and how it repeats across the shape.")
  public TileAlignmentEnum getTileAlignment() {
    return tileAlignment;
  }

  public void setTileAlignment(TileAlignmentEnum tileAlignment) {
    this.tileAlignment = tileAlignment;
  }

  public PictureFill tileFlip(TileFlipEnum tileFlip) {
    this.tileFlip = tileFlip;
    return this;
  }

   /**
   * Flips the texture tile around its horizontal, vertical or both axis.
   * @return tileFlip
  **/
  @ApiModelProperty(value = "Flips the texture tile around its horizontal, vertical or both axis.")
  public TileFlipEnum getTileFlip() {
    return tileFlip;
  }

  public void setTileFlip(TileFlipEnum tileFlip) {
    this.tileFlip = tileFlip;
  }

  public PictureFill image(ResourceUri image) {
    this.image = image;
    return this;
  }

   /**
   * Internal image link.
   * @return image
  **/
  @ApiModelProperty(value = "Internal image link.")
  public ResourceUri getImage() {
    return image;
  }

  public void setImage(ResourceUri image) {
    this.image = image;
  }

  public PictureFill base64Data(String base64Data) {
    this.base64Data = base64Data;
    return this;
  }

   /**
   * Base 64 image data.
   * @return base64Data
  **/
  @ApiModelProperty(value = "Base 64 image data.")
  public String getBase64Data() {
    return base64Data;
  }

  public void setBase64Data(String base64Data) {
    this.base64Data = base64Data;
  }

  public PictureFill svgData(String svgData) {
    this.svgData = svgData;
    return this;
  }

   /**
   * SVG image data.
   * @return svgData
  **/
  @ApiModelProperty(value = "SVG image data.")
  public String getSvgData() {
    return svgData;
  }

  public void setSvgData(String svgData) {
    this.svgData = svgData;
  }

  public PictureFill deletePictureCroppedAreas(Boolean deletePictureCroppedAreas) {
    this.deletePictureCroppedAreas = deletePictureCroppedAreas;
    return this;
  }

   /**
   * true to delete picture cropped areas on save.
   * @return deletePictureCroppedAreas
  **/
  @ApiModelProperty(value = "true to delete picture cropped areas on save.")
  public Boolean isDeletePictureCroppedAreas() {
    return deletePictureCroppedAreas;
  }

  public void setDeletePictureCroppedAreas(Boolean deletePictureCroppedAreas) {
    this.deletePictureCroppedAreas = deletePictureCroppedAreas;
  }

  public PictureFill resolution(Double resolution) {
    this.resolution = resolution;
    return this;
  }

   /**
   * true to compress the picture image with the specified resolution (in dpi) on save.
   * @return resolution
  **/
  @ApiModelProperty(value = "true to compress the picture image with the specified resolution (in dpi) on save.")
  public Double getResolution() {
    return resolution;
  }

  public void setResolution(Double resolution) {
    this.resolution = resolution;
  }

  public PictureFill pictureFillMode(PictureFillModeEnum pictureFillMode) {
    this.pictureFillMode = pictureFillMode;
    return this;
  }

   /**
   * Fill mode.
   * @return pictureFillMode
  **/
  @ApiModelProperty(required = true, value = "Fill mode.")
  public PictureFillModeEnum getPictureFillMode() {
    return pictureFillMode;
  }

  public void setPictureFillMode(PictureFillModeEnum pictureFillMode) {
    this.pictureFillMode = pictureFillMode;
  }

  public PictureFill imageTransformList(List<ImageTransformEffect> imageTransformList) {
    this.imageTransformList = imageTransformList;
    return this;
  }

  public PictureFill addImageTransformListItem(ImageTransformEffect imageTransformListItem) {
    if (this.imageTransformList == null) {
      this.imageTransformList = new ArrayList<ImageTransformEffect>();
    }
    this.imageTransformList.add(imageTransformListItem);
    return this;
  }

   /**
   * Image transform effects.
   * @return imageTransformList
  **/
  @ApiModelProperty(value = "Image transform effects.")
  public List<ImageTransformEffect> getImageTransformList() {
    return imageTransformList;
  }

  public void setImageTransformList(List<ImageTransformEffect> imageTransformList) {
    this.imageTransformList = imageTransformList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PictureFill pictureFill = (PictureFill) o;
    return true && Objects.equals(this.cropBottom, pictureFill.cropBottom) && Objects.equals(this.cropLeft, pictureFill.cropLeft) && Objects.equals(this.cropRight, pictureFill.cropRight) && Objects.equals(this.cropTop, pictureFill.cropTop) && Objects.equals(this.dpi, pictureFill.dpi) && Objects.equals(this.tileOffsetX, pictureFill.tileOffsetX) && Objects.equals(this.tileOffsetY, pictureFill.tileOffsetY) && Objects.equals(this.tileScaleX, pictureFill.tileScaleX) && Objects.equals(this.tileScaleY, pictureFill.tileScaleY) && Objects.equals(this.tileAlignment, pictureFill.tileAlignment) && Objects.equals(this.tileFlip, pictureFill.tileFlip) && Objects.equals(this.image, pictureFill.image) && Objects.equals(this.base64Data, pictureFill.base64Data) && Objects.equals(this.svgData, pictureFill.svgData) && Objects.equals(this.deletePictureCroppedAreas, pictureFill.deletePictureCroppedAreas) && Objects.equals(this.resolution, pictureFill.resolution) && Objects.equals(this.pictureFillMode, pictureFill.pictureFillMode) && Objects.equals(this.imageTransformList, pictureFill.imageTransformList) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cropBottom, cropLeft, cropRight, cropTop, dpi, tileOffsetX, tileOffsetY, tileScaleX, tileScaleY, tileAlignment, tileFlip, image, base64Data, svgData, deletePictureCroppedAreas, resolution, pictureFillMode, imageTransformList, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PictureFill {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    cropBottom: ").append(toIndentedString(cropBottom)).append("\n");
    sb.append("    cropLeft: ").append(toIndentedString(cropLeft)).append("\n");
    sb.append("    cropRight: ").append(toIndentedString(cropRight)).append("\n");
    sb.append("    cropTop: ").append(toIndentedString(cropTop)).append("\n");
    sb.append("    dpi: ").append(toIndentedString(dpi)).append("\n");
    sb.append("    tileOffsetX: ").append(toIndentedString(tileOffsetX)).append("\n");
    sb.append("    tileOffsetY: ").append(toIndentedString(tileOffsetY)).append("\n");
    sb.append("    tileScaleX: ").append(toIndentedString(tileScaleX)).append("\n");
    sb.append("    tileScaleY: ").append(toIndentedString(tileScaleY)).append("\n");
    sb.append("    tileAlignment: ").append(toIndentedString(tileAlignment)).append("\n");
    sb.append("    tileFlip: ").append(toIndentedString(tileFlip)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    base64Data: ").append(toIndentedString(base64Data)).append("\n");
    sb.append("    svgData: ").append(toIndentedString(svgData)).append("\n");
    sb.append("    deletePictureCroppedAreas: ").append(toIndentedString(deletePictureCroppedAreas)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    pictureFillMode: ").append(toIndentedString(pictureFillMode)).append("\n");
    sb.append("    imageTransformList: ").append(toIndentedString(imageTransformList)).append("\n");
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
      typeDeterminers.put("Type", TypeEnum.PICTURE);
  }
}
