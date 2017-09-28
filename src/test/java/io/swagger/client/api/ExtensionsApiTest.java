/*
 * Phone.com API
 * This is a Phone.com api Swagger definition
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apisupport@phone.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.CreateExtensionParams;
import io.swagger.client.model.ExtensionFull;
import io.swagger.client.model.ListExtensionsFull;
import io.swagger.client.model.ReplaceExtensionParams;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExtensionsApi
 */
@Ignore
public class ExtensionsApiTest {

    private final ExtensionsApi api = new ExtensionsApi();

    
    /**
     * Create an individual extension
     *
     * This service shows how to create a virtual extension.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAccountExtensionTest() throws ApiException {
        Integer accountId = 1315091;
        CreateExtensionParams data = null;
        ExtensionFull response = api.createAccountExtension(accountId, data);

        // TODO: test validations
    }
    
    /**
     * Show details of an individual extension
     *
     * This service shows the details of an individual Extension.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountExtensionTest() throws ApiException {
        Integer accountId = 1315091;
        Integer extensionId = 1764590;
        ExtensionFull response = api.getAccountExtension(accountId, extensionId);

        // TODO: test validations
    }
    
    /**
     * Get a list of extensions visible to the authenticated user or client
     *
     * This service lists the visible extensions on a given account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAccountExtensionsTest() throws ApiException {
        Integer accountId = 1315091;
        List<String> filtersId = null;
        List<String> filtersExtension = null;
        List<String> filtersName = null;
        String sortId = null;
        String sortExtension = null;
        String sortName = null;
        Integer limit = null;
        Integer offset = null;
        String fields = null;
        ListExtensionsFull response = api.listAccountExtensions(accountId, filtersId, filtersExtension, filtersName, sortId, sortExtension, sortName, limit, offset, fields);

        // TODO: test validations
    }
    
    /**
     * Replace an individual extension
     *
     * This service shows how to update an individual extension.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceAccountExtensionTest() throws ApiException {
        Integer accountId = 1315091;
        Integer extensionId = 1764590;
        ReplaceExtensionParams data = null;
        ExtensionFull response = api.replaceAccountExtension(accountId, extensionId, data);

        // TODO: test validations
    }
    
}
