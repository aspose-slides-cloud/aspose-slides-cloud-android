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

package com.aspose.slides.usecases;

import com.aspose.slides.ApiException;
import org.junit.Test;

import com.aspose.slides.ApiTest;
import com.aspose.slides.Configuration;
import com.aspose.slides.JSON;
import com.aspose.slides.api.SlidesApi;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

/**
 * API tests for authentication
 */
public class AuthTest extends ApiTest {
    /**
     * Valid auth info.
     * @throws ApiException
     * @throws java.io.IOException
     */
    @Test
    public void goodAuthTest() throws ApiException, IOException {
        String configContents = new String(Files.readAllBytes(Paths.get("testConfig.json")), Charset.defaultCharset());
        Configuration config = new JSON().deserialize(configContents, new TypeToken<Configuration>(){}.getType());
        new SlidesApi(config).getApiInfo();
    }

    /**
     * Invalid auth info.
     * @throws ApiException
     * @throws java.io.IOException
     */
    @Test
    public void badAuthTest() throws ApiException, IOException {
        String configContents = new String(Files.readAllBytes(Paths.get("testConfig.json")), Charset.defaultCharset());
        Configuration config = new JSON().deserialize(configContents, new TypeToken<Configuration>(){}.getType());
        try {
            config.setAppKey("invalid");
            new SlidesApi(config).getApiInfo();
            fail("Must have failed.");
        } catch (ApiException ex) {
            assertThat(ex.getCode(), is(401));
        }
    }

    /**
     * Valid auth token.
     * @throws ApiException
     * @throws java.io.IOException
     */
    @Test
    public void goodTokenTest() throws ApiException, IOException {
        String configContents = new String(Files.readAllBytes(Paths.get("testConfig.json")), Charset.defaultCharset());
        Configuration config = new JSON().deserialize(configContents, new TypeToken<Configuration>(){}.getType());
        new SlidesApi(config).getApiInfo();
        config.setAppSid("invalid");
        new SlidesApi(config).getApiInfo();
    }

    /**
     * Invalid auth token.
     * @throws ApiException
     * @throws java.io.IOException
     */
    @Test
    public void badTokenTest() throws ApiException, IOException {
        String configContents = new String(Files.readAllBytes(Paths.get("testConfig.json")), Charset.defaultCharset());
        Configuration config = new JSON().deserialize(configContents, new TypeToken<Configuration>(){}.getType());
        new SlidesApi(config).getApiInfo();
        config.setAuthToken("invalid");
        new SlidesApi(config).getApiInfo();
    }

    /**
     * Expired auth token.
     * @throws ApiException
     * @throws java.io.IOException
     */
    @Test
    public void expiredTokenTest() throws ApiException, IOException {
        String configContents = new String(Files.readAllBytes(Paths.get("testConfig.json")), Charset.defaultCharset());
        Configuration config = new JSON().deserialize(configContents, new TypeToken<Configuration>(){}.getType());
        new SlidesApi(config).getApiInfo();
        config.setAuthToken("eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYmYiOjE2ODYzMzI5ODAsImV4cCI6MTY4NjQxOTM4MCwiaXNzIjoiaHR0cHM6Ly9hcGkuYXNwb3NlLmNsb3VkIiwiYXVkIjpbImh0dHBzOi8vYXBpLmFzcG9zZS5jbG91ZC9yZXNvdXJjZXMiLCJhcGkuYmlsbGluZyIsImFwaS5pZGVudGl0eSIsImFwaS5wcm9kdWN0cyIsImFwaS5zdG9yYWdlIl0sImNsaWVudF9pZCI6ImVhMTFkNzAwLWE3YjAtNDgwMi05YjFjLWRmYWVhNGI2OTA0YSIsImNsaWVudF9kZWZhdWx0X3N0b3JhZ2UiOiIyNDc5NjRmYy04MjIyLTQ4M2EtYmZmMS1kNTYxYzM5MjQ3ZWIiLCJjbGllbnRfaWRlbnRpdHlfdXNlcl9pZCI6Ijc2MjY4MiIsInNjb3BlIjpbImFwaS5iaWxsaW5nIiwiYXBpLmlkZW50aXR5IiwiYXBpLnByb2R1Y3RzIiwiYXBpLnN0b3JhZ2UiXX0.qGRwbpVQNJ7k09FF81bfknBd_9bERkProMukobxkAEzwIhIRSwCDvzgVhhUcA-OMr8s-49XLYtFb6ZtuDT2r3xDsYXWxwjYekFk4MZhEFKeIqLyI9-kSxanL7w4WoKkE_OAXHquChRJcsqz5vhKOOJ9swu4PS0TSRYHfkLFsLpZLXIV4X53Ear8vDosOfeZONq9QPCfikCi1ruSMa3OddD2WE17_V3FzzyuC7d3FQxRznFJhyWoKI2jvOw7a92KatWVt3I78fOl9M-3MkkHR1ip5CXp3arnn139i73D-TfXeRNcAU5UpAGfuYPbIDpTkJ-DirqYWO6I5S7JmchPl1A");
        new SlidesApi(config).getApiInfo();
    }
}
