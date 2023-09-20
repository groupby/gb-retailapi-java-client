

# ProductDto

Product representation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Relative path to product in Google Retail system. |  [optional] |
|**id** | **String** | Product id in Google Retail system. |  [optional] |
|**type** | **String** | Product type. Possible values: PRIMARY, VARIANT. If the product has variant list and the request specifies the variantIds, requested variants will be the first in the response. |  [optional] |
|**primaryProductId** | **String** | Product ID that is primary in relation to the current one |  [optional] |
|**collectionMemberIds** | **List&lt;String&gt;** | The of the collection members when product type is COLLECTION |  [optional] |
|**gtin** | **String** | Global Trade Item Number can be used by a company to uniquely identify all of its trade items.GTIN defines trade items as products or services that are priced, ordered or invoiced at any point in the supply chain. |  [optional] |
|**categories** | **List&lt;String&gt;** | Product categories (array). |  [optional] |
|**title** | **String** | Product title. |  [optional] |
|**brands** | **List&lt;String&gt;** | Product brands. |  [optional] |
|**description** | **String** | Product description. |  [optional] |
|**languageCode** | **String** | Language of the title/description and other string attributes. Use language tags defined by [BCP 47][https://www.rfc-editor.org/rfc/bcp/bcp47.txt]. For product search this field is in use. It defaults to &#39;en-US&#39; if unset. |  [optional] |
|**attributes** | [**Map&lt;String, ProductCustomAttribute&gt;**](ProductCustomAttribute.md) | Highly encouraged. Extra product attributes to be included. For example, for products, this could include the store name, vendor, style, color, etc. These are very strong signals for recommendation model, thus we highly recommend providing the attributes here. Features that can take on one of a limited number of possible values. Two types of features can be set are: Textual features. some examples would be the brand/maker of a product, or country of a customer. Numerical features. Some examples would be the height/weight of a product, or age of a customer.  Max entries count: 200. Length limit of 128 characters. |  [optional] |
|**tags** | **List&lt;String&gt;** | Product tags (array). |  [optional] |
|**priceInfo** | [**ProductDtoPriceInfo**](ProductDtoPriceInfo.md) |  |  [optional] |
|**rating** | [**ProductDtoRating**](ProductDtoRating.md) |  |  [optional] |
|**availableTime** | [**ProductDtoAvailableTime**](ProductDtoAvailableTime.md) |  |  [optional] |
|**availability** | **String** | The online availability of the product. Default to IN_STOCK |  [optional] |
|**availableQuantity** | **Integer** | The available quantity of the item. |  [optional] |
|**fulfillmentInfos** | [**List&lt;FulfillmentInfo&gt;**](FulfillmentInfo.md) | Fulfillment information, such as the store IDs for in-store pickup or region IDs for different shipping methods. |  [optional] |
|**uri** | **String** | Link to the appropriate product. |  [optional] |
|**images** | [**List&lt;Image&gt;**](Image.md) | Product Image. |  [optional] |
|**audience** | [**ProductDtoAudience**](ProductDtoAudience.md) |  |  [optional] |
|**colorInfo** | [**ProductDtoColorInfo**](ProductDtoColorInfo.md) |  |  [optional] |
|**sizes** | **List&lt;String&gt;** | Product sizes (array). |  [optional] |
|**materials** | **List&lt;String&gt;** | The material of the product. For example, &#39;leather&#39;, &#39;wooden&#39;. A maximum of 20 values are allowed. Length limit of 128 characters |  [optional] |
|**patterns** | **List&lt;String&gt;** | The pattern or graphic print of the product. For example, &#39;striped&#39;, &#39;polka dot&#39;, &#39;paisley&#39;. A maximum of 20 values are allowed per product. Length limit of 128 characters. |  [optional] |
|**conditions** | **List&lt;String&gt;** | The condition of the product. Strongly encouraged to use the standardvalues: &#39;new&#39;, &#39;refurbished&#39;, &#39;used&#39;. A maximum of 5 values are allowed per product. Length limit of 128 characters. |  [optional] |
|**publishTime** | [**ProductDtoPublishTime**](ProductDtoPublishTime.md) |  |  [optional] |
|**retrievableFields** | [**ProductDtoRetrievableFields**](ProductDtoRetrievableFields.md) |  |  [optional] |
|**promotions** | [**List&lt;Promotion&gt;**](Promotion.md) | The promotions applied to the product. A maximum of 10 values are allowed per product. |  [optional] |
|**variants** | [**List&lt;ProductDto&gt;**](ProductDto.md) | If the product has variant list and the request specifies the variantIds, requested variants will be the first in the response. |  [optional] |



