

# ProductCustomAttribute

A custom attribute that is not explicitly modeled in product.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**text** | **List&lt;String&gt;** | The textual values of this custom attribute. At most 400 values are allowed. Empty values are not allowed. Length limit of 256 characters. Exactly one of text or numbers should be set. |  [optional] |
|**numbers** | **List&lt;Double&gt;** | The numerical values of this custom attribute. At most 400 values are allowed. Exactly one of text or numbers should be set. |  [optional] |
|**searchable** | **Boolean** | If true, custom attribute values are searchable by text queries in. search. Only set if type text set. |  [optional] |
|**indexable** | **Boolean** | If true, custom attribute values are indexed, so that it can be filtered, faceted or boosted in search. |  [optional] |



