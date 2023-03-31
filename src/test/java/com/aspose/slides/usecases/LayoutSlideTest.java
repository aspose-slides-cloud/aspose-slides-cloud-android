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
public class LayoutSlideTest extends ApiTest {
    @Test
    public void layoutSlidesTest() throws ApiException, IOException {
        String sourceFile = "TemplateCV.pptx";
        String sourcePath = folderName + "/" + sourceFile;
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        LayoutSlides layoutSlides = api.getLayoutSlides(fileName, password, folderName, null);
        assertEquals(11, layoutSlides.getSlideList().size());

        LayoutSlide layoutSlide = api.getLayoutSlide(fileName, 1, password, folderName, null);
        assertEquals("Title Slide", layoutSlide.getName());

        layoutSlide = api.copyLayoutSlide(fileName, sourcePath, 2, null, null, password, folderName, null);
        assertEquals("Title and Content", layoutSlide.getName());

        layoutSlides = api.getLayoutSlides(fileName, password, folderName, null);
        assertEquals(12, layoutSlides.getSlideList().size());
    }

    @Test
    public void layoutSlideShapesTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Shapes shapes = api.getSpecialSlideShapes(fileName, c_slideIndex, SpecialSlideType.LAYOUTSLIDE, password, folderName, null, null);
        assertEquals(c_shapeCount, shapes.getShapesLinks().size());

        Shape dto = new Shape();
        dto.setX(100.0);
        dto.setY(100.0);
        dto.setWidth(500.0);
        dto.setHeight(200.0);
        dto.setShapeType(GeometryShape.ShapeTypeEnum.RECTANGLE);
        dto.setText("New shape");
        Shape shape = (Shape)api.createSpecialSlideShape(fileName, c_slideIndex, SpecialSlideType.LAYOUTSLIDE, dto,
                null, null, password, folderName, null, null);
        assertEquals(dto.getText(), shape.getText());
        shapes = api.getSpecialSlideShapes(fileName, c_slideIndex, SpecialSlideType.LAYOUTSLIDE, password, folderName, null, null);
        assertEquals(c_shapeCount + 1, shapes.getShapesLinks().size());

        dto.setText("Updated shape");
        shape = (Shape)api.updateSpecialSlideShape(fileName, c_slideIndex, SpecialSlideType.LAYOUTSLIDE,
                c_shapeCount + 1, dto, password, folderName, null, null);
        assertEquals(dto.getText(), shape.getText());
        shapes = api.getSpecialSlideShapes(fileName, c_slideIndex, SpecialSlideType.LAYOUTSLIDE, password, folderName, null, null);
        assertEquals(c_shapeCount + 1, shapes.getShapesLinks().size());

        api.deleteSpecialSlideShape(fileName, c_slideIndex, SpecialSlideType.LAYOUTSLIDE, c_shapeCount + 1, password, folderName, null, null);
        shapes = api.getSpecialSlideShapes(fileName, c_slideIndex, SpecialSlideType.LAYOUTSLIDE, password, folderName, null, null);
        assertEquals(c_shapeCount, shapes.getShapesLinks().size());
    }

    @Test
    public void layoutSlideParagraphsTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Paragraphs paragraphs = api.getSpecialSlideParagraphs(
            fileName, c_slideIndex, SpecialSlideType.LAYOUTSLIDE, c_shapeIndex, password, folderName, null, null);
        assertEquals(c_paragraphCount, paragraphs.getParagraphLinks().size());

        Paragraph dto = new Paragraph();
        dto.setAlignment(Paragraph.AlignmentEnum.RIGHT);
        List<Portion> portions = new ArrayList<Portion>();
        Portion portion = new Portion();
        portion.setText("New paragraph");
        portions.add(portion);
        dto.setPortionList(portions);
        Paragraph paragraph = api.createSpecialSlideParagraph(fileName, c_slideIndex, SpecialSlideType.LAYOUTSLIDE,
                c_shapeIndex, dto, null, password, folderName, null, null);
        assertEquals(dto.getAlignment(), paragraph.getAlignment());
        paragraphs = api.getSpecialSlideParagraphs(fileName, c_slideIndex, SpecialSlideType.LAYOUTSLIDE, c_shapeIndex,
                password, folderName, null, null);
        assertEquals(c_paragraphCount + 1, paragraphs.getParagraphLinks().size());

        dto = new Paragraph();
        dto.setAlignment(Paragraph.AlignmentEnum.CENTER);
        paragraph = api.updateSpecialSlideParagraph(fileName, c_slideIndex, SpecialSlideType.LAYOUTSLIDE, c_shapeIndex,
                c_paragraphCount + 1, dto, password, folderName, null, null);
        assertEquals(dto.getAlignment(), paragraph.getAlignment());
        paragraphs = api.getSpecialSlideParagraphs(fileName, c_slideIndex, SpecialSlideType.LAYOUTSLIDE, c_shapeIndex,
                password, folderName, null, null);
        assertEquals(c_paragraphCount + 1, paragraphs.getParagraphLinks().size());

        api.deleteSpecialSlideParagraph(fileName, c_slideIndex, SpecialSlideType.LAYOUTSLIDE, c_shapeIndex,
                c_paragraphCount + 1, password, folderName, null, null);
        paragraphs = api.getSpecialSlideParagraphs(fileName, c_slideIndex, SpecialSlideType.LAYOUTSLIDE, c_shapeIndex,
                password, folderName, null, null);
        assertEquals(c_paragraphCount, paragraphs.getParagraphLinks().size());
    }

    @Test
    public void layoutSlidePortionsTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Portions portions = api.getSpecialSlidePortions(fileName, c_slideIndex, SpecialSlideType.LAYOUTSLIDE, c_shapeIndex,
                c_paragraphIndex, password, folderName, null, null);
        assertEquals(c_portionCount, portions.getItems().size());

        Portion dto = new Portion();
        dto.setFontBold(Portion.FontBoldEnum.TRUE);
        dto.setText("New portion");
        Portion portion = api.createSpecialSlidePortion(
            fileName,
            c_slideIndex,
            SpecialSlideType.LAYOUTSLIDE,
            c_shapeIndex,
            c_paragraphIndex,
            dto,
            null,
            password,
            folderName,
            null,
            null);
        assertEquals(dto.getFontBold(), portion.getFontBold());
        assertEquals(dto.getText(), portion.getText());
        portions = api.getSpecialSlidePortions(fileName, c_slideIndex, SpecialSlideType.LAYOUTSLIDE, c_shapeIndex,
                c_paragraphIndex, password, folderName, null, null);
        assertEquals(c_portionCount + 1, portions.getItems().size());

        Portion dto2 = new Portion();
        dto2.setFontHeight(22.0);
        dto2.setText("Updated portion");
        portion = api.updateSpecialSlidePortion(
            fileName,
            c_slideIndex,
            SpecialSlideType.LAYOUTSLIDE,
            c_shapeIndex,
            c_paragraphIndex,
            c_portionCount + 1,
            dto2,
            password,
            folderName,
            null,
            null);
        assertEquals(dto.getFontBold(), portion.getFontBold());
        assertEquals(dto2.getFontHeight(), portion.getFontHeight());
        assertEquals(dto2.getText(), portion.getText());
        portions = api.getSpecialSlidePortions(fileName, c_slideIndex, SpecialSlideType.LAYOUTSLIDE, c_shapeIndex,
                c_paragraphIndex, password, folderName, null, null);
        assertEquals(c_portionCount + 1, portions.getItems().size());

        api.deleteSpecialSlidePortion(
            fileName,
            c_slideIndex,
            SpecialSlideType.LAYOUTSLIDE,
            c_shapeIndex,
            c_paragraphIndex,
            c_portionCount + 1,
            password,
            folderName,
            null,
            null);
        portions = api.getSpecialSlidePortions(fileName, c_slideIndex, SpecialSlideType.LAYOUTSLIDE, c_shapeIndex,
                c_paragraphIndex, password, folderName, null, null);
        assertEquals(c_portionCount, portions.getItems().size());
    }

    @Test
    public void layoutSlideAnimationTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        SlideAnimation animation = api.getSpecialSlideAnimation(
            fileName, c_slideIndex, SpecialSlideType.LAYOUTSLIDE, null, null, password, folderName, null);
        assertEquals(1, animation.getMainSequence().size());

        SlideAnimation dto = new SlideAnimation();
        List<Effect> effects = new ArrayList<Effect>();
        Effect effect1 = new Effect();
        effect1.setType(Effect.TypeEnum.BLINK);
        effect1.setShapeIndex(2);
        effects.add(effect1);
        Effect effect2 = new Effect();
        effect2.setType(Effect.TypeEnum.APPEAR);
        effect2.setShapeIndex(3);
        effects.add(effect2);
        dto.setMainSequence(effects);
        animation = api.setSpecialSlideAnimation(
            fileName, c_slideIndex, SpecialSlideType.LAYOUTSLIDE, dto, password, folderName, null);
        assertEquals(dto.getMainSequence().size(), animation.getMainSequence().size());
        animation = api.getSpecialSlideAnimation(
            fileName, c_slideIndex, SpecialSlideType.LAYOUTSLIDE, 3, null, password, folderName, null);
        assertEquals(1, animation.getMainSequence().size());

        animation = api.deleteSpecialSlideAnimationEffect(
            fileName, c_slideIndex, SpecialSlideType.LAYOUTSLIDE, 2, password, folderName, null);
        assertEquals(dto.getMainSequence().size() - 1, animation.getMainSequence().size());
        animation = api.getSpecialSlideAnimation(
            fileName, c_slideIndex, SpecialSlideType.LAYOUTSLIDE, 3, null, password, folderName, null);
        assertEquals(0, animation.getMainSequence().size());

        animation = api.deleteSpecialSlideAnimation(
            fileName, c_slideIndex, SpecialSlideType.LAYOUTSLIDE, password, folderName, null);
        assertEquals(0, animation.getMainSequence().size());
    }

    @Test
    public void layoutSlideDeleteUnusedTest() throws ApiException, IOException{
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        LayoutSlides layoutSlidesBefore = (LayoutSlides)api.getLayoutSlides(fileName, password, folderName, null);
        assertEquals(c_slidesCount, layoutSlidesBefore.getSlideList().size());
        LayoutSlides layoutSlidesAfter = (LayoutSlides)api.deleteUnusedLayoutSlides(fileName, password, folderName, null);
        assertEquals(2, layoutSlidesAfter.getSlideList().size());
    }

    @Test
    public void layoutSlideDeleteUnusedOnlineTest() throws ApiException, IOException{
        byte[] document = Files.readAllBytes(Paths.get(testDataFolderName + "/" + fileName));
        File response = api.deleteUnusedLayoutSlidesOnline(document, password);
        assertNotNull(response);
        assertTrue(response.length() > 0);
    }

    private final int c_slideIndex = 1;
    private final int c_shapeIndex = 2;
    private final int c_shapeCount = 6;
    private final int c_paragraphIndex = 1;
    private final int c_paragraphCount = 1;
    private final int c_portionCount = 1;
    private final int c_slidesCount = 11;
}
