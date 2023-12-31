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


package com.groupbyinc.retailapi.api;

import com.groupbyinc.retailapi.ApiException;
import com.groupbyinc.retailapi.model.ErrorResponse;
import com.groupbyinc.retailapi.model.Identity;
import com.groupbyinc.retailapi.model.Merchandiser;
import com.groupbyinc.retailapi.model.Request;
import com.groupbyinc.retailapi.model.SearchResults;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AutocompleteApi
 */
@Disabled
public class AutocompleteApiTest {

    private final AutocompleteApi api = new AutocompleteApi();

    /**
     * A simple request used to get completes the specified prefix with keyword suggestions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void autocompletesearchTest() throws ApiException {
        String xGroupbyCustomerId = null;
        Identity identity = null;
        Merchandiser merchandiser = null;
        Request request = null;
        SearchResults response = api.autocompletesearch(xGroupbyCustomerId, identity, merchandiser, request);
        // TODO: test validations
    }

}
