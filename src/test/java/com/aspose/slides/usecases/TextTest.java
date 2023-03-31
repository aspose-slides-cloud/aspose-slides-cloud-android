// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="TextTest.java">
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

import static org.junit.Assert.*;

/**
 * API tests for text methods
 */
public class TextTest extends ApiTest {
    @Test
    public void textGetTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        TextItems presentationItems = api.getPresentationTextItems(fileName, null, password, folderName, null);
        TextItems presentationItemsWithEmpty = api.getPresentationTextItems(fileName, true, password, folderName, null);
        TextItems slideItems = api.getSlideTextItems(fileName, c_slideIndex, null, password, folderName, null);
        TextItems slideItemsWithEmpty = api.getSlideTextItems(fileName, c_slideIndex, true, password, folderName, null);
        assertTrue(presentationItemsWithEmpty.getItems().size() > presentationItems.getItems().size());
        assertTrue(presentationItems.getItems().size() > slideItems.getItems().size());
        assertTrue(slideItemsWithEmpty.getItems().size() > slideItems.getItems().size());
    }

    @Test
    public void textReplaceStorageTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        DocumentReplaceResult result = api.replacePresentationText(fileName, c_oldValue, c_newValue, null, password, folderName, null);

        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        DocumentReplaceResult resultIgnoreCase = api.replacePresentationText(fileName, c_oldValue, c_newValue, true, password, folderName, null);

        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        SlideReplaceResult slideResult = api.replaceSlideText(fileName, c_slideIndex, c_oldValue, c_newValue, null, password, folderName, null);

        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        SlideReplaceResult slideResultIgnoreCase = api.replaceSlideText(fileName, c_slideIndex, c_oldValue, c_newValue, true, password, folderName, null);

        assertTrue(resultIgnoreCase.getMatches() > result.getMatches());
        assertTrue(result.getMatches() > slideResult.getMatches());
        assertTrue(slideResultIgnoreCase.getMatches() > slideResult.getMatches());
    }

    @Test
    public void textReplaceRequestTest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + fileName));
        File result = api.replacePresentationTextOnline(file, c_oldValue, c_newValue, null, password);
        File resultIgnoreCase = api.replacePresentationTextOnline(file, c_oldValue, c_newValue, true, password);
        File slideResult = api.replaceSlideTextOnline(file, c_slideIndex, c_oldValue, c_newValue, null, password);
        File slideResultIgnoreCase = api.replaceSlideTextOnline(file, c_slideIndex, c_oldValue, c_newValue, true, password);
        assertTrue(result.canRead());
        assertTrue(resultIgnoreCase.canRead());
        assertTrue(slideResult.canRead());
        assertTrue(slideResultIgnoreCase.canRead());
    }

    @Test
    public void highlightShapeTextTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        final int shapeIndex = 1, slideIndex = 6, paragraphIndex = 1;
        api.highlightShapeText(fileName, slideIndex, shapeIndex, c_textToHighlight, c_highlightColor, null, false, password, folderName, null);
        Paragraph para = api.getParagraph(fileName, slideIndex, shapeIndex, paragraphIndex, password, folderName, null, null);
        assertNotEquals(para.getPortionList().get(0).getText(), c_textToHighlight);
        assertNotEquals(para.getPortionList().get(0).getHighlightColor(), c_highlightColor);
        assertEquals(para.getPortionList().get(1).getText(), c_textToHighlight);
        assertEquals(para.getPortionList().get(1).getHighlightColor(), c_highlightColor);
    }

    @Test
    public void highlightShapeRegexTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        final int shapeIndex = 1, slideIndex = 6, paragraphIndex = 1;
        api.highlightShapeRegex(fileName, slideIndex, shapeIndex, c_highlightRegex, c_highlightColor, null, false, password, folderName, null);
        Paragraph para = api.getParagraph(fileName, slideIndex, shapeIndex, paragraphIndex, password, folderName, null, null);
        assertNotEquals(para.getPortionList().get(0).getText(), c_textToHighlight);
        assertNotEquals(para.getPortionList().get(0).getHighlightColor(), c_highlightColor);
        assertEquals(para.getPortionList().get(1).getText(), c_textToHighlight);
        assertEquals(para.getPortionList().get(1).getHighlightColor(), c_highlightColor);
    }

    private final String c_oldValue = "text";
    private final String c_newValue = "new_text";
    private final int c_slideIndex = 1;
    private final String c_textToHighlight = "highlight";
    private final String c_highlightColor = "#FFF5FF8A";
    private final String c_highlightRegex = "h.ghl[abci]ght";
}
