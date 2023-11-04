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
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Slides slides = testSlidesApi.getSlides(fileName, password, folderName, null);
        assertEquals(c_slideCount, slides.getSlideList().size());
    }

    @Test
    public void getSlideTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Slide slide = testSlidesApi.getSlide(fileName, c_slideIndex, password, folderName, null);
        assertNotNull(slide);
    }

    @Test
    public void createSlideTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Slides slides = testSlidesApi.createSlide(fileName, c_layoutSlidePath, 1, password, folderName, null);
        assertEquals(c_slideCount + 1, slides.getSlideList().size());
        slides = testSlidesApi.createSlide(fileName, null, null, password, folderName, null);
        assertEquals(c_slideCount + 2, slides.getSlideList().size());
    }

    @Test
    public void copySlideTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Slides slides = testSlidesApi.copySlide(fileName, 3, null, null, null, null, password, folderName, null);
        assertEquals(c_slideCount + 1, slides.getSlideList().size());
    }

    @Test
    public void copySlideFromSourceTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Slides slides = testSlidesApi.copySlide(fileName, c_slideIndex, 1,  folderName + "/" + c_sourceFileName, null, null, password, folderName, null);
        assertEquals(c_slideCount + 1, slides.getSlideList().size());
    }

    @Test
    public void moveSlideTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Slides slides = testSlidesApi.moveSlide(fileName, c_slideIndex, 2, password, folderName, null);
        assertEquals(c_slideCount, slides.getSlideList().size());
    }

    @Test
    public void reorderSlidesTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        ArrayList oldPositions = new ArrayList(Arrays.asList(1,2,3,4,5,6));
        ArrayList newPositions = new ArrayList(Arrays.asList(6,5,4,3,2,1));

        Slides slides = testSlidesApi.reorderSlides(fileName, oldPositions, newPositions, password, folderName, null);
        assertEquals(c_slideCount, slides.getSlideList().size());
    }

    @Test
    public void updateSlideTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        Slide dto = new Slide();
        ResourceUri resourceUri = new ResourceUri();
        resourceUri.setHref(c_layoutSlidePath);
        dto.setLayoutSlide(resourceUri);

        Slide slide = testSlidesApi.updateSlide(fileName, c_slideIndex, dto, password, folderName, null);
        assertTrue(slide.getLayoutSlide().getHref().contains(c_layoutSlidePath));
    }

    @Test
    public void deleteSlidesTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        Slides slides = testSlidesApi.deleteSlides(fileName, null, password, folderName, null);
        assertEquals(1, slides.getSlideList().size());
    }

    @Test
    public void deleteSlidesIndexesTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        ArrayList indexes = new ArrayList(Arrays.asList(1,3,5));
        Slides slides = testSlidesApi.deleteSlides(fileName, indexes, password, folderName, null);
        assertEquals(c_slideCount - 3, slides.getSlideList().size());
    }

    @Test
    public void deleteSlideTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        Slides slides = testSlidesApi.deleteSlide(fileName, c_slideIndex, password, folderName, null);
        assertEquals(c_slideCount - 1, slides.getSlideList().size());
    }

    @Test
    public void getBackgroundTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        int slideIndex = 5;
        SlideBackground response = testSlidesApi.getBackground(fileName, slideIndex, password, folderName, null);
        assertTrue(response.getFillFormat() instanceof SolidFill);
    }

    @Test
    public void setBackgroundTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        SlideBackground dto = new SlideBackground();
        SolidFill fillFormat = new SolidFill();
        fillFormat.setColor(c_color);
        dto.setFillFormat(fillFormat);
        SlideBackground response = testSlidesApi.setBackground(fileName, c_slideIndex, dto, password, folderName, null);
        assertTrue(response.getFillFormat() instanceof SolidFill);
        assertEquals(c_color, ((SolidFill) response.getFillFormat()).getColor());
    }

    @Test
    public void setBackgroundColorTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        SlideBackground response = testSlidesApi.setBackgroundColor(fileName, c_slideIndex, c_color, password, folderName, null);
        assertTrue(response.getFillFormat() instanceof SolidFill);
        assertEquals(c_color, ((SolidFill) response.getFillFormat()).getColor());
    }

    @Test
    public void deleteBackgroundTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        int slideIndex = 5;
        SlideBackground response = testSlidesApi.deleteBackground(fileName, slideIndex, password, folderName, null);
        assertTrue(response.getFillFormat() instanceof NoFill);
    }

    private static final String c_sourceFileName = "TemplateCV.pptx";
    private static final int c_slideIndex = 1;
    private static final int c_slideCount = 9;
    private static final String c_layoutSlidePath = "layoutSlides/3";
    private static final String c_color = "#FFF5FF8A";
}
