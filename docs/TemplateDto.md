

# TemplateDto

Template to assist the front end application in rendering the UI. Currently only the triggered rule name will be included, or the 'default' template name to indicate no rule was triggered. This is to mainly compatibility with the Searchandiser API and the addition of templates in the future. Template is search agnostic and do not affect search request or result. Templated selected only by triggered rule.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the template. |  [optional] |
|**ruleName** | **String** | Name of the rule which may have triggered. |  [optional] |
|**triggerSet** | [**TemplateDtoTriggerSet**](TemplateDtoTriggerSet.md) |  |  [optional] |
|**zones** | [**List&lt;ZoneDto&gt;**](ZoneDto.md) | Zones for linked template. |  [optional] |



