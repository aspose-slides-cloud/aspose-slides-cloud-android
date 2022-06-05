// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="ConvertTests.cs">
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
import org.junit.Test;

import com.aspose.slides.ApiTest;
import com.aspose.slides.model.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

/**
 * API tests for convert methods
 */
public class ConvertTest extends ApiTest {
    @Test
    public void convertPostFromRequestTest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName));
        File converted = api.convert(file, c_format, c_password, null, null, null, null);
        assertNotNull(converted);
        assertTrue(converted.length() > 0);
        assertTrue(converted.canRead());
        File convertedSlides = api.convert(file, c_format, c_password, null, null, Arrays.asList( 1, 2 ), null);
        assertNotNull(convertedSlides);
        assertTrue(convertedSlides.length() > 0);
        assertTrue(convertedSlides.canRead());
        assertTrue(converted.length() > convertedSlides.length());
    }

    @Test
    public void convertPutFromRequestTest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName));
        api.convertAndSave(file, c_format, c_outPath, c_password, null, null, null, null);
        ObjectExist exists = api.objectExists(c_outPath, null, null);
        assertTrue(exists.isExists());
    }

    @Test
    public void convertPostFromStorageTest() throws ApiException, IOException {
        String fileName = "test.pdf";
        initialize(null, null, null);
        api.copyFile(tempFolderName + "/" + fileName, c_folderName + "/" + fileName, null, null, null);
        File converted = api.downloadPresentation(fileName, ExportFormat.HTML5, null, c_password, c_folderName, null, null, null);
        assertNotNull(converted);
        assertTrue(converted.length() > 0);
        assertTrue(converted.canRead());
    }

    @Test
    public void convertPutFromStorageTest() throws ApiException, IOException {
        initialize(null, null, null);
        api.savePresentation(c_fileName, c_format, c_outPath, null, c_password, c_folderName, null, null, null);
        ObjectExist exists = api.objectExists(c_outPath, null, null);
        assertTrue(exists.isExists());
    }

    @Test
    public void convertWithOptionsFromRequestTest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName));
        File converted1 = api.convert(file, c_format, c_password, null, null, null, null);
        PdfExportOptions options = new PdfExportOptions();
        options.setDrawSlidesFrame(true);
        File converted2 = api.convert(file, c_format, c_password, null, null, null, options);
        assertNotEquals(converted1.length(), converted2.length());
    }

    @Test
    public void convertWithOptionsFromStorageTest() throws ApiException, IOException {
        ExportFormat format = ExportFormat.PNG;
        initialize(null, null, null);
        File converted1 = api.downloadPresentation(c_fileName, format, null, c_password, c_folderName, null, null, null);
        ImageExportOptions options = new ImageExportOptions();
        options.setWidth(480);
        options.setHeight(360);
        File converted2 = api.downloadPresentation(c_fileName, c_format, options, c_password, c_folderName, null, null, null);
        assertTrue(converted1.length() > converted2.length());
    }

    @Test
    public void convertSlidePostFromRequestTest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName));
        File converted = api.downloadSlideOnline(file, c_slideIndex, c_slideFormat, null, null, c_password, null, null, null);
        assertNotNull(converted);
        assertTrue(converted.length() > 0);
        assertTrue(converted.canRead());
    }

    @Test
    public void convertSlidePutFromRequestTest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName));
        api.saveSlideOnline(file, c_slideIndex, c_slideFormat, c_outPath, null, null, c_password, null, null, null);
        ObjectExist exists = api.objectExists(c_outPath, null, null);
        assertTrue(exists.isExists());
    }

    @Test
    public void convertSlidePostFromStorageTest() throws ApiException, IOException {
        initialize(null, null, null);
        File converted = api.downloadSlide(c_fileName, c_slideIndex, c_slideFormat, null, null, null, c_password, c_folderName, null, null);
        assertNotNull(converted);
        assertTrue(converted.length() > 0);
        assertTrue(converted.canRead());
    }

    @Test
    public void convertSlidePutFromStorageTest() throws ApiException, IOException {
        initialize(null, null, null);
        api.saveSlide(c_fileName, c_slideIndex, c_slideFormat, c_outPath, null, null, null, c_password, c_folderName, null, null);
        ObjectExist exists = api.objectExists(c_outPath, null, null);
        assertTrue(exists.isExists());
    }

    @Test
    public void convertSlideWithOptionsFromRequestTest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName));
        File converted1 = api.downloadSlideOnline(file, c_slideIndex, c_slideFormat, null, null, c_password, null, null, null);
        PdfExportOptions options = new PdfExportOptions();
        options.setDrawSlidesFrame(true);
        File converted2 = api.downloadSlideOnline(file, c_slideIndex, c_slideFormat, null, null, c_password, null, null, options);
        assertNotEquals(converted1.length(), converted2.length());
    }

    @Test
    public void convertSlideWithOptionsFromStorageTest() throws ApiException, IOException {
        initialize(null, null, null);
        File converted1 = api.downloadSlide(c_fileName, c_slideIndex, c_slideFormat, null, null, null, c_password, c_folderName, null, null);
        PdfExportOptions options = new PdfExportOptions();
        options.setDrawSlidesFrame(true);
        File converted2 = api.downloadSlide(c_fileName, c_slideIndex, c_slideFormat, options, null, null, c_password, c_folderName, null, null);
        assertNotEquals(converted1.length(), converted2.length());
    }

    @Test
    public void convertShapePostFromRequestTest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName));
        File converted = api.downloadShapeOnline(file, c_slideIndex, c_shapeIndex, c_shapeFormat, null, null, null, c_password, null, null, null);
        assertNotNull(converted);
        assertTrue(converted.length() > 0);
        assertTrue(converted.canRead());
    }

    @Test
    public void convertShapePutFromRequestTest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName));
        api.saveShapeOnline(file, c_slideIndex, c_shapeIndex, c_shapeFormat, c_outPath, null, null, null, c_password, null, null, null);
        ObjectExist exists = api.objectExists(c_outPath, null, null);
        assertTrue(exists.isExists());
    }

    @Test
    public void convertShapePostFromStorageTest() throws ApiException, IOException {
        initialize(null, null, null);
        File converted = api.downloadShape(c_fileName, c_slideIndex, c_shapeIndex, c_shapeFormat, null, null, null, null, c_password, c_folderName, null, null);
        assertNotNull(converted);
        assertTrue(converted.length() > 0);
        assertTrue(converted.canRead());
    }

    @Test
    public void convertSubshapePostFromStorageTest() throws ApiException, IOException {
        initialize(null, null, null);
        File converted = api.downloadSubshape(c_fileName, c_slideIndex, "4/shapes",1, c_shapeFormat, null, null, null, null, c_password, c_folderName, null, null);
        assertNotNull(converted);
        assertTrue(converted.length() > 0);
        assertTrue(converted.canRead());
    }

    @Test
    public void convertShapePutFromStorageTest() throws ApiException, IOException {
        initialize(null, null, null);
        api.saveShape(c_fileName, c_slideIndex, c_shapeIndex, c_shapeFormat, c_outPath, null, null, null, null, c_password, c_folderName, null, null);
        ObjectExist exists = api.objectExists(c_outPath, null, null);
        assertTrue(exists.isExists());
    }

    @Test
    public void convertSubshapePutFromStorageTest() throws ApiException, IOException {
        initialize(null, null, null);
        api.saveSubshape(c_fileName, c_slideIndex, "4/shapes", 1, c_shapeFormat, c_outPath, null, null, null, null, c_password, c_folderName, null, null);
        ObjectExist exists = api.objectExists(c_outPath, null, null);
        assertTrue(exists.isExists());
    }

    @Test
    public void convertWithFontFallBackRulesTest() throws ApiException, IOException {
        initialize(null, null, null);

        ArrayList<FontFallbackRule> fontRules = new ArrayList<FontFallbackRule>();

        FontFallbackRule fontFallbackRule1 = new FontFallbackRule();
        fontFallbackRule1.setRangeStartIndex(c_startUnicodeIndex);
        fontFallbackRule1.setRangeEndIndex(c_endUnicodeIndex);
        fontFallbackRule1.setFallbackFontList(Arrays.asList("Vijaya"));
        fontRules.add(fontFallbackRule1);

        FontFallbackRule fontFallbackRule2 = new FontFallbackRule();
        fontFallbackRule2.setRangeStartIndex(c_startUnicodeIndex);
        fontFallbackRule2.setRangeEndIndex(c_endUnicodeIndex);
        fontFallbackRule2.setFallbackFontList(Arrays.asList("Segoe UI Emoji", "Segoe UI Symbol", "Arial"));
        fontRules.add(fontFallbackRule2);

        ImageExportOptions exportOptions = new ImageExportOptions();
        exportOptions.setFontFallbackRules(fontRules);

        File response = api.downloadPresentation(c_fileName, ExportFormat.PNG, exportOptions, c_password, c_folderName, null, null, null);
        assertNotNull(response);
        assertTrue(response.length()>0);
    }

    private final String c_folderName = "TempSlidesSDK";
    private final String c_fileName = "test.pptx";
    private final String c_password = "password";
    private final String c_outPath = c_folderName + "/converted.pdf";
    private final int c_slideIndex = 1;
    private final int c_shapeIndex = 3;
    private final ExportFormat c_format = ExportFormat.PDF;
    private final SlideExportFormat c_slideFormat = SlideExportFormat.PDF;
    private final ShapeExportFormat c_shapeFormat = ShapeExportFormat.PNG;
    private final int c_startUnicodeIndex = 0x0B80;
    private final int c_endUnicodeIndex = 0x0BFF;
}
