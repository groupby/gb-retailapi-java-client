

# SearchResults

SAYT response. Contains list of suggestions ad base response information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**stats** | [**SearchResultsStats**](SearchResultsStats.md) |  |  [optional] |
|**searchTerms** | [**List&lt;SearchTerms&gt;**](SearchTerms.md) |  |  |
|**extendedAttributes** | **Map&lt;String, List&lt;String&gt;&gt;** | Map with extended attributes which are returned in autocomplete response.  |  [optional] |
|**attributeResults** | [**Map&lt;String, AttributeSuggestion&gt;**](AttributeSuggestion.md) | SAYT response attributes. Contains list of direct matching attributes. |  [optional] |
|**siteFilter** | **String** | SiteFilter object used with request. |  [optional] |



