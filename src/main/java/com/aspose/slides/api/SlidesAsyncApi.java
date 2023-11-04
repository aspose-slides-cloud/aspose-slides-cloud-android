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
import com.aspose.slides.model.Operation;
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

    private final ApiClient apiClient;
}
