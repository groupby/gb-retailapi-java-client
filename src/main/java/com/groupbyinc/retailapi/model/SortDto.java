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
import com.groupbyinc.retailapi.model.SortDtoOrderDto;
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
 * Order the returned products should appear on the page.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-20T17:52:51.787881444-04:00[America/Toronto]")
public class SortDto {
  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private String field;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private SortDtoOrderDto order;

  public SortDto() {
  }

  public SortDto field(String field) {
    
    this.field = field;
    return this;
  }

   /**
   * Field the order will be applied to.
   * @return field
  **/
  @javax.annotation.Nonnull
  public String getField() {
    return field;
  }


  public void setField(String field) {
    this.field = field;
  }


  public SortDto order(SortDtoOrderDto order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  public SortDtoOrderDto getOrder() {
    return order;
  }


  public void setOrder(SortDtoOrderDto order) {
    this.order = order;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SortDto sortDto = (SortDto) o;
    return Objects.equals(this.field, sortDto.field) &&
        Objects.equals(this.order, sortDto.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SortDto {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
    openapiFields.add("field");
    openapiFields.add("order");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("field");
    openapiRequiredFields.add("order");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SortDto
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SortDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SortDto is not found in the empty JSON string", SortDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SortDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SortDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SortDto.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("field").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SortDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SortDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SortDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SortDto.class));

       return (TypeAdapter<T>) new TypeAdapter<SortDto>() {
           @Override
           public void write(JsonWriter out, SortDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SortDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SortDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SortDto
  * @throws IOException if the JSON string is invalid with respect to SortDto
  */
  public static SortDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SortDto.class);
  }

 /**
  * Convert an instance of SortDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
