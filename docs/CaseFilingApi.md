# CaseFilingApi

All URIs are relative to *https://api.mastercard.com/mastercom*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCaseFiling**](CaseFilingApi.md#createCaseFiling) | **POST** /v6/cases |  |
| [**getCaseFilingDoc**](CaseFilingApi.md#getCaseFilingDoc) | **GET** /v6/cases/{case-id}/documents |  |
| [**retrieveCaseFilingImageStatus**](CaseFilingApi.md#retrieveCaseFilingImageStatus) | **PUT** /v6/cases/imagestatus |  |
| [**retrieveCaseFilingStatus**](CaseFilingApi.md#retrieveCaseFilingStatus) | **PUT** /v6/cases/status |  |
| [**retrieveClaims**](CaseFilingApi.md#retrieveClaims) | **PUT** /v6/cases/retrieve/claims |  |
| [**updateCaseFiling**](CaseFilingApi.md#updateCaseFiling) | **PUT** /v6/cases/{case-id} |  |


<a id="createCaseFiling"></a>
# **createCaseFiling**
> CaseFilingResponse createCaseFiling(body)



Issuer or acquirers use this endpoint to file a pre-arbitration, arbitration, pre-compliance, or compliance case and optionally upload documents. Issuers and acquirers also have the option to use the endpoint to create an Expedited Billing Dispute Form (EBDF) and attach it to the claim.   Note: issuers or acquirers should not attach documents while requesting the automatic generation of the EBDF. Therefore, if issuers or acquirers need to submit the EBDF with additional documentation, they must complete the EBDF and include it in a ZIP file with any additional documentation.

### Example
```java
// Import classes:
import bp4.mastercom_api_client.ApiClient;
import bp4.mastercom_api_client.ApiException;
import bp4.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import bp4.mastercom_api_client.api.CaseFilingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    CaseFilingApi apiInstance = new CaseFilingApi(defaultClient);
    CreateCaseRequest body = new CreateCaseRequest(); // CreateCaseRequest | Create Case Filing information
    try {
      CaseFilingResponse result = apiInstance.createCaseFiling(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseFilingApi#createCaseFiling");
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
| **body** | [**CreateCaseRequest**](CreateCaseRequest.md)| Create Case Filing information | |

### Return type

[**CaseFilingResponse**](CaseFilingResponse.md)

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

<a id="getCaseFilingDoc"></a>
# **getCaseFilingDoc**
> DocumentResponseStructure getCaseFilingDoc(caseId, format, memo)



Issuers and acquirers use this endpoint to retrieve all documents in a desired format associated with a case.   Note: this endpoint returns all documents that either party has submitted for the case.

### Example
```java
// Import classes:
import bp4.mastercom_api_client.ApiClient;
import bp4.mastercom_api_client.ApiException;
import bp4.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import bp4.mastercom_api_client.api.CaseFilingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    CaseFilingApi apiInstance = new CaseFilingApi(defaultClient);
    String caseId = "536092"; // String | The case filing id.   Length: 0-19   Valid Values/Format: Numeric
    String format = "ORIGINAL"; // String | File Format.   Length: 8-11   Valid Values/Format: ORIGINAL, MERGED_TIFF, MERGED_PDF
    String memo = "Memo"; // String | Adding field for future use. Please leave blank at this time.   Length: N/A    Valid Values/Format: Alphanumeric
    try {
      DocumentResponseStructure result = apiInstance.getCaseFilingDoc(caseId, format, memo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseFilingApi#getCaseFilingDoc");
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
| **caseId** | **String**| The case filing id.   Length: 0-19   Valid Values/Format: Numeric | |
| **format** | **String**| File Format.   Length: 8-11   Valid Values/Format: ORIGINAL, MERGED_TIFF, MERGED_PDF | [enum: ORIGINAL, MERGED_TIFF, MERGED_PDF] |
| **memo** | **String**| Adding field for future use. Please leave blank at this time.   Length: N/A    Valid Values/Format: Alphanumeric | [optional] |

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

<a id="retrieveCaseFilingImageStatus"></a>
# **retrieveCaseFilingImageStatus**
> CaseFilingImageStatusResponse retrieveCaseFilingImageStatus(body)



Issuers and acquirers use this endpoint to search documents that have a specific status (completed, pending, failed, unavailable, and document not applicable) for case filings.   Note: For customers with high volumes of chargebacks or large numbers of BINs, Mastercom recommends using the Case Filing Status endpoint rather than the Case Filing Image Status endpoint.

### Example
```java
// Import classes:
import bp4.mastercom_api_client.ApiClient;
import bp4.mastercom_api_client.ApiException;
import bp4.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import bp4.mastercom_api_client.api.CaseFilingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    CaseFilingApi apiInstance = new CaseFilingApi(defaultClient);
    CaseFilingImageStatusRequest body = new CaseFilingImageStatusRequest(); // CaseFilingImageStatusRequest | Case Filing information
    try {
      CaseFilingImageStatusResponse result = apiInstance.retrieveCaseFilingImageStatus(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseFilingApi#retrieveCaseFilingImageStatus");
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
| **body** | [**CaseFilingImageStatusRequest**](CaseFilingImageStatusRequest.md)| Case Filing information | |

### Return type

[**CaseFilingImageStatusResponse**](CaseFilingImageStatusResponse.md)

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

<a id="retrieveCaseFilingStatus"></a>
# **retrieveCaseFilingStatus**
> CaseFilingStatusResponse retrieveCaseFilingStatus(body)



Issuers and acquirers use this endpoint to search for the status of documents of a specific list of cases.   Note: issuers and acquirers may send a maximum of 2,000 case IDs within a single request.

### Example
```java
// Import classes:
import bp4.mastercom_api_client.ApiClient;
import bp4.mastercom_api_client.ApiException;
import bp4.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import bp4.mastercom_api_client.api.CaseFilingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    CaseFilingApi apiInstance = new CaseFilingApi(defaultClient);
    CaseFilingStatusRequest body = new CaseFilingStatusRequest(); // CaseFilingStatusRequest | Case Filing information
    try {
      CaseFilingStatusResponse result = apiInstance.retrieveCaseFilingStatus(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseFilingApi#retrieveCaseFilingStatus");
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
| **body** | [**CaseFilingStatusRequest**](CaseFilingStatusRequest.md)| Case Filing information | |

### Return type

[**CaseFilingStatusResponse**](CaseFilingStatusResponse.md)

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

<a id="retrieveClaims"></a>
# **retrieveClaims**
> CaseFilingClaimsResponse retrieveClaims(body)



Issuers or acquirers use this endpoint to retrieve a list of claims associated with existing cases.

### Example
```java
// Import classes:
import bp4.mastercom_api_client.ApiClient;
import bp4.mastercom_api_client.ApiException;
import bp4.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import bp4.mastercom_api_client.api.CaseFilingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    CaseFilingApi apiInstance = new CaseFilingApi(defaultClient);
    CaseFilingClaimsRequest body = new CaseFilingClaimsRequest(); // CaseFilingClaimsRequest | Case Filing Retrieve Claims request information
    try {
      CaseFilingClaimsResponse result = apiInstance.retrieveClaims(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseFilingApi#retrieveClaims");
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
| **body** | [**CaseFilingClaimsRequest**](CaseFilingClaimsRequest.md)| Case Filing Retrieve Claims request information | |

### Return type

[**CaseFilingClaimsResponse**](CaseFilingClaimsResponse.md)

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

<a id="updateCaseFiling"></a>
# **updateCaseFiling**
> CaseFilingResponse updateCaseFiling(caseId, body)



Issuers or acquirers use this endpoint to take action (accept, reject, rebut, escalate, withdraw) on a case filing. Issuers and acquirers may take action with or without attaching documents.

### Example
```java
// Import classes:
import bp4.mastercom_api_client.ApiClient;
import bp4.mastercom_api_client.ApiException;
import bp4.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import bp4.mastercom_api_client.api.CaseFilingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    CaseFilingApi apiInstance = new CaseFilingApi(defaultClient);
    String caseId = "536092"; // String | Case filing Id.   Length: 1-19   Valid Values/Format: Numeric
    UpdateCaseRequest body = new UpdateCaseRequest(); // UpdateCaseRequest | Update Case Filing information
    try {
      CaseFilingResponse result = apiInstance.updateCaseFiling(caseId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseFilingApi#updateCaseFiling");
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
| **caseId** | **String**| Case filing Id.   Length: 1-19   Valid Values/Format: Numeric | |
| **body** | [**UpdateCaseRequest**](UpdateCaseRequest.md)| Update Case Filing information | |

### Return type

[**CaseFilingResponse**](CaseFilingResponse.md)

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

