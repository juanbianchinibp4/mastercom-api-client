# TransactionsApi

All URIs are relative to *https://api.mastercard.com/mastercom*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTransactionClearingDetail**](TransactionsApi.md#getTransactionClearingDetail) | **GET** /v6/claims/{claim-id}/transactions/clearing/{transaction-id} |  |
| [**retrieveAuthorizationDetail**](TransactionsApi.md#retrieveAuthorizationDetail) | **GET** /v6/claims/{claim-id}/transactions/authorization/{transaction-id} |  |
| [**transactionSearch**](TransactionsApi.md#transactionSearch) | **POST** /v6/transactions/search |  |


<a id="getTransactionClearingDetail"></a>
# **getTransactionClearingDetail**
> ClearingDetail getTransactionClearingDetail(claimId, transactionId)



After an issuer creates a claim, the issuer uses this endpoint to retrieve clearing details for the original transaction involved in the claim. Acquirers may also use this endpoint to retrieve clearing details associated with an original transaction.

### Example
```java
// Import classes:
import fiserv.mastercom_api_client.ApiClient;
import fiserv.mastercom_api_client.ApiException;
import fiserv.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import api.fiserv.mastercom_api_client.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    String claimId = "200002020654"; // String | Claim Id.   Length: 1-19   Valid Values/Format: Numeric
    String transactionId = "FIEaEgnM3bwPijwZgjc3Te+Y0ieLbN9ijUugqNSvJmVbO1xs6Jh5iIlmpOpkbax79L8Yj1rBOWBACx+Vj17rzvOepWobpgWNJNdsgHB4ag"; // String | Clearing transaction id.   Length: N/A   Valid Values/Format: Alphanumeric, Special Char (~!@#$%^&*()_+{}|:\"<>?,./;'[]-=)
    try {
      ClearingDetail result = apiInstance.getTransactionClearingDetail(claimId, transactionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#getTransactionClearingDetail");
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
| **transactionId** | **String**| Clearing transaction id.   Length: N/A   Valid Values/Format: Alphanumeric, Special Char (~!@#$%^&amp;*()_+{}|:\&quot;&lt;&gt;?,./;&#39;[]-&#x3D;) | |

### Return type

[**ClearingDetail**](ClearingDetail.md)

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

<a id="retrieveAuthorizationDetail"></a>
# **retrieveAuthorizationDetail**
> AuthorizationDetail retrieveAuthorizationDetail(claimId, transactionId)



After an issuer creates a claim, the issuer uses this endpoint to retrieve authorization details for the original transaction involved in the claim.

### Example
```java
// Import classes:
import fiserv.mastercom_api_client.ApiClient;
import fiserv.mastercom_api_client.ApiException;
import fiserv.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import api.fiserv.mastercom_api_client.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    String claimId = "200002020654"; // String | Claim Id.   Length: 1-19   Valid Values/Format: Numeric
    String transactionId = "FIEaEgnM3bwPijwZgjc3Te+Y0ieLbN9ijUugqNSvJmVbO1xs6Jh5iIlmpOpkbax79L8Yj1rBOWBACx+Vj17rzvOepWobpgWNJNdsgHB4ag"; // String | The Authorization Transaction Identifier from Authorization Summary Results.   Length: N/A   Valid Values/Format: Alphanumeric, Special Char (~!@#$%^&*()_+{}|:\"<>?,./;'[]-=)
    try {
      AuthorizationDetail result = apiInstance.retrieveAuthorizationDetail(claimId, transactionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#retrieveAuthorizationDetail");
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
| **transactionId** | **String**| The Authorization Transaction Identifier from Authorization Summary Results.   Length: N/A   Valid Values/Format: Alphanumeric, Special Char (~!@#$%^&amp;*()_+{}|:\&quot;&lt;&gt;?,./;&#39;[]-&#x3D;) | |

### Return type

[**AuthorizationDetail**](AuthorizationDetail.md)

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

<a id="transactionSearch"></a>
# **transactionSearch**
> TransactionSummary transactionSearch(body)



An issuer uses this endpoint to search for information about an original transaction. An issuer may use this information to take an action on the original transaction, such as creating a claim.   Note: Mastercom retrieves transactions normally when the clearing occurs within 150 days of authorization. To find late presentments and Brazilian installment transactions, provide the acquirer reference number (ARN) and the clearing date associated with the ARN of the first presentment in the request.

### Example
```java
// Import classes:
import fiserv.mastercom_api_client.ApiClient;
import fiserv.mastercom_api_client.ApiException;
import fiserv.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import api.fiserv.mastercom_api_client.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    TransactionSearchRequest body = new TransactionSearchRequest(); // TransactionSearchRequest | Transaction Search Request
    try {
      TransactionSummary result = apiInstance.transactionSearch(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#transactionSearch");
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
| **body** | [**TransactionSearchRequest**](TransactionSearchRequest.md)| Transaction Search Request | |

### Return type

[**TransactionSummary**](TransactionSummary.md)

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

