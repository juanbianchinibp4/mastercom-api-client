# FeesDebitMasterCardAndEuropeDualAcquirerApi

All URIs are relative to *https://api.mastercard.com/mastercom*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFeeDebitMC**](FeesDebitMasterCardAndEuropeDualAcquirerApi.md#createFeeDebitMC) | **POST** /v6/claims/{claim-id}/fee/debitmc |  |


<a id="createFeeDebitMC"></a>
# **createFeeDebitMC**
> FeeSingleResponse createFeeDebitMC(claimId, body)



Senders (issuers) use this endpoint to create a fee collection for receivers (acquirers) for Mastercard Debit or Europe Dual Acquirer. Receivers use this endpoint to reply to a fee collection.   Note: Senders should create fee collections using this endpoint only (a) when permitted by chargeback rules and (b) when the fee collections are related to disputes.

### Example
```java
// Import classes:
import fiserv.mastercom_api_client.ApiClient;
import fiserv.mastercom_api_client.ApiException;
import fiserv.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import api.fiserv.mastercom_api_client.FeesDebitMasterCardAndEuropeDualAcquirerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    FeesDebitMasterCardAndEuropeDualAcquirerApi apiInstance = new FeesDebitMasterCardAndEuropeDualAcquirerApi(defaultClient);
    String claimId = "200002020654"; // String | Claim Id for the fee item.   Length: 1-19   Valid Values/Format: Numeric
    CreateFeeRequestSingle body = new CreateFeeRequestSingle(); // CreateFeeRequestSingle | Create Fee Request
    try {
      FeeSingleResponse result = apiInstance.createFeeDebitMC(claimId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeesDebitMasterCardAndEuropeDualAcquirerApi#createFeeDebitMC");
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
| **claimId** | **String**| Claim Id for the fee item.   Length: 1-19   Valid Values/Format: Numeric | |
| **body** | [**CreateFeeRequestSingle**](CreateFeeRequestSingle.md)| Create Fee Request | |

### Return type

[**FeeSingleResponse**](FeeSingleResponse.md)

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

