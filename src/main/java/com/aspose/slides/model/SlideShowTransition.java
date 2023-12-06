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
 * Slide Show Transition.
 */
@ApiModel(description = "Slide Show Transition.")
public class SlideShowTransition {
  /**
   * Transition Type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    NONE("None"),
    
    BLINDS("Blinds"),
    
    CHECKER("Checker"),
    
    CIRCLE("Circle"),
    
    COMB("Comb"),
    
    COVER("Cover"),
    
    CUT("Cut"),
    
    DIAMOND("Diamond"),
    
    DISSOLVE("Dissolve"),
    
    FADE("Fade"),
    
    NEWSFLASH("Newsflash"),
    
    PLUS("Plus"),
    
    PULL("Pull"),
    
    PUSH("Push"),
    
    RANDOM("Random"),
    
    RANDOMBAR("RandomBar"),
    
    SPLIT("Split"),
    
    STRIPS("Strips"),
    
    WEDGE("Wedge"),
    
    WHEEL("Wheel"),
    
    WIPE("Wipe"),
    
    ZOOM("Zoom"),
    
    VORTEX("Vortex"),
    
    SWITCH("Switch"),
    
    FLIP("Flip"),
    
    RIPPLE("Ripple"),
    
    HONEYCOMB("Honeycomb"),
    
    CUBE("Cube"),
    
    BOX("Box"),
    
    ROTATE("Rotate"),
    
    ORBIT("Orbit"),
    
    DOORS("Doors"),
    
    WINDOW("Window"),
    
    FERRIS("Ferris"),
    
    GALLERY("Gallery"),
    
    CONVEYOR("Conveyor"),
    
    PAN("Pan"),
    
    GLITTER("Glitter"),
    
    WARP("Warp"),
    
    FLYTHROUGH("Flythrough"),
    
    FLASH("Flash"),
    
    SHRED("Shred"),
    
    REVEAL("Reveal"),
    
    WHEELREVERSE("WheelReverse"),
    
    FALLOVER("FallOver"),
    
    DRAPE("Drape"),
    
    CURTAINS("Curtains"),
    
    WIND("Wind"),
    
    PRESTIGE("Prestige"),
    
    FRACTURE("Fracture"),
    
    CRUSH("Crush"),
    
    PEELOFF("PeelOff"),
    
    PAGECURLDOUBLE("PageCurlDouble"),
    
    PAGECURLSINGLE("PageCurlSingle"),
    
    AIRPLANE("Airplane"),
    
    ORIGAMI("Origami"),
    
    MORPH("Morph");

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

  @SerializedName(value = "advanceAfter", alternate = { "AdvanceAfter" })
  private Boolean advanceAfter;

  @SerializedName(value = "advanceAfterTime", alternate = { "AdvanceAfterTime" })
  private Integer advanceAfterTime;

  @SerializedName(value = "advanceOnClick", alternate = { "AdvanceOnClick" })
  private Boolean advanceOnClick;

  @SerializedName(value = "soundIsBuiltIn", alternate = { "SoundIsBuiltIn" })
  private Boolean soundIsBuiltIn;

  @SerializedName(value = "soundLoop", alternate = { "SoundLoop" })
  private Boolean soundLoop;

  /**
   * Sound Mode
   */
  @JsonAdapter(SoundModeEnum.Adapter.class)
  public enum SoundModeEnum {
    STARTSOUND("StartSound"),
    
    STOPPREVOIUSSOUND("StopPrevoiusSound"),
    
    NOTDEFINED("NotDefined");

    private String value;

    SoundModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SoundModeEnum fromValue(String text) {
      for (SoundModeEnum b : SoundModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SoundModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SoundModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SoundModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SoundModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "soundMode", alternate = { "SoundMode" })
  private SoundModeEnum soundMode;

  @SerializedName(value = "soundName", alternate = { "SoundName" })
  private String soundName;

  /**
   * Speed
   */
  @JsonAdapter(SpeedEnum.Adapter.class)
  public enum SpeedEnum {
    FAST("Fast"),
    
    MEDIUM("Medium"),
    
    SLOW("Slow");

    private String value;

    SpeedEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SpeedEnum fromValue(String text) {
      for (SpeedEnum b : SpeedEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SpeedEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SpeedEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SpeedEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SpeedEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "speed", alternate = { "Speed" })
  private SpeedEnum speed;

  /**
   * Corner Direction.
   */
  @JsonAdapter(CornerDirectionEnum.Adapter.class)
  public enum CornerDirectionEnum {
    LEFTDOWN("LeftDown"),
    
    LEFTUP("LeftUp"),
    
    RIGHTDOWN("RightDown"),
    
    RIGHTUP("RightUp");

    private String value;

    CornerDirectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CornerDirectionEnum fromValue(String text) {
      for (CornerDirectionEnum b : CornerDirectionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CornerDirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CornerDirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CornerDirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CornerDirectionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "cornerDirection", alternate = { "CornerDirection" })
  private CornerDirectionEnum cornerDirection;

  /**
   * Eight Direction.
   */
  @JsonAdapter(EightDirectionEnum.Adapter.class)
  public enum EightDirectionEnum {
    LEFTDOWN("LeftDown"),
    
    LEFTUP("LeftUp"),
    
    RIGHTDOWN("RightDown"),
    
    RIGHTUP("RightUp"),
    
    LEFT("Left"),
    
    UP("Up"),
    
    DOWN("Down"),
    
    RIGHT("Right");

    private String value;

    EightDirectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EightDirectionEnum fromValue(String text) {
      for (EightDirectionEnum b : EightDirectionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EightDirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EightDirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EightDirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EightDirectionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "eightDirection", alternate = { "EightDirection" })
  private EightDirectionEnum eightDirection;

  /**
   * In/Out Direction.
   */
  @JsonAdapter(InOutDirectionEnum.Adapter.class)
  public enum InOutDirectionEnum {
    IN("In"),
    
    OUT("Out");

    private String value;

    InOutDirectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InOutDirectionEnum fromValue(String text) {
      for (InOutDirectionEnum b : InOutDirectionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<InOutDirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InOutDirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InOutDirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return InOutDirectionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "inOutDirection", alternate = { "InOutDirection" })
  private InOutDirectionEnum inOutDirection;

  @SerializedName(value = "hasBounce", alternate = { "HasBounce" })
  private Boolean hasBounce;

  /**
   * Side Direction.
   */
  @JsonAdapter(SideDirectionEnum.Adapter.class)
  public enum SideDirectionEnum {
    LEFT("Left"),
    
    UP("Up"),
    
    DOWN("Down"),
    
    RIGHT("Right");

    private String value;

    SideDirectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SideDirectionEnum fromValue(String text) {
      for (SideDirectionEnum b : SideDirectionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SideDirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SideDirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SideDirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SideDirectionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "sideDirection", alternate = { "SideDirection" })
  private SideDirectionEnum sideDirection;

  /**
   * Pattern.
   */
  @JsonAdapter(PatternEnum.Adapter.class)
  public enum PatternEnum {
    DIAMOND("Diamond"),
    
    HEXAGON("Hexagon");

    private String value;

    PatternEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PatternEnum fromValue(String text) {
      for (PatternEnum b : PatternEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PatternEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PatternEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PatternEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PatternEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "pattern", alternate = { "Pattern" })
  private PatternEnum pattern;

  /**
   * Left/Right Direction.
   */
  @JsonAdapter(LeftRightDirectionEnum.Adapter.class)
  public enum LeftRightDirectionEnum {
    LEFT("Left"),
    
    RIGHT("Right");

    private String value;

    LeftRightDirectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LeftRightDirectionEnum fromValue(String text) {
      for (LeftRightDirectionEnum b : LeftRightDirectionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LeftRightDirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LeftRightDirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LeftRightDirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LeftRightDirectionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "leftRightDirection", alternate = { "LeftRightDirection" })
  private LeftRightDirectionEnum leftRightDirection;

  /**
   * Morph Type.
   */
  @JsonAdapter(MorphTypeEnum.Adapter.class)
  public enum MorphTypeEnum {
    BYOBJECT("ByObject"),
    
    BYWORD("ByWord"),
    
    BYCHAR("ByChar");

    private String value;

    MorphTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MorphTypeEnum fromValue(String text) {
      for (MorphTypeEnum b : MorphTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MorphTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MorphTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MorphTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MorphTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "morphType", alternate = { "MorphType" })
  private MorphTypeEnum morphType;

  @SerializedName(value = "fromBlack", alternate = { "FromBlack" })
  private Boolean fromBlack;

  /**
   * Orientation Direction.
   */
  @JsonAdapter(OrientationDirectionEnum.Adapter.class)
  public enum OrientationDirectionEnum {
    HORIZONTAL("Horizontal"),
    
    VERTICAL("Vertical");

    private String value;

    OrientationDirectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OrientationDirectionEnum fromValue(String text) {
      for (OrientationDirectionEnum b : OrientationDirectionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OrientationDirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OrientationDirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OrientationDirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OrientationDirectionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "orientationDirection", alternate = { "OrientationDirection" })
  private OrientationDirectionEnum orientationDirection;

  @SerializedName(value = "throughBlack", alternate = { "ThroughBlack" })
  private Boolean throughBlack;

  /**
   * Orientation.
   */
  @JsonAdapter(CornerAndCenterDirectionEnum.Adapter.class)
  public enum CornerAndCenterDirectionEnum {
    LEFTDOWN("LeftDown"),
    
    LEFTUP("LeftUp"),
    
    RIGHTDOWN("RightDown"),
    
    RIGHTUP("RightUp"),
    
    CENTER("Center");

    private String value;

    CornerAndCenterDirectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CornerAndCenterDirectionEnum fromValue(String text) {
      for (CornerAndCenterDirectionEnum b : CornerAndCenterDirectionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CornerAndCenterDirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CornerAndCenterDirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CornerAndCenterDirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CornerAndCenterDirectionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "cornerAndCenterDirection", alternate = { "CornerAndCenterDirection" })
  private CornerAndCenterDirectionEnum cornerAndCenterDirection;

  /**
   * Shred Pattern.
   */
  @JsonAdapter(ShredPatternEnum.Adapter.class)
  public enum ShredPatternEnum {
    STRIP("Strip"),
    
    RECTANGLE("Rectangle");

    private String value;

    ShredPatternEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ShredPatternEnum fromValue(String text) {
      for (ShredPatternEnum b : ShredPatternEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ShredPatternEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ShredPatternEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ShredPatternEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ShredPatternEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "shredPattern", alternate = { "ShredPattern" })
  private ShredPatternEnum shredPattern;

  /**
   * Orientation.
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

  @SerializedName(value = "spokes", alternate = { "Spokes" })
  private Integer spokes;


  public SlideShowTransition() {
    super();
  }

  public SlideShowTransition type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Transition Type
   * @return type
  **/
  @ApiModelProperty(value = "Transition Type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public SlideShowTransition advanceAfter(Boolean advanceAfter) {
    this.advanceAfter = advanceAfter;
    return this;
  }

   /**
   * Advance After
   * @return advanceAfter
  **/
  @ApiModelProperty(value = "Advance After")
  public Boolean isAdvanceAfter() {
    return advanceAfter;
  }

  public void setAdvanceAfter(Boolean advanceAfter) {
    this.advanceAfter = advanceAfter;
  }

  public SlideShowTransition advanceAfterTime(Integer advanceAfterTime) {
    this.advanceAfterTime = advanceAfterTime;
    return this;
  }

   /**
   * Advance After Time
   * @return advanceAfterTime
  **/
  @ApiModelProperty(value = "Advance After Time")
  public Integer getAdvanceAfterTime() {
    return advanceAfterTime;
  }

  public void setAdvanceAfterTime(Integer advanceAfterTime) {
    this.advanceAfterTime = advanceAfterTime;
  }

  public SlideShowTransition advanceOnClick(Boolean advanceOnClick) {
    this.advanceOnClick = advanceOnClick;
    return this;
  }

   /**
   * Advance On Click
   * @return advanceOnClick
  **/
  @ApiModelProperty(value = "Advance On Click")
  public Boolean isAdvanceOnClick() {
    return advanceOnClick;
  }

  public void setAdvanceOnClick(Boolean advanceOnClick) {
    this.advanceOnClick = advanceOnClick;
  }

  public SlideShowTransition soundIsBuiltIn(Boolean soundIsBuiltIn) {
    this.soundIsBuiltIn = soundIsBuiltIn;
    return this;
  }

   /**
   * Sound Is Built In
   * @return soundIsBuiltIn
  **/
  @ApiModelProperty(value = "Sound Is Built In")
  public Boolean isSoundIsBuiltIn() {
    return soundIsBuiltIn;
  }

  public void setSoundIsBuiltIn(Boolean soundIsBuiltIn) {
    this.soundIsBuiltIn = soundIsBuiltIn;
  }

  public SlideShowTransition soundLoop(Boolean soundLoop) {
    this.soundLoop = soundLoop;
    return this;
  }

   /**
   * Sound Loop
   * @return soundLoop
  **/
  @ApiModelProperty(value = "Sound Loop")
  public Boolean isSoundLoop() {
    return soundLoop;
  }

  public void setSoundLoop(Boolean soundLoop) {
    this.soundLoop = soundLoop;
  }

  public SlideShowTransition soundMode(SoundModeEnum soundMode) {
    this.soundMode = soundMode;
    return this;
  }

   /**
   * Sound Mode
   * @return soundMode
  **/
  @ApiModelProperty(value = "Sound Mode")
  public SoundModeEnum getSoundMode() {
    return soundMode;
  }

  public void setSoundMode(SoundModeEnum soundMode) {
    this.soundMode = soundMode;
  }

  public SlideShowTransition soundName(String soundName) {
    this.soundName = soundName;
    return this;
  }

   /**
   * Sound Name
   * @return soundName
  **/
  @ApiModelProperty(value = "Sound Name")
  public String getSoundName() {
    return soundName;
  }

  public void setSoundName(String soundName) {
    this.soundName = soundName;
  }

  public SlideShowTransition speed(SpeedEnum speed) {
    this.speed = speed;
    return this;
  }

   /**
   * Speed
   * @return speed
  **/
  @ApiModelProperty(value = "Speed")
  public SpeedEnum getSpeed() {
    return speed;
  }

  public void setSpeed(SpeedEnum speed) {
    this.speed = speed;
  }

  public SlideShowTransition cornerDirection(CornerDirectionEnum cornerDirection) {
    this.cornerDirection = cornerDirection;
    return this;
  }

   /**
   * Corner Direction.
   * @return cornerDirection
  **/
  @ApiModelProperty(value = "Corner Direction.")
  public CornerDirectionEnum getCornerDirection() {
    return cornerDirection;
  }

  public void setCornerDirection(CornerDirectionEnum cornerDirection) {
    this.cornerDirection = cornerDirection;
  }

  public SlideShowTransition eightDirection(EightDirectionEnum eightDirection) {
    this.eightDirection = eightDirection;
    return this;
  }

   /**
   * Eight Direction.
   * @return eightDirection
  **/
  @ApiModelProperty(value = "Eight Direction.")
  public EightDirectionEnum getEightDirection() {
    return eightDirection;
  }

  public void setEightDirection(EightDirectionEnum eightDirection) {
    this.eightDirection = eightDirection;
  }

  public SlideShowTransition inOutDirection(InOutDirectionEnum inOutDirection) {
    this.inOutDirection = inOutDirection;
    return this;
  }

   /**
   * In/Out Direction.
   * @return inOutDirection
  **/
  @ApiModelProperty(value = "In/Out Direction.")
  public InOutDirectionEnum getInOutDirection() {
    return inOutDirection;
  }

  public void setInOutDirection(InOutDirectionEnum inOutDirection) {
    this.inOutDirection = inOutDirection;
  }

  public SlideShowTransition hasBounce(Boolean hasBounce) {
    this.hasBounce = hasBounce;
    return this;
  }

   /**
   * Has Bounce.
   * @return hasBounce
  **/
  @ApiModelProperty(value = "Has Bounce.")
  public Boolean isHasBounce() {
    return hasBounce;
  }

  public void setHasBounce(Boolean hasBounce) {
    this.hasBounce = hasBounce;
  }

  public SlideShowTransition sideDirection(SideDirectionEnum sideDirection) {
    this.sideDirection = sideDirection;
    return this;
  }

   /**
   * Side Direction.
   * @return sideDirection
  **/
  @ApiModelProperty(value = "Side Direction.")
  public SideDirectionEnum getSideDirection() {
    return sideDirection;
  }

  public void setSideDirection(SideDirectionEnum sideDirection) {
    this.sideDirection = sideDirection;
  }

  public SlideShowTransition pattern(PatternEnum pattern) {
    this.pattern = pattern;
    return this;
  }

   /**
   * Pattern.
   * @return pattern
  **/
  @ApiModelProperty(value = "Pattern.")
  public PatternEnum getPattern() {
    return pattern;
  }

  public void setPattern(PatternEnum pattern) {
    this.pattern = pattern;
  }

  public SlideShowTransition leftRightDirection(LeftRightDirectionEnum leftRightDirection) {
    this.leftRightDirection = leftRightDirection;
    return this;
  }

   /**
   * Left/Right Direction.
   * @return leftRightDirection
  **/
  @ApiModelProperty(value = "Left/Right Direction.")
  public LeftRightDirectionEnum getLeftRightDirection() {
    return leftRightDirection;
  }

  public void setLeftRightDirection(LeftRightDirectionEnum leftRightDirection) {
    this.leftRightDirection = leftRightDirection;
  }

  public SlideShowTransition morphType(MorphTypeEnum morphType) {
    this.morphType = morphType;
    return this;
  }

   /**
   * Morph Type.
   * @return morphType
  **/
  @ApiModelProperty(value = "Morph Type.")
  public MorphTypeEnum getMorphType() {
    return morphType;
  }

  public void setMorphType(MorphTypeEnum morphType) {
    this.morphType = morphType;
  }

  public SlideShowTransition fromBlack(Boolean fromBlack) {
    this.fromBlack = fromBlack;
    return this;
  }

   /**
   * From Black.
   * @return fromBlack
  **/
  @ApiModelProperty(value = "From Black.")
  public Boolean isFromBlack() {
    return fromBlack;
  }

  public void setFromBlack(Boolean fromBlack) {
    this.fromBlack = fromBlack;
  }

  public SlideShowTransition orientationDirection(OrientationDirectionEnum orientationDirection) {
    this.orientationDirection = orientationDirection;
    return this;
  }

   /**
   * Orientation Direction.
   * @return orientationDirection
  **/
  @ApiModelProperty(value = "Orientation Direction.")
  public OrientationDirectionEnum getOrientationDirection() {
    return orientationDirection;
  }

  public void setOrientationDirection(OrientationDirectionEnum orientationDirection) {
    this.orientationDirection = orientationDirection;
  }

  public SlideShowTransition throughBlack(Boolean throughBlack) {
    this.throughBlack = throughBlack;
    return this;
  }

   /**
   * Through Black.
   * @return throughBlack
  **/
  @ApiModelProperty(value = "Through Black.")
  public Boolean isThroughBlack() {
    return throughBlack;
  }

  public void setThroughBlack(Boolean throughBlack) {
    this.throughBlack = throughBlack;
  }

  public SlideShowTransition cornerAndCenterDirection(CornerAndCenterDirectionEnum cornerAndCenterDirection) {
    this.cornerAndCenterDirection = cornerAndCenterDirection;
    return this;
  }

   /**
   * Orientation.
   * @return cornerAndCenterDirection
  **/
  @ApiModelProperty(value = "Orientation.")
  public CornerAndCenterDirectionEnum getCornerAndCenterDirection() {
    return cornerAndCenterDirection;
  }

  public void setCornerAndCenterDirection(CornerAndCenterDirectionEnum cornerAndCenterDirection) {
    this.cornerAndCenterDirection = cornerAndCenterDirection;
  }

  public SlideShowTransition shredPattern(ShredPatternEnum shredPattern) {
    this.shredPattern = shredPattern;
    return this;
  }

   /**
   * Shred Pattern.
   * @return shredPattern
  **/
  @ApiModelProperty(value = "Shred Pattern.")
  public ShredPatternEnum getShredPattern() {
    return shredPattern;
  }

  public void setShredPattern(ShredPatternEnum shredPattern) {
    this.shredPattern = shredPattern;
  }

  public SlideShowTransition orientation(OrientationEnum orientation) {
    this.orientation = orientation;
    return this;
  }

   /**
   * Orientation.
   * @return orientation
  **/
  @ApiModelProperty(value = "Orientation.")
  public OrientationEnum getOrientation() {
    return orientation;
  }

  public void setOrientation(OrientationEnum orientation) {
    this.orientation = orientation;
  }

  public SlideShowTransition spokes(Integer spokes) {
    this.spokes = spokes;
    return this;
  }

   /**
   * Spokes.
   * @return spokes
  **/
  @ApiModelProperty(value = "Spokes.")
  public Integer getSpokes() {
    return spokes;
  }

  public void setSpokes(Integer spokes) {
    this.spokes = spokes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SlideShowTransition slideShowTransition = (SlideShowTransition) o;
    return true && Objects.equals(this.type, slideShowTransition.type) && Objects.equals(this.advanceAfter, slideShowTransition.advanceAfter) && Objects.equals(this.advanceAfterTime, slideShowTransition.advanceAfterTime) && Objects.equals(this.advanceOnClick, slideShowTransition.advanceOnClick) && Objects.equals(this.soundIsBuiltIn, slideShowTransition.soundIsBuiltIn) && Objects.equals(this.soundLoop, slideShowTransition.soundLoop) && Objects.equals(this.soundMode, slideShowTransition.soundMode) && Objects.equals(this.soundName, slideShowTransition.soundName) && Objects.equals(this.speed, slideShowTransition.speed) && Objects.equals(this.cornerDirection, slideShowTransition.cornerDirection) && Objects.equals(this.eightDirection, slideShowTransition.eightDirection) && Objects.equals(this.inOutDirection, slideShowTransition.inOutDirection) && Objects.equals(this.hasBounce, slideShowTransition.hasBounce) && Objects.equals(this.sideDirection, slideShowTransition.sideDirection) && Objects.equals(this.pattern, slideShowTransition.pattern) && Objects.equals(this.leftRightDirection, slideShowTransition.leftRightDirection) && Objects.equals(this.morphType, slideShowTransition.morphType) && Objects.equals(this.fromBlack, slideShowTransition.fromBlack) && Objects.equals(this.orientationDirection, slideShowTransition.orientationDirection) && Objects.equals(this.throughBlack, slideShowTransition.throughBlack) && Objects.equals(this.cornerAndCenterDirection, slideShowTransition.cornerAndCenterDirection) && Objects.equals(this.shredPattern, slideShowTransition.shredPattern) && Objects.equals(this.orientation, slideShowTransition.orientation) && Objects.equals(this.spokes, slideShowTransition.spokes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, advanceAfter, advanceAfterTime, advanceOnClick, soundIsBuiltIn, soundLoop, soundMode, soundName, speed, cornerDirection, eightDirection, inOutDirection, hasBounce, sideDirection, pattern, leftRightDirection, morphType, fromBlack, orientationDirection, throughBlack, cornerAndCenterDirection, shredPattern, orientation, spokes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlideShowTransition {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    advanceAfter: ").append(toIndentedString(advanceAfter)).append("\n");
    sb.append("    advanceAfterTime: ").append(toIndentedString(advanceAfterTime)).append("\n");
    sb.append("    advanceOnClick: ").append(toIndentedString(advanceOnClick)).append("\n");
    sb.append("    soundIsBuiltIn: ").append(toIndentedString(soundIsBuiltIn)).append("\n");
    sb.append("    soundLoop: ").append(toIndentedString(soundLoop)).append("\n");
    sb.append("    soundMode: ").append(toIndentedString(soundMode)).append("\n");
    sb.append("    soundName: ").append(toIndentedString(soundName)).append("\n");
    sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
    sb.append("    cornerDirection: ").append(toIndentedString(cornerDirection)).append("\n");
    sb.append("    eightDirection: ").append(toIndentedString(eightDirection)).append("\n");
    sb.append("    inOutDirection: ").append(toIndentedString(inOutDirection)).append("\n");
    sb.append("    hasBounce: ").append(toIndentedString(hasBounce)).append("\n");
    sb.append("    sideDirection: ").append(toIndentedString(sideDirection)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    leftRightDirection: ").append(toIndentedString(leftRightDirection)).append("\n");
    sb.append("    morphType: ").append(toIndentedString(morphType)).append("\n");
    sb.append("    fromBlack: ").append(toIndentedString(fromBlack)).append("\n");
    sb.append("    orientationDirection: ").append(toIndentedString(orientationDirection)).append("\n");
    sb.append("    throughBlack: ").append(toIndentedString(throughBlack)).append("\n");
    sb.append("    cornerAndCenterDirection: ").append(toIndentedString(cornerAndCenterDirection)).append("\n");
    sb.append("    shredPattern: ").append(toIndentedString(shredPattern)).append("\n");
    sb.append("    orientation: ").append(toIndentedString(orientation)).append("\n");
    sb.append("    spokes: ").append(toIndentedString(spokes)).append("\n");
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
