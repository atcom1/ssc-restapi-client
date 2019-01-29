/*
 * Fortify Software Security Center API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1:18.20
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.fortify.ssc.restclient.api;

import com.fortify.ssc.restclient.ApiException;
import com.fortify.ssc.restclient.model.ApiResult;
import com.fortify.ssc.restclient.model.ApiResultListPermission;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PermissionRequiredByPermissionControllerApi
 */
@Ignore
public class PermissionRequiredByPermissionControllerApiTest {

    private final PermissionRequiredByPermissionControllerApi api = new PermissionRequiredByPermissionControllerApi();

    
    /**
     * list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPermissionRequiredByPermissionTest() throws ApiException {
        String parentId = null;
        String fields = null;
        Integer start = null;
        Integer limit = null;
        ApiResultListPermission response = api.listPermissionRequiredByPermission(parentId, fields, start, limit);

        // TODO: test validations
    }
    
}