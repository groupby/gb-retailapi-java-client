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
import com.groupbyinc.retailapi.model.RuleTemplateSection;
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
 * RuleTemplate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-21T09:51:40.117075497-04:00[America/Toronto]")
public class RuleTemplate {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ENABLE_EXACT_MATCHING = "enableExactMatching";
  @SerializedName(SERIALIZED_NAME_ENABLE_EXACT_MATCHING)
  private Boolean enableExactMatching;

  public static final String SERIALIZED_NAME_SECTIONS = "sections";
  @SerializedName(SERIALIZED_NAME_SECTIONS)
  private List<RuleTemplateSection> sections = new ArrayList<>();

  public RuleTemplate() {
  }

  public RuleTemplate name(String name) {
    
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


  public RuleTemplate enableExactMatching(Boolean enableExactMatching) {
    
    this.enableExactMatching = enableExactMatching;
    return this;
  }

   /**
   * Get enableExactMatching
   * @return enableExactMatching
  **/
  @javax.annotation.Nonnull
  public Boolean getEnableExactMatching() {
    return enableExactMatching;
  }


  public void setEnableExactMatching(Boolean enableExactMatching) {
    this.enableExactMatching = enableExactMatching;
  }


  public RuleTemplate sections(List<RuleTemplateSection> sections) {
    
    this.sections = sections;
    return this;
  }

  public RuleTemplate addSectionsItem(RuleTemplateSection sectionsItem) {
    if (this.sections == null) {
      this.sections = new ArrayList<>();
    }
    this.sections.add(sectionsItem);
    return this;
  }

   /**
   * Get sections
   * @return sections
  **/
  @javax.annotation.Nonnull
  public List<RuleTemplateSection> getSections() {
    return sections;
  }


  public void setSections(List<RuleTemplateSection> sections) {
    this.sections = sections;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleTemplate ruleTemplate = (RuleTemplate) o;
    return Objects.equals(this.name, ruleTemplate.name) &&
        Objects.equals(this.enableExactMatching, ruleTemplate.enableExactMatching) &&
        Objects.equals(this.sections, ruleTemplate.sections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, enableExactMatching, sections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleTemplate {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    enableExactMatching: ").append(toIndentedString(enableExactMatching)).append("\n");
    sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
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
    openapiFields.add("enableExactMatching");
    openapiFields.add("sections");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("enableExactMatching");
    openapiRequiredFields.add("sections");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RuleTemplate
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RuleTemplate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RuleTemplate is not found in the empty JSON string", RuleTemplate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RuleTemplate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RuleTemplate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RuleTemplate.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("sections").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sections` to be an array in the JSON string but got `%s`", jsonObj.get("sections").toString()));
      }

      JsonArray jsonArraysections = jsonObj.getAsJsonArray("sections");
      // validate the required field `sections` (array)
      for (int i = 0; i < jsonArraysections.size(); i++) {
        RuleTemplateSection.validateJsonElement(jsonArraysections.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RuleTemplate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RuleTemplate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RuleTemplate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RuleTemplate.class));

       return (TypeAdapter<T>) new TypeAdapter<RuleTemplate>() {
           @Override
           public void write(JsonWriter out, RuleTemplate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RuleTemplate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RuleTemplate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RuleTemplate
  * @throws IOException if the JSON string is invalid with respect to RuleTemplate
  */
  public static RuleTemplate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RuleTemplate.class);
  }

 /**
  * Convert an instance of RuleTemplate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

