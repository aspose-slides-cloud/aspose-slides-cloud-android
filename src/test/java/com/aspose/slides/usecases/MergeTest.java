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
import org.junit.Test;

import com.aspose.slides.ApiTest;
import com.aspose.slides.FileInfo;
import com.aspose.slides.model.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

/**
 * API tests for merge methods
 */
public class MergeTest extends ApiTest {
    @Test
    public void mergeTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        testSlidesApi.copyFile(tempFolderName + "/" + c_fileName2, folderName + "/" + c_fileName2, null, null, null);
        testSlidesApi.copyFile(tempFolderName + "/" + c_fileNamePdf, folderName + "/" + c_fileNamePdf, null, null, null);
        PresentationsMergeRequest request = new PresentationsMergeRequest();
        List<String> items = new ArrayList<String>();
        items.add(folderName + "/" + c_fileName2);
        items.add(folderName + "/" + c_fileNamePdf);
        request.setPresentationPaths(items);
        testSlidesApi.merge(fileName, request, password, folderName, null);
    }

    @Test
    public void orderedMergeTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        testSlidesApi.copyFile(tempFolderName + "/" + c_fileName2, folderName + "/" + c_fileName2, null, null, null);
        OrderedMergeRequest request = new OrderedMergeRequest();
        PresentationToMerge presentation = new PresentationToMerge();
        presentation.setPath(folderName + "/" + c_fileName2);
        presentation.setSlides(Arrays.asList( 2, 1 ));
        request.setPresentations(Arrays.asList( presentation ));
        testSlidesApi.orderedMerge(fileName, request, password, folderName, null);
    }

    @Test
    public void mergeOnlineTest() throws ApiException, IOException {
        FileInfo file1 = new FileInfo();
        file1.setName(fileName);
        file1.setData(Files.readAllBytes(Paths.get(testDataFolderName + "/TemplateCV.pptx")));
        FileInfo file2 = new FileInfo();
        file2.setName(c_fileName2);
        file2.setData(Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName2)));
        List<FileInfo> files = Arrays.asList(file1, file2);
        testSlidesApi.mergeOnline(files, null, null);
    }

    @Test
    public void mergeAndSaveOnlineTest() throws ApiException, IOException {
        FileInfo file1 = new FileInfo();
        file1.setName(fileName);
        file1.setData(Files.readAllBytes(Paths.get(testDataFolderName + "/TemplateCV.pptx")));
        FileInfo file2 = new FileInfo();
        file2.setName(c_fileName2);
        file2.setData(Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName2)));
        List<FileInfo> files = new ArrayList<FileInfo>();
        files.add(file1);
        files.add(file2);
        testSlidesApi.mergeAndSaveOnline(c_outPath, files, null, null);
        ObjectExist exists = testSlidesApi.objectExists(c_outPath, null, null);
        assertTrue(exists.isExists());
    }

    @Test
    public void mergeOnlineWithRequestTest() throws ApiException, IOException {
        FileInfo file1 = new FileInfo();
        file1.setName(fileName);
        file1.setData(Files.readAllBytes(Paths.get(testDataFolderName + "/" + fileName)));
        FileInfo file2 = new FileInfo();
        file2.setName(c_fileName2);
        file2.setData(Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName2)));
        List<FileInfo> files = new ArrayList<FileInfo>();
        files.add(file1);
        files.add(file2);
        OrderedMergeRequest request = new OrderedMergeRequest();
        PresentationToMerge presentation1 = new PresentationToMerge();
        presentation1.setPath(fileName);
        presentation1.setPassword(password);
        PresentationToMerge presentation2 = new PresentationToMerge();
        presentation2.setPath(c_fileName2);
        presentation2.setSlides(Arrays.asList( 1, 2 ));
        request.setPresentations(Arrays.asList( presentation1, presentation2 ));
        testSlidesApi.mergeOnline(files, request, null);
    }

    @Test
    public void mergeOnlineCombinedTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + c_fileName2, folderName + "/" + c_fileName2, null, null, null);
        FileInfo file1 = new FileInfo();
        file1.setName(fileName);
        file1.setData(Files.readAllBytes(Paths.get(testDataFolderName + "/" + fileName)));
        List<FileInfo> files = new ArrayList<FileInfo>();
        files.add(file1);
        OrderedMergeRequest request = new OrderedMergeRequest();
        PresentationToMerge presentation1 = new PresentationToMerge();
        presentation1.setPath(fileName);
        presentation1.setPassword(password);
        PresentationToMerge presentation2 = new PresentationToMerge();
        presentation2.setPath(folderName + "/" + c_fileName2);
        presentation2.setSource(PresentationToMerge.SourceEnum.STORAGE);
        presentation2.setSlides(Arrays.asList( 1, 2 ));
        request.setPresentations(Arrays.asList( presentation1, presentation2 ));
        testSlidesApi.mergeOnline(files, request, null);
    }

    @Test
    public void MergeOnlineUrl() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        OrderedMergeRequest request = new OrderedMergeRequest();
        PresentationToMerge presentation1 = new PresentationToMerge();
        presentation1.setPath(folderName + "/" + fileName);
        presentation1.setPassword(password);
        presentation1.setSlides(Arrays.asList( 1, 2 ));
        presentation1.setSource(PresentationToMerge.SourceEnum.STORAGE);

        PresentationToMerge presentation2 = new PresentationToMerge();
        presentation2.setPath(c_url);
        presentation2.setSource(PresentationToMerge.SourceEnum.URL);
        presentation2.setSlides(Arrays.asList( 1 ));
        request.setPresentations(Arrays.asList( presentation1, presentation2 ));

        testSlidesApi.mergeOnline(null, request, null);
    }

    private final String c_url = "https://drive.google.com/uc?export=download&id=1ycMzd7e--Ro9H8eH2GL5fPP7-2HjX4My";
    private final String c_fileName2 = "test-unprotected.pptx";
    private final String c_fileNamePdf = "test.pdf";
    private final String c_outPath = testDataFolderName + "/merged.pptx";
}
