/*
 * GroupBy Retail
 * GroupBy Retail API
 *
 * The version of the OpenAPI document: 0.0.0
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * ProductDtoRating
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-28T19:17:28.544199255-04:00[America/Toronto]")
public class ProductDtoRating {
  public static final String SERIALIZED_NAME_RATING_COUNT = "ratingCount";
  @SerializedName(SERIALIZED_NAME_RATING_COUNT)
  private Integer ratingCount;

  public static final String SERIALIZED_NAME_AVERAGE_RATING = "averageRating";
  @SerializedName(SERIALIZED_NAME_AVERAGE_RATING)
  private Float averageRating;

  public static final String SERIALIZED_NAME_RATING_HISTOGRAM = "ratingHistogram";
  @SerializedName(SERIALIZED_NAME_RATING_HISTOGRAM)
  private List<Integer> ratingHistogram;

  public ProductDtoRating() {
  }

  public ProductDtoRating ratingCount(Integer ratingCount) {
    
    this.ratingCount = ratingCount;
    return this;
  }

   /**
   * The total number of ratings. This value is independent of the value of histogram.This value must be nonnegative.
   * @return ratingCount
  **/
  @javax.annotation.Nullable
  public Integer getRatingCount() {
    return ratingCount;
  }


  public void setRatingCount(Integer ratingCount) {
    this.ratingCount = ratingCount;
  }


  public ProductDtoRating averageRating(Float averageRating) {
    
    this.averageRating = averageRating;
    return this;
  }

   /**
   * The average rating of the product. The rating is scaled at 1-5.
   * @return averageRating
  **/
  @javax.annotation.Nullable
  public Float getAverageRating() {
    return averageRating;
  }


  public void setAverageRating(Float averageRating) {
    this.averageRating = averageRating;
  }


  public ProductDtoRating ratingHistogram(List<Integer> ratingHistogram) {
    
    this.ratingHistogram = ratingHistogram;
    return this;
  }

  public ProductDtoRating addRatingHistogramItem(Integer ratingHistogramItem) {
    if (this.ratingHistogram == null) {
      this.ratingHistogram = new ArrayList<>();
    }
    this.ratingHistogram.add(ratingHistogramItem);
    return this;
  }

   /**
   * List of rating counts per rating value (index &#x3D; rating - 1). The list is empty if there is no rating. If the list is non-empty, its size is always 5. For example, [41, 14, 13, 47, 303]. It means that the product got 41 ratings with 1 star, 14 ratings with 2 star, and so on.
   * @return ratingHistogram
  **/
  @javax.annotation.Nullable
  public List<Integer> getRatingHistogram() {
    return ratingHistogram;
  }


  public void setRatingHistogram(List<Integer> ratingHistogram) {
    this.ratingHistogram = ratingHistogram;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDtoRating productDtoRating = (ProductDtoRating) o;
    return Objects.equals(this.ratingCount, productDtoRating.ratingCount) &&
        Objects.equals(this.averageRating, productDtoRating.averageRating) &&
        Objects.equals(this.ratingHistogram, productDtoRating.ratingHistogram);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratingCount, averageRating, ratingHistogram);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDtoRating {\n");
    sb.append("    ratingCount: ").append(toIndentedString(ratingCount)).append("\n");
    sb.append("    averageRating: ").append(toIndentedString(averageRating)).append("\n");
    sb.append("    ratingHistogram: ").append(toIndentedString(ratingHistogram)).append("\n");
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
    openapiFields.add("ratingCount");
    openapiFields.add("averageRating");
    openapiFields.add("ratingHistogram");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProductDtoRating
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductDtoRating.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductDtoRating is not found in the empty JSON string", ProductDtoRating.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductDtoRating.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductDtoRating` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("ratingHistogram") != null && !jsonObj.get("ratingHistogram").isJsonNull() && !jsonObj.get("ratingHistogram").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ratingHistogram` to be an array in the JSON string but got `%s`", jsonObj.get("ratingHistogram").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductDtoRating.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductDtoRating' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductDtoRating> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductDtoRating.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductDtoRating>() {
           @Override
           public void write(JsonWriter out, ProductDtoRating value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductDtoRating read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductDtoRating given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductDtoRating
  * @throws IOException if the JSON string is invalid with respect to ProductDtoRating
  */
  public static ProductDtoRating fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductDtoRating.class);
  }

 /**
  * Convert an instance of ProductDtoRating to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

