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
import java.util.Hashtable;
import java.util.Map;

/**
 * Handout layouting options
 */
@ApiModel(description = "Handout layouting options")
public class HandoutLayoutingOptions extends SlidesLayoutOptions {
  /**
   * Specified how many pages and in what sequence will be placed on the page.
   */
  @JsonAdapter(HandoutEnum.Adapter.class)
  public enum HandoutEnum {
    HANDOUTS1("Handouts1"),
    
    HANDOUTS2("Handouts2"),
    
    HANDOUTS3("Handouts3"),
    
    HANDOUTS4HORIZONTAL("Handouts4Horizontal"),
    
    HANDOUTS4VERTICAL("Handouts4Vertical"),
    
    HANDOUTS6HORIZONTAL("Handouts6Horizontal"),
    
    HANDOUTS6VERTICAL("Handouts6Vertical"),
    
    HANDOUTS9HORIZONTAL("Handouts9Horizontal"),
    
    HANDOUTS9VERTICAL("Handouts9Vertical");

    private String value;

    HandoutEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HandoutEnum fromValue(String text) {
      for (HandoutEnum b : HandoutEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<HandoutEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HandoutEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HandoutEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return HandoutEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "handout", alternate = { "Handout" })
  private HandoutEnum handout;

  @SerializedName(value = "printSlideNumbers", alternate = { "PrintSlideNumbers" })
  private Boolean printSlideNumbers;

  @SerializedName(value = "printComments", alternate = { "PrintComments" })
  private Boolean printComments;

  @SerializedName(value = "printFrameSlide", alternate = { "PrintFrameSlide" })
  private Boolean printFrameSlide;


  public HandoutLayoutingOptions() {
    super();
    setLayoutType(LayoutTypeEnum.HANDOUT);
  }

  public HandoutLayoutingOptions handout(HandoutEnum handout) {
    this.handout = handout;
    return this;
  }

   /**
   * Specified how many pages and in what sequence will be placed on the page.
   * @return handout
  **/
  @ApiModelProperty(value = "Specified how many pages and in what sequence will be placed on the page.")
  public HandoutEnum getHandout() {
    return handout;
  }

  public void setHandout(HandoutEnum handout) {
    this.handout = handout;
  }

  public HandoutLayoutingOptions printSlideNumbers(Boolean printSlideNumbers) {
    this.printSlideNumbers = printSlideNumbers;
    return this;
  }

   /**
   * True to print the displayed slide numbers.
   * @return printSlideNumbers
  **/
  @ApiModelProperty(value = "True to print the displayed slide numbers.")
  public Boolean isPrintSlideNumbers() {
    return printSlideNumbers;
  }

  public void setPrintSlideNumbers(Boolean printSlideNumbers) {
    this.printSlideNumbers = printSlideNumbers;
  }

  public HandoutLayoutingOptions printComments(Boolean printComments) {
    this.printComments = printComments;
    return this;
  }

   /**
   * True to display comments on slide.
   * @return printComments
  **/
  @ApiModelProperty(value = "True to display comments on slide.")
  public Boolean isPrintComments() {
    return printComments;
  }

  public void setPrintComments(Boolean printComments) {
    this.printComments = printComments;
  }

  public HandoutLayoutingOptions printFrameSlide(Boolean printFrameSlide) {
    this.printFrameSlide = printFrameSlide;
    return this;
  }

   /**
   * True to draw frames around the displayed slides.
   * @return printFrameSlide
  **/
  @ApiModelProperty(value = "True to draw frames around the displayed slides.")
  public Boolean isPrintFrameSlide() {
    return printFrameSlide;
  }

  public void setPrintFrameSlide(Boolean printFrameSlide) {
    this.printFrameSlide = printFrameSlide;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HandoutLayoutingOptions handoutLayoutingOptions = (HandoutLayoutingOptions) o;
    return true && Objects.equals(this.handout, handoutLayoutingOptions.handout) && Objects.equals(this.printSlideNumbers, handoutLayoutingOptions.printSlideNumbers) && Objects.equals(this.printComments, handoutLayoutingOptions.printComments) && Objects.equals(this.printFrameSlide, handoutLayoutingOptions.printFrameSlide) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handout, printSlideNumbers, printComments, printFrameSlide, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HandoutLayoutingOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    handout: ").append(toIndentedString(handout)).append("\n");
    sb.append("    printSlideNumbers: ").append(toIndentedString(printSlideNumbers)).append("\n");
    sb.append("    printComments: ").append(toIndentedString(printComments)).append("\n");
    sb.append("    printFrameSlide: ").append(toIndentedString(printFrameSlide)).append("\n");
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
      typeDeterminers.put("LayoutType", LayoutTypeEnum.HANDOUT);
  }
}
