# gb-retailapi-client

GroupBy Retail
- API version: 0.0
  - Build date: 2023-09-21T09:51:40.117075497-04:00[America/Toronto]

GroupBy Retail API


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.groupbyinc</groupId>
  <artifactId>gb-retailapi-client</artifactId>
  <version>0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'gb-retailapi-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'gb-retailapi-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.groupbyinc:gb-retailapi-client:0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/gb-retailapi-client-0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AutocompleteApi* | [**autocompletesearch**](docs/AutocompleteApi.md#autocompletesearch) | **GET** /api/request | 
*ProductApi* | [**getByProductIds**](docs/ProductApi.md#getByProductIds) | **GET** /api/search/product | Provided product search functionality
*RecommendationsApiApi* | [**predict**](docs/RecommendationsApiApi.md#predict) | **POST** /api/predict | Provide Recommendations AI functionality.
*RecommendationsApiApi* | [**predictV2**](docs/RecommendationsApiApi.md#predictV2) | **POST** /api/recommendation | Provide Recommendations AI functionality.
*SearchApi* | [**facetSearch**](docs/SearchApi.md#facetSearch) | **POST** /api/search/facet | Provided search functionality
*SearchApi* | [**search**](docs/SearchApi.md#search) | **POST** /api/search | Provided search functionality


## Documentation for Models

 - [AdditionalInfo](docs/AdditionalInfo.md)
 - [AttributeSuggestion](docs/AttributeSuggestion.md)
 - [Audience](docs/Audience.md)
 - [BiasDto](docs/BiasDto.md)
 - [BiasDtoStrengthDto](docs/BiasDtoStrengthDto.md)
 - [BiasingProfileDto](docs/BiasingProfileDto.md)
 - [BoostedProductBucket](docs/BoostedProductBucket.md)
 - [ColorInfo](docs/ColorInfo.md)
 - [CustomParameterDto](docs/CustomParameterDto.md)
 - [CustomParameterTrigger](docs/CustomParameterTrigger.md)
 - [DebugDto](docs/DebugDto.md)
 - [ErrorDto](docs/ErrorDto.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [Experiment](docs/Experiment.md)
 - [ExperimentVariant](docs/ExperimentVariant.md)
 - [Facet](docs/Facet.md)
 - [FacetSearchRequestDto](docs/FacetSearchRequestDto.md)
 - [FacetSearchResponseDto](docs/FacetSearchResponseDto.md)
 - [FieldMask](docs/FieldMask.md)
 - [Filter](docs/Filter.md)
 - [FilterParameter](docs/FilterParameter.md)
 - [FulfillmentInfo](docs/FulfillmentInfo.md)
 - [Identity](docs/Identity.md)
 - [Image](docs/Image.md)
 - [Interval](docs/Interval.md)
 - [Merchandiser](docs/Merchandiser.md)
 - [MessageType](docs/MessageType.md)
 - [Metadata](docs/Metadata.md)
 - [NavigationDto](docs/NavigationDto.md)
 - [NavigationType](docs/NavigationType.md)
 - [NavigationTypeDto](docs/NavigationTypeDto.md)
 - [Order](docs/Order.md)
 - [Overwrites](docs/Overwrites.md)
 - [PageInfoDto](docs/PageInfoDto.md)
 - [PinnedRefinement](docs/PinnedRefinement.md)
 - [PredictResults](docs/PredictResults.md)
 - [PriceInfo](docs/PriceInfo.md)
 - [PriceInfoPriceEffectiveTime](docs/PriceInfoPriceEffectiveTime.md)
 - [PriceInfoPriceExpireTime](docs/PriceInfoPriceExpireTime.md)
 - [PriceInfoPriceRange](docs/PriceInfoPriceRange.md)
 - [PriceInfoPriceRangeOriginalPrice](docs/PriceInfoPriceRangeOriginalPrice.md)
 - [PriceInfoPriceRangePrice](docs/PriceInfoPriceRangePrice.md)
 - [ProductCustomAttribute](docs/ProductCustomAttribute.md)
 - [ProductDto](docs/ProductDto.md)
 - [ProductDtoAudience](docs/ProductDtoAudience.md)
 - [ProductDtoAvailableTime](docs/ProductDtoAvailableTime.md)
 - [ProductDtoColorInfo](docs/ProductDtoColorInfo.md)
 - [ProductDtoPriceInfo](docs/ProductDtoPriceInfo.md)
 - [ProductDtoPublishTime](docs/ProductDtoPublishTime.md)
 - [ProductDtoRating](docs/ProductDtoRating.md)
 - [ProductDtoRetrievableFields](docs/ProductDtoRetrievableFields.md)
 - [Promotion](docs/Promotion.md)
 - [QueryPatternTrigger](docs/QueryPatternTrigger.md)
 - [QueryPatternTriggerType](docs/QueryPatternTriggerType.md)
 - [Range](docs/Range.md)
 - [RangeFilter](docs/RangeFilter.md)
 - [Rating](docs/Rating.md)
 - [RecommendationsErrorResponse](docs/RecommendationsErrorResponse.md)
 - [RecommendationsRequest](docs/RecommendationsRequest.md)
 - [RecordDto](docs/RecordDto.md)
 - [Refinement](docs/Refinement.md)
 - [RefinementDto](docs/RefinementDto.md)
 - [Request](docs/Request.md)
 - [Role](docs/Role.md)
 - [RuleConfiguration](docs/RuleConfiguration.md)
 - [RuleTemplate](docs/RuleTemplate.md)
 - [RuleTemplateSection](docs/RuleTemplateSection.md)
 - [RuleType](docs/RuleType.md)
 - [RuleVariant](docs/RuleVariant.md)
 - [SearchFilter](docs/SearchFilter.md)
 - [SearchMetadataDto](docs/SearchMetadataDto.md)
 - [SearchRequestDto](docs/SearchRequestDto.md)
 - [SearchRequestDtoOverwrites](docs/SearchRequestDtoOverwrites.md)
 - [SearchResponseDto](docs/SearchResponseDto.md)
 - [SearchResults](docs/SearchResults.md)
 - [SearchResultsStats](docs/SearchResultsStats.md)
 - [SearchTerms](docs/SearchTerms.md)
 - [SelectedRefinementDto](docs/SelectedRefinementDto.md)
 - [SelectedRefinementTrigger](docs/SelectedRefinementTrigger.md)
 - [SelectedRefinementTriggerType](docs/SelectedRefinementTriggerType.md)
 - [Sort](docs/Sort.md)
 - [SortDto](docs/SortDto.md)
 - [SortDtoOrderDto](docs/SortDtoOrderDto.md)
 - [SpellCorrectionMode](docs/SpellCorrectionMode.md)
 - [Stats](docs/Stats.md)
 - [TemplateDto](docs/TemplateDto.md)
 - [TemplateDtoTriggerSet](docs/TemplateDtoTriggerSet.md)
 - [Timestamp](docs/Timestamp.md)
 - [TriggerSet](docs/TriggerSet.md)
 - [ValueFilter](docs/ValueFilter.md)
 - [ValueFilterValueFilterType](docs/ValueFilterValueFilterType.md)
 - [ZoneDto](docs/ZoneDto.md)
 - [ZoneDtoType](docs/ZoneDtoType.md)
 - [ZoneType](docs/ZoneType.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="ClientKey"></a>
### ClientKey

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

<a id="GroupByIncEmployee"></a>
### GroupByIncEmployee

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



