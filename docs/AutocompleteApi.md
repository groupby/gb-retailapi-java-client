# AutocompleteApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**autocompletesearch**](AutocompleteApi.md#autocompletesearch) | **GET** /api/request |  |


<a id="autocompletesearch"></a>
# **autocompletesearch**
> SearchResults autocompletesearch(xGroupbyCustomerId, identity, merchandiser, request)



A simple request used to get completes the specified prefix with keyword suggestions.

### Example
```java
// Import classes:
import com.groupbyinc.retailapi.ApiClient;
import com.groupbyinc.retailapi.ApiException;
import com.groupbyinc.retailapi.Configuration;
import com.groupbyinc.retailapi.auth.*;
import com.groupbyinc.retailapi.models.*;
import com.groupbyinc.retailapi.api.AutocompleteApi;

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

    AutocompleteApi apiInstance = new AutocompleteApi(defaultClient);
    String xGroupbyCustomerId = "xGroupbyCustomerId_example"; // String | Header on incoming HTTP requests that is populated by the API gateway and indicates the customer ID.
    Identity identity = new Identity(); // Identity | 
    Merchandiser merchandiser = new Merchandiser(); // Merchandiser | 
    Request request = new Request(); // Request | Object which is represent autocomplete request and encapsulate all passed parameters. 
    try {
      SearchResults result = apiInstance.autocompletesearch(xGroupbyCustomerId, identity, merchandiser, request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutocompleteApi#autocompletesearch");
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
| **xGroupbyCustomerId** | **String**| Header on incoming HTTP requests that is populated by the API gateway and indicates the customer ID. | |
| **identity** | [**Identity**](.md)|  | |
| **merchandiser** | [**Merchandiser**](.md)|  | |
| **request** | [**Request**](.md)| Object which is represent autocomplete request and encapsulate all passed parameters.  | [optional] |

### Return type

[**SearchResults**](SearchResults.md)

### Authorization

[GroupByIncEmployee](../README.md#GroupByIncEmployee), [ClientKey](../README.md#ClientKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success response, returns result of operation. It is can be either empty body, object model or list of models. |  * Content-Type - In responses, a Content-Type header provides the client with the actual content type of the returned content. <br>  * Date - The Date general HTTP header contains the date and time at which the message was originated. <br>  * Content-Length - The Content-Length header indicates the size of the message body, in bytes, sent to the recipient. <br>  * Connection - The Connection general header controls whether the network connection stays open after the current transaction finishes. If the value sent is keep-alive, the connection is persistent and not closed, allowing for subsequent requests to the same server to be done. <br>  * Content-Encoding - The Content-Encoding representation header lists any encodings that have been applied to the representation (message payload), and in what order. This lets the recipient know how to decode the representation in order to obtain the original payload format. Content encoding is mainly used to compress the message data without losing information about the origin media type. <br>  |
| **400** | Client has made a bad request, usually a validation constraint has been violated. See the message for further information. |  * Content-Type - In responses, a Content-Type header provides the client with the actual content type of the returned content. <br>  * Date - The Date general HTTP header contains the date and time at which the message was originated. <br>  * Content-Length - The Content-Length header indicates the size of the message body, in bytes, sent to the recipient. <br>  * Connection - The Connection general header controls whether the network connection stays open after the current transaction finishes. If the value sent is keep-alive, the connection is persistent and not closed, allowing for subsequent requests to the same server to be done. <br>  |

