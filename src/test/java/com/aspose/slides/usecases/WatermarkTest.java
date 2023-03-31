// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="WatermarkTest.java">
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
import com.aspose.slides.ApiTest;
import com.aspose.slides.model.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import org.apache.commons.io.FileUtils;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

/**
 * API tests for watermark API
 */
public class WatermarkTest extends ApiTest {
    @Test
    public void watermarkTextStorageTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        int shapeCount = api.getShapes(fileName, c_slideIndex, password, folderName, null, null, null).getShapesLinks().size();
        api.createWatermark(fileName, null, null, c_watermarkText, null, null, password, folderName, null);
        assertEquals(shapeCount + 1, api.getShapes(fileName, c_slideIndex, password, folderName, null, null, null).getShapesLinks().size());
        assertEquals(c_watermarkText, ((Shape)api.getShape(fileName, c_slideIndex, shapeCount + 1, password, folderName, null, null)).getText());
        assertEquals(c_watermarkName, ((Shape)api.getShape(fileName, c_slideIndex, shapeCount + 1, password, folderName, null, null)).getName());

        api.deleteWatermark(fileName, null, password, folderName, null);
        assertEquals(shapeCount, api.getShapes(fileName, c_slideIndex, password, folderName, null, null, null).getShapesLinks().size());
    }

    @Test
    public void watermarkDtoStorageTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        int shapeCount = api.getShapes(fileName, c_slideIndex, password, folderName, null, null, null).getShapesLinks().size();
        Shape dto = new Shape();
        dto.setText(c_watermarkText);
        api.createWatermark(fileName, dto, null, null, null, null, password, folderName, null);
        assertEquals(shapeCount + 1, api.getShapes(fileName, c_slideIndex, password, folderName, null, null, null).getShapesLinks().size());
        assertEquals(c_watermarkText, ((Shape)api.getShape(fileName, c_slideIndex, shapeCount + 1, password, folderName, null, null)).getText());
        assertEquals(c_watermarkName, ((Shape)api.getShape(fileName, c_slideIndex, shapeCount + 1, password, folderName, null, null)).getName());

        api.deleteWatermark(fileName, null, password, folderName, null);
        assertEquals(shapeCount, api.getShapes(fileName, c_slideIndex, password, folderName, null, null, null).getShapesLinks().size());
    }

    @Test
    public void watermarkImageStorageTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        int shapeCount = api.getShapes(fileName, c_slideIndex, password, folderName, null, null, null).getShapesLinks().size();
        byte[] watermarkFile = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_watermarkFileName));
        api.createImageWatermark(fileName, watermarkFile, null, password, folderName, null);
        assertEquals(shapeCount + 1, api.getShapes(fileName, c_slideIndex, password, folderName, null, null, null).getShapesLinks().size());
        assertEquals(c_watermarkName, ((Shape)api.getShape(fileName, c_slideIndex, shapeCount + 1, password, folderName, null, null)).getName());

        api.deleteWatermark(fileName, null, password, folderName, null);
        assertEquals(shapeCount, api.getShapes(fileName, c_slideIndex, password, folderName, null, null, null).getShapesLinks().size());
    }

    @Test
    public void watermarkImageDtoStorageTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        int shapeCount = api.getShapes(fileName, c_slideIndex, password, folderName, null, null, null).getShapesLinks().size();
        byte[] watermarkFile = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_watermarkFileName));
        String base64Data = new String(Base64.getEncoder().encode(watermarkFile));
        PictureFrame pictureFrame = new PictureFrame();
        PictureFill fillFormat = new PictureFill();
        fillFormat.setBase64Data(base64Data);
        pictureFrame.setFillFormat(fillFormat);
        api.createImageWatermark(fileName, watermarkFile, null, password, folderName, null);
        assertEquals(shapeCount + 1, api.getShapes(fileName, c_slideIndex, password, folderName, null, null, null).getShapesLinks().size());
        assertEquals(c_watermarkName, ((Shape)api.getShape(fileName, c_slideIndex, shapeCount + 1, password, folderName, null, null)).getName());

        api.deleteWatermark(fileName, null, password, folderName, null);
        assertEquals(shapeCount, api.getShapes(fileName, c_slideIndex, password, folderName, null, null, null).getShapesLinks().size());
    }

    @Test
    public void watermarkTextRequestTest() throws ApiException, IOException {
        byte[] document = Files.readAllBytes(Paths.get(testDataFolderName + "/" + fileName));
        File documentWithWatermarks = api.createWatermarkOnline(document, null, null, c_watermarkText, null, null, password);
        File documentWithNoWatermarks = api.deleteWatermarkOnline(FileUtils.readFileToByteArray(documentWithWatermarks), null, password);
        assertNotEquals(document.length, documentWithWatermarks.length());
        assertTrue(documentWithNoWatermarks.length() < documentWithWatermarks.length());
    }

    @Test
    public void watermarkTextDtoRequestTest() throws ApiException, IOException {
        byte[] document = Files.readAllBytes(Paths.get(testDataFolderName + "/" + fileName));
        Shape dto = new Shape();
        dto.setText(c_watermarkText);
        File documentWithWatermarks = api.createWatermarkOnline(document, dto, null, null, null, null, password);
        File documentWithNoWatermarks = api.deleteWatermarkOnline(FileUtils.readFileToByteArray(documentWithWatermarks), null, password);
        assertNotEquals(document.length, documentWithWatermarks.length());
        assertTrue(documentWithNoWatermarks.length() < documentWithWatermarks.length());
    }

    @Test
    public void watermarkImageRequestTest() throws ApiException, IOException {
        byte[] document = Files.readAllBytes(Paths.get(testDataFolderName + "/" + fileName));
        byte[] watermarkFile = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_watermarkFileName));
        File documentWithWatermarks = api.createImageWatermarkOnline(document, watermarkFile, null, password);
        File documentWithNoWatermarks = api.deleteWatermarkOnline(FileUtils.readFileToByteArray(documentWithWatermarks), null, password);
        assertNotEquals(document.length, documentWithWatermarks.length());
        assertTrue(documentWithNoWatermarks.length() < documentWithWatermarks.length());
    }

    @Test
    public void watermarkImageDtoRequestTest() throws ApiException, IOException {
        byte[] document = Files.readAllBytes(Paths.get(testDataFolderName + "/" + fileName));
        byte[] watermarkFile = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_watermarkFileName));
        String base64Data = new String(Base64.getEncoder().encode(watermarkFile));
        PictureFrame pictureFrame = new PictureFrame();
        PictureFill fillFormat = new PictureFill();
        fillFormat.setBase64Data(base64Data);
        pictureFrame.setFillFormat(fillFormat);
        File documentWithWatermarks = api.createImageWatermarkOnline(document, null, pictureFrame, password);
        File documentWithNoWatermarks = api.deleteWatermarkOnline(FileUtils.readFileToByteArray(documentWithWatermarks), null, password);
        assertNotEquals(document.length, documentWithWatermarks.length());
        assertTrue(documentWithNoWatermarks.length() < documentWithWatermarks.length());
    }

    private final String c_watermarkName = "watermark";
    private final String c_watermarkText = "watermarkText";
    private final String c_watermarkFileName = "watermark.png";
    private final int c_slideIndex = 3;
}
