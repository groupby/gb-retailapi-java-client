

# RecommendationsRequest

Object to wrap all recommendation request configs.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**collection** | **String** |  |  |
|**visitorId** | **String** |  |  [optional] |
|**limit** | **String** |  |  [optional] |
|**pageSize** | **String** |  |  [optional] |
|**eventType** | **String** |  |  [optional] |
|**loginId** | **String** |  |  [optional] |
|**productID** | **List&lt;String&gt;** |  |  [optional] |
|**fields** | **List&lt;String&gt;** |  |  [optional] |
|**filters** | [**List&lt;Filter&gt;**](Filter.md) |  |  [optional] |
|**rawFilter** | **String** |  |  [optional] |
|**placement** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**strictFiltering** | **Boolean** | The default is true. If strictFiltering true only products that are within the scope of the filter specified. If false, relax the filtering so that the response may contain other products that are outside the scope of the filtering. |  [optional] |



