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
import com.aspose.slides.FileInfo;
import com.aspose.slides.model.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * API tests for convert methods
 */
public class AsyncApiTest extends ApiTest {
    @Test
    public void asyncConvertTest() throws ApiException, IOException, InterruptedException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + fileName));
        String operationId = testSlidesAsyncApi.startConvert(file, c_format, password, null, null, null, null);

        Operation operation = null;
        for (int i = 0; i < c_maxTries; i++)
        {
            TimeUnit.SECONDS.sleep(c_sleepTimeout);
            operation = testSlidesAsyncApi.getOperationStatus(operationId);
            if (operation.getStatus() != Operation.StatusEnum.CREATED
                && operation.getStatus() != Operation.StatusEnum.ENQUEUED
                && operation.getStatus() != Operation.StatusEnum.STARTED)
            {
                break;
            }
        }

        assertEquals(Operation.StatusEnum.FINISHED, operation.getStatus());
        assertNull(operation.getError());

        File converted = testSlidesAsyncApi.getOperationResult(operationId);
        assertTrue(converted.length() > 0);
        assertTrue(converted.canRead());
    }

    @Test
    public void asyncDownloadPresentationTest() throws ApiException, IOException, InterruptedException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        String operationId = testSlidesAsyncApi.startDownloadPresentation(fileName, c_format, null, password, folderName, null, null, null);

        Operation operation = null;
        for (int i = 0; i < c_maxTries; i++)
        {
            TimeUnit.SECONDS.sleep(c_sleepTimeout);
            operation = testSlidesAsyncApi.getOperationStatus(operationId);
            if (operation.getStatus() != Operation.StatusEnum.CREATED
                && operation.getStatus() != Operation.StatusEnum.ENQUEUED
                && operation.getStatus() != Operation.StatusEnum.STARTED)
            {
                break;
            }
        }

        assertEquals(Operation.StatusEnum.FINISHED, operation.getStatus());
        assertNull(operation.getError());

        File converted = testSlidesAsyncApi.getOperationResult(operationId);
        assertTrue(converted.length() > 0);
        assertTrue(converted.canRead());
    }

    @Test
    public void asyncConvertAndSaveTest() throws ApiException, IOException, InterruptedException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + fileName));
        String operationId = testSlidesAsyncApi.startConvertAndSave(file, c_format, c_outPath, password, null, null, null, null);

        Operation operation = null;
        for (int i = 0; i < c_maxTries; i++)
        {
            TimeUnit.SECONDS.sleep(c_sleepTimeout);
            operation = testSlidesAsyncApi.getOperationStatus(operationId);
            if (operation.getStatus() != Operation.StatusEnum.CREATED
                && operation.getStatus() != Operation.StatusEnum.ENQUEUED
                && operation.getStatus() != Operation.StatusEnum.STARTED)
            {
                break;
            }
        }

        assertEquals(Operation.StatusEnum.FINISHED, operation.getStatus());
        assertNull(operation.getError());

        ObjectExist exists = testSlidesApi.objectExists(c_outPath, null, null);
        assertTrue(exists.isExists());
    }

    @Test
    public void asyncSavePresentationTest() throws ApiException, IOException, InterruptedException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        String operationId = testSlidesAsyncApi.startSavePresentation(fileName, c_format, c_outPath, null, password, folderName, null, null, null);

        Operation operation = null;
        for (int i = 0; i < c_maxTries; i++)
        {
            TimeUnit.SECONDS.sleep(c_sleepTimeout);
            operation = testSlidesAsyncApi.getOperationStatus(operationId);
            if (operation.getStatus() != Operation.StatusEnum.CREATED
                && operation.getStatus() != Operation.StatusEnum.ENQUEUED
                && operation.getStatus() != Operation.StatusEnum.STARTED)
            {
                break;
            }
        }

        assertEquals(Operation.StatusEnum.FINISHED, operation.getStatus());
        assertNull(operation.getError());

        ObjectExist exists = testSlidesApi.objectExists(c_outPath, null, null);
        assertTrue(exists.isExists());
    }

    @Test
    public void asyncMergeTest() throws ApiException, IOException, InterruptedException {
        FileInfo file1 = new FileInfo();
        file1.setName(fileName);
        file1.setData(Files.readAllBytes(Paths.get(testDataFolderName + "/TemplateCV.pptx")));
        FileInfo file2 = new FileInfo();
        file2.setName(c_fileName2);
        file2.setData(Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName2)));
        List<FileInfo> files = Arrays.asList(file1, file2);
        String operationId = testSlidesAsyncApi.startMerge(files, null, null);

        Operation operation = null;
        for (int i = 0; i < c_maxTries; i++)
        {
            TimeUnit.SECONDS.sleep(c_sleepTimeout);
            operation = testSlidesAsyncApi.getOperationStatus(operationId);
            if (operation.getStatus() != Operation.StatusEnum.CREATED
                && operation.getStatus() != Operation.StatusEnum.ENQUEUED
                && operation.getStatus() != Operation.StatusEnum.STARTED)
            {
                break;
            }
        }

        assertEquals(Operation.StatusEnum.FINISHED, operation.getStatus());
        assertNotNull(operation.getProgress());
        assertEquals(2, (int)operation.getProgress().getStepCount());
        assertEquals(operation.getProgress().getStepCount(), operation.getProgress().getStepIndex());
        assertNull(operation.getError());

        File merged = testSlidesAsyncApi.getOperationResult(operationId);
        assertTrue(merged.length() > 0);
        assertTrue(merged.canRead());
    }

    @Test
    public void asyncMergeAndSaveTest() throws ApiException, IOException, InterruptedException {
        FileInfo file1 = new FileInfo();
        file1.setName(fileName);
        file1.setData(Files.readAllBytes(Paths.get(testDataFolderName + "/TemplateCV.pptx")));
        FileInfo file2 = new FileInfo();
        file2.setName(c_fileName2);
        file2.setData(Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName2)));
        List<FileInfo> files = Arrays.asList(file1, file2);
        String operationId = testSlidesAsyncApi.startMergeAndSave(c_outPath, files, null, null);

        Operation operation = null;
        for (int i = 0; i < c_maxTries; i++)
        {
            TimeUnit.SECONDS.sleep(c_sleepTimeout);
            operation = testSlidesAsyncApi.getOperationStatus(operationId);
            if (operation.getStatus() != Operation.StatusEnum.CREATED
                && operation.getStatus() != Operation.StatusEnum.ENQUEUED
                && operation.getStatus() != Operation.StatusEnum.STARTED)
            {
                break;
            }
        }

        assertEquals(Operation.StatusEnum.FINISHED, operation.getStatus());
        assertNotNull(operation.getProgress());
        assertEquals(2, (int)operation.getProgress().getStepCount());
        assertEquals(operation.getProgress().getStepCount(), operation.getProgress().getStepIndex());
        assertNull(operation.getError());

        ObjectExist exists = testSlidesApi.objectExists(c_outPath, null, null);
        assertTrue(exists.isExists());
    }

    @Test
    public void asyncSplitTest() throws ApiException, IOException, InterruptedException {
        String outFolder = "splitResult";
        testSlidesApi.deleteFolder(outFolder, null, true);
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        String operationId = testSlidesAsyncApi.startSplit(fileName, SlideExportFormat.PNG, null, null, null, null, null, outFolder, password, folderName, null, null);

        Operation operation = null;
        for (int i = 0; i < c_maxTries; i++)
        {
            TimeUnit.SECONDS.sleep(c_sleepTimeout);
            operation = testSlidesAsyncApi.getOperationStatus(operationId);
            if (operation.getStatus() != Operation.StatusEnum.CREATED
                && operation.getStatus() != Operation.StatusEnum.ENQUEUED
                && operation.getStatus() != Operation.StatusEnum.STARTED)
            {
                break;
            }
        }

        assertEquals(Operation.StatusEnum.FINISHED, operation.getStatus());
        assertNull(operation.getError());

        ObjectExist exists = testSlidesApi.objectExists(outFolder, null, null);
        assertTrue(exists.isExists());
    }

    @Test
    public void asyncUploadAndSplitTest() throws ApiException, IOException, InterruptedException {
        String outFolder = "splitResult";
        testSlidesApi.deleteFolder(outFolder, null, true);
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + fileName));
        String operationId = testSlidesAsyncApi.startUploadAndSplit(file, SlideExportFormat.PNG, outFolder, null, null, null, null, password, null, null, null);

        Operation operation = null;
        for (int i = 0; i < c_maxTries; i++)
        {
            TimeUnit.SECONDS.sleep(c_sleepTimeout);
            operation = testSlidesAsyncApi.getOperationStatus(operationId);
            if (operation.getStatus() != Operation.StatusEnum.CREATED
                && operation.getStatus() != Operation.StatusEnum.ENQUEUED
                && operation.getStatus() != Operation.StatusEnum.STARTED)
            {
                break;
            }
        }

        assertEquals(Operation.StatusEnum.FINISHED, operation.getStatus());
        assertNull(operation.getError());

        ObjectExist exists = testSlidesApi.objectExists(outFolder, null, null);
        assertTrue(exists.isExists());
    }

    @Test
    public void asyncBadOperationTest() throws ApiException, IOException, InterruptedException {
        String operationId = testSlidesAsyncApi.startDownloadPresentation("IDoNotExist.pptx", c_format, null, null, null, null, null, null);

        Operation operation = null;
        for (int i = 0; i < c_maxTries; i++)
        {
            TimeUnit.SECONDS.sleep(c_sleepTimeout);
            operation = testSlidesAsyncApi.getOperationStatus(operationId);
            if (operation.getStatus() != Operation.StatusEnum.CREATED
                && operation.getStatus() != Operation.StatusEnum.ENQUEUED
                && operation.getStatus() != Operation.StatusEnum.STARTED)
            {
                break;
            }
        }

        assertEquals(Operation.StatusEnum.FAILED, operation.getStatus());
        assertNotNull(operation.getError());
    }

    private final ExportFormat c_format = ExportFormat.PDF;
    private final String c_fileName2 = "test-unprotected.pptx";
    private final String c_outPath = testDataFolderName + "/converted.pdf";
    private final int c_sleepTimeout = 3;
    private final int c_maxTries = 10;
}
