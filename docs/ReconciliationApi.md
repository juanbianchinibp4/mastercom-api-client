# ReconciliationApi

All URIs are relative to *https://api.mastercard.com/mastercom*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**reconReportDataAcknowledge**](ReconciliationApi.md#reconReportDataAcknowledge) | **POST** /v6/reconreport/data/request |  |
| [**reconReportDataRetrieval**](ReconciliationApi.md#reconReportDataRetrieval) | **POST** /v6/reconreport/data/retrieval/{reportIdentifier} |  |


<a id="reconReportDataAcknowledge"></a>
# **reconReportDataAcknowledge**
> ReconReportDataAcknowledgeResponse reconReportDataAcknowledge(reconDataRequest)



An issuer or acquirer uses this endpoint to request that Mastercom generate a reconciliation report or enhanced reconciliation report for a specified date range.   Note: The issuer or acquirer receives a unique report identifier in the response. Using the unique report identifier from this endpoint, the issuer or acquirer then retrieves the report from the Retrieve Reconciliation Report endpoint.

### Example
```java
// Import classes:
import bp4.mastercom_api_client.ApiClient;
import bp4.mastercom_api_client.ApiException;
import bp4.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import bp4.mastercom_api_client.api.ReconciliationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    ReconciliationApi apiInstance = new ReconciliationApi(defaultClient);
    ReconReportDataAcknowledgeRequest reconDataRequest = new ReconReportDataAcknowledgeRequest(); // ReconReportDataAcknowledgeRequest | Reconciliation data request
    try {
      ReconReportDataAcknowledgeResponse result = apiInstance.reconReportDataAcknowledge(reconDataRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReconciliationApi#reconReportDataAcknowledge");
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
| **reconDataRequest** | [**ReconReportDataAcknowledgeRequest**](ReconReportDataAcknowledgeRequest.md)| Reconciliation data request | |

### Return type

[**ReconReportDataAcknowledgeResponse**](ReconReportDataAcknowledgeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal Server Error |  -  |

<a id="reconReportDataRetrieval"></a>
# **reconReportDataRetrieval**
> ReconReportDataRetrivalResponse reconReportDataRetrieval(reportIdentifier)



An issuer or acquirer uses this endpoint to retrieve a reconciliation report or enhanced reconciliation report.

### Example
```java
// Import classes:
import bp4.mastercom_api_client.ApiClient;
import bp4.mastercom_api_client.ApiException;
import bp4.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import bp4.mastercom_api_client.api.ReconciliationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    ReconciliationApi apiInstance = new ReconciliationApi(defaultClient);
    String reportIdentifier = "123e4567-e89b-42d3-a456-556642440000"; // String | A reconciliation id that identifies the report to be retrieved.   Length: 36   Valid Values/Format: Alphanumeric
    try {
      ReconReportDataRetrivalResponse result = apiInstance.reconReportDataRetrieval(reportIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReconciliationApi#reconReportDataRetrieval");
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
| **reportIdentifier** | **String**| A reconciliation id that identifies the report to be retrieved.   Length: 36   Valid Values/Format: Alphanumeric | |

### Return type

[**ReconReportDataRetrivalResponse**](ReconReportDataRetrivalResponse.md)

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

