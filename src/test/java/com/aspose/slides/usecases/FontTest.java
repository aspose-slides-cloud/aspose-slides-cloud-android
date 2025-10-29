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
import com.aspose.slides.model.*;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FontTest extends ApiTest {
    @Test
    public void getAvailableFontsTest() throws ApiException, IOException {
        FontsData response = testSlidesApi.getAvailableFonts(null, null);
        assertTrue(response.getList().size() > 1);
        assertTrue(response.getList().get(0).getIsCustom() == null);
    }

    @Test
    public void getFontsTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        FontsData response = testSlidesApi.getFonts(fileName, password, folderName, null);
        assertEquals(4, response.getList().size());
    }

    @Test
    public void getFontsOnlineTest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + fileName));
        FontsData response = testSlidesApi.getFontsOnline(file, password);
        assertEquals(4, response.getList().size());
    }

    @Test
    public void setEmbeddedFontTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        FontsData response = testSlidesApi.setEmbeddedFont(fileName, c_fontName, false, password, folderName, null, null);
        assertNull(response.getList().get(0).getIsEmbedded());
        assertEquals(true, response.getList().get(1).getIsEmbedded());
        assertEquals(true, response.getList().get(2).getIsEmbedded());
        assertEquals(c_fontName, response.getList().get(2).getFontName());
    }

    @Test
    public void setEmbeddedFontOnlineTest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + fileName));
        File response = testSlidesApi.setEmbeddedFontOnline(file, c_fontName, false, password, null);
        assertTrue(file.length < response.length());
    }

    @Test
    public void setEmbeddedFontsTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        ArrayList fonts = new ArrayList(Arrays.asList(c_fontName));
        FontsData response = testSlidesApi.setEmbeddedFonts(fileName, null, fonts, false, password, folderName, null);
        assertNull(response.getList().get(0).getIsEmbedded());
        assertEquals(true, response.getList().get(1).getIsEmbedded());
        assertEquals(true, response.getList().get(2).getIsEmbedded());
        assertEquals(c_fontName, response.getList().get(2).getFontName());
    }

    @Test
    public void setEmbeddedFontsFromRequestTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        FileInfo file1 = new FileInfo();
        file1.setName(c_fontFileName);
        file1.setData(Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fontFileName)));
        List<FileInfo> fontFiles = new ArrayList<FileInfo>();
        fontFiles.add(file1);
        FontsData response = testSlidesApi.setEmbeddedFonts(fileName, fontFiles, null, false, password, folderName, null);
        assertNull(response.getList().get(0).getIsEmbedded());
        assertEquals(true, response.getList().get(1).getIsEmbedded());
        assertEquals(true, response.getList().get(2).getIsEmbedded());
        assertEquals(c_fontName, response.getList().get(2).getFontName());
    }

    @Test
    public void setEmbeddedFontsOnlineTest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + fileName));
        ArrayList fonts = new ArrayList(Arrays.asList(c_fontName));
        File response = testSlidesApi.setEmbeddedFontsOnline(file, null, fonts, false, password);
        assertTrue(file.length < response.length());
    }

    @Test
    public void setEmbeddedFontsFromRequestOnlineTest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + fileName));
        FileInfo file1 = new FileInfo();
        file1.setName(c_fontFileName);
        file1.setData(Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fontFileName)));
        List<FileInfo> fontFiles = new ArrayList<FileInfo>();
        fontFiles.add(file1);
        File response = testSlidesApi.setEmbeddedFontsOnline(file, fontFiles, null, false, password);
        assertTrue(file.length < response.length());
    }

    @Test
    public void compressEmbeddedFontsTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        FontsData response = testSlidesApi.setEmbeddedFont(fileName, c_fontName, false, password, folderName, null, null);
        assertEquals(true, response.getList().get(2).getIsEmbedded());
        //In a real world example, you would rather get the same result by calling SetEmbeddedFont with onlyUsed = true
        testSlidesApi.compressEmbeddedFonts(fileName, password, folderName, null);
    }

    @Test
    public void compressEmbeddedFontsOnlineTest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + fileName));
        File responseEmbedded = testSlidesApi.setEmbeddedFontOnline(file, c_fontName, false, password, null);
        assertTrue(file.length < responseEmbedded.length());

        FileInputStream fl = new FileInputStream(responseEmbedded);
        byte[] arr = new byte[(int)responseEmbedded.length()];
        fl.read(arr);
        fl.close();
        //In a real world example, you would rather get the same result by calling SetEmbeddedFontOnline with onlyUsed = true
        File responseCompressed = testSlidesApi.compressEmbeddedFontsOnline(arr, password);
        assertTrue(responseCompressed.length() < responseEmbedded.length());
    }

    @Test
    public void deleteEmbeddedFontTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        FontsData response = testSlidesApi.setEmbeddedFont(fileName, c_fontName, false, password, folderName, null, null);
        assertEquals(true, response.getList().get(2).getIsEmbedded());
        response = testSlidesApi.deleteEmbeddedFont(fileName, c_fontName, password, folderName, null);
        assertEquals(null, response.getList().get(2).getIsEmbedded());
    }

    @Test
    public void deleteEmbeddedFontOnlineTest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + fileName));
        File responseEmbedded = testSlidesApi.setEmbeddedFontOnline(file, c_fontName, false, password, null);
        assertTrue(file.length < responseEmbedded.length());

        FileInputStream fl = new FileInputStream(responseEmbedded);
        byte[] arr = new byte[(int)responseEmbedded.length()];
        fl.read(arr);
        fl.close();
        File responseDeleted = testSlidesApi.deleteEmbeddedFontOnline(arr, c_fontName, password);
        assertTrue(responseDeleted.length() < responseEmbedded.length());
    }

    @Test
    public void replaceFontTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        FontsData response = testSlidesApi.replaceFont(fileName, c_fontName, c_fontNameTimes, true, password, folderName, null, null);
        assertEquals(true, response.getList().get(2).getIsEmbedded());
        assertEquals(c_fontNameTimes, response.getList().get(2).getFontName());
    }

    @Test
    public void replaceFontOnlineTest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + fileName));
        File response = testSlidesApi.replaceFontOnline(file, c_fontName, c_fontNameTimes, true, password, null);
        assertTrue(file.length < response.length());
    }

    @Test
    public void fontSubstitutionTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        FontSubstRule rule1 = new FontSubstRule();
        rule1.setSourceFont("Arial");
        rule1.setTargetFont(c_fontNameTimes);
        rule1.setNotFoundOnly(false);
        FontSubstRule rule2 = new FontSubstRule();
        rule2.setSourceFont(c_fontName);
        rule2.setTargetFont(c_fontNameTimes);
        ArrayList<FontSubstRule> rules = new ArrayList<FontSubstRule>();
        rules.add(rule1);
        rules.add(rule2);

        ImageExportOptions exportOptions = new ImageExportOptions();
        exportOptions.setFontSubstRules(rules);

        File response = testSlidesApi.downloadPresentation(fileName, ExportFormat.PNG, exportOptions, password, folderName, null, null, null);
        assertTrue(response.length() > 0);
    }

    private final String c_fontName = "Calibri";
    private final String c_fontNameTimes = "Times New Roman";
    private final String c_fontFileName = "calibri.ttf";
}
