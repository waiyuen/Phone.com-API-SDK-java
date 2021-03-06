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
import io.swagger.client.model.ListCallLogsFull;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CalllogsApi
 */
@Ignore
public class CalllogsApiTest {

    private final CalllogsApi api = new CalllogsApi();

    
    /**
     * Get a list of call details associated with your account
     *
     * Fetch a list of call logs associated with your account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAccountCallLogsTest() throws ApiException {
        Integer accountId = 1315091;
        List<String> filtersId = null;
        List<String> filtersStartTime = null;
        String filtersCreatedAt = null;
        String filtersDirection = null;
        String filtersCalledNumber = null;
        String filtersType = null;
        String filtersExtension = null;
        String sortId = null;
        String sortStartTime = null;
        String sortCreatedAt = null;
        Integer limit = null;
        Integer offset = null;
        String fields = null;
        ListCallLogsFull response = api.listAccountCallLogs(accountId, filtersId, filtersStartTime, filtersCreatedAt, filtersDirection, filtersCalledNumber, filtersType, filtersExtension, sortId, sortStartTime, sortCreatedAt, limit, offset, fields);

        // TODO: test validations
    }
    
}
