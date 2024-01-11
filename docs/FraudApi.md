# FraudApi

All URIs are relative to *https://api.mastercard.com/mastercom*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFraudMasterCard**](FraudApi.md#createFraudMasterCard) | **POST** /v6/claims/{claim-id}/fraud/mastercard |  |
| [**getDataForCreateFraud**](FraudApi.md#getDataForCreateFraud) | **GET** /v6/claims/{claim-id}/fraud/loaddataforfraud |  |


<a id="createFraudMasterCard"></a>
# **createFraudMasterCard**
> FraudResponse createFraudMasterCard(claimId, body)



An issuer uses this endpoint to create a new fraud item when the issuer determines that a transaction was fraudulent.   Note: Mastercom allows issuers to create fraud items in the Fraud and Loss database. However, issuers must use the Fraud and Loss application to make further updates to fraud items.

### Example
```java
// Import classes:
import fiserv.mastercom_api_client.ApiClient;
import fiserv.mastercom_api_client.ApiException;
import fiserv.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import api.fiserv.mastercom_api_client.FraudApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    FraudApi apiInstance = new FraudApi(defaultClient);
    String claimId = "200002020654"; // String | Claim Id for the fraud item.   Length: 1-19   Valid Values/Format: Numeric
    CreateFraudMasterCardRequest body = new CreateFraudMasterCardRequest(); // CreateFraudMasterCardRequest | Create Fraud MasterCard Request
    try {
      FraudResponse result = apiInstance.createFraudMasterCard(claimId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FraudApi#createFraudMasterCard");
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
| **claimId** | **String**| Claim Id for the fraud item.   Length: 1-19   Valid Values/Format: Numeric | |
| **body** | [**CreateFraudMasterCardRequest**](CreateFraudMasterCardRequest.md)| Create Fraud MasterCard Request | |

### Return type

[**FraudResponse**](FraudResponse.md)

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

<a id="getDataForCreateFraud"></a>
# **getDataForCreateFraud**
> LoadDataForFraudResponse getDataForCreateFraud(claimId)



Issuers use this endpoint to obtain fraud-related information associated with a claim before creating a fraud item for the claim.

### Example
```java
// Import classes:
import fiserv.mastercom_api_client.ApiClient;
import fiserv.mastercom_api_client.ApiException;
import fiserv.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import api.fiserv.mastercom_api_client.FraudApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    FraudApi apiInstance = new FraudApi(defaultClient);
    String claimId = "200002020654"; // String | Claim Id for the fraud item.   Length: 1-19   Valid Values/Format: Numeric
    try {
      LoadDataForFraudResponse result = apiInstance.getDataForCreateFraud(claimId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FraudApi#getDataForCreateFraud");
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
| **claimId** | **String**| Claim Id for the fraud item.   Length: 1-19   Valid Values/Format: Numeric | |

### Return type

[**LoadDataForFraudResponse**](LoadDataForFraudResponse.md)

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

