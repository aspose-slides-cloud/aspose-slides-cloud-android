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

import com.aspose.slides.api.SlidesApi;
import com.aspose.slides.testrules.FileAction;
import com.aspose.slides.testrules.FileRule;
import com.aspose.slides.testrules.ResultRule;
import com.aspose.slides.testrules.TestRule;
import com.aspose.slides.testrules.TestRules;
import com.aspose.slides.testrules.ValueRule;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.reflect.Type;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class ApiTest {
    private static boolean initialized;
    private Configuration configuration;
    private TestRules testRules;

    private final String expectedTestDataVersion = "1";
    private final String folderName = "TempSlidesSDK";

    protected final String tempFolderName = "TempTests";
    protected final String testDataFolderName = "TestData";

    protected static SlidesApi api;
    
    public String getFolderName() {
        return folderName;
    }
 
    private final String fileName = "test.pptx";

    public String getFileName() {
        return fileName;
    }
 
    private final String changedFileName = "changedtest.pptx";

    public String getChangedFileName() {
        return changedFileName;
    }
 
    private final String templateFileName = "TemplateCV.pptx";

    public String getTemplateFileName() {
        return templateFileName;
    }
    
    protected Configuration getConfiguration() {
        return configuration;
    }

    public String getFilePath() {
        return testDataFolderName + "/" + getFileName();
    }

    public String getFileUploadPath() {
        return getFolderName() + "/" + getFileName();
    }

    protected ApiTest() {
        if (api == null)
        {
            try {
                String configContents = new String(Files.readAllBytes(Paths.get("testConfig.json")), Charset.defaultCharset());
                configuration = new JSON().deserialize(configContents, new TypeToken<Configuration>(){}.getType());
            } catch (IOException ex) {
                configuration = new Configuration();
            }
            api = new SlidesApi(getConfiguration());
        }
        if (testRules == null)
        {
            try {
                String rulesContents = new String(Files.readAllBytes(Paths.get("testRules.json")), Charset.defaultCharset());
                testRules = new JSON().deserialize(rulesContents, new TypeToken<TestRules>(){}.getType());
            } catch (IOException ex) {
                testRules = new TestRules();
            }
        }
    }

    protected Object getTestValue(String type, String functionName, String name) {
        Object value = "testValue";
        StringBuilder outType = new StringBuilder();
        for (TestRule r : getRulesWithType(testRules.getValues(), functionName, name, type, outType)) {
            ValueRule vr = (ValueRule)r;
            if (vr.getIsValueSet()) {
                value = vr.getValue();
            }
        }
        return getTypedTestValue(type, outType, functionName, name, untemplatize(value, name, null));
    }

    protected Object invalidizeTestValue(String type, Object value, String functionName, String name) {
        Object invalidValue = null;
        StringBuilder outType = new StringBuilder();
        for (TestRule r : getRulesWithType(testRules.getValues(), functionName, name, type, outType)) {
            ValueRule vr = (ValueRule)r;
            if (vr.getIsInvalidValueSet()) {
                invalidValue = vr.getInvalidValue();
            }
        }
        return getTypedTestValue(type, outType, functionName, name, untemplatize(invalidValue, name, value));
    }

    protected void initialize(String functionName, String invalidParameterName, String invalidParameterType, Object invalidParameterValue) throws ApiException {
        if (!initialized) {
            initializeStorage();
            initialized = true;
        }
        Map<String, FileRule> files = new HashMap<String, FileRule>();
        for (TestRule r : getRules(testRules.getFiles(), functionName, invalidParameterName, invalidParameterType)) {
            FileRule fr = (FileRule)r;
            String actualName = (String)untemplatize(fr.getFile(), invalidParameterName, invalidParameterValue);
            String path = folderName;
            if (fr.getFolder() != null) {
                path = (String)untemplatize(fr.getFolder(), invalidParameterName, invalidParameterValue);
            }
            path = path + "/" + actualName;
            files.put(path, fr);
            fr.setActualName(actualName);
        }
        for (String path : files.keySet()) {
            FileRule rule = files.get(path);
            if (rule.getAction() == FileAction.Put) {
                api.copyFile(tempFolderName + "/" + rule.getActualName(), path, null, null, null);
            }
            else if (rule.getAction() == FileAction.Delete)
            {
                api.deleteFile(path, null, null);
                api.deleteFolder(path, null, null);
            }
        }
    }

    private void initializeStorage() throws ApiException {
        String versionPath = tempFolderName + "/version.txt";
        String version = null;
        try {
            version = new BufferedReader(new FileReader(api.downloadFile(tempFolderName + "/version.txt", null, null))).readLine();
        } catch (IOException ex) {
            throw new ApiException(ex.getMessage());
        }
        if (!version.equals(expectedTestDataVersion)) {
            File folder = new File(testDataFolderName);
            for (File f : folder.listFiles()) {
                if (f.isFile()) {
                    byte[] fileBytes = null;
                    try {
                        fileBytes = Files.readAllBytes(Paths.get(testDataFolderName + "/" + f.getName()));
                    } catch (IOException ex) {
                        throw new ApiException(ex.getMessage());
                    }
                    api.uploadFile(tempFolderName + "/" + f.getName(), fileBytes, null);
                }
            }
            api.uploadFile(versionPath, expectedTestDataVersion.getBytes(), null);
        }
    }

    protected void assertException(ApiException ex, String type, String name, String functionName, Object value) {
        Integer code = 0;
        String message = "Unexpeceted message";
        for (TestRule rule : getRules(testRules.getResults(), functionName, name, type)) {
            ResultRule rr = (ResultRule)rule;
            if (rr.getCode() != null) {
                code = rr.getCode();
            }
            if (rr.getMessage() != null) {
                message = rr.getMessage();
            }
        }
        if (ex.getCode() != 0) {
            assertThat(ex.getCode(), is(code));
            assertThat(ex.getMessage(), containsString((String)untemplatize(message, name, value)));
        }
    }

    protected void assertResponse(String type, String name, String functionName) {
        Boolean failed = true;
        for (TestRule rule : getRules(testRules.getOKToNotFail(), functionName, name, type)) {
            failed = false;
        }
        if (failed) {
            fail("Must have failed.");
        }
    }
    
    private List<TestRule> getRules(List<? extends TestRule> rules, String functionName, String fieldName, String fieldType) {
        return getRulesWithType(rules, functionName, fieldName, fieldType, new StringBuilder());
    }
    
    private List<TestRule> getRulesWithType(List<? extends TestRule> rules, String functionName, String fieldName, String fieldType, StringBuilder outType) {
        List<TestRule> filteredRules = new ArrayList<TestRule>();
        for (TestRule r: rules) {
            if (applies(r, functionName, fieldName, fieldType, outType)) {
                filteredRules.add(r);
            }
        }
        return filteredRules;
    }

    private Boolean applies(TestRule rule, String functionName, String fieldName, String type, StringBuilder outType) {
        return appliesValue(functionName, rule.getMethod())
            && (rule.getInvalid() == null || ((fieldName != null) == rule.getInvalid()))
            && appliesValue(fieldName, rule.getParameter())
            && appliesType(type, rule.getType(), outType)
            && (rule.getLanguage() == null || "java".equals(rule.getLanguage().toLowerCase()));
    }

    private Boolean appliesValue(String value, String ruleValue) {
        if (ruleValue == null) {
            return true;
        }
        if (value == null) {
            return false;
        }
        if (ruleValue.startsWith("/") && ruleValue.endsWith("/")) {
            Pattern p = Pattern.compile(ruleValue.substring(1, ruleValue.length() - 1), Pattern.CASE_INSENSITIVE);
            Matcher m = p.matcher(value);
            return m.find();
        }
        return ruleValue.equalsIgnoreCase(value);
    }

    private Boolean appliesType(String type, String ruleType, StringBuilder outType) {
        if (ruleType == null) {
            return true;
        }
        if (ruleType.equals("bool")) {
            return type.equals("Boolean");
        }
        if (ruleType.equals("number")) {
            return type.equals("Integer");
        }
        if (ruleType.equals("int")) {
            return type.equals("Integer");
        }
        if (ruleType.equals("int[]")) {
            return type.equals("List<Integer>");
        }
        if (ruleType.equals("stream")) {
            return type.equals("byte[]");
        }
        if (ruleType.equals("stream[]")) {
            return type.equals("List<FileInfo>");
        }
        if (ruleType.equals("model")) {
            try {
                Class<?> classInfo = Class.forName("com.aspose.slides.model." + type);
                if (classInfo.isEnum()) {
                    return false;
                }
                return true;
            } catch (Exception ex) {
                return false;
            }
        }
        try {
            Class<?> ruleClassInfo = Class.forName("com.aspose.slides.model." + ruleType);
            Class<?> classInfo = Class.forName("com.aspose.slides.model." + type);
            if (classInfo.isAssignableFrom(ruleClassInfo)) {
                outType.setLength(0);
                outType.append(ruleType);
                return true;
            }
            return false;
        } catch (Exception ex) {
            return false;
        }
    }

    private Object untemplatize(Object template, Object name, Object value) {
        if (template == null && value != null && value instanceof String) {
            return value;
        }
        if (template != null && template instanceof String) {
            return ((String)template)
                .replace("%n", name == null ? "" : name.toString())
                .replace("%v", value == null ? "" : value.toString());
        }
        return template;
    }
    
    public static Object searchEnum(Class<?> enumeration, String search) {
        for (Object each : enumeration.getEnumConstants()) {
            if (((Enum)each).name().compareToIgnoreCase(search) == 0) {
                return each;
            }
        }
        return null;
    }    

    public static Integer toInteger(Object value) {
        if (value != null) {
            return Integer.decode(value.toString());
        }
        return null;
    }
    
    private Object getTypedTestValue(String type, StringBuilder outType, String functionName, String name, Object value) {
        if (value == null) {
            return null;
        }
        if (outType.length() > 0) {
            type = outType.toString();
        }
        if ("Integer".equals(type)) {
            return Integer.decode(value.toString());
        }
        if ("Double".equals(type)) {
            return Double.parseDouble(value.toString());
        }
        if ("Boolean".equals(type)) {
            return "true".equals(value.toString().toLowerCase());
        }
        if ("List<Integer>".equals(type)) {
            List<Integer> values = new ArrayList<Integer>();
            for (int i = 0; i < ((JsonArray)value).size(); i++) {
                values.add(((JsonArray)value).get(i).getAsInt());
            }
            return values;
        }
        try {
            Class<?> classInfo = Class.forName("com.aspose.slides.model." + type);
            if (classInfo.isEnum()) {
                return searchEnum(classInfo, value.toString());
            }
            Type typeObject = new JSON().getObjectSubtype(classInfo, value.toString());
            return new Gson().fromJson((JsonObject)value, typeObject);
        } catch (Exception ex) {
            //Exception just means not a model class; ignore it
        }
        if (value.toString().startsWith("@")) {
            String fileValue = value.toString().substring(1);
            if (fileValue.startsWith("(") && fileValue.endsWith(")")) {
                List<FileInfo> files = new ArrayList<FileInfo>();
                for (String fileName : fileValue.substring(1, fileValue.length() - 1).split(",")) {
                    try {
                        FileInfo fileInfo = new FileInfo();
                        fileInfo.setData(Files.readAllBytes(Paths.get(testDataFolderName + "/" + fileName)));
                        fileInfo.setName(fileName);
                        files.add(fileInfo);
                    } catch (IOException ex) {
                        Logger.getLogger(ApiTest.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                return files;
            }
            try {
                String filePath = testDataFolderName + "/" + fileValue;
                return Files.readAllBytes(Paths.get(filePath));
            } catch (IOException ex) {
                Logger.getLogger(ApiTest.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }
        return value;
    }
}
