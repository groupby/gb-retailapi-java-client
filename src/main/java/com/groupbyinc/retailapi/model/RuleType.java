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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets RuleType
 */
@JsonAdapter(RuleType.Adapter.class)
public enum RuleType {
  
  REGULAR("REGULAR"),
  
  EXPERIMENT("EXPERIMENT");

  private String value;

  RuleType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RuleType fromValue(String value) {
    for (RuleType b : RuleType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<RuleType> {
    @Override
    public void write(final JsonWriter jsonWriter, final RuleType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RuleType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RuleType.fromValue(value);
    }
  }
}

