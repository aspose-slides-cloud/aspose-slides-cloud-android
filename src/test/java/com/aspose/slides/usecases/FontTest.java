// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="MergeTest.java">
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
import com.aspose.slides.FileInfo;
import com.aspose.slides.model.FontsData;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FontTest extends ApiTest {
    @Test
    public void fontsGetTest() throws ApiException, IOException {
        initialize(null, null, null, null);
        api.copyFile(tempFolderName + "/" + c_fileName, c_folderName + "/" + c_fileName, null, null, null);
        FontsData response = api.getFonts(c_fileName, c_password, c_folderName, null);
        assertEquals(3, response.getList().size());
    }

    @Test
    public void fontsGetOnlineTest() throws ApiException, IOException {
        initialize(null, null, null, null);
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName));
        FontsData response = api.getFontsOnline(file, c_password);
        assertEquals(3, response.getList().size());
    }

    @Test
    public void fontEmbeddedSetTest() throws ApiException, IOException {
        initialize(null, null, null, null);
        api.copyFile(tempFolderName + "/" + c_fileName, c_folderName + "/" + c_fileName, null, null, null);
        FontsData response = api.setEmbeddedFont(c_fileName, c_fontName, false, c_password, c_folderName, null);
        assertEquals(true, response.getList().get(0).isIsEmbedded());
        assertEquals(null, response.getList().get(1).isIsEmbedded());
        assertEquals(true, response.getList().get(2).isIsEmbedded());
        assertEquals(c_fontName, response.getList().get(2).getFontName());
    }

    @Test
    public void fontEmbeddedSetOnlineTest() throws ApiException, IOException {
        initialize(null, null, null, null);
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName));
        File response = api.setEmbeddedFontOnline(file, c_fontName, false, c_password);
        assertTrue(file.length < response.length());
    }

    @Test
    public void fontEmbeddedDeleteTest() throws ApiException, IOException {
        initialize(null, null, null, null);
        api.copyFile(tempFolderName + "/" + c_fileName, c_folderName + "/" + c_fileName, null, null, null);
        FontsData response = api.setEmbeddedFont(c_fileName, c_fontName, false, c_password, c_folderName, null);
        assertEquals(true, response.getList().get(2).isIsEmbedded());
        response = api.deleteEmbeddedFont(c_fileName, c_fontName, c_password, c_folderName, null);
        assertEquals(null, response.getList().get(2).isIsEmbedded());
    }

    @Test
    public void fontEmbeddedDeleteOnlineTest() throws ApiException, IOException {
        initialize(null, null, null, null);
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName));
        File responseEmbedded = api.setEmbeddedFontOnline(file, c_fontName, false, c_password);
        assertTrue(file.length < responseEmbedded.length());

        FileInputStream fl = new FileInputStream(responseEmbedded);
        byte[] arr = new byte[(int)responseEmbedded.length()];
        fl.read(arr);
        fl.close();
        File responseDeleted = api.deleteEmbeddedFontOnline(arr, c_fontName, c_password);
        assertTrue(responseDeleted.length() < responseEmbedded.length());
    }

    private final String c_fontName = "Calibri";
    private final String c_folderName = "TempSlidesSDK";
    private final String c_fileName = "test.pptx";
    private final String c_password = "password";
}
