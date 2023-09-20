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
import com.groupbyinc.retailapi.model.Facet;
import com.groupbyinc.retailapi.model.SearchRequestDto;
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
 * Request that should be populated to configure a search API call, made by the client on behalf of a shopper. Contains original request and information about facet for which extra keys requested.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-20T17:52:51.787881444-04:00[America/Toronto]")
public class FacetSearchRequestDto {
  public static final String SERIALIZED_NAME_FACET = "facet";
  @SerializedName(SERIALIZED_NAME_FACET)
  private Facet facet;

  public static final String SERIALIZED_NAME_ORIGINAL_REQUEST = "originalRequest";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_REQUEST)
  private SearchRequestDto originalRequest;

  public FacetSearchRequestDto() {
  }

  public FacetSearchRequestDto facet(Facet facet) {
    
    this.facet = facet;
    return this;
  }

   /**
   * Get facet
   * @return facet
  **/
  @javax.annotation.Nonnull
  public Facet getFacet() {
    return facet;
  }


  public void setFacet(Facet facet) {
    this.facet = facet;
  }


  public FacetSearchRequestDto originalRequest(SearchRequestDto originalRequest) {
    
    this.originalRequest = originalRequest;
    return this;
  }

   /**
   * Get originalRequest
   * @return originalRequest
  **/
  @javax.annotation.Nonnull
  public SearchRequestDto getOriginalRequest() {
    return originalRequest;
  }


  public void setOriginalRequest(SearchRequestDto originalRequest) {
    this.originalRequest = originalRequest;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacetSearchRequestDto facetSearchRequestDto = (FacetSearchRequestDto) o;
    return Objects.equals(this.facet, facetSearchRequestDto.facet) &&
        Objects.equals(this.originalRequest, facetSearchRequestDto.originalRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facet, originalRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacetSearchRequestDto {\n");
    sb.append("    facet: ").append(toIndentedString(facet)).append("\n");
    sb.append("    originalRequest: ").append(toIndentedString(originalRequest)).append("\n");
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
    openapiFields.add("facet");
    openapiFields.add("originalRequest");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("facet");
    openapiRequiredFields.add("originalRequest");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FacetSearchRequestDto
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FacetSearchRequestDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FacetSearchRequestDto is not found in the empty JSON string", FacetSearchRequestDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FacetSearchRequestDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FacetSearchRequestDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FacetSearchRequestDto.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `facet`
      Facet.validateJsonElement(jsonObj.get("facet"));
      // validate the required field `originalRequest`
      SearchRequestDto.validateJsonElement(jsonObj.get("originalRequest"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FacetSearchRequestDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FacetSearchRequestDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FacetSearchRequestDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FacetSearchRequestDto.class));

       return (TypeAdapter<T>) new TypeAdapter<FacetSearchRequestDto>() {
           @Override
           public void write(JsonWriter out, FacetSearchRequestDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FacetSearchRequestDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FacetSearchRequestDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FacetSearchRequestDto
  * @throws IOException if the JSON string is invalid with respect to FacetSearchRequestDto
  */
  public static FacetSearchRequestDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FacetSearchRequestDto.class);
  }

 /**
  * Convert an instance of FacetSearchRequestDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
