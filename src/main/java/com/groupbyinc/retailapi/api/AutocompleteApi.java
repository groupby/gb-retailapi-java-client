/*
 * GroupBy Retail
 * GroupBy Retail API
 *
 * The version of the OpenAPI document: 0.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.groupbyinc.retailapi.api;

import com.groupbyinc.retailapi.ApiCallback;
import com.groupbyinc.retailapi.ApiClient;
import com.groupbyinc.retailapi.ApiException;
import com.groupbyinc.retailapi.ApiResponse;
import com.groupbyinc.retailapi.Configuration;
import com.groupbyinc.retailapi.Pair;
import com.groupbyinc.retailapi.ProgressRequestBody;
import com.groupbyinc.retailapi.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.groupbyinc.retailapi.model.ErrorResponse;
import com.groupbyinc.retailapi.model.Identity;
import com.groupbyinc.retailapi.model.Merchandiser;
import com.groupbyinc.retailapi.model.Request;
import com.groupbyinc.retailapi.model.SearchResults;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AutocompleteApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AutocompleteApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AutocompleteApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for autocompletesearch
     * @param xGroupbyCustomerId Header on incoming HTTP requests that is populated by the API gateway and indicates the customer ID. (required)
     * @param identity  (required)
     * @param merchandiser  (required)
     * @param request Object which is represent autocomplete request and encapsulate all passed parameters.  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response, returns result of operation. It is can be either empty body, object model or list of models. </td><td>  * Content-Type - In responses, a Content-Type header provides the client with the actual content type of the returned content. <br>  * Date - The Date general HTTP header contains the date and time at which the message was originated. <br>  * Content-Length - The Content-Length header indicates the size of the message body, in bytes, sent to the recipient. <br>  * Connection - The Connection general header controls whether the network connection stays open after the current transaction finishes. If the value sent is keep-alive, the connection is persistent and not closed, allowing for subsequent requests to the same server to be done. <br>  * Content-Encoding - The Content-Encoding representation header lists any encodings that have been applied to the representation (message payload), and in what order. This lets the recipient know how to decode the representation in order to obtain the original payload format. Content encoding is mainly used to compress the message data without losing information about the origin media type. <br>  </td></tr>
        <tr><td> 400 </td><td> Client has made a bad request, usually a validation constraint has been violated. See the message for further information. </td><td>  * Content-Type - In responses, a Content-Type header provides the client with the actual content type of the returned content. <br>  * Date - The Date general HTTP header contains the date and time at which the message was originated. <br>  * Content-Length - The Content-Length header indicates the size of the message body, in bytes, sent to the recipient. <br>  * Connection - The Connection general header controls whether the network connection stays open after the current transaction finishes. If the value sent is keep-alive, the connection is persistent and not closed, allowing for subsequent requests to the same server to be done. <br>  </td></tr>
     </table>
     */
    public okhttp3.Call autocompletesearchCall(String xGroupbyCustomerId, Identity identity, Merchandiser merchandiser, Request request, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] { "https://autocomplete.{environment}.groupbycloud.com" };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/request";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (request != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("request", request));
        }

        if (identity != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("identity", identity));
        }

        if (merchandiser != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("merchandiser", merchandiser));
        }

        if (xGroupbyCustomerId != null) {
            localVarHeaderParams.put("X-Groupby-Customer-Id", localVarApiClient.parameterToString(xGroupbyCustomerId));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "GroupByIncEmployee", "ClientKey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call autocompletesearchValidateBeforeCall(String xGroupbyCustomerId, Identity identity, Merchandiser merchandiser, Request request, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'xGroupbyCustomerId' is set
        if (xGroupbyCustomerId == null) {
            throw new ApiException("Missing the required parameter 'xGroupbyCustomerId' when calling autocompletesearch(Async)");
        }

        // verify the required parameter 'identity' is set
        if (identity == null) {
            throw new ApiException("Missing the required parameter 'identity' when calling autocompletesearch(Async)");
        }

        // verify the required parameter 'merchandiser' is set
        if (merchandiser == null) {
            throw new ApiException("Missing the required parameter 'merchandiser' when calling autocompletesearch(Async)");
        }

        return autocompletesearchCall(xGroupbyCustomerId, identity, merchandiser, request, _callback);

    }

    /**
     * 
     * A simple request used to get completes the specified prefix with keyword suggestions.
     * @param xGroupbyCustomerId Header on incoming HTTP requests that is populated by the API gateway and indicates the customer ID. (required)
     * @param identity  (required)
     * @param merchandiser  (required)
     * @param request Object which is represent autocomplete request and encapsulate all passed parameters.  (optional)
     * @return SearchResults
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response, returns result of operation. It is can be either empty body, object model or list of models. </td><td>  * Content-Type - In responses, a Content-Type header provides the client with the actual content type of the returned content. <br>  * Date - The Date general HTTP header contains the date and time at which the message was originated. <br>  * Content-Length - The Content-Length header indicates the size of the message body, in bytes, sent to the recipient. <br>  * Connection - The Connection general header controls whether the network connection stays open after the current transaction finishes. If the value sent is keep-alive, the connection is persistent and not closed, allowing for subsequent requests to the same server to be done. <br>  * Content-Encoding - The Content-Encoding representation header lists any encodings that have been applied to the representation (message payload), and in what order. This lets the recipient know how to decode the representation in order to obtain the original payload format. Content encoding is mainly used to compress the message data without losing information about the origin media type. <br>  </td></tr>
        <tr><td> 400 </td><td> Client has made a bad request, usually a validation constraint has been violated. See the message for further information. </td><td>  * Content-Type - In responses, a Content-Type header provides the client with the actual content type of the returned content. <br>  * Date - The Date general HTTP header contains the date and time at which the message was originated. <br>  * Content-Length - The Content-Length header indicates the size of the message body, in bytes, sent to the recipient. <br>  * Connection - The Connection general header controls whether the network connection stays open after the current transaction finishes. If the value sent is keep-alive, the connection is persistent and not closed, allowing for subsequent requests to the same server to be done. <br>  </td></tr>
     </table>
     */
    public SearchResults autocompletesearch(String xGroupbyCustomerId, Identity identity, Merchandiser merchandiser, Request request) throws ApiException {
        ApiResponse<SearchResults> localVarResp = autocompletesearchWithHttpInfo(xGroupbyCustomerId, identity, merchandiser, request);
        return localVarResp.getData();
    }

    /**
     * 
     * A simple request used to get completes the specified prefix with keyword suggestions.
     * @param xGroupbyCustomerId Header on incoming HTTP requests that is populated by the API gateway and indicates the customer ID. (required)
     * @param identity  (required)
     * @param merchandiser  (required)
     * @param request Object which is represent autocomplete request and encapsulate all passed parameters.  (optional)
     * @return ApiResponse&lt;SearchResults&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response, returns result of operation. It is can be either empty body, object model or list of models. </td><td>  * Content-Type - In responses, a Content-Type header provides the client with the actual content type of the returned content. <br>  * Date - The Date general HTTP header contains the date and time at which the message was originated. <br>  * Content-Length - The Content-Length header indicates the size of the message body, in bytes, sent to the recipient. <br>  * Connection - The Connection general header controls whether the network connection stays open after the current transaction finishes. If the value sent is keep-alive, the connection is persistent and not closed, allowing for subsequent requests to the same server to be done. <br>  * Content-Encoding - The Content-Encoding representation header lists any encodings that have been applied to the representation (message payload), and in what order. This lets the recipient know how to decode the representation in order to obtain the original payload format. Content encoding is mainly used to compress the message data without losing information about the origin media type. <br>  </td></tr>
        <tr><td> 400 </td><td> Client has made a bad request, usually a validation constraint has been violated. See the message for further information. </td><td>  * Content-Type - In responses, a Content-Type header provides the client with the actual content type of the returned content. <br>  * Date - The Date general HTTP header contains the date and time at which the message was originated. <br>  * Content-Length - The Content-Length header indicates the size of the message body, in bytes, sent to the recipient. <br>  * Connection - The Connection general header controls whether the network connection stays open after the current transaction finishes. If the value sent is keep-alive, the connection is persistent and not closed, allowing for subsequent requests to the same server to be done. <br>  </td></tr>
     </table>
     */
    public ApiResponse<SearchResults> autocompletesearchWithHttpInfo(String xGroupbyCustomerId, Identity identity, Merchandiser merchandiser, Request request) throws ApiException {
        okhttp3.Call localVarCall = autocompletesearchValidateBeforeCall(xGroupbyCustomerId, identity, merchandiser, request, null);
        Type localVarReturnType = new TypeToken<SearchResults>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * A simple request used to get completes the specified prefix with keyword suggestions.
     * @param xGroupbyCustomerId Header on incoming HTTP requests that is populated by the API gateway and indicates the customer ID. (required)
     * @param identity  (required)
     * @param merchandiser  (required)
     * @param request Object which is represent autocomplete request and encapsulate all passed parameters.  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response, returns result of operation. It is can be either empty body, object model or list of models. </td><td>  * Content-Type - In responses, a Content-Type header provides the client with the actual content type of the returned content. <br>  * Date - The Date general HTTP header contains the date and time at which the message was originated. <br>  * Content-Length - The Content-Length header indicates the size of the message body, in bytes, sent to the recipient. <br>  * Connection - The Connection general header controls whether the network connection stays open after the current transaction finishes. If the value sent is keep-alive, the connection is persistent and not closed, allowing for subsequent requests to the same server to be done. <br>  * Content-Encoding - The Content-Encoding representation header lists any encodings that have been applied to the representation (message payload), and in what order. This lets the recipient know how to decode the representation in order to obtain the original payload format. Content encoding is mainly used to compress the message data without losing information about the origin media type. <br>  </td></tr>
        <tr><td> 400 </td><td> Client has made a bad request, usually a validation constraint has been violated. See the message for further information. </td><td>  * Content-Type - In responses, a Content-Type header provides the client with the actual content type of the returned content. <br>  * Date - The Date general HTTP header contains the date and time at which the message was originated. <br>  * Content-Length - The Content-Length header indicates the size of the message body, in bytes, sent to the recipient. <br>  * Connection - The Connection general header controls whether the network connection stays open after the current transaction finishes. If the value sent is keep-alive, the connection is persistent and not closed, allowing for subsequent requests to the same server to be done. <br>  </td></tr>
     </table>
     */
    public okhttp3.Call autocompletesearchAsync(String xGroupbyCustomerId, Identity identity, Merchandiser merchandiser, Request request, final ApiCallback<SearchResults> _callback) throws ApiException {

        okhttp3.Call localVarCall = autocompletesearchValidateBeforeCall(xGroupbyCustomerId, identity, merchandiser, request, _callback);
        Type localVarReturnType = new TypeToken<SearchResults>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
