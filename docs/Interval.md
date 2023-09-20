

# Interval

A floating point interval.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**minimum** | **Double** | Inclusive lower bound. The lower bound of the interval. If neither of the min fields (minimum or exclusiveMinimum) are set, then the lower bound is negative infinity. This field must be not larger than maximum or exclusiveMaximum. |  [optional] |
|**exclusiveMinimum** | **Double** | Exclusive lower bound. The lower bound of the interval. If neither of the min fields (minimum or exclusiveMinimum) are set, then the lower bound is negative infinity. This field must be not larger than maximum or exclusiveMaximum. |  [optional] |
|**maximum** | **Double** | Inclusive upper bound. The upper bound of the interval. If neither of the max fields are set, then the upper bound is positive infinity. This field must be not smaller than minimum or exclusiveMinimum. |  [optional] |
|**exclusiveMaximum** | **Double** | Exclusive upper bound. The upper bound of the interval. If neither of the max fields are set, then the upper bound is positive infinity. This field must be not smaller than minimum or exclusiveMinimum. |  [optional] |



