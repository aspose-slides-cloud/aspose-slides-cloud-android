// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="ShapeTests.cs">
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
import java.util.Arrays;
import java.util.List;
import java.util.Base64;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * API tests for shape types
 */
public class ShapeTest extends ApiTest {

    @Test
    public void getShapesTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Shapes shapes = testSlidesApi.getShapes(fileName, c_slideIndex, password, folderName, null, null, null);
        assertEquals(2, shapes.getShapesLinks().size());
    }

    @Test
    public void getShapesByTypeTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Shapes shapes = testSlidesApi.getShapes(fileName, c_slideIndex, password, folderName, null, ShapeType.CHART, null);
        assertEquals(2, shapes.getShapesLinks().size());
    }

    @Test
    public void getSubShapesTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Shapes shapes = testSlidesApi.getShapes(fileName, 1, password, folderName, null, null, "4");
        assertEquals(2, shapes.getShapesLinks().size());
    }

    @Test
    public void getShapeTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        ShapeBase shape = testSlidesApi.getShape(fileName, c_slideIndex, 1, password, folderName, null, null);
        assertEquals(ShapeBase.TypeEnum.CHART, shape.getType());
    }

    @Test
    public void getSubShapeTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        ShapeBase shape = testSlidesApi.getShape(fileName, 1, 4, password, folderName, null, "1");
        assertEquals(ShapeBase.TypeEnum.SHAPE, shape.getType());
    }

    @Test
    public void shapeAddTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Shape dto = new Shape();
        dto.setShapeType(GeometryShape.ShapeTypeEnum.CALLOUT1);
        ShapeBase shape = testSlidesApi.createShape(fileName, c_slideIndex, dto, null, null, password, folderName, null, null);
        assertTrue(shape instanceof Shape);
    }

    @Test
    public void shapeLoadAndSaveTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        ShapeBase dto = testSlidesApi.getShape(fileName, c_slideIndex, 1, password, folderName, null, null);
        ShapeBase shape = testSlidesApi.updateShape(fileName, c_slideIndex, 1, dto, password, folderName, null, null);
        assertTrue(shape instanceof Chart);
    }

    @Test
    public void shapeEmptyTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        try {
            //Cannot create shape with no ShapeType specified
            testSlidesApi.createShape(fileName, c_slideIndex, new Shape(), null, null, password, folderName, null, null);
        } catch (Exception ex) {
            assertTrue(ex instanceof ApiException);
        }
    }

    @Test
    public void graphicalObjectEmptyTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        try {
            //Cannot create a graphical object
            testSlidesApi.createShape(fileName, c_slideIndex, new GraphicalObject(), null, null, password, folderName, null, null);
        } catch (Exception ex) {
            assertTrue(ex instanceof ApiException);
        }
    }

    @Test
    public void pictureFrameAddTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        PictureFrame dto = new PictureFrame();
        PictureFill pictureFill = new PictureFill();
        pictureFill.setBase64Data("iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAYAAAAfFcSJAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAAJcEhZcwAADsQAAA7EAZUrDhsAAAANSURBVBhXY5g+ffp/AAZTAsWGL27gAAAAAElFTkSuQmCC");
        dto.setPictureFillFormat(pictureFill);
        ShapeBase shape = testSlidesApi.createShape(fileName, c_slideIndex, dto, null, null, password, folderName, null, null);
        assertTrue(shape instanceof PictureFrame);
    }

    @Test
    public void pictureFrameEmptyTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        try {
            //Cannot create picture with no data specified
            testSlidesApi.createShape(fileName, c_slideIndex, new PictureFrame(), null, null, password, folderName, null, null);
        } catch (Exception ex) {
            assertTrue(ex instanceof ApiException);
        }
    }

    @Test
    public void audioFrameAddTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        AudioFrame dto = new AudioFrame();
        dto.setBase64Data("bXAzc2FtcGxl");
        ShapeBase shape = testSlidesApi.createShape(fileName, c_slideIndex, dto, null, null, password, folderName, null, null);
        assertTrue(shape instanceof AudioFrame);
    }

    @Test
    public void audioFrameEmptyTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        try {
            //Cannot create audio with no data specified
            testSlidesApi.createShape(fileName, c_slideIndex, new AudioFrame(), null, null, password, folderName, null, null);
        } catch (Exception ex) {
            assertTrue(ex instanceof ApiException);
        }
    }

    @Test
    public void videoFrameAddTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        VideoFrame dto = new VideoFrame();
        dto.setBase64Data("bXAzc2FtcGxl");
        ShapeBase shape = testSlidesApi.createShape(fileName, c_slideIndex, dto, null, null, password, folderName, null, null);
        assertTrue(shape instanceof VideoFrame);
    }

    @Test
    public void videoFrameEmptyTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        try {
            //Cannot create video with no data specified
            testSlidesApi.createShape(fileName, c_slideIndex, new VideoFrame(), null, null, password, folderName, null, null);
        } catch (Exception ex) {
            assertTrue(ex instanceof ApiException);
        }
    }

    @Test
    public void oleObjectFrameEmptyTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        try {
            //Cannot create an OleObjectFrame
            testSlidesApi.createShape(fileName, c_slideIndex, new OleObjectFrame(), null, null, password, folderName, null, null);
        } catch (Exception ex) {
            assertTrue(ex instanceof ApiException);
        }
    }

    @Test
    public void smartArtAddTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        SmartArt dto = new SmartArt();
        dto.setX(0.0);
        dto.setY(0.0);
        dto.setWidth(300.0);
        dto.setHeight(200.0);
        dto.setLayout(SmartArt.LayoutEnum.BASICPROCESS);
        dto.setQuickStyle(SmartArt.QuickStyleEnum.SIMPLEFILL);
        dto.setColorStyle(SmartArt.ColorStyleEnum.COLOREDFILLACCENT1);
        List<SmartArtNode> nodes = new ArrayList<SmartArtNode>();
        SmartArtNode node1 = new SmartArtNode();
        node1.setText("First");
        node1.setOrgChartLayout(SmartArtNode.OrgChartLayoutEnum.INITIAL);
        List<SmartArtNode> subnodes = new ArrayList<SmartArtNode>();
        SmartArtNode subnode1 = new SmartArtNode();
        subnode1.setText("SubFirst");
        subnode1.setOrgChartLayout(SmartArtNode.OrgChartLayoutEnum.INITIAL);
        subnodes.add(subnode1);
        node1.setNodes(subnodes);
        nodes.add(node1);
        SmartArtNode node2 = new SmartArtNode();
        node2.setText("Second");
        node2.setOrgChartLayout(SmartArtNode.OrgChartLayoutEnum.INITIAL);
        nodes.add(node2);
        dto.setNodes(nodes);
        ShapeBase shape = testSlidesApi.createShape(fileName, c_slideIndex, dto, null, null, password, folderName, null, null);
        assertTrue(shape instanceof SmartArt);
    }

    @Test
    public void smartArtTextFormatting() throws ApiException{
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Portion portion = new Portion();
        portion.setText("New text");
        portion.setFontHeight(24.0);
        portion.setFontBold(Portion.FontBoldEnum.TRUE);
        portion.spacing(3.0);
        SolidFill fillFormat = new SolidFill();
        fillFormat.setColor("#FFFFFF00");
        portion.setFillFormat(fillFormat);

        String targetNodePath = "1/nodes/2";
        int slideIndex = 7;

        Portion response = testSlidesApi.updatePortion(fileName, slideIndex, 1, 1, 1, portion, password, folderName, null, targetNodePath);
        assertNotNull(response);
        assertEquals(portion.getText(), response.getText());
        assertEquals(portion.getFontHeight(), response.getFontHeight());
        assertEquals(portion.getFontHeight(), response.getFontHeight());
        assertEquals(portion.getFontBold(), response.getFontBold());
        assertEquals(portion.getSpacing(), response.getSpacing());
        assertTrue(portion.getFillFormat() instanceof SolidFill);
    }

    @Test
    public void smartArtEmptyTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        ShapeBase shape = testSlidesApi.createShape(fileName, c_slideIndex, new SmartArt(), null, null, password, folderName, null, null);
        assertTrue(shape instanceof SmartArt);
    }

    @Test
    public void chartEmptyTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        try {
            //Cannot create a chart without series
            ShapeBase shape = testSlidesApi.createShape(fileName, c_slideIndex, new Chart(), null, null, password, folderName, null, null);
        } catch (Exception ex) {
            assertTrue(ex instanceof ApiException);
        }
    }

    @Test
    public void tableAddTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Table dto = new Table();
        dto.setX(30.0);
        dto.setY(20.0);
        dto.setStyle(Table.StyleEnum.MEDIUMSTYLE2ACCENT1);
        dto.setFirstRow(true);
        dto.setHorizontalBanding(true);
        List<TableRow> rows = new ArrayList<TableRow>();
        TableRow row1 = new TableRow();
        List<TableCell> cells1 = new ArrayList<TableCell>();
        TableCell cell11 = new TableCell();
        cell11.setText("0.1");
        cells1.add(cell11);
        TableCell cell12 = new TableCell();
        cell12.setText("0.2");
        cells1.add(cell12);
        TableCell cell13 = new TableCell();
        cell13.setText("0.3");
        cells1.add(cell13);
        TableCell cell14 = new TableCell();
        cell14.setText("0.4");
        cells1.add(cell14);
        row1.setCells(cells1);
        rows.add(row1);
        TableRow row2 = new TableRow();
        row2.setMinimalHeight(60.0);
        List<TableCell> cells2 = new ArrayList<TableCell>();
        TableCell cell21 = new TableCell();
        cell21.setText("1");
        cells2.add(cell21);
        TableCell cell22 = new TableCell();
        cell22.setText("2-3");
        cell22.setColSpan(2);
        cell22.setRowSpan(2);
        cells2.add(cell22);
        TableCell cell23 = new TableCell();
        cell23.setText("4");
        cells2.add(cell23);
        row2.setCells(cells2);
        rows.add(row2);
        TableRow row3 = new TableRow();
        List<TableCell> cells3 = new ArrayList<TableCell>();
        TableCell cell31 = new TableCell();
        cell31.setText("first");
        cells3.add(cell31);
        TableCell cell32 = new TableCell();
        cell32.setText("last");
        cells3.add(cell32);
        row3.setCells(cells3);
        rows.add(row3);
        TableRow row4 = new TableRow();
        List<TableCell> cells4 = new ArrayList<TableCell>();
        TableCell cell41 = new TableCell();
        cell41.setText("3.1");
        cells4.add(cell41);
        TableCell cell42 = new TableCell();
        cell42.setText("3.2");
        cells4.add(cell42);
        TableCell cell43 = new TableCell();
        cell43.setText("3.3");
        cells4.add(cell43);
        TableCell cell44 = new TableCell();
        cell44.setText("3.4");
        cells4.add(cell44);
        row4.setCells(cells4);
        rows.add(row4);
        TableRow row5 = new TableRow();
        List<TableCell> cells5 = new ArrayList<TableCell>();
        TableCell cell51 = new TableCell();
        cell51.setText("4.1");
        cells5.add(cell51);
        TableCell cell52 = new TableCell();
        cell52.setText("4.2");
        cells5.add(cell52);
        TableCell cell53 = new TableCell();
        cell53.setText("4.3");
        cells5.add(cell53);
        TableCell cell54 = new TableCell();
        cell54.setText("4.4");
        cells5.add(cell54);
        row5.setCells(cells5);
        rows.add(row5);
        dto.setRows(rows);
        List<TableColumn> columns = new ArrayList<TableColumn>();
        TableColumn column1 = new TableColumn();
        column1.setWidth(100.0);
        columns.add(column1);
        TableColumn column2 = new TableColumn();
        column2.setWidth(100.0);
        columns.add(column2);
        TableColumn column3 = new TableColumn();
        column3.setWidth(100.0);
        columns.add(column3);
        TableColumn column4 = new TableColumn();
        column4.setWidth(100.0);
        columns.add(column4);
        dto.setColumns(columns);
        ShapeBase shape = testSlidesApi.createShape(fileName, c_slideIndex, dto, null, null, password, folderName, null, null);
        assertTrue(shape instanceof Table);
    }

    @Test
    public void tableEmptyTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        try {
            //Cannot create a table with no columns and rows
            testSlidesApi.createShape(fileName, c_slideIndex, new Table(), null, null, password, folderName, null, null);
        } catch (Exception ex) {
            assertTrue(ex instanceof ApiException);
        }
    }

    @Test
    public void groupShapeEmptyTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        ShapeBase shape = testSlidesApi.createShape(fileName, c_slideIndex, new GroupShape(), null, null, password, folderName, null, null);
        assertTrue(shape instanceof GroupShape);
    }

    @Test
    public void connectorAddTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Connector dto = new Connector();
        dto.setShapeType(GeometryShape.ShapeTypeEnum.BENTCONNECTOR3);
        ResourceUri startShape = new ResourceUri();
        startShape.setHref("https://api.aspose.cloud/v3.0/slides/myPresentation.pptx/slides/1/shapes/1");
        dto.setStartShapeConnectedTo(startShape);
        ResourceUri endShape = new ResourceUri();
        endShape.setHref("https://api.aspose.cloud/v3.0/slides/myPresentation.pptx/slides/1/shapes/2");
        dto.setEndShapeConnectedTo(endShape);
        ShapeBase shape = testSlidesApi.createShape(fileName, c_slideIndex, dto, null, null, password, folderName, null, null);
        assertTrue(shape instanceof Connector);
    }

    @Test
    public void connectorEmptyTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        ShapeBase shape = testSlidesApi.createShape(fileName, c_slideIndex, new Connector(), null, null, password, folderName, null, null);
        assertTrue(shape instanceof Connector);
    }

    @Test
    public void createSubShapeTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Shape dto = new Shape();
        dto.setShapeType(GeometryShape.ShapeTypeEnum.RECTANGLE);
        dto.setX(200.0);
        dto.setY(200.0);
        dto.setWidth(50.0);
        dto.setHeight(50.0);

        ShapeBase response = testSlidesApi.createShape(fileName, 1, dto, null, null, password, folderName, null, "4");
        assertTrue(response instanceof Shape);
    }

    @Test
    public void updateShapeTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Shape dto = new Shape();
        dto.setWidth(200.0);
        dto.setHeight(200.0);
        SolidFill fillFormat = new SolidFill();
        fillFormat.setColor(c_color);
        dto.setFillFormat(fillFormat);

        ShapeBase response = testSlidesApi.updateShape(fileName, 1, 3, dto, password, folderName, null, null);
        assertTrue(response instanceof Shape);
        assertEquals(dto.getWidth(), response.getWidth());
        assertEquals(dto.getHeight(), response.getHeight());
        assertTrue(response.getFillFormat() instanceof SolidFill);
    }

    @Test
    public void updateSubShapeTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Shape dto = new Shape();
        dto.setWidth(200.0);
        dto.setHeight(200.0);
        GradientFill fillFormat = new GradientFill();
        fillFormat.setShape(GradientFill.ShapeEnum.LINEAR);
        fillFormat.setDirection(GradientFill.DirectionEnum.FROMCORNER1);
        ArrayList<GradientFillStop> gradientFillStops = new ArrayList<GradientFillStop>();
        GradientFillStop gradientFillStop1 = new GradientFillStop();
        gradientFillStop1.setColor(c_color);
        gradientFillStop1.setPosition(0.0);
        gradientFillStops.add(gradientFillStop1);
        GradientFillStop gradientFillStop2 = new GradientFillStop();
        gradientFillStop2.setColor(c_color);
        gradientFillStop2.setPosition(1.0);
        gradientFillStops.add(gradientFillStop2);
        fillFormat.setStops(gradientFillStops);
        dto.setFillFormat(fillFormat);
        dto.setFillFormat(fillFormat);

        ShapeBase response = testSlidesApi.updateShape(fileName, 1, 4, dto, password, folderName, null, "1");
        assertTrue(response instanceof Shape);
        assertEquals(dto.getWidth(), response.getWidth());
        assertEquals(dto.getHeight(), response.getHeight());
        assertTrue(response.getFillFormat() instanceof GradientFill);
    }

    @Test
    public void deleteShapesTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Shapes shapes = testSlidesApi.deleteShapes(fileName, c_slideIndex, null, password, folderName, null, null);
        assertEquals(0, shapes.getShapesLinks().size());
    }

    @Test
    public void deleteShapesIndexesTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Shapes shapes = testSlidesApi.deleteShapes(fileName, c_slideIndex, new ArrayList<Integer>(Arrays.asList(2)), password,
                folderName, null, null);
        assertEquals(1, shapes.getShapesLinks().size());
    }

    @Test
    public void deleteSubshapesTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Shapes shapes = testSlidesApi.deleteShapes(fileName, 1, null, password, folderName, null, "4");
        assertEquals(0, shapes.getShapesLinks().size());
    }

    @Test
    public void deleteSubshapesIndexesTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Shapes shapes = testSlidesApi.deleteShapes(fileName, 1, new ArrayList<Integer>(Arrays.asList(2)), password, folderName, null, "4");
        assertEquals(1, shapes.getShapesLinks().size());
    }

    @Test
    public void deleteShapeTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Shapes response = testSlidesApi.deleteShape(fileName, 1, 4, password, folderName, null,null);
        assertEquals(3, response.getShapesLinks().size());
    }

    @Test
    public void deleteSubshapeTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Shapes response = testSlidesApi.deleteShape(fileName, 1, 4, password, folderName, null, "1");
        assertEquals(1, response.getShapesLinks().size());
    }

    @Test
    public void shapesAlignTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        ShapeBase shape1 = testSlidesApi.getShape(fileName, 2, 1, password, folderName, null, null);
        ShapeBase shape2 = testSlidesApi.getShape(fileName, 2, 2, password, folderName, null, null);
        assertNotEquals(shape1.getX(), shape2.getX(), 1.0);
        assertNotEquals(shape1.getY(), shape2.getY(), 1.0);

        testSlidesApi.alignShapes(fileName, 2, ShapesAlignmentType.ALIGNTOP, null, null, password, folderName, null, null);
        shape1 = testSlidesApi.getShape(fileName, 2, 1, password, folderName, null, null);
        shape2 = testSlidesApi.getShape(fileName, 2, 2, password, folderName, null, null);
        assertNotEquals(shape1.getX(), shape2.getX(), 1.0);
        assertEquals(shape1.getY(), shape2.getY(), 1.0);

        List<Integer> shapes = new ArrayList<Integer>();
        shapes.add(1);
        shapes.add(2);
        testSlidesApi.alignShapes(fileName, 2, ShapesAlignmentType.ALIGNLEFT, true, shapes, password, folderName, null, null);
        shape1 = testSlidesApi.getShape(fileName, 2, 1, password, folderName, null, null);
        shape2 = testSlidesApi.getShape(fileName, 2, 2, password, folderName, null, null);
        assertEquals(shape1.getX(), shape2.getX(), 1.0);
        assertEquals(shape1.getY(), shape2.getY(), 1.0);
        assertEquals(0.0, shape1.getX().doubleValue(), 1.0);
    }

    @Test
    public void shapesAlignGroupTest() throws ApiException, IOException {
        int slideIndex = 1;
        String path = "4/shapes";
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        ShapeBase shape1 = testSlidesApi.getShape(fileName, slideIndex, 4, password, folderName, null, "1");
        ShapeBase shape2 = testSlidesApi.getShape(fileName, slideIndex, 4, password, folderName, null, "2");
        assertNotEquals(shape1.getX(), shape2.getX(), 1.0);
        assertNotEquals(shape1.getY(), shape2.getY(), 1.0);

        testSlidesApi.alignShapes(fileName, slideIndex, ShapesAlignmentType.ALIGNTOP, null, null, password, folderName, null, "4");
        shape1 = testSlidesApi.getShape(fileName, slideIndex, 4, password, folderName, null, "1");
        shape2 = testSlidesApi.getShape(fileName, slideIndex, 4, password, folderName, null, "2");
        assertNotEquals(shape1.getX(), shape2.getX(), 1.0);
        assertEquals(shape1.getY(), shape2.getY(), 1.0);

        List<Integer> shapes = new ArrayList<Integer>();
        shapes.add(1);
        shapes.add(2);
        testSlidesApi.alignShapes(fileName, slideIndex, ShapesAlignmentType.ALIGNLEFT, true, shapes, password, folderName, null, "4");
        shape1 = testSlidesApi.getShape(fileName, slideIndex, 4, password, folderName, null, "1");
        shape2 = testSlidesApi.getShape(fileName, slideIndex, 4, password, folderName, null, "2");
        assertEquals(shape1.getX(), shape2.getX(), 1.0);
        assertEquals(shape1.getY(), shape2.getY(), 1.0);
        assertEquals(0.0, shape1.getX().doubleValue(), 1.0);
    }

    @Test
    public void shapeGeometryGetTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        GeometryPaths paths = testSlidesApi.getShapeGeometryPath(fileName, 4, 2, password, folderName, null);
        assertTrue(paths.getPaths() != null);
        assertEquals(1, paths.getPaths().size());
    }

    @Test
    public void shapeGeometrySetTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        GeometryPaths dto = new GeometryPaths();
        List<GeometryPath> paths = new ArrayList<GeometryPath>();
        GeometryPath path = new GeometryPath();
        List<PathSegment> pathData = new ArrayList<PathSegment>();
        MoveToPathSegment startSegment = new MoveToPathSegment();
        startSegment.setX(0.0);
        startSegment.setY(0.0);
        pathData.add(startSegment);
        LineToPathSegment line1Segment = new LineToPathSegment();
        line1Segment.setX(0.0);
        line1Segment.setY(200.0);
        pathData.add(line1Segment);
        LineToPathSegment line2Segment = new LineToPathSegment();
        line2Segment.setX(200.0);
        line2Segment.setY(300.0);
        pathData.add(line2Segment);
        LineToPathSegment line3Segment = new LineToPathSegment();
        line3Segment.setX(400.0);
        line3Segment.setY(200.0);
        pathData.add(line3Segment);
        LineToPathSegment line4Segment = new LineToPathSegment();
        line4Segment.setX(400.0);
        line4Segment.setY(0.0);
        pathData.add(line4Segment);
        ClosePathSegment endSegment = new ClosePathSegment();
        pathData.add(endSegment);
        path.setPathData(pathData);
        paths.add(path);
        dto.setPaths(paths);
        ShapeBase shape = testSlidesApi.setShapeGeometryPath(fileName, 4, 1, dto, password, folderName, null);
        assertTrue(shape != null);
    }

    @Test
    public void zoomFrameAddTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        ZoomFrame dto = new ZoomFrame();
        dto.setX(20.0);
        dto.setY(20.0);
        dto.setWidth(200.0);
        dto.setHeight(100.0);
        dto.setTargetSlideIndex(2);

        ShapeBase shape = testSlidesApi.createShape(fileName, c_slideIndex, dto, null, null, password, folderName, null, null);
        assertTrue(shape instanceof ZoomFrame);
        assertEquals(dto.getTargetSlideIndex(), ((ZoomFrame)shape).getTargetSlideIndex());
    }

    @Test
    public void sectionZoomFrameAddTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        SectionZoomFrame dto = new SectionZoomFrame();
        dto.setX(20.0);
        dto.setY(20.0);
        dto.setWidth(200.0);
        dto.setHeight(100.0);
        dto.setTargetSectionIndex(2);

        ShapeBase shape = testSlidesApi.createShape(fileName, c_slideIndex, dto, null, null, password, folderName, null, null);
        assertTrue(shape instanceof SectionZoomFrame);
        assertEquals(dto.getTargetSectionIndex(), ((SectionZoomFrame)shape).getTargetSectionIndex());
    }

    @Test
    public void oleObjectFrameAddByLinkTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        OleObjectFrame dto = new OleObjectFrame();
        dto.setX(100.0);
        dto.setY(100.0);
        dto.setWidth(200.0);
        dto.setHeight(200.0);
        dto.setLinkPath(c_oleObjectFileName);
        dto.embeddedFileExtension("xlsx");

        ShapeBase shape = testSlidesApi.createShape(fileName, c_slideIndex, dto, null, null, password, folderName, null, null);
        assertTrue(shape instanceof OleObjectFrame);
        assertEquals(((OleObjectFrame)shape).getLinkPath(), dto.getLinkPath());
    }

    @Test
    public void oleObjectFrameAddEmbeddedTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_oleObjectFileName));

        OleObjectFrame dto = new OleObjectFrame();
        dto.setX(100.0);
        dto.setY(100.0);
        dto.setWidth(200.0);
        dto.setHeight(200.0);

        String base64Data = new String(Base64.getEncoder().encode(file));
        dto.setEmbeddedFileBase64Data(base64Data);
        dto.embeddedFileExtension("xlsx");

        ShapeBase shape = testSlidesApi.createShape(fileName, c_slideIndex, dto, null, null, password, folderName, null, null);
        assertTrue(shape instanceof OleObjectFrame);
        assertNotNull(((OleObjectFrame)shape).getEmbeddedFileBase64Data());
    }

    @Test
    public void groupShapeAddTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        int slideIndex = 5;
        Shapes shapes = testSlidesApi.getShapes(fileName, slideIndex, password, folderName, null, null, null);
        assertEquals(0, shapes.getShapesLinks().size());

        GroupShape dto = new GroupShape();
        testSlidesApi.createShape(fileName, slideIndex, dto, null, null, password, folderName, null, null);

        Shape shape1 = new Shape();
        shape1.setShapeType(GeometryShape.ShapeTypeEnum.RECTANGLE);
        shape1.setX(50.0);
        shape1.setY(400.0);
        shape1.setWidth(50.0);
        shape1.setHeight(50.0);

        Shape shape2 = new Shape();
        shape2.setShapeType(GeometryShape.ShapeTypeEnum.ELLIPSE);
        shape2.setX(150.0);
        shape2.setY(400.0);
        shape2.setWidth(50.0);
        shape2.setHeight(50.0);

        Shape shape3 = new Shape();
        shape3.setShapeType(GeometryShape.ShapeTypeEnum.TRIANGLE);
        shape3.setX(250.0);
        shape3.setY(400.0);
        shape3.setWidth(50.0);
        shape3.setHeight(50.0);

        testSlidesApi.createShape(fileName, slideIndex,  shape1, null, null, password, folderName, null, "1");
        testSlidesApi.createShape(fileName, slideIndex,  shape2, null, null, password, folderName, null, "1");
        testSlidesApi.createShape(fileName, slideIndex,  shape3, null, null, password, folderName, null, "1");

        shapes = testSlidesApi.getShapes(fileName, slideIndex, password, folderName, null, null, null);
        assertEquals(1, shapes.getShapesLinks().size());

        shapes = testSlidesApi.getShapes(fileName, slideIndex, password, folderName, null, null, "1");
        assertEquals(3, shapes.getShapesLinks().size());
    }

    @Test
    public void importShapesFromSvgTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        int slideIndex = 5;
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_svgFile));

        Shapes response = testSlidesApi.importShapesFromSvg(fileName, slideIndex, file, 50, 50, 300, 300,
                Arrays.asList(1,3,5), false, password, folderName, null);
        assertTrue(response.getShapesLinks().size() == 3);
    }

    @Test
    public void createSmartArtNodeTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        int slideIndex = 7;
        String newNodeText = "New root node";
        SmartArt response = testSlidesApi.createSmartArtNode(fileName, slideIndex, c_smartArtIndex, null, newNodeText,
                null, password, folderName, null);
        assertEquals(response.getNodes().size(), 2);
        assertEquals(response.getNodes().get(1).getText(), newNodeText);
    }

    @Test
    public void createSmartArtSubNodeTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        int slideIndex = 7;
        String newSubNodeText = "New sub-node";
        String subNodePath = "1";
        int position = 1;
        SmartArt response = testSlidesApi.createSmartArtNode(fileName, slideIndex, c_smartArtIndex, subNodePath, newSubNodeText,
                position, password, folderName, null);
        assertEquals(response.getNodes().get(0).getNodes().size(), 5);
        assertEquals(response.getNodes().get(0).getNodes().get(0).getText(), newSubNodeText);
    }

    @Test
    public void createSmartArtSubSubNodeTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        int slideIndex = 7;
        String newSubNodeText = "New sub-sub-node";
        String subNodePath = "1/nodes/1";
        SmartArt response = testSlidesApi.createSmartArtNode(fileName, slideIndex, c_smartArtIndex, subNodePath, newSubNodeText,
                null, password, folderName, null);
        assertEquals(response.getNodes().get(0).getNodes().get(0).getNodes().size(), 1);
        assertEquals(response.getNodes().get(0).getNodes().get(0).getNodes().get(0).getText(), newSubNodeText);
    }

    @Test
    public void deleteSmartArtNodeTest() throws ApiException, IOException {
        int slideIndex = 7;
        int smartArtIndex = 2;
        int nodeIndex = 1;
        SmartArt response = testSlidesApi.deleteSmartArtNode(fileName, slideIndex, smartArtIndex, nodeIndex, null, password, folderName, null);
        assertEquals(response.getNodes().size(), 2);
    }

    @Test
    public void deleteSmartArtSubNodeTest() throws ApiException, IOException {
        int slideIndex = 7;
        int nodeIndex = 1;
        String subNodePath = "2";
        SmartArt response = testSlidesApi.deleteSmartArtNode(
                fileName, slideIndex, c_smartArtIndex, nodeIndex, subNodePath, password, folderName, null);
        assertEquals(response.getNodes().get(0).getNodes().size(), 3);
    }

    @Test
    public void downloadShapeFromDtoTest() throws ApiException, IOException {
        Shape dto = new Shape();
        dto.setShapeType(GeometryShape.ShapeTypeEnum.RECTANGLE);
        dto.setWidth(400.0);
        dto.setHeight(200.0);
        dto.setText("New shape");

        File result = testSlidesApi.downloadShapeFromDto(ShapeExportFormat.PNG, dto);
        assertNotNull(result);
        assertTrue(result.length() > 0);
        assertTrue(result.canRead());
    }

    private final String c_svgFile = "shapes.svg";
    private final int c_slideIndex = 3;
    private final int c_smartArtIndex = 1;
    private final String c_color = "#FFF5FF8A";
    private final String c_oleObjectFileName = "oleObject.xlsx";
}
