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
import com.groupbyinc.retailapi.model.AttributeSuggestion;
import com.groupbyinc.retailapi.model.SearchResultsStats;
import com.groupbyinc.retailapi.model.SearchTerms;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * SAYT response. Contains list of suggestions ad base response information.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-21T09:40:02.999263865-04:00[America/Toronto]")
public class SearchResults {
  public static final String SERIALIZED_NAME_STATS = "stats";
  @SerializedName(SERIALIZED_NAME_STATS)
  private SearchResultsStats stats;

  public static final String SERIALIZED_NAME_SEARCH_TERMS = "searchTerms";
  @SerializedName(SERIALIZED_NAME_SEARCH_TERMS)
  private List<SearchTerms> searchTerms = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXTENDED_ATTRIBUTES = "extendedAttributes";
  @SerializedName(SERIALIZED_NAME_EXTENDED_ATTRIBUTES)
  private Map<String, List<String>> extendedAttributes = new HashMap<>();

  public static final String SERIALIZED_NAME_ATTRIBUTE_RESULTS = "attributeResults";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_RESULTS)
  private Map<String, AttributeSuggestion> attributeResults = new HashMap<>();

  public static final String SERIALIZED_NAME_SITE_FILTER = "siteFilter";
  @SerializedName(SERIALIZED_NAME_SITE_FILTER)
  private String siteFilter;

  public SearchResults() {
  }

  public SearchResults stats(SearchResultsStats stats) {
    
    this.stats = stats;
    return this;
  }

   /**
   * Get stats
   * @return stats
  **/
  @javax.annotation.Nullable
  public SearchResultsStats getStats() {
    return stats;
  }


  public void setStats(SearchResultsStats stats) {
    this.stats = stats;
  }


  public SearchResults searchTerms(List<SearchTerms> searchTerms) {
    
    this.searchTerms = searchTerms;
    return this;
  }

  public SearchResults addSearchTermsItem(SearchTerms searchTermsItem) {
    if (this.searchTerms == null) {
      this.searchTerms = new ArrayList<>();
    }
    this.searchTerms.add(searchTermsItem);
    return this;
  }

   /**
   * Get searchTerms
   * @return searchTerms
  **/
  @javax.annotation.Nonnull
  public List<SearchTerms> getSearchTerms() {
    return searchTerms;
  }


  public void setSearchTerms(List<SearchTerms> searchTerms) {
    this.searchTerms = searchTerms;
  }


  public SearchResults extendedAttributes(Map<String, List<String>> extendedAttributes) {
    
    this.extendedAttributes = extendedAttributes;
    return this;
  }

  public SearchResults putExtendedAttributesItem(String key, List<String> extendedAttributesItem) {
    if (this.extendedAttributes == null) {
      this.extendedAttributes = new HashMap<>();
    }
    this.extendedAttributes.put(key, extendedAttributesItem);
    return this;
  }

   /**
   * Map with extended attributes which are returned in autocomplete response. 
   * @return extendedAttributes
  **/
  @javax.annotation.Nullable
  public Map<String, List<String>> getExtendedAttributes() {
    return extendedAttributes;
  }


  public void setExtendedAttributes(Map<String, List<String>> extendedAttributes) {
    this.extendedAttributes = extendedAttributes;
  }


  public SearchResults attributeResults(Map<String, AttributeSuggestion> attributeResults) {
    
    this.attributeResults = attributeResults;
    return this;
  }

  public SearchResults putAttributeResultsItem(String key, AttributeSuggestion attributeResultsItem) {
    if (this.attributeResults == null) {
      this.attributeResults = new HashMap<>();
    }
    this.attributeResults.put(key, attributeResultsItem);
    return this;
  }

   /**
   * SAYT response attributes. Contains list of direct matching attributes.
   * @return attributeResults
  **/
  @javax.annotation.Nullable
  public Map<String, AttributeSuggestion> getAttributeResults() {
    return attributeResults;
  }


  public void setAttributeResults(Map<String, AttributeSuggestion> attributeResults) {
    this.attributeResults = attributeResults;
  }


  public SearchResults siteFilter(String siteFilter) {
    
    this.siteFilter = siteFilter;
    return this;
  }

   /**
   * SiteFilter object used with request.
   * @return siteFilter
  **/
  @javax.annotation.Nullable
  public String getSiteFilter() {
    return siteFilter;
  }


  public void setSiteFilter(String siteFilter) {
    this.siteFilter = siteFilter;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResults searchResults = (SearchResults) o;
    return Objects.equals(this.stats, searchResults.stats) &&
        Objects.equals(this.searchTerms, searchResults.searchTerms) &&
        Objects.equals(this.extendedAttributes, searchResults.extendedAttributes) &&
        Objects.equals(this.attributeResults, searchResults.attributeResults) &&
        Objects.equals(this.siteFilter, searchResults.siteFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stats, searchTerms, extendedAttributes, attributeResults, siteFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResults {\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
    sb.append("    searchTerms: ").append(toIndentedString(searchTerms)).append("\n");
    sb.append("    extendedAttributes: ").append(toIndentedString(extendedAttributes)).append("\n");
    sb.append("    attributeResults: ").append(toIndentedString(attributeResults)).append("\n");
    sb.append("    siteFilter: ").append(toIndentedString(siteFilter)).append("\n");
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
    openapiFields.add("stats");
    openapiFields.add("searchTerms");
    openapiFields.add("extendedAttributes");
    openapiFields.add("attributeResults");
    openapiFields.add("siteFilter");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("searchTerms");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SearchResults
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SearchResults.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchResults is not found in the empty JSON string", SearchResults.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SearchResults.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchResults` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SearchResults.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `stats`
      if (jsonObj.get("stats") != null && !jsonObj.get("stats").isJsonNull()) {
        SearchResultsStats.validateJsonElement(jsonObj.get("stats"));
      }
      // ensure the json data is an array
      if (!jsonObj.get("searchTerms").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `searchTerms` to be an array in the JSON string but got `%s`", jsonObj.get("searchTerms").toString()));
      }

      JsonArray jsonArraysearchTerms = jsonObj.getAsJsonArray("searchTerms");
      // validate the required field `searchTerms` (array)
      for (int i = 0; i < jsonArraysearchTerms.size(); i++) {
        SearchTerms.validateJsonElement(jsonArraysearchTerms.get(i));
      };
      if ((jsonObj.get("siteFilter") != null && !jsonObj.get("siteFilter").isJsonNull()) && !jsonObj.get("siteFilter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `siteFilter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("siteFilter").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchResults.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchResults' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchResults> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchResults.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchResults>() {
           @Override
           public void write(JsonWriter out, SearchResults value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchResults read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchResults given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchResults
  * @throws IOException if the JSON string is invalid with respect to SearchResults
  */
  public static SearchResults fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchResults.class);
  }

 /**
  * Convert an instance of SearchResults to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

