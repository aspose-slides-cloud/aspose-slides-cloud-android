package com.aspose.slides.usecases;

import com.aspose.slides.ApiException;
import com.aspose.slides.ApiTest;
import com.aspose.slides.model.*;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * API tests for text format methods
 */
public class TextFormatTest extends ApiTest {
    @Test
    public void textFormat3DTest() throws ApiException, IOException {
        initialize(null, null, null);

        Shape dto = new Shape();
        dto.setShapeType(GeometryShape.ShapeTypeEnum.RECTANGLE);
        dto.setX(100.0);
        dto.setY(100.0);
        dto.setWidth(100.0);
        dto.setHeight(100.0);
        dto.setText("Sample text");

        ShapeBevel bottomBevel = new ShapeBevel();
        bottomBevel.setBevelType(ShapeBevel.BevelTypeEnum.CIRCLE);
        bottomBevel.setHeight(3.5);
        bottomBevel.setWidth(3.5);

        ShapeBevel topBevel = new ShapeBevel();
        topBevel.setBevelType(ShapeBevel.BevelTypeEnum.CIRCLE);
        topBevel.setHeight(4.0);
        topBevel.setWidth(4.0);

        LightRig lightRig = new LightRig();
        lightRig.setLightType(LightRig.LightTypeEnum.BALANCED);
        lightRig.setDirection(LightRig.DirectionEnum.TOP);
        lightRig.setXrotation(0.0);
        lightRig.setYrotation(0.0);
        lightRig.setZrotation(40.0);

        Camera camera = new Camera();
        camera.setCameraType(Camera.CameraTypeEnum.PERSPECTIVECONTRASTINGRIGHTFACING);

        ThreeDFormat threeDFormat = new ThreeDFormat();
        threeDFormat.setBevelBottom(bottomBevel);
        threeDFormat.setBevelTop(topBevel);
        threeDFormat.setCamera(camera);
        threeDFormat.setLightRig(lightRig);
        threeDFormat.setExtrusionColor("#FF008000");
        threeDFormat.setExtrusionHeight(6.0);
        threeDFormat.setContourColor("#FF25353D");
        threeDFormat.setContourWidth(1.5);
        threeDFormat.setDepth(3.0);
        threeDFormat.setMaterial(ThreeDFormat.MaterialEnum.PLASTIC);

        TextFrameFormat textFrameFormat = new TextFrameFormat();
        textFrameFormat.setTransform(TextFrameFormat.TransformEnum.ARCHUPPOUR);
        textFrameFormat.setThreeDFormat(threeDFormat);

        dto.setTextFrameFormat(textFrameFormat);

        ShapeBase shape = api.createShape(c_fileName, c_slideIndex, dto, null, null, c_password, c_folderName, null);
        assertTrue(shape instanceof Shape);
    }

    private final String c_folderName = "TempSlidesSDK";
    private final String c_fileName = "test.pptx";
    private final String c_password = "password";
    private final int c_slideIndex = 1;
}
