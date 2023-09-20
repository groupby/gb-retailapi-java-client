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
import com.groupbyinc.retailapi.model.QueryPatternTriggerType;
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
 * QueryPatternTrigger
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-20T17:52:51.787881444-04:00[America/Toronto]")
public class QueryPatternTrigger {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private QueryPatternTriggerType type;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<String> values;

  public static final String SERIALIZED_NAME_PATTERNS = "patterns";
  @SerializedName(SERIALIZED_NAME_PATTERNS)
  private List<Object> patterns;

  public QueryPatternTrigger() {
  }

  public QueryPatternTrigger type(QueryPatternTriggerType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  public QueryPatternTriggerType getType() {
    return type;
  }


  public void setType(QueryPatternTriggerType type) {
    this.type = type;
  }


  public QueryPatternTrigger values(List<String> values) {
    
    this.values = values;
    return this;
  }

  public QueryPatternTrigger addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @javax.annotation.Nullable
  public List<String> getValues() {
    return values;
  }


  public void setValues(List<String> values) {
    this.values = values;
  }


  public QueryPatternTrigger patterns(List<Object> patterns) {
    
    this.patterns = patterns;
    return this;
  }

  public QueryPatternTrigger addPatternsItem(Object patternsItem) {
    if (this.patterns == null) {
      this.patterns = new ArrayList<>();
    }
    this.patterns.add(patternsItem);
    return this;
  }

   /**
   * Get patterns
   * @return patterns
  **/
  @javax.annotation.Nullable
  public List<Object> getPatterns() {
    return patterns;
  }


  public void setPatterns(List<Object> patterns) {
    this.patterns = patterns;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryPatternTrigger queryPatternTrigger = (QueryPatternTrigger) o;
    return Objects.equals(this.type, queryPatternTrigger.type) &&
        Objects.equals(this.values, queryPatternTrigger.values) &&
        Objects.equals(this.patterns, queryPatternTrigger.patterns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, values, patterns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryPatternTrigger {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    patterns: ").append(toIndentedString(patterns)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("values");
    openapiFields.add("patterns");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to QueryPatternTrigger
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QueryPatternTrigger.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QueryPatternTrigger is not found in the empty JSON string", QueryPatternTrigger.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QueryPatternTrigger.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QueryPatternTrigger` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : QueryPatternTrigger.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("values") != null && !jsonObj.get("values").isJsonNull() && !jsonObj.get("values").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `values` to be an array in the JSON string but got `%s`", jsonObj.get("values").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("patterns") != null && !jsonObj.get("patterns").isJsonNull() && !jsonObj.get("patterns").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `patterns` to be an array in the JSON string but got `%s`", jsonObj.get("patterns").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryPatternTrigger.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryPatternTrigger' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryPatternTrigger> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryPatternTrigger.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryPatternTrigger>() {
           @Override
           public void write(JsonWriter out, QueryPatternTrigger value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryPatternTrigger read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueryPatternTrigger given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryPatternTrigger
  * @throws IOException if the JSON string is invalid with respect to QueryPatternTrigger
  */
  public static QueryPatternTrigger fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryPatternTrigger.class);
  }

 /**
  * Convert an instance of QueryPatternTrigger to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
