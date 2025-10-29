// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="ImageTests.java">
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
import java.util.zip.ZipFile;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * API tests for image methods
 */
public class ImageTest extends ApiTest {
    @Test
    public void imagesGetTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Images images = testSlidesApi.getPresentationImages(fileName, password, folderName, null);
        Images slideImages = testSlidesApi.getSlideImages(fileName, 1, null, null, password, folderName, null);
        assertTrue(images.getList().size() > slideImages.getList().size());
        Images shapeImages = testSlidesApi.getSlideImages(fileName, 2, 2, null, password, folderName, null);
        assertEquals(1, shapeImages.getList().size());
        Images altImages = testSlidesApi.getSlideImages(fileName, 2, null, "title", password, folderName, null);
        assertEquals(0, altImages.getList().size());
    }

    @Test
    public void imagesDownloadStorageTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        File images = testSlidesApi.downloadImagesDefaultFormat(fileName, password, folderName, null);
        File imagesPng = testSlidesApi.downloadImages(fileName, ImageExportFormat.PNG, password, folderName, null, null);
        assertTrue(images.canRead());
        assertTrue(imagesPng.canRead());
        assertNotEquals(images.length(), imagesPng.length());
        ZipFile zip = new ZipFile(images);
        ZipFile zipPng = new ZipFile(imagesPng);
        assertEquals(zip.size(), zipPng.size());
    }

    @Test
    public void imagesDownloadRequest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + fileName));
        File images = testSlidesApi.downloadImagesDefaultFormatOnline(file, password);
        File imagesPng = testSlidesApi.downloadImagesOnline(file, ImageExportFormat.PNG, password, null);
        assertTrue(images.canRead());
        assertTrue(imagesPng.canRead());
        assertNotEquals(images.length(), imagesPng.length());
        ZipFile zip = new ZipFile(images);
        ZipFile zipPng = new ZipFile(imagesPng);
        assertEquals(zip.size(), zipPng.size());
    }

    @Test
    public void imageDownloadStorageTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        File image = testSlidesApi.downloadImageDefaultFormat(fileName, c_imageIndex, password, folderName, null);
        File imagePng = testSlidesApi.downloadImage(fileName, c_imageIndex, ImageExportFormat.PNG, password, folderName, null, null);
        assertTrue(image.canRead());
        assertTrue(imagePng.canRead());
        assertNotEquals(image.length(), imagePng.length());
    }

    @Test
    public void imageDownloadRequestTest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + fileName));
        File image = testSlidesApi.downloadImageDefaultFormatOnline(file, c_imageIndex, password);
        File imagePng = testSlidesApi.downloadImageOnline(file, c_imageIndex, ImageExportFormat.PNG, password, null);
        assertTrue(image.canRead());
        assertTrue(imagePng.canRead());
        assertNotEquals(image.length(), imagePng.length());
    }

    @Test
    public void imageDownloadQualityTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        File imageGood = testSlidesApi.downloadImage(fileName, c_imageIndex, ImageExportFormat.JPEG, password, folderName, null, 100);
        File imageBad = testSlidesApi.downloadImage(fileName, c_imageIndex, ImageExportFormat.JPEG, password, folderName, null, 50);
        assertTrue(imageGood.canRead());
        assertTrue(imageBad.canRead());
        assertTrue(imageGood.length() > imageBad.length());
    }

    @Test
    public void imageDownloadQualityUselessTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        File imageGood = testSlidesApi.downloadImage(fileName, c_imageIndex, ImageExportFormat.PNG, password, folderName, null, 100);
        File imageBad = testSlidesApi.downloadImage(fileName, c_imageIndex, ImageExportFormat.PNG, password, folderName, null, 50);
        assertTrue(imageGood.canRead());
        assertTrue(imageBad.canRead());
        assertEquals(imageGood.length(), imageBad.length());
    }

    @Test
    public void replaceImageTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        byte[] imageFile = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_imageFileName));
        testSlidesApi.replaceImage(fileName, c_imageIndex, imageFile, password, folderName, null);
    }

    @Test
    public void replaceImageRequestTest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + fileName));
        byte[] imageFile = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_imageFileName));
        File response = testSlidesApi.replaceImageOnline(file, c_imageIndex, imageFile, password);
        assertNotEquals(response.length(), 0);
    }

    @Test
    public void compressImageTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        testSlidesApi.compressImage(fileName, 2, 2, 150.0, false, password, folderName, null);
    }

    @Test
    public void deletePictureCroppedAreasTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        testSlidesApi.compressImage(fileName, 2, 2, null, true, password, folderName, null);
    }

    @Test
    public void deletePictureCroppedAreasWrongShapeTypeTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        try {
            testSlidesApi.compressImage(fileName, 2, 3, null, true, password, folderName, null);
            fail("compressImage works only with picture frames.");
        } catch (Exception ex) {
            assertTrue(ex instanceof ApiException);
        }
    }

    private final int c_imageIndex = 1;
    private final String c_imageFileName = "watermark.png";
}
