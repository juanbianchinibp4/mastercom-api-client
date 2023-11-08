# QueuesApi

All URIs are relative to *https://api.mastercard.com/mastercom*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getQueueSummary**](QueuesApi.md#getQueueSummary) | **GET** /v6/queues |  |
| [**getQueueSummaryPost**](QueuesApi.md#getQueueSummaryPost) | **POST** /v6/queues |  |
| [**getQueues**](QueuesApi.md#getQueues) | **GET** /v6/queues/names |  |


<a id="getQueueSummary"></a>
# **getQueueSummary**
> List&lt;ClaimSummary&gt; getQueueSummary(queueName)



An issuer or acquirer uses this endpoint to retrieve a list of claims from a queue. Claims are sorted by last modified date in descending order.   Note: The maximum amount of claims returned by the Retrieve Claims from Queue endpoint varies by payload size and request time. Issuers and acquirers should use the Retrieve Claims from Queue With Date Interval endpoint if they expect more than 10,000 claims.

### Example
```java
// Import classes:
import bp4.mastercom_api_client.ApiClient;
import bp4.mastercom_api_client.ApiException;
import bp4.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import bp4.mastercom_api_client.api.QueuesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    QueuesApi apiInstance = new QueuesApi(defaultClient);
    String queueName = "Rejects"; // String | The queue to be queried for a list of claims.   Length: 1-30   Valid Values/Format: Alpha
    try {
      List<ClaimSummary> result = apiInstance.getQueueSummary(queueName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QueuesApi#getQueueSummary");
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
| **queueName** | **String**| The queue to be queried for a list of claims.   Length: 1-30   Valid Values/Format: Alpha | |

### Return type

[**List&lt;ClaimSummary&gt;**](ClaimSummary.md)

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

<a id="getQueueSummaryPost"></a>
# **getQueueSummaryPost**
> QueueContentSummary getQueueSummaryPost(body)



An issuer or acquirer uses this endpoint to retrieve a list of claims from a queue within a date interval. Claims are sorted by last modified date in descending order.  Note: The response is paginated with up to 2,000 claims per page. The total number of pages is included in the response.  Note: To get exact pageCount the lastModifiedDateFrom and lastModifiedDateTo are required and the date range should be less than or equal to 5 days in the request.

### Example
```java
// Import classes:
import bp4.mastercom_api_client.ApiClient;
import bp4.mastercom_api_client.ApiException;
import bp4.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import bp4.mastercom_api_client.api.QueuesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    QueuesApi apiInstance = new QueuesApi(defaultClient);
    GetQueueContentRequest body = new GetQueueContentRequest(); // GetQueueContentRequest | Get queue content request
    try {
      QueueContentSummary result = apiInstance.getQueueSummaryPost(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QueuesApi#getQueueSummaryPost");
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
| **body** | [**GetQueueContentRequest**](GetQueueContentRequest.md)| Get queue content request | |

### Return type

[**QueueContentSummary**](QueueContentSummary.md)

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

<a id="getQueues"></a>
# **getQueues**
> List&lt;Queue&gt; getQueues()



An issuer or acquirer uses this endpoint to retrieve a list of queues.

### Example
```java
// Import classes:
import bp4.mastercom_api_client.ApiClient;
import bp4.mastercom_api_client.ApiException;
import bp4.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import bp4.mastercom_api_client.api.QueuesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    QueuesApi apiInstance = new QueuesApi(defaultClient);
    try {
      List<Queue> result = apiInstance.getQueues();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QueuesApi#getQueues");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Queue&gt;**](Queue.md)

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

