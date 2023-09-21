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
import com.groupbyinc.retailapi.model.Filter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * Object to wrap all recommendation request configs.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-21T09:40:02.999263865-04:00[America/Toronto]")
public class RecommendationsRequest {
  public static final String SERIALIZED_NAME_COLLECTION = "collection";
  @SerializedName(SERIALIZED_NAME_COLLECTION)
  private String collection;

  public static final String SERIALIZED_NAME_VISITOR_ID = "visitorId";
  @SerializedName(SERIALIZED_NAME_VISITOR_ID)
  private String visitorId;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private String limit;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private String pageSize;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "eventType";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private String eventType;

  public static final String SERIALIZED_NAME_LOGIN_ID = "loginId";
  @SerializedName(SERIALIZED_NAME_LOGIN_ID)
  private String loginId;

  public static final String SERIALIZED_NAME_PRODUCT_I_D = "productID";
  @SerializedName(SERIALIZED_NAME_PRODUCT_I_D)
  private List<String> productID;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<String> fields;

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<Filter> filters;

  public static final String SERIALIZED_NAME_RAW_FILTER = "rawFilter";
  @SerializedName(SERIALIZED_NAME_RAW_FILTER)
  private String rawFilter;

  public static final String SERIALIZED_NAME_PLACEMENT = "placement";
  @SerializedName(SERIALIZED_NAME_PLACEMENT)
  private String placement;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STRICT_FILTERING = "strictFiltering";
  @SerializedName(SERIALIZED_NAME_STRICT_FILTERING)
  private Boolean strictFiltering;

  public RecommendationsRequest() {
  }

  public RecommendationsRequest collection(String collection) {
    
    this.collection = collection;
    return this;
  }

   /**
   * Get collection
   * @return collection
  **/
  @javax.annotation.Nonnull
  public String getCollection() {
    return collection;
  }


  public void setCollection(String collection) {
    this.collection = collection;
  }


  public RecommendationsRequest visitorId(String visitorId) {
    
    this.visitorId = visitorId;
    return this;
  }

   /**
   * Get visitorId
   * @return visitorId
  **/
  @javax.annotation.Nullable
  public String getVisitorId() {
    return visitorId;
  }


  public void setVisitorId(String visitorId) {
    this.visitorId = visitorId;
  }


  public RecommendationsRequest limit(String limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @javax.annotation.Nullable
  public String getLimit() {
    return limit;
  }


  public void setLimit(String limit) {
    this.limit = limit;
  }


  public RecommendationsRequest pageSize(String pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @javax.annotation.Nullable
  public String getPageSize() {
    return pageSize;
  }


  public void setPageSize(String pageSize) {
    this.pageSize = pageSize;
  }


  public RecommendationsRequest eventType(String eventType) {
    
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @javax.annotation.Nullable
  public String getEventType() {
    return eventType;
  }


  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  public RecommendationsRequest loginId(String loginId) {
    
    this.loginId = loginId;
    return this;
  }

   /**
   * Get loginId
   * @return loginId
  **/
  @javax.annotation.Nullable
  public String getLoginId() {
    return loginId;
  }


  public void setLoginId(String loginId) {
    this.loginId = loginId;
  }


  public RecommendationsRequest productID(List<String> productID) {
    
    this.productID = productID;
    return this;
  }

  public RecommendationsRequest addProductIDItem(String productIDItem) {
    if (this.productID == null) {
      this.productID = new ArrayList<>();
    }
    this.productID.add(productIDItem);
    return this;
  }

   /**
   * Get productID
   * @return productID
  **/
  @javax.annotation.Nullable
  public List<String> getProductID() {
    return productID;
  }


  public void setProductID(List<String> productID) {
    this.productID = productID;
  }


  public RecommendationsRequest fields(List<String> fields) {
    
    this.fields = fields;
    return this;
  }

  public RecommendationsRequest addFieldsItem(String fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @javax.annotation.Nullable
  public List<String> getFields() {
    return fields;
  }


  public void setFields(List<String> fields) {
    this.fields = fields;
  }


  public RecommendationsRequest filters(List<Filter> filters) {
    
    this.filters = filters;
    return this;
  }

  public RecommendationsRequest addFiltersItem(Filter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @javax.annotation.Nullable
  public List<Filter> getFilters() {
    return filters;
  }


  public void setFilters(List<Filter> filters) {
    this.filters = filters;
  }


  public RecommendationsRequest rawFilter(String rawFilter) {
    
    this.rawFilter = rawFilter;
    return this;
  }

   /**
   * Get rawFilter
   * @return rawFilter
  **/
  @javax.annotation.Nullable
  public String getRawFilter() {
    return rawFilter;
  }


  public void setRawFilter(String rawFilter) {
    this.rawFilter = rawFilter;
  }


  public RecommendationsRequest placement(String placement) {
    
    this.placement = placement;
    return this;
  }

   /**
   * Get placement
   * @return placement
  **/
  @javax.annotation.Nullable
  public String getPlacement() {
    return placement;
  }


  public void setPlacement(String placement) {
    this.placement = placement;
  }


  public RecommendationsRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public RecommendationsRequest strictFiltering(Boolean strictFiltering) {
    
    this.strictFiltering = strictFiltering;
    return this;
  }

   /**
   * The default is true. If strictFiltering true only products that are within the scope of the filter specified. If false, relax the filtering so that the response may contain other products that are outside the scope of the filtering.
   * @return strictFiltering
  **/
  @javax.annotation.Nullable
  public Boolean getStrictFiltering() {
    return strictFiltering;
  }


  public void setStrictFiltering(Boolean strictFiltering) {
    this.strictFiltering = strictFiltering;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationsRequest recommendationsRequest = (RecommendationsRequest) o;
    return Objects.equals(this.collection, recommendationsRequest.collection) &&
        Objects.equals(this.visitorId, recommendationsRequest.visitorId) &&
        Objects.equals(this.limit, recommendationsRequest.limit) &&
        Objects.equals(this.pageSize, recommendationsRequest.pageSize) &&
        Objects.equals(this.eventType, recommendationsRequest.eventType) &&
        Objects.equals(this.loginId, recommendationsRequest.loginId) &&
        Objects.equals(this.productID, recommendationsRequest.productID) &&
        Objects.equals(this.fields, recommendationsRequest.fields) &&
        Objects.equals(this.filters, recommendationsRequest.filters) &&
        Objects.equals(this.rawFilter, recommendationsRequest.rawFilter) &&
        Objects.equals(this.placement, recommendationsRequest.placement) &&
        Objects.equals(this.name, recommendationsRequest.name) &&
        Objects.equals(this.strictFiltering, recommendationsRequest.strictFiltering);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(collection, visitorId, limit, pageSize, eventType, loginId, productID, fields, filters, rawFilter, placement, name, strictFiltering);
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
    sb.append("class RecommendationsRequest {\n");
    sb.append("    collection: ").append(toIndentedString(collection)).append("\n");
    sb.append("    visitorId: ").append(toIndentedString(visitorId)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    loginId: ").append(toIndentedString(loginId)).append("\n");
    sb.append("    productID: ").append(toIndentedString(productID)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    rawFilter: ").append(toIndentedString(rawFilter)).append("\n");
    sb.append("    placement: ").append(toIndentedString(placement)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    strictFiltering: ").append(toIndentedString(strictFiltering)).append("\n");
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
    openapiFields.add("collection");
    openapiFields.add("visitorId");
    openapiFields.add("limit");
    openapiFields.add("pageSize");
    openapiFields.add("eventType");
    openapiFields.add("loginId");
    openapiFields.add("productID");
    openapiFields.add("fields");
    openapiFields.add("filters");
    openapiFields.add("rawFilter");
    openapiFields.add("placement");
    openapiFields.add("name");
    openapiFields.add("strictFiltering");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("collection");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RecommendationsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RecommendationsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecommendationsRequest is not found in the empty JSON string", RecommendationsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RecommendationsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RecommendationsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RecommendationsRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("collection").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `collection` to be a primitive type in the JSON string but got `%s`", jsonObj.get("collection").toString()));
      }
      if ((jsonObj.get("visitorId") != null && !jsonObj.get("visitorId").isJsonNull()) && !jsonObj.get("visitorId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `visitorId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("visitorId").toString()));
      }
      if ((jsonObj.get("limit") != null && !jsonObj.get("limit").isJsonNull()) && !jsonObj.get("limit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `limit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("limit").toString()));
      }
      if ((jsonObj.get("pageSize") != null && !jsonObj.get("pageSize").isJsonNull()) && !jsonObj.get("pageSize").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pageSize` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pageSize").toString()));
      }
      if ((jsonObj.get("eventType") != null && !jsonObj.get("eventType").isJsonNull()) && !jsonObj.get("eventType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventType").toString()));
      }
      if ((jsonObj.get("loginId") != null && !jsonObj.get("loginId").isJsonNull()) && !jsonObj.get("loginId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `loginId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("loginId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("productID") != null && !jsonObj.get("productID").isJsonNull() && !jsonObj.get("productID").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `productID` to be an array in the JSON string but got `%s`", jsonObj.get("productID").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("fields") != null && !jsonObj.get("fields").isJsonNull() && !jsonObj.get("fields").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `fields` to be an array in the JSON string but got `%s`", jsonObj.get("fields").toString()));
      }
      if (jsonObj.get("filters") != null && !jsonObj.get("filters").isJsonNull()) {
        JsonArray jsonArrayfilters = jsonObj.getAsJsonArray("filters");
        if (jsonArrayfilters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("filters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `filters` to be an array in the JSON string but got `%s`", jsonObj.get("filters").toString()));
          }

          // validate the optional field `filters` (array)
          for (int i = 0; i < jsonArrayfilters.size(); i++) {
            Filter.validateJsonElement(jsonArrayfilters.get(i));
          };
        }
      }
      if ((jsonObj.get("rawFilter") != null && !jsonObj.get("rawFilter").isJsonNull()) && !jsonObj.get("rawFilter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rawFilter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rawFilter").toString()));
      }
      if ((jsonObj.get("placement") != null && !jsonObj.get("placement").isJsonNull()) && !jsonObj.get("placement").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `placement` to be a primitive type in the JSON string but got `%s`", jsonObj.get("placement").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecommendationsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecommendationsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecommendationsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecommendationsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<RecommendationsRequest>() {
           @Override
           public void write(JsonWriter out, RecommendationsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RecommendationsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RecommendationsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RecommendationsRequest
  * @throws IOException if the JSON string is invalid with respect to RecommendationsRequest
  */
  public static RecommendationsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecommendationsRequest.class);
  }

 /**
  * Convert an instance of RecommendationsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

