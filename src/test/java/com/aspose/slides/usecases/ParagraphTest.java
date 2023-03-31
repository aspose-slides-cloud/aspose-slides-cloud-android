package com.aspose.slides.usecases;

import com.aspose.slides.ApiException;
import com.aspose.slides.ApiTest;
import com.aspose.slides.model.*;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * API tests for paragraph methods
 */
public class ParagraphTest extends ApiTest {

    @Test
    public void getParagraphTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Paragraph response = api.getParagraph(fileName, c_slideIndex, c_shapeIndex, 1, password, folderName, null, null);
        assertEquals(2, response.getPortionList().size());
    }

    @Test
    public void getParagraphsTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Paragraphs response = api.getParagraphs(fileName, c_slideIndex, c_shapeIndex, password, folderName, null, null);
        assertEquals(2, response.getParagraphLinks().size());
    }

    @Test
    public void getSubShapeParagraphTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Paragraph response = api.getParagraph(fileName, c_slideIndex, 3, 1, password, folderName, null, "1");
        assertEquals(2, response.getPortionList().size());
    }

    @Test
    public void getSubShapeParagraphsTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Paragraphs response = api.getParagraphs(fileName, c_slideIndex,  3, password, folderName, null, "1");
        assertEquals(2, response.getParagraphLinks().size());
    }

    @Test
    public void createParagraphTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Paragraph dto = new Paragraph();
        dto.setMarginLeft(2.0);
        dto.setMarginRight(2.0);
        dto.setAlignment(Paragraph.AlignmentEnum.CENTER);

        Paragraph response = api.createParagraph(fileName, c_slideIndex, c_shapeIndex, dto, null, password, folderName, null, null);
        assertEquals(dto.getMarginLeft(), response.getMarginLeft());
        assertEquals(dto.getMarginRight(), response.getMarginRight());
        assertEquals(dto.getAlignment(), response.getAlignment());
    }

    @Test
    public void createParagraphWithPortionsTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Paragraph dto = new Paragraph();
        Portion portion1 = new Portion();
        portion1.setText("Portion1");
        Portion portion2 = new Portion();
        portion2.setText("Portion2");
        portion2.setFontBold(Portion.FontBoldEnum.TRUE);
        dto.setPortionList(new ArrayList<Portion>(Arrays.asList(portion1, portion2)));

        Paragraph response = api.createParagraph(fileName, c_slideIndex, c_shapeIndex, dto, null, password, folderName, null, null);
        assertEquals(2, response.getPortionList().size());
    }

    @Test
    public void createSubshapeParagraphTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Paragraph dto = new Paragraph();
        dto.setMarginLeft(2.0);
        dto.setMarginRight(2.0);
        dto.setAlignment(Paragraph.AlignmentEnum.CENTER);

        Paragraph response = api.createParagraph(fileName, c_slideIndex, 3, dto, null, password, folderName, null, "1");
        assertEquals(dto.getMarginLeft(), response.getMarginLeft());
        assertEquals(dto.getMarginRight(), response.getMarginRight());
        assertEquals(dto.getAlignment(), response.getAlignment());
    }

    @Test
    public void updateParagraphTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Paragraph dto = new Paragraph();
        dto.setMarginLeft(2.0);
        dto.setMarginRight(2.0);
        dto.setAlignment(Paragraph.AlignmentEnum.CENTER);

        Paragraph response = api.updateParagraph(fileName, c_slideIndex, c_shapeIndex, 1, dto, password, folderName, null, null);
        assertEquals(dto.getMarginLeft(), response.getMarginLeft());
        assertEquals(dto.getMarginRight(), response.getMarginRight());
        assertEquals(dto.getAlignment(), response.getAlignment());
    }

    @Test
    public void updateSubshapeParagraphTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Paragraph dto = new Paragraph();
        dto.setMarginLeft(2.0);
        dto.setMarginRight(2.0);
        dto.setAlignment(Paragraph.AlignmentEnum.CENTER);

        Paragraph response = api.updateParagraph(fileName, c_slideIndex, 3, 1, dto, password, folderName, null, "1");
        assertEquals(dto.getMarginLeft(), response.getMarginLeft());
        assertEquals(dto.getMarginRight(), response.getMarginRight());
        assertEquals(dto.getAlignment(), response.getAlignment());
    }

    @Test
    public void deleteParagraphsTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Paragraphs response = api.deleteParagraphs(fileName, c_slideIndex, c_shapeIndex, null, password, folderName, null, null);
        assertEquals(0, response.getParagraphLinks().size());
    }

    @Test
    public void deleteParagraphsIndexesTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Paragraphs response = api.deleteParagraphs(fileName, c_slideIndex, c_shapeIndex, new ArrayList<Integer>(Arrays.asList(2)),
                password, folderName, null, null);
        assertEquals(1, response.getParagraphLinks().size());
    }

    @Test
    public void deleteSubShapeParagraphsTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Paragraphs response = api.deleteParagraphs(fileName, c_slideIndex, 3, null, password, folderName, null, "1");
        assertEquals(0, response.getParagraphLinks().size());
    }

    @Test
    public void deleteSubShapeParagraphsIndexesTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Paragraphs response = api.deleteParagraphs(fileName, c_slideIndex, 3, new ArrayList<Integer>(Arrays.asList(1)),
                password, folderName, null, "1");
        assertEquals(1, response.getParagraphLinks().size());
    }

    @Test
    public void deleteParagraphTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Paragraphs response = api.deleteParagraph(fileName, c_slideIndex, c_shapeIndex, 1, password, folderName, null, null);
        assertEquals(1, response.getParagraphLinks().size());
    }

    @Test
    public void deleteSubshapeParagraphTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Paragraphs response = api.deleteParagraph(fileName, c_slideIndex, 3, 1, password, folderName, null, "1");
        assertEquals(1, response.getParagraphLinks().size());
    }

    @Test
    public void getParagraphRectTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        TextBounds response = api.getParagraphRectangle(fileName, c_slideIndex, c_shapeIndex, 1, password, folderName, null);
        assertNotNull(response);
        assertTrue(response.getX() > 0);
        assertTrue(response.getY() > 0);
        assertTrue(response.getWidth() > 0);
        assertTrue(response.getHeight() > 0);
    }

    @Test
    public void paragraphDefaultPortionFormatTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Paragraph dto = new Paragraph();
        PortionFormat defaultPortionFormat = new PortionFormat();
        defaultPortionFormat.setFontHeight(20.0);
        defaultPortionFormat.setLatinFont("Arial");
        dto.setDefaultPortionFormat(defaultPortionFormat);
        Portion portion1 = new Portion();
        portion1.setText("Portion1");
        Portion portion2 = new Portion();
        portion2.setText("Portion2");
        dto.setPortionList(new ArrayList<Portion>(Arrays.asList(portion1, portion2)));

        Paragraph response = api.createParagraph(fileName, c_slideIndex, c_shapeIndex, dto, null, password, folderName, null, null);
        assertEquals(2, response.getPortionList().size());
        assertNotNull(response.getDefaultPortionFormat());
        assertEquals(dto.getDefaultPortionFormat().getLatinFont(), response.getDefaultPortionFormat().getLatinFont());
        assertEquals(dto.getDefaultPortionFormat().getFontHeight(), response.getDefaultPortionFormat().getFontHeight());
    }

    @Test
    public void getParagraphEffectiveTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Paragraph response = api.getParagraphEffective(fileName, c_slideIndex, c_shapeIndex, 1, password, folderName, null, null);
        assertEquals((Double) 72.0, response.getDefaultTabSize());
    }

    @Test
    public void getSubShapeParagraphEffectiveTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Paragraph response = api.getParagraphEffective(fileName, c_slideIndex, 3, 1, password, folderName, null, "1");
        assertEquals((Double) 72.0, response.getDefaultTabSize());
    }

    private final int c_slideIndex = 6;
    private final int c_shapeIndex = 2;
}
