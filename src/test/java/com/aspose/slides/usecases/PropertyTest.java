// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="PropertyTest.java">
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
import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Assert;
import org.junit.Test;

/**
 * API tests for property methods
 */
public class PropertyTest extends ApiTest {
    @Test
    public void documentPropertiesBuiltinTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        DocumentProperty documentProperty = testSlidesApi.getDocumentProperty(fileName, c_builtinPropertyName, password, folderName, null);
        assertEquals(c_builtinPropertyName, documentProperty.getName());
        assertTrue(documentProperty.isBuiltIn());
        DocumentProperty property = new DocumentProperty();
        property.setValue(c_updatedPropertyValue);
        DocumentProperty updatedProperty = testSlidesApi.setDocumentProperty(
            fileName, c_builtinPropertyName, property, password, folderName, null);
        assertTrue(updatedProperty.isBuiltIn());
        assertEquals(c_updatedPropertyValue, updatedProperty.getValue());
        testSlidesApi.deleteDocumentProperty(fileName, c_builtinPropertyName, password, folderName, null);
        //built-in property is not actually deleted
        documentProperty = testSlidesApi.getDocumentProperty(fileName, c_builtinPropertyName, password, folderName, null);
        assertEquals(c_builtinPropertyName, documentProperty.getName());
        assertTrue(documentProperty.isBuiltIn());
        assertNotEquals(c_updatedPropertyValue, documentProperty.getValue());
    }

    @Test
    public void documentPropertiesCustomTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        DocumentProperty property = new DocumentProperty();
        property.setValue(c_updatedPropertyValue);
        DocumentProperty updatedProperty = testSlidesApi.setDocumentProperty(fileName, c_customPropertyName, property, password, folderName, null);
        assertFalse(updatedProperty.isBuiltIn());
        assertEquals(c_updatedPropertyValue, updatedProperty.getValue());
        testSlidesApi.deleteDocumentProperty(fileName, c_customPropertyName, password, folderName, null);
        try {
            testSlidesApi.getDocumentProperty(fileName, c_customPropertyName, password, folderName, null);
        } catch (Exception ex) {
            assertTrue(ex instanceof ApiException);
        }
    }

    @Test
    public void documentPropertiesBulkUpdateTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        int count = testSlidesApi.getDocumentProperties(fileName, password, folderName, null).getList().size();
        DocumentProperties properties = new DocumentProperties();
        List<DocumentProperty> list = new ArrayList<DocumentProperty>();
        DocumentProperty property1 = new DocumentProperty();
        property1.setName(c_builtinPropertyName);
        property1.setValue(c_updatedPropertyValue);
        list.add(property1);
        DocumentProperty property2 = new DocumentProperty();
        property2.setName(c_customPropertyName);
        property2.setValue(c_updatedPropertyValue);
        list.add(property2);
        properties.setList(list);
        assertEquals(count + 1, testSlidesApi.setDocumentProperties(fileName, properties, password, folderName, null).getList().size());
        //One custom property was contained in the original presentation; it also must be deleted
        assertEquals(count - 1, testSlidesApi.deleteDocumentProperties(fileName, password, folderName, null).getList().size());
    }

    @Test
    public void slidePropertiesTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        SlideProperties slideProperties = testSlidesApi.getSlideProperties(fileName, password, folderName, null);
        SlideProperties dto = new SlideProperties();
        dto.setFirstSlideNumber(slideProperties.getFirstSlideNumber() + 2);
        SlideProperties updatedProperties = testSlidesApi.setSlideProperties(fileName, dto, password, folderName, null);
        assertNotEquals(slideProperties.getFirstSlideNumber(), updatedProperties.getFirstSlideNumber());
        assertEquals(slideProperties.getOrientation(), updatedProperties.getOrientation());
    }

    @Test
    public void slideSizePresetTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        SlideProperties dto = new SlideProperties();
        dto.setSizeType(SlideProperties.SizeTypeEnum.B4ISOPAPER);
        SlideProperties updatedProperties = testSlidesApi.setSlideProperties(fileName, dto, password, folderName, null);
        assertEquals(SlideProperties.SizeTypeEnum.B4ISOPAPER, updatedProperties.getSizeType());
        assertEquals(852.0, (double)updatedProperties.getWidth(), 1);
        assertEquals(639.0, (double)updatedProperties.getHeight(), 1);
    }

    @Test
    public void slideSizeCustomTest() throws ApiException, IOException {
        int width = 800;
        int height = 500;
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        SlideProperties dto = new SlideProperties();
        dto.setWidth(width);
        dto.setHeight(height);
        SlideProperties updatedProperties = testSlidesApi.setSlideProperties(fileName, dto, password, folderName, null);
        assertEquals(SlideProperties.SizeTypeEnum.CUSTOM, updatedProperties.getSizeType());
        assertEquals(width, (double)updatedProperties.getWidth(), 1);
        assertEquals(height, (double)updatedProperties.getHeight(), 1);
    }

    @Test
    public void protectionTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        ProtectionProperties protectionProperties = testSlidesApi.getProtectionProperties(fileName, password, folderName, null);
        ProtectionProperties dto = new ProtectionProperties();
        dto.setReadOnlyRecommended(!protectionProperties.isReadOnlyRecommended());
        ProtectionProperties updatedProperties = testSlidesApi.setProtection(fileName, dto, password, folderName, null);
        assertNotEquals(protectionProperties.isReadOnlyRecommended(), updatedProperties.isReadOnlyRecommended());
        assertEquals(protectionProperties.isEncryptDocumentProperties(), updatedProperties.isEncryptDocumentProperties());
    }

    @Test
    public void protectionDeleteTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        ProtectionProperties protectionProperties = testSlidesApi.deleteProtection(fileName, password, folderName, null);
        assertFalse(protectionProperties.isReadOnlyRecommended());
        assertFalse(protectionProperties.getIsEncrypted());
        assertNull(protectionProperties.getReadPassword());
    }

    @Test
    public void protectOnlineTest() throws ApiException, IOException {
        byte[] document = Files.readAllBytes(Paths.get(testDataFolderName + "/" + fileName));
        ProtectionProperties dto = new ProtectionProperties();
        dto.setReadPassword("newPassword");
        File outputDocument = testSlidesApi.setProtectionOnline(document, dto, password);
        assertTrue(outputDocument.length() > 0);
    }

    @Test
    public void unprotectOnlineTest() throws ApiException, IOException {
        byte[] document = Files.readAllBytes(Paths.get(testDataFolderName + "/" + fileName));
        File outputDocument = testSlidesApi.deleteProtectionOnline(document, password);
        assertNotEquals(document.length, outputDocument.length());
    }

    @Test
    public void getViewPropertiesTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        ViewProperties response = testSlidesApi.getViewProperties(fileName, password, folderName, null);
        assertEquals(ViewProperties.ShowCommentsEnum.TRUE, response.getShowComments());
    }

    @Test
    public void setViewPropertiesTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        ViewProperties dto = new ViewProperties();
        dto.showComments(ViewProperties.ShowCommentsEnum.FALSE);
        CommonSlideViewProperties commonProperties = new CommonSlideViewProperties();
        commonProperties.setScale(50);
        dto.setSlideViewProperties(commonProperties);

        ViewProperties response = testSlidesApi.setViewProperties(fileName, dto, password, folderName, null);
        assertEquals(ViewProperties.ShowCommentsEnum.FALSE, response.getShowComments());
        assertEquals(dto.getSlideViewProperties().getScale(), response.getSlideViewProperties().getScale());
    }

    @Test
    public void protectionCheckTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        ProtectionProperties protectionProperties = testSlidesApi.getProtectionProperties(fileName, null, folderName, null);
        Assert.assertTrue(protectionProperties.getIsEncrypted());
        Assert.assertNull(protectionProperties.getReadPassword());

        protectionProperties = testSlidesApi.getProtectionProperties(fileName, password, folderName, null);
        Assert.assertTrue(protectionProperties.getIsEncrypted());
        Assert.assertNotNull(protectionProperties.getReadPassword());
    }

    @Test
    public void getSlideShowPropertiesTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        SlideShowProperties response = testSlidesApi.getSlideShowProperties(fileName, password, folderName, null);
        assertTrue(response.isShowAnimation());
        assertTrue(response.isShowNarration());
    }

    @Test
    public void setSlideShowPropertiesTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        SlideShowProperties dto = new SlideShowProperties();
        dto.setLoop(true);
        dto.setUseTimings(true);
        dto.slideShowType(SlideShowProperties.SlideShowTypeEnum.PRESENTEDBYSPEAKER);

        SlideShowProperties response = testSlidesApi.setSlideShowProperties(fileName, dto, password, folderName, null);
        assertEquals(dto.isLoop(), response.isLoop());
        assertEquals(dto.isUseTimings(), response.isUseTimings());
        assertEquals(dto.getSlideShowType(), response.getSlideShowType());
    }

    private final String c_builtinPropertyName = "Author";
    private final String c_customPropertyName = "CustomProperty2";
    private final String c_updatedPropertyValue = "New Value";
}
