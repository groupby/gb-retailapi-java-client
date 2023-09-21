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
import com.groupbyinc.retailapi.model.Role;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * Identity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-21T09:40:02.999263865-04:00[America/Toronto]")
public class Identity {
  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  private String company;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<Role> roles = new ArrayList<>();

  public Identity() {
  }

  public Identity subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @javax.annotation.Nonnull
  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  public Identity company(String company) {
    
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @javax.annotation.Nonnull
  public String getCompany() {
    return company;
  }


  public void setCompany(String company) {
    this.company = company;
  }


  public Identity roles(List<Role> roles) {
    
    this.roles = roles;
    return this;
  }

  public Identity addRolesItem(Role rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @javax.annotation.Nonnull
  public List<Role> getRoles() {
    return roles;
  }


  public void setRoles(List<Role> roles) {
    this.roles = roles;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Identity identity = (Identity) o;
    return Objects.equals(this.subject, identity.subject) &&
        Objects.equals(this.company, identity.company) &&
        Objects.equals(this.roles, identity.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subject, company, roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Identity {\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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
    openapiFields.add("subject");
    openapiFields.add("company");
    openapiFields.add("roles");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("subject");
    openapiRequiredFields.add("company");
    openapiRequiredFields.add("roles");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Identity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Identity.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Identity is not found in the empty JSON string", Identity.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Identity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Identity` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Identity.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
      if (!jsonObj.get("company").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `company` to be a primitive type in the JSON string but got `%s`", jsonObj.get("company").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("roles").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `roles` to be an array in the JSON string but got `%s`", jsonObj.get("roles").toString()));
      }

      JsonArray jsonArrayroles = jsonObj.getAsJsonArray("roles");
      // validate the required field `roles` (array)
      for (int i = 0; i < jsonArrayroles.size(); i++) {
        Role.validateJsonElement(jsonArrayroles.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Identity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Identity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Identity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Identity.class));

       return (TypeAdapter<T>) new TypeAdapter<Identity>() {
           @Override
           public void write(JsonWriter out, Identity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Identity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Identity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Identity
  * @throws IOException if the JSON string is invalid with respect to Identity
  */
  public static Identity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Identity.class);
  }

 /**
  * Convert an instance of Identity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

