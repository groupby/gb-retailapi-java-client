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
import com.groupbyinc.retailapi.model.ZoneType;
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
 * RuleTemplateSection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-21T09:51:40.117075497-04:00[America/Toronto]")
public class RuleTemplateSection {
  public static final String SERIALIZED_NAME_ZONE_ID = "zoneId";
  @SerializedName(SERIALIZED_NAME_ZONE_ID)
  private Integer zoneId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ZONE_CONTENT = "zoneContent";
  @SerializedName(SERIALIZED_NAME_ZONE_CONTENT)
  private String zoneContent;

  public static final String SERIALIZED_NAME_ZONE_TYPE = "zoneType";
  @SerializedName(SERIALIZED_NAME_ZONE_TYPE)
  private ZoneType zoneType;

  public RuleTemplateSection() {
  }

  public RuleTemplateSection zoneId(Integer zoneId) {
    
    this.zoneId = zoneId;
    return this;
  }

   /**
   * Get zoneId
   * @return zoneId
  **/
  @javax.annotation.Nonnull
  public Integer getZoneId() {
    return zoneId;
  }


  public void setZoneId(Integer zoneId) {
    this.zoneId = zoneId;
  }


  public RuleTemplateSection name(String name) {
    
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


  public RuleTemplateSection zoneContent(String zoneContent) {
    
    this.zoneContent = zoneContent;
    return this;
  }

   /**
   * Get zoneContent
   * @return zoneContent
  **/
  @javax.annotation.Nonnull
  public String getZoneContent() {
    return zoneContent;
  }


  public void setZoneContent(String zoneContent) {
    this.zoneContent = zoneContent;
  }


  public RuleTemplateSection zoneType(ZoneType zoneType) {
    
    this.zoneType = zoneType;
    return this;
  }

   /**
   * Get zoneType
   * @return zoneType
  **/
  @javax.annotation.Nonnull
  public ZoneType getZoneType() {
    return zoneType;
  }


  public void setZoneType(ZoneType zoneType) {
    this.zoneType = zoneType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleTemplateSection ruleTemplateSection = (RuleTemplateSection) o;
    return Objects.equals(this.zoneId, ruleTemplateSection.zoneId) &&
        Objects.equals(this.name, ruleTemplateSection.name) &&
        Objects.equals(this.zoneContent, ruleTemplateSection.zoneContent) &&
        Objects.equals(this.zoneType, ruleTemplateSection.zoneType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zoneId, name, zoneContent, zoneType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleTemplateSection {\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    zoneContent: ").append(toIndentedString(zoneContent)).append("\n");
    sb.append("    zoneType: ").append(toIndentedString(zoneType)).append("\n");
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
    openapiFields.add("zoneId");
    openapiFields.add("name");
    openapiFields.add("zoneContent");
    openapiFields.add("zoneType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("zoneId");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("zoneContent");
    openapiRequiredFields.add("zoneType");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RuleTemplateSection
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RuleTemplateSection.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RuleTemplateSection is not found in the empty JSON string", RuleTemplateSection.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RuleTemplateSection.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RuleTemplateSection` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RuleTemplateSection.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("zoneContent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zoneContent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zoneContent").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RuleTemplateSection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RuleTemplateSection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RuleTemplateSection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RuleTemplateSection.class));

       return (TypeAdapter<T>) new TypeAdapter<RuleTemplateSection>() {
           @Override
           public void write(JsonWriter out, RuleTemplateSection value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RuleTemplateSection read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RuleTemplateSection given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RuleTemplateSection
  * @throws IOException if the JSON string is invalid with respect to RuleTemplateSection
  */
  public static RuleTemplateSection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RuleTemplateSection.class);
  }

 /**
  * Convert an instance of RuleTemplateSection to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

