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


import com.groupbyinc.retailapi.model.PredictResults;
import com.groupbyinc.retailapi.model.RecommendationsErrorResponse;
import com.groupbyinc.retailapi.model.RecommendationsRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecommendationsApiApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public RecommendationsApiApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RecommendationsApiApi(ApiClient apiClient) {
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
     * Build call for predict
     * @param xGroupbyCustomerId Custom HTTP header which may contain tenant name. Used to define a client by its name. (required)
     * @param recommendationsRequest Request that should be populated to configure a recommendations API call made by the client. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  * Content-Type - In responses, a Content-Type header provides the client with the actual content type of the returned content. <br>  * Date - The Date general HTTP header contains the date and time at which the message was originated. <br>  * Content-Length - The Content-Length header indicates the size of the message body, in bytes, sent to the recipient. <br>  * Connection - The Connection general header controls whether the network connection stays open after the current transaction finishes. If the value sent is keep-alive, the connection is persistent and not closed, allowing for subsequent requests to the same server to be done. <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call predictCall(String xGroupbyCustomerId, RecommendationsRequest recommendationsRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] { "https://recsapi.{environment}.groupbycloud.com" };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = recommendationsRequest;

        // create path and map variables
        String localVarPath = "/api/predict";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "GroupByIncEmployee", "ClientKey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private okhttp3.Call predictValidateBeforeCall(String xGroupbyCustomerId, RecommendationsRequest recommendationsRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'xGroupbyCustomerId' is set
        if (xGroupbyCustomerId == null) {
            throw new ApiException("Missing the required parameter 'xGroupbyCustomerId' when calling predict(Async)");
        }

        // verify the required parameter 'recommendationsRequest' is set
        if (recommendationsRequest == null) {
            throw new ApiException("Missing the required parameter 'recommendationsRequest' when calling predict(Async)");
        }

        return predictCall(xGroupbyCustomerId, recommendationsRequest, _callback);

    }

    /**
     * Provide Recommendations AI functionality.
     * Perform a recommendation request against the GroupBy Retail Recommendations API.
     * @param xGroupbyCustomerId Custom HTTP header which may contain tenant name. Used to define a client by its name. (required)
     * @param recommendationsRequest Request that should be populated to configure a recommendations API call made by the client. (required)
     * @return PredictResults
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  * Content-Type - In responses, a Content-Type header provides the client with the actual content type of the returned content. <br>  * Date - The Date general HTTP header contains the date and time at which the message was originated. <br>  * Content-Length - The Content-Length header indicates the size of the message body, in bytes, sent to the recipient. <br>  * Connection - The Connection general header controls whether the network connection stays open after the current transaction finishes. If the value sent is keep-alive, the connection is persistent and not closed, allowing for subsequent requests to the same server to be done. <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public PredictResults predict(String xGroupbyCustomerId, RecommendationsRequest recommendationsRequest) throws ApiException {
        ApiResponse<PredictResults> localVarResp = predictWithHttpInfo(xGroupbyCustomerId, recommendationsRequest);
        return localVarResp.getData();
    }

    /**
     * Provide Recommendations AI functionality.
     * Perform a recommendation request against the GroupBy Retail Recommendations API.
     * @param xGroupbyCustomerId Custom HTTP header which may contain tenant name. Used to define a client by its name. (required)
     * @param recommendationsRequest Request that should be populated to configure a recommendations API call made by the client. (required)
     * @return ApiResponse&lt;PredictResults&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  * Content-Type - In responses, a Content-Type header provides the client with the actual content type of the returned content. <br>  * Date - The Date general HTTP header contains the date and time at which the message was originated. <br>  * Content-Length - The Content-Length header indicates the size of the message body, in bytes, sent to the recipient. <br>  * Connection - The Connection general header controls whether the network connection stays open after the current transaction finishes. If the value sent is keep-alive, the connection is persistent and not closed, allowing for subsequent requests to the same server to be done. <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public ApiResponse<PredictResults> predictWithHttpInfo(String xGroupbyCustomerId, RecommendationsRequest recommendationsRequest) throws ApiException {
        okhttp3.Call localVarCall = predictValidateBeforeCall(xGroupbyCustomerId, recommendationsRequest, null);
        Type localVarReturnType = new TypeToken<PredictResults>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Provide Recommendations AI functionality. (asynchronously)
     * Perform a recommendation request against the GroupBy Retail Recommendations API.
     * @param xGroupbyCustomerId Custom HTTP header which may contain tenant name. Used to define a client by its name. (required)
     * @param recommendationsRequest Request that should be populated to configure a recommendations API call made by the client. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  * Content-Type - In responses, a Content-Type header provides the client with the actual content type of the returned content. <br>  * Date - The Date general HTTP header contains the date and time at which the message was originated. <br>  * Content-Length - The Content-Length header indicates the size of the message body, in bytes, sent to the recipient. <br>  * Connection - The Connection general header controls whether the network connection stays open after the current transaction finishes. If the value sent is keep-alive, the connection is persistent and not closed, allowing for subsequent requests to the same server to be done. <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call predictAsync(String xGroupbyCustomerId, RecommendationsRequest recommendationsRequest, final ApiCallback<PredictResults> _callback) throws ApiException {

        okhttp3.Call localVarCall = predictValidateBeforeCall(xGroupbyCustomerId, recommendationsRequest, _callback);
        Type localVarReturnType = new TypeToken<PredictResults>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for predictV2
     * @param xGroupbyCustomerId Custom HTTP header which may contain tenant name. Used to define a client by its name. (required)
     * @param recommendationsRequest Request that should be populated to configure a recommendations API call made by the client. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  * Content-Type - In responses, a Content-Type header provides the client with the actual content type of the returned content. <br>  * Date - The Date general HTTP header contains the date and time at which the message was originated. <br>  * Content-Length - The Content-Length header indicates the size of the message body, in bytes, sent to the recipient. <br>  * Connection - The Connection general header controls whether the network connection stays open after the current transaction finishes. If the value sent is keep-alive, the connection is persistent and not closed, allowing for subsequent requests to the same server to be done. <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call predictV2Call(String xGroupbyCustomerId, RecommendationsRequest recommendationsRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] { "https://recsapi.{environment}.groupbycloud.com" };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = recommendationsRequest;

        // create path and map variables
        String localVarPath = "/api/recommendation";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "GroupByIncEmployee", "ClientKey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call predictV2ValidateBeforeCall(String xGroupbyCustomerId, RecommendationsRequest recommendationsRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'xGroupbyCustomerId' is set
        if (xGroupbyCustomerId == null) {
            throw new ApiException("Missing the required parameter 'xGroupbyCustomerId' when calling predictV2(Async)");
        }

        // verify the required parameter 'recommendationsRequest' is set
        if (recommendationsRequest == null) {
            throw new ApiException("Missing the required parameter 'recommendationsRequest' when calling predictV2(Async)");
        }

        return predictV2Call(xGroupbyCustomerId, recommendationsRequest, _callback);

    }

    /**
     * Provide Recommendations AI functionality.
     * Perform a recommendation request against the GroupBy Retail Recommendations API.
     * @param xGroupbyCustomerId Custom HTTP header which may contain tenant name. Used to define a client by its name. (required)
     * @param recommendationsRequest Request that should be populated to configure a recommendations API call made by the client. (required)
     * @return PredictResults
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  * Content-Type - In responses, a Content-Type header provides the client with the actual content type of the returned content. <br>  * Date - The Date general HTTP header contains the date and time at which the message was originated. <br>  * Content-Length - The Content-Length header indicates the size of the message body, in bytes, sent to the recipient. <br>  * Connection - The Connection general header controls whether the network connection stays open after the current transaction finishes. If the value sent is keep-alive, the connection is persistent and not closed, allowing for subsequent requests to the same server to be done. <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public PredictResults predictV2(String xGroupbyCustomerId, RecommendationsRequest recommendationsRequest) throws ApiException {
        ApiResponse<PredictResults> localVarResp = predictV2WithHttpInfo(xGroupbyCustomerId, recommendationsRequest);
        return localVarResp.getData();
    }

    /**
     * Provide Recommendations AI functionality.
     * Perform a recommendation request against the GroupBy Retail Recommendations API.
     * @param xGroupbyCustomerId Custom HTTP header which may contain tenant name. Used to define a client by its name. (required)
     * @param recommendationsRequest Request that should be populated to configure a recommendations API call made by the client. (required)
     * @return ApiResponse&lt;PredictResults&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  * Content-Type - In responses, a Content-Type header provides the client with the actual content type of the returned content. <br>  * Date - The Date general HTTP header contains the date and time at which the message was originated. <br>  * Content-Length - The Content-Length header indicates the size of the message body, in bytes, sent to the recipient. <br>  * Connection - The Connection general header controls whether the network connection stays open after the current transaction finishes. If the value sent is keep-alive, the connection is persistent and not closed, allowing for subsequent requests to the same server to be done. <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PredictResults> predictV2WithHttpInfo(String xGroupbyCustomerId, RecommendationsRequest recommendationsRequest) throws ApiException {
        okhttp3.Call localVarCall = predictV2ValidateBeforeCall(xGroupbyCustomerId, recommendationsRequest, null);
        Type localVarReturnType = new TypeToken<PredictResults>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Provide Recommendations AI functionality. (asynchronously)
     * Perform a recommendation request against the GroupBy Retail Recommendations API.
     * @param xGroupbyCustomerId Custom HTTP header which may contain tenant name. Used to define a client by its name. (required)
     * @param recommendationsRequest Request that should be populated to configure a recommendations API call made by the client. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  * Content-Type - In responses, a Content-Type header provides the client with the actual content type of the returned content. <br>  * Date - The Date general HTTP header contains the date and time at which the message was originated. <br>  * Content-Length - The Content-Length header indicates the size of the message body, in bytes, sent to the recipient. <br>  * Connection - The Connection general header controls whether the network connection stays open after the current transaction finishes. If the value sent is keep-alive, the connection is persistent and not closed, allowing for subsequent requests to the same server to be done. <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call predictV2Async(String xGroupbyCustomerId, RecommendationsRequest recommendationsRequest, final ApiCallback<PredictResults> _callback) throws ApiException {

        okhttp3.Call localVarCall = predictV2ValidateBeforeCall(xGroupbyCustomerId, recommendationsRequest, _callback);
        Type localVarReturnType = new TypeToken<PredictResults>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
