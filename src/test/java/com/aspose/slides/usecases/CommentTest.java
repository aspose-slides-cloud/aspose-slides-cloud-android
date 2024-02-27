package com.aspose.slides.usecases;

import com.aspose.slides.ApiException;
import com.aspose.slides.ApiTest;
import com.aspose.slides.model.SlideComment;
import com.aspose.slides.model.SlideCommentBase;
import com.aspose.slides.model.SlideComments;
import com.aspose.slides.model.SlideModernComment;
import com.aspose.slides.model.CommentAuthors;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * API tests for comment methods
 */
public class CommentTest extends ApiTest {
    @Test
    public void createCommentTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        SlideComment dto = new SlideComment();
        dto.setText(c_commentText);
        dto.setAuthor(c_author);
        SlideComment childComment = new SlideComment();
        childComment.setText(c_childCommentText);
        childComment.setAuthor(c_author);
        dto.setChildComments(new ArrayList<SlideCommentBase>(Arrays.asList(childComment)));
        SlideComments response = (SlideComments)testSlidesApi.createComment(fileName, 3, dto, null, password, folderName, null);
        assertEquals(1, response.getList().size());
        assertEquals(c_commentText, response.getList().get(0).getText());
        assertEquals(c_author, response.getList().get(0).getAuthor());
        assertEquals(c_childCommentText, response.getList().get(0).getChildComments().get(0).getText());
        assertEquals(c_author, response.getList().get(0).getChildComments().get(0).getAuthor());
    }

    @Test
    public void createCommentOnlineTest() throws ApiException, IOException{
        SlideComment dto = new SlideComment();
        dto.setText(c_commentText);
        dto.setAuthor(c_author);
        SlideComment childComment = new SlideComment();
        childComment.setText(c_childCommentText);
        childComment.setAuthor(c_author);
        dto.setChildComments(new ArrayList<SlideCommentBase>(Arrays.asList(childComment)));

        byte[] document = Files.readAllBytes(Paths.get(testDataFolderName + "/" + fileName));
        File outputDocument = testSlidesApi.createCommentOnline(document, 3, dto, null, password);
        assertNotEquals(document.length, outputDocument.length());
    }

    @Test
    public void getSlideCommentsTest() throws ApiException, IOException{
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        SlideComments response = (SlideComments) testSlidesApi.getSlideComments(fileName, c_slideIndex, password, folderName, null);
        assertEquals(2, response.getList().size());
        assertEquals(1, response.getList().get(0).getChildComments().size());
    }

    @Test
    public void deleteCommentsTest() throws ApiException, IOException{
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        testSlidesApi.deleteComments(fileName, null, password, folderName, null);
        SlideComments response = (SlideComments) testSlidesApi.getSlideComments(fileName, c_slideIndex, password, folderName, null);
        assertEquals(0, response.getList().size());
    }

    @Test
    public void deleteCommentsOnlineTest() throws ApiException, IOException{
        byte[] document = Files.readAllBytes(Paths.get(testDataFolderName + "/" + fileName));
        File outputDocument = testSlidesApi.deleteCommentsOnline(document, null, password);
        assertNotEquals(document.length, outputDocument.length());
    }

    @Test
    public void deleteSlidesCommentsTest() throws ApiException, IOException{
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        testSlidesApi.deleteSlideComments(fileName, c_slideIndex, null, password, folderName, null);
        SlideComments response = (SlideComments) testSlidesApi.getSlideComments(fileName, c_slideIndex, password, folderName, null);
        assertEquals(0, response.getList().size());
    }

    @Test
    public void deleteSlidesCommentsOnlineTest() throws ApiException, IOException{
        byte[] document = Files.readAllBytes(Paths.get(testDataFolderName + "/" + fileName));
        File outputDocument = testSlidesApi.deleteSlideCommentsOnline(document, c_slideIndex, null, password);
        assertNotEquals(document.length, outputDocument.length());
    }

    @Test
    public void createModernCommentTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        int textSelectionStartIndex = 1;
        int textSelectionLength = 5;

        SlideModernComment childComment = new SlideModernComment();
        childComment.setAuthor(c_author);
        childComment.setText(c_childCommentText);
        childComment.setStatus(SlideModernComment.StatusEnum.RESOLVED);
        SlideModernComment comment = new SlideModernComment();
        comment.setAuthor(c_author);
        comment.setText(c_commentText);
        comment.setStatus(SlideModernComment.StatusEnum.ACTIVE);
        comment.setTextSelectionStart(textSelectionStartIndex);
        comment.setTextSelectionLength(textSelectionLength);
        comment.setChildComments(new ArrayList<SlideCommentBase>(Arrays.asList(childComment)));
        SlideComments response = (SlideComments)testSlidesApi.createComment(fileName, 3, comment, null, password, folderName, null);
        assertEquals(1, response.getList().size());
        assertTrue(response.getList().get(0) instanceof SlideModernComment);
    }

    @Test
    public void createModernCommentShapeTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        int textSelectionStartIndex = 1;
        int textSelectionLength = 5;

        SlideModernComment childComment = new SlideModernComment();
        childComment.setAuthor(c_author);
        childComment.setText(c_childCommentText);
        childComment.setStatus(SlideModernComment.StatusEnum.RESOLVED);
        SlideModernComment comment = new SlideModernComment();
        comment.setAuthor(c_author);
        comment.setText(c_commentText);
        comment.setStatus(SlideModernComment.StatusEnum.ACTIVE);
        comment.setTextSelectionStart(textSelectionStartIndex);
        comment.setTextSelectionLength(textSelectionLength);
        comment.setChildComments(new ArrayList<SlideCommentBase>(Arrays.asList(childComment)));
        SlideComments response = (SlideComments)testSlidesApi.createComment(fileName, 3, comment, c_shapeIndex, password, folderName, null);
        assertEquals(1, response.getList().size());
        assertTrue(response.getList().get(0) instanceof SlideModernComment);
    }

    @Test
    public void getCommentAuthorsTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        CommentAuthors response = testSlidesApi.getCommentAuthors(fileName, password, folderName, null);
        assertEquals(1, response.getList().size());
    }

    private static final String c_author = "Test author";
    private static final String c_childCommentText = "Child comment text";
    private static final String c_commentText = "Comment text";
    private static final int c_slideIndex = 1;
    private static final int c_shapeIndex = 1;
}
