// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="NotesSlideTests.cs">
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
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * API tests for chart methods
 */
public class NotesSlideTest extends ApiTest {
    @Test
    public void notesSlideStorageTest() throws ApiException, IOException {
        initialize(null, null, null);
        NotesSlide notesSlide = api.getNotesSlide(c_fileName, c_slideIndex, c_password, c_folderName, null);
        assertNotNull(notesSlide);
    }

    @Test
    public void notesSlideExistsStorageTest() throws ApiException, IOException {
        initialize(null, null, null);
        EntityExists exists = api.notesSlideExists(c_fileName, c_slideIndex, c_password, c_folderName, null);
        assertNotNull(exists);
    }

    @Test
    public void notesSlideDownloadStorageTest() throws ApiException, IOException {
        initialize(null, null, null);
        File notesSlide = api.downloadNotesSlide(c_fileName, c_slideIndex, c_format, null, null, c_password, c_folderName, null, null);
        assertNotNull(notesSlide);
        assertTrue(notesSlide.length() > 0);
        assertTrue(notesSlide.canRead());
    }

    @Test
    public void notesSlideGetRequestTest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName));
        NotesSlide notesSlide = api.getNotesSlideOnline(file, c_slideIndex, c_password);
        assertNotNull(notesSlide);
    }

    @Test
    public void notesSlideExistsRequestTest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName));
        EntityExists exists = api.notesSlideExistsOnline(file, c_slideIndex, c_password);
        assertTrue(exists.isExists());
    }

    @Test
    public void notesSlideDownloadRequestTest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName));
        File notesSlide = api.downloadNotesSlideOnline(file, c_slideIndex, c_format, null, null, c_password, null);
        assertNotNull(notesSlide);
        assertTrue(notesSlide.length() > 0);
        assertTrue(notesSlide.canRead());
    }

    @Test
    public void notesSlideShapesTest() throws ApiException, IOException {
        initialize(null, null, null);
        Shapes shapes = api.getSpecialSlideShapes(
            c_fileName, c_slideIndex, SpecialSlideType.NOTESSLIDE, c_password, c_folderName, null);
        assertEquals(c_shapeCount, shapes.getShapesLinks().size());

        Shape dto = new Shape();
        dto.setX(100.0);
        dto.setY(100.0);
        dto.setWidth(500.0);
        dto.setHeight(200.0);
        dto.setShapeType(GeometryShape.ShapeTypeEnum.RECTANGLE);
        dto.setText("New shape");
        Shape shape = (Shape)api.createSpecialSlideShape(
            c_fileName, c_slideIndex, SpecialSlideType.NOTESSLIDE, dto, null, null, c_password, c_folderName, null);
        assertEquals(dto.getText(), shape.getText());
        shapes = api.getSpecialSlideShapes(c_fileName, c_slideIndex, SpecialSlideType.NOTESSLIDE, c_password, c_folderName, null);
        assertEquals(c_shapeCount + 1, shapes.getShapesLinks().size());

        dto.setText("Updated shape");
        shape = (Shape)api.updateSpecialSlideShape(
            c_fileName, c_slideIndex, SpecialSlideType.NOTESSLIDE, c_shapeCount + 1, dto, c_password, c_folderName, null);
        assertEquals(dto.getText(), shape.getText());
        shapes = api.getSpecialSlideShapes(c_fileName, c_slideIndex, SpecialSlideType.NOTESSLIDE, c_password, c_folderName, null);
        assertEquals(c_shapeCount + 1, shapes.getShapesLinks().size());

        api.deleteSpecialSlideShape(
            c_fileName, c_slideIndex, SpecialSlideType.NOTESSLIDE, c_shapeCount + 1, c_password, c_folderName, null);
        shapes = api.getSpecialSlideShapes(c_fileName, c_slideIndex, SpecialSlideType.NOTESSLIDE, c_password, c_folderName, null);
        assertEquals(c_shapeCount, shapes.getShapesLinks().size());
    }

    @Test
    public void notesSlideParagraphsTest() throws ApiException, IOException {
        initialize(null, null, null);
        Paragraphs paragraphs = api.getSpecialSlideParagraphs(
            c_fileName, c_slideIndex, SpecialSlideType.NOTESSLIDE, c_shapeIndex, c_password, c_folderName, null);
        assertEquals(c_paragraphCount, paragraphs.getParagraphLinks().size());

        Paragraph dto = new Paragraph();
        dto.setAlignment(Paragraph.AlignmentEnum.RIGHT);
        List<Portion> portions = new ArrayList<Portion>();
        Portion portion = new Portion();
        portion.setText("New paragraph");
        portions.add(portion);
        dto.setPortionList(portions);
        Paragraph paragraph = api.createSpecialSlideParagraph(
            c_fileName, c_slideIndex, SpecialSlideType.NOTESSLIDE, c_shapeIndex, dto, null, c_password, c_folderName, null);
        assertEquals(dto.getAlignment(), paragraph.getAlignment());
        paragraphs = api.getSpecialSlideParagraphs(
            c_fileName, c_slideIndex, SpecialSlideType.NOTESSLIDE, c_shapeIndex, c_password, c_folderName, null);
        assertEquals(c_paragraphCount + 1, paragraphs.getParagraphLinks().size());

        dto = new Paragraph();
        dto.setAlignment(Paragraph.AlignmentEnum.CENTER);
        paragraph = api.updateSpecialSlideParagraph(
            c_fileName,
            c_slideIndex,
            SpecialSlideType.NOTESSLIDE,
            c_shapeIndex,
            c_paragraphCount + 1,
            dto,
            c_password,
            c_folderName,
            null);
        assertEquals(dto.getAlignment(), paragraph.getAlignment());
        paragraphs = api.getSpecialSlideParagraphs(
            c_fileName, c_slideIndex, SpecialSlideType.NOTESSLIDE, c_shapeIndex, c_password, c_folderName, null);
        assertEquals(c_paragraphCount + 1, paragraphs.getParagraphLinks().size());

        api.deleteSpecialSlideParagraph(
            c_fileName, c_slideIndex, SpecialSlideType.NOTESSLIDE, c_shapeIndex, c_paragraphCount + 1, c_password, c_folderName, null);
        paragraphs = api.getSpecialSlideParagraphs(
            c_fileName, c_slideIndex, SpecialSlideType.NOTESSLIDE, c_shapeIndex, c_password, c_folderName, null);
        assertEquals(c_paragraphCount, paragraphs.getParagraphLinks().size());
    }

    @Test
    public void notesSlidePortionsTest() throws ApiException, IOException {
        initialize(null, null, null);
        Portions portions = api.getSpecialSlidePortions(
            c_fileName, c_slideIndex, SpecialSlideType.NOTESSLIDE, c_shapeIndex, c_paragraphIndex, c_password, c_folderName, null);
        assertEquals(c_portionCount, portions.getItems().size());

        Portion dto = new Portion();
        dto.setFontBold(Portion.FontBoldEnum.TRUE);
        dto.setText("New portion");
        Portion portion = api.createSpecialSlidePortion(
            c_fileName,
            c_slideIndex,
            SpecialSlideType.NOTESSLIDE,
            c_shapeIndex,
            c_paragraphIndex,
            dto,
            null,
            c_password,
            c_folderName,
            null);
        assertEquals(dto.getFontBold(), portion.getFontBold());
        assertEquals(dto.getText(), portion.getText());
        portions = api.getSpecialSlidePortions(
            c_fileName, c_slideIndex, SpecialSlideType.NOTESSLIDE, c_shapeIndex, c_paragraphIndex, c_password, c_folderName, null);
        assertEquals(c_portionCount + 1, portions.getItems().size());

        Portion dto2 = new Portion();
        dto2.setFontHeight(22.0);
        dto2.setText("Updated portion");
        portion = api.updateSpecialSlidePortion(
            c_fileName,
            c_slideIndex,
            SpecialSlideType.NOTESSLIDE,
            c_shapeIndex,
            c_paragraphIndex,
            c_portionCount + 1,
            dto2,
            c_password,
            c_folderName,
            null);
        assertEquals(dto.getFontBold(), portion.getFontBold());
        assertEquals(dto2.getFontHeight(), portion.getFontHeight());
        assertEquals(dto2.getText(), portion.getText());
        portions = api.getSpecialSlidePortions(
            c_fileName, c_slideIndex, SpecialSlideType.NOTESSLIDE, c_shapeIndex, c_paragraphIndex, c_password, c_folderName, null);
        assertEquals(c_portionCount + 1, portions.getItems().size());

        api.deleteSpecialSlidePortion(
            c_fileName,
            c_slideIndex,
            SpecialSlideType.NOTESSLIDE,
            c_shapeIndex,
            c_paragraphIndex,
            c_portionCount + 1,
            c_password,
            c_folderName,
            null);
        portions = api.getSpecialSlidePortions(
            c_fileName, c_slideIndex, SpecialSlideType.NOTESSLIDE, c_shapeIndex, c_paragraphIndex, c_password, c_folderName, null);
        assertEquals(c_portionCount, portions.getItems().size());
    }

    @Test
    public void createNotesSlideTest() throws ApiException, IOException {
        initialize(null, null, null);
        NotesSlide dto = new NotesSlide();
        dto.setText(c_notesSlideText);
        NotesSlide response = api.createNotesSlide(c_fileName, c_slideIndex, dto, c_password, c_folderName, null);
        assertEquals(c_notesSlideText, response.getText());
    }

    @Test
    public void updateNotesSlideTest() throws ApiException, IOException {
        initialize(null, null, null);
        NotesSlide dto = new NotesSlide();
        dto.setText(c_notesSlideText);
        NotesSlide response = api.updateNotesSlide(c_fileName, c_slideIndex, dto, c_password, c_folderName, null);
        assertEquals(c_notesSlideText, response.getText());
    }

    @Test
    public void deleteNotesSlideTest() throws ApiException, IOException {
        initialize(null, null, null);
        Slide response = api.deleteNotesSlide(c_fileName, c_slideIndex, c_password, c_folderName, null);
        assertNull(response.getNotesSlide());
    }

    private final String c_folderName = "TempSlidesSDK";
    private final String c_fileName = "test.pptx";
    private final String c_password = "password";
    private final int c_slideIndex = 1;
    private final int c_shapeIndex = 2;
    private final int c_shapeCount = 3;
    private final int c_paragraphIndex = 1;
    private final int c_paragraphCount = 1;
    private final int c_portionCount = 1;
    private final NotesSlideExportFormat c_format = NotesSlideExportFormat.PNG;
    private final String c_notesSlideText = "Notes slide text";
}
