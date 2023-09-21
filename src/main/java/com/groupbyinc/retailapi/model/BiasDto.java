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
import com.groupbyinc.retailapi.model.BiasDtoStrengthDto;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Biases the search results to either increase or decrease product relevancy for products that match the given field and content.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-21T09:40:02.999263865-04:00[America/Toronto]")
public class BiasDto {
  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private String field;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_STRENGTH = "strength";
  @SerializedName(SERIALIZED_NAME_STRENGTH)
  private BiasDtoStrengthDto strength;

  public BiasDto() {
  }

  public BiasDto field(String field) {
    
    this.field = field;
    return this;
  }

   /**
   * The field the bias refers to.
   * @return field
  **/
  @javax.annotation.Nonnull
  public String getField() {
    return field;
  }


  public void setField(String field) {
    this.field = field;
  }


  public BiasDto content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * The content the field must match for the bias to be applied.
   * @return content
  **/
  @javax.annotation.Nullable
  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public BiasDto strength(BiasDtoStrengthDto strength) {
    
    this.strength = strength;
    return this;
  }

   /**
   * Get strength
   * @return strength
  **/
  @javax.annotation.Nonnull
  public BiasDtoStrengthDto getStrength() {
    return strength;
  }


  public void setStrength(BiasDtoStrengthDto strength) {
    this.strength = strength;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BiasDto biasDto = (BiasDto) o;
    return Objects.equals(this.field, biasDto.field) &&
        Objects.equals(this.content, biasDto.content) &&
        Objects.equals(this.strength, biasDto.strength);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, content, strength);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BiasDto {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    strength: ").append(toIndentedString(strength)).append("\n");
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
    openapiFields.add("field");
    openapiFields.add("content");
    openapiFields.add("strength");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("field");
    openapiRequiredFields.add("strength");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BiasDto
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BiasDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BiasDto is not found in the empty JSON string", BiasDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BiasDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BiasDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BiasDto.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("field").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field").toString()));
      }
      if ((jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BiasDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BiasDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BiasDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BiasDto.class));

       return (TypeAdapter<T>) new TypeAdapter<BiasDto>() {
           @Override
           public void write(JsonWriter out, BiasDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BiasDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BiasDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BiasDto
  * @throws IOException if the JSON string is invalid with respect to BiasDto
  */
  public static BiasDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BiasDto.class);
  }

 /**
  * Convert an instance of BiasDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

