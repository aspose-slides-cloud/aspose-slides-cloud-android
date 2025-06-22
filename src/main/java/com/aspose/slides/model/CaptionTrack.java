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
import java.util.List;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

/**
 * Represents list of Links to Paragraphs resources
 */
@ApiModel(description = "Represents list of Links to Paragraphs resources")
public class CaptionTrack extends ResourceBase {
  @SerializedName(value = "captionId", alternate = { "CaptionId" })
  private String captionId;

  @SerializedName(value = "label", alternate = { "Label" })
  private String label;

  @SerializedName(value = "dataAsString", alternate = { "DataAsString" })
  private String dataAsString;


  public CaptionTrack() {
    super();
  }

  public CaptionTrack captionId(String captionId) {
    this.captionId = captionId;
    return this;
  }

   /**
   * Caption ID.
   * @return captionId
  **/
  @ApiModelProperty(required = true, value = "Caption ID.")
  public String getCaptionId() {
    return captionId;
  }

  public void setCaptionId(String captionId) {
    this.captionId = captionId;
  }

  public CaptionTrack label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Label.
   * @return label
  **/
  @ApiModelProperty(value = "Label.")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public CaptionTrack dataAsString(String dataAsString) {
    this.dataAsString = dataAsString;
    return this;
  }

   /**
   * Caption track data as string.
   * @return dataAsString
  **/
  @ApiModelProperty(value = "Caption track data as string.")
  public String getDataAsString() {
    return dataAsString;
  }

  public void setDataAsString(String dataAsString) {
    this.dataAsString = dataAsString;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaptionTrack captionTrack = (CaptionTrack) o;
    return true && Objects.equals(this.captionId, captionTrack.captionId) && Objects.equals(this.label, captionTrack.label) && Objects.equals(this.dataAsString, captionTrack.dataAsString) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(captionId, label, dataAsString, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaptionTrack {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    captionId: ").append(toIndentedString(captionId)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    dataAsString: ").append(toIndentedString(dataAsString)).append("\n");
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
