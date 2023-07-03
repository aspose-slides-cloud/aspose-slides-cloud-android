// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="ChartTests.cs">
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
import org.junit.Test;
import com.aspose.slides.ApiTest;
import com.aspose.slides.model.*;
import java.util.ArrayList;
import java.util.List;

public class VbaTest extends ApiTest {
    @Test
    public void createVbaModuleTest() throws ApiException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        VbaModule dto = new VbaModule();
        dto.setName("Module1");
        dto.setSourceCode("Sub Test() MsgBox \"Test\" End Sub");
        VbaReference reference0 = new VbaReference();
        reference0.setName("stdole");
        reference0.setLibId("*\\G{00020430-0000-0000-C000-000000000046}#2.0#0#C:\\Windows\\system32\\stdole2.tlb#OLE Automation");
        VbaReference reference1 = new VbaReference();
        reference1.setName("Office");
        reference1.setLibId("*\\G{2DF8D04C-5BFA-101B-BDE5-00AA0044DE52}#2.0#0#C:\\Program Files\\Common Files\\Microsoft Shared\\OFFICE14\\MSO.DLL#Microsoft Office 14.0 Object Library");
        List<VbaReference> references = new ArrayList<VbaReference>();
        references.add(reference0);
        references.add(reference1);
        dto.setReferences(references);
        VbaModule response = (VbaModule)api.createVbaModule(fileName, dto, password, folderName, null);
        String s = String.format("\"%s\" has been created \n%s", response.getName(), response.getSelfUri().getHref());
        System.out.println(s);
    }

    @Test
    public void deleteVbaModuleTest() throws ApiException {
        int moduleIndex = 1;
        String macrosFileName = "macros.pptm";

        api.copyFile(tempFolderName + "/" + macrosFileName, folderName + "/" + macrosFileName, null, null, null);
        VbaProject response = (VbaProject)api.deleteVbaModule(macrosFileName, moduleIndex, null, folderName, null);
        System.out.println("VBA project contains: " + response.getModules().size() + " module(s), and " + response.getReferences().size() + " references");
    }

    @Test
    public void getVbaModuleTest() throws ApiException {
        int moduleIndex = 1;
        String macrosFileName = "macros.pptm";

        api.copyFile(tempFolderName + "/" + macrosFileName, folderName + "/" + macrosFileName, null, null, null);
        VbaModule response = (VbaModule) api.getVbaModule(macrosFileName, moduleIndex, null, folderName, null);
        String s = String.format("Module: \"%s\"\n%s", response.getName(), response.getSourceCode());
        System.out.println(s);
    }

    @Test
    public void getVbaProjectTest() throws ApiException {
        String macrosFileName = "macros.pptm";
        api.copyFile(tempFolderName + "/" + macrosFileName, folderName + "/" + macrosFileName, null, null, null);
        VbaProject response = (VbaProject)api.getVbaProject(macrosFileName, null, folderName, null);
        System.out.println("VBA project contains: " + response.getModules().size() + " module(s), and " + response.getReferences().size() + " references");
    }

    @Test
    public void updateVbaModuleTest() throws ApiException {
        String macrosFileName = "macros.pptm";
        api.copyFile(tempFolderName + "/" + macrosFileName, folderName + "/" + macrosFileName, null, null, null);

        VbaModule dto = new VbaModule();
        dto.setSourceCode("Sub Test() MsgBox \"Test\" End Sub");

        int moduleIndex = 1;
        VbaModule response = (VbaModule)api.updateVbaModule(macrosFileName, moduleIndex, dto, password, folderName, null);
        String s = String.format("\"%s\" has been updated \n%s", response.getName(), response.getSelfUri().getHref());
        System.out.println(s);
    }
}
