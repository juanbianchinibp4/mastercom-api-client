# ClaimsApi

All URIs are relative to *https://api.mastercard.com/mastercom*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createClaim**](ClaimsApi.md#createClaim) | **POST** /v6/claims |  |
| [**getClaimDetail**](ClaimsApi.md#getClaimDetail) | **GET** /v6/claims/{claim-id} |  |
| [**updateClaim**](ClaimsApi.md#updateClaim) | **PUT** /v6/claims/{claim-id} |  |


<a id="createClaim"></a>
# **createClaim**
> ClaimResponse createClaim(body)



Issuers use this endpoint to create a new claim, which is required before creating a retrieval request or a first chargeback. If an issuer attempts to create a duplicate claim on an original transaction, the issuer receives a error message with the claim ID of the existing claim. Acquirers are not able to create claims. They receive claims from disputes that issuers initiate.   Note: issuers must have a first presentment in order to create a claim.   Note: issuers cannot create claims on first presentments that acquirers have reversed.

### Example
```java
// Import classes:
import bp4.mastercom_api_client.ApiClient;
import bp4.mastercom_api_client.ApiException;
import bp4.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import bp4.mastercom_api_client.api.ClaimsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    ClaimsApi apiInstance = new ClaimsApi(defaultClient);
    CreateClaimRequest body = new CreateClaimRequest(); // CreateClaimRequest | Create Claim Request
    try {
      ClaimResponse result = apiInstance.createClaim(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClaimsApi#createClaim");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**CreateClaimRequest**](CreateClaimRequest.md)| Create Claim Request | |

### Return type

[**ClaimResponse**](ClaimResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal Server Error |  -  |

<a id="getClaimDetail"></a>
# **getClaimDetail**
> ClaimDetail getClaimDetail(claimId)



Issuers and acquirers use this endpoint to retrieve details for an existing claim, including any cases with which the claim is associated.   Note: the Retrieve endpoint for claims contains document statuses (completed, pending, failed, unavailable, and document not applicable) for all documents attached to dispute events within a claim. Issuers and acquirers do not have to make a separate call to obtain document statuses, making the use of this endpoint efficient.

### Example
```java
// Import classes:
import bp4.mastercom_api_client.ApiClient;
import bp4.mastercom_api_client.ApiException;
import bp4.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import bp4.mastercom_api_client.api.ClaimsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    ClaimsApi apiInstance = new ClaimsApi(defaultClient);
    String claimId = "200002020654"; // String | Claim Id.   Length: 1-19   Valid Values/Format: Numeric
    try {
      ClaimDetail result = apiInstance.getClaimDetail(claimId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClaimsApi#getClaimDetail");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **claimId** | **String**| Claim Id.   Length: 1-19   Valid Values/Format: Numeric | |

### Return type

[**ClaimDetail**](ClaimDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal Server Error |  -  |

<a id="updateClaim"></a>
# **updateClaim**
> ClaimResponse updateClaim(claimId, body)



Issuers use this endpoint to take an action (reopen or close) on an existing claim.

### Example
```java
// Import classes:
import bp4.mastercom_api_client.ApiClient;
import bp4.mastercom_api_client.ApiException;
import bp4.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import bp4.mastercom_api_client.api.ClaimsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    ClaimsApi apiInstance = new ClaimsApi(defaultClient);
    String claimId = "200002020654"; // String | Claim Id.   Length: 1-19   Valid Values/Format: Numeric
    UpdateClaimRequest body = new UpdateClaimRequest(); // UpdateClaimRequest | Update Claim Request
    try {
      ClaimResponse result = apiInstance.updateClaim(claimId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClaimsApi#updateClaim");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **claimId** | **String**| Claim Id.   Length: 1-19   Valid Values/Format: Numeric | |
| **body** | [**UpdateClaimRequest**](UpdateClaimRequest.md)| Update Claim Request | |

### Return type

[**ClaimResponse**](ClaimResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal Server Error |  -  |

