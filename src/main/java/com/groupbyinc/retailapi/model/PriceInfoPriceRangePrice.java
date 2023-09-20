/*
 * GroupBy Retail
 * GroupBy Retail API
 *
 * The version of the OpenAPI document: 0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.groupbyinc.retailapi.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.groupbyinc.retailapi.JSON;

/**
 * PriceInfoPriceRangePrice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-20T17:52:51.787881444-04:00[America/Toronto]")
public class PriceInfoPriceRangePrice {
  public static final String SERIALIZED_NAME_MINIMUM = "minimum";
  @SerializedName(SERIALIZED_NAME_MINIMUM)
  private Double minimum;

  public static final String SERIALIZED_NAME_EXCLUSIVE_MINIMUM = "exclusiveMinimum";
  @SerializedName(SERIALIZED_NAME_EXCLUSIVE_MINIMUM)
  private Double exclusiveMinimum;

  public static final String SERIALIZED_NAME_MAXIMUM = "maximum";
  @SerializedName(SERIALIZED_NAME_MAXIMUM)
  private Double maximum;

  public static final String SERIALIZED_NAME_EXCLUSIVE_MAXIMUM = "exclusiveMaximum";
  @SerializedName(SERIALIZED_NAME_EXCLUSIVE_MAXIMUM)
  private Double exclusiveMaximum;

  public PriceInfoPriceRangePrice() {
  }

  public PriceInfoPriceRangePrice minimum(Double minimum) {
    
    this.minimum = minimum;
    return this;
  }

   /**
   * Inclusive lower bound. The lower bound of the interval. If neither of the min fields (minimum or exclusiveMinimum) are set, then the lower bound is negative infinity. This field must be not larger than maximum or exclusiveMaximum.
   * @return minimum
  **/
  @javax.annotation.Nullable
  public Double getMinimum() {
    return minimum;
  }


  public void setMinimum(Double minimum) {
    this.minimum = minimum;
  }


  public PriceInfoPriceRangePrice exclusiveMinimum(Double exclusiveMinimum) {
    
    this.exclusiveMinimum = exclusiveMinimum;
    return this;
  }

   /**
   * Exclusive lower bound. The lower bound of the interval. If neither of the min fields (minimum or exclusiveMinimum) are set, then the lower bound is negative infinity. This field must be not larger than maximum or exclusiveMaximum.
   * @return exclusiveMinimum
  **/
  @javax.annotation.Nullable
  public Double getExclusiveMinimum() {
    return exclusiveMinimum;
  }


  public void setExclusiveMinimum(Double exclusiveMinimum) {
    this.exclusiveMinimum = exclusiveMinimum;
  }


  public PriceInfoPriceRangePrice maximum(Double maximum) {
    
    this.maximum = maximum;
    return this;
  }

   /**
   * Inclusive upper bound. The upper bound of the interval. If neither of the max fields are set, then the upper bound is positive infinity. This field must be not smaller than minimum or exclusiveMinimum.
   * @return maximum
  **/
  @javax.annotation.Nullable
  public Double getMaximum() {
    return maximum;
  }


  public void setMaximum(Double maximum) {
    this.maximum = maximum;
  }


  public PriceInfoPriceRangePrice exclusiveMaximum(Double exclusiveMaximum) {
    
    this.exclusiveMaximum = exclusiveMaximum;
    return this;
  }

   /**
   * Exclusive upper bound. The upper bound of the interval. If neither of the max fields are set, then the upper bound is positive infinity. This field must be not smaller than minimum or exclusiveMinimum.
   * @return exclusiveMaximum
  **/
  @javax.annotation.Nullable
  public Double getExclusiveMaximum() {
    return exclusiveMaximum;
  }


  public void setExclusiveMaximum(Double exclusiveMaximum) {
    this.exclusiveMaximum = exclusiveMaximum;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceInfoPriceRangePrice priceInfoPriceRangePrice = (PriceInfoPriceRangePrice) o;
    return Objects.equals(this.minimum, priceInfoPriceRangePrice.minimum) &&
        Objects.equals(this.exclusiveMinimum, priceInfoPriceRangePrice.exclusiveMinimum) &&
        Objects.equals(this.maximum, priceInfoPriceRangePrice.maximum) &&
        Objects.equals(this.exclusiveMaximum, priceInfoPriceRangePrice.exclusiveMaximum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minimum, exclusiveMinimum, maximum, exclusiveMaximum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceInfoPriceRangePrice {\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
    sb.append("    exclusiveMinimum: ").append(toIndentedString(exclusiveMinimum)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
    sb.append("    exclusiveMaximum: ").append(toIndentedString(exclusiveMaximum)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("minimum");
    openapiFields.add("exclusiveMinimum");
    openapiFields.add("maximum");
    openapiFields.add("exclusiveMaximum");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PriceInfoPriceRangePrice
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PriceInfoPriceRangePrice.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PriceInfoPriceRangePrice is not found in the empty JSON string", PriceInfoPriceRangePrice.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PriceInfoPriceRangePrice.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PriceInfoPriceRangePrice` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PriceInfoPriceRangePrice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PriceInfoPriceRangePrice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PriceInfoPriceRangePrice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PriceInfoPriceRangePrice.class));

       return (TypeAdapter<T>) new TypeAdapter<PriceInfoPriceRangePrice>() {
           @Override
           public void write(JsonWriter out, PriceInfoPriceRangePrice value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PriceInfoPriceRangePrice read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PriceInfoPriceRangePrice given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PriceInfoPriceRangePrice
  * @throws IOException if the JSON string is invalid with respect to PriceInfoPriceRangePrice
  */
  public static PriceInfoPriceRangePrice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PriceInfoPriceRangePrice.class);
  }

 /**
  * Convert an instance of PriceInfoPriceRangePrice to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

