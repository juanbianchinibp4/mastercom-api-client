/*
 * MasterCom
 * MasterCom
 *
 * The version of the OpenAPI document: v6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package fiserv.mastercom_api_client.api;

import fiserv.mastercom_api_client.ApiException;
import fiserv.mastercom_api_client.model.HealthCheckResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * API tests for HealthCheckApi
 */
@Disabled
public class HealthCheckApiTest {

    private final HealthCheckApi api = new HealthCheckApi();

    /**
     * This resource retrieves the status of the Mastercom API suite.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void healthcheckTest() throws ApiException {
        HealthCheckResponse response = api.healthcheck();
        // TODO: test validations
    }

}