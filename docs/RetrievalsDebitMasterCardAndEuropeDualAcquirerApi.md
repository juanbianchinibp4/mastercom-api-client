# RetrievalsDebitMasterCardAndEuropeDualAcquirerApi

All URIs are relative to *https://api.mastercard.com/mastercom*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRetrievalRequestDebitMC**](RetrievalsDebitMasterCardAndEuropeDualAcquirerApi.md#createRetrievalRequestDebitMC) | **POST** /v6/claims/{claim-id}/retrievalrequests/debitmc |  |
| [**getRetrievalDocDebitMC**](RetrievalsDebitMasterCardAndEuropeDualAcquirerApi.md#getRetrievalDocDebitMC) | **GET** /v6/claims/{claim-id}/retrievalrequests/debitmc/{request-id}/documents |  |
| [**issuerResponseRetrievalDebitMCRequest**](RetrievalsDebitMasterCardAndEuropeDualAcquirerApi.md#issuerResponseRetrievalDebitMCRequest) | **POST** /v6/claims/{claim-id}/retrievalrequests/debitmc/{request-id}/fulfillments/response |  |
| [**retrieveFulfillmentDebitMCImageStatus**](RetrievalsDebitMasterCardAndEuropeDualAcquirerApi.md#retrieveFulfillmentDebitMCImageStatus) | **PUT** /v6/retrievalrequests/debitmc/imagestatus |  |
| [**retrieveFulfillmentDebitMCStatus**](RetrievalsDebitMasterCardAndEuropeDualAcquirerApi.md#retrieveFulfillmentDebitMCStatus) | **PUT** /v6/retrievalrequests/debitmc/status |  |


<a id="createRetrievalRequestDebitMC"></a>
# **createRetrievalRequestDebitMC**
> CreateRetrievalResponse createRetrievalRequestDebitMC(claimId, body)



Prior to creating a chargeback, an issuer uses this endpoint to create a retrieval request for a Debit Mastercard or Europe Dual Acquirer transaction for the acquirer to fulfill by providing a copy of the transaction information document (TID). The TID is used to satisfy a cardholder&#39;s inquiry or to satisfy an issuer&#39;s investigation of an original transaction.   NOTE: An issuer is not required to create a retrieval request in order to create a first chargeback on a claim.   NOTE: Creation of retrieval request is allowed only for reversalReasonCode (healthcare reason code (43)) starting on October 24th, 2021.

### Example
```java
// Import classes:
import bp4.mastercom_api_client.ApiClient;
import bp4.mastercom_api_client.ApiException;
import bp4.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import bp4.mastercom_api_client.api.RetrievalsDebitMasterCardAndEuropeDualAcquirerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    RetrievalsDebitMasterCardAndEuropeDualAcquirerApi apiInstance = new RetrievalsDebitMasterCardAndEuropeDualAcquirerApi(defaultClient);
    String claimId = "200002020654"; // String | Claim Id for the Retrieval Request.   Length: 1-19   Valid Values/Format: Numeric
    CreateRetrievalRequestSingle body = new CreateRetrievalRequestSingle(); // CreateRetrievalRequestSingle | Create Retrieval Request
    try {
      CreateRetrievalResponse result = apiInstance.createRetrievalRequestDebitMC(claimId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RetrievalsDebitMasterCardAndEuropeDualAcquirerApi#createRetrievalRequestDebitMC");
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
| **claimId** | **String**| Claim Id for the Retrieval Request.   Length: 1-19   Valid Values/Format: Numeric | |
| **body** | [**CreateRetrievalRequestSingle**](CreateRetrievalRequestSingle.md)| Create Retrieval Request | |

### Return type

[**CreateRetrievalResponse**](CreateRetrievalResponse.md)

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

<a id="getRetrievalDocDebitMC"></a>
# **getRetrievalDocDebitMC**
> DocumentResponseStructure getRetrievalDocDebitMC(claimId, requestId, format)



Issuers and acquirers use this endpoint to retrieve all documents from acquirers associated with retrieval request fulfillment

### Example
```java
// Import classes:
import bp4.mastercom_api_client.ApiClient;
import bp4.mastercom_api_client.ApiException;
import bp4.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import bp4.mastercom_api_client.api.RetrievalsDebitMasterCardAndEuropeDualAcquirerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    RetrievalsDebitMasterCardAndEuropeDualAcquirerApi apiInstance = new RetrievalsDebitMasterCardAndEuropeDualAcquirerApi(defaultClient);
    String claimId = "200002020654"; // String | The Claim Id.   Length: 1-19   Valid Values/Format: Numeric
    String requestId = "300002296235"; // String | The Request Id.   Length: 1-19   Valid Values/Format: Numeric
    String format = "ORIGINAL"; // String | File Format.   Length: 8-11   Valid Values/Format: ORIGINAL, MERGED_TIFF, MERGED_PDF
    try {
      DocumentResponseStructure result = apiInstance.getRetrievalDocDebitMC(claimId, requestId, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RetrievalsDebitMasterCardAndEuropeDualAcquirerApi#getRetrievalDocDebitMC");
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
| **claimId** | **String**| The Claim Id.   Length: 1-19   Valid Values/Format: Numeric | |
| **requestId** | **String**| The Request Id.   Length: 1-19   Valid Values/Format: Numeric | |
| **format** | **String**| File Format.   Length: 8-11   Valid Values/Format: ORIGINAL, MERGED_TIFF, MERGED_PDF | [enum: ORIGINAL, MERGED_TIFF, MERGED_PDF] |

### Return type

[**DocumentResponseStructure**](DocumentResponseStructure.md)

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

<a id="issuerResponseRetrievalDebitMCRequest"></a>
# **issuerResponseRetrievalDebitMCRequest**
> RetrievalResponse issuerResponseRetrievalDebitMCRequest(claimId, requestId, body)



After an acquirer fulfills a retrieval request, an issuer uses this endpoint to approve or reject a retrieval request fulfillment. The issuer approves the fulfillment or rejects the fulfillment if the documentation does not meet requirements.

### Example
```java
// Import classes:
import bp4.mastercom_api_client.ApiClient;
import bp4.mastercom_api_client.ApiException;
import bp4.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import bp4.mastercom_api_client.api.RetrievalsDebitMasterCardAndEuropeDualAcquirerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    RetrievalsDebitMasterCardAndEuropeDualAcquirerApi apiInstance = new RetrievalsDebitMasterCardAndEuropeDualAcquirerApi(defaultClient);
    String claimId = "200002020654"; // String | Claim Id for the Retrieval Request.   Length: 1-19   Valid Values/Format: Numeric
    String requestId = "300002296235"; // String | Request Id for the Retrieval Request.   Length: 1-19   Valid Values/Format: Numeric
    IssuerFulfillmentRequest body = new IssuerFulfillmentRequest(); // IssuerFulfillmentRequest | Issuer Fulfillment Response
    try {
      RetrievalResponse result = apiInstance.issuerResponseRetrievalDebitMCRequest(claimId, requestId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RetrievalsDebitMasterCardAndEuropeDualAcquirerApi#issuerResponseRetrievalDebitMCRequest");
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
| **claimId** | **String**| Claim Id for the Retrieval Request.   Length: 1-19   Valid Values/Format: Numeric | |
| **requestId** | **String**| Request Id for the Retrieval Request.   Length: 1-19   Valid Values/Format: Numeric | |
| **body** | [**IssuerFulfillmentRequest**](IssuerFulfillmentRequest.md)| Issuer Fulfillment Response | |

### Return type

[**RetrievalResponse**](RetrievalResponse.md)

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

<a id="retrieveFulfillmentDebitMCImageStatus"></a>
# **retrieveFulfillmentDebitMCImageStatus**
> RetrievalsImageStatusResponse retrieveFulfillmentDebitMCImageStatus(body)



Issuers and acquirers use this endpoint to search for documents that have a specific status (completed, pending, failed, unavailable, and document not applicable) for retrieval requests.   Note: For customers with high volumes of fulfillments or large numbers of BINs, Mastercom recommends using the Retrieval Fullfilment Status endpoint rather than the Retrieval Fullfilment Image Status endpoint.

### Example
```java
// Import classes:
import bp4.mastercom_api_client.ApiClient;
import bp4.mastercom_api_client.ApiException;
import bp4.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import bp4.mastercom_api_client.api.RetrievalsDebitMasterCardAndEuropeDualAcquirerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    RetrievalsDebitMasterCardAndEuropeDualAcquirerApi apiInstance = new RetrievalsDebitMasterCardAndEuropeDualAcquirerApi(defaultClient);
    RetrievalsImageStatusRequest body = new RetrievalsImageStatusRequest(); // RetrievalsImageStatusRequest | Retrieval information
    try {
      RetrievalsImageStatusResponse result = apiInstance.retrieveFulfillmentDebitMCImageStatus(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RetrievalsDebitMasterCardAndEuropeDualAcquirerApi#retrieveFulfillmentDebitMCImageStatus");
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
| **body** | [**RetrievalsImageStatusRequest**](RetrievalsImageStatusRequest.md)| Retrieval information | |

### Return type

[**RetrievalsImageStatusResponse**](RetrievalsImageStatusResponse.md)

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

<a id="retrieveFulfillmentDebitMCStatus"></a>
# **retrieveFulfillmentDebitMCStatus**
> RetrievalStatusResponse retrieveFulfillmentDebitMCStatus(body)



Issuers and acquirers use this endpoint to search for the status of documents that are associated with a specific list of retrieval requests.   Note: Issuers and acquirers may send a maximum of 2,000 retrieval fulfillment IDs within a single request.

### Example
```java
// Import classes:
import bp4.mastercom_api_client.ApiClient;
import bp4.mastercom_api_client.ApiException;
import bp4.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import bp4.mastercom_api_client.api.RetrievalsDebitMasterCardAndEuropeDualAcquirerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    RetrievalsDebitMasterCardAndEuropeDualAcquirerApi apiInstance = new RetrievalsDebitMasterCardAndEuropeDualAcquirerApi(defaultClient);
    RetrievalStatusRequest body = new RetrievalStatusRequest(); // RetrievalStatusRequest | Retrieval information
    try {
      RetrievalStatusResponse result = apiInstance.retrieveFulfillmentDebitMCStatus(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RetrievalsDebitMasterCardAndEuropeDualAcquirerApi#retrieveFulfillmentDebitMCStatus");
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
| **body** | [**RetrievalStatusRequest**](RetrievalStatusRequest.md)| Retrieval information | |

### Return type

[**RetrievalStatusResponse**](RetrievalStatusResponse.md)

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

