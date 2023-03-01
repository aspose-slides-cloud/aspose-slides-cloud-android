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
import com.aspose.slides.model.ParagraphFormat;
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
 * Contains the TextFrame&#39;s formatting properties.
 */
@ApiModel(description = "Contains the TextFrame's formatting properties.")
public class TextFrameFormat {
  @SerializedName(value = "threeDFormat", alternate = { "ThreeDFormat" })
  private ThreeDFormat threeDFormat;

  /**
   * Gets or sets text wrapping shape.
   */
  @JsonAdapter(TransformEnum.Adapter.class)
  public enum TransformEnum {
    NONE("None"),
    
    PLAIN("Plain"),
    
    STOP("Stop"),
    
    TRIANGLE("Triangle"),
    
    TRIANGLEINVERTED("TriangleInverted"),
    
    CHEVRON("Chevron"),
    
    CHEVRONINVERTED("ChevronInverted"),
    
    RINGINSIDE("RingInside"),
    
    RINGOUTSIDE("RingOutside"),
    
    ARCHUP("ArchUp"),
    
    ARCHDOWN("ArchDown"),
    
    CIRCLE("Circle"),
    
    BUTTON("Button"),
    
    ARCHUPPOUR("ArchUpPour"),
    
    ARCHDOWNPOUR("ArchDownPour"),
    
    CIRCLEPOUR("CirclePour"),
    
    BUTTONPOUR("ButtonPour"),
    
    CURVEUP("CurveUp"),
    
    CURVEDOWN("CurveDown"),
    
    CANUP("CanUp"),
    
    CANDOWN("CanDown"),
    
    WAVE1("Wave1"),
    
    WAVE2("Wave2"),
    
    DOUBLEWAVE1("DoubleWave1"),
    
    WAVE4("Wave4"),
    
    INFLATE("Inflate"),
    
    DEFLATE("Deflate"),
    
    INFLATEBOTTOM("InflateBottom"),
    
    DEFLATEBOTTOM("DeflateBottom"),
    
    INFLATETOP("InflateTop"),
    
    DEFLATETOP("DeflateTop"),
    
    DEFLATEINFLATE("DeflateInflate"),
    
    DEFLATEINFLATEDEFLATE("DeflateInflateDeflate"),
    
    FADERIGHT("FadeRight"),
    
    FADELEFT("FadeLeft"),
    
    FADEUP("FadeUp"),
    
    FADEDOWN("FadeDown"),
    
    SLANTUP("SlantUp"),
    
    SLANTDOWN("SlantDown"),
    
    CASCADEUP("CascadeUp"),
    
    CASCADEDOWN("CascadeDown"),
    
    CUSTOM("Custom"),
    
    NOTDEFINED("NotDefined");

    private String value;

    TransformEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TransformEnum fromValue(String text) {
      for (TransformEnum b : TransformEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TransformEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransformEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransformEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TransformEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "transform", alternate = { "Transform" })
  private TransformEnum transform;

  @SerializedName(value = "marginLeft", alternate = { "MarginLeft" })
  private Double marginLeft;

  @SerializedName(value = "marginRight", alternate = { "MarginRight" })
  private Double marginRight;

  @SerializedName(value = "marginTop", alternate = { "MarginTop" })
  private Double marginTop;

  @SerializedName(value = "marginBottom", alternate = { "MarginBottom" })
  private Double marginBottom;

  /**
   * True if text is wrapped at TextFrame&#39;s margins.
   */
  @JsonAdapter(WrapTextEnum.Adapter.class)
  public enum WrapTextEnum {
    FALSE("False"),
    
    TRUE("True"),
    
    NOTDEFINED("NotDefined");

    private String value;

    WrapTextEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WrapTextEnum fromValue(String text) {
      for (WrapTextEnum b : WrapTextEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<WrapTextEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WrapTextEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WrapTextEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return WrapTextEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "wrapText", alternate = { "WrapText" })
  private WrapTextEnum wrapText;

  /**
   * Returns or sets vertical anchor text in a TextFrame.
   */
  @JsonAdapter(AnchoringTypeEnum.Adapter.class)
  public enum AnchoringTypeEnum {
    TOP("Top"),
    
    CENTER("Center"),
    
    BOTTOM("Bottom"),
    
    JUSTIFIED("Justified"),
    
    DISTRIBUTED("Distributed"),
    
    NOTDEFINED("NotDefined");

    private String value;

    AnchoringTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AnchoringTypeEnum fromValue(String text) {
      for (AnchoringTypeEnum b : AnchoringTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AnchoringTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AnchoringTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AnchoringTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AnchoringTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "anchoringType", alternate = { "AnchoringType" })
  private AnchoringTypeEnum anchoringType;

  /**
   * If True then text should be centered in box horizontally.
   */
  @JsonAdapter(CenterTextEnum.Adapter.class)
  public enum CenterTextEnum {
    FALSE("False"),
    
    TRUE("True"),
    
    NOTDEFINED("NotDefined");

    private String value;

    CenterTextEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CenterTextEnum fromValue(String text) {
      for (CenterTextEnum b : CenterTextEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CenterTextEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CenterTextEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CenterTextEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CenterTextEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "centerText", alternate = { "CenterText" })
  private CenterTextEnum centerText;

  /**
   * Determines text orientation. The resulted value of visual text rotation summarized from this property and custom angle in property RotationAngle.
   */
  @JsonAdapter(TextVerticalTypeEnum.Adapter.class)
  public enum TextVerticalTypeEnum {
    HORIZONTAL("Horizontal"),
    
    VERTICAL("Vertical"),
    
    VERTICAL270("Vertical270"),
    
    WORDARTVERTICAL("WordArtVertical"),
    
    EASTASIANVERTICAL("EastAsianVertical"),
    
    MONGOLIANVERTICAL("MongolianVertical"),
    
    WORDARTVERTICALRIGHTTOLEFT("WordArtVerticalRightToLeft"),
    
    NOTDEFINED("NotDefined");

    private String value;

    TextVerticalTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TextVerticalTypeEnum fromValue(String text) {
      for (TextVerticalTypeEnum b : TextVerticalTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TextVerticalTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TextVerticalTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TextVerticalTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TextVerticalTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "textVerticalType", alternate = { "TextVerticalType" })
  private TextVerticalTypeEnum textVerticalType;

  /**
   * Returns or sets text&#39;s auto-fit mode.
   */
  @JsonAdapter(AutofitTypeEnum.Adapter.class)
  public enum AutofitTypeEnum {
    NONE("None"),
    
    NORMAL("Normal"),
    
    SHAPE("Shape"),
    
    NOTDEFINED("NotDefined");

    private String value;

    AutofitTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AutofitTypeEnum fromValue(String text) {
      for (AutofitTypeEnum b : AutofitTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AutofitTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AutofitTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AutofitTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AutofitTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "autofitType", alternate = { "AutofitType" })
  private AutofitTypeEnum autofitType;

  @SerializedName(value = "columnCount", alternate = { "ColumnCount" })
  private Integer columnCount;

  @SerializedName(value = "columnSpacing", alternate = { "ColumnSpacing" })
  private Double columnSpacing;

  @SerializedName(value = "keepTextFlat", alternate = { "KeepTextFlat" })
  private Boolean keepTextFlat;

  @SerializedName(value = "rotationAngle", alternate = { "RotationAngle" })
  private Double rotationAngle;

  @SerializedName(value = "defaultParagraphFormat", alternate = { "DefaultParagraphFormat" })
  private ParagraphFormat defaultParagraphFormat;


  public TextFrameFormat() {
    super();
  }

  public TextFrameFormat threeDFormat(ThreeDFormat threeDFormat) {
    this.threeDFormat = threeDFormat;
    return this;
  }

   /**
   * Represents 3d effect properties for a text.
   * @return threeDFormat
  **/
  @ApiModelProperty(value = "Represents 3d effect properties for a text.")
  public ThreeDFormat getThreeDFormat() {
    return threeDFormat;
  }

  public void setThreeDFormat(ThreeDFormat threeDFormat) {
    this.threeDFormat = threeDFormat;
  }

  public TextFrameFormat transform(TransformEnum transform) {
    this.transform = transform;
    return this;
  }

   /**
   * Gets or sets text wrapping shape.
   * @return transform
  **/
  @ApiModelProperty(value = "Gets or sets text wrapping shape.")
  public TransformEnum getTransform() {
    return transform;
  }

  public void setTransform(TransformEnum transform) {
    this.transform = transform;
  }

  public TextFrameFormat marginLeft(Double marginLeft) {
    this.marginLeft = marginLeft;
    return this;
  }

   /**
   * Left margin. Left margin.
   * @return marginLeft
  **/
  @ApiModelProperty(value = "Left margin. Left margin.")
  public Double getMarginLeft() {
    return marginLeft;
  }

  public void setMarginLeft(Double marginLeft) {
    this.marginLeft = marginLeft;
  }

  public TextFrameFormat marginRight(Double marginRight) {
    this.marginRight = marginRight;
    return this;
  }

   /**
   * Right margin.
   * @return marginRight
  **/
  @ApiModelProperty(value = "Right margin.")
  public Double getMarginRight() {
    return marginRight;
  }

  public void setMarginRight(Double marginRight) {
    this.marginRight = marginRight;
  }

  public TextFrameFormat marginTop(Double marginTop) {
    this.marginTop = marginTop;
    return this;
  }

   /**
   * Top margin.
   * @return marginTop
  **/
  @ApiModelProperty(value = "Top margin.")
  public Double getMarginTop() {
    return marginTop;
  }

  public void setMarginTop(Double marginTop) {
    this.marginTop = marginTop;
  }

  public TextFrameFormat marginBottom(Double marginBottom) {
    this.marginBottom = marginBottom;
    return this;
  }

   /**
   * Bottom margin.
   * @return marginBottom
  **/
  @ApiModelProperty(value = "Bottom margin.")
  public Double getMarginBottom() {
    return marginBottom;
  }

  public void setMarginBottom(Double marginBottom) {
    this.marginBottom = marginBottom;
  }

  public TextFrameFormat wrapText(WrapTextEnum wrapText) {
    this.wrapText = wrapText;
    return this;
  }

   /**
   * True if text is wrapped at TextFrame&#39;s margins.
   * @return wrapText
  **/
  @ApiModelProperty(value = "True if text is wrapped at TextFrame's margins.")
  public WrapTextEnum getWrapText() {
    return wrapText;
  }

  public void setWrapText(WrapTextEnum wrapText) {
    this.wrapText = wrapText;
  }

  public TextFrameFormat anchoringType(AnchoringTypeEnum anchoringType) {
    this.anchoringType = anchoringType;
    return this;
  }

   /**
   * Returns or sets vertical anchor text in a TextFrame.
   * @return anchoringType
  **/
  @ApiModelProperty(value = "Returns or sets vertical anchor text in a TextFrame.")
  public AnchoringTypeEnum getAnchoringType() {
    return anchoringType;
  }

  public void setAnchoringType(AnchoringTypeEnum anchoringType) {
    this.anchoringType = anchoringType;
  }

  public TextFrameFormat centerText(CenterTextEnum centerText) {
    this.centerText = centerText;
    return this;
  }

   /**
   * If True then text should be centered in box horizontally.
   * @return centerText
  **/
  @ApiModelProperty(value = "If True then text should be centered in box horizontally.")
  public CenterTextEnum getCenterText() {
    return centerText;
  }

  public void setCenterText(CenterTextEnum centerText) {
    this.centerText = centerText;
  }

  public TextFrameFormat textVerticalType(TextVerticalTypeEnum textVerticalType) {
    this.textVerticalType = textVerticalType;
    return this;
  }

   /**
   * Determines text orientation. The resulted value of visual text rotation summarized from this property and custom angle in property RotationAngle.
   * @return textVerticalType
  **/
  @ApiModelProperty(value = "Determines text orientation. The resulted value of visual text rotation summarized from this property and custom angle in property RotationAngle.")
  public TextVerticalTypeEnum getTextVerticalType() {
    return textVerticalType;
  }

  public void setTextVerticalType(TextVerticalTypeEnum textVerticalType) {
    this.textVerticalType = textVerticalType;
  }

  public TextFrameFormat autofitType(AutofitTypeEnum autofitType) {
    this.autofitType = autofitType;
    return this;
  }

   /**
   * Returns or sets text&#39;s auto-fit mode.
   * @return autofitType
  **/
  @ApiModelProperty(value = "Returns or sets text's auto-fit mode.")
  public AutofitTypeEnum getAutofitType() {
    return autofitType;
  }

  public void setAutofitType(AutofitTypeEnum autofitType) {
    this.autofitType = autofitType;
  }

  public TextFrameFormat columnCount(Integer columnCount) {
    this.columnCount = columnCount;
    return this;
  }

   /**
   * Returns or sets number of columns in the text area. This value must be a positive number. Otherwise, the value will be set to zero.  Value 0 means undefined value.
   * @return columnCount
  **/
  @ApiModelProperty(value = "Returns or sets number of columns in the text area. This value must be a positive number. Otherwise, the value will be set to zero.  Value 0 means undefined value.")
  public Integer getColumnCount() {
    return columnCount;
  }

  public void setColumnCount(Integer columnCount) {
    this.columnCount = columnCount;
  }

  public TextFrameFormat columnSpacing(Double columnSpacing) {
    this.columnSpacing = columnSpacing;
    return this;
  }

   /**
   * Returns or sets the space between text columns in the text area (in points). This should only apply  when there is more than 1 column present. This value must be a positive number. Otherwise, the value will be set to zero. 
   * @return columnSpacing
  **/
  @ApiModelProperty(value = "Returns or sets the space between text columns in the text area (in points). This should only apply  when there is more than 1 column present. This value must be a positive number. Otherwise, the value will be set to zero. ")
  public Double getColumnSpacing() {
    return columnSpacing;
  }

  public void setColumnSpacing(Double columnSpacing) {
    this.columnSpacing = columnSpacing;
  }

  public TextFrameFormat keepTextFlat(Boolean keepTextFlat) {
    this.keepTextFlat = keepTextFlat;
    return this;
  }

   /**
   * Returns or set keeping text out of 3D scene entirely.
   * @return keepTextFlat
  **/
  @ApiModelProperty(value = "Returns or set keeping text out of 3D scene entirely.")
  public Boolean isKeepTextFlat() {
    return keepTextFlat;
  }

  public void setKeepTextFlat(Boolean keepTextFlat) {
    this.keepTextFlat = keepTextFlat;
  }

  public TextFrameFormat rotationAngle(Double rotationAngle) {
    this.rotationAngle = rotationAngle;
    return this;
  }

   /**
   * Specifies the custom rotation that is being applied to the text within the bounding box.
   * @return rotationAngle
  **/
  @ApiModelProperty(value = "Specifies the custom rotation that is being applied to the text within the bounding box.")
  public Double getRotationAngle() {
    return rotationAngle;
  }

  public void setRotationAngle(Double rotationAngle) {
    this.rotationAngle = rotationAngle;
  }

  public TextFrameFormat defaultParagraphFormat(ParagraphFormat defaultParagraphFormat) {
    this.defaultParagraphFormat = defaultParagraphFormat;
    return this;
  }

   /**
   * Default portion format.
   * @return defaultParagraphFormat
  **/
  @ApiModelProperty(value = "Default portion format.")
  public ParagraphFormat getDefaultParagraphFormat() {
    return defaultParagraphFormat;
  }

  public void setDefaultParagraphFormat(ParagraphFormat defaultParagraphFormat) {
    this.defaultParagraphFormat = defaultParagraphFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextFrameFormat textFrameFormat = (TextFrameFormat) o;
    return true && Objects.equals(this.threeDFormat, textFrameFormat.threeDFormat) && Objects.equals(this.transform, textFrameFormat.transform) && Objects.equals(this.marginLeft, textFrameFormat.marginLeft) && Objects.equals(this.marginRight, textFrameFormat.marginRight) && Objects.equals(this.marginTop, textFrameFormat.marginTop) && Objects.equals(this.marginBottom, textFrameFormat.marginBottom) && Objects.equals(this.wrapText, textFrameFormat.wrapText) && Objects.equals(this.anchoringType, textFrameFormat.anchoringType) && Objects.equals(this.centerText, textFrameFormat.centerText) && Objects.equals(this.textVerticalType, textFrameFormat.textVerticalType) && Objects.equals(this.autofitType, textFrameFormat.autofitType) && Objects.equals(this.columnCount, textFrameFormat.columnCount) && Objects.equals(this.columnSpacing, textFrameFormat.columnSpacing) && Objects.equals(this.keepTextFlat, textFrameFormat.keepTextFlat) && Objects.equals(this.rotationAngle, textFrameFormat.rotationAngle) && Objects.equals(this.defaultParagraphFormat, textFrameFormat.defaultParagraphFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threeDFormat, transform, marginLeft, marginRight, marginTop, marginBottom, wrapText, anchoringType, centerText, textVerticalType, autofitType, columnCount, columnSpacing, keepTextFlat, rotationAngle, defaultParagraphFormat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextFrameFormat {\n");
    
    sb.append("    threeDFormat: ").append(toIndentedString(threeDFormat)).append("\n");
    sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
    sb.append("    marginLeft: ").append(toIndentedString(marginLeft)).append("\n");
    sb.append("    marginRight: ").append(toIndentedString(marginRight)).append("\n");
    sb.append("    marginTop: ").append(toIndentedString(marginTop)).append("\n");
    sb.append("    marginBottom: ").append(toIndentedString(marginBottom)).append("\n");
    sb.append("    wrapText: ").append(toIndentedString(wrapText)).append("\n");
    sb.append("    anchoringType: ").append(toIndentedString(anchoringType)).append("\n");
    sb.append("    centerText: ").append(toIndentedString(centerText)).append("\n");
    sb.append("    textVerticalType: ").append(toIndentedString(textVerticalType)).append("\n");
    sb.append("    autofitType: ").append(toIndentedString(autofitType)).append("\n");
    sb.append("    columnCount: ").append(toIndentedString(columnCount)).append("\n");
    sb.append("    columnSpacing: ").append(toIndentedString(columnSpacing)).append("\n");
    sb.append("    keepTextFlat: ").append(toIndentedString(keepTextFlat)).append("\n");
    sb.append("    rotationAngle: ").append(toIndentedString(rotationAngle)).append("\n");
    sb.append("    defaultParagraphFormat: ").append(toIndentedString(defaultParagraphFormat)).append("\n");
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
