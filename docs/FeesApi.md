# FeesApi

All URIs are relative to *https://api.mastercard.com/mastercom*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFee**](FeesApi.md#createFee) | **POST** /v6/claims/{claim-id}/fee |  |
| [**getDataForCreateFee**](FeesApi.md#getDataForCreateFee) | **POST** /v6/claims/{claim-id}/fees/loaddataforfees |  |


<a id="createFee"></a>
# **createFee**
> FeeResponse createFee(claimId, body)



Senders (issuers or acquirers) use this endpoint to create a fee collection for receivers (issuers or acquirers). Receivers use this endpoint to reply to a fee collection.   Note: Senders should create fee collections using this endpoint only (a) when permitted by chargeback rules and (b) when the fee collections are related to disputes.

### Example
```java
// Import classes:
import bp4.mastercom_api_client.ApiClient;
import bp4.mastercom_api_client.ApiException;
import bp4.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import bp4.mastercom_api_client.api.FeesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    FeesApi apiInstance = new FeesApi(defaultClient);
    String claimId = "200002020654"; // String | Claim Id for the Fee item.   Length: 1-19   Valid Values/Format: Numeric
    CreateFeeRequest body = new CreateFeeRequest(); // CreateFeeRequest | Create Fee Request
    try {
      FeeResponse result = apiInstance.createFee(claimId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeesApi#createFee");
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
| **claimId** | **String**| Claim Id for the Fee item.   Length: 1-19   Valid Values/Format: Numeric | |
| **body** | [**CreateFeeRequest**](CreateFeeRequest.md)| Create Fee Request | |

### Return type

[**FeeResponse**](FeeResponse.md)

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

<a id="getDataForCreateFee"></a>
# **getDataForCreateFee**
> LoadDataForFeeResponse getDataForCreateFee(claimId, body)



Senders (issuers or acquirers) use this endpoint to obtain information about a potential fee collection associated with a claim.

### Example
```java
// Import classes:
import bp4.mastercom_api_client.ApiClient;
import bp4.mastercom_api_client.ApiException;
import bp4.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import bp4.mastercom_api_client.api.FeesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    FeesApi apiInstance = new FeesApi(defaultClient);
    String claimId = "200002020654"; // String | Claim Id for the Fee.   Length: 1-19   Valid Values/Format: Numeric
    LoadDataForFeesRequest body = new LoadDataForFeesRequest(); // LoadDataForFeesRequest | Load Data For Fee Request
    try {
      LoadDataForFeeResponse result = apiInstance.getDataForCreateFee(claimId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeesApi#getDataForCreateFee");
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
| **claimId** | **String**| Claim Id for the Fee.   Length: 1-19   Valid Values/Format: Numeric | |
| **body** | [**LoadDataForFeesRequest**](LoadDataForFeesRequest.md)| Load Data For Fee Request | |

### Return type

[**LoadDataForFeeResponse**](LoadDataForFeeResponse.md)

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

