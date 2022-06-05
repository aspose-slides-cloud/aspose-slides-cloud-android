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
        initialize(null, null, null);
        Paragraph response = api.getParagraph(c_fileName, c_slideIndex, c_shapeIndex, 1, c_password, c_folderName, null);
        assertEquals(2, response.getPortionList().size());
    }

    @Test
    public void getParagraphsTest() throws ApiException, IOException {
        initialize(null, null, null);
        Paragraphs response = api.getParagraphs(c_fileName, c_slideIndex, c_shapeIndex, c_password, c_folderName, null);
        assertEquals(2, response.getParagraphLinks().size());
    }

    @Test
    public void getSubshapeParagraphTest() throws ApiException, IOException {
        initialize(null, null, null);
        Paragraph response = api.getSubshapeParagraph(c_fileName, c_slideIndex, c_shapePath, 1, 1, c_password, c_folderName, null);
        assertEquals(2, response.getPortionList().size());
    }

    @Test
    public void getSubshapeParagraphsTest() throws ApiException, IOException {
        initialize(null, null, null);
        Paragraphs response = api.getSubshapeParagraphs(c_fileName, c_slideIndex,  c_shapePath, 1, c_password, c_folderName, null);
        assertEquals(2, response.getParagraphLinks().size());
    }

    @Test
    public void createParagraphTest() throws ApiException, IOException {
        initialize(null, null, null);
        Paragraph dto = new Paragraph();
        dto.setMarginLeft(2.0);
        dto.setMarginRight(2.0);
        dto.setAlignment(Paragraph.AlignmentEnum.CENTER);

        Paragraph response = api.createParagraph(c_fileName, c_slideIndex, c_shapeIndex, dto, null, c_password, c_folderName, null);
        assertEquals(dto.getMarginLeft(), response.getMarginLeft());
        assertEquals(dto.getMarginRight(), response.getMarginRight());
        assertEquals(dto.getAlignment(), response.getAlignment());
    }

    @Test
    public void createParagraphWithPortionsTest() throws ApiException, IOException {
        initialize(null, null, null);
        Paragraph dto = new Paragraph();
        Portion portion1 = new Portion();
        portion1.setText("Portion1");
        Portion portion2 = new Portion();
        portion2.setText("Portion2");
        portion2.setFontBold(Portion.FontBoldEnum.TRUE);
        dto.setPortionList(new ArrayList<Portion>(Arrays.asList(portion1, portion2)));

        Paragraph response = api.createParagraph(c_fileName, c_slideIndex, c_shapeIndex, dto, null, c_password, c_folderName, null);
        assertEquals(2, response.getPortionList().size());
    }

    @Test
    public void createSubshapeParagraphTest() throws ApiException, IOException {
        initialize(null, null, null);
        Paragraph dto = new Paragraph();
        dto.setMarginLeft(2.0);
        dto.setMarginRight(2.0);
        dto.setAlignment(Paragraph.AlignmentEnum.CENTER);

        Paragraph response = api.createSubshapeParagraph(c_fileName, c_slideIndex, c_shapePath, 1, dto, null, c_password, c_folderName, null);
        assertEquals(dto.getMarginLeft(), response.getMarginLeft());
        assertEquals(dto.getMarginRight(), response.getMarginRight());
        assertEquals(dto.getAlignment(), response.getAlignment());
    }

    @Test
    public void updateParagraphTest() throws ApiException, IOException {
        initialize(null, null, null);
        Paragraph dto = new Paragraph();
        dto.setMarginLeft(2.0);
        dto.setMarginRight(2.0);
        dto.setAlignment(Paragraph.AlignmentEnum.CENTER);

        Paragraph response = api.updateParagraph(c_fileName, c_slideIndex, c_shapeIndex, 1, dto, c_password, c_folderName, null);
        assertEquals(dto.getMarginLeft(), response.getMarginLeft());
        assertEquals(dto.getMarginRight(), response.getMarginRight());
        assertEquals(dto.getAlignment(), response.getAlignment());
    }

    @Test
    public void updateSubshapeParagraphTest() throws ApiException, IOException {
        initialize(null, null, null);
        Paragraph dto = new Paragraph();
        dto.setMarginLeft(2.0);
        dto.setMarginRight(2.0);
        dto.setAlignment(Paragraph.AlignmentEnum.CENTER);

        Paragraph response = api.updateSubshapeParagraph(c_fileName, c_slideIndex, c_shapePath, 1, 1, dto, c_password, c_folderName, null);
        assertEquals(dto.getMarginLeft(), response.getMarginLeft());
        assertEquals(dto.getMarginRight(), response.getMarginRight());
        assertEquals(dto.getAlignment(), response.getAlignment());
    }

    @Test
    public void deleteParagraphsTest() throws ApiException, IOException {
        initialize(null, null, null);
        Paragraphs response = api.deleteParagraphs(c_fileName, c_slideIndex, c_shapeIndex, null, c_password, c_folderName, null);
        assertEquals(0, response.getParagraphLinks().size());
    }

    @Test
    public void deleteParagraphsIndexesTest() throws ApiException, IOException {
        initialize(null, null, null);
        Paragraphs response = api.deleteParagraphs(c_fileName, c_slideIndex, c_shapeIndex, new ArrayList<Integer>(Arrays.asList(2)), c_password, c_folderName, null);
        assertEquals(1, response.getParagraphLinks().size());
    }

    @Test
    public void deleteSubshapeParagraphsTest() throws ApiException, IOException {
        initialize(null, null, null);
        Paragraphs response = api.deleteSubshapeParagraphs(c_fileName, c_slideIndex, c_shapePath, 1, null, c_password, c_folderName, null);
        assertEquals(0, response.getParagraphLinks().size());
    }

    @Test
    public void deleteSubshapeParagraphsIndexesTest() throws ApiException, IOException {
        initialize(null, null, null);
        Paragraphs response = api.deleteSubshapeParagraphs(c_fileName, c_slideIndex, c_shapePath, 1, new ArrayList<Integer>(Arrays.asList(1)), c_password, c_folderName, null);
        assertEquals(1, response.getParagraphLinks().size());
    }

    @Test
    public void deleteParagraphTest() throws ApiException, IOException {
        initialize(null, null, null);
        Paragraphs response = api.deleteParagraph(c_fileName, c_slideIndex, c_shapeIndex, 1, c_password, c_folderName, null);
        assertEquals(1, response.getParagraphLinks().size());
    }

    @Test
    public void deleteSubshapeParagraphTest() throws ApiException, IOException {
        initialize(null, null, null);
        Paragraphs response = api.deleteSubshapeParagraph(c_fileName, c_slideIndex, c_shapePath, 1, 1, c_password, c_folderName, null);
        assertEquals(1, response.getParagraphLinks().size());
    }

    @Test
    public void getParagraphRectTest() throws ApiException, IOException {
        initialize(null, null, null);
        TextBounds response = api.getParagraphRectangle(c_fileName, c_slideIndex, c_shapeIndex, 1, c_password, c_folderName, null);
        assertNotNull(response);
        assertTrue(response.getX() > 0);
        assertTrue(response.getY() > 0);
        assertTrue(response.getWidth() > 0);
        assertTrue(response.getHeight() > 0);
    }

    @Test
    public void paragraphDefaultPortionFormatTest() throws ApiException, IOException {
        initialize(null, null, null);
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

        Paragraph response = api.createParagraph(c_fileName, c_slideIndex, c_shapeIndex, dto, null, c_password, c_folderName, null);
        assertEquals(2, response.getPortionList().size());
        assertNotNull(response.getDefaultPortionFormat());
        assertEquals(dto.getDefaultPortionFormat().getLatinFont(), response.getDefaultPortionFormat().getLatinFont());
        assertEquals(dto.getDefaultPortionFormat().getFontHeight(), response.getDefaultPortionFormat().getFontHeight());
    }

    private final String c_folderName = "TempSlidesSDK";
    private final String c_fileName = "test.pptx";
    private final String c_password = "password";
    private final int c_slideIndex = 6;
    private final int c_shapeIndex = 2;
    private final String c_shapePath = "3/shapes";
}
