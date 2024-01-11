# ChargebacksDebitMasterCardAndEuropeDualAcquirerApi

All URIs are relative to *https://api.mastercard.com/mastercom*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acknowledgeChargebacksDebitMC**](ChargebacksDebitMasterCardAndEuropeDualAcquirerApi.md#acknowledgeChargebacksDebitMC) | **PUT** /v6/chargebacks/debitmc/acknowledge |  |
| [**createChargebackDebitMC**](ChargebacksDebitMasterCardAndEuropeDualAcquirerApi.md#createChargebackDebitMC) | **POST** /v6/claims/{claim-id}/chargebacks/debitmc |  |
| [**createChargebackReversalDebitMC**](ChargebacksDebitMasterCardAndEuropeDualAcquirerApi.md#createChargebackReversalDebitMC) | **POST** /v6/claims/{claim-id}/chargebacks/debitmc/{chargeback-id}/reversal |  |
| [**getChargebackDocDebitMC**](ChargebacksDebitMasterCardAndEuropeDualAcquirerApi.md#getChargebackDocDebitMC) | **GET** /v6/claims/{claim-id}/chargebacks/debitmc/{chargeback-id}/documents |  |
| [**retrieveChargebackImageStatusDebitMC**](ChargebacksDebitMasterCardAndEuropeDualAcquirerApi.md#retrieveChargebackImageStatusDebitMC) | **PUT** /v6/chargebacks/debitmc/imagestatus |  |
| [**retrieveChargebackStatusDebitMC**](ChargebacksDebitMasterCardAndEuropeDualAcquirerApi.md#retrieveChargebackStatusDebitMC) | **PUT** /v6/chargebacks/debitmc/status |  |
| [**updateChargebackDebitMC**](ChargebacksDebitMasterCardAndEuropeDualAcquirerApi.md#updateChargebackDebitMC) | **PUT** /v6/claims/{claim-id}/chargebacks/debitmc/{chargeback-id} |  |


<a id="acknowledgeChargebacksDebitMC"></a>
# **acknowledgeChargebacksDebitMC**
> ChargebackMarkProcessedResponse acknowledgeChargebacksDebitMC(body)



Issuers and acquirers use this endpoint to acknowledge a chargeback or second presentment. Acknowledging a chargeback or second presentment moves the claim from the Unworked queue to the Worked queue. Acknowledging the chargeback or second presentment does not close the claim. Issuers and acquirers may take further actions on acknowledged claims.   Note: for efficient processing, issuers and acquirers should send 100 acknowledgments or fewer in a single request.

### Example
```java
// Import classes:
import fiserv.mastercom_api_client.ApiClient;
import fiserv.mastercom_api_client.ApiException;
import fiserv.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import api.fiserv.mastercom_api_client.ChargebacksDebitMasterCardAndEuropeDualAcquirerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    ChargebacksDebitMasterCardAndEuropeDualAcquirerApi apiInstance = new ChargebacksDebitMasterCardAndEuropeDualAcquirerApi(defaultClient);
    ChargebackMarkProcessedRequest body = new ChargebackMarkProcessedRequest(); // ChargebackMarkProcessedRequest | Chargeback Receiver information
    try {
      ChargebackMarkProcessedResponse result = apiInstance.acknowledgeChargebacksDebitMC(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChargebacksDebitMasterCardAndEuropeDualAcquirerApi#acknowledgeChargebacksDebitMC");
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

<a id="createChargebackDebitMC"></a>
# **createChargebackDebitMC**
> ChargebackResponse createChargebackDebitMC(claimId, body)



Issuers use this endpoint to create chargebacks for Debit Mastercard or Europe Dual Acquirer transactions and optionally to upload supporting documents. Issuers should only use this endpoint when the transaction has a single-message issuer, dual-message acquirer, and a transaction without a PIN.   Note: If the API call to this endpoint times out, customers should use the Chargeback Status or Retrieve Claim endpoint to determine the success or failure of document processing.

### Example
```java
// Import classes:
import fiserv.mastercom_api_client.ApiClient;
import fiserv.mastercom_api_client.ApiException;
import fiserv.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import api.fiserv.mastercom_api_client.ChargebacksDebitMasterCardAndEuropeDualAcquirerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    ChargebacksDebitMasterCardAndEuropeDualAcquirerApi apiInstance = new ChargebacksDebitMasterCardAndEuropeDualAcquirerApi(defaultClient);
    String claimId = "200002020654"; // String | Claim Id where the chargeback will be added.   Length: 1-19   Valid Values/Format: Numeric
    CreateChargebackSingleRequest body = new CreateChargebackSingleRequest(); // CreateChargebackSingleRequest | Create Chargeback information
    try {
      ChargebackResponse result = apiInstance.createChargebackDebitMC(claimId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChargebacksDebitMasterCardAndEuropeDualAcquirerApi#createChargebackDebitMC");
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
| **claimId** | **String**| Claim Id where the chargeback will be added.   Length: 1-19   Valid Values/Format: Numeric | |
| **body** | [**CreateChargebackSingleRequest**](CreateChargebackSingleRequest.md)| Create Chargeback information | |

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

<a id="createChargebackReversalDebitMC"></a>
# **createChargebackReversalDebitMC**
> ChargebackResponse createChargebackReversalDebitMC(claimId, chargebackId, body)



Issuers use this endpoint to reverse an existing Debit Mastercard or Europe Dual Acquirer chargeback when they create a chargeback in error.   Note: issuers may only create reversals on chargebacks after the chargebacks are processed by Mastercard Debit Switch (MDS).

### Example
```java
// Import classes:
import fiserv.mastercom_api_client.ApiClient;
import fiserv.mastercom_api_client.ApiException;
import fiserv.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import api.fiserv.mastercom_api_client.ChargebacksDebitMasterCardAndEuropeDualAcquirerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    ChargebacksDebitMasterCardAndEuropeDualAcquirerApi apiInstance = new ChargebacksDebitMasterCardAndEuropeDualAcquirerApi(defaultClient);
    String claimId = "200002020654"; // String | Claim Id for the chargeback.   Length: 1-19   Valid Values/Format: Numeric
    String chargebackId = "300018439680"; // String | Chargeback Id.   Length: 1-19   Valid Values/Format: Numeric
    CreateChargebackSingleReversalRequest body = new CreateChargebackSingleReversalRequest(); // CreateChargebackSingleReversalRequest | Create Chargeback Reversal information
    try {
      ChargebackResponse result = apiInstance.createChargebackReversalDebitMC(claimId, chargebackId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChargebacksDebitMasterCardAndEuropeDualAcquirerApi#createChargebackReversalDebitMC");
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
| **body** | [**CreateChargebackSingleReversalRequest**](CreateChargebackSingleReversalRequest.md)| Create Chargeback Reversal information | |

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

<a id="getChargebackDocDebitMC"></a>
# **getChargebackDocDebitMC**
> DocumentResponseStructure getChargebackDocDebitMC(claimId, chargebackId, format)



Issuers and acquirers use this endpoint to retrieve documents in a desired format associated with any type of chargeback.

### Example
```java
// Import classes:
import fiserv.mastercom_api_client.ApiClient;
import fiserv.mastercom_api_client.ApiException;
import fiserv.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import api.fiserv.mastercom_api_client.ChargebacksDebitMasterCardAndEuropeDualAcquirerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    ChargebacksDebitMasterCardAndEuropeDualAcquirerApi apiInstance = new ChargebacksDebitMasterCardAndEuropeDualAcquirerApi(defaultClient);
    String claimId = "200002020654"; // String | The Claim Id.   Length: 1-19   Valid Values/Format: Numeric
    String chargebackId = "300002063556"; // String | Chargeback Id.   Length: 1-19   Valid Values/Format: Numeric
    String format = "ORIGINAL"; // String | File format.   Length: 8-11   Valid Values/Format: ORIGINAL, MERGED_TIFF, MERGED_PDF
    try {
      DocumentResponseStructure result = apiInstance.getChargebackDocDebitMC(claimId, chargebackId, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChargebacksDebitMasterCardAndEuropeDualAcquirerApi#getChargebackDocDebitMC");
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
| **chargebackId** | **String**| Chargeback Id.   Length: 1-19   Valid Values/Format: Numeric | |
| **format** | **String**| File format.   Length: 8-11   Valid Values/Format: ORIGINAL, MERGED_TIFF, MERGED_PDF | [enum: ORIGINAL, MERGED_TIFF, MERGED_PDF] |

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

<a id="retrieveChargebackImageStatusDebitMC"></a>
# **retrieveChargebackImageStatusDebitMC**
> ChargebackImageStatusResponse retrieveChargebackImageStatusDebitMC(body)



Issuers and acquirers use this endpoint to search for documents that have a specific status (completed, pending, failed, unavailable, and document not applicable) for chargebacks.   Note: For customers with high volumes of chargebacks or large numbers of BINs, Mastercom recommends using the Chargebacks Status endpoint rather than the Chargebacks Image Status endpoint.

### Example
```java
// Import classes:
import fiserv.mastercom_api_client.ApiClient;
import fiserv.mastercom_api_client.ApiException;
import fiserv.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import api.fiserv.mastercom_api_client.ChargebacksDebitMasterCardAndEuropeDualAcquirerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    ChargebacksDebitMasterCardAndEuropeDualAcquirerApi apiInstance = new ChargebacksDebitMasterCardAndEuropeDualAcquirerApi(defaultClient);
    ChargebackImageStatusRequest body = new ChargebackImageStatusRequest(); // ChargebackImageStatusRequest | Chargeback information
    try {
      ChargebackImageStatusResponse result = apiInstance.retrieveChargebackImageStatusDebitMC(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChargebacksDebitMasterCardAndEuropeDualAcquirerApi#retrieveChargebackImageStatusDebitMC");
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

<a id="retrieveChargebackStatusDebitMC"></a>
# **retrieveChargebackStatusDebitMC**
> ChargebackStatusResponse retrieveChargebackStatusDebitMC(body)



Issuers and acquirers use this endpoint to search for the status of documents of a specific list of claim IDs and chargeback IDs.   Note: issuers and acquirers may send a maximum of 2,000 chargeback IDs within a single request.

### Example
```java
// Import classes:
import fiserv.mastercom_api_client.ApiClient;
import fiserv.mastercom_api_client.ApiException;
import fiserv.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import api.fiserv.mastercom_api_client.ChargebacksDebitMasterCardAndEuropeDualAcquirerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    ChargebacksDebitMasterCardAndEuropeDualAcquirerApi apiInstance = new ChargebacksDebitMasterCardAndEuropeDualAcquirerApi(defaultClient);
    ChargebackStatusRequest body = new ChargebackStatusRequest(); // ChargebackStatusRequest | Chargeback information
    try {
      ChargebackStatusResponse result = apiInstance.retrieveChargebackStatusDebitMC(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChargebacksDebitMasterCardAndEuropeDualAcquirerApi#retrieveChargebackStatusDebitMC");
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

<a id="updateChargebackDebitMC"></a>
# **updateChargebackDebitMC**
> ChargebackResponse updateChargebackDebitMC(claimId, chargebackId, body)



Issuers use this endpoint to update an existing Debit Mastercard or Europe Dual Acquirer chargeback with memos or documents if they did not attach memos or documents when creating the chargeback.   Note: If the API call to this endpoint times out, customers should use the Chargeback Status or Retrieve Claim endpoint to determine the success or failure of document processing.

### Example
```java
// Import classes:
import fiserv.mastercom_api_client.ApiClient;
import fiserv.mastercom_api_client.ApiException;
import fiserv.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import api.fiserv.mastercom_api_client.ChargebacksDebitMasterCardAndEuropeDualAcquirerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    ChargebacksDebitMasterCardAndEuropeDualAcquirerApi apiInstance = new ChargebacksDebitMasterCardAndEuropeDualAcquirerApi(defaultClient);
    String claimId = "200002020654"; // String | Claim Id for the chargeback.   Length: 1-19   Valid Values/Format: Numeric
    String chargebackId = "300018439680"; // String | Chargeback Id.   Length: 1-19   Valid Values/Format: Numeric
    UpdateChargebackRequest body = new UpdateChargebackRequest(); // UpdateChargebackRequest | Update Chargeback information
    try {
      ChargebackResponse result = apiInstance.updateChargebackDebitMC(claimId, chargebackId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChargebacksDebitMasterCardAndEuropeDualAcquirerApi#updateChargebackDebitMC");
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

