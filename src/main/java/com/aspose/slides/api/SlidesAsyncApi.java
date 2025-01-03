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

package com.aspose.slides.api;

import com.aspose.slides.ApiCallback;
import com.aspose.slides.ApiClient;
import com.aspose.slides.ApiException;
import com.aspose.slides.ApiResponse;
import com.aspose.slides.Configuration;
import com.aspose.slides.FileInfo;
import com.aspose.slides.Pair;
import com.aspose.slides.ProgressRequestBody;
import com.aspose.slides.ProgressResponseBody;
import com.aspose.slides.auth.NeedRepeatRequestException;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.aspose.slides.model.ExportOptions;
import java.io.File;
import com.aspose.slides.model.FilesUploadResult;
import com.aspose.slides.model.Operation;
import com.aspose.slides.model.OrderedMergeRequest;
import com.aspose.slides.model.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SlidesAsyncApi {
    public SlidesAsyncApi(Configuration configuration) {
        apiClient = new ApiClient(configuration);
    }

    public SlidesAsyncApi(String appSid, String appKey) {
        this(new Configuration(appSid, appKey));
    }

    /**
     * Build call for download
     * @param path  
     * @param storageName  
     * @param versionId  
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call downloadCall(String path, String storageName, String versionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object postBody = null;

        // create path and map variables
        String methodPath = "/slides/async/storage/file/{path}"
            .replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(path));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "storageName", storageName);
        apiClient.addQueryParameter(queryParams, "versionId", versionId);

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new LinkedHashMap<String, Object>();

        final String[] accepts = {
            "multipart/form-data"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(methodPath, "GET", queryParams, postBody, headerParams, formParams, progressRequestListener);
    }

    /**
     * 
     * 
     * @param path  
     * @param storageName  
     * @param versionId  
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File download(String path, String storageName, String versionId) throws ApiException {
        try {
            ApiResponse<File> resp = downloadWithHttpInfo(path, storageName, versionId);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<File> resp = downloadWithHttpInfo(path, storageName, versionId);
            return resp.getData();
        }
    }

    /**
     * 
     * 
     * @param path  
     * @param storageName  
     * @param versionId  
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> downloadWithHttpInfo(String path, String storageName, String versionId) throws ApiException {
        com.squareup.okhttp.Call call = downloadCall(path, storageName, versionId, null, null);
        Type returnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param path  
     * @param storageName  
     * @param versionId  
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call downloadAsync(String path, String storageName, String versionId, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = downloadCall(path, storageName, versionId, progressListener, progressRequestListener);
        Type returnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getOperationResult
     * @param id  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOperationResultCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getOperationResult(Async)");
        }
        Object postBody = null;

        // create path and map variables
        String methodPath = "/slides/async/{id}/result"
            .replaceAll("\\{" + "id" + "\\}", apiClient.objectToString(id));

        List<Pair> queryParams = new ArrayList<Pair>();

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new LinkedHashMap<String, Object>();

        final String[] accepts = {
            "multipart/form-data"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(methodPath, "GET", queryParams, postBody, headerParams, formParams, progressRequestListener);
    }

    /**
     * 
     * 
     * @param id  (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getOperationResult(String id) throws ApiException {
        try {
            ApiResponse<File> resp = getOperationResultWithHttpInfo(id);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<File> resp = getOperationResultWithHttpInfo(id);
            return resp.getData();
        }
    }

    /**
     * 
     * 
     * @param id  (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getOperationResultWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getOperationResultCall(id, null, null);
        Type returnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param id  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOperationResultAsync(String id, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getOperationResultCall(id, progressListener, progressRequestListener);
        Type returnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getOperationStatus
     * @param id  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOperationStatusCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getOperationStatus(Async)");
        }
        Object postBody = null;

        // create path and map variables
        String methodPath = "/slides/async/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.objectToString(id));

        List<Pair> queryParams = new ArrayList<Pair>();

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new LinkedHashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(methodPath, "GET", queryParams, postBody, headerParams, formParams, progressRequestListener);
    }

    /**
     * 
     * 
     * @param id  (required)
     * @return Operation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Operation getOperationStatus(String id) throws ApiException {
        try {
            ApiResponse<Operation> resp = getOperationStatusWithHttpInfo(id);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Operation> resp = getOperationStatusWithHttpInfo(id);
            return resp.getData();
        }
    }

    /**
     * 
     * 
     * @param id  (required)
     * @return ApiResponse&lt;Operation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Operation> getOperationStatusWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getOperationStatusCall(id, null, null);
        Type returnType = new TypeToken<Operation>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param id  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOperationStatusAsync(String id, final ApiCallback<Operation> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getOperationStatusCall(id, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Operation>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for startConvert
     * @param document Document data. (required)
     * @param format  (required)
     * @param password  
     * @param storage  
     * @param fontsFolder  
     * @param slides  
     * @param options  
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call startConvertCall(byte[] document, ExportFormat format, String password, String storage, String fontsFolder, List<Integer> slides, ExportOptions options, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'document' is set
        if (document == null) {
            throw new ApiException("Missing the required parameter 'document' when calling startConvert(Async)");
        }
        // verify the required parameter 'format' is set
        if (format == null) {
            throw new ApiException("Missing the required parameter 'format' when calling startConvert(Async)");
        }
        Object postBody = options;

        // create path and map variables
        String methodPath = "/slides/async/convert/{format}"
            .replaceAll("\\{" + "format" + "\\}", apiClient.objectToString(format));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "storage", storage);
        apiClient.addQueryParameter(queryParams, "fontsFolder", fontsFolder);
        apiClient.addQueryParameter(queryParams, "slides", slides);

        Map<String, String> headerParams = new HashMap<String, String>();
        if (password != null)
        headerParams.put("password", apiClient.parameterToString(password));

        Map<String, Object> formParams = new LinkedHashMap<String, Object>();
        if (document != null)
        formParams.put("document", document);

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "multipart/form-data"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(methodPath, "POST", queryParams, postBody, headerParams, formParams, progressRequestListener);
    }

    /**
     * 
     * 
     * @param document Document data. (required)
     * @param format  (required)
     * @param password  
     * @param storage  
     * @param fontsFolder  
     * @param slides  
     * @param options  
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String startConvert(byte[] document, ExportFormat format, String password, String storage, String fontsFolder, List<Integer> slides, ExportOptions options) throws ApiException {
        try {
            ApiResponse<String> resp = startConvertWithHttpInfo(document, format, password, storage, fontsFolder, slides, options);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<String> resp = startConvertWithHttpInfo(document, format, password, storage, fontsFolder, slides, options);
            return resp.getData();
        }
    }

    /**
     * 
     * 
     * @param document Document data. (required)
     * @param format  (required)
     * @param password  
     * @param storage  
     * @param fontsFolder  
     * @param slides  
     * @param options  
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> startConvertWithHttpInfo(byte[] document, ExportFormat format, String password, String storage, String fontsFolder, List<Integer> slides, ExportOptions options) throws ApiException {
        com.squareup.okhttp.Call call = startConvertCall(document, format, password, storage, fontsFolder, slides, options, null, null);
        Type returnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param document Document data. (required)
     * @param format  (required)
     * @param password  
     * @param storage  
     * @param fontsFolder  
     * @param slides  
     * @param options  
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call startConvertAsync(byte[] document, ExportFormat format, String password, String storage, String fontsFolder, List<Integer> slides, ExportOptions options, final ApiCallback<String> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = startConvertCall(document, format, password, storage, fontsFolder, slides, options, progressListener, progressRequestListener);
        Type returnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for startConvertAndSave
     * @param document Document data. (required)
     * @param format  (required)
     * @param outPath  (required)
     * @param password  
     * @param storage  
     * @param fontsFolder  
     * @param slides  
     * @param options  
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call startConvertAndSaveCall(byte[] document, ExportFormat format, String outPath, String password, String storage, String fontsFolder, List<Integer> slides, ExportOptions options, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'document' is set
        if (document == null) {
            throw new ApiException("Missing the required parameter 'document' when calling startConvertAndSave(Async)");
        }
        // verify the required parameter 'format' is set
        if (format == null) {
            throw new ApiException("Missing the required parameter 'format' when calling startConvertAndSave(Async)");
        }
        // verify the required parameter 'outPath' is set
        if (outPath == null) {
            throw new ApiException("Missing the required parameter 'outPath' when calling startConvertAndSave(Async)");
        }
        Object postBody = options;

        // create path and map variables
        String methodPath = "/slides/async/convert/{format}"
            .replaceAll("\\{" + "format" + "\\}", apiClient.objectToString(format));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "outPath", outPath);
        apiClient.addQueryParameter(queryParams, "storage", storage);
        apiClient.addQueryParameter(queryParams, "fontsFolder", fontsFolder);
        apiClient.addQueryParameter(queryParams, "slides", slides);

        Map<String, String> headerParams = new HashMap<String, String>();
        if (password != null)
        headerParams.put("password", apiClient.parameterToString(password));

        Map<String, Object> formParams = new LinkedHashMap<String, Object>();
        if (document != null)
        formParams.put("document", document);

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "multipart/form-data"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(methodPath, "PUT", queryParams, postBody, headerParams, formParams, progressRequestListener);
    }

    /**
     * 
     * 
     * @param document Document data. (required)
     * @param format  (required)
     * @param outPath  (required)
     * @param password  
     * @param storage  
     * @param fontsFolder  
     * @param slides  
     * @param options  
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String startConvertAndSave(byte[] document, ExportFormat format, String outPath, String password, String storage, String fontsFolder, List<Integer> slides, ExportOptions options) throws ApiException {
        try {
            ApiResponse<String> resp = startConvertAndSaveWithHttpInfo(document, format, outPath, password, storage, fontsFolder, slides, options);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<String> resp = startConvertAndSaveWithHttpInfo(document, format, outPath, password, storage, fontsFolder, slides, options);
            return resp.getData();
        }
    }

    /**
     * 
     * 
     * @param document Document data. (required)
     * @param format  (required)
     * @param outPath  (required)
     * @param password  
     * @param storage  
     * @param fontsFolder  
     * @param slides  
     * @param options  
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> startConvertAndSaveWithHttpInfo(byte[] document, ExportFormat format, String outPath, String password, String storage, String fontsFolder, List<Integer> slides, ExportOptions options) throws ApiException {
        com.squareup.okhttp.Call call = startConvertAndSaveCall(document, format, outPath, password, storage, fontsFolder, slides, options, null, null);
        Type returnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param document Document data. (required)
     * @param format  (required)
     * @param outPath  (required)
     * @param password  
     * @param storage  
     * @param fontsFolder  
     * @param slides  
     * @param options  
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call startConvertAndSaveAsync(byte[] document, ExportFormat format, String outPath, String password, String storage, String fontsFolder, List<Integer> slides, ExportOptions options, final ApiCallback<String> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = startConvertAndSaveCall(document, format, outPath, password, storage, fontsFolder, slides, options, progressListener, progressRequestListener);
        Type returnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for startDownloadPresentation
     * @param name  (required)
     * @param format  (required)
     * @param options  
     * @param password  
     * @param folder  
     * @param storage  
     * @param fontsFolder  
     * @param slides  
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call startDownloadPresentationCall(String name, ExportFormat format, ExportOptions options, String password, String folder, String storage, String fontsFolder, List<Integer> slides, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling startDownloadPresentation(Async)");
        }
        // verify the required parameter 'format' is set
        if (format == null) {
            throw new ApiException("Missing the required parameter 'format' when calling startDownloadPresentation(Async)");
        }
        Object postBody = options;

        // create path and map variables
        String methodPath = "/slides/async/{name}/{format}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(name)).replaceAll("\\{" + "format" + "\\}", apiClient.objectToString(format));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "folder", folder);
        apiClient.addQueryParameter(queryParams, "storage", storage);
        apiClient.addQueryParameter(queryParams, "fontsFolder", fontsFolder);
        apiClient.addQueryParameter(queryParams, "slides", slides);

        Map<String, String> headerParams = new HashMap<String, String>();
        if (password != null)
        headerParams.put("password", apiClient.parameterToString(password));

        Map<String, Object> formParams = new LinkedHashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(methodPath, "POST", queryParams, postBody, headerParams, formParams, progressRequestListener);
    }

    /**
     * 
     * 
     * @param name  (required)
     * @param format  (required)
     * @param options  
     * @param password  
     * @param folder  
     * @param storage  
     * @param fontsFolder  
     * @param slides  
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String startDownloadPresentation(String name, ExportFormat format, ExportOptions options, String password, String folder, String storage, String fontsFolder, List<Integer> slides) throws ApiException {
        try {
            ApiResponse<String> resp = startDownloadPresentationWithHttpInfo(name, format, options, password, folder, storage, fontsFolder, slides);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<String> resp = startDownloadPresentationWithHttpInfo(name, format, options, password, folder, storage, fontsFolder, slides);
            return resp.getData();
        }
    }

    /**
     * 
     * 
     * @param name  (required)
     * @param format  (required)
     * @param options  
     * @param password  
     * @param folder  
     * @param storage  
     * @param fontsFolder  
     * @param slides  
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> startDownloadPresentationWithHttpInfo(String name, ExportFormat format, ExportOptions options, String password, String folder, String storage, String fontsFolder, List<Integer> slides) throws ApiException {
        com.squareup.okhttp.Call call = startDownloadPresentationCall(name, format, options, password, folder, storage, fontsFolder, slides, null, null);
        Type returnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param name  (required)
     * @param format  (required)
     * @param options  
     * @param password  
     * @param folder  
     * @param storage  
     * @param fontsFolder  
     * @param slides  
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call startDownloadPresentationAsync(String name, ExportFormat format, ExportOptions options, String password, String folder, String storage, String fontsFolder, List<Integer> slides, final ApiCallback<String> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = startDownloadPresentationCall(name, format, options, password, folder, storage, fontsFolder, slides, progressListener, progressRequestListener);
        Type returnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for startMerge
     * @param files Files to merge 
     * @param request  
     * @param storage  
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call startMergeCall(List<FileInfo> files, OrderedMergeRequest request, String storage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object postBody = request;

        // create path and map variables
        String methodPath = "/slides/async/merge"
            ;

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "storage", storage);

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new LinkedHashMap<String, Object>();
        if (files != null)
        formParams.put("files", files);

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "multipart/form-data"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(methodPath, "POST", queryParams, postBody, headerParams, formParams, progressRequestListener);
    }

    /**
     * 
     * 
     * @param files Files to merge 
     * @param request  
     * @param storage  
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String startMerge(List<FileInfo> files, OrderedMergeRequest request, String storage) throws ApiException {
        try {
            ApiResponse<String> resp = startMergeWithHttpInfo(files, request, storage);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<String> resp = startMergeWithHttpInfo(files, request, storage);
            return resp.getData();
        }
    }

    /**
     * 
     * 
     * @param files Files to merge 
     * @param request  
     * @param storage  
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> startMergeWithHttpInfo(List<FileInfo> files, OrderedMergeRequest request, String storage) throws ApiException {
        com.squareup.okhttp.Call call = startMergeCall(files, request, storage, null, null);
        Type returnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param files Files to merge 
     * @param request  
     * @param storage  
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call startMergeAsync(List<FileInfo> files, OrderedMergeRequest request, String storage, final ApiCallback<String> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = startMergeCall(files, request, storage, progressListener, progressRequestListener);
        Type returnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for startMergeAndSave
     * @param outPath  (required)
     * @param files Files to merge 
     * @param request  
     * @param storage  
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call startMergeAndSaveCall(String outPath, List<FileInfo> files, OrderedMergeRequest request, String storage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'outPath' is set
        if (outPath == null) {
            throw new ApiException("Missing the required parameter 'outPath' when calling startMergeAndSave(Async)");
        }
        Object postBody = request;

        // create path and map variables
        String methodPath = "/slides/async/merge"
            ;

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "outPath", outPath);
        apiClient.addQueryParameter(queryParams, "storage", storage);

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new LinkedHashMap<String, Object>();
        if (files != null)
        formParams.put("files", files);

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "multipart/form-data"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(methodPath, "PUT", queryParams, postBody, headerParams, formParams, progressRequestListener);
    }

    /**
     * 
     * 
     * @param outPath  (required)
     * @param files Files to merge 
     * @param request  
     * @param storage  
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String startMergeAndSave(String outPath, List<FileInfo> files, OrderedMergeRequest request, String storage) throws ApiException {
        try {
            ApiResponse<String> resp = startMergeAndSaveWithHttpInfo(outPath, files, request, storage);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<String> resp = startMergeAndSaveWithHttpInfo(outPath, files, request, storage);
            return resp.getData();
        }
    }

    /**
     * 
     * 
     * @param outPath  (required)
     * @param files Files to merge 
     * @param request  
     * @param storage  
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> startMergeAndSaveWithHttpInfo(String outPath, List<FileInfo> files, OrderedMergeRequest request, String storage) throws ApiException {
        com.squareup.okhttp.Call call = startMergeAndSaveCall(outPath, files, request, storage, null, null);
        Type returnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param outPath  (required)
     * @param files Files to merge 
     * @param request  
     * @param storage  
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call startMergeAndSaveAsync(String outPath, List<FileInfo> files, OrderedMergeRequest request, String storage, final ApiCallback<String> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = startMergeAndSaveCall(outPath, files, request, storage, progressListener, progressRequestListener);
        Type returnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for startSavePresentation
     * @param name  (required)
     * @param format  (required)
     * @param outPath  (required)
     * @param options  
     * @param password  
     * @param folder  
     * @param storage  
     * @param fontsFolder  
     * @param slides  
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call startSavePresentationCall(String name, ExportFormat format, String outPath, ExportOptions options, String password, String folder, String storage, String fontsFolder, List<Integer> slides, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling startSavePresentation(Async)");
        }
        // verify the required parameter 'format' is set
        if (format == null) {
            throw new ApiException("Missing the required parameter 'format' when calling startSavePresentation(Async)");
        }
        // verify the required parameter 'outPath' is set
        if (outPath == null) {
            throw new ApiException("Missing the required parameter 'outPath' when calling startSavePresentation(Async)");
        }
        Object postBody = options;

        // create path and map variables
        String methodPath = "/slides/async/{name}/{format}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(name)).replaceAll("\\{" + "format" + "\\}", apiClient.objectToString(format));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "outPath", outPath);
        apiClient.addQueryParameter(queryParams, "folder", folder);
        apiClient.addQueryParameter(queryParams, "storage", storage);
        apiClient.addQueryParameter(queryParams, "fontsFolder", fontsFolder);
        apiClient.addQueryParameter(queryParams, "slides", slides);

        Map<String, String> headerParams = new HashMap<String, String>();
        if (password != null)
        headerParams.put("password", apiClient.parameterToString(password));

        Map<String, Object> formParams = new LinkedHashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(methodPath, "PUT", queryParams, postBody, headerParams, formParams, progressRequestListener);
    }

    /**
     * 
     * 
     * @param name  (required)
     * @param format  (required)
     * @param outPath  (required)
     * @param options  
     * @param password  
     * @param folder  
     * @param storage  
     * @param fontsFolder  
     * @param slides  
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String startSavePresentation(String name, ExportFormat format, String outPath, ExportOptions options, String password, String folder, String storage, String fontsFolder, List<Integer> slides) throws ApiException {
        try {
            ApiResponse<String> resp = startSavePresentationWithHttpInfo(name, format, outPath, options, password, folder, storage, fontsFolder, slides);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<String> resp = startSavePresentationWithHttpInfo(name, format, outPath, options, password, folder, storage, fontsFolder, slides);
            return resp.getData();
        }
    }

    /**
     * 
     * 
     * @param name  (required)
     * @param format  (required)
     * @param outPath  (required)
     * @param options  
     * @param password  
     * @param folder  
     * @param storage  
     * @param fontsFolder  
     * @param slides  
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> startSavePresentationWithHttpInfo(String name, ExportFormat format, String outPath, ExportOptions options, String password, String folder, String storage, String fontsFolder, List<Integer> slides) throws ApiException {
        com.squareup.okhttp.Call call = startSavePresentationCall(name, format, outPath, options, password, folder, storage, fontsFolder, slides, null, null);
        Type returnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param name  (required)
     * @param format  (required)
     * @param outPath  (required)
     * @param options  
     * @param password  
     * @param folder  
     * @param storage  
     * @param fontsFolder  
     * @param slides  
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call startSavePresentationAsync(String name, ExportFormat format, String outPath, ExportOptions options, String password, String folder, String storage, String fontsFolder, List<Integer> slides, final ApiCallback<String> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = startSavePresentationCall(name, format, outPath, options, password, folder, storage, fontsFolder, slides, progressListener, progressRequestListener);
        Type returnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for startSplit
     * @param name  (required)
     * @param format  (required)
     * @param options  
     * @param width  
     * @param height  
     * @param from  
     * @param to  
     * @param destFolder  
     * @param password  
     * @param folder  
     * @param storage  
     * @param fontsFolder  
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call startSplitCall(String name, SlideExportFormat format, ExportOptions options, Integer width, Integer height, Integer from, Integer to, String destFolder, String password, String folder, String storage, String fontsFolder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling startSplit(Async)");
        }
        // verify the required parameter 'format' is set
        if (format == null) {
            throw new ApiException("Missing the required parameter 'format' when calling startSplit(Async)");
        }
        Object postBody = options;

        // create path and map variables
        String methodPath = "/slides/async/{name}/split/{format}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(name)).replaceAll("\\{" + "format" + "\\}", apiClient.objectToString(format));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "width", width);
        apiClient.addQueryParameter(queryParams, "height", height);
        apiClient.addQueryParameter(queryParams, "from", from);
        apiClient.addQueryParameter(queryParams, "to", to);
        apiClient.addQueryParameter(queryParams, "destFolder", destFolder);
        apiClient.addQueryParameter(queryParams, "folder", folder);
        apiClient.addQueryParameter(queryParams, "storage", storage);
        apiClient.addQueryParameter(queryParams, "fontsFolder", fontsFolder);

        Map<String, String> headerParams = new HashMap<String, String>();
        if (password != null)
        headerParams.put("password", apiClient.parameterToString(password));

        Map<String, Object> formParams = new LinkedHashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(methodPath, "POST", queryParams, postBody, headerParams, formParams, progressRequestListener);
    }

    /**
     * 
     * 
     * @param name  (required)
     * @param format  (required)
     * @param options  
     * @param width  
     * @param height  
     * @param from  
     * @param to  
     * @param destFolder  
     * @param password  
     * @param folder  
     * @param storage  
     * @param fontsFolder  
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String startSplit(String name, SlideExportFormat format, ExportOptions options, Integer width, Integer height, Integer from, Integer to, String destFolder, String password, String folder, String storage, String fontsFolder) throws ApiException {
        try {
            ApiResponse<String> resp = startSplitWithHttpInfo(name, format, options, width, height, from, to, destFolder, password, folder, storage, fontsFolder);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<String> resp = startSplitWithHttpInfo(name, format, options, width, height, from, to, destFolder, password, folder, storage, fontsFolder);
            return resp.getData();
        }
    }

    /**
     * 
     * 
     * @param name  (required)
     * @param format  (required)
     * @param options  
     * @param width  
     * @param height  
     * @param from  
     * @param to  
     * @param destFolder  
     * @param password  
     * @param folder  
     * @param storage  
     * @param fontsFolder  
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> startSplitWithHttpInfo(String name, SlideExportFormat format, ExportOptions options, Integer width, Integer height, Integer from, Integer to, String destFolder, String password, String folder, String storage, String fontsFolder) throws ApiException {
        com.squareup.okhttp.Call call = startSplitCall(name, format, options, width, height, from, to, destFolder, password, folder, storage, fontsFolder, null, null);
        Type returnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param name  (required)
     * @param format  (required)
     * @param options  
     * @param width  
     * @param height  
     * @param from  
     * @param to  
     * @param destFolder  
     * @param password  
     * @param folder  
     * @param storage  
     * @param fontsFolder  
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call startSplitAsync(String name, SlideExportFormat format, ExportOptions options, Integer width, Integer height, Integer from, Integer to, String destFolder, String password, String folder, String storage, String fontsFolder, final ApiCallback<String> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = startSplitCall(name, format, options, width, height, from, to, destFolder, password, folder, storage, fontsFolder, progressListener, progressRequestListener);
        Type returnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for startUploadAndSplit
     * @param document Document data. (required)
     * @param format  (required)
     * @param destFolder  
     * @param width  
     * @param height  
     * @param from  
     * @param to  
     * @param password  
     * @param storage  
     * @param fontsFolder  
     * @param options  
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call startUploadAndSplitCall(byte[] document, SlideExportFormat format, String destFolder, Integer width, Integer height, Integer from, Integer to, String password, String storage, String fontsFolder, ExportOptions options, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'document' is set
        if (document == null) {
            throw new ApiException("Missing the required parameter 'document' when calling startUploadAndSplit(Async)");
        }
        // verify the required parameter 'format' is set
        if (format == null) {
            throw new ApiException("Missing the required parameter 'format' when calling startUploadAndSplit(Async)");
        }
        Object postBody = options;

        // create path and map variables
        String methodPath = "/slides/async/split/{format}"
            .replaceAll("\\{" + "format" + "\\}", apiClient.objectToString(format));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "destFolder", destFolder);
        apiClient.addQueryParameter(queryParams, "width", width);
        apiClient.addQueryParameter(queryParams, "height", height);
        apiClient.addQueryParameter(queryParams, "from", from);
        apiClient.addQueryParameter(queryParams, "to", to);
        apiClient.addQueryParameter(queryParams, "storage", storage);
        apiClient.addQueryParameter(queryParams, "fontsFolder", fontsFolder);

        Map<String, String> headerParams = new HashMap<String, String>();
        if (password != null)
        headerParams.put("password", apiClient.parameterToString(password));

        Map<String, Object> formParams = new LinkedHashMap<String, Object>();
        if (document != null)
        formParams.put("document", document);

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "multipart/form-data"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(methodPath, "POST", queryParams, postBody, headerParams, formParams, progressRequestListener);
    }

    /**
     * 
     * 
     * @param document Document data. (required)
     * @param format  (required)
     * @param destFolder  
     * @param width  
     * @param height  
     * @param from  
     * @param to  
     * @param password  
     * @param storage  
     * @param fontsFolder  
     * @param options  
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String startUploadAndSplit(byte[] document, SlideExportFormat format, String destFolder, Integer width, Integer height, Integer from, Integer to, String password, String storage, String fontsFolder, ExportOptions options) throws ApiException {
        try {
            ApiResponse<String> resp = startUploadAndSplitWithHttpInfo(document, format, destFolder, width, height, from, to, password, storage, fontsFolder, options);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<String> resp = startUploadAndSplitWithHttpInfo(document, format, destFolder, width, height, from, to, password, storage, fontsFolder, options);
            return resp.getData();
        }
    }

    /**
     * 
     * 
     * @param document Document data. (required)
     * @param format  (required)
     * @param destFolder  
     * @param width  
     * @param height  
     * @param from  
     * @param to  
     * @param password  
     * @param storage  
     * @param fontsFolder  
     * @param options  
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> startUploadAndSplitWithHttpInfo(byte[] document, SlideExportFormat format, String destFolder, Integer width, Integer height, Integer from, Integer to, String password, String storage, String fontsFolder, ExportOptions options) throws ApiException {
        com.squareup.okhttp.Call call = startUploadAndSplitCall(document, format, destFolder, width, height, from, to, password, storage, fontsFolder, options, null, null);
        Type returnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param document Document data. (required)
     * @param format  (required)
     * @param destFolder  
     * @param width  
     * @param height  
     * @param from  
     * @param to  
     * @param password  
     * @param storage  
     * @param fontsFolder  
     * @param options  
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call startUploadAndSplitAsync(byte[] document, SlideExportFormat format, String destFolder, Integer width, Integer height, Integer from, Integer to, String password, String storage, String fontsFolder, ExportOptions options, final ApiCallback<String> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = startUploadAndSplitCall(document, format, destFolder, width, height, from, to, password, storage, fontsFolder, options, progressListener, progressRequestListener);
        Type returnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for upload
     * @param path  
     * @param file File to upload (required)
     * @param storageName  
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call uploadCall(String path, byte[] file, String storageName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new ApiException("Missing the required parameter 'file' when calling upload(Async)");
        }
        Object postBody = null;

        // create path and map variables
        String methodPath = "/slides/async/storage/file/{path}"
            .replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(path));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "storageName", storageName);

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new LinkedHashMap<String, Object>();
        if (file != null)
        formParams.put("file", file);

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "multipart/form-data"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(methodPath, "PUT", queryParams, postBody, headerParams, formParams, progressRequestListener);
    }

    /**
     * 
     * 
     * @param path  
     * @param file File to upload (required)
     * @param storageName  
     * @return FilesUploadResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FilesUploadResult upload(String path, byte[] file, String storageName) throws ApiException {
        try {
            ApiResponse<FilesUploadResult> resp = uploadWithHttpInfo(path, file, storageName);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<FilesUploadResult> resp = uploadWithHttpInfo(path, file, storageName);
            return resp.getData();
        }
    }

    /**
     * 
     * 
     * @param path  
     * @param file File to upload (required)
     * @param storageName  
     * @return ApiResponse&lt;FilesUploadResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FilesUploadResult> uploadWithHttpInfo(String path, byte[] file, String storageName) throws ApiException {
        com.squareup.okhttp.Call call = uploadCall(path, file, storageName, null, null);
        Type returnType = new TypeToken<FilesUploadResult>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param path  
     * @param file File to upload (required)
     * @param storageName  
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call uploadAsync(String path, byte[] file, String storageName, final ApiCallback<FilesUploadResult> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = uploadCall(path, file, storageName, progressListener, progressRequestListener);
        Type returnType = new TypeToken<FilesUploadResult>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }

    private final ApiClient apiClient;
}
