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
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        NotesSlide notesSlide = api.getNotesSlide(fileName, c_slideIndex, password, folderName, null);
        assertNotNull(notesSlide);
    }

    @Test
    public void notesSlideExistsStorageTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        EntityExists exists = api.notesSlideExists(fileName, c_slideIndex, password, folderName, null);
        assertNotNull(exists);
    }

    @Test
    public void notesSlideDownloadStorageTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        File notesSlide = api.downloadNotesSlide(fileName, c_slideIndex, c_format, null, null, password, folderName, null, null);
        assertNotNull(notesSlide);
        assertTrue(notesSlide.length() > 0);
        assertTrue(notesSlide.canRead());
    }

    @Test
    public void notesSlideGetRequestTest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + fileName));
        NotesSlide notesSlide = api.getNotesSlideOnline(file, c_slideIndex, password);
        assertNotNull(notesSlide);
    }

    @Test
    public void notesSlideExistsRequestTest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + fileName));
        EntityExists exists = api.notesSlideExistsOnline(file, c_slideIndex, password);
        assertTrue(exists.isExists());
    }

    @Test
    public void notesSlideDownloadRequestTest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + fileName));
        File notesSlide = api.downloadNotesSlideOnline(file, c_slideIndex, c_format, null, null, password, null);
        assertNotNull(notesSlide);
        assertTrue(notesSlide.length() > 0);
        assertTrue(notesSlide.canRead());
    }

    @Test
    public void notesSlideShapesTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Shapes shapes = api.getSpecialSlideShapes(
                fileName, c_slideIndex, SpecialSlideType.NOTESSLIDE, password, folderName, null, null);
        assertEquals(c_shapeCount, shapes.getShapesLinks().size());

        Shape dto = new Shape();
        dto.setX(100.0);
        dto.setY(100.0);
        dto.setWidth(500.0);
        dto.setHeight(200.0);
        dto.setShapeType(GeometryShape.ShapeTypeEnum.RECTANGLE);
        dto.setText("New shape");
        Shape shape = (Shape)api.createSpecialSlideShape(fileName, c_slideIndex, SpecialSlideType.NOTESSLIDE, dto,
                null, null, password, folderName, null, null);
        assertEquals(dto.getText(), shape.getText());
        shapes = api.getSpecialSlideShapes(fileName, c_slideIndex, SpecialSlideType.NOTESSLIDE, password, folderName, null, null);
        assertEquals(c_shapeCount + 1, shapes.getShapesLinks().size());

        dto.setText("Updated shape");
        shape = (Shape)api.updateSpecialSlideShape(fileName, c_slideIndex, SpecialSlideType.NOTESSLIDE,
                c_shapeCount + 1, dto, password, folderName, null, null);
        assertEquals(dto.getText(), shape.getText());
        shapes = api.getSpecialSlideShapes(fileName, c_slideIndex, SpecialSlideType.NOTESSLIDE, password, folderName, null, null);
        assertEquals(c_shapeCount + 1, shapes.getShapesLinks().size());

        api.deleteSpecialSlideShape(fileName, c_slideIndex, SpecialSlideType.NOTESSLIDE, c_shapeCount + 1,
                password, folderName, null, null);
        shapes = api.getSpecialSlideShapes(fileName, c_slideIndex, SpecialSlideType.NOTESSLIDE, password, folderName, null, null);
        assertEquals(c_shapeCount, shapes.getShapesLinks().size());
    }

    @Test
    public void notesSlideParagraphsTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Paragraphs paragraphs = api.getSpecialSlideParagraphs(fileName, c_slideIndex, SpecialSlideType.NOTESSLIDE,
                c_shapeIndex, password, folderName, null, null);
        assertEquals(c_paragraphCount, paragraphs.getParagraphLinks().size());

        Paragraph dto = new Paragraph();
        dto.setAlignment(Paragraph.AlignmentEnum.RIGHT);
        List<Portion> portions = new ArrayList<Portion>();
        Portion portion = new Portion();
        portion.setText("New paragraph");
        portions.add(portion);
        dto.setPortionList(portions);
        Paragraph paragraph = api.createSpecialSlideParagraph(fileName, c_slideIndex, SpecialSlideType.NOTESSLIDE,
                c_shapeIndex, dto, null, password, folderName, null, null);
        assertEquals(dto.getAlignment(), paragraph.getAlignment());
        paragraphs = api.getSpecialSlideParagraphs(fileName, c_slideIndex, SpecialSlideType.NOTESSLIDE, c_shapeIndex,
                password, folderName, null, null);
        assertEquals(c_paragraphCount + 1, paragraphs.getParagraphLinks().size());

        dto = new Paragraph();
        dto.setAlignment(Paragraph.AlignmentEnum.CENTER);
        paragraph = api.updateSpecialSlideParagraph(fileName, c_slideIndex, SpecialSlideType.NOTESSLIDE, c_shapeIndex,
            c_paragraphCount + 1, dto, password, folderName, null, null);
        assertEquals(dto.getAlignment(), paragraph.getAlignment());
        paragraphs = api.getSpecialSlideParagraphs(
            fileName, c_slideIndex, SpecialSlideType.NOTESSLIDE, c_shapeIndex, password, folderName, null, null);
        assertEquals(c_paragraphCount + 1, paragraphs.getParagraphLinks().size());

        api.deleteSpecialSlideParagraph(fileName, c_slideIndex, SpecialSlideType.NOTESSLIDE, c_shapeIndex,
                c_paragraphCount + 1, password, folderName, null, null);
        paragraphs = api.getSpecialSlideParagraphs(fileName, c_slideIndex, SpecialSlideType.NOTESSLIDE, c_shapeIndex,
                password, folderName, null, null);
        assertEquals(c_paragraphCount, paragraphs.getParagraphLinks().size());
    }

    @Test
    public void notesSlidePortionsTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Portions portions = api.getSpecialSlidePortions(fileName, c_slideIndex, SpecialSlideType.NOTESSLIDE,
                c_shapeIndex, c_paragraphIndex, password, folderName, null, null);
        assertEquals(c_portionCount, portions.getItems().size());

        Portion dto = new Portion();
        dto.setFontBold(Portion.FontBoldEnum.TRUE);
        dto.setText("New portion");
        Portion portion = api.createSpecialSlidePortion(fileName, c_slideIndex, SpecialSlideType.NOTESSLIDE, c_shapeIndex,
            c_paragraphIndex, dto, null, password, folderName, null, null);
        assertEquals(dto.getFontBold(), portion.getFontBold());
        assertEquals(dto.getText(), portion.getText());
        portions = api.getSpecialSlidePortions(fileName, c_slideIndex, SpecialSlideType.NOTESSLIDE, c_shapeIndex,
                c_paragraphIndex, password, folderName, null, null);
        assertEquals(c_portionCount + 1, portions.getItems().size());

        Portion dto2 = new Portion();
        dto2.setFontHeight(22.0);
        dto2.setText("Updated portion");
        portion = api.updateSpecialSlidePortion(fileName, c_slideIndex, SpecialSlideType.NOTESSLIDE, c_shapeIndex,
            c_paragraphIndex, c_portionCount + 1, dto2, password, folderName, null, null);
        assertEquals(dto.getFontBold(), portion.getFontBold());
        assertEquals(dto2.getFontHeight(), portion.getFontHeight());
        assertEquals(dto2.getText(), portion.getText());
        portions = api.getSpecialSlidePortions(fileName, c_slideIndex, SpecialSlideType.NOTESSLIDE, c_shapeIndex,
                c_paragraphIndex, password, folderName, null, null);
        assertEquals(c_portionCount + 1, portions.getItems().size());

        api.deleteSpecialSlidePortion(fileName, c_slideIndex, SpecialSlideType.NOTESSLIDE, c_shapeIndex, c_paragraphIndex,
            c_portionCount + 1, password, folderName, null, null);
        portions = api.getSpecialSlidePortions(fileName, c_slideIndex, SpecialSlideType.NOTESSLIDE, c_shapeIndex,
                c_paragraphIndex, password, folderName, null, null);
        assertEquals(c_portionCount, portions.getItems().size());
    }

    @Test
    public void createNotesSlideTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        NotesSlide dto = new NotesSlide();
        dto.setText(c_notesSlideText);
        NotesSlide response = api.createNotesSlide(fileName, c_slideIndex, dto, password, folderName, null);
        assertEquals(c_notesSlideText, response.getText());
    }

    @Test
    public void updateNotesSlideTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        NotesSlide dto = new NotesSlide();
        dto.setText(c_notesSlideText);
        NotesSlide response = api.updateNotesSlide(fileName, c_slideIndex, dto, password, folderName, null);
        assertEquals(c_notesSlideText, response.getText());
    }

    @Test
    public void deleteNotesSlideTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Slide response = api.deleteNotesSlide(fileName, c_slideIndex, password, folderName, null);
        assertNull(response.getNotesSlide());
    }

    private final int c_slideIndex = 1;
    private final int c_shapeIndex = 2;
    private final int c_shapeCount = 3;
    private final int c_paragraphIndex = 1;
    private final int c_paragraphCount = 1;
    private final int c_portionCount = 1;
    private final NotesSlideExportFormat c_format = NotesSlideExportFormat.PNG;
    private final String c_notesSlideText = "Notes slide text";
}
