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
import com.groupbyinc.retailapi.model.RuleVariant;
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
 * ExperimentVariant
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-28T19:17:28.544199255-04:00[America/Toronto]")
public class ExperimentVariant {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RULE_VARIANT = "ruleVariant";
  @SerializedName(SERIALIZED_NAME_RULE_VARIANT)
  private RuleVariant ruleVariant;

  public static final String SERIALIZED_NAME_VARIANT_TRIGGER_PERCENTAGE = "variantTriggerPercentage";
  @SerializedName(SERIALIZED_NAME_VARIANT_TRIGGER_PERCENTAGE)
  private Integer variantTriggerPercentage;

  public ExperimentVariant() {
  }

  public ExperimentVariant name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ExperimentVariant ruleVariant(RuleVariant ruleVariant) {
    
    this.ruleVariant = ruleVariant;
    return this;
  }

   /**
   * Get ruleVariant
   * @return ruleVariant
  **/
  @javax.annotation.Nonnull
  public RuleVariant getRuleVariant() {
    return ruleVariant;
  }


  public void setRuleVariant(RuleVariant ruleVariant) {
    this.ruleVariant = ruleVariant;
  }


  public ExperimentVariant variantTriggerPercentage(Integer variantTriggerPercentage) {
    
    this.variantTriggerPercentage = variantTriggerPercentage;
    return this;
  }

   /**
   * Get variantTriggerPercentage
   * @return variantTriggerPercentage
  **/
  @javax.annotation.Nonnull
  public Integer getVariantTriggerPercentage() {
    return variantTriggerPercentage;
  }


  public void setVariantTriggerPercentage(Integer variantTriggerPercentage) {
    this.variantTriggerPercentage = variantTriggerPercentage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentVariant experimentVariant = (ExperimentVariant) o;
    return Objects.equals(this.name, experimentVariant.name) &&
        Objects.equals(this.ruleVariant, experimentVariant.ruleVariant) &&
        Objects.equals(this.variantTriggerPercentage, experimentVariant.variantTriggerPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, ruleVariant, variantTriggerPercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentVariant {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ruleVariant: ").append(toIndentedString(ruleVariant)).append("\n");
    sb.append("    variantTriggerPercentage: ").append(toIndentedString(variantTriggerPercentage)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("ruleVariant");
    openapiFields.add("variantTriggerPercentage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("ruleVariant");
    openapiRequiredFields.add("variantTriggerPercentage");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ExperimentVariant
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExperimentVariant.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExperimentVariant is not found in the empty JSON string", ExperimentVariant.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ExperimentVariant.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExperimentVariant` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ExperimentVariant.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the required field `ruleVariant`
      RuleVariant.validateJsonElement(jsonObj.get("ruleVariant"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExperimentVariant.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExperimentVariant' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExperimentVariant> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExperimentVariant.class));

       return (TypeAdapter<T>) new TypeAdapter<ExperimentVariant>() {
           @Override
           public void write(JsonWriter out, ExperimentVariant value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExperimentVariant read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExperimentVariant given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExperimentVariant
  * @throws IOException if the JSON string is invalid with respect to ExperimentVariant
  */
  public static ExperimentVariant fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExperimentVariant.class);
  }

 /**
  * Convert an instance of ExperimentVariant to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

