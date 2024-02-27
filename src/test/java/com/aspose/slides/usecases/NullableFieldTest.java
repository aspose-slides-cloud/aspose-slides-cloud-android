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

package com.aspose.slides.usecases;

import com.aspose.slides.ApiException;
import org.junit.Test;

import com.aspose.slides.ApiTest;
import com.aspose.slides.model.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertTrue;

/**
 * API tests for nullable field deserialization
 */
public class NullableFieldTest extends ApiTest {
    /**
     * Read slide placeholder info.
     * @throws ApiException
     * @throws java.io.IOException
     */
    @Test
    public void defaultChartValuesTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        double min1  = 44.3;
        double min2 = 12;
        double max1 = 104.3;
        double max2 = 87;
        testSlidesApi.copyFile("TempTests/" + fileName, folderName + "/" + fileName, null, null, null);

        Chart testDto = new Chart();
        testDto.setChartType(Chart.ChartTypeEnum.LINE);
        testDto.setWidth(400.0);
        testDto.setHeight(300.0);
        ChartTitle testTitle = new ChartTitle();
        testTitle.setHasTitle(true);
        testTitle.setText("MyTitle");
        testDto.setTitle(testTitle);

        ChartCategory category1 = new ChartCategory();
        category1.setValue("Category1");
        ChartCategory category2 = new ChartCategory();
        category2.setValue("Category2");
        List<ChartCategory> categories = new ArrayList<ChartCategory>();
        categories.add(category1);
        categories.add(category2);
        testDto.setCategories(categories);

        OneValueSeries testSeries = new OneValueSeries();
        testSeries.setType(OneValueSeries.TypeEnum.CLUSTEREDCOLUMN);
        testSeries.setName("Series1");
        OneValueChartDataPoint testPoint1 = new OneValueChartDataPoint();
        testPoint1.setValue(40.0);
        OneValueChartDataPoint testPoint2 = new OneValueChartDataPoint();
        testPoint2.setValue(50.0);
        List<OneValueChartDataPoint> points = new ArrayList<OneValueChartDataPoint>();
        points.add(testPoint1);
        points.add(testPoint2);
        testSeries.setDataPoints(points);
        List<Series> series = new ArrayList<Series>();
        series.add(testSeries);
        testDto.setSeries(series);
        Axes testAxes = new Axes();
        Axis testAxis = new Axis();
        testAxis.setIsAutomaticMinValue(false);
        testAxis.setMinValue(min1);
        testAxis.setIsAutomaticMaxValue(false);
        testAxis.setMaxValue(max1);
        testAxes.setHorizontalAxis(testAxis);
        testDto.setAxes(testAxes);
        testSlidesApi.createShape(fileName, 1, testDto, null, null, password, folderName, null, null);
        ShapeBase result = testSlidesApi.getShape(fileName, 1, 5, password, folderName, null, null);
        assertTrue(((Chart)result).getAxes().getHorizontalAxis().getMinValue() == min1);
        assertTrue(((Chart)result).getAxes().getHorizontalAxis().getMaxValue() == max1);

        testDto = new Chart();
        testAxes = new Axes();
        testAxis = new Axis();
        testAxis.setMinValue(min2);
        testAxes.setHorizontalAxis(testAxis);
        testDto.setAxes(testAxes);
        testSlidesApi.updateShape(fileName, 1, 5, testDto, password, folderName, null, null);

        result = testSlidesApi.getShape(fileName, 1, 5, password, folderName, null, null);
        assertTrue(((Chart)result).getAxes().getHorizontalAxis().getMinValue() == min2);
        assertTrue(((Chart)result).getAxes().getHorizontalAxis().getMaxValue() == max1);

        testAxis = new Axis();
        testAxis.setMaxValue(max2);
        testAxes.setHorizontalAxis(testAxis);
        testSlidesApi.updateShape(fileName, 1, 5, testDto, password, folderName, null, null);

        result = testSlidesApi.getShape(fileName, 1, 5, password, folderName, null, null);
        assertTrue(((Chart)result).getAxes().getHorizontalAxis().getMinValue() == min2);
        assertTrue(((Chart)result).getAxes().getHorizontalAxis().getMaxValue() == max2);
    }
}
