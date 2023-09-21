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
import com.groupbyinc.retailapi.model.DebugDto;
import com.groupbyinc.retailapi.model.Experiment;
import com.groupbyinc.retailapi.model.Metadata;
import com.groupbyinc.retailapi.model.NavigationDto;
import com.groupbyinc.retailapi.model.PageInfoDto;
import com.groupbyinc.retailapi.model.RecordDto;
import com.groupbyinc.retailapi.model.SearchMetadataDto;
import com.groupbyinc.retailapi.model.SearchRequestDto;
import com.groupbyinc.retailapi.model.TemplateDto;
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
 * Response of calling the search API, including various elements of the original request context, matching records and general metadata relating to the results.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-21T09:51:40.117075497-04:00[America/Toronto]")
public class SearchResponseDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_AREA = "area";
  @SerializedName(SERIALIZED_NAME_AREA)
  private String area;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private String query;

  public static final String SERIALIZED_NAME_CORRECTED_QUERY = "correctedQuery";
  @SerializedName(SERIALIZED_NAME_CORRECTED_QUERY)
  private String correctedQuery;

  public static final String SERIALIZED_NAME_BIASING_PROFILE = "biasingProfile";
  @SerializedName(SERIALIZED_NAME_BIASING_PROFILE)
  private String biasingProfile;

  public static final String SERIALIZED_NAME_BIASING_PROFILE_APPLIED_ID = "biasingProfileAppliedId";
  @SerializedName(SERIALIZED_NAME_BIASING_PROFILE_APPLIED_ID)
  private Integer biasingProfileAppliedId;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private String filter;

  public static final String SERIALIZED_NAME_ORIGINAL_REQUEST = "originalRequest";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_REQUEST)
  private SearchRequestDto originalRequest;

  public static final String SERIALIZED_NAME_RECORDS = "records";
  @SerializedName(SERIALIZED_NAME_RECORDS)
  private List<RecordDto> records;

  public static final String SERIALIZED_NAME_TOTAL_RECORD_COUNT = "totalRecordCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_RECORD_COUNT)
  private Long totalRecordCount;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private SearchMetadataDto metadata;

  public static final String SERIALIZED_NAME_PAGE_INFO = "pageInfo";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private PageInfoDto pageInfo;

  public static final String SERIALIZED_NAME_AVAILABLE_NAVIGATION = "availableNavigation";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_NAVIGATION)
  private List<NavigationDto> availableNavigation = new ArrayList<>();

  public static final String SERIALIZED_NAME_SELECTED_NAVIGATION = "selectedNavigation";
  @SerializedName(SERIALIZED_NAME_SELECTED_NAVIGATION)
  private List<NavigationDto> selectedNavigation = new ArrayList<>();

  public static final String SERIALIZED_NAME_REDIRECT = "redirect";
  @SerializedName(SERIALIZED_NAME_REDIRECT)
  private String redirect;

  public static final String SERIALIZED_NAME_EXPERIMENTS = "experiments";
  @SerializedName(SERIALIZED_NAME_EXPERIMENTS)
  private List<Experiment> experiments = new ArrayList<>();

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private TemplateDto template;

  public static final String SERIALIZED_NAME_EMPTY = "empty";
  @SerializedName(SERIALIZED_NAME_EMPTY)
  private Boolean empty;

  public static final String SERIALIZED_NAME_SITE_PARAMS = "siteParams";
  @SerializedName(SERIALIZED_NAME_SITE_PARAMS)
  private List<Metadata> siteParams = new ArrayList<>();

  public static final String SERIALIZED_NAME_DEBUG = "debug";
  @SerializedName(SERIALIZED_NAME_DEBUG)
  private DebugDto debug;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<String> warnings;

  public static final String SERIALIZED_NAME_INCLUDE_EXPANDED_RESULTS = "includeExpandedResults";
  @SerializedName(SERIALIZED_NAME_INCLUDE_EXPANDED_RESULTS)
  private Boolean includeExpandedResults;

  public static final String SERIALIZED_NAME_FACET_LIMIT = "facetLimit";
  @SerializedName(SERIALIZED_NAME_FACET_LIMIT)
  private Integer facetLimit;

  public static final String SERIALIZED_NAME_REDIRECT_METADATA = "redirectMetadata";
  @SerializedName(SERIALIZED_NAME_REDIRECT_METADATA)
  private List<Metadata> redirectMetadata = new ArrayList<>();

  public SearchResponseDto() {
  }

  public SearchResponseDto id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the search.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public SearchResponseDto area(String area) {
    
    this.area = area;
    return this;
  }

   /**
   * Area Id the search was performed in.
   * @return area
  **/
  @javax.annotation.Nullable
  public String getArea() {
    return area;
  }


  public void setArea(String area) {
    this.area = area;
  }


  public SearchResponseDto query(String query) {
    
    this.query = query;
    return this;
  }

   /**
   * Original search query.
   * @return query
  **/
  @javax.annotation.Nullable
  public String getQuery() {
    return query;
  }


  public void setQuery(String query) {
    this.query = query;
  }


  public SearchResponseDto correctedQuery(String correctedQuery) {
    
    this.correctedQuery = correctedQuery;
    return this;
  }

   /**
   * Search query after any changes/corrections are done by the engine.
   * @return correctedQuery
  **/
  @javax.annotation.Nullable
  public String getCorrectedQuery() {
    return correctedQuery;
  }


  public void setCorrectedQuery(String correctedQuery) {
    this.correctedQuery = correctedQuery;
  }


  public SearchResponseDto biasingProfile(String biasingProfile) {
    
    this.biasingProfile = biasingProfile;
    return this;
  }

   /**
   * Name of the biasing profile which was used to bias products in the search results.
   * @return biasingProfile
  **/
  @javax.annotation.Nullable
  public String getBiasingProfile() {
    return biasingProfile;
  }


  public void setBiasingProfile(String biasingProfile) {
    this.biasingProfile = biasingProfile;
  }


  public SearchResponseDto biasingProfileAppliedId(Integer biasingProfileAppliedId) {
    
    this.biasingProfileAppliedId = biasingProfileAppliedId;
    return this;
  }

   /**
   * Id of the biasing profile which was used to bias products in the search results.
   * @return biasingProfileAppliedId
  **/
  @javax.annotation.Nullable
  public Integer getBiasingProfileAppliedId() {
    return biasingProfileAppliedId;
  }


  public void setBiasingProfileAppliedId(Integer biasingProfileAppliedId) {
    this.biasingProfileAppliedId = biasingProfileAppliedId;
  }


  public SearchResponseDto filter(String filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nonnull
  public String getFilter() {
    return filter;
  }


  public void setFilter(String filter) {
    this.filter = filter;
  }


  public SearchResponseDto originalRequest(SearchRequestDto originalRequest) {
    
    this.originalRequest = originalRequest;
    return this;
  }

   /**
   * Get originalRequest
   * @return originalRequest
  **/
  @javax.annotation.Nonnull
  public SearchRequestDto getOriginalRequest() {
    return originalRequest;
  }


  public void setOriginalRequest(SearchRequestDto originalRequest) {
    this.originalRequest = originalRequest;
  }


  public SearchResponseDto records(List<RecordDto> records) {
    
    this.records = records;
    return this;
  }

  public SearchResponseDto addRecordsItem(RecordDto recordsItem) {
    if (this.records == null) {
      this.records = new ArrayList<>();
    }
    this.records.add(recordsItem);
    return this;
  }

   /**
   * The list of records that match the search.
   * @return records
  **/
  @javax.annotation.Nullable
  public List<RecordDto> getRecords() {
    return records;
  }


  public void setRecords(List<RecordDto> records) {
    this.records = records;
  }


  public SearchResponseDto totalRecordCount(Long totalRecordCount) {
    
    this.totalRecordCount = totalRecordCount;
    return this;
  }

   /**
   * The total number of products that match the search. If all products were filtered out on S4R site equals to 0.
   * @return totalRecordCount
  **/
  @javax.annotation.Nullable
  public Long getTotalRecordCount() {
    return totalRecordCount;
  }


  public void setTotalRecordCount(Long totalRecordCount) {
    this.totalRecordCount = totalRecordCount;
  }


  public SearchResponseDto metadata(SearchMetadataDto metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nonnull
  public SearchMetadataDto getMetadata() {
    return metadata;
  }


  public void setMetadata(SearchMetadataDto metadata) {
    this.metadata = metadata;
  }


  public SearchResponseDto pageInfo(PageInfoDto pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nonnull
  public PageInfoDto getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(PageInfoDto pageInfo) {
    this.pageInfo = pageInfo;
  }


  public SearchResponseDto availableNavigation(List<NavigationDto> availableNavigation) {
    
    this.availableNavigation = availableNavigation;
    return this;
  }

  public SearchResponseDto addAvailableNavigationItem(NavigationDto availableNavigationItem) {
    if (this.availableNavigation == null) {
      this.availableNavigation = new ArrayList<>();
    }
    this.availableNavigation.add(availableNavigationItem);
    return this;
  }

   /**
   * Get availableNavigation
   * @return availableNavigation
  **/
  @javax.annotation.Nonnull
  public List<NavigationDto> getAvailableNavigation() {
    return availableNavigation;
  }


  public void setAvailableNavigation(List<NavigationDto> availableNavigation) {
    this.availableNavigation = availableNavigation;
  }


  public SearchResponseDto selectedNavigation(List<NavigationDto> selectedNavigation) {
    
    this.selectedNavigation = selectedNavigation;
    return this;
  }

  public SearchResponseDto addSelectedNavigationItem(NavigationDto selectedNavigationItem) {
    if (this.selectedNavigation == null) {
      this.selectedNavigation = new ArrayList<>();
    }
    this.selectedNavigation.add(selectedNavigationItem);
    return this;
  }

   /**
   * Get selectedNavigation
   * @return selectedNavigation
  **/
  @javax.annotation.Nonnull
  public List<NavigationDto> getSelectedNavigation() {
    return selectedNavigation;
  }


  public void setSelectedNavigation(List<NavigationDto> selectedNavigation) {
    this.selectedNavigation = selectedNavigation;
  }


  public SearchResponseDto redirect(String redirect) {
    
    this.redirect = redirect;
    return this;
  }

   /**
   * URL to which the merchandiser should redirect the shopper to.
   * @return redirect
  **/
  @javax.annotation.Nullable
  public String getRedirect() {
    return redirect;
  }


  public void setRedirect(String redirect) {
    this.redirect = redirect;
  }


  public SearchResponseDto experiments(List<Experiment> experiments) {
    
    this.experiments = experiments;
    return this;
  }

  public SearchResponseDto addExperimentsItem(Experiment experimentsItem) {
    if (this.experiments == null) {
      this.experiments = new ArrayList<>();
    }
    this.experiments.add(experimentsItem);
    return this;
  }

   /**
   * Get experiments
   * @return experiments
  **/
  @javax.annotation.Nonnull
  public List<Experiment> getExperiments() {
    return experiments;
  }


  public void setExperiments(List<Experiment> experiments) {
    this.experiments = experiments;
  }


  public SearchResponseDto template(TemplateDto template) {
    
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @javax.annotation.Nonnull
  public TemplateDto getTemplate() {
    return template;
  }


  public void setTemplate(TemplateDto template) {
    this.template = template;
  }


  public SearchResponseDto empty(Boolean empty) {
    
    this.empty = empty;
    return this;
  }

   /**
   * True if the search yielded no results, otherwise false.
   * @return empty
  **/
  @javax.annotation.Nullable
  public Boolean getEmpty() {
    return empty;
  }


  public void setEmpty(Boolean empty) {
    this.empty = empty;
  }


  public SearchResponseDto siteParams(List<Metadata> siteParams) {
    
    this.siteParams = siteParams;
    return this;
  }

  public SearchResponseDto addSiteParamsItem(Metadata siteParamsItem) {
    if (this.siteParams == null) {
      this.siteParams = new ArrayList<>();
    }
    this.siteParams.add(siteParamsItem);
    return this;
  }

   /**
   * Get siteParams
   * @return siteParams
  **/
  @javax.annotation.Nonnull
  public List<Metadata> getSiteParams() {
    return siteParams;
  }


  public void setSiteParams(List<Metadata> siteParams) {
    this.siteParams = siteParams;
  }


  public SearchResponseDto debug(DebugDto debug) {
    
    this.debug = debug;
    return this;
  }

   /**
   * Get debug
   * @return debug
  **/
  @javax.annotation.Nonnull
  public DebugDto getDebug() {
    return debug;
  }


  public void setDebug(DebugDto debug) {
    this.debug = debug;
  }


  public SearchResponseDto warnings(List<String> warnings) {
    
    this.warnings = warnings;
    return this;
  }

  public SearchResponseDto addWarningsItem(String warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * Warning messages containing information about invalid products, etc.
   * @return warnings
  **/
  @javax.annotation.Nullable
  public List<String> getWarnings() {
    return warnings;
  }


  public void setWarnings(List<String> warnings) {
    this.warnings = warnings;
  }


  public SearchResponseDto includeExpandedResults(Boolean includeExpandedResults) {
    
    this.includeExpandedResults = includeExpandedResults;
    return this;
  }

   /**
   * When a shopper uses an ambiguous or a multi-word search phrase, they can get an empty response. After turning on include expanded results, Retail Search analyzes the request and returns the expanded list of products based on the parsed search query. For example, if you search \&quot;Google Pixel 5\&quot; without query expansion, you might only get \&quot;google_pixel_5\&quot; in the result. With query expansion, you might get \&quot;google_pixel_4a_with_5g\&quot;, \&quot;google_pixel_4a\&quot; and \&quot;google_pixel_5_case\&quot; as well.The default value is configured in the tenant settings or true if there is no such setting
   * @return includeExpandedResults
  **/
  @javax.annotation.Nullable
  public Boolean getIncludeExpandedResults() {
    return includeExpandedResults;
  }


  public void setIncludeExpandedResults(Boolean includeExpandedResults) {
    this.includeExpandedResults = includeExpandedResults;
  }


  public SearchResponseDto facetLimit(Integer facetLimit) {
    
    this.facetLimit = facetLimit;
    return this;
  }

   /**
   * Maximum of facet values that should be returned for this facet. If not specified, defaults to 20. The maximum allowed value is 300. Values above 300 will be coerced to 300.  If this field is negative, an INVALID_ARGUMENT is returned.  This limit (300) is configured on Google side, but Google have an ability to change it for specific project. 
   * @return facetLimit
  **/
  @javax.annotation.Nullable
  public Integer getFacetLimit() {
    return facetLimit;
  }


  public void setFacetLimit(Integer facetLimit) {
    this.facetLimit = facetLimit;
  }


  public SearchResponseDto redirectMetadata(List<Metadata> redirectMetadata) {
    
    this.redirectMetadata = redirectMetadata;
    return this;
  }

  public SearchResponseDto addRedirectMetadataItem(Metadata redirectMetadataItem) {
    if (this.redirectMetadata == null) {
      this.redirectMetadata = new ArrayList<>();
    }
    this.redirectMetadata.add(redirectMetadataItem);
    return this;
  }

   /**
   * Get redirectMetadata
   * @return redirectMetadata
  **/
  @javax.annotation.Nonnull
  public List<Metadata> getRedirectMetadata() {
    return redirectMetadata;
  }


  public void setRedirectMetadata(List<Metadata> redirectMetadata) {
    this.redirectMetadata = redirectMetadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResponseDto searchResponseDto = (SearchResponseDto) o;
    return Objects.equals(this.id, searchResponseDto.id) &&
        Objects.equals(this.area, searchResponseDto.area) &&
        Objects.equals(this.query, searchResponseDto.query) &&
        Objects.equals(this.correctedQuery, searchResponseDto.correctedQuery) &&
        Objects.equals(this.biasingProfile, searchResponseDto.biasingProfile) &&
        Objects.equals(this.biasingProfileAppliedId, searchResponseDto.biasingProfileAppliedId) &&
        Objects.equals(this.filter, searchResponseDto.filter) &&
        Objects.equals(this.originalRequest, searchResponseDto.originalRequest) &&
        Objects.equals(this.records, searchResponseDto.records) &&
        Objects.equals(this.totalRecordCount, searchResponseDto.totalRecordCount) &&
        Objects.equals(this.metadata, searchResponseDto.metadata) &&
        Objects.equals(this.pageInfo, searchResponseDto.pageInfo) &&
        Objects.equals(this.availableNavigation, searchResponseDto.availableNavigation) &&
        Objects.equals(this.selectedNavigation, searchResponseDto.selectedNavigation) &&
        Objects.equals(this.redirect, searchResponseDto.redirect) &&
        Objects.equals(this.experiments, searchResponseDto.experiments) &&
        Objects.equals(this.template, searchResponseDto.template) &&
        Objects.equals(this.empty, searchResponseDto.empty) &&
        Objects.equals(this.siteParams, searchResponseDto.siteParams) &&
        Objects.equals(this.debug, searchResponseDto.debug) &&
        Objects.equals(this.warnings, searchResponseDto.warnings) &&
        Objects.equals(this.includeExpandedResults, searchResponseDto.includeExpandedResults) &&
        Objects.equals(this.facetLimit, searchResponseDto.facetLimit) &&
        Objects.equals(this.redirectMetadata, searchResponseDto.redirectMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, area, query, correctedQuery, biasingProfile, biasingProfileAppliedId, filter, originalRequest, records, totalRecordCount, metadata, pageInfo, availableNavigation, selectedNavigation, redirect, experiments, template, empty, siteParams, debug, warnings, includeExpandedResults, facetLimit, redirectMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResponseDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    correctedQuery: ").append(toIndentedString(correctedQuery)).append("\n");
    sb.append("    biasingProfile: ").append(toIndentedString(biasingProfile)).append("\n");
    sb.append("    biasingProfileAppliedId: ").append(toIndentedString(biasingProfileAppliedId)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    originalRequest: ").append(toIndentedString(originalRequest)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
    sb.append("    totalRecordCount: ").append(toIndentedString(totalRecordCount)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
    sb.append("    availableNavigation: ").append(toIndentedString(availableNavigation)).append("\n");
    sb.append("    selectedNavigation: ").append(toIndentedString(selectedNavigation)).append("\n");
    sb.append("    redirect: ").append(toIndentedString(redirect)).append("\n");
    sb.append("    experiments: ").append(toIndentedString(experiments)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
    sb.append("    siteParams: ").append(toIndentedString(siteParams)).append("\n");
    sb.append("    debug: ").append(toIndentedString(debug)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    includeExpandedResults: ").append(toIndentedString(includeExpandedResults)).append("\n");
    sb.append("    facetLimit: ").append(toIndentedString(facetLimit)).append("\n");
    sb.append("    redirectMetadata: ").append(toIndentedString(redirectMetadata)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("area");
    openapiFields.add("query");
    openapiFields.add("correctedQuery");
    openapiFields.add("biasingProfile");
    openapiFields.add("biasingProfileAppliedId");
    openapiFields.add("filter");
    openapiFields.add("originalRequest");
    openapiFields.add("records");
    openapiFields.add("totalRecordCount");
    openapiFields.add("metadata");
    openapiFields.add("pageInfo");
    openapiFields.add("availableNavigation");
    openapiFields.add("selectedNavigation");
    openapiFields.add("redirect");
    openapiFields.add("experiments");
    openapiFields.add("template");
    openapiFields.add("empty");
    openapiFields.add("siteParams");
    openapiFields.add("debug");
    openapiFields.add("warnings");
    openapiFields.add("includeExpandedResults");
    openapiFields.add("facetLimit");
    openapiFields.add("redirectMetadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("filter");
    openapiRequiredFields.add("originalRequest");
    openapiRequiredFields.add("metadata");
    openapiRequiredFields.add("pageInfo");
    openapiRequiredFields.add("availableNavigation");
    openapiRequiredFields.add("selectedNavigation");
    openapiRequiredFields.add("experiments");
    openapiRequiredFields.add("template");
    openapiRequiredFields.add("siteParams");
    openapiRequiredFields.add("debug");
    openapiRequiredFields.add("redirectMetadata");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SearchResponseDto
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SearchResponseDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchResponseDto is not found in the empty JSON string", SearchResponseDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SearchResponseDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchResponseDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SearchResponseDto.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("area") != null && !jsonObj.get("area").isJsonNull()) && !jsonObj.get("area").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `area` to be a primitive type in the JSON string but got `%s`", jsonObj.get("area").toString()));
      }
      if ((jsonObj.get("query") != null && !jsonObj.get("query").isJsonNull()) && !jsonObj.get("query").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `query` to be a primitive type in the JSON string but got `%s`", jsonObj.get("query").toString()));
      }
      if ((jsonObj.get("correctedQuery") != null && !jsonObj.get("correctedQuery").isJsonNull()) && !jsonObj.get("correctedQuery").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `correctedQuery` to be a primitive type in the JSON string but got `%s`", jsonObj.get("correctedQuery").toString()));
      }
      if ((jsonObj.get("biasingProfile") != null && !jsonObj.get("biasingProfile").isJsonNull()) && !jsonObj.get("biasingProfile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biasingProfile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biasingProfile").toString()));
      }
      if (!jsonObj.get("filter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filter").toString()));
      }
      // validate the required field `originalRequest`
      SearchRequestDto.validateJsonElement(jsonObj.get("originalRequest"));
      if (jsonObj.get("records") != null && !jsonObj.get("records").isJsonNull()) {
        JsonArray jsonArrayrecords = jsonObj.getAsJsonArray("records");
        if (jsonArrayrecords != null) {
          // ensure the json data is an array
          if (!jsonObj.get("records").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `records` to be an array in the JSON string but got `%s`", jsonObj.get("records").toString()));
          }

          // validate the optional field `records` (array)
          for (int i = 0; i < jsonArrayrecords.size(); i++) {
            RecordDto.validateJsonElement(jsonArrayrecords.get(i));
          };
        }
      }
      // validate the required field `metadata`
      SearchMetadataDto.validateJsonElement(jsonObj.get("metadata"));
      // validate the required field `pageInfo`
      PageInfoDto.validateJsonElement(jsonObj.get("pageInfo"));
      // ensure the json data is an array
      if (!jsonObj.get("availableNavigation").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `availableNavigation` to be an array in the JSON string but got `%s`", jsonObj.get("availableNavigation").toString()));
      }

      JsonArray jsonArrayavailableNavigation = jsonObj.getAsJsonArray("availableNavigation");
      // validate the required field `availableNavigation` (array)
      for (int i = 0; i < jsonArrayavailableNavigation.size(); i++) {
        NavigationDto.validateJsonElement(jsonArrayavailableNavigation.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("selectedNavigation").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `selectedNavigation` to be an array in the JSON string but got `%s`", jsonObj.get("selectedNavigation").toString()));
      }

      JsonArray jsonArrayselectedNavigation = jsonObj.getAsJsonArray("selectedNavigation");
      // validate the required field `selectedNavigation` (array)
      for (int i = 0; i < jsonArrayselectedNavigation.size(); i++) {
        NavigationDto.validateJsonElement(jsonArrayselectedNavigation.get(i));
      };
      if ((jsonObj.get("redirect") != null && !jsonObj.get("redirect").isJsonNull()) && !jsonObj.get("redirect").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `redirect` to be a primitive type in the JSON string but got `%s`", jsonObj.get("redirect").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("experiments").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `experiments` to be an array in the JSON string but got `%s`", jsonObj.get("experiments").toString()));
      }

      JsonArray jsonArrayexperiments = jsonObj.getAsJsonArray("experiments");
      // validate the required field `experiments` (array)
      for (int i = 0; i < jsonArrayexperiments.size(); i++) {
        Experiment.validateJsonElement(jsonArrayexperiments.get(i));
      };
      // validate the required field `template`
      TemplateDto.validateJsonElement(jsonObj.get("template"));
      // ensure the json data is an array
      if (!jsonObj.get("siteParams").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `siteParams` to be an array in the JSON string but got `%s`", jsonObj.get("siteParams").toString()));
      }

      JsonArray jsonArraysiteParams = jsonObj.getAsJsonArray("siteParams");
      // validate the required field `siteParams` (array)
      for (int i = 0; i < jsonArraysiteParams.size(); i++) {
        Metadata.validateJsonElement(jsonArraysiteParams.get(i));
      };
      // validate the required field `debug`
      DebugDto.validateJsonElement(jsonObj.get("debug"));
      // ensure the optional json data is an array if present
      if (jsonObj.get("warnings") != null && !jsonObj.get("warnings").isJsonNull() && !jsonObj.get("warnings").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `warnings` to be an array in the JSON string but got `%s`", jsonObj.get("warnings").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("redirectMetadata").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `redirectMetadata` to be an array in the JSON string but got `%s`", jsonObj.get("redirectMetadata").toString()));
      }

      JsonArray jsonArrayredirectMetadata = jsonObj.getAsJsonArray("redirectMetadata");
      // validate the required field `redirectMetadata` (array)
      for (int i = 0; i < jsonArrayredirectMetadata.size(); i++) {
        Metadata.validateJsonElement(jsonArrayredirectMetadata.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchResponseDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchResponseDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchResponseDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchResponseDto.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchResponseDto>() {
           @Override
           public void write(JsonWriter out, SearchResponseDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchResponseDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchResponseDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchResponseDto
  * @throws IOException if the JSON string is invalid with respect to SearchResponseDto
  */
  public static SearchResponseDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchResponseDto.class);
  }

 /**
  * Convert an instance of SearchResponseDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

