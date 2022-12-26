// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="ChartTests.cs">
//   Copyright (c) 2018 Aspose.Slides for Cloud
// </copyright>
// <summary>
//  Permission is hereby granted, free of charge, to any person obtaining a copy
//  of this software and associated documentation files (the "Software"), to deal
//  in the Software without restriction, including without limitation the rights
//  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
//  copies of the Software, and to permit persons to whom the Software is
//  furnished to do so, subject to the following conditions:
// 
//  The above copyright notice and this permission notice shall be included in all
//  copies or substantial portions of the Software.
// 
//  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
//  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
//  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
//  SOFTWARE.
// </summary>
// --------------------------------------------------------------------------------------------------------------------

package com.aspose.slides.usecases;

import com.aspose.slides.ApiException;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import com.aspose.slides.ApiTest;
import com.aspose.slides.model.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * API tests for chart methods
 */
public class ChartTest extends ApiTest {
    @Test
    public void chartGetTest() throws ApiException, IOException {
        initialize(null, null, null, null);
        Chart chart = (Chart)api.getShape(c_fileName, c_slideIndex, c_shapeIndex, c_password, c_folderName, null, null);
        assertNotNull(chart);
        assertEquals(c_seriesCount, chart.getSeries().size());
        assertEquals(c_categoryCount, chart.getCategories().size());
    }

    @Test
    public void chartCreateAutoDataSourceTest() throws ApiException, IOException {
        initialize(null, null, null, null);
        Chart dto = new Chart();
        dto.setChartType(Chart.ChartTypeEnum.CLUSTEREDCOLUMN);
        dto.setWidth(400.0);
        dto.setHeight(300.0);
        ChartCategory category1 = new ChartCategory();
        category1.setValue("Category1");
        ChartCategory category2 = new ChartCategory();
        category2.setValue("Category2");
        ChartCategory category3 = new ChartCategory();
        category3.setValue("Category3");
        List<ChartCategory> categories = new ArrayList<ChartCategory>();
        categories.add(category1);
        categories.add(category2);
        categories.add(category3);
        dto.setCategories(categories);
        List<Series> seriesList = new ArrayList<Series>();
        OneValueSeries series1 = new OneValueSeries();
        series1.setName("Series1");
        List<OneValueChartDataPoint> dataPoints1 = new ArrayList<OneValueChartDataPoint>();
        OneValueChartDataPoint dataPoint11 = new OneValueChartDataPoint();
        dataPoint11.setValue(40.0);
        dataPoints1.add(dataPoint11);
        OneValueChartDataPoint dataPoint12 = new OneValueChartDataPoint();
        dataPoint12.setValue(50.0);
        dataPoints1.add(dataPoint12);
        OneValueChartDataPoint dataPoint13 = new OneValueChartDataPoint();
        dataPoint13.setValue(70.0);
        dataPoints1.add(dataPoint13);
        series1.setDataPoints(dataPoints1);
        seriesList.add(series1);
        OneValueSeries series2 = new OneValueSeries();
        series2.setName("Series2");
        List<OneValueChartDataPoint> dataPoints2 = new ArrayList<OneValueChartDataPoint>();
        OneValueChartDataPoint dataPoint21 = new OneValueChartDataPoint();
        dataPoint21.setValue(55.0);
        dataPoints2.add(dataPoint21);
        OneValueChartDataPoint dataPoint22 = new OneValueChartDataPoint();
        dataPoint22.setValue(35.0);
        dataPoints2.add(dataPoint22);
        OneValueChartDataPoint dataPoint23 = new OneValueChartDataPoint();
        dataPoint23.setValue(90.0);
        dataPoints2.add(dataPoint23);
        series2.setDataPoints(dataPoints2);
        seriesList.add(series2);
        dto.setSeries(seriesList);
        Chart chart = (Chart)api.createShape(c_fileName, c_slideIndex, dto, null, null, c_password,
                c_folderName, null, null);
        assertNotNull(chart);
        assertEquals(2, chart.getSeries().size());
        assertEquals(3, chart.getCategories().size());
    }

    @Test
    public void chartCreateWorkbookTest() throws ApiException, IOException {
        initialize(null, null, null, null);
        Chart dto = new Chart();
        dto.setChartType(Chart.ChartTypeEnum.CLUSTEREDCOLUMN);
        dto.setWidth(400.0);
        dto.setHeight(300.0);

        Workbook dataSourceForCategories = new Workbook();
        dataSourceForCategories.setWorksheetIndex(1);
        dataSourceForCategories.setColumnIndex(1);
        dataSourceForCategories.setRowIndex(2);
        dto.setDataSourceForCategories(dataSourceForCategories);

        ChartCategory category1 = new ChartCategory();
        category1.setValue("Category1");
        ChartCategory category2 = new ChartCategory();
        category2.setValue("Category2");
        ChartCategory category3 = new ChartCategory();
        category3.setValue("Category3");
        List<ChartCategory> categories = new ArrayList<ChartCategory>();
        categories.add(category1);
        categories.add(category2);
        categories.add(category3);
        dto.setCategories(categories);
        List<Series> seriesList = new ArrayList<Series>();

        OneValueSeries series1 = new OneValueSeries();
        Workbook dataSourceForSeries1Name = new Workbook();
        dataSourceForSeries1Name.setWorksheetIndex(1);
        dataSourceForSeries1Name.setColumnIndex(2);
        dataSourceForSeries1Name.setRowIndex(1);
        series1.setDataSourceForSeriesName(dataSourceForSeries1Name);

        Workbook dataSourceForSeries1Values = new Workbook();
        dataSourceForSeries1Values.setWorksheetIndex(1);
        dataSourceForSeries1Values.setColumnIndex(2);
        dataSourceForSeries1Values.setRowIndex(2);
        series1.setDataSourceForSeriesName(dataSourceForSeries1Values);

        series1.setName("Series1");
        List<OneValueChartDataPoint> dataPoints1 = new ArrayList<OneValueChartDataPoint>();
        OneValueChartDataPoint dataPoint11 = new OneValueChartDataPoint();
        dataPoint11.setValue(40.0);
        dataPoints1.add(dataPoint11);
        OneValueChartDataPoint dataPoint12 = new OneValueChartDataPoint();
        dataPoint12.setValue(50.0);
        dataPoints1.add(dataPoint12);
        OneValueChartDataPoint dataPoint13 = new OneValueChartDataPoint();
        dataPoint13.setValue(70.0);
        dataPoints1.add(dataPoint13);
        series1.setDataPoints(dataPoints1);
        seriesList.add(series1);

        OneValueSeries series2 = new OneValueSeries();
        Workbook dataSourceForSeries2Name = new Workbook();
        dataSourceForSeries2Name.setWorksheetIndex(1);
        dataSourceForSeries2Name.setColumnIndex(3);
        dataSourceForSeries2Name.setRowIndex(1);
        series2.setDataSourceForSeriesName(dataSourceForSeries2Name);

        Workbook dataSourceForSeries2Values = new Workbook();
        dataSourceForSeries2Values.setWorksheetIndex(1);
        dataSourceForSeries2Values.setColumnIndex(3);
        dataSourceForSeries2Values.setRowIndex(2);
        series2.setDataSourceForSeriesName(dataSourceForSeries2Values);

        series2.setName("Series2");
        List<OneValueChartDataPoint> dataPoints2 = new ArrayList<OneValueChartDataPoint>();
        OneValueChartDataPoint dataPoint21 = new OneValueChartDataPoint();
        dataPoint21.setValue(55.0);
        dataPoints2.add(dataPoint21);
        OneValueChartDataPoint dataPoint22 = new OneValueChartDataPoint();
        dataPoint22.setValue(35.0);
        dataPoints2.add(dataPoint22);
        OneValueChartDataPoint dataPoint23 = new OneValueChartDataPoint();
        dataPoint23.setValue(90.0);
        dataPoints2.add(dataPoint23);
        series2.setDataPoints(dataPoints2);
        seriesList.add(series2);
        dto.setSeries(seriesList);
        Chart chart = (Chart)api.createShape(c_fileName, c_slideIndex, dto, null, null, c_password,
                c_folderName, null, null);
        assertNotNull(chart);
        assertEquals(2, chart.getSeries().size());
        assertEquals(3, chart.getCategories().size());
    }

    @Test
    public void chartCreateLiteralsTest() throws ApiException, IOException {
        initialize(null, null, null, null);
        Chart dto = new Chart();
        dto.setChartType(Chart.ChartTypeEnum.CLUSTEREDCOLUMN);
        dto.setWidth(400.0);
        dto.setHeight(300.0);

        Literals dataSourceForCategories = new Literals();
        dto.setDataSourceForCategories(dataSourceForCategories);

        ChartCategory category1 = new ChartCategory();
        category1.setValue("Category1");
        ChartCategory category2 = new ChartCategory();
        category2.setValue("Category2");
        ChartCategory category3 = new ChartCategory();
        category3.setValue("Category3");
        List<ChartCategory> categories = new ArrayList<ChartCategory>();
        categories.add(category1);
        categories.add(category2);
        categories.add(category3);
        dto.setCategories(categories);
        List<Series> seriesList = new ArrayList<Series>();

        OneValueSeries series1 = new OneValueSeries();
        Literals dataSourceForSeries1Name = new Literals();
        series1.setDataSourceForSeriesName(dataSourceForSeries1Name);

        Literals dataSourceForSeries1Values = new Literals();
        series1.setDataSourceForSeriesName(dataSourceForSeries1Values);

        series1.setName("Series1");
        List<OneValueChartDataPoint> dataPoints1 = new ArrayList<OneValueChartDataPoint>();
        OneValueChartDataPoint dataPoint11 = new OneValueChartDataPoint();
        dataPoint11.setValue(40.0);
        dataPoints1.add(dataPoint11);
        OneValueChartDataPoint dataPoint12 = new OneValueChartDataPoint();
        dataPoint12.setValue(50.0);
        dataPoints1.add(dataPoint12);
        OneValueChartDataPoint dataPoint13 = new OneValueChartDataPoint();
        dataPoint13.setValue(70.0);
        dataPoints1.add(dataPoint13);
        series1.setDataPoints(dataPoints1);
        seriesList.add(series1);

        OneValueSeries series2 = new OneValueSeries();
        Literals dataSourceForSeries2Name = new Literals();
        series2.setDataSourceForSeriesName(dataSourceForSeries2Name);

        Literals dataSourceForSeries2Values = new Literals();
        series2.setDataSourceForSeriesName(dataSourceForSeries2Values);

        series2.setName("Series2");
        List<OneValueChartDataPoint> dataPoints2 = new ArrayList<OneValueChartDataPoint>();
        OneValueChartDataPoint dataPoint21 = new OneValueChartDataPoint();
        dataPoint21.setValue(55.0);
        dataPoints2.add(dataPoint21);
        OneValueChartDataPoint dataPoint22 = new OneValueChartDataPoint();
        dataPoint22.setValue(35.0);
        dataPoints2.add(dataPoint22);
        OneValueChartDataPoint dataPoint23 = new OneValueChartDataPoint();
        dataPoint23.setValue(90.0);
        dataPoints2.add(dataPoint23);
        series2.setDataPoints(dataPoints2);
        seriesList.add(series2);
        dto.setSeries(seriesList);
        Chart chart = (Chart)api.createShape(c_fileName, c_slideIndex, dto, null, null, c_password,
                c_folderName, null, null);
        assertNotNull(chart);
        assertEquals(2, chart.getSeries().size());
        assertEquals(3, chart.getCategories().size());
    }

    @Test
    public void chartUpdateTest() throws ApiException, IOException {
        initialize(null, null, null, null);
        Chart dto = new Chart();
        dto.setChartType(Chart.ChartTypeEnum.CLUSTEREDCOLUMN);
        dto.setWidth(400.0);
        dto.setHeight(300.0);
        ChartCategory category1 = new ChartCategory();
        category1.setValue("Category1");
        ChartCategory category2 = new ChartCategory();
        category2.setValue("Category2");
        ChartCategory category3 = new ChartCategory();
        category3.setValue("Category3");
        List<ChartCategory> categories = new ArrayList<ChartCategory>();
        categories.add(category1);
        categories.add(category2);
        categories.add(category3);
        dto.setCategories(categories);
        List<Series> seriesList = new ArrayList<Series>();
        OneValueSeries series1 = new OneValueSeries();
        series1.setName("Series1");
        List<OneValueChartDataPoint> dataPoints1 = new ArrayList<OneValueChartDataPoint>();
        OneValueChartDataPoint dataPoint11 = new OneValueChartDataPoint();
        dataPoint11.setValue(40.0);
        dataPoints1.add(dataPoint11);
        OneValueChartDataPoint dataPoint12 = new OneValueChartDataPoint();
        dataPoint12.setValue(50.0);
        dataPoints1.add(dataPoint12);
        OneValueChartDataPoint dataPoint13 = new OneValueChartDataPoint();
        dataPoint13.setValue(70.0);
        dataPoints1.add(dataPoint13);
        series1.setDataPoints(dataPoints1);
        seriesList.add(series1);
        OneValueSeries series2 = new OneValueSeries();
        series2.setName("Series2");
        List<OneValueChartDataPoint> dataPoints2 = new ArrayList<OneValueChartDataPoint>();
        OneValueChartDataPoint dataPoint21 = new OneValueChartDataPoint();
        dataPoint21.setValue(55.0);
        dataPoints2.add(dataPoint21);
        OneValueChartDataPoint dataPoint22 = new OneValueChartDataPoint();
        dataPoint22.setValue(35.0);
        dataPoints2.add(dataPoint22);
        OneValueChartDataPoint dataPoint23 = new OneValueChartDataPoint();
        dataPoint23.setValue(90.0);
        dataPoints2.add(dataPoint23);
        series2.setDataPoints(dataPoints2);
        seriesList.add(series2);
        dto.setSeries(seriesList);
        Chart chart = (Chart)api.updateShape(c_fileName, c_slideIndex, c_shapeIndex, dto, c_password, c_folderName, null, null);
        assertNotNull(chart);
        assertEquals(2, chart.getSeries().size());
        assertEquals(3, chart.getCategories().size());
    }

    @Test
    public void chartSeriesCreateTest() throws ApiException, IOException {
        initialize(null, null, null, null);
        OneValueSeries series = new OneValueSeries();
        series.setName("Series1");
        List<OneValueChartDataPoint> dataPoints = new ArrayList<OneValueChartDataPoint>();
        OneValueChartDataPoint dataPoint1 = new OneValueChartDataPoint();
        dataPoint1.setValue(40.0);
        dataPoints.add(dataPoint1);
        OneValueChartDataPoint dataPoint2 = new OneValueChartDataPoint();
        dataPoint2.setValue(50.0);
        dataPoints.add(dataPoint2);
        OneValueChartDataPoint dataPoint3 = new OneValueChartDataPoint();
        dataPoint3.setValue(14.0);
        dataPoints.add(dataPoint3);
        OneValueChartDataPoint dataPoint4 = new OneValueChartDataPoint();
        dataPoint4.setValue(70.0);
        dataPoints.add(dataPoint4);
        series.setDataPoints(dataPoints);
        Chart chart = api.createChartSeries(c_fileName, c_slideIndex, c_shapeIndex, series, c_password, c_folderName, null);
        assertNotNull(chart);
        assertEquals(c_seriesCount + 1, chart.getSeries().size());
        assertEquals(c_categoryCount, chart.getCategories().size());
    }

    @Test
    public void chartSeriesUpdateTest() throws ApiException, IOException {
        initialize(null, null, null, null);
        OneValueSeries series = new OneValueSeries();
        series.setName("Series1");
        List<OneValueChartDataPoint> dataPoints = new ArrayList<OneValueChartDataPoint>();
        OneValueChartDataPoint dataPoint1 = new OneValueChartDataPoint();
        dataPoint1.setValue(40.0);
        dataPoints.add(dataPoint1);
        OneValueChartDataPoint dataPoint2 = new OneValueChartDataPoint();
        dataPoint2.setValue(50.0);
        dataPoints.add(dataPoint2);
        OneValueChartDataPoint dataPoint3 = new OneValueChartDataPoint();
        dataPoint3.setValue(14.0);
        dataPoints.add(dataPoint3);
        OneValueChartDataPoint dataPoint4 = new OneValueChartDataPoint();
        dataPoint4.setValue(70.0);
        dataPoints.add(dataPoint4);
        series.setDataPoints(dataPoints);
        Chart chart = api.updateChartSeries(c_fileName, c_slideIndex, c_shapeIndex, c_seriesIndex, series, c_password, c_folderName, null);
        assertNotNull(chart);
        assertEquals(c_seriesCount, chart.getSeries().size());
        assertEquals(c_categoryCount, chart.getCategories().size());
    }

    @Test
    public void chartSeriesDeleteTest() throws ApiException, IOException {
        initialize(null, null, null, null);
        Chart chart = api.deleteChartSeries(c_fileName, c_slideIndex, c_shapeIndex, c_seriesIndex, c_password, c_folderName, null);
        assertNotNull(chart);
        assertEquals(c_seriesCount - 1, chart.getSeries().size());
        assertEquals(c_categoryCount, chart.getCategories().size());
    }

    @Test
    public void chartCategoryCreateTest() throws ApiException, IOException {
        //SLIDESCLOUD-1133
        initialize(null, null, null, null);
        ChartCategory category = new ChartCategory();
        category.setValue("NewCategory");
        List<OneValueChartDataPoint> dataPoints = new ArrayList<OneValueChartDataPoint>();
        OneValueChartDataPoint dataPoint1 = new OneValueChartDataPoint();
        dataPoint1.setValue(40.0);
        dataPoints.add(dataPoint1);
        OneValueChartDataPoint dataPoint2 = new OneValueChartDataPoint();
        dataPoint2.setValue(50.0);
        dataPoints.add(dataPoint2);
        OneValueChartDataPoint dataPoint3 = new OneValueChartDataPoint();
        dataPoint3.setValue(14.0);
        dataPoints.add(dataPoint3);
        category.setDataPoints(dataPoints);
        Chart chart = api.createChartCategory(c_fileName, c_slideIndex, c_shapeIndex, category, c_password, c_folderName, null);
        assertNotNull(chart);
        assertEquals(c_seriesCount, chart.getSeries().size());
        assertEquals(c_categoryCount + 1, chart.getCategories().size());
        assertEquals(c_categoryCount + 1, ((OneValueSeries)chart.getSeries().get(0)).getDataPoints().size());
        assertEquals(category.getDataPoints().get(0).getValue(), ((OneValueSeries)chart.getSeries().get(0)).getDataPoints().get(c_categoryCount).getValue());
    }

    @Test
    public void chartCategoryUpdateTest() throws ApiException, IOException {
        //SLIDESCLOUD-1133
        initialize(null, null, null, null);
        ChartCategory category = new ChartCategory();
        category.setValue("NewCategory");
        List<OneValueChartDataPoint> dataPoints = new ArrayList<OneValueChartDataPoint>();
        OneValueChartDataPoint dataPoint1 = new OneValueChartDataPoint();
        dataPoint1.setValue(40.0);
        dataPoints.add(dataPoint1);
        OneValueChartDataPoint dataPoint2 = new OneValueChartDataPoint();
        dataPoint2.setValue(50.0);
        dataPoints.add(dataPoint2);
        OneValueChartDataPoint dataPoint3 = new OneValueChartDataPoint();
        dataPoint3.setValue(14.0);
        dataPoints.add(dataPoint3);
        category.setDataPoints(dataPoints);
        Chart chart = api.updateChartCategory(c_fileName, c_slideIndex, c_shapeIndex, c_categoryIndex, category, c_password, c_folderName, null);
        assertNotNull(chart);
        assertEquals(c_seriesCount, chart.getSeries().size());
        assertEquals(c_categoryCount, chart.getCategories().size());
        assertEquals(c_categoryCount, ((OneValueSeries)chart.getSeries().get(0)).getDataPoints().size());
        assertEquals(category.getDataPoints().get(0).getValue(), ((OneValueSeries)chart.getSeries().get(0)).getDataPoints().get(c_categoryIndex - 1).getValue());
    }

    @Test
    public void chartCategoryDeleteTest() throws ApiException, IOException {
        //SLIDESCLOUD-1133
        initialize(null, null, null, null);
        Chart chart = api.deleteChartCategory(c_fileName, c_slideIndex, c_shapeIndex, c_categoryIndex, c_password, c_folderName, null);
        assertNotNull(chart);
        assertEquals(c_seriesCount, chart.getSeries().size());
        assertEquals(c_categoryCount - 1, chart.getCategories().size());
        assertEquals(c_categoryCount - 1, ((OneValueSeries)chart.getSeries().get(0)).getDataPoints().size());
    }

    @Test
    public void chartDataPointCreateTest() throws ApiException, IOException {
        initialize(null, null, null, null);
        OneValueChartDataPoint dataPoint = new OneValueChartDataPoint();
        dataPoint.setValue(40.0);
        try {
            api.createChartDataPoint(c_fileName, c_slideIndex, c_shapeIndex, c_seriesIndex, dataPoint, c_password, c_folderName, null);
        } catch (Exception ex) {
            //Must throw ApiException because adding data points only works with Scatter & Bubble charts.
            assertTrue(ex instanceof ApiException);
        }
    }

    @Test
    public void chartDataPointUpdateTest() throws ApiException, IOException {
        //SLIDESCLOUD-1133
        initialize(null, null, null, null);
        OneValueChartDataPoint dataPoint = new OneValueChartDataPoint();
        dataPoint.setValue(40.0);
        Chart chart = api.updateChartDataPoint(c_fileName, c_slideIndex, c_shapeIndex, c_seriesIndex, c_categoryIndex, dataPoint, c_password, c_folderName, null);
        assertNotNull(chart);
        assertEquals(c_seriesCount, chart.getSeries().size());
        assertEquals(c_categoryCount, chart.getCategories().size());
        assertEquals(c_categoryCount, ((OneValueSeries)chart.getSeries().get(c_seriesIndex - 1)).getDataPoints().size());
        assertEquals(dataPoint.getValue(), ((OneValueSeries)chart.getSeries().get(c_seriesIndex - 1)).getDataPoints().get(c_categoryIndex - 1).getValue());
    }

    @Test
    public void chartDataPointDeleteTest() throws ApiException, IOException {
        //SLIDESCLOUD-1133
        initialize(null, null, null, null);
        Chart chart = api.deleteChartDataPoint(c_fileName, c_slideIndex, c_shapeIndex, c_seriesIndex, c_categoryIndex, c_password, c_folderName, null);
        assertNotNull(chart);
        assertEquals(c_seriesCount, chart.getSeries().size());
        assertEquals(c_categoryCount, chart.getCategories().size());
        assertEquals(c_categoryCount, ((OneValueSeries)chart.getSeries().get(c_seriesIndex - 1)).getDataPoints().size());
        assertNull(((OneValueSeries)chart.getSeries().get(c_seriesIndex - 1)).getDataPoints().get(c_categoryIndex - 1));
    }

    @Test
    public void sunburstChartTest() throws ApiException, IOException {
        initialize(null, null, null, null);
        Chart dto = new Chart();
        dto.setChartType(Chart.ChartTypeEnum.SUNBURST);
        dto.setWidth(400.0);
        dto.setHeight(300.0);
        List<ChartCategory> categories = new ArrayList<ChartCategory>();
        ChartCategory category1 = new ChartCategory();
        category1.setValue("Leaf1");
        List<String> parentCategories1 = new ArrayList<String>();
        parentCategories1.add("Branch1");
        parentCategories1.add("Stem1");
        category1.setParentCategories(parentCategories1);
        categories.add(category1);
        ChartCategory category2 = new ChartCategory();
        category2.setValue("Leaf2");
        List<String> parentCategories2 = new ArrayList<String>();
        parentCategories2.add("Branch1");
        parentCategories2.add("Stem1");
        category2.setParentCategories(parentCategories2);
        categories.add(category2);
        ChartCategory category3 = new ChartCategory();
        category3.setValue("Branch2");
        List<String> parentCategories3 = new ArrayList<String>();
        parentCategories3.add("Stem1");
        category3.setParentCategories(parentCategories3);
        categories.add(category3);
        ChartCategory category4 = new ChartCategory();
        category4.setValue("Stem2");
        categories.add(category4);
        dto.setCategories(categories);
        List<Series> seriesList = new ArrayList<Series>();
        OneValueSeries series = new OneValueSeries();
        series.setName("Series1");
        List<OneValueChartDataPoint> dataPoints = new ArrayList<OneValueChartDataPoint>();
        OneValueChartDataPoint dataPoint1 = new OneValueChartDataPoint();
        dataPoint1.setValue(40.0);
        dataPoints.add(dataPoint1);
        OneValueChartDataPoint dataPoint2 = new OneValueChartDataPoint();
        dataPoint2.setValue(50.0);
        dataPoints.add(dataPoint2);
        OneValueChartDataPoint dataPoint3 = new OneValueChartDataPoint();
        dataPoint3.setValue(70.0);
        dataPoints.add(dataPoint3);
        OneValueChartDataPoint dataPoint4 = new OneValueChartDataPoint();
        dataPoint4.setValue(80.0);
        dataPoints.add(dataPoint4);
        series.setDataPoints(dataPoints);
        seriesList.add(series);
        dto.setSeries(seriesList);
        Chart chart = (Chart)api.createShape(c_fileName, c_slideIndex, dto, null, null, c_password, c_folderName,
                null, null);
        assertNotNull(chart);
        assertEquals(1, chart.getSeries().size());
        assertEquals(4, chart.getCategories().size());
    }

    @Test
    public void multiLevelCategoryAxisTest() throws ApiException {
        initialize(null, null, null, null);
        Chart dto = new Chart();
        dto.setX(100.0);
        dto.setY(100.0);
        dto.setWidth(500.0);
        dto.setHeight(500.0);
        dto.setChartType(Chart.ChartTypeEnum.CLUSTEREDCOLUMN);

        List<Series> seriesList = new ArrayList<Series>();
        OneValueSeries series = new OneValueSeries();
        series.setType(Series.TypeEnum.CLUSTEREDCOLUMN);
        List<OneValueChartDataPoint> dataPoints = new ArrayList<OneValueChartDataPoint>();
        for (int i = 1; i <= 8; i++) {
            OneValueChartDataPoint dataPoint = new OneValueChartDataPoint();
            dataPoint.setValue(new Double(i));
            dataPoints.add(dataPoint);
        }
        series.setDataPoints(dataPoints);
        seriesList.add(series);

        List<ChartCategory> categoryList = new ArrayList<ChartCategory>();
        ChartCategory category1 = new ChartCategory();
        category1.setValue("Category1");
        category1.setParentCategories(new ArrayList(Arrays.asList("Sub-category 1", "Root 1")));
        categoryList.add(category1);
        ChartCategory category2 = new ChartCategory();
        category2.setValue("Category2");
        categoryList.add(category2);
        ChartCategory category3 = new ChartCategory();
        category3.setValue("Category3");
        category3.setParentCategories(new ArrayList(Arrays.asList("Sub-category 2")));
        categoryList.add(category3);
        ChartCategory category4 = new ChartCategory();
        category4.setValue("Category4");
        categoryList.add(category4);
        ChartCategory category5 = new ChartCategory();
        category5.setValue("Category5");
        category5.setParentCategories(new ArrayList(Arrays.asList("Sub-category 3", "Root 2")));
        categoryList.add(category5);
        ChartCategory category6 = new ChartCategory();
        category6.setValue("Category6");
        categoryList.add(category6);
        ChartCategory category7 = new ChartCategory();
        category7.setValue("Category7");
        category7.setParentCategories(new ArrayList(Arrays.asList("Sub-category 4")));
        categoryList.add(category7);
        ChartCategory category8 = new ChartCategory();
        category8.setValue("Category8");
        categoryList.add(category8);

        dto.setSeries(seriesList);
        dto.setCategories(categoryList);

        Chart chart = (Chart)api.createShape(c_fileName, c_slideIndex, dto, null, null, c_password, c_folderName, null, null);

        assertEquals(Chart.ChartTypeEnum.CLUSTEREDCOLUMN, chart.getChartType());
        assertEquals(1, chart.getSeries().size());
        assertEquals(8, chart.getCategories().size());
        assertEquals(2, chart.getCategories().get(0).getParentCategories().size());
    }

    @Test
    public void hideChartLegendTest() throws ApiException {
        initialize(null, null, null, null);
        Legend legend = new Legend();
        legend.setHasLegend(false);
        api.setChartLegend(c_fileName, c_slideIndex, c_shapeIndex, legend, c_password, c_folderName, null);
        Chart chart = (Chart)api.getShape(c_fileName, c_slideIndex, c_shapeIndex, c_password, c_folderName, null, null);
        assertFalse(chart.getLegend().isHasLegend());
    }

    @Test
    public void chartGridLinesFormatTest() throws ApiException, IOException{
        initialize(null, null, null, null);

        Axis horizontalAxis = new Axis();
        ChartLinesFormat horizontalMajorGridLineFormat = new ChartLinesFormat();
        horizontalMajorGridLineFormat.setLineFormat(new LineFormat());
        horizontalMajorGridLineFormat.getLineFormat().setFillFormat(new NoFill());
        horizontalAxis.setMajorGridLinesFormat(horizontalMajorGridLineFormat);
        ChartLinesFormat horizontalMinorGridLineFormat = new ChartLinesFormat();
        horizontalMinorGridLineFormat.setLineFormat(new LineFormat());
        SolidFill solidFillFormat = new SolidFill();
        solidFillFormat.setColor("Black");
        horizontalMinorGridLineFormat.getLineFormat().setFillFormat(solidFillFormat);
        horizontalAxis.setMinorGridLinesFormat(horizontalMinorGridLineFormat);

        Axis verticalAxis = new Axis();
        ChartLinesFormat verticalMajorGridLineFormat = new ChartLinesFormat();
        GradientFill gradientFill = new GradientFill();
        gradientFill.setDirection(GradientFill.DirectionEnum.FROMCORNER1);
        GradientFillStop gradientFillStop1 = new GradientFillStop();
        gradientFillStop1.setColor("White");
        gradientFillStop1.setPosition(0.0);
        GradientFillStop gradientFillStop2 = new GradientFillStop();
        gradientFillStop2.setColor("Black");
        gradientFillStop2.setPosition(1.0);
        gradientFill.setStops(new ArrayList<GradientFillStop>(Arrays.asList(gradientFillStop1, gradientFillStop2)));
        verticalMajorGridLineFormat.setLineFormat(new LineFormat());
        verticalMajorGridLineFormat.getLineFormat().setFillFormat(gradientFill);
        verticalAxis.setMajorGridLinesFormat(verticalMajorGridLineFormat);
        ChartLinesFormat verticalMinorGridLineFormat = new ChartLinesFormat();
        verticalMinorGridLineFormat.setLineFormat(new LineFormat());
        verticalMinorGridLineFormat.getLineFormat().setFillFormat(new NoFill());
        verticalAxis.setMinorGridLinesFormat(verticalMinorGridLineFormat);

        api.setChartAxis(c_fileName, c_slideIndex, c_shapeIndex, AxisType.HORIZONTALAXIS, horizontalAxis, c_password, c_folderName, null);
        api.setChartAxis(c_fileName, c_slideIndex, c_shapeIndex, AxisType.VERTICALAXIS, verticalAxis, c_password, c_folderName, null);

        Chart chart = (Chart)api.getShape(c_fileName, c_slideIndex, c_shapeIndex, c_password, c_folderName, null, null);
        assertTrue(chart.getAxes().getHorizontalAxis().getMajorGridLinesFormat().getLineFormat().getFillFormat() instanceof NoFill);
        assertTrue(chart.getAxes().getHorizontalAxis().getMinorGridLinesFormat().getLineFormat().getFillFormat() instanceof SolidFill);
        assertTrue(chart.getAxes().getVerticalAxis().getMajorGridLinesFormat().getLineFormat().getFillFormat() instanceof GradientFill);
        assertTrue(chart.getAxes().getVerticalAxis().getMinorGridLinesFormat().getLineFormat().getFillFormat() instanceof NoFill);
    }

    @Test
    public void chartSeriesGroupsTest() throws ApiException, IOException {
        initialize(null, null, null, null);
        Chart chart = (Chart)api.getShape(c_fileName, c_slideIndex, c_shapeIndex, c_password, c_folderName, null, null);
        assertEquals(1, chart.getSeriesGroups().size());
        ChartSeriesGroup seriesGroup = chart.getSeriesGroups().get(0);
        seriesGroup.setOverlap(10);
        chart = api.setChartSeriesGroup(c_fileName, c_slideIndex, c_shapeIndex, c_seriesGroupIndex,
                seriesGroup, c_password, c_folderName, null);
        int overlap = chart.getSeriesGroups().get(0).getOverlap();
        assertEquals(10, overlap);
    }

    @Test
    public void setChartLegend() throws ApiException {
        initialize(null, null, null, null);
        Legend legend = new Legend();
        legend.setOverlay(true);
        SolidFill fillFormat = new SolidFill();
        fillFormat.setColor(c_color);
        legend.setFillFormat(fillFormat);

        Legend response = api.setChartLegend(c_fileName, c_slideIndex, c_shapeIndex, legend, c_password, c_folderName,
                null);
        assertEquals(response.getFillFormat().getType(), FillFormat.TypeEnum.SOLID);
        assertTrue(response.isOverlay());
    }

    @Test
    public void setChartAxis() throws ApiException {
        initialize(null, null, null, null);
        Axis axis = new Axis();
        axis.setHasTitle(true);
        axis.setIsAutomaticMaxValue(false);
        axis.setMaxValue(10.0);

        Axis response = api.setChartAxis(c_fileName, c_slideIndex, c_shapeIndex, AxisType.VERTICALAXIS, axis, c_password, c_folderName,
                null);
        assertTrue(response.isHasTitle());

        assertEquals(axis.getMaxValue(), response.getMaxValue());
    }

    @Test
    public void setChartWall() throws ApiException {
        initialize(null, null, null, null);
        ChartWall wall = new ChartWall();
        SolidFill fillFormat = new SolidFill();
        fillFormat.setColor(c_color);
        wall.setFillFormat(fillFormat);

        ChartWall response = api.setChartWall(c_fileName, c_slideIndex, c_shapeIndex, ChartWallType.BACKWALL , wall,
                c_password, c_folderName,null);
        assertEquals(response.getFillFormat().getType(), FillFormat.TypeEnum.SOLID);
    }

    @Test
    public void updateDataPointFormat() throws ApiException {
        initialize(null, null, null, null);
        int slideIndex = 8;
        int shapeIndex = 2;

        OneValueChartDataPoint dto = new OneValueChartDataPoint();
        dto.setValue(40.0);
        SolidFill fillFormat = new SolidFill();
        fillFormat.setColor(c_color);
        LineFormat lineFormat = new LineFormat();
        SolidFill lineFillFormat = new SolidFill();
        lineFillFormat.setColor(c_color);
        lineFormat.setFillFormat(lineFillFormat);
        EffectFormat effectFormat = new EffectFormat();
        BlurEffect blur = new BlurEffect();
        blur.setGrow(true);
        blur.setRadius(5.0);
        effectFormat.setBlur(blur);

        dto.setFillFormat(fillFormat);
        dto.setLineFormat(lineFormat);
        dto.setEffectFormat(effectFormat);

        Chart chart = api.updateChartDataPoint(c_fileName, slideIndex, shapeIndex, c_seriesIndex, c_dataPointIndex, dto,
                c_password, c_folderName,null);
        OneValueSeries series = (OneValueSeries)chart.getSeries().get(c_seriesIndex - 1);
        OneValueChartDataPoint dataPoint = series.getDataPoints().get(c_dataPointIndex - 1);
        assertEquals(dataPoint.getFillFormat().getType(), FillFormat.TypeEnum.SOLID);
        assertEquals(dataPoint.getLineFormat().getFillFormat().getType(), FillFormat.TypeEnum.SOLID);
        assertNotNull(dataPoint.getEffectFormat().getBlur());
    }

    @Test
    public void chartFormulasTest() throws ApiException, IOException {
        initialize(null, null, null, null);
        Chart dto = new Chart();
        dto.setChartType(Chart.ChartTypeEnum.CLUSTEREDCOLUMN);
        dto.setWidth(400.0);
        dto.setHeight(300.0);

        Workbook dataSourceForCategories = new Workbook();
        dataSourceForCategories.setWorksheetIndex(1);
        dataSourceForCategories.setColumnIndex(1);
        dataSourceForCategories.setRowIndex(2);
        dto.setDataSourceForCategories(dataSourceForCategories);

        ChartCategory category1 = new ChartCategory();
        category1.setValue("Category1");
        ChartCategory category2 = new ChartCategory();
        category2.setValue("Category2");
        ChartCategory category3 = new ChartCategory();
        category3.setValue("Category3");
        List<ChartCategory> categories = new ArrayList<ChartCategory>();
        categories.add(category1);
        categories.add(category2);
        categories.add(category3);
        dto.setCategories(categories);
        List<Series> seriesList = new ArrayList<Series>();

        OneValueSeries series1 = new OneValueSeries();
        Workbook dataSourceForSeries1Name = new Workbook();
        dataSourceForSeries1Name.setWorksheetIndex(1);
        dataSourceForSeries1Name.setColumnIndex(2);
        dataSourceForSeries1Name.setRowIndex(1);
        series1.setDataSourceForSeriesName(dataSourceForSeries1Name);

        Workbook dataSourceForSeries1Values = new Workbook();
        dataSourceForSeries1Values.setWorksheetIndex(1);
        dataSourceForSeries1Values.setColumnIndex(2);
        dataSourceForSeries1Values.setRowIndex(2);
        series1.setDataSourceForSeriesName(dataSourceForSeries1Values);

        series1.setName("Series1");
        List<OneValueChartDataPoint> dataPoints1 = new ArrayList<OneValueChartDataPoint>();
        OneValueChartDataPoint dataPoint11 = new OneValueChartDataPoint();
        dataPoint11.setValue(40.0);
        dataPoints1.add(dataPoint11);
        OneValueChartDataPoint dataPoint12 = new OneValueChartDataPoint();
        dataPoint12.setValue(50.0);
        dataPoints1.add(dataPoint12);
        OneValueChartDataPoint dataPoint13 = new OneValueChartDataPoint();
        dataPoint13.setValueFormula("SUM(B2:B3)");
        dataPoints1.add(dataPoint13);
        series1.setDataPoints(dataPoints1);
        seriesList.add(series1);

        dto.setSeries(seriesList);
        Chart chart = (Chart) api.createShape(c_fileName, c_slideIndex, dto, null, null, c_password,
                c_folderName, null, null);

        assertEquals(90.0, ((OneValueSeries)chart.getSeries().get(0)).getDataPoints().get(2).getValue().doubleValue(), 0);
    }

    private static final String c_color = "#77CEF9";
    private static final String c_folderName = "TempSlidesSDK";
    private static final String c_fileName = "test.pptx";
    private static final String c_password = "password";
    private static final int c_slideIndex = 3;
    private static final int c_shapeIndex = 1;
    private static final int c_seriesIndex = 2;
    private static final int c_categoryIndex = 2;
    private static final int c_dataPointIndex = 2;
    private static final int c_seriesCount = 3;
    private static final int c_categoryCount = 4;
    private static final int c_seriesGroupIndex = 1;
}
