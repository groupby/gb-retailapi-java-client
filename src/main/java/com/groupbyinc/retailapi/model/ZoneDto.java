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
import com.groupbyinc.retailapi.model.ZoneDtoType;
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
 * UI zones, that may contain code snippets, sub-searches and etc.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-21T09:40:02.999263865-04:00[America/Toronto]")
public class ZoneDto {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ZoneDtoType type;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_RICH_CONTENT = "richContent";
  @SerializedName(SERIALIZED_NAME_RICH_CONTENT)
  private String richContent;

  public ZoneDto() {
  }

  public ZoneDto name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A name for the zone, ideally human-readable.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ZoneDto type(ZoneDtoType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public ZoneDtoType getType() {
    return type;
  }


  public void setType(ZoneDtoType type) {
    this.type = type;
  }


  public ZoneDto content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * Zone content - it is can be any data, HTML - code, usual text or etc
   * @return content
  **/
  @javax.annotation.Nullable
  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public ZoneDto richContent(String richContent) {
    
    this.richContent = richContent;
    return this;
  }

   /**
   * Zone content - it is can be any data, HTML - code, usual text or etc
   * @return richContent
  **/
  @javax.annotation.Nullable
  public String getRichContent() {
    return richContent;
  }


  public void setRichContent(String richContent) {
    this.richContent = richContent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZoneDto zoneDto = (ZoneDto) o;
    return Objects.equals(this.name, zoneDto.name) &&
        Objects.equals(this.type, zoneDto.type) &&
        Objects.equals(this.content, zoneDto.content) &&
        Objects.equals(this.richContent, zoneDto.richContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, content, richContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZoneDto {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    richContent: ").append(toIndentedString(richContent)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("content");
    openapiFields.add("richContent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ZoneDto
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ZoneDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZoneDto is not found in the empty JSON string", ZoneDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ZoneDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZoneDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        ZoneDtoType.validateJsonElement(jsonObj.get("type"));
      }
      if ((jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      if ((jsonObj.get("richContent") != null && !jsonObj.get("richContent").isJsonNull()) && !jsonObj.get("richContent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `richContent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("richContent").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZoneDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZoneDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZoneDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZoneDto.class));

       return (TypeAdapter<T>) new TypeAdapter<ZoneDto>() {
           @Override
           public void write(JsonWriter out, ZoneDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZoneDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZoneDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZoneDto
  * @throws IOException if the JSON string is invalid with respect to ZoneDto
  */
  public static ZoneDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZoneDto.class);
  }

 /**
  * Convert an instance of ZoneDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

