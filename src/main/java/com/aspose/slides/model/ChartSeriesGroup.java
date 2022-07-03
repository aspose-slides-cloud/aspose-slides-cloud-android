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
import com.aspose.slides.model.ChartLinesFormat;
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
 * Chart series group. Defines common properties for a group of series.
 */
@ApiModel(description = "Chart series group. Defines common properties for a group of series.")
public class ChartSeriesGroup {
  /**
   * Returns a type of this series group.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    BAROFPIECHART("BarOfPieChart"),
    
    PIEOFPIECHART("PieOfPieChart"),
    
    DOUGHNUTCHART("DoughnutChart"),
    
    PIECHART("PieChart"),
    
    AREACHARTAREA("AreaChartArea"),
    
    AREACHARTPERCENTSSTACKEDAREA("AreaChartPercentsStackedArea"),
    
    AREACHARTSTACKEDAREA("AreaChartStackedArea"),
    
    BARCHARTHORIZCLUSTERED("BarChartHorizClustered"),
    
    BARCHARTHORIZSTACKED("BarChartHorizStacked"),
    
    BARCHARTHORIZPERCENTSSTACKED("BarChartHorizPercentsStacked"),
    
    BARCHARTVERTCLUSTERED("BarChartVertClustered"),
    
    BARCHARTVERTSTACKED("BarChartVertStacked"),
    
    BARCHARTVERTPERCENTSSTACKED("BarChartVertPercentsStacked"),
    
    LINECHARTLINE("LineChartLine"),
    
    LINECHARTSTACKEDLINE("LineChartStackedLine"),
    
    LINECHARTPERCENTSSTACKEDLINE("LineChartPercentsStackedLine"),
    
    RADARCHART("RadarChart"),
    
    FILLEDRADARCHART("FilledRadarChart"),
    
    STOCKHIGHLOWCLOSE("StockHighLowClose"),
    
    STOCKOPENHIGHLOWCLOSE("StockOpenHighLowClose"),
    
    STOCKVOLUMEHIGHLOWCLOSE("StockVolumeHighLowClose"),
    
    STOCKVOLUMEOPENHIGHLOWCLOSE("StockVolumeOpenHighLowClose"),
    
    SCATTERSTRAIGHTMARKER("ScatterStraightMarker"),
    
    SCATTERSMOOTHMARKER("ScatterSmoothMarker"),
    
    AREACHARTAREA3D("AreaChartArea3D"),
    
    AREACHARTSTACKEDAREA3D("AreaChartStackedArea3D"),
    
    AREACHARTPERCENTSSTACKEDAREA3D("AreaChartPercentsStackedArea3D"),
    
    LINE3DCHART("Line3DChart"),
    
    PIE3DCHART("Pie3DChart"),
    
    BAR3DCHARTVERT("Bar3DChartVert"),
    
    BAR3DCHARTVERTCLUSTERED("Bar3DChartVertClustered"),
    
    BAR3DCHARTVERTPERCENTSSTACKEDCOLUMN3D("Bar3DChartVertPercentsStackedColumn3D"),
    
    BAR3DCHARTVERTPERCENTSSTACKEDCONE("Bar3DChartVertPercentsStackedCone"),
    
    BAR3DCHARTVERTPERCENTSSTACKEDCYLINDER("Bar3DChartVertPercentsStackedCylinder"),
    
    BAR3DCHARTVERTPERCENTSSTACKEDPYRAMID("Bar3DChartVertPercentsStackedPyramid"),
    
    BAR3DCHARTVERTSTACKEDCOLUMN3D("Bar3DChartVertStackedColumn3D"),
    
    BAR3DCHARTVERTSTACKEDCONE("Bar3DChartVertStackedCone"),
    
    BAR3DCHARTVERTSTACKEDCYLINDER("Bar3DChartVertStackedCylinder"),
    
    BAR3DCHARTVERTSTACKEDPYRAMID("Bar3DChartVertStackedPyramid"),
    
    BAR3DCHARTHORIZCLUSTERED("Bar3DChartHorizClustered"),
    
    BAR3DCHARTHORIZSTACKEDBAR3D("Bar3DChartHorizStackedBar3D"),
    
    BAR3DCHARTHORIZSTACKEDCONE("Bar3DChartHorizStackedCone"),
    
    BAR3DCHARTHORIZSTACKEDCYLINDER("Bar3DChartHorizStackedCylinder"),
    
    BAR3DCHARTHORIZSTACKEDPYRAMID("Bar3DChartHorizStackedPyramid"),
    
    BAR3DCHARTHORIZPERCENTSSTACKEDBAR3D("Bar3DChartHorizPercentsStackedBar3D"),
    
    BAR3DCHARTHORIZPERCENTSSTACKEDCONE("Bar3DChartHorizPercentsStackedCone"),
    
    BAR3DCHARTHORIZPERCENTSSTACKEDCYLINDER("Bar3DChartHorizPercentsStackedCylinder"),
    
    BAR3DCHARTHORIZPERCENTSSTACKEDPYRAMID("Bar3DChartHorizPercentsStackedPyramid"),
    
    SURFACECHARTCONTOUR("SurfaceChartContour"),
    
    SURFACECHARTWIREFRAMECONTOUR("SurfaceChartWireframeContour"),
    
    SURFACECHARTSURFACE3D("SurfaceChartSurface3D"),
    
    SURFACECHARTWIREFRAMESURFACE3D("SurfaceChartWireframeSurface3D"),
    
    BUBBLECHART("BubbleChart"),
    
    HISTOGRAMCHART("HistogramChart"),
    
    PARETOLINECHART("ParetoLineChart"),
    
    BOXANDWHISKERCHART("BoxAndWhiskerChart"),
    
    WATERFALLCHART("WaterfallChart"),
    
    FUNNELCHART("FunnelChart"),
    
    TREEMAPCHART("TreemapChart"),
    
    MAPCHART("MapChart"),
    
    SUNBURSTCHART("SunburstChart");

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

  @SerializedName(value = "gapWidth", alternate = { "GapWidth" })
  private Integer gapWidth;

  @SerializedName(value = "gapDepth", alternate = { "GapDepth" })
  private Integer gapDepth;

  @SerializedName(value = "firstSliceAngle", alternate = { "FirstSliceAngle" })
  private Integer firstSliceAngle;

  @SerializedName(value = "isColorVaried", alternate = { "IsColorVaried" })
  private Boolean isColorVaried;

  @SerializedName(value = "hasSeriesLines", alternate = { "HasSeriesLines" })
  private Boolean hasSeriesLines;

  @SerializedName(value = "overlap", alternate = { "Overlap" })
  private Integer overlap;

  @SerializedName(value = "secondPieSize", alternate = { "SecondPieSize" })
  private Integer secondPieSize;

  @SerializedName(value = "pieSplitPosition", alternate = { "PieSplitPosition" })
  private Double pieSplitPosition;

  /**
   * Specifies how to determine which data points are in the second pie or bar  on a pie-of-pie or bar-of-pie chart.
   */
  @JsonAdapter(PieSplitByEnum.Adapter.class)
  public enum PieSplitByEnum {
    DEFAULT("Default"),
    
    CUSTOM("Custom"),
    
    BYPERCENTAGE("ByPercentage"),
    
    BYPOS("ByPos"),
    
    BYVALUE("ByValue");

    private String value;

    PieSplitByEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PieSplitByEnum fromValue(String text) {
      for (PieSplitByEnum b : PieSplitByEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PieSplitByEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PieSplitByEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PieSplitByEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PieSplitByEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "pieSplitBy", alternate = { "PieSplitBy" })
  private PieSplitByEnum pieSplitBy;

  @SerializedName(value = "doughnutHoleSize", alternate = { "DoughnutHoleSize" })
  private Integer doughnutHoleSize;

  @SerializedName(value = "bubbleSizeScale", alternate = { "BubbleSizeScale" })
  private Integer bubbleSizeScale;

  @SerializedName(value = "hiLowLinesFormat", alternate = { "HiLowLinesFormat" })
  private ChartLinesFormat hiLowLinesFormat;

  /**
   * Specifies how the bubble size values are represented on the bubble chart. Read/write BubbleSizeRepresentationType.
   */
  @JsonAdapter(BubbleSizeRepresentationEnum.Adapter.class)
  public enum BubbleSizeRepresentationEnum {
    AREA("Area"),
    
    WIDTH("Width");

    private String value;

    BubbleSizeRepresentationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BubbleSizeRepresentationEnum fromValue(String text) {
      for (BubbleSizeRepresentationEnum b : BubbleSizeRepresentationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BubbleSizeRepresentationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BubbleSizeRepresentationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BubbleSizeRepresentationEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BubbleSizeRepresentationEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "bubbleSizeRepresentation", alternate = { "BubbleSizeRepresentation" })
  private BubbleSizeRepresentationEnum bubbleSizeRepresentation;


  public ChartSeriesGroup() {
    super();
  }

  public ChartSeriesGroup type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Returns a type of this series group.
   * @return type
  **/
  @ApiModelProperty(value = "Returns a type of this series group.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ChartSeriesGroup gapWidth(Integer gapWidth) {
    this.gapWidth = gapWidth;
    return this;
  }

   /**
   * Specifies the space between bar or column clusters, as a percentage of the bar or column width.
   * @return gapWidth
  **/
  @ApiModelProperty(value = "Specifies the space between bar or column clusters, as a percentage of the bar or column width.")
  public Integer getGapWidth() {
    return gapWidth;
  }

  public void setGapWidth(Integer gapWidth) {
    this.gapWidth = gapWidth;
  }

  public ChartSeriesGroup gapDepth(Integer gapDepth) {
    this.gapDepth = gapDepth;
    return this;
  }

   /**
   * Returns or sets the distance, as a percentage of the marker width, between the data series in a 3D chart.
   * @return gapDepth
  **/
  @ApiModelProperty(value = "Returns or sets the distance, as a percentage of the marker width, between the data series in a 3D chart.")
  public Integer getGapDepth() {
    return gapDepth;
  }

  public void setGapDepth(Integer gapDepth) {
    this.gapDepth = gapDepth;
  }

  public ChartSeriesGroup firstSliceAngle(Integer firstSliceAngle) {
    this.firstSliceAngle = firstSliceAngle;
    return this;
  }

   /**
   * Gets or sets the angle of the first pie or doughnut chart slice,  in degrees (clockwise from up, from 0 to 360 degrees).
   * @return firstSliceAngle
  **/
  @ApiModelProperty(value = "Gets or sets the angle of the first pie or doughnut chart slice,  in degrees (clockwise from up, from 0 to 360 degrees).")
  public Integer getFirstSliceAngle() {
    return firstSliceAngle;
  }

  public void setFirstSliceAngle(Integer firstSliceAngle) {
    this.firstSliceAngle = firstSliceAngle;
  }

  public ChartSeriesGroup isColorVaried(Boolean isColorVaried) {
    this.isColorVaried = isColorVaried;
    return this;
  }

   /**
   * Specifies that each data marker in the series has a different color.
   * @return isColorVaried
  **/
  @ApiModelProperty(value = "Specifies that each data marker in the series has a different color.")
  public Boolean isIsColorVaried() {
    return isColorVaried;
  }

  public void setIsColorVaried(Boolean isColorVaried) {
    this.isColorVaried = isColorVaried;
  }

  public ChartSeriesGroup hasSeriesLines(Boolean hasSeriesLines) {
    this.hasSeriesLines = hasSeriesLines;
    return this;
  }

   /**
   * True if chart has series lines. Applied to stacked bar and OfPie charts.
   * @return hasSeriesLines
  **/
  @ApiModelProperty(value = "True if chart has series lines. Applied to stacked bar and OfPie charts.")
  public Boolean isHasSeriesLines() {
    return hasSeriesLines;
  }

  public void setHasSeriesLines(Boolean hasSeriesLines) {
    this.hasSeriesLines = hasSeriesLines;
  }

  public ChartSeriesGroup overlap(Integer overlap) {
    this.overlap = overlap;
    return this;
  }

   /**
   * Specifies how much bars and columns shall overlap on 2-D charts (from -100 to 100).
   * @return overlap
  **/
  @ApiModelProperty(value = "Specifies how much bars and columns shall overlap on 2-D charts (from -100 to 100).")
  public Integer getOverlap() {
    return overlap;
  }

  public void setOverlap(Integer overlap) {
    this.overlap = overlap;
  }

  public ChartSeriesGroup secondPieSize(Integer secondPieSize) {
    this.secondPieSize = secondPieSize;
    return this;
  }

   /**
   * Specifies the size of the second pie or bar of a pie-of-pie chart or  a bar-of-pie chart, as a percentage of the size of the first pie (can  be between 5 and 200 percents).
   * @return secondPieSize
  **/
  @ApiModelProperty(value = "Specifies the size of the second pie or bar of a pie-of-pie chart or  a bar-of-pie chart, as a percentage of the size of the first pie (can  be between 5 and 200 percents).")
  public Integer getSecondPieSize() {
    return secondPieSize;
  }

  public void setSecondPieSize(Integer secondPieSize) {
    this.secondPieSize = secondPieSize;
  }

  public ChartSeriesGroup pieSplitPosition(Double pieSplitPosition) {
    this.pieSplitPosition = pieSplitPosition;
    return this;
  }

   /**
   * Specifies a value that shall be used to determine which data points  are in the second pie or bar on a pie-of-pie or bar-of-pie chart.  Is used together with PieSplitBy property.
   * @return pieSplitPosition
  **/
  @ApiModelProperty(value = "Specifies a value that shall be used to determine which data points  are in the second pie or bar on a pie-of-pie or bar-of-pie chart.  Is used together with PieSplitBy property.")
  public Double getPieSplitPosition() {
    return pieSplitPosition;
  }

  public void setPieSplitPosition(Double pieSplitPosition) {
    this.pieSplitPosition = pieSplitPosition;
  }

  public ChartSeriesGroup pieSplitBy(PieSplitByEnum pieSplitBy) {
    this.pieSplitBy = pieSplitBy;
    return this;
  }

   /**
   * Specifies how to determine which data points are in the second pie or bar  on a pie-of-pie or bar-of-pie chart.
   * @return pieSplitBy
  **/
  @ApiModelProperty(value = "Specifies how to determine which data points are in the second pie or bar  on a pie-of-pie or bar-of-pie chart.")
  public PieSplitByEnum getPieSplitBy() {
    return pieSplitBy;
  }

  public void setPieSplitBy(PieSplitByEnum pieSplitBy) {
    this.pieSplitBy = pieSplitBy;
  }

  public ChartSeriesGroup doughnutHoleSize(Integer doughnutHoleSize) {
    this.doughnutHoleSize = doughnutHoleSize;
    return this;
  }

   /**
   * Specifies the size of the hole in a doughnut chart (can be between 10 and 90 percents  of the size of the plot area.).
   * @return doughnutHoleSize
  **/
  @ApiModelProperty(value = "Specifies the size of the hole in a doughnut chart (can be between 10 and 90 percents  of the size of the plot area.).")
  public Integer getDoughnutHoleSize() {
    return doughnutHoleSize;
  }

  public void setDoughnutHoleSize(Integer doughnutHoleSize) {
    this.doughnutHoleSize = doughnutHoleSize;
  }

  public ChartSeriesGroup bubbleSizeScale(Integer bubbleSizeScale) {
    this.bubbleSizeScale = bubbleSizeScale;
    return this;
  }

   /**
   * Specifies the scale factor for the bubble chart (can be  between 0 and 300 percents of the default size). Read/write Int32.
   * @return bubbleSizeScale
  **/
  @ApiModelProperty(value = "Specifies the scale factor for the bubble chart (can be  between 0 and 300 percents of the default size). Read/write Int32.")
  public Integer getBubbleSizeScale() {
    return bubbleSizeScale;
  }

  public void setBubbleSizeScale(Integer bubbleSizeScale) {
    this.bubbleSizeScale = bubbleSizeScale;
  }

  public ChartSeriesGroup hiLowLinesFormat(ChartLinesFormat hiLowLinesFormat) {
    this.hiLowLinesFormat = hiLowLinesFormat;
    return this;
  }

   /**
   * Specifies HiLowLines format.  HiLowLines applied with HiLowClose, OpenHiLowClose, VolumeHiLowClose and VolumeOpenHiLowClose chart types.
   * @return hiLowLinesFormat
  **/
  @ApiModelProperty(value = "Specifies HiLowLines format.  HiLowLines applied with HiLowClose, OpenHiLowClose, VolumeHiLowClose and VolumeOpenHiLowClose chart types.")
  public ChartLinesFormat getHiLowLinesFormat() {
    return hiLowLinesFormat;
  }

  public void setHiLowLinesFormat(ChartLinesFormat hiLowLinesFormat) {
    this.hiLowLinesFormat = hiLowLinesFormat;
  }

  public ChartSeriesGroup bubbleSizeRepresentation(BubbleSizeRepresentationEnum bubbleSizeRepresentation) {
    this.bubbleSizeRepresentation = bubbleSizeRepresentation;
    return this;
  }

   /**
   * Specifies how the bubble size values are represented on the bubble chart. Read/write BubbleSizeRepresentationType.
   * @return bubbleSizeRepresentation
  **/
  @ApiModelProperty(value = "Specifies how the bubble size values are represented on the bubble chart. Read/write BubbleSizeRepresentationType.")
  public BubbleSizeRepresentationEnum getBubbleSizeRepresentation() {
    return bubbleSizeRepresentation;
  }

  public void setBubbleSizeRepresentation(BubbleSizeRepresentationEnum bubbleSizeRepresentation) {
    this.bubbleSizeRepresentation = bubbleSizeRepresentation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChartSeriesGroup chartSeriesGroup = (ChartSeriesGroup) o;
    return true && Objects.equals(this.type, chartSeriesGroup.type) && Objects.equals(this.gapWidth, chartSeriesGroup.gapWidth) && Objects.equals(this.gapDepth, chartSeriesGroup.gapDepth) && Objects.equals(this.firstSliceAngle, chartSeriesGroup.firstSliceAngle) && Objects.equals(this.isColorVaried, chartSeriesGroup.isColorVaried) && Objects.equals(this.hasSeriesLines, chartSeriesGroup.hasSeriesLines) && Objects.equals(this.overlap, chartSeriesGroup.overlap) && Objects.equals(this.secondPieSize, chartSeriesGroup.secondPieSize) && Objects.equals(this.pieSplitPosition, chartSeriesGroup.pieSplitPosition) && Objects.equals(this.pieSplitBy, chartSeriesGroup.pieSplitBy) && Objects.equals(this.doughnutHoleSize, chartSeriesGroup.doughnutHoleSize) && Objects.equals(this.bubbleSizeScale, chartSeriesGroup.bubbleSizeScale) && Objects.equals(this.hiLowLinesFormat, chartSeriesGroup.hiLowLinesFormat) && Objects.equals(this.bubbleSizeRepresentation, chartSeriesGroup.bubbleSizeRepresentation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, gapWidth, gapDepth, firstSliceAngle, isColorVaried, hasSeriesLines, overlap, secondPieSize, pieSplitPosition, pieSplitBy, doughnutHoleSize, bubbleSizeScale, hiLowLinesFormat, bubbleSizeRepresentation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartSeriesGroup {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    gapWidth: ").append(toIndentedString(gapWidth)).append("\n");
    sb.append("    gapDepth: ").append(toIndentedString(gapDepth)).append("\n");
    sb.append("    firstSliceAngle: ").append(toIndentedString(firstSliceAngle)).append("\n");
    sb.append("    isColorVaried: ").append(toIndentedString(isColorVaried)).append("\n");
    sb.append("    hasSeriesLines: ").append(toIndentedString(hasSeriesLines)).append("\n");
    sb.append("    overlap: ").append(toIndentedString(overlap)).append("\n");
    sb.append("    secondPieSize: ").append(toIndentedString(secondPieSize)).append("\n");
    sb.append("    pieSplitPosition: ").append(toIndentedString(pieSplitPosition)).append("\n");
    sb.append("    pieSplitBy: ").append(toIndentedString(pieSplitBy)).append("\n");
    sb.append("    doughnutHoleSize: ").append(toIndentedString(doughnutHoleSize)).append("\n");
    sb.append("    bubbleSizeScale: ").append(toIndentedString(bubbleSizeScale)).append("\n");
    sb.append("    hiLowLinesFormat: ").append(toIndentedString(hiLowLinesFormat)).append("\n");
    sb.append("    bubbleSizeRepresentation: ").append(toIndentedString(bubbleSizeRepresentation)).append("\n");
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
