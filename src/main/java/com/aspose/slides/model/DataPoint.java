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
import com.aspose.slides.model.SeriesMarker;
import com.aspose.slides.model.ThreeDFormat;
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
 * Data point.
 */
@ApiModel(description = "Data point.")
public class DataPoint {
  @SerializedName(value = "fillFormat", alternate = { "FillFormat" })
  private FillFormat fillFormat;

  @SerializedName(value = "effectFormat", alternate = { "EffectFormat" })
  private EffectFormat effectFormat;

  @SerializedName(value = "threeDFormat", alternate = { "ThreeDFormat" })
  private ThreeDFormat threeDFormat;

  @SerializedName(value = "lineFormat", alternate = { "LineFormat" })
  private LineFormat lineFormat;

  @SerializedName(value = "marker", alternate = { "Marker" })
  private SeriesMarker marker;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ONEVALUE("OneValue"),
    
    SCATTER("Scatter"),
    
    BUBBLE("Bubble");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "type", alternate = { "Type" })
  private TypeEnum type;


  public DataPoint() {
    super();
  }

  public DataPoint fillFormat(FillFormat fillFormat) {
    this.fillFormat = fillFormat;
    return this;
  }

   /**
   * Gets or sets the fill format.
   * @return fillFormat
  **/
  @ApiModelProperty(value = "Gets or sets the fill format.")
  public FillFormat getFillFormat() {
    return fillFormat;
  }

  public void setFillFormat(FillFormat fillFormat) {
    this.fillFormat = fillFormat;
  }

  public DataPoint effectFormat(EffectFormat effectFormat) {
    this.effectFormat = effectFormat;
    return this;
  }

   /**
   * Gets or sets the effect format.
   * @return effectFormat
  **/
  @ApiModelProperty(value = "Gets or sets the effect format.")
  public EffectFormat getEffectFormat() {
    return effectFormat;
  }

  public void setEffectFormat(EffectFormat effectFormat) {
    this.effectFormat = effectFormat;
  }

  public DataPoint threeDFormat(ThreeDFormat threeDFormat) {
    this.threeDFormat = threeDFormat;
    return this;
  }

   /**
   * Gets or sets the 3D format
   * @return threeDFormat
  **/
  @ApiModelProperty(value = "Gets or sets the 3D format")
  public ThreeDFormat getThreeDFormat() {
    return threeDFormat;
  }

  public void setThreeDFormat(ThreeDFormat threeDFormat) {
    this.threeDFormat = threeDFormat;
  }

  public DataPoint lineFormat(LineFormat lineFormat) {
    this.lineFormat = lineFormat;
    return this;
  }

   /**
   * Gets or sets the line format.
   * @return lineFormat
  **/
  @ApiModelProperty(value = "Gets or sets the line format.")
  public LineFormat getLineFormat() {
    return lineFormat;
  }

  public void setLineFormat(LineFormat lineFormat) {
    this.lineFormat = lineFormat;
  }

  public DataPoint marker(SeriesMarker marker) {
    this.marker = marker;
    return this;
  }

   /**
   * Gets or sets the marker.
   * @return marker
  **/
  @ApiModelProperty(value = "Gets or sets the marker.")
  public SeriesMarker getMarker() {
    return marker;
  }

  public void setMarker(SeriesMarker marker) {
    this.marker = marker;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }

  protected void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataPoint dataPoint = (DataPoint) o;
    return true && Objects.equals(this.fillFormat, dataPoint.fillFormat) && Objects.equals(this.effectFormat, dataPoint.effectFormat) && Objects.equals(this.threeDFormat, dataPoint.threeDFormat) && Objects.equals(this.lineFormat, dataPoint.lineFormat) && Objects.equals(this.marker, dataPoint.marker) && Objects.equals(this.type, dataPoint.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fillFormat, effectFormat, threeDFormat, lineFormat, marker, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataPoint {\n");
    
    sb.append("    fillFormat: ").append(toIndentedString(fillFormat)).append("\n");
    sb.append("    effectFormat: ").append(toIndentedString(effectFormat)).append("\n");
    sb.append("    threeDFormat: ").append(toIndentedString(threeDFormat)).append("\n");
    sb.append("    lineFormat: ").append(toIndentedString(lineFormat)).append("\n");
    sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
