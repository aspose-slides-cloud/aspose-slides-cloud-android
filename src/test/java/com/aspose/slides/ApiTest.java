/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose">
 *   Copyright (c) 2018 Aspose.Slides for Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package com.aspose.slides;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import com.google.gson.reflect.TypeToken;
import com.aspose.slides.api.SlidesApi;
import com.aspose.slides.api.SlidesAsyncApi;

public class ApiTest {
    protected static SlidesApi testSlidesApi;
    protected static SlidesAsyncApi testSlidesAsyncApi;

    protected final String tempFolderName = "TempTests";
    protected final String testDataFolderName = "TestData";
    protected final String folderName = "TempSlidesSDK";
    protected final String fileName = "test.pptx";
    protected final String password = "password";

    protected ApiTest() {
        if (testSlidesApi == null)
        {
            testSlidesApi = new SlidesApi(readConfiguration());
        }
        if (testSlidesAsyncApi == null)
        {
            TestConfiguration config = readConfiguration();
            config.setBaseUrl(config.getAsyncBaseUrl());
            testSlidesAsyncApi = new SlidesAsyncApi(config);
        }
    }

    private TestConfiguration readConfiguration() {
        try {
            String configContents = new String(Files.readAllBytes(Paths.get("testConfig.json")), Charset.defaultCharset());
            return new JSON().deserialize(configContents, new TypeToken<TestConfiguration>(){}.getType());
        } catch (IOException ex) {
            return new TestConfiguration();
        }
    }
}
