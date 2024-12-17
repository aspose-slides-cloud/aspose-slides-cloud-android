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
 * Drawing guide.
 */
@ApiModel(description = "Drawing guide.")
public class DrawingGuide {
  /**
   * Last used view mode.
   */
  @JsonAdapter(OrientationEnum.Adapter.class)
  public enum OrientationEnum {
    HORIZONTAL("Horizontal"),
    
    VERTICAL("Vertical");

    private String value;

    OrientationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OrientationEnum fromValue(String text) {
      for (OrientationEnum b : OrientationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OrientationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OrientationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OrientationEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OrientationEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "orientation", alternate = { "Orientation" })
  private OrientationEnum orientation;

  @SerializedName(value = "position", alternate = { "Position" })
  private Double position;


  public DrawingGuide() {
    super();
  }

  public DrawingGuide orientation(OrientationEnum orientation) {
    this.orientation = orientation;
    return this;
  }

   /**
   * Last used view mode.
   * @return orientation
  **/
  @ApiModelProperty(required = true, value = "Last used view mode.")
  public OrientationEnum getOrientation() {
    return orientation;
  }

  public void setOrientation(OrientationEnum orientation) {
    this.orientation = orientation;
  }

  public DrawingGuide position(Double position) {
    this.position = position;
    return this;
  }

   /**
   * Horizontal bar state.
   * @return position
  **/
  @ApiModelProperty(required = true, value = "Horizontal bar state.")
  public Double getPosition() {
    return position;
  }

  public void setPosition(Double position) {
    this.position = position;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DrawingGuide drawingGuide = (DrawingGuide) o;
    return true && Objects.equals(this.orientation, drawingGuide.orientation) && Objects.equals(this.position, drawingGuide.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orientation, position);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrawingGuide {\n");
    
    sb.append("    orientation: ").append(toIndentedString(orientation)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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
