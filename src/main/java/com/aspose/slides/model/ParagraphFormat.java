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
import com.aspose.slides.model.PortionFormat;
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
 * Paragraph formatting properties.
 */
@ApiModel(description = "Paragraph formatting properties.")
public class ParagraphFormat {
  @SerializedName(value = "depth", alternate = { "Depth" })
  private Integer depth;

  /**
   * Text alignment.
   */
  @JsonAdapter(AlignmentEnum.Adapter.class)
  public enum AlignmentEnum {
    LEFT("Left"),
    
    CENTER("Center"),
    
    RIGHT("Right"),
    
    JUSTIFY("Justify"),
    
    JUSTIFYLOW("JustifyLow"),
    
    DISTRIBUTED("Distributed"),
    
    NOTDEFINED("NotDefined");

    private String value;

    AlignmentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AlignmentEnum fromValue(String text) {
      for (AlignmentEnum b : AlignmentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AlignmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AlignmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AlignmentEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AlignmentEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "alignment", alternate = { "Alignment" })
  private AlignmentEnum alignment;

  @SerializedName(value = "marginLeft", alternate = { "MarginLeft" })
  private Double marginLeft;

  @SerializedName(value = "marginRight", alternate = { "MarginRight" })
  private Double marginRight;

  @SerializedName(value = "spaceBefore", alternate = { "SpaceBefore" })
  private Double spaceBefore;

  @SerializedName(value = "spaceAfter", alternate = { "SpaceAfter" })
  private Double spaceAfter;

  @SerializedName(value = "spaceWithin", alternate = { "SpaceWithin" })
  private Double spaceWithin;

  /**
   * Font alignment.
   */
  @JsonAdapter(FontAlignmentEnum.Adapter.class)
  public enum FontAlignmentEnum {
    AUTOMATIC("Automatic"),
    
    TOP("Top"),
    
    CENTER("Center"),
    
    BOTTOM("Bottom"),
    
    BASELINE("Baseline"),
    
    DEFAULT("Default");

    private String value;

    FontAlignmentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FontAlignmentEnum fromValue(String text) {
      for (FontAlignmentEnum b : FontAlignmentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FontAlignmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FontAlignmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FontAlignmentEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FontAlignmentEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "fontAlignment", alternate = { "FontAlignment" })
  private FontAlignmentEnum fontAlignment;

  @SerializedName(value = "indent", alternate = { "Indent" })
  private Double indent;

  /**
   * Determines whether the Right to Left writing is used in a paragraph. No inheritance applied.
   */
  @JsonAdapter(RightToLeftEnum.Adapter.class)
  public enum RightToLeftEnum {
    FALSE("False"),
    
    TRUE("True"),
    
    NOTDEFINED("NotDefined");

    private String value;

    RightToLeftEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RightToLeftEnum fromValue(String text) {
      for (RightToLeftEnum b : RightToLeftEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RightToLeftEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RightToLeftEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RightToLeftEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RightToLeftEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "rightToLeft", alternate = { "RightToLeft" })
  private RightToLeftEnum rightToLeft;

  /**
   * Determines whether the East Asian line break is used in a paragraph. No inheritance applied.
   */
  @JsonAdapter(EastAsianLineBreakEnum.Adapter.class)
  public enum EastAsianLineBreakEnum {
    FALSE("False"),
    
    TRUE("True"),
    
    NOTDEFINED("NotDefined");

    private String value;

    EastAsianLineBreakEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EastAsianLineBreakEnum fromValue(String text) {
      for (EastAsianLineBreakEnum b : EastAsianLineBreakEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EastAsianLineBreakEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EastAsianLineBreakEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EastAsianLineBreakEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EastAsianLineBreakEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "eastAsianLineBreak", alternate = { "EastAsianLineBreak" })
  private EastAsianLineBreakEnum eastAsianLineBreak;

  /**
   * Determines whether the Latin line break is used in a paragraph. No inheritance applied.
   */
  @JsonAdapter(LatinLineBreakEnum.Adapter.class)
  public enum LatinLineBreakEnum {
    FALSE("False"),
    
    TRUE("True"),
    
    NOTDEFINED("NotDefined");

    private String value;

    LatinLineBreakEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LatinLineBreakEnum fromValue(String text) {
      for (LatinLineBreakEnum b : LatinLineBreakEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LatinLineBreakEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LatinLineBreakEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LatinLineBreakEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LatinLineBreakEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "latinLineBreak", alternate = { "LatinLineBreak" })
  private LatinLineBreakEnum latinLineBreak;

  /**
   * Determines whether the hanging punctuation is used in a paragraph. No inheritance applied.
   */
  @JsonAdapter(HangingPunctuationEnum.Adapter.class)
  public enum HangingPunctuationEnum {
    FALSE("False"),
    
    TRUE("True"),
    
    NOTDEFINED("NotDefined");

    private String value;

    HangingPunctuationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HangingPunctuationEnum fromValue(String text) {
      for (HangingPunctuationEnum b : HangingPunctuationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<HangingPunctuationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HangingPunctuationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HangingPunctuationEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return HangingPunctuationEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "hangingPunctuation", alternate = { "HangingPunctuation" })
  private HangingPunctuationEnum hangingPunctuation;

  @SerializedName(value = "defaultTabSize", alternate = { "DefaultTabSize" })
  private Double defaultTabSize;

  @SerializedName(value = "defaultPortionFormat", alternate = { "DefaultPortionFormat" })
  private PortionFormat defaultPortionFormat;

  @SerializedName(value = "bulletChar", alternate = { "BulletChar" })
  private String bulletChar;

  @SerializedName(value = "bulletHeight", alternate = { "BulletHeight" })
  private Double bulletHeight;

  /**
   * Bullet type.
   */
  @JsonAdapter(BulletTypeEnum.Adapter.class)
  public enum BulletTypeEnum {
    NONE("None"),
    
    SYMBOL("Symbol"),
    
    NUMBERED("Numbered"),
    
    PICTURE("Picture"),
    
    NOTDEFINED("NotDefined");

    private String value;

    BulletTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BulletTypeEnum fromValue(String text) {
      for (BulletTypeEnum b : BulletTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BulletTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BulletTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BulletTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BulletTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "bulletType", alternate = { "BulletType" })
  private BulletTypeEnum bulletType;

  @SerializedName(value = "numberedBulletStartWith", alternate = { "NumberedBulletStartWith" })
  private Integer numberedBulletStartWith;

  /**
   * Numbered bullet style.
   */
  @JsonAdapter(NumberedBulletStyleEnum.Adapter.class)
  public enum NumberedBulletStyleEnum {
    BULLETALPHALCPERIOD("BulletAlphaLCPeriod"),
    
    BULLETALPHAUCPERIOD("BulletAlphaUCPeriod"),
    
    BULLETARABICPARENRIGHT("BulletArabicParenRight"),
    
    BULLETARABICPERIOD("BulletArabicPeriod"),
    
    BULLETROMANLCPARENBOTH("BulletRomanLCParenBoth"),
    
    BULLETROMANLCPARENRIGHT("BulletRomanLCParenRight"),
    
    BULLETROMANLCPERIOD("BulletRomanLCPeriod"),
    
    BULLETROMANUCPERIOD("BulletRomanUCPeriod"),
    
    BULLETALPHALCPARENBOTH("BulletAlphaLCParenBoth"),
    
    BULLETALPHALCPARENRIGHT("BulletAlphaLCParenRight"),
    
    BULLETALPHAUCPARENBOTH("BulletAlphaUCParenBoth"),
    
    BULLETALPHAUCPARENRIGHT("BulletAlphaUCParenRight"),
    
    BULLETARABICPARENBOTH("BulletArabicParenBoth"),
    
    BULLETARABICPLAIN("BulletArabicPlain"),
    
    BULLETROMANUCPARENBOTH("BulletRomanUCParenBoth"),
    
    BULLETROMANUCPARENRIGHT("BulletRomanUCParenRight"),
    
    BULLETSIMPCHINPLAIN("BulletSimpChinPlain"),
    
    BULLETSIMPCHINPERIOD("BulletSimpChinPeriod"),
    
    BULLETCIRCLENUMDBPLAIN("BulletCircleNumDBPlain"),
    
    BULLETCIRCLENUMWDWHITEPLAIN("BulletCircleNumWDWhitePlain"),
    
    BULLETCIRCLENUMWDBLACKPLAIN("BulletCircleNumWDBlackPlain"),
    
    BULLETTRADCHINPLAIN("BulletTradChinPlain"),
    
    BULLETTRADCHINPERIOD("BulletTradChinPeriod"),
    
    BULLETARABICALPHADASH("BulletArabicAlphaDash"),
    
    BULLETARABICABJADDASH("BulletArabicAbjadDash"),
    
    BULLETHEBREWALPHADASH("BulletHebrewAlphaDash"),
    
    BULLETKANJIKOREANPLAIN("BulletKanjiKoreanPlain"),
    
    BULLETKANJIKOREANPERIOD("BulletKanjiKoreanPeriod"),
    
    BULLETARABICDBPLAIN("BulletArabicDBPlain"),
    
    BULLETARABICDBPERIOD("BulletArabicDBPeriod"),
    
    BULLETTHAIALPHAPERIOD("BulletThaiAlphaPeriod"),
    
    BULLETTHAIALPHAPARENRIGHT("BulletThaiAlphaParenRight"),
    
    BULLETTHAIALPHAPARENBOTH("BulletThaiAlphaParenBoth"),
    
    BULLETTHAINUMPERIOD("BulletThaiNumPeriod"),
    
    BULLETTHAINUMPARENRIGHT("BulletThaiNumParenRight"),
    
    BULLETTHAINUMPARENBOTH("BulletThaiNumParenBoth"),
    
    BULLETHINDIALPHAPERIOD("BulletHindiAlphaPeriod"),
    
    BULLETHINDINUMPERIOD("BulletHindiNumPeriod"),
    
    BULLETKANJISIMPCHINDBPERIOD("BulletKanjiSimpChinDBPeriod"),
    
    BULLETHINDINUMPARENRIGHT("BulletHindiNumParenRight"),
    
    BULLETHINDIALPHA1PERIOD("BulletHindiAlpha1Period"),
    
    NOTDEFINED("NotDefined");

    private String value;

    NumberedBulletStyleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NumberedBulletStyleEnum fromValue(String text) {
      for (NumberedBulletStyleEnum b : NumberedBulletStyleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<NumberedBulletStyleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NumberedBulletStyleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NumberedBulletStyleEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return NumberedBulletStyleEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "numberedBulletStyle", alternate = { "NumberedBulletStyle" })
  private NumberedBulletStyleEnum numberedBulletStyle;

  @SerializedName(value = "bulletFillFormat", alternate = { "BulletFillFormat" })
  private FillFormat bulletFillFormat;


  public ParagraphFormat() {
    super();
  }

  public ParagraphFormat depth(Integer depth) {
    this.depth = depth;
    return this;
  }

   /**
   * Depth.
   * @return depth
  **/
  @ApiModelProperty(value = "Depth.")
  public Integer getDepth() {
    return depth;
  }

  public void setDepth(Integer depth) {
    this.depth = depth;
  }

  public ParagraphFormat alignment(AlignmentEnum alignment) {
    this.alignment = alignment;
    return this;
  }

   /**
   * Text alignment.
   * @return alignment
  **/
  @ApiModelProperty(value = "Text alignment.")
  public AlignmentEnum getAlignment() {
    return alignment;
  }

  public void setAlignment(AlignmentEnum alignment) {
    this.alignment = alignment;
  }

  public ParagraphFormat marginLeft(Double marginLeft) {
    this.marginLeft = marginLeft;
    return this;
  }

   /**
   * Left margin.
   * @return marginLeft
  **/
  @ApiModelProperty(value = "Left margin.")
  public Double getMarginLeft() {
    return marginLeft;
  }

  public void setMarginLeft(Double marginLeft) {
    this.marginLeft = marginLeft;
  }

  public ParagraphFormat marginRight(Double marginRight) {
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

  public ParagraphFormat spaceBefore(Double spaceBefore) {
    this.spaceBefore = spaceBefore;
    return this;
  }

   /**
   * Left spacing.
   * @return spaceBefore
  **/
  @ApiModelProperty(value = "Left spacing.")
  public Double getSpaceBefore() {
    return spaceBefore;
  }

  public void setSpaceBefore(Double spaceBefore) {
    this.spaceBefore = spaceBefore;
  }

  public ParagraphFormat spaceAfter(Double spaceAfter) {
    this.spaceAfter = spaceAfter;
    return this;
  }

   /**
   * Right spacing.
   * @return spaceAfter
  **/
  @ApiModelProperty(value = "Right spacing.")
  public Double getSpaceAfter() {
    return spaceAfter;
  }

  public void setSpaceAfter(Double spaceAfter) {
    this.spaceAfter = spaceAfter;
  }

  public ParagraphFormat spaceWithin(Double spaceWithin) {
    this.spaceWithin = spaceWithin;
    return this;
  }

   /**
   * Spacing between lines.
   * @return spaceWithin
  **/
  @ApiModelProperty(value = "Spacing between lines.")
  public Double getSpaceWithin() {
    return spaceWithin;
  }

  public void setSpaceWithin(Double spaceWithin) {
    this.spaceWithin = spaceWithin;
  }

  public ParagraphFormat fontAlignment(FontAlignmentEnum fontAlignment) {
    this.fontAlignment = fontAlignment;
    return this;
  }

   /**
   * Font alignment.
   * @return fontAlignment
  **/
  @ApiModelProperty(value = "Font alignment.")
  public FontAlignmentEnum getFontAlignment() {
    return fontAlignment;
  }

  public void setFontAlignment(FontAlignmentEnum fontAlignment) {
    this.fontAlignment = fontAlignment;
  }

  public ParagraphFormat indent(Double indent) {
    this.indent = indent;
    return this;
  }

   /**
   * First line indent.
   * @return indent
  **/
  @ApiModelProperty(value = "First line indent.")
  public Double getIndent() {
    return indent;
  }

  public void setIndent(Double indent) {
    this.indent = indent;
  }

  public ParagraphFormat rightToLeft(RightToLeftEnum rightToLeft) {
    this.rightToLeft = rightToLeft;
    return this;
  }

   /**
   * Determines whether the Right to Left writing is used in a paragraph. No inheritance applied.
   * @return rightToLeft
  **/
  @ApiModelProperty(value = "Determines whether the Right to Left writing is used in a paragraph. No inheritance applied.")
  public RightToLeftEnum getRightToLeft() {
    return rightToLeft;
  }

  public void setRightToLeft(RightToLeftEnum rightToLeft) {
    this.rightToLeft = rightToLeft;
  }

  public ParagraphFormat eastAsianLineBreak(EastAsianLineBreakEnum eastAsianLineBreak) {
    this.eastAsianLineBreak = eastAsianLineBreak;
    return this;
  }

   /**
   * Determines whether the East Asian line break is used in a paragraph. No inheritance applied.
   * @return eastAsianLineBreak
  **/
  @ApiModelProperty(value = "Determines whether the East Asian line break is used in a paragraph. No inheritance applied.")
  public EastAsianLineBreakEnum getEastAsianLineBreak() {
    return eastAsianLineBreak;
  }

  public void setEastAsianLineBreak(EastAsianLineBreakEnum eastAsianLineBreak) {
    this.eastAsianLineBreak = eastAsianLineBreak;
  }

  public ParagraphFormat latinLineBreak(LatinLineBreakEnum latinLineBreak) {
    this.latinLineBreak = latinLineBreak;
    return this;
  }

   /**
   * Determines whether the Latin line break is used in a paragraph. No inheritance applied.
   * @return latinLineBreak
  **/
  @ApiModelProperty(value = "Determines whether the Latin line break is used in a paragraph. No inheritance applied.")
  public LatinLineBreakEnum getLatinLineBreak() {
    return latinLineBreak;
  }

  public void setLatinLineBreak(LatinLineBreakEnum latinLineBreak) {
    this.latinLineBreak = latinLineBreak;
  }

  public ParagraphFormat hangingPunctuation(HangingPunctuationEnum hangingPunctuation) {
    this.hangingPunctuation = hangingPunctuation;
    return this;
  }

   /**
   * Determines whether the hanging punctuation is used in a paragraph. No inheritance applied.
   * @return hangingPunctuation
  **/
  @ApiModelProperty(value = "Determines whether the hanging punctuation is used in a paragraph. No inheritance applied.")
  public HangingPunctuationEnum getHangingPunctuation() {
    return hangingPunctuation;
  }

  public void setHangingPunctuation(HangingPunctuationEnum hangingPunctuation) {
    this.hangingPunctuation = hangingPunctuation;
  }

  public ParagraphFormat defaultTabSize(Double defaultTabSize) {
    this.defaultTabSize = defaultTabSize;
    return this;
  }

   /**
   * Returns or sets default tabulation size with no inheritance.
   * @return defaultTabSize
  **/
  @ApiModelProperty(value = "Returns or sets default tabulation size with no inheritance.")
  public Double getDefaultTabSize() {
    return defaultTabSize;
  }

  public void setDefaultTabSize(Double defaultTabSize) {
    this.defaultTabSize = defaultTabSize;
  }

  public ParagraphFormat defaultPortionFormat(PortionFormat defaultPortionFormat) {
    this.defaultPortionFormat = defaultPortionFormat;
    return this;
  }

   /**
   * Default portion format.
   * @return defaultPortionFormat
  **/
  @ApiModelProperty(value = "Default portion format.")
  public PortionFormat getDefaultPortionFormat() {
    return defaultPortionFormat;
  }

  public void setDefaultPortionFormat(PortionFormat defaultPortionFormat) {
    this.defaultPortionFormat = defaultPortionFormat;
  }

  public ParagraphFormat bulletChar(String bulletChar) {
    this.bulletChar = bulletChar;
    return this;
  }

   /**
   * Bullet char.
   * @return bulletChar
  **/
  @ApiModelProperty(value = "Bullet char.")
  public String getBulletChar() {
    return bulletChar;
  }

  public void setBulletChar(String bulletChar) {
    this.bulletChar = bulletChar;
  }

  public ParagraphFormat bulletHeight(Double bulletHeight) {
    this.bulletHeight = bulletHeight;
    return this;
  }

   /**
   * Bullet height.
   * @return bulletHeight
  **/
  @ApiModelProperty(value = "Bullet height.")
  public Double getBulletHeight() {
    return bulletHeight;
  }

  public void setBulletHeight(Double bulletHeight) {
    this.bulletHeight = bulletHeight;
  }

  public ParagraphFormat bulletType(BulletTypeEnum bulletType) {
    this.bulletType = bulletType;
    return this;
  }

   /**
   * Bullet type.
   * @return bulletType
  **/
  @ApiModelProperty(value = "Bullet type.")
  public BulletTypeEnum getBulletType() {
    return bulletType;
  }

  public void setBulletType(BulletTypeEnum bulletType) {
    this.bulletType = bulletType;
  }

  public ParagraphFormat numberedBulletStartWith(Integer numberedBulletStartWith) {
    this.numberedBulletStartWith = numberedBulletStartWith;
    return this;
  }

   /**
   * Starting number for a numbered bullet.
   * @return numberedBulletStartWith
  **/
  @ApiModelProperty(value = "Starting number for a numbered bullet.")
  public Integer getNumberedBulletStartWith() {
    return numberedBulletStartWith;
  }

  public void setNumberedBulletStartWith(Integer numberedBulletStartWith) {
    this.numberedBulletStartWith = numberedBulletStartWith;
  }

  public ParagraphFormat numberedBulletStyle(NumberedBulletStyleEnum numberedBulletStyle) {
    this.numberedBulletStyle = numberedBulletStyle;
    return this;
  }

   /**
   * Numbered bullet style.
   * @return numberedBulletStyle
  **/
  @ApiModelProperty(value = "Numbered bullet style.")
  public NumberedBulletStyleEnum getNumberedBulletStyle() {
    return numberedBulletStyle;
  }

  public void setNumberedBulletStyle(NumberedBulletStyleEnum numberedBulletStyle) {
    this.numberedBulletStyle = numberedBulletStyle;
  }

  public ParagraphFormat bulletFillFormat(FillFormat bulletFillFormat) {
    this.bulletFillFormat = bulletFillFormat;
    return this;
  }

   /**
   * Bullet fill format.
   * @return bulletFillFormat
  **/
  @ApiModelProperty(value = "Bullet fill format.")
  public FillFormat getBulletFillFormat() {
    return bulletFillFormat;
  }

  public void setBulletFillFormat(FillFormat bulletFillFormat) {
    this.bulletFillFormat = bulletFillFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParagraphFormat paragraphFormat = (ParagraphFormat) o;
    return true && Objects.equals(this.depth, paragraphFormat.depth) && Objects.equals(this.alignment, paragraphFormat.alignment) && Objects.equals(this.marginLeft, paragraphFormat.marginLeft) && Objects.equals(this.marginRight, paragraphFormat.marginRight) && Objects.equals(this.spaceBefore, paragraphFormat.spaceBefore) && Objects.equals(this.spaceAfter, paragraphFormat.spaceAfter) && Objects.equals(this.spaceWithin, paragraphFormat.spaceWithin) && Objects.equals(this.fontAlignment, paragraphFormat.fontAlignment) && Objects.equals(this.indent, paragraphFormat.indent) && Objects.equals(this.rightToLeft, paragraphFormat.rightToLeft) && Objects.equals(this.eastAsianLineBreak, paragraphFormat.eastAsianLineBreak) && Objects.equals(this.latinLineBreak, paragraphFormat.latinLineBreak) && Objects.equals(this.hangingPunctuation, paragraphFormat.hangingPunctuation) && Objects.equals(this.defaultTabSize, paragraphFormat.defaultTabSize) && Objects.equals(this.defaultPortionFormat, paragraphFormat.defaultPortionFormat) && Objects.equals(this.bulletChar, paragraphFormat.bulletChar) && Objects.equals(this.bulletHeight, paragraphFormat.bulletHeight) && Objects.equals(this.bulletType, paragraphFormat.bulletType) && Objects.equals(this.numberedBulletStartWith, paragraphFormat.numberedBulletStartWith) && Objects.equals(this.numberedBulletStyle, paragraphFormat.numberedBulletStyle) && Objects.equals(this.bulletFillFormat, paragraphFormat.bulletFillFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depth, alignment, marginLeft, marginRight, spaceBefore, spaceAfter, spaceWithin, fontAlignment, indent, rightToLeft, eastAsianLineBreak, latinLineBreak, hangingPunctuation, defaultTabSize, defaultPortionFormat, bulletChar, bulletHeight, bulletType, numberedBulletStartWith, numberedBulletStyle, bulletFillFormat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParagraphFormat {\n");
    
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    alignment: ").append(toIndentedString(alignment)).append("\n");
    sb.append("    marginLeft: ").append(toIndentedString(marginLeft)).append("\n");
    sb.append("    marginRight: ").append(toIndentedString(marginRight)).append("\n");
    sb.append("    spaceBefore: ").append(toIndentedString(spaceBefore)).append("\n");
    sb.append("    spaceAfter: ").append(toIndentedString(spaceAfter)).append("\n");
    sb.append("    spaceWithin: ").append(toIndentedString(spaceWithin)).append("\n");
    sb.append("    fontAlignment: ").append(toIndentedString(fontAlignment)).append("\n");
    sb.append("    indent: ").append(toIndentedString(indent)).append("\n");
    sb.append("    rightToLeft: ").append(toIndentedString(rightToLeft)).append("\n");
    sb.append("    eastAsianLineBreak: ").append(toIndentedString(eastAsianLineBreak)).append("\n");
    sb.append("    latinLineBreak: ").append(toIndentedString(latinLineBreak)).append("\n");
    sb.append("    hangingPunctuation: ").append(toIndentedString(hangingPunctuation)).append("\n");
    sb.append("    defaultTabSize: ").append(toIndentedString(defaultTabSize)).append("\n");
    sb.append("    defaultPortionFormat: ").append(toIndentedString(defaultPortionFormat)).append("\n");
    sb.append("    bulletChar: ").append(toIndentedString(bulletChar)).append("\n");
    sb.append("    bulletHeight: ").append(toIndentedString(bulletHeight)).append("\n");
    sb.append("    bulletType: ").append(toIndentedString(bulletType)).append("\n");
    sb.append("    numberedBulletStartWith: ").append(toIndentedString(numberedBulletStartWith)).append("\n");
    sb.append("    numberedBulletStyle: ").append(toIndentedString(numberedBulletStyle)).append("\n");
    sb.append("    bulletFillFormat: ").append(toIndentedString(bulletFillFormat)).append("\n");
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
