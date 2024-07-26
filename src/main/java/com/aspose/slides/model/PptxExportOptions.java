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
import com.aspose.slides.model.ExportOptions;
import com.aspose.slides.model.FontFallbackRule;
import com.aspose.slides.model.FontSubstRule;
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
 * Provides options that control how a presentation is saved in PPTX format.
 */
@ApiModel(description = "Provides options that control how a presentation is saved in PPTX format.")
public class PptxExportOptions extends ExportOptions {
  /**
   * The conformance class to which the PresentationML document conforms.
   */
  @JsonAdapter(ConformanceEnum.Adapter.class)
  public enum ConformanceEnum {
    ECMA376("Ecma376"),
    
    ISO29500TRANSITIONAL("Iso29500Transitional"),
    
    ISO29500STRICT("Iso29500Strict");

    private String value;

    ConformanceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConformanceEnum fromValue(String text) {
      for (ConformanceEnum b : ConformanceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ConformanceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConformanceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConformanceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ConformanceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "conformance", alternate = { "Conformance" })
  private ConformanceEnum conformance;

  /**
   * Specifies whether the ZIP64 format is used for the Presentation document. The default value is Zip64Mode.IfNecessary.
   */
  @JsonAdapter(Zip64ModeEnum.Adapter.class)
  public enum Zip64ModeEnum {
    NEVER("Never"),
    
    IFNECESSARY("IfNecessary"),
    
    ALWAYS("Always");

    private String value;

    Zip64ModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static Zip64ModeEnum fromValue(String text) {
      for (Zip64ModeEnum b : Zip64ModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<Zip64ModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final Zip64ModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public Zip64ModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return Zip64ModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "zip64Mode", alternate = { "Zip64Mode" })
  private Zip64ModeEnum zip64Mode;


  public PptxExportOptions() {
    super();
    setFormat("PPTX");
  }

  public PptxExportOptions conformance(ConformanceEnum conformance) {
    this.conformance = conformance;
    return this;
  }

   /**
   * The conformance class to which the PresentationML document conforms.
   * @return conformance
  **/
  @ApiModelProperty(value = "The conformance class to which the PresentationML document conforms.")
  public ConformanceEnum getConformance() {
    return conformance;
  }

  public void setConformance(ConformanceEnum conformance) {
    this.conformance = conformance;
  }

  public PptxExportOptions zip64Mode(Zip64ModeEnum zip64Mode) {
    this.zip64Mode = zip64Mode;
    return this;
  }

   /**
   * Specifies whether the ZIP64 format is used for the Presentation document. The default value is Zip64Mode.IfNecessary.
   * @return zip64Mode
  **/
  @ApiModelProperty(value = "Specifies whether the ZIP64 format is used for the Presentation document. The default value is Zip64Mode.IfNecessary.")
  public Zip64ModeEnum getZip64Mode() {
    return zip64Mode;
  }

  public void setZip64Mode(Zip64ModeEnum zip64Mode) {
    this.zip64Mode = zip64Mode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PptxExportOptions pptxExportOptions = (PptxExportOptions) o;
    return true && Objects.equals(this.conformance, pptxExportOptions.conformance) && Objects.equals(this.zip64Mode, pptxExportOptions.zip64Mode) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conformance, zip64Mode, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PptxExportOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    conformance: ").append(toIndentedString(conformance)).append("\n");
    sb.append("    zip64Mode: ").append(toIndentedString(zip64Mode)).append("\n");
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
