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
import com.fortify.ssc.restclient.model.ApiCollectionActionlong;
import com.fortify.ssc.restclient.model.ApiResult;
import com.fortify.ssc.restclient.model.ApiResultApiActionResponse;
import com.fortify.ssc.restclient.model.ApiResultListProjectVersion;
import com.fortify.ssc.restclient.model.ApiResultVoid;
import com.fortify.ssc.restclient.model.ProjectVersionAuthEntityAssignRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectVersionOfAuthEntityControllerApi
 */
@Ignore
public class ProjectVersionOfAuthEntityControllerApiTest {

    private final ProjectVersionOfAuthEntityControllerApi api = new ProjectVersionOfAuthEntityControllerApi();

    
    /**
     * assign
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void assignProjectVersionOfAuthEntityTest() throws ApiException {
        Long parentId = null;
        ProjectVersionAuthEntityAssignRequest resource = null;
        ApiResultVoid response = api.assignProjectVersionOfAuthEntity(parentId, resource);

        // TODO: test validations
    }
    
    /**
     * doAction
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void doActionProjectVersionOfAuthEntityTest() throws ApiException {
        Long parentId = null;
        ApiCollectionActionlong collectionAction = null;
        ApiResultApiActionResponse response = api.doActionProjectVersionOfAuthEntity(parentId, collectionAction);

        // TODO: test validations
    }
    
    /**
     * list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listProjectVersionOfAuthEntityTest() throws ApiException {
        Long parentId = null;
        Integer start = null;
        Integer limit = null;
        String q = null;
        String fields = null;
        ApiResultListProjectVersion response = api.listProjectVersionOfAuthEntity(parentId, start, limit, q, fields);

        // TODO: test validations
    }
    
    /**
     * multiDelete
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void multiDeleteProjectVersionOfAuthEntityTest() throws ApiException {
        Long parentId = null;
        String ids = null;
        ApiResultVoid response = api.multiDeleteProjectVersionOfAuthEntity(parentId, ids);

        // TODO: test validations
    }
    
    /**
     * update
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateProjectVersionOfAuthEntityTest() throws ApiException {
        Long parentId = null;
        List<Long> resources = null;
        ApiResultListProjectVersion response = api.updateProjectVersionOfAuthEntity(parentId, resources);

        // TODO: test validations
    }
    
}
