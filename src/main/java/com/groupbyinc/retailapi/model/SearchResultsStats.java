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
 * SearchResultsStats
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-21T09:40:02.999263865-04:00[America/Toronto]")
public class SearchResultsStats {
  public static final String SERIALIZED_NAME_SEARCH_COUNT = "searchCount";
  @SerializedName(SERIALIZED_NAME_SEARCH_COUNT)
  private Integer searchCount;

  public static final String SERIALIZED_NAME_AUTOCOMPLETE_RESPONSE = "autocompleteResponse";
  @SerializedName(SERIALIZED_NAME_AUTOCOMPLETE_RESPONSE)
  private Long autocompleteResponse;

  public static final String SERIALIZED_NAME_EXTENDED_ATTRIBUTES_COUNT = "extendedAttributesCount";
  @SerializedName(SERIALIZED_NAME_EXTENDED_ATTRIBUTES_COUNT)
  private Integer extendedAttributesCount;

  public static final String SERIALIZED_NAME_EXTENDED_ATTRIBUTES_RESPONSE = "extendedAttributesResponse";
  @SerializedName(SERIALIZED_NAME_EXTENDED_ATTRIBUTES_RESPONSE)
  private Long extendedAttributesResponse;

  public SearchResultsStats() {
  }

  public SearchResultsStats searchCount(Integer searchCount) {
    
    this.searchCount = searchCount;
    return this;
  }

   /**
   * Count of suggested sentences in response.
   * @return searchCount
  **/
  @javax.annotation.Nullable
  public Integer getSearchCount() {
    return searchCount;
  }


  public void setSearchCount(Integer searchCount) {
    this.searchCount = searchCount;
  }


  public SearchResultsStats autocompleteResponse(Long autocompleteResponse) {
    
    this.autocompleteResponse = autocompleteResponse;
    return this;
  }

   /**
   * Time in milliseconds taken by autocomplete service to handle request and send response.
   * @return autocompleteResponse
  **/
  @javax.annotation.Nullable
  public Long getAutocompleteResponse() {
    return autocompleteResponse;
  }


  public void setAutocompleteResponse(Long autocompleteResponse) {
    this.autocompleteResponse = autocompleteResponse;
  }


  public SearchResultsStats extendedAttributesCount(Integer extendedAttributesCount) {
    
    this.extendedAttributesCount = extendedAttributesCount;
    return this;
  }

   /**
   * Count of extended attributes in autocomplete response.
   * @return extendedAttributesCount
  **/
  @javax.annotation.Nullable
  public Integer getExtendedAttributesCount() {
    return extendedAttributesCount;
  }


  public void setExtendedAttributesCount(Integer extendedAttributesCount) {
    this.extendedAttributesCount = extendedAttributesCount;
  }


  public SearchResultsStats extendedAttributesResponse(Long extendedAttributesResponse) {
    
    this.extendedAttributesResponse = extendedAttributesResponse;
    return this;
  }

   /**
   * Time in milliseconds taken by application to enrich response with extended attributes.
   * @return extendedAttributesResponse
  **/
  @javax.annotation.Nullable
  public Long getExtendedAttributesResponse() {
    return extendedAttributesResponse;
  }


  public void setExtendedAttributesResponse(Long extendedAttributesResponse) {
    this.extendedAttributesResponse = extendedAttributesResponse;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResultsStats searchResultsStats = (SearchResultsStats) o;
    return Objects.equals(this.searchCount, searchResultsStats.searchCount) &&
        Objects.equals(this.autocompleteResponse, searchResultsStats.autocompleteResponse) &&
        Objects.equals(this.extendedAttributesCount, searchResultsStats.extendedAttributesCount) &&
        Objects.equals(this.extendedAttributesResponse, searchResultsStats.extendedAttributesResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchCount, autocompleteResponse, extendedAttributesCount, extendedAttributesResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResultsStats {\n");
    sb.append("    searchCount: ").append(toIndentedString(searchCount)).append("\n");
    sb.append("    autocompleteResponse: ").append(toIndentedString(autocompleteResponse)).append("\n");
    sb.append("    extendedAttributesCount: ").append(toIndentedString(extendedAttributesCount)).append("\n");
    sb.append("    extendedAttributesResponse: ").append(toIndentedString(extendedAttributesResponse)).append("\n");
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
    openapiFields.add("searchCount");
    openapiFields.add("autocompleteResponse");
    openapiFields.add("extendedAttributesCount");
    openapiFields.add("extendedAttributesResponse");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SearchResultsStats
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SearchResultsStats.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchResultsStats is not found in the empty JSON string", SearchResultsStats.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SearchResultsStats.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchResultsStats` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchResultsStats.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchResultsStats' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchResultsStats> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchResultsStats.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchResultsStats>() {
           @Override
           public void write(JsonWriter out, SearchResultsStats value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchResultsStats read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchResultsStats given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchResultsStats
  * @throws IOException if the JSON string is invalid with respect to SearchResultsStats
  */
  public static SearchResultsStats fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchResultsStats.class);
  }

 /**
  * Convert an instance of SearchResultsStats to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

