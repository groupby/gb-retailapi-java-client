# RecommendationsApiApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**predict**](RecommendationsApiApi.md#predict) | **POST** /api/predict | Provide Recommendations AI functionality. |
| [**predictV2**](RecommendationsApiApi.md#predictV2) | **POST** /api/recommendation | Provide Recommendations AI functionality. |


<a id="predict"></a>
# **predict**
> PredictResults predict(xGroupbyCustomerId, recommendationsRequest)

Provide Recommendations AI functionality.

Perform a recommendation request against the GroupBy Retail Recommendations API.

### Example
```java
// Import classes:
import com.groupbyinc.retailapi.ApiClient;
import com.groupbyinc.retailapi.ApiException;
import com.groupbyinc.retailapi.Configuration;
import com.groupbyinc.retailapi.auth.*;
import com.groupbyinc.retailapi.models.*;
import com.groupbyinc.retailapi.api.RecommendationsApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: GroupByIncEmployee
    HttpBasicAuth GroupByIncEmployee = (HttpBasicAuth) defaultClient.getAuthentication("GroupByIncEmployee");
    GroupByIncEmployee.setUsername("YOUR USERNAME");
    GroupByIncEmployee.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ClientKey
    ApiKeyAuth ClientKey = (ApiKeyAuth) defaultClient.getAuthentication("ClientKey");
    ClientKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ClientKey.setApiKeyPrefix("Token");

    RecommendationsApiApi apiInstance = new RecommendationsApiApi(defaultClient);
    String xGroupbyCustomerId = "xGroupbyCustomerId_example"; // String | Custom HTTP header which may contain tenant name. Used to define a client by its name.
    RecommendationsRequest recommendationsRequest = new RecommendationsRequest(); // RecommendationsRequest | Request that should be populated to configure a recommendations API call made by the client.
    try {
      PredictResults result = apiInstance.predict(xGroupbyCustomerId, recommendationsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecommendationsApiApi#predict");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xGroupbyCustomerId** | **String**| Custom HTTP header which may contain tenant name. Used to define a client by its name. | |
| **recommendationsRequest** | [**RecommendationsRequest**](RecommendationsRequest.md)| Request that should be populated to configure a recommendations API call made by the client. | |

### Return type

[**PredictResults**](PredictResults.md)

### Authorization

[GroupByIncEmployee](../README.md#GroupByIncEmployee), [ClientKey](../README.md#ClientKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  * Content-Type - In responses, a Content-Type header provides the client with the actual content type of the returned content. <br>  * Date - The Date general HTTP header contains the date and time at which the message was originated. <br>  * Content-Length - The Content-Length header indicates the size of the message body, in bytes, sent to the recipient. <br>  * Connection - The Connection general header controls whether the network connection stays open after the current transaction finishes. If the value sent is keep-alive, the connection is persistent and not closed, allowing for subsequent requests to the same server to be done. <br>  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="predictV2"></a>
# **predictV2**
> PredictResults predictV2(xGroupbyCustomerId, recommendationsRequest)

Provide Recommendations AI functionality.

Perform a recommendation request against the GroupBy Retail Recommendations API.

### Example
```java
// Import classes:
import com.groupbyinc.retailapi.ApiClient;
import com.groupbyinc.retailapi.ApiException;
import com.groupbyinc.retailapi.Configuration;
import com.groupbyinc.retailapi.auth.*;
import com.groupbyinc.retailapi.models.*;
import com.groupbyinc.retailapi.api.RecommendationsApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: GroupByIncEmployee
    HttpBasicAuth GroupByIncEmployee = (HttpBasicAuth) defaultClient.getAuthentication("GroupByIncEmployee");
    GroupByIncEmployee.setUsername("YOUR USERNAME");
    GroupByIncEmployee.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ClientKey
    ApiKeyAuth ClientKey = (ApiKeyAuth) defaultClient.getAuthentication("ClientKey");
    ClientKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ClientKey.setApiKeyPrefix("Token");

    RecommendationsApiApi apiInstance = new RecommendationsApiApi(defaultClient);
    String xGroupbyCustomerId = "xGroupbyCustomerId_example"; // String | Custom HTTP header which may contain tenant name. Used to define a client by its name.
    RecommendationsRequest recommendationsRequest = new RecommendationsRequest(); // RecommendationsRequest | Request that should be populated to configure a recommendations API call made by the client.
    try {
      PredictResults result = apiInstance.predictV2(xGroupbyCustomerId, recommendationsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecommendationsApiApi#predictV2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xGroupbyCustomerId** | **String**| Custom HTTP header which may contain tenant name. Used to define a client by its name. | |
| **recommendationsRequest** | [**RecommendationsRequest**](RecommendationsRequest.md)| Request that should be populated to configure a recommendations API call made by the client. | |

### Return type

[**PredictResults**](PredictResults.md)

### Authorization

[GroupByIncEmployee](../README.md#GroupByIncEmployee), [ClientKey](../README.md#ClientKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  * Content-Type - In responses, a Content-Type header provides the client with the actual content type of the returned content. <br>  * Date - The Date general HTTP header contains the date and time at which the message was originated. <br>  * Content-Length - The Content-Length header indicates the size of the message body, in bytes, sent to the recipient. <br>  * Connection - The Connection general header controls whether the network connection stays open after the current transaction finishes. If the value sent is keep-alive, the connection is persistent and not closed, allowing for subsequent requests to the same server to be done. <br>  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

