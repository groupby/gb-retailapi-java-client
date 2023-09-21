

# SelectedRefinementDto

Refinement the shopper has selected for filtering.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**navigationName** | **String** | The name of the navigation the refinement is for. |  |
|**type** | [**NavigationTypeDto**](NavigationTypeDto.md) |  |  |
|**value** | **String** | Value of selected refinement, if type is value. |  [optional] |
|**low** | **Double** | The lowest end or value of the range, if applicable. |  [optional] |
|**high** | **Double** | The highest end or value of the range, if applicable. |  [optional] |
|**source** | **String** | Field which is indicated that it is dynamic navigation. |  [optional] |
|**or** | **Boolean** | Navigation multiselect. Indicate that it is possibly to select more than one navigation value due to search request. |  [optional] |



