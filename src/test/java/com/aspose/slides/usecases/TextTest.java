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
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        TextItems presentationItems = testSlidesApi.getPresentationTextItems(fileName, null, password, folderName, null);
        TextItems presentationItemsWithEmpty = testSlidesApi.getPresentationTextItems(fileName, true, password, folderName, null);
        TextItems slideItems = testSlidesApi.getSlideTextItems(fileName, c_slideIndex, null, password, folderName, null);
        TextItems slideItemsWithEmpty = testSlidesApi.getSlideTextItems(fileName, c_slideIndex, true, password, folderName, null);
        assertTrue(presentationItemsWithEmpty.getItems().size() > presentationItems.getItems().size());
        assertTrue(presentationItems.getItems().size() > slideItems.getItems().size());
        assertTrue(slideItemsWithEmpty.getItems().size() > slideItems.getItems().size());
    }

    @Test
    public void textReplaceStorageTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        DocumentReplaceResult result = testSlidesApi.replacePresentationText(fileName, c_oldValue, c_newValue, null, null, password, folderName, null);

        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        DocumentReplaceResult resultRegex = testSlidesApi.replacePresentationRegex(fileName, c_oldValue, c_newValue, null, password, folderName, null);

        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        DocumentReplaceResult resultIgnoreCase = testSlidesApi.replacePresentationText(fileName, c_oldValue, c_newValue, true, null, password, folderName, null);

        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        DocumentReplaceResult resultWholeWords = testSlidesApi.replacePresentationText(fileName, c_oldValue, c_newValue, true, true, password, folderName, null);

        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        SlideReplaceResult slideResult = testSlidesApi.replaceSlideText(fileName, c_slideIndex, c_oldValue, c_newValue, null, password, folderName, null);

        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        SlideReplaceResult slideResultIgnoreCase = testSlidesApi.replaceSlideText(fileName, c_slideIndex, c_oldValue, c_newValue, true, password, folderName, null);

        assertEquals(result.getMatches(), resultRegex.getMatches());
        assertTrue(resultIgnoreCase.getMatches() > result.getMatches());
        assertTrue(resultIgnoreCase.getMatches() > resultWholeWords.getMatches());
        assertTrue(result.getMatches() > slideResult.getMatches());
        assertTrue(slideResultIgnoreCase.getMatches() > slideResult.getMatches());
    }

    @Test
    public void textReplaceRequestTest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + fileName));
        File result = testSlidesApi.replacePresentationTextOnline(file, c_oldValue, c_newValue, null, null, password);
        File resultRegex = testSlidesApi.replacePresentationRegexOnline(file, c_oldValue, c_newValue, null, password);
        File resultIgnoreCase = testSlidesApi.replacePresentationTextOnline(file, c_oldValue, c_newValue, true, null, password);
        File slideResult = testSlidesApi.replaceSlideTextOnline(file, c_slideIndex, c_oldValue, c_newValue, null, password);
        File slideResultIgnoreCase = testSlidesApi.replaceSlideTextOnline(file, c_slideIndex, c_oldValue, c_newValue, true, password);
        assertTrue(result.canRead());
        assertTrue(resultRegex.canRead());
        assertTrue(resultIgnoreCase.canRead());
        assertTrue(slideResult.canRead());
        assertTrue(slideResultIgnoreCase.canRead());
    }

    @Test
    public void replaceTextFormattingTest() throws ApiException, IOException {
        String oldText = "banana";
        String newText = "orange";
        String color = "#FFFFA500";
        int slideIndex = 1;
        int shapeIndex = 1;
        int paragraphIndex = 1;
        int portionIndex = 1;
        Portion portion = new Portion();
        portion.setText(oldText);
        PortionFormat portionFormat = new PortionFormat();
        portionFormat.setFontColor(color);

        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        testSlidesApi.createPortion(fileName, slideIndex, shapeIndex, paragraphIndex, portion, portionIndex, password, folderName, null, null);
        testSlidesApi.replaceTextFormatting(fileName, oldText, newText, portionFormat, false, password, folderName, null);
        Portion updatedPortion = testSlidesApi.getPortion(fileName, slideIndex, shapeIndex, paragraphIndex, portionIndex, password, folderName, null, null);
        assertEquals(newText, updatedPortion.getText());
        assertEquals(color, updatedPortion.getFontColor());
    }

    @Test
    public void replaceTextFormattingOnlineTest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + fileName));
        PortionFormat portionFormat = new PortionFormat();
        portionFormat.setFontColor("#FFFFA500");
        File result = testSlidesApi.replaceTextFormattingOnline(file, "banana", "orange", portionFormat, false, password);
        assertTrue(result.canRead());
    }

    @Test
    public void highlightShapeTextTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        final int shapeIndex = 1, slideIndex = 6, paragraphIndex = 1;
        testSlidesApi.highlightShapeText(fileName, slideIndex, shapeIndex, c_textToHighlight, c_highlightColor, null, false, password, folderName, null);
        Paragraph para = testSlidesApi.getParagraph(fileName, slideIndex, shapeIndex, paragraphIndex, password, folderName, null, null);
        assertNotEquals(para.getPortionList().get(0).getText(), c_textToHighlight);
        assertNotEquals(para.getPortionList().get(0).getHighlightColor(), c_highlightColor);
        assertEquals(para.getPortionList().get(1).getText(), c_textToHighlight);
        assertEquals(para.getPortionList().get(1).getHighlightColor(), c_highlightColor);
    }

    @Test
    public void highlightShapeRegexTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        final int shapeIndex = 1, slideIndex = 6, paragraphIndex = 1;
        testSlidesApi.highlightShapeRegex(fileName, slideIndex, shapeIndex, c_highlightRegex, c_highlightColor, false, password, folderName, null);
        Paragraph para = testSlidesApi.getParagraph(fileName, slideIndex, shapeIndex, paragraphIndex, password, folderName, null, null);
        assertNotEquals(para.getPortionList().get(0).getText(), c_textToHighlight);
        assertNotEquals(para.getPortionList().get(0).getHighlightColor(), c_highlightColor);
        assertEquals(para.getPortionList().get(1).getText(), c_textToHighlight);
        assertEquals(para.getPortionList().get(1).getHighlightColor(), c_highlightColor);
    }

    @Test
    public void highlightPresentationTextTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        DocumentReplaceResult result = testSlidesApi.highlightPresentationText(fileName, c_textToHighlight, c_highlightColor, null, false, password, folderName, null);
        DocumentReplaceResult resultIgnoreCase = testSlidesApi.highlightPresentationText(fileName, c_textToHighlight, c_highlightColor, null, true, password, folderName, null);
        assertEquals(result.getMatches(), resultIgnoreCase.getMatches());

        final int shapeIndex = 1, slideIndex = 6, paragraphIndex = 1;
        Paragraph para = testSlidesApi.getParagraph(fileName, slideIndex, shapeIndex, paragraphIndex, password, folderName, null, null);
        assertNotEquals(para.getPortionList().get(0).getText(), c_textToHighlight);
        assertNotEquals(para.getPortionList().get(0).getHighlightColor(), c_highlightColor);
        assertEquals(para.getPortionList().get(1).getText(), c_textToHighlight);
        assertEquals(para.getPortionList().get(1).getHighlightColor(), c_highlightColor);
    }

    @Test
    public void highlightPresentationRegexTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        DocumentReplaceResult result = testSlidesApi.highlightPresentationRegex(fileName, c_highlightRegex, c_highlightColor, false, password, folderName, null);
        DocumentReplaceResult resultIgnoreCase = testSlidesApi.highlightPresentationRegex(fileName, c_highlightRegex, c_highlightColor, true, password, folderName, null);
        assertEquals(result.getMatches(), resultIgnoreCase.getMatches());

        final int shapeIndex = 1, slideIndex = 6, paragraphIndex = 1;
        Paragraph para = testSlidesApi.getParagraph(fileName, slideIndex, shapeIndex, paragraphIndex, password, folderName, null, null);
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
