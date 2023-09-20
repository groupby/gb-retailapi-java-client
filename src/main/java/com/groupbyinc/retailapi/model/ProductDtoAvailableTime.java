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
 * ProductDtoAvailableTime
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-20T17:52:51.787881444-04:00[America/Toronto]")
public class ProductDtoAvailableTime {
  public static final String SERIALIZED_NAME_SECONDS = "seconds";
  @SerializedName(SERIALIZED_NAME_SECONDS)
  private Long seconds;

  public static final String SERIALIZED_NAME_NANOS = "nanos";
  @SerializedName(SERIALIZED_NAME_NANOS)
  private Integer nanos;

  public ProductDtoAvailableTime() {
  }

  public ProductDtoAvailableTime seconds(Long seconds) {
    
    this.seconds = seconds;
    return this;
  }

   /**
   * Timestamp seconds.
   * @return seconds
  **/
  @javax.annotation.Nullable
  public Long getSeconds() {
    return seconds;
  }


  public void setSeconds(Long seconds) {
    this.seconds = seconds;
  }


  public ProductDtoAvailableTime nanos(Integer nanos) {
    
    this.nanos = nanos;
    return this;
  }

   /**
   * Timestamp nanos.
   * @return nanos
  **/
  @javax.annotation.Nullable
  public Integer getNanos() {
    return nanos;
  }


  public void setNanos(Integer nanos) {
    this.nanos = nanos;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDtoAvailableTime productDtoAvailableTime = (ProductDtoAvailableTime) o;
    return Objects.equals(this.seconds, productDtoAvailableTime.seconds) &&
        Objects.equals(this.nanos, productDtoAvailableTime.nanos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seconds, nanos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDtoAvailableTime {\n");
    sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
    sb.append("    nanos: ").append(toIndentedString(nanos)).append("\n");
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
    openapiFields.add("seconds");
    openapiFields.add("nanos");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProductDtoAvailableTime
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductDtoAvailableTime.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductDtoAvailableTime is not found in the empty JSON string", ProductDtoAvailableTime.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductDtoAvailableTime.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductDtoAvailableTime` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductDtoAvailableTime.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductDtoAvailableTime' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductDtoAvailableTime> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductDtoAvailableTime.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductDtoAvailableTime>() {
           @Override
           public void write(JsonWriter out, ProductDtoAvailableTime value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductDtoAvailableTime read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductDtoAvailableTime given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductDtoAvailableTime
  * @throws IOException if the JSON string is invalid with respect to ProductDtoAvailableTime
  */
  public static ProductDtoAvailableTime fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductDtoAvailableTime.class);
  }

 /**
  * Convert an instance of ProductDtoAvailableTime to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

