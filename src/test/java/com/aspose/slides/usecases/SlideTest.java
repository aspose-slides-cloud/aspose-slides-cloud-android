package com.aspose.slides.usecases;

import com.aspose.slides.ApiException;
import com.aspose.slides.ApiTest;
import com.aspose.slides.model.*;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * API tests for slide methods
 */
public class SlideTest extends ApiTest {
    @Test
    public void getSlidesTest() throws ApiException, IOException {
        initialize(null, null, null);
        Slides slides = api.getSlides(c_fileName, c_password, c_folderName, null);
        assertEquals(c_slideCount, slides.getSlideList().size());
    }

    @Test
    public void getSlideTest() throws ApiException, IOException {
        initialize(null, null, null);
        Slide slide = api.getSlide(c_fileName, c_slideIndex, c_password, c_folderName, null);
        assertNotNull(slide);
    }

    @Test
    public void createSlideTest() throws ApiException, IOException {
        initialize(null, null, null);
        Slides slides = api.createSlide(c_fileName, c_layoutSlidePath, 1, c_password, c_folderName, null);
        assertEquals(c_slideCount + 1, slides.getSlideList().size());
        slides = api.createSlide(c_fileName, null, null, c_password, c_folderName, null);
        assertEquals(c_slideCount + 2, slides.getSlideList().size());
    }

    @Test
    public void copySlideTest() throws ApiException, IOException {
        initialize(null, null, null);
        Slides slides = api.copySlide(c_fileName, 3, null, null, null, null, c_password, c_folderName, null);
        assertEquals(c_slideCount + 1, slides.getSlideList().size());
    }

    @Test
    public void copySlideFromSourceTest() throws ApiException, IOException {
        initialize(null, null, null);
        Slides slides = api.copySlide(c_fileName, c_slideIndex, 1,  c_folderName+"/"+c_sourceFileName, null, null, c_password, c_folderName, null);
        assertEquals(c_slideCount + 1, slides.getSlideList().size());
    }

    @Test
    public void moveSlideTest() throws ApiException, IOException {
        initialize(null, null, null);
        Slides slides = api.moveSlide(c_fileName, c_slideIndex, 2, c_password, c_folderName, null);
        assertEquals(c_slideCount, slides.getSlideList().size());
    }

    @Test
    public void reorderSlidesTest() throws ApiException, IOException {
        initialize(null, null, null);

        ArrayList oldPositions = new ArrayList(Arrays.asList(1,2,3,4,5,6));
        ArrayList newPositions = new ArrayList(Arrays.asList(6,5,4,3,2,1));

        Slides slides = api.reorderSlides(c_fileName, oldPositions, newPositions, c_password, c_folderName, null);
        assertEquals(c_slideCount, slides.getSlideList().size());
    }

    @Test
    public void updateSlideTest() throws ApiException, IOException {
        initialize(null, null, null);

        Slide dto = new Slide();
        ResourceUri resourceUri = new ResourceUri();
        resourceUri.setHref(c_layoutSlidePath);
        dto.setLayoutSlide(resourceUri);

        Slide slide = api.updateSlide(c_fileName, c_slideIndex, dto, c_password, c_folderName, null);
        assertTrue(slide.getLayoutSlide().getHref().contains(c_layoutSlidePath));
    }

    @Test
    public void deleteSlidesTest() throws ApiException, IOException {
        initialize(null, null, null);

        Slides slides = api.deleteSlides(c_fileName, null, c_password, c_folderName, null);
        assertEquals(1, slides.getSlideList().size());
    }

    @Test
    public void deleteSlidesIndexesTest() throws ApiException, IOException {
        initialize(null, null, null);

        ArrayList indexes = new ArrayList(Arrays.asList(1,3,5));
        Slides slides = api.deleteSlides(c_fileName, indexes, c_password, c_folderName, null);
        assertEquals(c_slideCount - 3, slides.getSlideList().size());
    }

    @Test
    public void deleteSlideTest() throws ApiException, IOException {
        initialize(null, null, null);

        Slides slides = api.deleteSlide(c_fileName, c_slideIndex, c_password, c_folderName, null);
        assertEquals(c_slideCount - 1, slides.getSlideList().size());
    }

    @Test
    public void getBackgroundTest() throws ApiException, IOException {
        initialize(null, null, null);

        int slideIndex = 5;
        SlideBackground response = api.getBackground(c_fileName, slideIndex, c_password, c_folderName, null);
        assertTrue(response.getFillFormat() instanceof SolidFill);
    }

    @Test
    public void setBackgroundTest() throws ApiException, IOException {
        initialize(null, null, null);

        SlideBackground dto = new SlideBackground();
        SolidFill fillFormat = new SolidFill();
        fillFormat.setColor(c_color);
        dto.setFillFormat(fillFormat);
        SlideBackground response = api.setBackground(c_fileName, c_slideIndex, dto, c_password, c_folderName, null);
        assertTrue(response.getFillFormat() instanceof SolidFill);
        assertEquals(c_color, ((SolidFill) response.getFillFormat()).getColor());
    }

    @Test
    public void setBackgroundColorTest() throws ApiException, IOException {
        initialize(null, null, null);

        SlideBackground response = api.setBackgroundColor(c_fileName, c_slideIndex, c_color, c_password, c_folderName, null);
        assertTrue(response.getFillFormat() instanceof SolidFill);
        assertEquals(c_color, ((SolidFill) response.getFillFormat()).getColor());
    }

    @Test
    public void deleteBackgroundTest() throws ApiException, IOException {
        initialize(null, null, null);

        int slideIndex = 5;
        SlideBackground response = api.deleteBackground(c_fileName, slideIndex, c_password, c_folderName, null);
        assertTrue(response.getFillFormat() instanceof NoFill);
    }

    private static final String c_folderName = "TempSlidesSDK";
    private static final String c_fileName = "test.pptx";
    private static final String c_sourceFileName = "TemplateCV.pptx";
    private static final String c_password = "password";
    private static final int c_slideIndex = 1;
    private static final int c_slideCount = 8;
    private static final String c_layoutSlidePath = "layoutSlides/3";
    private static final String c_color = "#FFF5FF8A";
}
