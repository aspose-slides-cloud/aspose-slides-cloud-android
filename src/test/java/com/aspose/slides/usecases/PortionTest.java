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
        initialize(null, null, null);
        Portions response = api.getPortions(c_fileName, c_slideIndex, c_shapeIndex, c_paragraphIndex, c_password, c_folderName, null);
        assertEquals(2, response.getItems().size());
    }

    @Test
    public void getSubshapePortionsTest() throws ApiException, IOException {
        initialize(null, null, null);
        Portions response = api.getSubshapePortions(c_fileName, c_slideIndex, c_shapePath, 1, c_paragraphIndex, c_password, c_folderName, null);
        assertEquals(2, response.getItems().size());
    }

    @Test
    public void getPortionTest() throws ApiException, IOException {
        initialize(null, null, null);
        Portion response = api.getPortion(c_fileName, c_slideIndex, c_shapeIndex, c_paragraphIndex, c_portionIndex, c_password, c_folderName, null);
        assertTrue(response.getText().contains(c_portionText));
    }

    @Test
    public void getSubshapePortionTest() throws ApiException, IOException {
        initialize(null, null, null);
        Portion response = api.getSubshapePortion(c_fileName, c_slideIndex, c_shapePath, 1, c_paragraphIndex, c_portionIndex, c_password, c_folderName, null);
        assertTrue(response.getText().contains(c_portionText));
    }

    @Test
    public void createPortionTest() throws ApiException, IOException {
        initialize(null, null, null);

        Portion dto = new Portion();
        dto.setText(c_newPortionText);
        dto.setFontBold(Portion.FontBoldEnum.TRUE);
        dto.setFontHeight(20.0);
        dto.setLatinFont(c_fontName);
        SolidFill fillFormat = new SolidFill();
        fillFormat.setColor(c_fontColor);
        dto.setFillFormat(fillFormat);

        Portion response = api.createPortion(c_fileName, c_slideIndex, c_shapeIndex, 1, dto, null, c_password, c_folderName, null);
        assertEquals(dto.getText(), response.getText());
        assertEquals(dto.getFontBold(), response.getFontBold());
        assertEquals(dto.getFontHeight(), response.getFontHeight());
        assertEquals(dto.getLatinFont(), response.getLatinFont());
        assertTrue(response.getFillFormat() instanceof SolidFill);
    }

    @Test
    public void createSubshapePortionTest() throws ApiException, IOException {
        initialize(null, null, null);

        Portion dto = new Portion();
        dto.setText(c_newPortionText);
        dto.setFontBold(Portion.FontBoldEnum.TRUE);
        dto.setFontHeight(20.0);
        dto.setLatinFont(c_fontName);
        SolidFill fillFormat = new SolidFill();
        fillFormat.setColor(c_fontColor);
        dto.setFillFormat(fillFormat);

        Portion response = api.createSubshapePortion(c_fileName, c_slideIndex, c_shapePath, c_shapeIndex, 1, dto, null, c_password, c_folderName, null);
        assertEquals(dto.getText(), response.getText());
        assertEquals(dto.getFontBold(), response.getFontBold());
        assertEquals(dto.getFontHeight(), response.getFontHeight());
        assertEquals(dto.getLatinFont(), response.getLatinFont());
        assertTrue(response.getFillFormat() instanceof SolidFill);
    }

    @Test
    public void updatePortionTest() throws ApiException, IOException {
        initialize(null, null, null);

        Portion dto = new Portion();
        dto.setText(c_newPortionText);
        dto.setFontBold(Portion.FontBoldEnum.TRUE);
        dto.setFontHeight(20.0);
        dto.setLatinFont(c_fontName);
        SolidFill fillFormat = new SolidFill();
        fillFormat.setColor(c_fontColor);
        dto.setFillFormat(fillFormat);

        Portion response = api.updatePortion(c_fileName, c_slideIndex, c_shapeIndex, 1, 1, dto, c_password, c_folderName, null);
        assertEquals(dto.getText(), response.getText());
        assertEquals(dto.getFontBold(), response.getFontBold());
        assertEquals(dto.getFontHeight(), response.getFontHeight());
        assertEquals(dto.getLatinFont(), response.getLatinFont());
        assertTrue(response.getFillFormat() instanceof SolidFill);
    }

    @Test
    public void updateSubshapePortionTest() throws ApiException, IOException {
        initialize(null, null, null);

        Portion dto = new Portion();
        dto.setText(c_newPortionText);
        dto.setFontBold(Portion.FontBoldEnum.TRUE);
        dto.setFontHeight(20.0);
        dto.setLatinFont(c_fontName);
        SolidFill fillFormat = new SolidFill();
        fillFormat.setColor(c_fontColor);
        dto.setFillFormat(fillFormat);

        Portion response = api.updateSubshapePortion(c_fileName, c_slideIndex, c_shapePath, c_shapeIndex, 1, 1, dto, c_password, c_folderName, null);
        assertEquals(dto.getText(), response.getText());
        assertEquals(dto.getFontBold(), response.getFontBold());
        assertEquals(dto.getFontHeight(), response.getFontHeight());
        assertEquals(dto.getLatinFont(), response.getLatinFont());
        assertTrue(response.getFillFormat() instanceof SolidFill);
    }

    @Test
    public void deletePortionsTest() throws ApiException, IOException {
        initialize(null, null, null);

        Portions response = api.deletePortions(c_fileName, c_slideIndex, c_shapeIndex, c_paragraphIndex, null, c_password, c_folderName, null);
        assertEquals(0, response.getItems().size());
    }

    @Test
    public void deletePortionsIndexesTest() throws ApiException, IOException {
        initialize(null, null, null);
        Portions response = api.deletePortions(c_fileName, c_slideIndex, c_shapeIndex, c_paragraphIndex, new ArrayList<Integer>(Arrays.asList(1)), c_password, c_folderName, null);
        assertEquals(1, response.getItems().size());
    }

    @Test
    public void deleteSubshapePortionsTest() throws ApiException, IOException {
        initialize(null, null, null);

        Portions response = api.deleteSubshapePortions(c_fileName, c_slideIndex, c_shapePath, 1, c_paragraphIndex, null, c_password, c_folderName, null);
        assertEquals(0, response.getItems().size());
    }

    @Test
    public void deleteSubshapePortionsIndexesTest() throws ApiException, IOException {
        initialize(null, null, null);

        Portions response = api.deleteSubshapePortions(c_fileName, c_slideIndex, c_shapePath, 1, c_paragraphIndex, new ArrayList<Integer>(Arrays.asList(1)), c_password, c_folderName, null);
        assertEquals(1, response.getItems().size());
    }

    @Test
    public void deletePortionTest() throws ApiException, IOException {
        initialize(null, null, null);

        Portions response = api.deletePortion(c_fileName, c_slideIndex, c_shapeIndex, c_paragraphIndex, c_portionIndex, c_password, c_folderName, null);
        assertEquals(1, response.getItems().size());
    }

    @Test
    public void deleteSubshapePortionTest() throws ApiException, IOException {
        initialize(null, null, null);

        Portions response = api.deleteSubshapePortion(c_fileName, c_slideIndex, c_shapePath, 1, c_paragraphIndex, c_portionIndex, c_password, c_folderName, null);
        assertEquals(1, response.getItems().size());
    }

    @Test
    public void getPortionRectTest() throws ApiException, IOException {
        initialize(null, null, null);
        TextBounds response = api.getPortionRectangle(c_fileName, c_slideIndex, c_shapeIndex, c_paragraphIndex, c_portionIndex, c_password, c_folderName, null);
        assertNotNull(response);
        assertTrue(response.getX() > 0);
        assertTrue(response.getY() > 0);
        assertTrue(response.getWidth() > 0);
        assertTrue(response.getHeight() > 0);
    }

    @Test
    public void getPortionEffectiveTest() throws ApiException, IOException {
        initialize(null, null, null);
        Portion response = api.getPortionEffective(c_fileName, c_slideIndex, c_shapeIndex, c_paragraphIndex,
                c_portionIndex, c_password, c_folderName, null);
        assertEquals((Double)18.0, response.getFontHeight());
    }

    @Test
    public void getSubshapePortionEffectiveTest() throws ApiException, IOException {
        initialize(null, null, null);
        Portion response = api.getSubshapePortionEffective(c_fileName, c_slideIndex, c_shapePath, 1,
                c_paragraphIndex, c_portionIndex, c_password, c_folderName, null);
        assertEquals((Double)18.0, response.getFontHeight());
    }

    private final String c_folderName = "TempSlidesSDK";
    private final String c_fileName = "test.pptx";
    private final String c_password = "password";
    private final int c_slideIndex = 6;
    private final int c_shapeIndex = 2;
    private final int c_paragraphIndex = 1;
    private final int c_portionIndex = 1;
    private final String c_portionText = "portion 1";
    private final String c_newPortionText = "new portion text";
    private final String c_fontColor = "#FFF5FF8A";
    private final String c_shapePath = "3/shapes";
    private final String c_fontName = "Arial";
}
