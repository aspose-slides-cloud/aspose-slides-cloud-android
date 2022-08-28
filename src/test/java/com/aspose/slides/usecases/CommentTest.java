package com.aspose.slides.usecases;

import com.aspose.slides.ApiException;
import com.aspose.slides.ApiTest;
import com.aspose.slides.model.SlideComment;
import com.aspose.slides.model.SlideCommentBase;
import com.aspose.slides.model.SlideComments;
import com.aspose.slides.model.SlideModernComment;
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
        initialize(null, null, null, null);
        SlideComment dto = new SlideComment();
        dto.setText(c_commentText);
        dto.setAuthor(c_author);
        SlideComment childComment = new SlideComment();
        childComment.setText(c_childCommentText);
        childComment.setAuthor(c_author);
        dto.setChildComments(new ArrayList<SlideCommentBase>(Arrays.asList(childComment)));
        SlideComments response = (SlideComments)api.createComment(c_fileName, 3, dto, null, c_password, c_folderName, null);
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

        byte[] document = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName));
        File outputDocument = api.createCommentOnline(document, 3, dto, null, c_password);
        assertNotEquals(document.length, outputDocument.length());
    }

    @Test
    public void getSlideCommentsTest() throws ApiException, IOException{
        initialize(null, null, null, null);
        SlideComments response = (SlideComments) api.getSlideComments(c_fileName, c_slideIndex, c_password, c_folderName,null);
        assertEquals(2, response.getList().size());
        assertEquals(1, response.getList().get(0).getChildComments().size());
    }

    @Test
    public void deleteCommentsTest() throws ApiException, IOException{
        initialize(null, null, null, null);
        api.deleteComments(c_fileName, null, c_password, c_folderName, null);
        SlideComments response = (SlideComments) api.getSlideComments(c_fileName, c_slideIndex, c_password, c_folderName,null);
        assertEquals(0, response.getList().size());
    }

    @Test
    public void deleteCommentsOnlineTest() throws ApiException, IOException{
        byte[] document = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName));
        File outputDocument = api.deleteCommentsOnline(document, null, c_password);
        assertNotEquals(document.length, outputDocument.length());
    }

    @Test
    public void deleteSlidesCommentsTest() throws ApiException, IOException{
        initialize(null, null, null, null);
        api.deleteSlideComments(c_fileName, c_slideIndex, null, c_password, c_folderName, null);
        SlideComments response = (SlideComments) api.getSlideComments(c_fileName, c_slideIndex, c_password, c_folderName,null);
        assertEquals(0, response.getList().size());
    }

    @Test
    public void deleteSlidesCommentsOnlineTest() throws ApiException, IOException{
        byte[] document = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName));
        File outputDocument = api.deleteSlideCommentsOnline(document, c_slideIndex, null, c_password);
        assertNotEquals(document.length, outputDocument.length());
    }

    @Test
    public void createModernCommentTestTest() throws ApiException, IOException {
        initialize(null, null, null, null);
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
        SlideComments response = (SlideComments)api.createComment(c_fileName, 3, comment, null, c_password, c_folderName, null);
        assertEquals(1, response.getList().size());
        assertTrue(response.getList().get(0) instanceof SlideModernComment);
    }

    @Test
    public void createShapeModernCommentTest() throws ApiException, IOException {
        initialize(null, null, null, null);
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
        SlideComments response = (SlideComments)api.createComment(c_fileName, 3, comment, c_shapeIndex, c_password, c_folderName, null);
        assertEquals(1, response.getList().size());
        assertTrue(response.getList().get(0) instanceof SlideModernComment);
    }

    private static final String c_folderName = "TempSlidesSDK";
    private static final String c_fileName = "test.pptx";
    private static final String c_password = "password";
    private static final String c_author = "Test author";
    private static final String c_childCommentText = "Child comment text";
    private static final String c_commentText = "Comment text";
    private static final int c_slideIndex = 1;
    private static final int c_shapeIndex = 1;
}
