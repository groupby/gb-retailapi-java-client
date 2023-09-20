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
import com.groupbyinc.retailapi.model.CustomParameterTrigger;
import com.groupbyinc.retailapi.model.QueryPatternTrigger;
import com.groupbyinc.retailapi.model.SelectedRefinementTrigger;
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
 * TriggerSet
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-20T17:52:51.787881444-04:00[America/Toronto]")
public class TriggerSet {
  public static final String SERIALIZED_NAME_QUERY_PATTERN_TRIGGERS = "queryPatternTriggers";
  @SerializedName(SERIALIZED_NAME_QUERY_PATTERN_TRIGGERS)
  private List<QueryPatternTrigger> queryPatternTriggers = new ArrayList<>();

  public static final String SERIALIZED_NAME_SELECTED_REFINEMENT_TRIGGERS = "selectedRefinementTriggers";
  @SerializedName(SERIALIZED_NAME_SELECTED_REFINEMENT_TRIGGERS)
  private List<SelectedRefinementTrigger> selectedRefinementTriggers = new ArrayList<>();

  public static final String SERIALIZED_NAME_CUSTOM_PARAMETER_TRIGGERS = "customParameterTriggers";
  @SerializedName(SERIALIZED_NAME_CUSTOM_PARAMETER_TRIGGERS)
  private List<CustomParameterTrigger> customParameterTriggers = new ArrayList<>();

  public TriggerSet() {
  }

  public TriggerSet queryPatternTriggers(List<QueryPatternTrigger> queryPatternTriggers) {
    
    this.queryPatternTriggers = queryPatternTriggers;
    return this;
  }

  public TriggerSet addQueryPatternTriggersItem(QueryPatternTrigger queryPatternTriggersItem) {
    if (this.queryPatternTriggers == null) {
      this.queryPatternTriggers = new ArrayList<>();
    }
    this.queryPatternTriggers.add(queryPatternTriggersItem);
    return this;
  }

   /**
   * Query pattern triggers.
   * @return queryPatternTriggers
  **/
  @javax.annotation.Nonnull
  public List<QueryPatternTrigger> getQueryPatternTriggers() {
    return queryPatternTriggers;
  }


  public void setQueryPatternTriggers(List<QueryPatternTrigger> queryPatternTriggers) {
    this.queryPatternTriggers = queryPatternTriggers;
  }


  public TriggerSet selectedRefinementTriggers(List<SelectedRefinementTrigger> selectedRefinementTriggers) {
    
    this.selectedRefinementTriggers = selectedRefinementTriggers;
    return this;
  }

  public TriggerSet addSelectedRefinementTriggersItem(SelectedRefinementTrigger selectedRefinementTriggersItem) {
    if (this.selectedRefinementTriggers == null) {
      this.selectedRefinementTriggers = new ArrayList<>();
    }
    this.selectedRefinementTriggers.add(selectedRefinementTriggersItem);
    return this;
  }

   /**
   * Selected refinement triggers.
   * @return selectedRefinementTriggers
  **/
  @javax.annotation.Nonnull
  public List<SelectedRefinementTrigger> getSelectedRefinementTriggers() {
    return selectedRefinementTriggers;
  }


  public void setSelectedRefinementTriggers(List<SelectedRefinementTrigger> selectedRefinementTriggers) {
    this.selectedRefinementTriggers = selectedRefinementTriggers;
  }


  public TriggerSet customParameterTriggers(List<CustomParameterTrigger> customParameterTriggers) {
    
    this.customParameterTriggers = customParameterTriggers;
    return this;
  }

  public TriggerSet addCustomParameterTriggersItem(CustomParameterTrigger customParameterTriggersItem) {
    if (this.customParameterTriggers == null) {
      this.customParameterTriggers = new ArrayList<>();
    }
    this.customParameterTriggers.add(customParameterTriggersItem);
    return this;
  }

   /**
   * Custom parameter triggers.
   * @return customParameterTriggers
  **/
  @javax.annotation.Nonnull
  public List<CustomParameterTrigger> getCustomParameterTriggers() {
    return customParameterTriggers;
  }


  public void setCustomParameterTriggers(List<CustomParameterTrigger> customParameterTriggers) {
    this.customParameterTriggers = customParameterTriggers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TriggerSet triggerSet = (TriggerSet) o;
    return Objects.equals(this.queryPatternTriggers, triggerSet.queryPatternTriggers) &&
        Objects.equals(this.selectedRefinementTriggers, triggerSet.selectedRefinementTriggers) &&
        Objects.equals(this.customParameterTriggers, triggerSet.customParameterTriggers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryPatternTriggers, selectedRefinementTriggers, customParameterTriggers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TriggerSet {\n");
    sb.append("    queryPatternTriggers: ").append(toIndentedString(queryPatternTriggers)).append("\n");
    sb.append("    selectedRefinementTriggers: ").append(toIndentedString(selectedRefinementTriggers)).append("\n");
    sb.append("    customParameterTriggers: ").append(toIndentedString(customParameterTriggers)).append("\n");
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
    openapiFields.add("queryPatternTriggers");
    openapiFields.add("selectedRefinementTriggers");
    openapiFields.add("customParameterTriggers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("queryPatternTriggers");
    openapiRequiredFields.add("selectedRefinementTriggers");
    openapiRequiredFields.add("customParameterTriggers");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TriggerSet
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TriggerSet.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TriggerSet is not found in the empty JSON string", TriggerSet.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TriggerSet.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TriggerSet` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TriggerSet.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("queryPatternTriggers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `queryPatternTriggers` to be an array in the JSON string but got `%s`", jsonObj.get("queryPatternTriggers").toString()));
      }

      JsonArray jsonArrayqueryPatternTriggers = jsonObj.getAsJsonArray("queryPatternTriggers");
      // validate the required field `queryPatternTriggers` (array)
      for (int i = 0; i < jsonArrayqueryPatternTriggers.size(); i++) {
        QueryPatternTrigger.validateJsonElement(jsonArrayqueryPatternTriggers.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("selectedRefinementTriggers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `selectedRefinementTriggers` to be an array in the JSON string but got `%s`", jsonObj.get("selectedRefinementTriggers").toString()));
      }

      JsonArray jsonArrayselectedRefinementTriggers = jsonObj.getAsJsonArray("selectedRefinementTriggers");
      // validate the required field `selectedRefinementTriggers` (array)
      for (int i = 0; i < jsonArrayselectedRefinementTriggers.size(); i++) {
        SelectedRefinementTrigger.validateJsonElement(jsonArrayselectedRefinementTriggers.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("customParameterTriggers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `customParameterTriggers` to be an array in the JSON string but got `%s`", jsonObj.get("customParameterTriggers").toString()));
      }

      JsonArray jsonArraycustomParameterTriggers = jsonObj.getAsJsonArray("customParameterTriggers");
      // validate the required field `customParameterTriggers` (array)
      for (int i = 0; i < jsonArraycustomParameterTriggers.size(); i++) {
        CustomParameterTrigger.validateJsonElement(jsonArraycustomParameterTriggers.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TriggerSet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TriggerSet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TriggerSet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TriggerSet.class));

       return (TypeAdapter<T>) new TypeAdapter<TriggerSet>() {
           @Override
           public void write(JsonWriter out, TriggerSet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TriggerSet read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TriggerSet given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TriggerSet
  * @throws IOException if the JSON string is invalid with respect to TriggerSet
  */
  public static TriggerSet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TriggerSet.class);
  }

 /**
  * Convert an instance of TriggerSet to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

