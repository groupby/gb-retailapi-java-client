# ProductApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getByProductIds**](ProductApi.md#getByProductIds) | **GET** /api/search/product | Provided product search functionality |


<a id="getByProductIds"></a>
# **getByProductIds**
> ProductDto getByProductIds(collection, productId, xGroupbyCustomerId, variantIds)

Provided product search functionality

Perform a product search against the GroupBy Retail Search API.

### Example
```java
// Import classes:
import com.groupbyinc.retailapi.ApiClient;
import com.groupbyinc.retailapi.ApiException;
import com.groupbyinc.retailapi.Configuration;
import com.groupbyinc.retailapi.auth.*;
import com.groupbyinc.retailapi.models.*;
import com.groupbyinc.retailapi.api.ProductApi;

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

    ProductApi apiInstance = new ProductApi(defaultClient);
    String collection = "collection_example"; // String | Collection name
    String productId = "productId_example"; // String | Product ID which need to be search
    String xGroupbyCustomerId = "xGroupbyCustomerId_example"; // String | Required. This parameter will extract from header X-Groupby-Customer-Id. May contain tenant name. Used to define a                           client by its name.
    List<String> variantIds = Arrays.asList(); // List<String> | Not required. If the product has variant list and the request specifies the variantIds, requested variants will be the                           first in the response.
    try {
      ProductDto result = apiInstance.getByProductIds(collection, productId, xGroupbyCustomerId, variantIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getByProductIds");
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
| **collection** | **String**| Collection name | |
| **productId** | **String**| Product ID which need to be search | |
| **xGroupbyCustomerId** | **String**| Required. This parameter will extract from header X-Groupby-Customer-Id. May contain tenant name. Used to define a                           client by its name. | |
| **variantIds** | [**List&lt;String&gt;**](String.md)| Not required. If the product has variant list and the request specifies the variantIds, requested variants will be the                           first in the response. | [optional] |

### Return type

[**ProductDto**](ProductDto.md)

### Authorization

[GroupByIncEmployee](../README.md#GroupByIncEmployee), [ClientKey](../README.md#ClientKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Product is found. |  * Content-Type - In responses, a Content-Type header provides the client with the actual content type of the returned content. <br>  * Date - The Date general HTTP header contains the date and time at which the message was originated. <br>  * Content-Length - The Content-Length header indicates the size of the message body, in bytes, sent to the recipient. <br>  * Connection - The Connection general header controls whether the network connection stays open after the current transaction finishes. If the value sent is keep-alive, the connection is persistent and not closed, allowing for subsequent requests to the same server to be done. <br>  |
| **400** | Client has made a bad request, usually a validation constraint has been violated. See the message for further information. |  -  |
| **403** | Client is not authorized to perform the requested operation. |  -  |
| **500** | There was an internal error processing the search request. |  -  |

