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
 * The amount the bias will affect the search results.
 */
@JsonAdapter(BiasDtoStrengthDto.Adapter.class)
public enum BiasDtoStrengthDto {
  
  ABSOLUTE_INCREASE("ABSOLUTE_INCREASE"),
  
  STRONG_INCREASE("STRONG_INCREASE"),
  
  MEDIUM_INCREASE("MEDIUM_INCREASE"),
  
  WEAK_INCREASE("WEAK_INCREASE"),
  
  LEAVE_UNCHANGED("LEAVE_UNCHANGED"),
  
  WEAK_DECREASE("WEAK_DECREASE"),
  
  MEDIUM_DECREASE("MEDIUM_DECREASE"),
  
  STRONG_DECREASE("STRONG_DECREASE"),
  
  ABSOLUTE_DECREASE("ABSOLUTE_DECREASE");

  private String value;

  BiasDtoStrengthDto(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BiasDtoStrengthDto fromValue(String value) {
    for (BiasDtoStrengthDto b : BiasDtoStrengthDto.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BiasDtoStrengthDto> {
    @Override
    public void write(final JsonWriter jsonWriter, final BiasDtoStrengthDto enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BiasDtoStrengthDto read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BiasDtoStrengthDto.fromValue(value);
    }
  }
}

