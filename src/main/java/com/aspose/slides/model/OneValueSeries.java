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
import com.aspose.slides.model.DataSource;
import com.aspose.slides.model.EffectFormat;
import com.aspose.slides.model.FillFormat;
import com.aspose.slides.model.LineFormat;
import com.aspose.slides.model.OneValueChartDataPoint;
import com.aspose.slides.model.Series;
import com.aspose.slides.model.SeriesMarker;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

/**
 * One value series.
 */
@ApiModel(description = "One value series.")
public class OneValueSeries extends Series {
  @SerializedName(value = "dataPoints", alternate = { "DataPoints" })
  private List<OneValueChartDataPoint> dataPoints = null;

  @SerializedName(value = "numberFormatOfValues", alternate = { "NumberFormatOfValues" })
  private String numberFormatOfValues;

  @SerializedName(value = "dataSourceForValues", alternate = { "DataSourceForValues" })
  private DataSource dataSourceForValues;

  @SerializedName(value = "showConnectorLines", alternate = { "ShowConnectorLines" })
  private Boolean showConnectorLines;

  /**
   * Quartile method. Applied to BoxAndWhisker series only.
   */
  @JsonAdapter(QuartileMethodEnum.Adapter.class)
  public enum QuartileMethodEnum {
    EXCLUSIVE("Exclusive"),
    
    INCLUSIVE("Inclusive");

    private String value;

    QuartileMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static QuartileMethodEnum fromValue(String text) {
      for (QuartileMethodEnum b : QuartileMethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<QuartileMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final QuartileMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public QuartileMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return QuartileMethodEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "quartileMethod", alternate = { "QuartileMethod" })
  private QuartileMethodEnum quartileMethod;

  @SerializedName(value = "showInnerPoints", alternate = { "ShowInnerPoints" })
  private Boolean showInnerPoints;

  @SerializedName(value = "showMeanLine", alternate = { "ShowMeanLine" })
  private Boolean showMeanLine;

  @SerializedName(value = "showMeanMarkers", alternate = { "ShowMeanMarkers" })
  private Boolean showMeanMarkers;

  @SerializedName(value = "showOutlierPoints", alternate = { "ShowOutlierPoints" })
  private Boolean showOutlierPoints;


  public OneValueSeries() {
    super();
    setDataPointType(DataPointTypeEnum.ONEVALUE);
  }

  public OneValueSeries dataPoints(List<OneValueChartDataPoint> dataPoints) {
    this.dataPoints = dataPoints;
    return this;
  }

  public OneValueSeries addDataPointsItem(OneValueChartDataPoint dataPointsItem) {
    if (this.dataPoints == null) {
      this.dataPoints = new ArrayList<OneValueChartDataPoint>();
    }
    this.dataPoints.add(dataPointsItem);
    return this;
  }

   /**
   * Gets or sets the values.
   * @return dataPoints
  **/
  @ApiModelProperty(value = "Gets or sets the values.")
  public List<OneValueChartDataPoint> getDataPoints() {
    return dataPoints;
  }

  public void setDataPoints(List<OneValueChartDataPoint> dataPoints) {
    this.dataPoints = dataPoints;
  }

  public OneValueSeries numberFormatOfValues(String numberFormatOfValues) {
    this.numberFormatOfValues = numberFormatOfValues;
    return this;
  }

   /**
   * The number format for the series values.
   * @return numberFormatOfValues
  **/
  @ApiModelProperty(value = "The number format for the series values.")
  public String getNumberFormatOfValues() {
    return numberFormatOfValues;
  }

  public void setNumberFormatOfValues(String numberFormatOfValues) {
    this.numberFormatOfValues = numberFormatOfValues;
  }

  public OneValueSeries dataSourceForValues(DataSource dataSourceForValues) {
    this.dataSourceForValues = dataSourceForValues;
    return this;
  }

   /**
   * Data source type for values.
   * @return dataSourceForValues
  **/
  @ApiModelProperty(value = "Data source type for values.")
  public DataSource getDataSourceForValues() {
    return dataSourceForValues;
  }

  public void setDataSourceForValues(DataSource dataSourceForValues) {
    this.dataSourceForValues = dataSourceForValues;
  }

  public OneValueSeries showConnectorLines(Boolean showConnectorLines) {
    this.showConnectorLines = showConnectorLines;
    return this;
  }

   /**
   * True if inner points are shown. Applied to Waterfall series only.
   * @return showConnectorLines
  **/
  @ApiModelProperty(value = "True if inner points are shown. Applied to Waterfall series only.")
  public Boolean isShowConnectorLines() {
    return showConnectorLines;
  }

  public void setShowConnectorLines(Boolean showConnectorLines) {
    this.showConnectorLines = showConnectorLines;
  }

  public OneValueSeries quartileMethod(QuartileMethodEnum quartileMethod) {
    this.quartileMethod = quartileMethod;
    return this;
  }

   /**
   * Quartile method. Applied to BoxAndWhisker series only.
   * @return quartileMethod
  **/
  @ApiModelProperty(value = "Quartile method. Applied to BoxAndWhisker series only.")
  public QuartileMethodEnum getQuartileMethod() {
    return quartileMethod;
  }

  public void setQuartileMethod(QuartileMethodEnum quartileMethod) {
    this.quartileMethod = quartileMethod;
  }

  public OneValueSeries showInnerPoints(Boolean showInnerPoints) {
    this.showInnerPoints = showInnerPoints;
    return this;
  }

   /**
   * True if inner points are shown. Applied to BoxAndWhisker series only.
   * @return showInnerPoints
  **/
  @ApiModelProperty(value = "True if inner points are shown. Applied to BoxAndWhisker series only.")
  public Boolean isShowInnerPoints() {
    return showInnerPoints;
  }

  public void setShowInnerPoints(Boolean showInnerPoints) {
    this.showInnerPoints = showInnerPoints;
  }

  public OneValueSeries showMeanLine(Boolean showMeanLine) {
    this.showMeanLine = showMeanLine;
    return this;
  }

   /**
   * True if mean line is shown. Applied to BoxAndWhisker series only.
   * @return showMeanLine
  **/
  @ApiModelProperty(value = "True if mean line is shown. Applied to BoxAndWhisker series only.")
  public Boolean isShowMeanLine() {
    return showMeanLine;
  }

  public void setShowMeanLine(Boolean showMeanLine) {
    this.showMeanLine = showMeanLine;
  }

  public OneValueSeries showMeanMarkers(Boolean showMeanMarkers) {
    this.showMeanMarkers = showMeanMarkers;
    return this;
  }

   /**
   * True if mean markers are shown. Applied to BoxAndWhisker series only.
   * @return showMeanMarkers
  **/
  @ApiModelProperty(value = "True if mean markers are shown. Applied to BoxAndWhisker series only.")
  public Boolean isShowMeanMarkers() {
    return showMeanMarkers;
  }

  public void setShowMeanMarkers(Boolean showMeanMarkers) {
    this.showMeanMarkers = showMeanMarkers;
  }

  public OneValueSeries showOutlierPoints(Boolean showOutlierPoints) {
    this.showOutlierPoints = showOutlierPoints;
    return this;
  }

   /**
   * True if outlier points are shown. Applied to BoxAndWhisker series only.
   * @return showOutlierPoints
  **/
  @ApiModelProperty(value = "True if outlier points are shown. Applied to BoxAndWhisker series only.")
  public Boolean isShowOutlierPoints() {
    return showOutlierPoints;
  }

  public void setShowOutlierPoints(Boolean showOutlierPoints) {
    this.showOutlierPoints = showOutlierPoints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OneValueSeries oneValueSeries = (OneValueSeries) o;
    return true && Objects.equals(this.dataPoints, oneValueSeries.dataPoints) && Objects.equals(this.numberFormatOfValues, oneValueSeries.numberFormatOfValues) && Objects.equals(this.dataSourceForValues, oneValueSeries.dataSourceForValues) && Objects.equals(this.showConnectorLines, oneValueSeries.showConnectorLines) && Objects.equals(this.quartileMethod, oneValueSeries.quartileMethod) && Objects.equals(this.showInnerPoints, oneValueSeries.showInnerPoints) && Objects.equals(this.showMeanLine, oneValueSeries.showMeanLine) && Objects.equals(this.showMeanMarkers, oneValueSeries.showMeanMarkers) && Objects.equals(this.showOutlierPoints, oneValueSeries.showOutlierPoints) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataPoints, numberFormatOfValues, dataSourceForValues, showConnectorLines, quartileMethod, showInnerPoints, showMeanLine, showMeanMarkers, showOutlierPoints, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OneValueSeries {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dataPoints: ").append(toIndentedString(dataPoints)).append("\n");
    sb.append("    numberFormatOfValues: ").append(toIndentedString(numberFormatOfValues)).append("\n");
    sb.append("    dataSourceForValues: ").append(toIndentedString(dataSourceForValues)).append("\n");
    sb.append("    showConnectorLines: ").append(toIndentedString(showConnectorLines)).append("\n");
    sb.append("    quartileMethod: ").append(toIndentedString(quartileMethod)).append("\n");
    sb.append("    showInnerPoints: ").append(toIndentedString(showInnerPoints)).append("\n");
    sb.append("    showMeanLine: ").append(toIndentedString(showMeanLine)).append("\n");
    sb.append("    showMeanMarkers: ").append(toIndentedString(showMeanMarkers)).append("\n");
    sb.append("    showOutlierPoints: ").append(toIndentedString(showOutlierPoints)).append("\n");
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
      typeDeterminers.put("DataPointType", DataPointTypeEnum.ONEVALUE);
  }
}
