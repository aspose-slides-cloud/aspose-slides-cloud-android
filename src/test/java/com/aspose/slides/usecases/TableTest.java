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
 * API tests for slide methods
 */
public class TableTest extends ApiTest {
    @Test
    public void updateTableCell() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        int rowIndex = 2;
        int cellIndex = 1;
        TableCell dto = new TableCell();
        dto.setText("Test text");

        TableCell response = testSlidesApi.updateTableCell(fileName, c_slideIndex, c_shapeIndex, rowIndex, cellIndex, dto, password, folderName, null);
        assertEquals(response.getText(), dto.getText());
    }

    @Test
    public void createTableRow() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        TableCell cell0 = new TableCell();
        cell0.setText("Cell 1");
        TableCell cell1 = new TableCell();
        cell1.setText("Cell 2");
        TableCell cell2 = new TableCell();
        cell2.setText("Cell 3");
        TableCell cell3 = new TableCell();
        cell3.setText("Cell 4");

        TableRow dto = new TableRow();
        dto.setMinimalHeight(30.0);
        dto.setCells(new ArrayList(Arrays.asList(cell0, cell1, cell2, cell3)));

        TableRow response = testSlidesApi.createTableRow(fileName, c_slideIndex, c_shapeIndex, dto, null, password, folderName, null);
        assertEquals(response.getCells().size(), dto.getCells().size());
        assertEquals(response.getMinimalHeight(), dto.getMinimalHeight());
    }

    @Test
    public void deleteTableRow() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        int rowIndex = 2;
        Boolean withAttachedRows = true;

        Table response = testSlidesApi.deleteTableRow(fileName, c_slideIndex, c_shapeIndex, rowIndex, withAttachedRows, password, folderName, null);
        assertEquals(response.getRows().size(), 2);
    }

    @Test
    public void updateTableRow() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        int rowIndex = 1;
        TableRow dto = new TableRow();
        dto.setMinimalHeight(30.0);

        TableRow response = testSlidesApi.updateTableRow(fileName, c_slideIndex, c_shapeIndex, rowIndex, dto, password, folderName, null);
        assertEquals(response.getMinimalHeight(), dto.getMinimalHeight());
    }

    @Test
    public void mergeTableCells() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        TableCellMergeOptions dto = new TableCellMergeOptions();
        dto.setFirstRowIndex(1);
        dto.setFirstCellIndex(1);
        dto.lastRowIndex(2);
        dto.lastCellIndex(2);
        dto.setAllowSplitting(true);

        Table response = testSlidesApi.mergeTableCells(fileName, c_slideIndex, c_shapeIndex, dto, password, folderName, null);

        assertEquals(response.getRows().get(0).getCells().get(0).getColSpan(), (Integer) 2);
        assertEquals(response.getRows().get(0).getCells().get(0).getRowSpan(), (Integer) 2);
    }

    @Test
    public void splitTableCellByWidth() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        int rowIndex =1;
        int cellIndex = 1;
        double cellWidth = 10.0;

        Table response = testSlidesApi.splitTableCell(fileName, c_slideIndex,
                c_shapeIndex, rowIndex, cellIndex, TableCellSplitType.SPLITBYWIDTH, cellWidth, password, folderName, null);

        assertEquals(response.getRows().get(0).getCells().size(),5);
    }

    @Test
    public void splitTableCellByHeight() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        int rowIndex =1;
        int cellIndex = 1;
        double cellHeight = 10.0;

        Table response = testSlidesApi.splitTableCell(fileName, c_slideIndex,
                c_shapeIndex, rowIndex, cellIndex, TableCellSplitType.SPLITBYHEIGHT, cellHeight, password, folderName, null);

        assertEquals(response.getRows().size(),5);
    }

    @Test
    public void splitTableCellByColSpan() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        int rowIndex = 3;
        int cellIndex = 1;
        double colSpan = 1;

        Table response = testSlidesApi.splitTableCell(fileName, c_slideIndex,
                c_shapeIndex, rowIndex, cellIndex, TableCellSplitType.SPLITBYCOLSPAN, colSpan, password, folderName, null);

        assertEquals(response.getRows().get(2).getCells().get(0).getColSpan(),null);
    }

    @Test
    public void splitTableCellByRowSpan() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        int rowIndex = 2;
        int cellIndex = 3;
        double rowSpan = 1;

        Table response = testSlidesApi.splitTableCell(fileName, c_slideIndex,
                c_shapeIndex, rowIndex, cellIndex, TableCellSplitType.SPLITBYROWSPAN, rowSpan, password, folderName, null);

        assertEquals(response.getRows().get(1).getCells().get(2).getRowSpan(),null);
    }

    @Test
    public void getTableCellParagraphs() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        int rowIndex = 1;
        int cellIndex = 1;

        Paragraphs response = testSlidesApi.getTableCellParagraphs(fileName, c_slideIndex,
                c_shapeIndex, rowIndex, cellIndex, password, folderName, null);

        assertEquals(response.getParagraphLinks().size(), 1);
    }

    @Test
    public void createTableCellParagraph() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        int rowIndex = 1;
        int cellIndex = 1;

        Portion portion0 = new Portion();
        portion0.setText("Portion 1");
        Portion portion1 = new Portion();
        portion1.setText("Portion 2");

        Paragraph dto = new Paragraph();
        dto.setPortionList(new ArrayList(Arrays.asList(portion0, portion1)));

        Paragraph response = testSlidesApi.createTableCellParagraph(fileName, c_slideIndex,
                c_shapeIndex, rowIndex, cellIndex, dto, password, folderName, null);

        assertEquals(response.getPortionList().size(), 2);
    }

    @Test
    public void updateTableCellParagraph() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        int rowIndex = 1;
        int cellIndex = 1;
        int paragraphIndex = 1;

        Portion portion0 = new Portion();
        portion0.setText("Portion 1");
        Portion portion1 = new Portion();
        portion1.setText("Portion 2");

        Paragraph dto = new Paragraph();
        dto.setPortionList(new ArrayList(Arrays.asList(portion0, portion1)));

        Paragraph response = testSlidesApi.updateTableCellParagraph(fileName, c_slideIndex,
                c_shapeIndex, rowIndex, cellIndex, paragraphIndex, dto, password, folderName, null);

        assertEquals(response.getPortionList().size(), 2);
    }

    @Test
    public void deleteTableCellParagraph() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        int rowIndex = 1;
        int cellIndex = 1;
        int paragraphIndex = 1;

        Paragraphs response = testSlidesApi.deleteTableCellParagraph(fileName, c_slideIndex,
                c_shapeIndex, rowIndex, cellIndex, paragraphIndex, password, folderName, null);

        assertEquals(response.getParagraphLinks().size(), 0);
    }

    @Test
    public void getTableCellPortions() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        int rowIndex = 1;
        int cellIndex = 1;
        int paragraphIndex = 1;

        Portions response = testSlidesApi.getTableCellPortions(fileName, c_slideIndex,
                c_shapeIndex, rowIndex, cellIndex, paragraphIndex, password, folderName, null);

        assertEquals(response.getItems().size(), 2);
    }

    @Test
    public void getTableCellPortion() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        int rowIndex = 1;
        int cellIndex = 1;
        int paragraphIndex = 1;
        int portionIndex = 1;

        Portion response = testSlidesApi.getTableCellPortion(fileName, c_slideIndex,
                c_shapeIndex, rowIndex, cellIndex, paragraphIndex, portionIndex, password, folderName, null);

        assertEquals(response.getText(), "Header");
    }

    @Test
    public void createTableCellPortion() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        int rowIndex = 1;
        int cellIndex = 1;
        int paragraphIndex = 1;
        Portion dto = new Portion();
        dto.setText("Portion 1");

        Portion response = testSlidesApi.createTableCellPortion(fileName, c_slideIndex,
                c_shapeIndex, rowIndex, cellIndex, paragraphIndex, dto, password, folderName, null);

        assertEquals(response.getText(), dto.getText());
    }

    @Test
    public void updateTableCellPortion() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        int rowIndex = 1;
        int cellIndex = 1;
        int paragraphIndex = 1;
        int portionIndex = 1;
        Portion dto = new Portion();
        dto.setText("Portion 1");

        Portion response = testSlidesApi.updateTableCellPortion(fileName, c_slideIndex,
                c_shapeIndex, rowIndex, cellIndex, paragraphIndex, portionIndex, dto, password, folderName, null);

        assertEquals(response.getText(), dto.getText());
    }

    @Test
    public void deleteTableCellPortion() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        int rowIndex = 1;
        int cellIndex = 1;
        int paragraphIndex = 1;
        int portionIndex = 1;

        Portions response = testSlidesApi.deleteTableCellPortion(fileName, c_slideIndex,
                c_shapeIndex, rowIndex, cellIndex, paragraphIndex, portionIndex, password, folderName, null);

        assertEquals(response.getItems().size(), 1);
    }

    private static final int c_slideIndex = 9;
    private static final int c_shapeIndex = 1;
}
