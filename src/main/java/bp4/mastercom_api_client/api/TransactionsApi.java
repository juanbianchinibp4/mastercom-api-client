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


package bp4.mastercom_api_client.api;

import bp4.mastercom_api_client.ApiCallback;
import bp4.mastercom_api_client.ApiClient;
import bp4.mastercom_api_client.ApiException;
import bp4.mastercom_api_client.ApiResponse;
import bp4.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.Pair;
import bp4.mastercom_api_client.ProgressRequestBody;
import bp4.mastercom_api_client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import bp4.mastercom_api_client.model.AuthorizationDetail;
import bp4.mastercom_api_client.model.ClearingDetail;
import bp4.mastercom_api_client.model.Errors;
import bp4.mastercom_api_client.model.TransactionSearchRequest;
import bp4.mastercom_api_client.model.TransactionSummary;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TransactionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TransactionsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getTransactionClearingDetail
     * @param claimId Claim Id.   Length: 1-19   Valid Values/Format: Numeric (required)
     * @param transactionId Clearing transaction id.   Length: N/A   Valid Values/Format: Alphanumeric, Special Char (~!@#$%^&amp;*()_+{}|:\&quot;&lt;&gt;?,./;&#39;[]-&#x3D;) (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTransactionClearingDetailCall(String claimId, String transactionId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v6/claims/{claim-id}/transactions/clearing/{transaction-id}"
            .replace("{" + "claim-id" + "}", localVarApiClient.escapeString(claimId.toString()))
            .replace("{" + "transaction-id" + "}", localVarApiClient.escapeString(transactionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getTransactionClearingDetailValidateBeforeCall(String claimId, String transactionId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'claimId' is set
        if (claimId == null) {
            throw new ApiException("Missing the required parameter 'claimId' when calling getTransactionClearingDetail(Async)");
        }

        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new ApiException("Missing the required parameter 'transactionId' when calling getTransactionClearingDetail(Async)");
        }

        return getTransactionClearingDetailCall(claimId, transactionId, _callback);

    }

    /**
     * 
     * After an issuer creates a claim, the issuer uses this endpoint to retrieve clearing details for the original transaction involved in the claim. Acquirers may also use this endpoint to retrieve clearing details associated with an original transaction.
     * @param claimId Claim Id.   Length: 1-19   Valid Values/Format: Numeric (required)
     * @param transactionId Clearing transaction id.   Length: N/A   Valid Values/Format: Alphanumeric, Special Char (~!@#$%^&amp;*()_+{}|:\&quot;&lt;&gt;?,./;&#39;[]-&#x3D;) (required)
     * @return ClearingDetail
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ClearingDetail getTransactionClearingDetail(String claimId, String transactionId) throws ApiException {
        ApiResponse<ClearingDetail> localVarResp = getTransactionClearingDetailWithHttpInfo(claimId, transactionId);
        return localVarResp.getData();
    }

    /**
     * 
     * After an issuer creates a claim, the issuer uses this endpoint to retrieve clearing details for the original transaction involved in the claim. Acquirers may also use this endpoint to retrieve clearing details associated with an original transaction.
     * @param claimId Claim Id.   Length: 1-19   Valid Values/Format: Numeric (required)
     * @param transactionId Clearing transaction id.   Length: N/A   Valid Values/Format: Alphanumeric, Special Char (~!@#$%^&amp;*()_+{}|:\&quot;&lt;&gt;?,./;&#39;[]-&#x3D;) (required)
     * @return ApiResponse&lt;ClearingDetail&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ClearingDetail> getTransactionClearingDetailWithHttpInfo(String claimId, String transactionId) throws ApiException {
        okhttp3.Call localVarCall = getTransactionClearingDetailValidateBeforeCall(claimId, transactionId, null);
        Type localVarReturnType = new TypeToken<ClearingDetail>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * After an issuer creates a claim, the issuer uses this endpoint to retrieve clearing details for the original transaction involved in the claim. Acquirers may also use this endpoint to retrieve clearing details associated with an original transaction.
     * @param claimId Claim Id.   Length: 1-19   Valid Values/Format: Numeric (required)
     * @param transactionId Clearing transaction id.   Length: N/A   Valid Values/Format: Alphanumeric, Special Char (~!@#$%^&amp;*()_+{}|:\&quot;&lt;&gt;?,./;&#39;[]-&#x3D;) (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTransactionClearingDetailAsync(String claimId, String transactionId, final ApiCallback<ClearingDetail> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTransactionClearingDetailValidateBeforeCall(claimId, transactionId, _callback);
        Type localVarReturnType = new TypeToken<ClearingDetail>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for retrieveAuthorizationDetail
     * @param claimId Claim Id.   Length: 1-19   Valid Values/Format: Numeric (required)
     * @param transactionId The Authorization Transaction Identifier from Authorization Summary Results.   Length: N/A   Valid Values/Format: Alphanumeric, Special Char (~!@#$%^&amp;*()_+{}|:\&quot;&lt;&gt;?,./;&#39;[]-&#x3D;) (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call retrieveAuthorizationDetailCall(String claimId, String transactionId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v6/claims/{claim-id}/transactions/authorization/{transaction-id}"
            .replace("{" + "claim-id" + "}", localVarApiClient.escapeString(claimId.toString()))
            .replace("{" + "transaction-id" + "}", localVarApiClient.escapeString(transactionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call retrieveAuthorizationDetailValidateBeforeCall(String claimId, String transactionId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'claimId' is set
        if (claimId == null) {
            throw new ApiException("Missing the required parameter 'claimId' when calling retrieveAuthorizationDetail(Async)");
        }

        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new ApiException("Missing the required parameter 'transactionId' when calling retrieveAuthorizationDetail(Async)");
        }

        return retrieveAuthorizationDetailCall(claimId, transactionId, _callback);

    }

    /**
     * 
     * After an issuer creates a claim, the issuer uses this endpoint to retrieve authorization details for the original transaction involved in the claim.
     * @param claimId Claim Id.   Length: 1-19   Valid Values/Format: Numeric (required)
     * @param transactionId The Authorization Transaction Identifier from Authorization Summary Results.   Length: N/A   Valid Values/Format: Alphanumeric, Special Char (~!@#$%^&amp;*()_+{}|:\&quot;&lt;&gt;?,./;&#39;[]-&#x3D;) (required)
     * @return AuthorizationDetail
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public AuthorizationDetail retrieveAuthorizationDetail(String claimId, String transactionId) throws ApiException {
        ApiResponse<AuthorizationDetail> localVarResp = retrieveAuthorizationDetailWithHttpInfo(claimId, transactionId);
        return localVarResp.getData();
    }

    /**
     * 
     * After an issuer creates a claim, the issuer uses this endpoint to retrieve authorization details for the original transaction involved in the claim.
     * @param claimId Claim Id.   Length: 1-19   Valid Values/Format: Numeric (required)
     * @param transactionId The Authorization Transaction Identifier from Authorization Summary Results.   Length: N/A   Valid Values/Format: Alphanumeric, Special Char (~!@#$%^&amp;*()_+{}|:\&quot;&lt;&gt;?,./;&#39;[]-&#x3D;) (required)
     * @return ApiResponse&lt;AuthorizationDetail&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AuthorizationDetail> retrieveAuthorizationDetailWithHttpInfo(String claimId, String transactionId) throws ApiException {
        okhttp3.Call localVarCall = retrieveAuthorizationDetailValidateBeforeCall(claimId, transactionId, null);
        Type localVarReturnType = new TypeToken<AuthorizationDetail>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * After an issuer creates a claim, the issuer uses this endpoint to retrieve authorization details for the original transaction involved in the claim.
     * @param claimId Claim Id.   Length: 1-19   Valid Values/Format: Numeric (required)
     * @param transactionId The Authorization Transaction Identifier from Authorization Summary Results.   Length: N/A   Valid Values/Format: Alphanumeric, Special Char (~!@#$%^&amp;*()_+{}|:\&quot;&lt;&gt;?,./;&#39;[]-&#x3D;) (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call retrieveAuthorizationDetailAsync(String claimId, String transactionId, final ApiCallback<AuthorizationDetail> _callback) throws ApiException {

        okhttp3.Call localVarCall = retrieveAuthorizationDetailValidateBeforeCall(claimId, transactionId, _callback);
        Type localVarReturnType = new TypeToken<AuthorizationDetail>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for transactionSearch
     * @param body Transaction Search Request (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call transactionSearchCall(TransactionSearchRequest body, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/v6/transactions/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call transactionSearchValidateBeforeCall(TransactionSearchRequest body, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling transactionSearch(Async)");
        }

        return transactionSearchCall(body, _callback);

    }

    /**
     * 
     * An issuer uses this endpoint to search for information about an original transaction. An issuer may use this information to take an action on the original transaction, such as creating a claim.   Note: Mastercom retrieves transactions normally when the clearing occurs within 150 days of authorization. To find late presentments and Brazilian installment transactions, provide the acquirer reference number (ARN) and the clearing date associated with the ARN of the first presentment in the request.
     * @param body Transaction Search Request (required)
     * @return TransactionSummary
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public TransactionSummary transactionSearch(TransactionSearchRequest body) throws ApiException {
        ApiResponse<TransactionSummary> localVarResp = transactionSearchWithHttpInfo(body);
        return localVarResp.getData();
    }

    /**
     * 
     * An issuer uses this endpoint to search for information about an original transaction. An issuer may use this information to take an action on the original transaction, such as creating a claim.   Note: Mastercom retrieves transactions normally when the clearing occurs within 150 days of authorization. To find late presentments and Brazilian installment transactions, provide the acquirer reference number (ARN) and the clearing date associated with the ARN of the first presentment in the request.
     * @param body Transaction Search Request (required)
     * @return ApiResponse&lt;TransactionSummary&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TransactionSummary> transactionSearchWithHttpInfo(TransactionSearchRequest body) throws ApiException {
        okhttp3.Call localVarCall = transactionSearchValidateBeforeCall(body, null);
        Type localVarReturnType = new TypeToken<TransactionSummary>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * An issuer uses this endpoint to search for information about an original transaction. An issuer may use this information to take an action on the original transaction, such as creating a claim.   Note: Mastercom retrieves transactions normally when the clearing occurs within 150 days of authorization. To find late presentments and Brazilian installment transactions, provide the acquirer reference number (ARN) and the clearing date associated with the ARN of the first presentment in the request.
     * @param body Transaction Search Request (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call transactionSearchAsync(TransactionSearchRequest body, final ApiCallback<TransactionSummary> _callback) throws ApiException {

        okhttp3.Call localVarCall = transactionSearchValidateBeforeCall(body, _callback);
        Type localVarReturnType = new TypeToken<TransactionSummary>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
