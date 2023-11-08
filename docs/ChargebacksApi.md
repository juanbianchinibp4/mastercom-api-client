# ChargebacksApi

All URIs are relative to *https://api.mastercard.com/mastercom*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acknowledgeChargebacks**](ChargebacksApi.md#acknowledgeChargebacks) | **PUT** /v6/chargebacks/acknowledge |  |
| [**createChargeback**](ChargebacksApi.md#createChargeback) | **POST** /v6/claims/{claim-id}/chargebacks |  |
| [**createChargebackReversal**](ChargebacksApi.md#createChargebackReversal) | **POST** /v6/claims/{claim-id}/chargebacks/{chargeback-id}/reversal |  |
| [**getChargebackDoc**](ChargebacksApi.md#getChargebackDoc) | **GET** /v6/claims/{claim-id}/chargebacks/{chargeback-id}/documents |  |
| [**getDataForCreateChargeback**](ChargebacksApi.md#getDataForCreateChargeback) | **POST** /v6/claims/{claim-id}/chargebacks/loaddataforchargebacks |  |
| [**retrieveChargebackImageStatus**](ChargebacksApi.md#retrieveChargebackImageStatus) | **PUT** /v6/chargebacks/imagestatus |  |
| [**retrieveChargebackStatus**](ChargebacksApi.md#retrieveChargebackStatus) | **PUT** /v6/chargebacks/status |  |
| [**updateChargeback**](ChargebacksApi.md#updateChargeback) | **PUT** /v6/claims/{claim-id}/chargebacks/{chargeback-id} |  |


<a id="acknowledgeChargebacks"></a>
# **acknowledgeChargebacks**
> ChargebackMarkProcessedResponse acknowledgeChargebacks(body)



Issuers and acquirers use this endpoint to acknowledge a chargeback or second presentment. Acknowledging a chargeback or second presentment moves the claim from the Unworked queue to the Worked queue. Acknowledging the chargeback or second presentment does not close the claim. Issuers and acquirers may take further actions on acknowledged claims.   Note: for efficient processing, issuers and acquirers should send 100 acknowledgments or fewer in a single request.

### Example
```java
// Import classes:
import bp4.mastercom_api_client.ApiClient;
import bp4.mastercom_api_client.ApiException;
import bp4.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import bp4.mastercom_api_client.api.ChargebacksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    ChargebacksApi apiInstance = new ChargebacksApi(defaultClient);
    ChargebackMarkProcessedRequest body = new ChargebackMarkProcessedRequest(); // ChargebackMarkProcessedRequest | Chargeback Receiver information
    try {
      ChargebackMarkProcessedResponse result = apiInstance.acknowledgeChargebacks(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChargebacksApi#acknowledgeChargebacks");
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
| **body** | [**ChargebackMarkProcessedRequest**](ChargebackMarkProcessedRequest.md)| Chargeback Receiver information | |

### Return type

[**ChargebackMarkProcessedResponse**](ChargebackMarkProcessedResponse.md)

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

<a id="createChargeback"></a>
# **createChargeback**
> ChargebackResponse createChargeback(claimId, body)



Issuers and acquirers use this endpoint to create chargebacks and second presentments and optionally to upload supporting documents. Issuers and acquirers may use the parameters in the request to automatically generate the Expedited Billing Dispute Form (EBDF) and attach it to the claim.   Note: issuers should not attach documents while requesting the automatic generation of the EBDF. Therefore, if issuers need to submit the EBDF with additional documentation, they must complete the EBDF and include it in a ZIP file with any additional documentation.   Note: If the API call to this endpoint times out, customers should use the Chargeback Status or Retrieve Claim endpoint to determine the success or failure of document processing.

### Example
```java
// Import classes:
import bp4.mastercom_api_client.ApiClient;
import bp4.mastercom_api_client.ApiException;
import bp4.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import bp4.mastercom_api_client.api.ChargebacksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    ChargebacksApi apiInstance = new ChargebacksApi(defaultClient);
    String claimId = "200002020654"; // String | Claim Id where the chargeback will be added   Length: 1-19   Valid Values/Format: Numeric
    CreateChargebackRequest body = new CreateChargebackRequest(); // CreateChargebackRequest | Create Chargeback information
    try {
      ChargebackResponse result = apiInstance.createChargeback(claimId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChargebacksApi#createChargeback");
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
| **claimId** | **String**| Claim Id where the chargeback will be added   Length: 1-19   Valid Values/Format: Numeric | |
| **body** | [**CreateChargebackRequest**](CreateChargebackRequest.md)| Create Chargeback information | |

### Return type

[**ChargebackResponse**](ChargebackResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createChargebackReversal"></a>
# **createChargebackReversal**
> ChargebackResponse createChargebackReversal(claimId, chargebackId)



Issuers and acquirers use this endpoint to reverse an existing chargeback when they create a chargeback in error.   Note: issuers and acquirers may only create reversals on chargebacks after the chargebacks are processed by the Global Clearing Management System (GCMS).

### Example
```java
// Import classes:
import bp4.mastercom_api_client.ApiClient;
import bp4.mastercom_api_client.ApiException;
import bp4.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import bp4.mastercom_api_client.api.ChargebacksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    ChargebacksApi apiInstance = new ChargebacksApi(defaultClient);
    String claimId = "200002020654"; // String | Claim Id for the chargeback.   Length: 1-19   Valid Values/Format: Numeric
    String chargebackId = "300018439680"; // String | Chargeback Id.   Length: 1-19   Valid Values/Format: Numeric
    try {
      ChargebackResponse result = apiInstance.createChargebackReversal(claimId, chargebackId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChargebacksApi#createChargebackReversal");
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
| **claimId** | **String**| Claim Id for the chargeback.   Length: 1-19   Valid Values/Format: Numeric | |
| **chargebackId** | **String**| Chargeback Id.   Length: 1-19   Valid Values/Format: Numeric | |

### Return type

[**ChargebackResponse**](ChargebackResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getChargebackDoc"></a>
# **getChargebackDoc**
> DocumentResponseStructure getChargebackDoc(claimId, chargebackId, format)



Issuers and acquirers use this endpoint to retrieve documents in a desired format associated with any type of chargeback.

### Example
```java
// Import classes:
import bp4.mastercom_api_client.ApiClient;
import bp4.mastercom_api_client.ApiException;
import bp4.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import bp4.mastercom_api_client.api.ChargebacksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    ChargebacksApi apiInstance = new ChargebacksApi(defaultClient);
    String claimId = "200002020654"; // String | Claim Id for the chargeback.   Length: 1-19   Valid Values/Format: Numeric
    String chargebackId = "300018439680"; // String | Chargeback Id.   Length: 1-19   Valid Values/Format: Numeric
    String format = "ORIGINAL"; // String | File Format.   Length: 8-11   Valid Values/Format: ORIGINAL, MERGED_TIFF, MERGED_PDF
    try {
      DocumentResponseStructure result = apiInstance.getChargebackDoc(claimId, chargebackId, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChargebacksApi#getChargebackDoc");
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
| **claimId** | **String**| Claim Id for the chargeback.   Length: 1-19   Valid Values/Format: Numeric | |
| **chargebackId** | **String**| Chargeback Id.   Length: 1-19   Valid Values/Format: Numeric | |
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

<a id="getDataForCreateChargeback"></a>
# **getDataForCreateChargeback**
> LoadDataForChargebackResponse getDataForCreateChargeback(claimId, body)



Issuers and acquirers use this endpoint to obtain information about a potential first chargeback or second presentment prior to creating the chargeback. If the issuer or acquirer decides to create the chargeback, the issuer or acquirer should use the Create endpoint for chargebacks.

### Example
```java
// Import classes:
import bp4.mastercom_api_client.ApiClient;
import bp4.mastercom_api_client.ApiException;
import bp4.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import bp4.mastercom_api_client.api.ChargebacksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    ChargebacksApi apiInstance = new ChargebacksApi(defaultClient);
    String claimId = "200002020654"; // String | Claim Id for the chargeback to be created.   Length: 1-19   Valid Values/Format: Numeric
    LoadDataForChargebacksRequest body = new LoadDataForChargebacksRequest(); // LoadDataForChargebacksRequest | The type of chargeback.  The following values are valid...CHARGEBACK, SECOND_PRESENTMENT.  The default value is CHARGEBACK.
    try {
      LoadDataForChargebackResponse result = apiInstance.getDataForCreateChargeback(claimId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChargebacksApi#getDataForCreateChargeback");
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
| **claimId** | **String**| Claim Id for the chargeback to be created.   Length: 1-19   Valid Values/Format: Numeric | |
| **body** | [**LoadDataForChargebacksRequest**](LoadDataForChargebacksRequest.md)| The type of chargeback.  The following values are valid...CHARGEBACK, SECOND_PRESENTMENT.  The default value is CHARGEBACK. | |

### Return type

[**LoadDataForChargebackResponse**](LoadDataForChargebackResponse.md)

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

<a id="retrieveChargebackImageStatus"></a>
# **retrieveChargebackImageStatus**
> ChargebackImageStatusResponse retrieveChargebackImageStatus(body)



Issuers and acquirers use this endpoint to search for documents that have a specific status (completed, pending, failed, unavailable, and document not applicable) for chargebacks.   Note: For customers with high volumes of chargebacks or large numbers of BINs, Mastercom recommends using the Chargebacks Status endpoint rather than the Chargebacks Image Status endpoint.

### Example
```java
// Import classes:
import bp4.mastercom_api_client.ApiClient;
import bp4.mastercom_api_client.ApiException;
import bp4.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import bp4.mastercom_api_client.api.ChargebacksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    ChargebacksApi apiInstance = new ChargebacksApi(defaultClient);
    ChargebackImageStatusRequest body = new ChargebackImageStatusRequest(); // ChargebackImageStatusRequest | Chargeback information
    try {
      ChargebackImageStatusResponse result = apiInstance.retrieveChargebackImageStatus(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChargebacksApi#retrieveChargebackImageStatus");
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
| **body** | [**ChargebackImageStatusRequest**](ChargebackImageStatusRequest.md)| Chargeback information | |

### Return type

[**ChargebackImageStatusResponse**](ChargebackImageStatusResponse.md)

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

<a id="retrieveChargebackStatus"></a>
# **retrieveChargebackStatus**
> ChargebackStatusResponse retrieveChargebackStatus(body)



Issuers and acquirers use this endpoint to search for the status of documents of a specific list of claim IDs and chargeback IDs.   Note: issuers and acquirers may send a maximum of 2,000 chargeback IDs within a single request.

### Example
```java
// Import classes:
import bp4.mastercom_api_client.ApiClient;
import bp4.mastercom_api_client.ApiException;
import bp4.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import bp4.mastercom_api_client.api.ChargebacksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    ChargebacksApi apiInstance = new ChargebacksApi(defaultClient);
    ChargebackStatusRequest body = new ChargebackStatusRequest(); // ChargebackStatusRequest | Chargeback information
    try {
      ChargebackStatusResponse result = apiInstance.retrieveChargebackStatus(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChargebacksApi#retrieveChargebackStatus");
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
| **body** | [**ChargebackStatusRequest**](ChargebackStatusRequest.md)| Chargeback information | |

### Return type

[**ChargebackStatusResponse**](ChargebackStatusResponse.md)

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

<a id="updateChargeback"></a>
# **updateChargeback**
> ChargebackResponse updateChargeback(claimId, chargebackId, body)



Issuers and acquirers use this endpoint to update an existing chargeback with memos or documents if they did not attach memos or documents when creating the chargeback.   Note: If the API call to this endpoint times out, customers should use the Chargeback Status or Retrieve Claim endpoint to determine the success or failure of document processing.

### Example
```java
// Import classes:
import bp4.mastercom_api_client.ApiClient;
import bp4.mastercom_api_client.ApiException;
import bp4.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import bp4.mastercom_api_client.api.ChargebacksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    ChargebacksApi apiInstance = new ChargebacksApi(defaultClient);
    String claimId = "200002020654"; // String | Claim Id for the chargeback.   Length: 1-19   Valid Values/Format: Numeric
    String chargebackId = "300018439680"; // String | Chargeback Id.   Length: 1-19   Valid Values/Format: Numeric
    UpdateChargebackRequest body = new UpdateChargebackRequest(); // UpdateChargebackRequest | Update Chargeback information
    try {
      ChargebackResponse result = apiInstance.updateChargeback(claimId, chargebackId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChargebacksApi#updateChargeback");
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
| **claimId** | **String**| Claim Id for the chargeback.   Length: 1-19   Valid Values/Format: Numeric | |
| **chargebackId** | **String**| Chargeback Id.   Length: 1-19   Valid Values/Format: Numeric | |
| **body** | [**UpdateChargebackRequest**](UpdateChargebackRequest.md)| Update Chargeback information | |

### Return type

[**ChargebackResponse**](ChargebackResponse.md)

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

