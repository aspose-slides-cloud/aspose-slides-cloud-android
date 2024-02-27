package com.aspose.slides.usecases;

import com.aspose.slides.ApiException;
import com.aspose.slides.ApiTest;
import com.aspose.slides.model.Portion;
import com.aspose.slides.model.Portions;
import com.aspose.slides.model.SolidFill;
import com.aspose.slides.model.TextBounds;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * API tests for portion methods
 */
public class PortionTest extends ApiTest {

    @Test
    public void getPortionsTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Portions response = testSlidesApi.getPortions(fileName, c_slideIndex, c_shapeIndex, c_paragraphIndex, password, folderName, null, null);
        assertEquals(2, response.getItems().size());
    }

    @Test
    public void getSubShapePortionsTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Portions response = testSlidesApi.getPortions(fileName, c_slideIndex, 3, c_paragraphIndex, password, folderName, null, "1");
        assertEquals(2, response.getItems().size());
    }

    @Test
    public void getPortionTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Portion response = testSlidesApi.getPortion(fileName, c_slideIndex, c_shapeIndex, c_paragraphIndex, c_portionIndex,
                password, folderName, null, null);
        assertTrue(response.getText().contains(c_portionText));
    }

    @Test
    public void getSubShapePortionTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Portion response = testSlidesApi.getPortion(fileName, c_slideIndex, 3, c_paragraphIndex, c_portionIndex, password, folderName, null, "1");
        assertTrue(response.getText().contains(c_portionText));
    }

    @Test
    public void createPortionTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        Portion dto = new Portion();
        dto.setText(c_newPortionText);
        dto.setFontBold(Portion.FontBoldEnum.TRUE);
        dto.setFontHeight(20.0);
        dto.setLatinFont(c_fontName);
        SolidFill fillFormat = new SolidFill();
        fillFormat.setColor(c_fontColor);
        dto.setFillFormat(fillFormat);

        Portion response = testSlidesApi.createPortion(fileName, c_slideIndex, c_shapeIndex, 1, dto, null, password, folderName, null, null);
        assertEquals(dto.getText(), response.getText());
        assertEquals(dto.getFontBold(), response.getFontBold());
        assertEquals(dto.getFontHeight(), response.getFontHeight());
        assertEquals(dto.getLatinFont(), response.getLatinFont());
        assertTrue(response.getFillFormat() instanceof SolidFill);
    }

    @Test
    public void createSubShapePortionTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        Portion dto = new Portion();
        dto.setText(c_newPortionText);
        dto.setFontBold(Portion.FontBoldEnum.TRUE);
        dto.setFontHeight(20.0);
        dto.setLatinFont(c_fontName);
        SolidFill fillFormat = new SolidFill();
        fillFormat.setColor(c_fontColor);
        dto.setFillFormat(fillFormat);

        Portion response = testSlidesApi.createPortion(fileName, c_slideIndex, 3, 1, dto, null, password, folderName, null, "2");
        assertEquals(dto.getText(), response.getText());
        assertEquals(dto.getFontBold(), response.getFontBold());
        assertEquals(dto.getFontHeight(), response.getFontHeight());
        assertEquals(dto.getLatinFont(), response.getLatinFont());
        assertTrue(response.getFillFormat() instanceof SolidFill);
    }

    @Test
    public void updatePortionTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        Portion dto = new Portion();
        dto.setText(c_newPortionText);
        dto.setFontBold(Portion.FontBoldEnum.TRUE);
        dto.setFontHeight(20.0);
        dto.setLatinFont(c_fontName);
        SolidFill fillFormat = new SolidFill();
        fillFormat.setColor(c_fontColor);
        dto.setFillFormat(fillFormat);

        Portion response = testSlidesApi.updatePortion(fileName, c_slideIndex, c_shapeIndex, 1, 1, dto, password, folderName, null, null);
        assertEquals(dto.getText(), response.getText());
        assertEquals(dto.getFontBold(), response.getFontBold());
        assertEquals(dto.getFontHeight(), response.getFontHeight());
        assertEquals(dto.getLatinFont(), response.getLatinFont());
        assertTrue(response.getFillFormat() instanceof SolidFill);
    }

    @Test
    public void updateSubShapePortionTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        Portion dto = new Portion();
        dto.setText(c_newPortionText);
        dto.setFontBold(Portion.FontBoldEnum.TRUE);
        dto.setFontHeight(20.0);
        dto.setLatinFont(c_fontName);
        SolidFill fillFormat = new SolidFill();
        fillFormat.setColor(c_fontColor);
        dto.setFillFormat(fillFormat);

        Portion response = testSlidesApi.updatePortion(fileName, c_slideIndex, 3, 1, 1, dto, password, folderName, null, "2");
        assertEquals(dto.getText(), response.getText());
        assertEquals(dto.getFontBold(), response.getFontBold());
        assertEquals(dto.getFontHeight(), response.getFontHeight());
        assertEquals(dto.getLatinFont(), response.getLatinFont());
        assertTrue(response.getFillFormat() instanceof SolidFill);
    }

    @Test
    public void deletePortionsTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        Portions response = testSlidesApi.deletePortions(fileName, c_slideIndex, c_shapeIndex, c_paragraphIndex, null,
                password, folderName, null, null);
        assertEquals(0, response.getItems().size());
    }

    @Test
    public void deletePortionsByIndexesTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Portions response = testSlidesApi.deletePortions(fileName, c_slideIndex, c_shapeIndex, c_paragraphIndex,
                new ArrayList<Integer>(Arrays.asList(1)), password, folderName, null, null);
        assertEquals(1, response.getItems().size());
    }

    @Test
    public void deleteSubShapePortionsTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        Portions response = testSlidesApi.deletePortions(fileName, c_slideIndex, 3, c_paragraphIndex, null, password, folderName, null, "1");
        assertEquals(0, response.getItems().size());
    }

    @Test
    public void deleteSubShapePortionsByIndexesTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        Portions response = testSlidesApi.deletePortions(fileName, c_slideIndex, 3, c_paragraphIndex,
                new ArrayList<Integer>(Arrays.asList(1)), password, folderName, null, "1");
        assertEquals(1, response.getItems().size());
    }

    @Test
    public void deletePortionTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        Portions response = testSlidesApi.deletePortion(fileName, c_slideIndex, c_shapeIndex, c_paragraphIndex, c_portionIndex,
                password, folderName, null, null);
        assertEquals(1, response.getItems().size());
    }

    @Test
    public void deleteSubShapePortionTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        Portions response = testSlidesApi.deletePortion(fileName, c_slideIndex, 3, c_paragraphIndex, c_portionIndex, password,
                folderName, null, "1");
        assertEquals(1, response.getItems().size());
    }

    @Test
    public void getPortionRectangleTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        TextBounds response = testSlidesApi.getPortionRectangle(fileName, c_slideIndex, c_shapeIndex, c_paragraphIndex,
                c_portionIndex, password, folderName, null);
        assertNotNull(response);
        assertTrue(response.getX() > 0);
        assertTrue(response.getY() > 0);
        assertTrue(response.getWidth() > 0);
        assertTrue(response.getHeight() > 0);
    }

    @Test
    public void getPortionEffectiveTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Portion response = testSlidesApi.getPortionEffective(fileName, c_slideIndex, c_shapeIndex, c_paragraphIndex,
                c_portionIndex, password, folderName, null, null);
        assertEquals((Double)18.0, response.getFontHeight());
    }

    @Test
    public void getSubshapePortionEffectiveTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Portion response = testSlidesApi.getPortionEffective(fileName, c_slideIndex, 3,
                c_paragraphIndex, c_portionIndex, password, folderName, null, "1");
        assertEquals((Double)18.0, response.getFontHeight());
    }

    private final int c_slideIndex = 6;
    private final int c_shapeIndex = 2;
    private final int c_paragraphIndex = 1;
    private final int c_portionIndex = 1;
    private final String c_portionText = "portion 1";
    private final String c_newPortionText = "new portion text";
    private final String c_fontColor = "#FFF5FF8A";
    private final String c_fontName = "Arial";
}
