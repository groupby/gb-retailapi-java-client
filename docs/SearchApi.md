# SearchApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**facetSearch**](SearchApi.md#facetSearch) | **POST** /api/search/facet | Provided search functionality |
| [**search**](SearchApi.md#search) | **POST** /api/search | Provided search functionality |


<a id="facetSearch"></a>
# **facetSearch**
> FacetSearchResponseDto facetSearch(xGroupbyCustomerId, facetSearchRequestDto)

Provided search functionality

Perform a facet search against the GroupBy Retail Search API.

### Example
```java
// Import classes:
import com.groupbyinc.retailapi.ApiClient;
import com.groupbyinc.retailapi.ApiException;
import com.groupbyinc.retailapi.Configuration;
import com.groupbyinc.retailapi.auth.*;
import com.groupbyinc.retailapi.models.*;
import com.groupbyinc.retailapi.api.SearchApi;

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

    SearchApi apiInstance = new SearchApi(defaultClient);
    String xGroupbyCustomerId = "xGroupbyCustomerId_example"; // String | Custom HTTP header which may contain tenant name. Used to define a client by its name.
    FacetSearchRequestDto facetSearchRequestDto = new FacetSearchRequestDto(); // FacetSearchRequestDto | Request that should be populated to configure a search API call, made by the client on behalf of a shopper. Contains original request and information about facet for which extra keys requested.
    try {
      FacetSearchResponseDto result = apiInstance.facetSearch(xGroupbyCustomerId, facetSearchRequestDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#facetSearch");
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
| **facetSearchRequestDto** | [**FacetSearchRequestDto**](FacetSearchRequestDto.md)| Request that should be populated to configure a search API call, made by the client on behalf of a shopper. Contains original request and information about facet for which extra keys requested. | |

### Return type

[**FacetSearchResponseDto**](FacetSearchResponseDto.md)

### Authorization

[GroupByIncEmployee](../README.md#GroupByIncEmployee), [ClientKey](../README.md#ClientKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful facet search response. Contains original request and navigation with relevant facet keys. |  * Content-Type - In responses, a Content-Type header provides the client with the actual content type of the returned content. <br>  * Date - The Date general HTTP header contains the date and time at which the message was originated. <br>  * Content-Length - The Content-Length header indicates the size of the message body, in bytes, sent to the recipient. <br>  * Connection - The Connection general header controls whether the network connection stays open after the current transaction finishes. If the value sent is keep-alive, the connection is persistent and not closed, allowing for subsequent requests to the same server to be done. <br>  |
| **400** | Client has made a bad request, usually a validation constraint has been violated. See the message for further information. |  -  |
| **403** | Client is not authorized to perform the requested operation. |  -  |
| **500** | There was an internal error processing the search request. |  -  |

<a id="search"></a>
# **search**
> SearchResponseDto search(xGroupbyCustomerId, searchRequestDto)

Provided search functionality

Perform a search against the GroupBy Retail Search API.

### Example
```java
// Import classes:
import com.groupbyinc.retailapi.ApiClient;
import com.groupbyinc.retailapi.ApiException;
import com.groupbyinc.retailapi.Configuration;
import com.groupbyinc.retailapi.auth.*;
import com.groupbyinc.retailapi.models.*;
import com.groupbyinc.retailapi.api.SearchApi;

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

    SearchApi apiInstance = new SearchApi(defaultClient);
    String xGroupbyCustomerId = "xGroupbyCustomerId_example"; // String | Custom HTTP header which may contain tenant name. Used to define a client by its name.
    SearchRequestDto searchRequestDto = new SearchRequestDto(); // SearchRequestDto | Request that should be populated to configure a search API call, made by the client on behalf of a shopper.
    try {
      SearchResponseDto result = apiInstance.search(xGroupbyCustomerId, searchRequestDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#search");
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
| **searchRequestDto** | [**SearchRequestDto**](SearchRequestDto.md)| Request that should be populated to configure a search API call, made by the client on behalf of a shopper. | |

### Return type

[**SearchResponseDto**](SearchResponseDto.md)

### Authorization

[GroupByIncEmployee](../README.md#GroupByIncEmployee), [ClientKey](../README.md#ClientKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Search was accepted and a normal response could be generated. |  * Content-Type - In responses, a Content-Type header provides the client with the actual content type of the returned content. <br>  * Date - The Date general HTTP header contains the date and time at which the message was originated. <br>  * Content-Length - The Content-Length header indicates the size of the message body, in bytes, sent to the recipient. <br>  * Connection - The Connection general header controls whether the network connection stays open after the current transaction finishes. If the value sent is keep-alive, the connection is persistent and not closed, allowing for subsequent requests to the same server to be done. <br>  |
| **400** | Client has made a bad request, usually a validation constraint has been violated. See the message for further information. |  -  |
| **403** | Client is not authorized to perform the requested operation. |  -  |
| **500** | There was an internal error processing the search request. |  -  |

