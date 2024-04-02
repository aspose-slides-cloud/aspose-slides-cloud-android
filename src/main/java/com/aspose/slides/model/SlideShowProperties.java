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
 * Slide show properties.
 */
@ApiModel(description = "Slide show properties.")
public class SlideShowProperties extends ResourceBase {
  @SerializedName(value = "loop", alternate = { "Loop" })
  private Boolean loop;

  @SerializedName(value = "startSlide", alternate = { "StartSlide" })
  private Integer startSlide;

  @SerializedName(value = "endSlide", alternate = { "EndSlide" })
  private Integer endSlide;

  @SerializedName(value = "penColor", alternate = { "PenColor" })
  private String penColor;

  @SerializedName(value = "showAnimation", alternate = { "ShowAnimation" })
  private Boolean showAnimation;

  @SerializedName(value = "showNarration", alternate = { "ShowNarration" })
  private Boolean showNarration;

  @SerializedName(value = "showMediaControls", alternate = { "ShowMediaControls" })
  private Boolean showMediaControls;

  @SerializedName(value = "useTimings", alternate = { "UseTimings" })
  private Boolean useTimings;

  /**
   * Slide show type.
   */
  @JsonAdapter(SlideShowTypeEnum.Adapter.class)
  public enum SlideShowTypeEnum {
    BROWSEDATKIOSK("BrowsedAtKiosk"),
    
    BROWSEDBYINDIVIDUAL("BrowsedByIndividual"),
    
    PRESENTEDBYSPEAKER("PresentedBySpeaker");

    private String value;

    SlideShowTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SlideShowTypeEnum fromValue(String text) {
      for (SlideShowTypeEnum b : SlideShowTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SlideShowTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SlideShowTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SlideShowTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SlideShowTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "slideShowType", alternate = { "SlideShowType" })
  private SlideShowTypeEnum slideShowType;

  @SerializedName(value = "showScrollbar", alternate = { "ShowScrollbar" })
  private Boolean showScrollbar;


  public SlideShowProperties() {
    super();
  }

  public SlideShowProperties loop(Boolean loop) {
    this.loop = loop;
    return this;
  }

   /**
   * Loop slide show.
   * @return loop
  **/
  @ApiModelProperty(value = "Loop slide show.")
  public Boolean isLoop() {
    return loop;
  }

  public void setLoop(Boolean loop) {
    this.loop = loop;
  }

  public SlideShowProperties startSlide(Integer startSlide) {
    this.startSlide = startSlide;
    return this;
  }

   /**
   * Start slide in the slide show.
   * @return startSlide
  **/
  @ApiModelProperty(value = "Start slide in the slide show.")
  public Integer getStartSlide() {
    return startSlide;
  }

  public void setStartSlide(Integer startSlide) {
    this.startSlide = startSlide;
  }

  public SlideShowProperties endSlide(Integer endSlide) {
    this.endSlide = endSlide;
    return this;
  }

   /**
   * End slides in the slide show.
   * @return endSlide
  **/
  @ApiModelProperty(value = "End slides in the slide show.")
  public Integer getEndSlide() {
    return endSlide;
  }

  public void setEndSlide(Integer endSlide) {
    this.endSlide = endSlide;
  }

  public SlideShowProperties penColor(String penColor) {
    this.penColor = penColor;
    return this;
  }

   /**
   * Pen color.
   * @return penColor
  **/
  @ApiModelProperty(value = "Pen color.")
  public String getPenColor() {
    return penColor;
  }

  public void setPenColor(String penColor) {
    this.penColor = penColor;
  }

  public SlideShowProperties showAnimation(Boolean showAnimation) {
    this.showAnimation = showAnimation;
    return this;
  }

   /**
   * Show animation.
   * @return showAnimation
  **/
  @ApiModelProperty(value = "Show animation.")
  public Boolean isShowAnimation() {
    return showAnimation;
  }

  public void setShowAnimation(Boolean showAnimation) {
    this.showAnimation = showAnimation;
  }

  public SlideShowProperties showNarration(Boolean showNarration) {
    this.showNarration = showNarration;
    return this;
  }

   /**
   * Show narrration.
   * @return showNarration
  **/
  @ApiModelProperty(value = "Show narrration.")
  public Boolean isShowNarration() {
    return showNarration;
  }

  public void setShowNarration(Boolean showNarration) {
    this.showNarration = showNarration;
  }

  public SlideShowProperties showMediaControls(Boolean showMediaControls) {
    this.showMediaControls = showMediaControls;
    return this;
  }

   /**
   * Show media controls.
   * @return showMediaControls
  **/
  @ApiModelProperty(value = "Show media controls.")
  public Boolean isShowMediaControls() {
    return showMediaControls;
  }

  public void setShowMediaControls(Boolean showMediaControls) {
    this.showMediaControls = showMediaControls;
  }

  public SlideShowProperties useTimings(Boolean useTimings) {
    this.useTimings = useTimings;
    return this;
  }

   /**
   * Use timings.
   * @return useTimings
  **/
  @ApiModelProperty(value = "Use timings.")
  public Boolean isUseTimings() {
    return useTimings;
  }

  public void setUseTimings(Boolean useTimings) {
    this.useTimings = useTimings;
  }

  public SlideShowProperties slideShowType(SlideShowTypeEnum slideShowType) {
    this.slideShowType = slideShowType;
    return this;
  }

   /**
   * Slide show type.
   * @return slideShowType
  **/
  @ApiModelProperty(value = "Slide show type.")
  public SlideShowTypeEnum getSlideShowType() {
    return slideShowType;
  }

  public void setSlideShowType(SlideShowTypeEnum slideShowType) {
    this.slideShowType = slideShowType;
  }

  public SlideShowProperties showScrollbar(Boolean showScrollbar) {
    this.showScrollbar = showScrollbar;
    return this;
  }

   /**
   * Show scroll bar. Applied with BrowsedByIndividual slide show type.
   * @return showScrollbar
  **/
  @ApiModelProperty(value = "Show scroll bar. Applied with BrowsedByIndividual slide show type.")
  public Boolean isShowScrollbar() {
    return showScrollbar;
  }

  public void setShowScrollbar(Boolean showScrollbar) {
    this.showScrollbar = showScrollbar;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SlideShowProperties slideShowProperties = (SlideShowProperties) o;
    return true && Objects.equals(this.loop, slideShowProperties.loop) && Objects.equals(this.startSlide, slideShowProperties.startSlide) && Objects.equals(this.endSlide, slideShowProperties.endSlide) && Objects.equals(this.penColor, slideShowProperties.penColor) && Objects.equals(this.showAnimation, slideShowProperties.showAnimation) && Objects.equals(this.showNarration, slideShowProperties.showNarration) && Objects.equals(this.showMediaControls, slideShowProperties.showMediaControls) && Objects.equals(this.useTimings, slideShowProperties.useTimings) && Objects.equals(this.slideShowType, slideShowProperties.slideShowType) && Objects.equals(this.showScrollbar, slideShowProperties.showScrollbar) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loop, startSlide, endSlide, penColor, showAnimation, showNarration, showMediaControls, useTimings, slideShowType, showScrollbar, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlideShowProperties {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    loop: ").append(toIndentedString(loop)).append("\n");
    sb.append("    startSlide: ").append(toIndentedString(startSlide)).append("\n");
    sb.append("    endSlide: ").append(toIndentedString(endSlide)).append("\n");
    sb.append("    penColor: ").append(toIndentedString(penColor)).append("\n");
    sb.append("    showAnimation: ").append(toIndentedString(showAnimation)).append("\n");
    sb.append("    showNarration: ").append(toIndentedString(showNarration)).append("\n");
    sb.append("    showMediaControls: ").append(toIndentedString(showMediaControls)).append("\n");
    sb.append("    useTimings: ").append(toIndentedString(useTimings)).append("\n");
    sb.append("    slideShowType: ").append(toIndentedString(slideShowType)).append("\n");
    sb.append("    showScrollbar: ").append(toIndentedString(showScrollbar)).append("\n");
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
