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
 * ValueFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-21T09:40:02.999263865-04:00[America/Toronto]")
public class ValueFilter {
  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private String field;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_NUMBER_VALUE = "numberValue";
  @SerializedName(SERIALIZED_NAME_NUMBER_VALUE)
  private Double numberValue;

  public static final String SERIALIZED_NAME_EXCLUDE = "exclude";
  @SerializedName(SERIALIZED_NAME_EXCLUDE)
  private Boolean exclude;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Object type = null;

  public ValueFilter() {
  }

  public ValueFilter field(String field) {
    
    this.field = field;
    return this;
  }

   /**
   * Field the value applies to.
   * @return field
  **/
  @javax.annotation.Nonnull
  public String getField() {
    return field;
  }


  public void setField(String field) {
    this.field = field;
  }


  public ValueFilter value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Value to filter on.
   * @return value
  **/
  @javax.annotation.Nonnull
  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public ValueFilter numberValue(Double numberValue) {
    
    this.numberValue = numberValue;
    return this;
  }

   /**
   * Numeric value to filter on.
   * @return numberValue
  **/
  @javax.annotation.Nonnull
  public Double getNumberValue() {
    return numberValue;
  }


  public void setNumberValue(Double numberValue) {
    this.numberValue = numberValue;
  }


  public ValueFilter exclude(Boolean exclude) {
    
    this.exclude = exclude;
    return this;
  }

   /**
   * Describing whether the filter is negated or not: color that is NOT red.
   * @return exclude
  **/
  @javax.annotation.Nonnull
  public Boolean getExclude() {
    return exclude;
  }


  public void setExclude(Boolean exclude) {
    this.exclude = exclude;
  }


  public ValueFilter type(Object type) {
    
    this.type = type;
    return this;
  }

   /**
   * Determine which field we need to use - value if &#39;TEXTUAL&#39; type or numberValue if &#39;NUMERIC&#39; type.
   * @return type
  **/
  @javax.annotation.Nullable
  public Object getType() {
    return type;
  }


  public void setType(Object type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValueFilter valueFilter = (ValueFilter) o;
    return Objects.equals(this.field, valueFilter.field) &&
        Objects.equals(this.value, valueFilter.value) &&
        Objects.equals(this.numberValue, valueFilter.numberValue) &&
        Objects.equals(this.exclude, valueFilter.exclude) &&
        Objects.equals(this.type, valueFilter.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, value, numberValue, exclude, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValueFilter {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    numberValue: ").append(toIndentedString(numberValue)).append("\n");
    sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("value");
    openapiFields.add("numberValue");
    openapiFields.add("exclude");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("field");
    openapiRequiredFields.add("value");
    openapiRequiredFields.add("numberValue");
    openapiRequiredFields.add("exclude");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ValueFilter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ValueFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ValueFilter is not found in the empty JSON string", ValueFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ValueFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ValueFilter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ValueFilter.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("field").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field").toString()));
      }
      if (!jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ValueFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ValueFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ValueFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ValueFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<ValueFilter>() {
           @Override
           public void write(JsonWriter out, ValueFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ValueFilter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ValueFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ValueFilter
  * @throws IOException if the JSON string is invalid with respect to ValueFilter
  */
  public static ValueFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ValueFilter.class);
  }

 /**
  * Convert an instance of ValueFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

