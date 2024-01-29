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
 * Represents header/footer info of notes slide
 */
@ApiModel(description = "Represents header/footer info of notes slide")
public class NotesSlideHeaderFooter extends ResourceBase {
  @SerializedName(value = "isDateTimeVisible", alternate = { "IsDateTimeVisible" })
  private Boolean isDateTimeVisible;

  @SerializedName(value = "dateTimeText", alternate = { "DateTimeText" })
  private String dateTimeText;

  @SerializedName(value = "isFooterVisible", alternate = { "IsFooterVisible" })
  private Boolean isFooterVisible;

  @SerializedName(value = "footerText", alternate = { "FooterText" })
  private String footerText;

  @SerializedName(value = "isHeaderVisible", alternate = { "IsHeaderVisible" })
  private Boolean isHeaderVisible;

  @SerializedName(value = "headerText", alternate = { "HeaderText" })
  private String headerText;

  @SerializedName(value = "isSlideNumberVisible", alternate = { "IsSlideNumberVisible" })
  private Boolean isSlideNumberVisible;


  public NotesSlideHeaderFooter() {
    super();
  }

  public NotesSlideHeaderFooter isDateTimeVisible(Boolean isDateTimeVisible) {
    this.isDateTimeVisible = isDateTimeVisible;
    return this;
  }

   /**
   * True if date is displayed in the footer
   * @return isDateTimeVisible
  **/
  @ApiModelProperty(value = "True if date is displayed in the footer")
  public Boolean getIsDateTimeVisible() {
    return isDateTimeVisible;
  }

  public void setIsDateTimeVisible(Boolean isDateTimeVisible) {
    this.isDateTimeVisible = isDateTimeVisible;
  }

  public NotesSlideHeaderFooter dateTimeText(String dateTimeText) {
    this.dateTimeText = dateTimeText;
    return this;
  }

   /**
   * Text to be displayed as date in the footer
   * @return dateTimeText
  **/
  @ApiModelProperty(value = "Text to be displayed as date in the footer")
  public String getDateTimeText() {
    return dateTimeText;
  }

  public void setDateTimeText(String dateTimeText) {
    this.dateTimeText = dateTimeText;
  }

  public NotesSlideHeaderFooter isFooterVisible(Boolean isFooterVisible) {
    this.isFooterVisible = isFooterVisible;
    return this;
  }

   /**
   * True if footer is displayed
   * @return isFooterVisible
  **/
  @ApiModelProperty(value = "True if footer is displayed")
  public Boolean getIsFooterVisible() {
    return isFooterVisible;
  }

  public void setIsFooterVisible(Boolean isFooterVisible) {
    this.isFooterVisible = isFooterVisible;
  }

  public NotesSlideHeaderFooter footerText(String footerText) {
    this.footerText = footerText;
    return this;
  }

   /**
   * Text to be displayed in the footer
   * @return footerText
  **/
  @ApiModelProperty(value = "Text to be displayed in the footer")
  public String getFooterText() {
    return footerText;
  }

  public void setFooterText(String footerText) {
    this.footerText = footerText;
  }

  public NotesSlideHeaderFooter isHeaderVisible(Boolean isHeaderVisible) {
    this.isHeaderVisible = isHeaderVisible;
    return this;
  }

   /**
   * True if header is displayed
   * @return isHeaderVisible
  **/
  @ApiModelProperty(value = "True if header is displayed")
  public Boolean getIsHeaderVisible() {
    return isHeaderVisible;
  }

  public void setIsHeaderVisible(Boolean isHeaderVisible) {
    this.isHeaderVisible = isHeaderVisible;
  }

  public NotesSlideHeaderFooter headerText(String headerText) {
    this.headerText = headerText;
    return this;
  }

   /**
   * Text to be displayed in the header
   * @return headerText
  **/
  @ApiModelProperty(value = "Text to be displayed in the header")
  public String getHeaderText() {
    return headerText;
  }

  public void setHeaderText(String headerText) {
    this.headerText = headerText;
  }

  public NotesSlideHeaderFooter isSlideNumberVisible(Boolean isSlideNumberVisible) {
    this.isSlideNumberVisible = isSlideNumberVisible;
    return this;
  }

   /**
   * True if slide number is displayed in the footer
   * @return isSlideNumberVisible
  **/
  @ApiModelProperty(value = "True if slide number is displayed in the footer")
  public Boolean getIsSlideNumberVisible() {
    return isSlideNumberVisible;
  }

  public void setIsSlideNumberVisible(Boolean isSlideNumberVisible) {
    this.isSlideNumberVisible = isSlideNumberVisible;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotesSlideHeaderFooter notesSlideHeaderFooter = (NotesSlideHeaderFooter) o;
    return true && Objects.equals(this.isDateTimeVisible, notesSlideHeaderFooter.isDateTimeVisible) && Objects.equals(this.dateTimeText, notesSlideHeaderFooter.dateTimeText) && Objects.equals(this.isFooterVisible, notesSlideHeaderFooter.isFooterVisible) && Objects.equals(this.footerText, notesSlideHeaderFooter.footerText) && Objects.equals(this.isHeaderVisible, notesSlideHeaderFooter.isHeaderVisible) && Objects.equals(this.headerText, notesSlideHeaderFooter.headerText) && Objects.equals(this.isSlideNumberVisible, notesSlideHeaderFooter.isSlideNumberVisible) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isDateTimeVisible, dateTimeText, isFooterVisible, footerText, isHeaderVisible, headerText, isSlideNumberVisible, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotesSlideHeaderFooter {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    isDateTimeVisible: ").append(toIndentedString(isDateTimeVisible)).append("\n");
    sb.append("    dateTimeText: ").append(toIndentedString(dateTimeText)).append("\n");
    sb.append("    isFooterVisible: ").append(toIndentedString(isFooterVisible)).append("\n");
    sb.append("    footerText: ").append(toIndentedString(footerText)).append("\n");
    sb.append("    isHeaderVisible: ").append(toIndentedString(isHeaderVisible)).append("\n");
    sb.append("    headerText: ").append(toIndentedString(headerText)).append("\n");
    sb.append("    isSlideNumberVisible: ").append(toIndentedString(isSlideNumberVisible)).append("\n");
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
