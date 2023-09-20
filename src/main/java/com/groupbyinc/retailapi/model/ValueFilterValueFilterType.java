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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets ValueFilter.ValueFilterType
 */
@JsonAdapter(ValueFilterValueFilterType.Adapter.class)
public enum ValueFilterValueFilterType {
  
  TEXTUAL("TEXTUAL"),
  
  NUMERIC("NUMERIC");

  private String value;

  ValueFilterValueFilterType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ValueFilterValueFilterType fromValue(String value) {
    for (ValueFilterValueFilterType b : ValueFilterValueFilterType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ValueFilterValueFilterType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ValueFilterValueFilterType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ValueFilterValueFilterType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ValueFilterValueFilterType.fromValue(value);
    }
  }
}

