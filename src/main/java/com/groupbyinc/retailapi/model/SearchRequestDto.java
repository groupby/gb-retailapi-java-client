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
import com.groupbyinc.retailapi.model.BiasingProfileDto;
import com.groupbyinc.retailapi.model.CustomParameterDto;
import com.groupbyinc.retailapi.model.SearchRequestDtoOverwrites;
import com.groupbyinc.retailapi.model.SelectedRefinementDto;
import com.groupbyinc.retailapi.model.SortDto;
import com.groupbyinc.retailapi.model.SpellCorrectionMode;
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
 * Request that should be populated to configure a search API call, made by the client on behalf of a shopper.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-21T09:40:02.999263865-04:00[America/Toronto]")
public class SearchRequestDto {
  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private String query;

  public static final String SERIALIZED_NAME_AREA = "area";
  @SerializedName(SERIALIZED_NAME_AREA)
  private String area = "Production";

  public static final String SERIALIZED_NAME_COLLECTION = "collection";
  @SerializedName(SERIALIZED_NAME_COLLECTION)
  private String collection = "default";

  public static final String SERIALIZED_NAME_VISITOR_ID = "visitorId";
  @SerializedName(SERIALIZED_NAME_VISITOR_ID)
  private String visitorId;

  public static final String SERIALIZED_NAME_REFINEMENTS = "refinements";
  @SerializedName(SERIALIZED_NAME_REFINEMENTS)
  private List<SelectedRefinementDto> refinements = new ArrayList<>();

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize = 10;

  public static final String SERIALIZED_NAME_SKIP = "skip";
  @SerializedName(SERIALIZED_NAME_SKIP)
  private Long skip = 0l;

  public static final String SERIALIZED_NAME_BIASING_PROFILE = "biasingProfile";
  @SerializedName(SERIALIZED_NAME_BIASING_PROFILE)
  private String biasingProfile;

  public static final String SERIALIZED_NAME_BIASING = "biasing";
  @SerializedName(SERIALIZED_NAME_BIASING)
  private BiasingProfileDto biasing;

  public static final String SERIALIZED_NAME_CUSTOM_URL_PARAMS = "customUrlParams";
  @SerializedName(SERIALIZED_NAME_CUSTOM_URL_PARAMS)
  private List<CustomParameterDto> customUrlParams = new ArrayList<>();

  public static final String SERIALIZED_NAME_SORTS = "sorts";
  @SerializedName(SERIALIZED_NAME_SORTS)
  private List<SortDto> sorts = new ArrayList<>();

  public static final String SERIALIZED_NAME_INCLUDED_NAVIGATIONS = "includedNavigations";
  @SerializedName(SERIALIZED_NAME_INCLUDED_NAVIGATIONS)
  private List<String> includedNavigations;

  public static final String SERIALIZED_NAME_EXCLUDED_NAVIGATIONS = "excludedNavigations";
  @SerializedName(SERIALIZED_NAME_EXCLUDED_NAVIGATIONS)
  private List<String> excludedNavigations;

  public static final String SERIALIZED_NAME_DYNAMIC_FACET = "dynamicFacet";
  @SerializedName(SERIALIZED_NAME_DYNAMIC_FACET)
  private Boolean dynamicFacet;

  public static final String SERIALIZED_NAME_VARIANT_ROLLUP_KEYS = "variantRollupKeys";
  @SerializedName(SERIALIZED_NAME_VARIANT_ROLLUP_KEYS)
  private List<String> variantRollupKeys;

  public static final String SERIALIZED_NAME_PRE_FILTER = "preFilter";
  @SerializedName(SERIALIZED_NAME_PRE_FILTER)
  private String preFilter;

  public static final String SERIALIZED_NAME_SITE = "site";
  @SerializedName(SERIALIZED_NAME_SITE)
  private String site;

  public static final String SERIALIZED_NAME_RESPONSE_MASK = "responseMask";
  @SerializedName(SERIALIZED_NAME_RESPONSE_MASK)
  private List<String> responseMask;

  public static final String SERIALIZED_NAME_PAGE_CATEGORIES = "pageCategories";
  @SerializedName(SERIALIZED_NAME_PAGE_CATEGORIES)
  private List<String> pageCategories;

  public static final String SERIALIZED_NAME_SPELL_CORRECTION_MODE = "spellCorrectionMode";
  @SerializedName(SERIALIZED_NAME_SPELL_CORRECTION_MODE)
  private SpellCorrectionMode spellCorrectionMode;

  public static final String SERIALIZED_NAME_INCLUDE_EXPANDED_RESULTS = "includeExpandedResults";
  @SerializedName(SERIALIZED_NAME_INCLUDE_EXPANDED_RESULTS)
  private Boolean includeExpandedResults;

  public static final String SERIALIZED_NAME_PIN_UNEXPANDED_RESULTS = "pinUnexpandedResults";
  @SerializedName(SERIALIZED_NAME_PIN_UNEXPANDED_RESULTS)
  private Boolean pinUnexpandedResults;

  public static final String SERIALIZED_NAME_DEBUG = "debug";
  @SerializedName(SERIALIZED_NAME_DEBUG)
  private Boolean debug;

  public static final String SERIALIZED_NAME_FACET_LIMIT = "facetLimit";
  @SerializedName(SERIALIZED_NAME_FACET_LIMIT)
  private Integer facetLimit;

  public static final String SERIALIZED_NAME_LOGIN_ID = "loginId";
  @SerializedName(SERIALIZED_NAME_LOGIN_ID)
  private String loginId;

  public static final String SERIALIZED_NAME_OVERWRITES = "overwrites";
  @SerializedName(SERIALIZED_NAME_OVERWRITES)
  private SearchRequestDtoOverwrites overwrites;

  public SearchRequestDto() {
  }

  public SearchRequestDto query(String query) {
    
    this.query = query;
    return this;
  }

   /**
   * Base textual search query.
   * @return query
  **/
  @javax.annotation.Nullable
  public String getQuery() {
    return query;
  }


  public void setQuery(String query) {
    this.query = query;
  }


  public SearchRequestDto area(String area) {
    
    this.area = area;
    return this;
  }

   /**
   * Area name the search is being performed in.
   * @return area
  **/
  @javax.annotation.Nullable
  public String getArea() {
    return area;
  }


  public void setArea(String area) {
    this.area = area;
  }


  public SearchRequestDto collection(String collection) {
    
    this.collection = collection;
    return this;
  }

   /**
   * Name of collection in project configuration setting which is mapped to the google retail backend.
   * @return collection
  **/
  @javax.annotation.Nullable
  public String getCollection() {
    return collection;
  }


  public void setCollection(String collection) {
    this.collection = collection;
  }


  public SearchRequestDto visitorId(String visitorId) {
    
    this.visitorId = visitorId;
    return this;
  }

   /**
   * Unique identifier identifying the shopper. Will be autogenerated if not provided.
   * @return visitorId
  **/
  @javax.annotation.Nullable
  public String getVisitorId() {
    return visitorId;
  }


  public void setVisitorId(String visitorId) {
    this.visitorId = visitorId;
  }


  public SearchRequestDto refinements(List<SelectedRefinementDto> refinements) {
    
    this.refinements = refinements;
    return this;
  }

  public SearchRequestDto addRefinementsItem(SelectedRefinementDto refinementsItem) {
    if (this.refinements == null) {
      this.refinements = new ArrayList<>();
    }
    this.refinements.add(refinementsItem);
    return this;
  }

   /**
   * Get refinements
   * @return refinements
  **/
  @javax.annotation.Nonnull
  public List<SelectedRefinementDto> getRefinements() {
    return refinements;
  }


  public void setRefinements(List<SelectedRefinementDto> refinements) {
    this.refinements = refinements;
  }


  public SearchRequestDto pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * The number of products to be returned on each page.
   * minimum: 0
   * @return pageSize
  **/
  @javax.annotation.Nullable
  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public SearchRequestDto skip(Long skip) {
    
    this.skip = skip;
    return this;
  }

   /**
   * Where in the list of products to begin the page.
   * minimum: 0
   * @return skip
  **/
  @javax.annotation.Nullable
  public Long getSkip() {
    return skip;
  }


  public void setSkip(Long skip) {
    this.skip = skip;
  }


  public SearchRequestDto biasingProfile(String biasingProfile) {
    
    this.biasingProfile = biasingProfile;
    return this;
  }

   /**
   * Name of a biasing profile which should be applied to the search. Takes priority over area default.
   * @return biasingProfile
  **/
  @javax.annotation.Nullable
  public String getBiasingProfile() {
    return biasingProfile;
  }


  public void setBiasingProfile(String biasingProfile) {
    this.biasingProfile = biasingProfile;
  }


  public SearchRequestDto biasing(BiasingProfileDto biasing) {
    
    this.biasing = biasing;
    return this;
  }

   /**
   * Get biasing
   * @return biasing
  **/
  @javax.annotation.Nullable
  public BiasingProfileDto getBiasing() {
    return biasing;
  }


  public void setBiasing(BiasingProfileDto biasing) {
    this.biasing = biasing;
  }


  public SearchRequestDto customUrlParams(List<CustomParameterDto> customUrlParams) {
    
    this.customUrlParams = customUrlParams;
    return this;
  }

  public SearchRequestDto addCustomUrlParamsItem(CustomParameterDto customUrlParamsItem) {
    if (this.customUrlParams == null) {
      this.customUrlParams = new ArrayList<>();
    }
    this.customUrlParams.add(customUrlParamsItem);
    return this;
  }

   /**
   * Get customUrlParams
   * @return customUrlParams
  **/
  @javax.annotation.Nonnull
  public List<CustomParameterDto> getCustomUrlParams() {
    return customUrlParams;
  }


  public void setCustomUrlParams(List<CustomParameterDto> customUrlParams) {
    this.customUrlParams = customUrlParams;
  }


  public SearchRequestDto sorts(List<SortDto> sorts) {
    
    this.sorts = sorts;
    return this;
  }

  public SearchRequestDto addSortsItem(SortDto sortsItem) {
    if (this.sorts == null) {
      this.sorts = new ArrayList<>();
    }
    this.sorts.add(sortsItem);
    return this;
  }

   /**
   * Get sorts
   * @return sorts
  **/
  @javax.annotation.Nonnull
  public List<SortDto> getSorts() {
    return sorts;
  }


  public void setSorts(List<SortDto> sorts) {
    this.sorts = sorts;
  }


  public SearchRequestDto includedNavigations(List<String> includedNavigations) {
    
    this.includedNavigations = includedNavigations;
    return this;
  }

  public SearchRequestDto addIncludedNavigationsItem(String includedNavigationsItem) {
    if (this.includedNavigations == null) {
      this.includedNavigations = new ArrayList<>();
    }
    this.includedNavigations.add(includedNavigationsItem);
    return this;
  }

   /**
   * Set of navigation fields to include in the search result. Cannot be set if &#39;excludedNavigations&#39; is set.
   * @return includedNavigations
  **/
  @javax.annotation.Nullable
  public List<String> getIncludedNavigations() {
    return includedNavigations;
  }


  public void setIncludedNavigations(List<String> includedNavigations) {
    this.includedNavigations = includedNavigations;
  }


  public SearchRequestDto excludedNavigations(List<String> excludedNavigations) {
    
    this.excludedNavigations = excludedNavigations;
    return this;
  }

  public SearchRequestDto addExcludedNavigationsItem(String excludedNavigationsItem) {
    if (this.excludedNavigations == null) {
      this.excludedNavigations = new ArrayList<>();
    }
    this.excludedNavigations.add(excludedNavigationsItem);
    return this;
  }

   /**
   * Set of navigation fields to exclude in the search result. Cannot be set if &#39;includedNavigations&#39; is set.
   * @return excludedNavigations
  **/
  @javax.annotation.Nullable
  public List<String> getExcludedNavigations() {
    return excludedNavigations;
  }


  public void setExcludedNavigations(List<String> excludedNavigations) {
    this.excludedNavigations = excludedNavigations;
  }


  public SearchRequestDto dynamicFacet(Boolean dynamicFacet) {
    
    this.dynamicFacet = dynamicFacet;
    return this;
  }

   /**
   * Set the specifications of dynamically generated facets.
   * @return dynamicFacet
  **/
  @javax.annotation.Nullable
  public Boolean getDynamicFacet() {
    return dynamicFacet;
  }


  public void setDynamicFacet(Boolean dynamicFacet) {
    this.dynamicFacet = dynamicFacet;
  }


  public SearchRequestDto variantRollupKeys(List<String> variantRollupKeys) {
    
    this.variantRollupKeys = variantRollupKeys;
    return this;
  }

  public SearchRequestDto addVariantRollupKeysItem(String variantRollupKeysItem) {
    if (this.variantRollupKeys == null) {
      this.variantRollupKeys = new ArrayList<>();
    }
    this.variantRollupKeys.add(variantRollupKeysItem);
    return this;
  }

   /**
   * Set the variant rollup keys.
   * @return variantRollupKeys
  **/
  @javax.annotation.Nullable
  public List<String> getVariantRollupKeys() {
    return variantRollupKeys;
  }


  public void setVariantRollupKeys(List<String> variantRollupKeys) {
    this.variantRollupKeys = variantRollupKeys;
  }


  public SearchRequestDto preFilter(String preFilter) {
    
    this.preFilter = preFilter;
    return this;
  }

   /**
   * Set of the prefilter specifications value.
   * @return preFilter
  **/
  @javax.annotation.Nullable
  public String getPreFilter() {
    return preFilter;
  }


  public void setPreFilter(String preFilter) {
    this.preFilter = preFilter;
  }


  public SearchRequestDto site(String site) {
    
    this.site = site;
    return this;
  }

   /**
   * Name of site filter. If not specified, the specified area&#39;s default site will be applied if configured in Command Center. To not use default specify empty value i.e.\&quot;\&quot;.  If the site doesn&#39;t exist then the search will execute without the site filter and a warning will be provided.
   * @return site
  **/
  @javax.annotation.Nullable
  public String getSite() {
    return site;
  }


  public void setSite(String site) {
    this.site = site;
  }


  public SearchRequestDto responseMask(List<String> responseMask) {
    
    this.responseMask = responseMask;
    return this;
  }

  public SearchRequestDto addResponseMaskItem(String responseMaskItem) {
    if (this.responseMask == null) {
      this.responseMask = new ArrayList<>();
    }
    this.responseMask.add(responseMaskItem);
    return this;
  }

   /**
   * List with fields which should be included in metadata object associated with each record in response.
   * @return responseMask
  **/
  @javax.annotation.Nullable
  public List<String> getResponseMask() {
    return responseMask;
  }


  public void setResponseMask(List<String> responseMask) {
    this.responseMask = responseMask;
  }


  public SearchRequestDto pageCategories(List<String> pageCategories) {
    
    this.pageCategories = pageCategories;
    return this;
  }

  public SearchRequestDto addPageCategoriesItem(String pageCategoriesItem) {
    if (this.pageCategories == null) {
      this.pageCategories = new ArrayList<>();
    }
    this.pageCategories.add(pageCategoriesItem);
    return this;
  }

   /**
   * The categories associated with a category page. Required for category navigation queries to achieve good search quality. To represent full path of category, use &#39;&gt;&#39; sign to separate different hierarchies. If &#39;&gt;&#39; is part of the category name, please replace it with other character(s).Max item length &#x3D; 1.
   * @return pageCategories
  **/
  @javax.annotation.Nullable
  public List<String> getPageCategories() {
    return pageCategories;
  }


  public void setPageCategories(List<String> pageCategories) {
    this.pageCategories = pageCategories;
  }


  public SearchRequestDto spellCorrectionMode(SpellCorrectionMode spellCorrectionMode) {
    
    this.spellCorrectionMode = spellCorrectionMode;
    return this;
  }

   /**
   * Get spellCorrectionMode
   * @return spellCorrectionMode
  **/
  @javax.annotation.Nullable
  public SpellCorrectionMode getSpellCorrectionMode() {
    return spellCorrectionMode;
  }


  public void setSpellCorrectionMode(SpellCorrectionMode spellCorrectionMode) {
    this.spellCorrectionMode = spellCorrectionMode;
  }


  public SearchRequestDto includeExpandedResults(Boolean includeExpandedResults) {
    
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


  public SearchRequestDto pinUnexpandedResults(Boolean pinUnexpandedResults) {
    
    this.pinUnexpandedResults = pinUnexpandedResults;
    return this;
  }

   /**
   * This configuration depends on include expanded results settings. If this field is set to true,unexpanded products are always at the top of the search results, followed  by the expanded results. Default value: true
   * @return pinUnexpandedResults
  **/
  @javax.annotation.Nullable
  public Boolean getPinUnexpandedResults() {
    return pinUnexpandedResults;
  }


  public void setPinUnexpandedResults(Boolean pinUnexpandedResults) {
    this.pinUnexpandedResults = pinUnexpandedResults;
  }


  public SearchRequestDto debug(Boolean debug) {
    
    this.debug = debug;
    return this;
  }

   /**
   * Enable additional debug info in response.  Note: attaching debug info significantly affects performance. Is not supposed to be used for large requests.  
   * @return debug
  **/
  @javax.annotation.Nullable
  public Boolean getDebug() {
    return debug;
  }


  public void setDebug(Boolean debug) {
    this.debug = debug;
  }


  public SearchRequestDto facetLimit(Integer facetLimit) {
    
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


  public SearchRequestDto loginId(String loginId) {
    
    this.loginId = loginId;
    return this;
  }

   /**
   * Highly recommended for logged-in users. Unique identifier for logged-in user, such as a user name. Don&#39;t set for anonymous users.  Don&#39;t set the field to the same fixed ID for different users. This mixes the event history of those users together, which results in degraded model quality.  The field must be a UTF-8 encoded string with a length limit of 128 characters. 
   * @return loginId
  **/
  @javax.annotation.Nullable
  public String getLoginId() {
    return loginId;
  }


  public void setLoginId(String loginId) {
    this.loginId = loginId;
  }


  public SearchRequestDto overwrites(SearchRequestDtoOverwrites overwrites) {
    
    this.overwrites = overwrites;
    return this;
  }

   /**
   * Get overwrites
   * @return overwrites
  **/
  @javax.annotation.Nullable
  public SearchRequestDtoOverwrites getOverwrites() {
    return overwrites;
  }


  public void setOverwrites(SearchRequestDtoOverwrites overwrites) {
    this.overwrites = overwrites;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchRequestDto searchRequestDto = (SearchRequestDto) o;
    return Objects.equals(this.query, searchRequestDto.query) &&
        Objects.equals(this.area, searchRequestDto.area) &&
        Objects.equals(this.collection, searchRequestDto.collection) &&
        Objects.equals(this.visitorId, searchRequestDto.visitorId) &&
        Objects.equals(this.refinements, searchRequestDto.refinements) &&
        Objects.equals(this.pageSize, searchRequestDto.pageSize) &&
        Objects.equals(this.skip, searchRequestDto.skip) &&
        Objects.equals(this.biasingProfile, searchRequestDto.biasingProfile) &&
        Objects.equals(this.biasing, searchRequestDto.biasing) &&
        Objects.equals(this.customUrlParams, searchRequestDto.customUrlParams) &&
        Objects.equals(this.sorts, searchRequestDto.sorts) &&
        Objects.equals(this.includedNavigations, searchRequestDto.includedNavigations) &&
        Objects.equals(this.excludedNavigations, searchRequestDto.excludedNavigations) &&
        Objects.equals(this.dynamicFacet, searchRequestDto.dynamicFacet) &&
        Objects.equals(this.variantRollupKeys, searchRequestDto.variantRollupKeys) &&
        Objects.equals(this.preFilter, searchRequestDto.preFilter) &&
        Objects.equals(this.site, searchRequestDto.site) &&
        Objects.equals(this.responseMask, searchRequestDto.responseMask) &&
        Objects.equals(this.pageCategories, searchRequestDto.pageCategories) &&
        Objects.equals(this.spellCorrectionMode, searchRequestDto.spellCorrectionMode) &&
        Objects.equals(this.includeExpandedResults, searchRequestDto.includeExpandedResults) &&
        Objects.equals(this.pinUnexpandedResults, searchRequestDto.pinUnexpandedResults) &&
        Objects.equals(this.debug, searchRequestDto.debug) &&
        Objects.equals(this.facetLimit, searchRequestDto.facetLimit) &&
        Objects.equals(this.loginId, searchRequestDto.loginId) &&
        Objects.equals(this.overwrites, searchRequestDto.overwrites);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, area, collection, visitorId, refinements, pageSize, skip, biasingProfile, biasing, customUrlParams, sorts, includedNavigations, excludedNavigations, dynamicFacet, variantRollupKeys, preFilter, site, responseMask, pageCategories, spellCorrectionMode, includeExpandedResults, pinUnexpandedResults, debug, facetLimit, loginId, overwrites);
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
    sb.append("class SearchRequestDto {\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    collection: ").append(toIndentedString(collection)).append("\n");
    sb.append("    visitorId: ").append(toIndentedString(visitorId)).append("\n");
    sb.append("    refinements: ").append(toIndentedString(refinements)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    skip: ").append(toIndentedString(skip)).append("\n");
    sb.append("    biasingProfile: ").append(toIndentedString(biasingProfile)).append("\n");
    sb.append("    biasing: ").append(toIndentedString(biasing)).append("\n");
    sb.append("    customUrlParams: ").append(toIndentedString(customUrlParams)).append("\n");
    sb.append("    sorts: ").append(toIndentedString(sorts)).append("\n");
    sb.append("    includedNavigations: ").append(toIndentedString(includedNavigations)).append("\n");
    sb.append("    excludedNavigations: ").append(toIndentedString(excludedNavigations)).append("\n");
    sb.append("    dynamicFacet: ").append(toIndentedString(dynamicFacet)).append("\n");
    sb.append("    variantRollupKeys: ").append(toIndentedString(variantRollupKeys)).append("\n");
    sb.append("    preFilter: ").append(toIndentedString(preFilter)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    responseMask: ").append(toIndentedString(responseMask)).append("\n");
    sb.append("    pageCategories: ").append(toIndentedString(pageCategories)).append("\n");
    sb.append("    spellCorrectionMode: ").append(toIndentedString(spellCorrectionMode)).append("\n");
    sb.append("    includeExpandedResults: ").append(toIndentedString(includeExpandedResults)).append("\n");
    sb.append("    pinUnexpandedResults: ").append(toIndentedString(pinUnexpandedResults)).append("\n");
    sb.append("    debug: ").append(toIndentedString(debug)).append("\n");
    sb.append("    facetLimit: ").append(toIndentedString(facetLimit)).append("\n");
    sb.append("    loginId: ").append(toIndentedString(loginId)).append("\n");
    sb.append("    overwrites: ").append(toIndentedString(overwrites)).append("\n");
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
    openapiFields.add("query");
    openapiFields.add("area");
    openapiFields.add("collection");
    openapiFields.add("visitorId");
    openapiFields.add("refinements");
    openapiFields.add("pageSize");
    openapiFields.add("skip");
    openapiFields.add("biasingProfile");
    openapiFields.add("biasing");
    openapiFields.add("customUrlParams");
    openapiFields.add("sorts");
    openapiFields.add("includedNavigations");
    openapiFields.add("excludedNavigations");
    openapiFields.add("dynamicFacet");
    openapiFields.add("variantRollupKeys");
    openapiFields.add("preFilter");
    openapiFields.add("site");
    openapiFields.add("responseMask");
    openapiFields.add("pageCategories");
    openapiFields.add("spellCorrectionMode");
    openapiFields.add("includeExpandedResults");
    openapiFields.add("pinUnexpandedResults");
    openapiFields.add("debug");
    openapiFields.add("facetLimit");
    openapiFields.add("loginId");
    openapiFields.add("overwrites");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("refinements");
    openapiRequiredFields.add("biasing");
    openapiRequiredFields.add("customUrlParams");
    openapiRequiredFields.add("sorts");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SearchRequestDto
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SearchRequestDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchRequestDto is not found in the empty JSON string", SearchRequestDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SearchRequestDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchRequestDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SearchRequestDto.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("query") != null && !jsonObj.get("query").isJsonNull()) && !jsonObj.get("query").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `query` to be a primitive type in the JSON string but got `%s`", jsonObj.get("query").toString()));
      }
      if ((jsonObj.get("area") != null && !jsonObj.get("area").isJsonNull()) && !jsonObj.get("area").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `area` to be a primitive type in the JSON string but got `%s`", jsonObj.get("area").toString()));
      }
      if ((jsonObj.get("collection") != null && !jsonObj.get("collection").isJsonNull()) && !jsonObj.get("collection").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `collection` to be a primitive type in the JSON string but got `%s`", jsonObj.get("collection").toString()));
      }
      if ((jsonObj.get("visitorId") != null && !jsonObj.get("visitorId").isJsonNull()) && !jsonObj.get("visitorId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `visitorId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("visitorId").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("refinements").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `refinements` to be an array in the JSON string but got `%s`", jsonObj.get("refinements").toString()));
      }

      JsonArray jsonArrayrefinements = jsonObj.getAsJsonArray("refinements");
      // validate the required field `refinements` (array)
      for (int i = 0; i < jsonArrayrefinements.size(); i++) {
        SelectedRefinementDto.validateJsonElement(jsonArrayrefinements.get(i));
      };
      if ((jsonObj.get("biasingProfile") != null && !jsonObj.get("biasingProfile").isJsonNull()) && !jsonObj.get("biasingProfile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biasingProfile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biasingProfile").toString()));
      }
      // validate the required field `biasing`
      BiasingProfileDto.validateJsonElement(jsonObj.get("biasing"));
      // ensure the json data is an array
      if (!jsonObj.get("customUrlParams").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `customUrlParams` to be an array in the JSON string but got `%s`", jsonObj.get("customUrlParams").toString()));
      }

      JsonArray jsonArraycustomUrlParams = jsonObj.getAsJsonArray("customUrlParams");
      // validate the required field `customUrlParams` (array)
      for (int i = 0; i < jsonArraycustomUrlParams.size(); i++) {
        CustomParameterDto.validateJsonElement(jsonArraycustomUrlParams.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("sorts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sorts` to be an array in the JSON string but got `%s`", jsonObj.get("sorts").toString()));
      }

      JsonArray jsonArraysorts = jsonObj.getAsJsonArray("sorts");
      // validate the required field `sorts` (array)
      for (int i = 0; i < jsonArraysorts.size(); i++) {
        SortDto.validateJsonElement(jsonArraysorts.get(i));
      };
      // ensure the optional json data is an array if present
      if (jsonObj.get("includedNavigations") != null && !jsonObj.get("includedNavigations").isJsonNull() && !jsonObj.get("includedNavigations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `includedNavigations` to be an array in the JSON string but got `%s`", jsonObj.get("includedNavigations").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("excludedNavigations") != null && !jsonObj.get("excludedNavigations").isJsonNull() && !jsonObj.get("excludedNavigations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `excludedNavigations` to be an array in the JSON string but got `%s`", jsonObj.get("excludedNavigations").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("variantRollupKeys") != null && !jsonObj.get("variantRollupKeys").isJsonNull() && !jsonObj.get("variantRollupKeys").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `variantRollupKeys` to be an array in the JSON string but got `%s`", jsonObj.get("variantRollupKeys").toString()));
      }
      if ((jsonObj.get("preFilter") != null && !jsonObj.get("preFilter").isJsonNull()) && !jsonObj.get("preFilter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `preFilter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("preFilter").toString()));
      }
      if ((jsonObj.get("site") != null && !jsonObj.get("site").isJsonNull()) && !jsonObj.get("site").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `site` to be a primitive type in the JSON string but got `%s`", jsonObj.get("site").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("responseMask") != null && !jsonObj.get("responseMask").isJsonNull() && !jsonObj.get("responseMask").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `responseMask` to be an array in the JSON string but got `%s`", jsonObj.get("responseMask").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("pageCategories") != null && !jsonObj.get("pageCategories").isJsonNull() && !jsonObj.get("pageCategories").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `pageCategories` to be an array in the JSON string but got `%s`", jsonObj.get("pageCategories").toString()));
      }
      // validate the optional field `spellCorrectionMode`
      if (jsonObj.get("spellCorrectionMode") != null && !jsonObj.get("spellCorrectionMode").isJsonNull()) {
        SpellCorrectionMode.validateJsonElement(jsonObj.get("spellCorrectionMode"));
      }
      if ((jsonObj.get("loginId") != null && !jsonObj.get("loginId").isJsonNull()) && !jsonObj.get("loginId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `loginId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("loginId").toString()));
      }
      // validate the optional field `overwrites`
      if (jsonObj.get("overwrites") != null && !jsonObj.get("overwrites").isJsonNull()) {
        SearchRequestDtoOverwrites.validateJsonElement(jsonObj.get("overwrites"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchRequestDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchRequestDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchRequestDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchRequestDto.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchRequestDto>() {
           @Override
           public void write(JsonWriter out, SearchRequestDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchRequestDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchRequestDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchRequestDto
  * @throws IOException if the JSON string is invalid with respect to SearchRequestDto
  */
  public static SearchRequestDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchRequestDto.class);
  }

 /**
  * Convert an instance of SearchRequestDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

