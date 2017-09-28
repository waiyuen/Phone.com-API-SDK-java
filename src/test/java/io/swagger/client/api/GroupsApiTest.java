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
import io.swagger.client.model.CreateGroupParams;
import io.swagger.client.model.DeleteGroup;
import io.swagger.client.model.GroupFull;
import io.swagger.client.model.ListGroupsFull;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GroupsApi
 */
@Ignore
public class GroupsApiTest {

    private final GroupsApi api = new GroupsApi();

    
    /**
     * 
     *
     * See Account Contact Groups for more info on the properties.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAccountExtensionContactGroupTest() throws ApiException {
        Integer accountId = 1315091;
        Integer extensionId = 1764590;
        CreateGroupParams data = null;
        GroupFull response = api.createAccountExtensionContactGroup(accountId, extensionId, data);

        // TODO: test validations
    }
    
    /**
     * Delete an addressbook group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAccountExtensionContactGroupTest() throws ApiException {
        Integer accountId = 1315091;
        Integer extensionId = 1764590;
        Integer groupId = null;
        DeleteGroup response = api.deleteAccountExtensionContactGroup(accountId, extensionId, groupId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * See Account Contact Groups for more info on the properties.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountExtensionContactGroupTest() throws ApiException {
        Integer accountId = 1315091;
        Integer extensionId = 1764590;
        Integer groupId = null;
        GroupFull response = api.getAccountExtensionContactGroup(accountId, extensionId, groupId);

        // TODO: test validations
    }
    
    /**
     * Show a list of contact groups belonging to an extension
     *
     * See Account Contact Groups for details on the properties.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAccountExtensionContactGroupsTest() throws ApiException {
        Integer accountId = 1315091;
        Integer extensionId = 1764590;
        List<String> filtersId = null;
        List<String> filtersName = null;
        String sortId = null;
        String sortName = null;
        Integer limit = null;
        Integer offset = null;
        String fields = null;
        ListGroupsFull response = api.listAccountExtensionContactGroups(accountId, extensionId, filtersId, filtersName, sortId, sortName, limit, offset, fields);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * See Account Contact Groups for more info on the properties.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceAccountExtensionContactGroupTest() throws ApiException {
        Integer accountId = 1315091;
        Integer extensionId = 1764590;
        Integer groupId = null;
        GroupFull response = api.replaceAccountExtensionContactGroup(accountId, extensionId, groupId);

        // TODO: test validations
    }
    
}
