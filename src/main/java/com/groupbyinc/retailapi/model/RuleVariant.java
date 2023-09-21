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
import com.groupbyinc.retailapi.model.BoostedProductBucket;
import com.groupbyinc.retailapi.model.PinnedRefinement;
import com.groupbyinc.retailapi.model.RangeFilter;
import com.groupbyinc.retailapi.model.RuleTemplate;
import com.groupbyinc.retailapi.model.SearchFilter;
import com.groupbyinc.retailapi.model.Sort;
import com.groupbyinc.retailapi.model.ValueFilter;
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
 * RuleVariant
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-21T09:40:02.999263865-04:00[America/Toronto]")
public class RuleVariant {
  public static final String SERIALIZED_NAME_BIASING_PROFILE_NAME = "biasingProfileName";
  @SerializedName(SERIALIZED_NAME_BIASING_PROFILE_NAME)
  private String biasingProfileName;

  public static final String SERIALIZED_NAME_INCLUDED_NAVIGATIONS = "includedNavigations";
  @SerializedName(SERIALIZED_NAME_INCLUDED_NAVIGATIONS)
  private List<String> includedNavigations = new ArrayList<>();

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private RuleTemplate template;

  public static final String SERIALIZED_NAME_BOOSTED_PRODUCT_BUCKETS = "boostedProductBuckets";
  @SerializedName(SERIALIZED_NAME_BOOSTED_PRODUCT_BUCKETS)
  private List<BoostedProductBucket> boostedProductBuckets = new ArrayList<>();

  public static final String SERIALIZED_NAME_PINNED_REFINEMENTS = "pinnedRefinements";
  @SerializedName(SERIALIZED_NAME_PINNED_REFINEMENTS)
  private List<PinnedRefinement> pinnedRefinements = new ArrayList<>();

  public static final String SERIALIZED_NAME_SORT = "sort";
  @SerializedName(SERIALIZED_NAME_SORT)
  private Sort sort;

  public static final String SERIALIZED_NAME_VALUE_FILTERS = "valueFilters";
  @SerializedName(SERIALIZED_NAME_VALUE_FILTERS)
  private List<ValueFilter> valueFilters = new ArrayList<>();

  public static final String SERIALIZED_NAME_SEARCH_FILTERS = "searchFilters";
  @SerializedName(SERIALIZED_NAME_SEARCH_FILTERS)
  private List<SearchFilter> searchFilters = new ArrayList<>();

  public static final String SERIALIZED_NAME_RANGE_FILTERS = "rangeFilters";
  @SerializedName(SERIALIZED_NAME_RANGE_FILTERS)
  private List<RangeFilter> rangeFilters = new ArrayList<>();

  public RuleVariant() {
  }

  public RuleVariant biasingProfileName(String biasingProfileName) {
    
    this.biasingProfileName = biasingProfileName;
    return this;
  }

   /**
   * Get biasingProfileName
   * @return biasingProfileName
  **/
  @javax.annotation.Nonnull
  public String getBiasingProfileName() {
    return biasingProfileName;
  }


  public void setBiasingProfileName(String biasingProfileName) {
    this.biasingProfileName = biasingProfileName;
  }


  public RuleVariant includedNavigations(List<String> includedNavigations) {
    
    this.includedNavigations = includedNavigations;
    return this;
  }

  public RuleVariant addIncludedNavigationsItem(String includedNavigationsItem) {
    if (this.includedNavigations == null) {
      this.includedNavigations = new ArrayList<>();
    }
    this.includedNavigations.add(includedNavigationsItem);
    return this;
  }

   /**
   * Get includedNavigations
   * @return includedNavigations
  **/
  @javax.annotation.Nonnull
  public List<String> getIncludedNavigations() {
    return includedNavigations;
  }


  public void setIncludedNavigations(List<String> includedNavigations) {
    this.includedNavigations = includedNavigations;
  }


  public RuleVariant template(RuleTemplate template) {
    
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @javax.annotation.Nonnull
  public RuleTemplate getTemplate() {
    return template;
  }


  public void setTemplate(RuleTemplate template) {
    this.template = template;
  }


  public RuleVariant boostedProductBuckets(List<BoostedProductBucket> boostedProductBuckets) {
    
    this.boostedProductBuckets = boostedProductBuckets;
    return this;
  }

  public RuleVariant addBoostedProductBucketsItem(BoostedProductBucket boostedProductBucketsItem) {
    if (this.boostedProductBuckets == null) {
      this.boostedProductBuckets = new ArrayList<>();
    }
    this.boostedProductBuckets.add(boostedProductBucketsItem);
    return this;
  }

   /**
   * Get boostedProductBuckets
   * @return boostedProductBuckets
  **/
  @javax.annotation.Nonnull
  public List<BoostedProductBucket> getBoostedProductBuckets() {
    return boostedProductBuckets;
  }


  public void setBoostedProductBuckets(List<BoostedProductBucket> boostedProductBuckets) {
    this.boostedProductBuckets = boostedProductBuckets;
  }


  public RuleVariant pinnedRefinements(List<PinnedRefinement> pinnedRefinements) {
    
    this.pinnedRefinements = pinnedRefinements;
    return this;
  }

  public RuleVariant addPinnedRefinementsItem(PinnedRefinement pinnedRefinementsItem) {
    if (this.pinnedRefinements == null) {
      this.pinnedRefinements = new ArrayList<>();
    }
    this.pinnedRefinements.add(pinnedRefinementsItem);
    return this;
  }

   /**
   * Get pinnedRefinements
   * @return pinnedRefinements
  **/
  @javax.annotation.Nonnull
  public List<PinnedRefinement> getPinnedRefinements() {
    return pinnedRefinements;
  }


  public void setPinnedRefinements(List<PinnedRefinement> pinnedRefinements) {
    this.pinnedRefinements = pinnedRefinements;
  }


  public RuleVariant sort(Sort sort) {
    
    this.sort = sort;
    return this;
  }

   /**
   * Get sort
   * @return sort
  **/
  @javax.annotation.Nonnull
  public Sort getSort() {
    return sort;
  }


  public void setSort(Sort sort) {
    this.sort = sort;
  }


  public RuleVariant valueFilters(List<ValueFilter> valueFilters) {
    
    this.valueFilters = valueFilters;
    return this;
  }

  public RuleVariant addValueFiltersItem(ValueFilter valueFiltersItem) {
    if (this.valueFilters == null) {
      this.valueFilters = new ArrayList<>();
    }
    this.valueFilters.add(valueFiltersItem);
    return this;
  }

   /**
   * Get valueFilters
   * @return valueFilters
  **/
  @javax.annotation.Nonnull
  public List<ValueFilter> getValueFilters() {
    return valueFilters;
  }


  public void setValueFilters(List<ValueFilter> valueFilters) {
    this.valueFilters = valueFilters;
  }


  public RuleVariant searchFilters(List<SearchFilter> searchFilters) {
    
    this.searchFilters = searchFilters;
    return this;
  }

  public RuleVariant addSearchFiltersItem(SearchFilter searchFiltersItem) {
    if (this.searchFilters == null) {
      this.searchFilters = new ArrayList<>();
    }
    this.searchFilters.add(searchFiltersItem);
    return this;
  }

   /**
   * Get searchFilters
   * @return searchFilters
  **/
  @javax.annotation.Nonnull
  public List<SearchFilter> getSearchFilters() {
    return searchFilters;
  }


  public void setSearchFilters(List<SearchFilter> searchFilters) {
    this.searchFilters = searchFilters;
  }


  public RuleVariant rangeFilters(List<RangeFilter> rangeFilters) {
    
    this.rangeFilters = rangeFilters;
    return this;
  }

  public RuleVariant addRangeFiltersItem(RangeFilter rangeFiltersItem) {
    if (this.rangeFilters == null) {
      this.rangeFilters = new ArrayList<>();
    }
    this.rangeFilters.add(rangeFiltersItem);
    return this;
  }

   /**
   * Get rangeFilters
   * @return rangeFilters
  **/
  @javax.annotation.Nonnull
  public List<RangeFilter> getRangeFilters() {
    return rangeFilters;
  }


  public void setRangeFilters(List<RangeFilter> rangeFilters) {
    this.rangeFilters = rangeFilters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleVariant ruleVariant = (RuleVariant) o;
    return Objects.equals(this.biasingProfileName, ruleVariant.biasingProfileName) &&
        Objects.equals(this.includedNavigations, ruleVariant.includedNavigations) &&
        Objects.equals(this.template, ruleVariant.template) &&
        Objects.equals(this.boostedProductBuckets, ruleVariant.boostedProductBuckets) &&
        Objects.equals(this.pinnedRefinements, ruleVariant.pinnedRefinements) &&
        Objects.equals(this.sort, ruleVariant.sort) &&
        Objects.equals(this.valueFilters, ruleVariant.valueFilters) &&
        Objects.equals(this.searchFilters, ruleVariant.searchFilters) &&
        Objects.equals(this.rangeFilters, ruleVariant.rangeFilters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(biasingProfileName, includedNavigations, template, boostedProductBuckets, pinnedRefinements, sort, valueFilters, searchFilters, rangeFilters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleVariant {\n");
    sb.append("    biasingProfileName: ").append(toIndentedString(biasingProfileName)).append("\n");
    sb.append("    includedNavigations: ").append(toIndentedString(includedNavigations)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    boostedProductBuckets: ").append(toIndentedString(boostedProductBuckets)).append("\n");
    sb.append("    pinnedRefinements: ").append(toIndentedString(pinnedRefinements)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    valueFilters: ").append(toIndentedString(valueFilters)).append("\n");
    sb.append("    searchFilters: ").append(toIndentedString(searchFilters)).append("\n");
    sb.append("    rangeFilters: ").append(toIndentedString(rangeFilters)).append("\n");
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
    openapiFields.add("biasingProfileName");
    openapiFields.add("includedNavigations");
    openapiFields.add("template");
    openapiFields.add("boostedProductBuckets");
    openapiFields.add("pinnedRefinements");
    openapiFields.add("sort");
    openapiFields.add("valueFilters");
    openapiFields.add("searchFilters");
    openapiFields.add("rangeFilters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("biasingProfileName");
    openapiRequiredFields.add("includedNavigations");
    openapiRequiredFields.add("template");
    openapiRequiredFields.add("boostedProductBuckets");
    openapiRequiredFields.add("pinnedRefinements");
    openapiRequiredFields.add("sort");
    openapiRequiredFields.add("valueFilters");
    openapiRequiredFields.add("searchFilters");
    openapiRequiredFields.add("rangeFilters");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RuleVariant
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RuleVariant.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RuleVariant is not found in the empty JSON string", RuleVariant.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RuleVariant.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RuleVariant` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RuleVariant.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("biasingProfileName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biasingProfileName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biasingProfileName").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("includedNavigations") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("includedNavigations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `includedNavigations` to be an array in the JSON string but got `%s`", jsonObj.get("includedNavigations").toString()));
      }
      // validate the required field `template`
      RuleTemplate.validateJsonElement(jsonObj.get("template"));
      // ensure the json data is an array
      if (!jsonObj.get("boostedProductBuckets").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `boostedProductBuckets` to be an array in the JSON string but got `%s`", jsonObj.get("boostedProductBuckets").toString()));
      }

      JsonArray jsonArrayboostedProductBuckets = jsonObj.getAsJsonArray("boostedProductBuckets");
      // validate the required field `boostedProductBuckets` (array)
      for (int i = 0; i < jsonArrayboostedProductBuckets.size(); i++) {
        BoostedProductBucket.validateJsonElement(jsonArrayboostedProductBuckets.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("pinnedRefinements").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `pinnedRefinements` to be an array in the JSON string but got `%s`", jsonObj.get("pinnedRefinements").toString()));
      }

      JsonArray jsonArraypinnedRefinements = jsonObj.getAsJsonArray("pinnedRefinements");
      // validate the required field `pinnedRefinements` (array)
      for (int i = 0; i < jsonArraypinnedRefinements.size(); i++) {
        PinnedRefinement.validateJsonElement(jsonArraypinnedRefinements.get(i));
      };
      // validate the required field `sort`
      Sort.validateJsonElement(jsonObj.get("sort"));
      // ensure the json data is an array
      if (!jsonObj.get("valueFilters").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `valueFilters` to be an array in the JSON string but got `%s`", jsonObj.get("valueFilters").toString()));
      }

      JsonArray jsonArrayvalueFilters = jsonObj.getAsJsonArray("valueFilters");
      // validate the required field `valueFilters` (array)
      for (int i = 0; i < jsonArrayvalueFilters.size(); i++) {
        ValueFilter.validateJsonElement(jsonArrayvalueFilters.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("searchFilters").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `searchFilters` to be an array in the JSON string but got `%s`", jsonObj.get("searchFilters").toString()));
      }

      JsonArray jsonArraysearchFilters = jsonObj.getAsJsonArray("searchFilters");
      // validate the required field `searchFilters` (array)
      for (int i = 0; i < jsonArraysearchFilters.size(); i++) {
        SearchFilter.validateJsonElement(jsonArraysearchFilters.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("rangeFilters").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `rangeFilters` to be an array in the JSON string but got `%s`", jsonObj.get("rangeFilters").toString()));
      }

      JsonArray jsonArrayrangeFilters = jsonObj.getAsJsonArray("rangeFilters");
      // validate the required field `rangeFilters` (array)
      for (int i = 0; i < jsonArrayrangeFilters.size(); i++) {
        RangeFilter.validateJsonElement(jsonArrayrangeFilters.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RuleVariant.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RuleVariant' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RuleVariant> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RuleVariant.class));

       return (TypeAdapter<T>) new TypeAdapter<RuleVariant>() {
           @Override
           public void write(JsonWriter out, RuleVariant value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RuleVariant read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RuleVariant given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RuleVariant
  * @throws IOException if the JSON string is invalid with respect to RuleVariant
  */
  public static RuleVariant fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RuleVariant.class);
  }

 /**
  * Convert an instance of RuleVariant to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

