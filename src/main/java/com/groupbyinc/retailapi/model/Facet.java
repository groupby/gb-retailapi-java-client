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
import com.groupbyinc.retailapi.model.NavigationType;
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
 * A facet specification to perform faceted search.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-28T19:17:28.544199255-04:00[America/Toronto]")
public class Facet {
  public static final String SERIALIZED_NAME_PREFIX = "prefix";
  @SerializedName(SERIALIZED_NAME_PREFIX)
  private String prefix;

  public static final String SERIALIZED_NAME_CONTAINS = "contains";
  @SerializedName(SERIALIZED_NAME_CONTAINS)
  private String contains;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private NavigationType type;

  public static final String SERIALIZED_NAME_NAVIGATION_NAME = "navigationName";
  @SerializedName(SERIALIZED_NAME_NAVIGATION_NAME)
  private String navigationName;

  public Facet() {
  }

  public Facet prefix(String prefix) {
    
    this.prefix = prefix;
    return this;
  }

   /**
   * Only get facet values that start with the given string prefix. For example, suppose \&quot;categories\&quot; has three values \&quot;Women &gt; Shoe\&quot;, \&quot;Women &gt; Dress\&quot; and \&quot;Men &gt; Shoe\&quot;. If set \&quot;prefixes\&quot; to \&quot;Women\&quot;, the \&quot;categories\&quot; facet will give only \&quot;Women &gt; Shoe\&quot; and \&quot;Women &gt; Dress\&quot;. Only supported on textual fields. Maximum is 10. This field is case-sensitive
   * @return prefix
  **/
  @javax.annotation.Nullable
  public String getPrefix() {
    return prefix;
  }


  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  public Facet contains(String contains) {
    
    this.contains = contains;
    return this;
  }

   /**
   * Only get facet values that contains the given strings. For example, suppose \&quot;categories\&quot; has three values \&quot;Women &gt; Shoe\&quot;, \&quot;Women &gt; Dress\&quot; and \&quot;Men &gt; Shoe\&quot;. If set \&quot;contains\&quot; to \&quot;Shoe\&quot;, the \&quot;categories\&quot; facet will give only \&quot;Women &gt; Shoe\&quot; and \&quot;Men &gt; Shoe\&quot;. Only supported on textual fields. Maximum is 10. This field is case-sensitive
   * @return contains
  **/
  @javax.annotation.Nullable
  public String getContains() {
    return contains;
  }


  public void setContains(String contains) {
    this.contains = contains;
  }


  public Facet displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name of facet
   * @return displayName
  **/
  @javax.annotation.Nullable
  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public Facet type(NavigationType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public NavigationType getType() {
    return type;
  }


  public void setType(NavigationType type) {
    this.type = type;
  }


  public Facet navigationName(String navigationName) {
    
    this.navigationName = navigationName;
    return this;
  }

   /**
   * Represents the name of navigation.
   * @return navigationName
  **/
  @javax.annotation.Nullable
  public String getNavigationName() {
    return navigationName;
  }


  public void setNavigationName(String navigationName) {
    this.navigationName = navigationName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Facet facet = (Facet) o;
    return Objects.equals(this.prefix, facet.prefix) &&
        Objects.equals(this.contains, facet.contains) &&
        Objects.equals(this.displayName, facet.displayName) &&
        Objects.equals(this.type, facet.type) &&
        Objects.equals(this.navigationName, facet.navigationName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prefix, contains, displayName, type, navigationName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Facet {\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    contains: ").append(toIndentedString(contains)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    navigationName: ").append(toIndentedString(navigationName)).append("\n");
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
    openapiFields.add("prefix");
    openapiFields.add("contains");
    openapiFields.add("displayName");
    openapiFields.add("type");
    openapiFields.add("navigationName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Facet
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Facet.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Facet is not found in the empty JSON string", Facet.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Facet.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Facet` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("prefix") != null && !jsonObj.get("prefix").isJsonNull()) && !jsonObj.get("prefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prefix").toString()));
      }
      if ((jsonObj.get("contains") != null && !jsonObj.get("contains").isJsonNull()) && !jsonObj.get("contains").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contains` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contains").toString()));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        NavigationType.validateJsonElement(jsonObj.get("type"));
      }
      if ((jsonObj.get("navigationName") != null && !jsonObj.get("navigationName").isJsonNull()) && !jsonObj.get("navigationName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `navigationName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("navigationName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Facet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Facet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Facet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Facet.class));

       return (TypeAdapter<T>) new TypeAdapter<Facet>() {
           @Override
           public void write(JsonWriter out, Facet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Facet read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Facet given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Facet
  * @throws IOException if the JSON string is invalid with respect to Facet
  */
  public static Facet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Facet.class);
  }

 /**
  * Convert an instance of Facet to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

