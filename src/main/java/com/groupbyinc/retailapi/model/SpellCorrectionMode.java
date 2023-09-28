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
 * Gets or Sets SpellCorrectionMode
 */
@JsonAdapter(SpellCorrectionMode.Adapter.class)
public enum SpellCorrectionMode {
  
  AUTO("AUTO"),
  
  SUGGESTION_ONLY("SUGGESTION_ONLY");

  private String value;

  SpellCorrectionMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SpellCorrectionMode fromValue(String value) {
    for (SpellCorrectionMode b : SpellCorrectionMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SpellCorrectionMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final SpellCorrectionMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SpellCorrectionMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SpellCorrectionMode.fromValue(value);
    }
  }
}

