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
import java.io.IOException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * API tests for image methods
 */
public class VideoTest extends ApiTest {
    @Test
    public void captionTracksTest() throws ApiException, IOException {
        int slideIndex = 3;
        int shapeIndex = 3;
        String track1Label = "track1";
        String track2Label = "track2";
        String track1Data = "WEBVTT\n\n00:00:00.000 --> 00:00:10.000\nCaption 1 text.";
        String track2Data = "WEBVTT\n\n00:00:00.000 --> 00:00:10.000\nCaption 2 text.";

        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        VideoFrame dto = new VideoFrame();
        dto.setBase64Data("bXAzc2FtcGxl");
        testSlidesApi.createShape(fileName, slideIndex, dto, null, null, password, folderName, null, null);
        CaptionTracks captions = testSlidesApi.getVideoCaptionTracks(fileName, slideIndex, shapeIndex, null, password, folderName, null);
        assertEquals(0, captions.getItems().size());

        testSlidesApi.createVideoCaptionTrack(fileName, slideIndex, shapeIndex, track1Label, track1Data, password, folderName, null);
        testSlidesApi.createVideoCaptionTrack(fileName, slideIndex, shapeIndex, track2Label, track2Data, password, folderName, null);
        captions = testSlidesApi.getVideoCaptionTracks(fileName, slideIndex, shapeIndex, true, password, folderName, null);
        assertEquals(2, captions.getItems().size());
        assertEquals(track1Label, captions.getItems().get(0).getLabel());
        assertEquals(track1Data, captions.getItems().get(0).getDataAsString());
        assertEquals(track2Label, captions.getItems().get(1).getLabel());
        assertEquals(track2Data, captions.getItems().get(1).getDataAsString());

        testSlidesApi.deleteVideoCaptionTrack(fileName, slideIndex, shapeIndex, 1, password, folderName, null);
        captions = testSlidesApi.getVideoCaptionTracks(fileName, slideIndex, shapeIndex, false, password, folderName, null);
        assertEquals(1, captions.getItems().size());
        assertEquals(track2Label, captions.getItems().get(0).getLabel());
        assertNull(captions.getItems().get(0).getDataAsString());

        testSlidesApi.deleteVideoCaptionTracks(fileName, slideIndex, shapeIndex, password, folderName, null);
        captions = testSlidesApi.getVideoCaptionTracks(fileName, slideIndex, shapeIndex, true, password, folderName, null);
        assertEquals(0, captions.getItems().size());
    }
}
