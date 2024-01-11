# mastercom-api-client

MasterCom
- API version: v6
  - Build date: 2023-11-07T19:57:39.604201-03:00[America/Buenos_Aires]

MasterCom


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.bp4.mastercom-api-client-app</groupId>
  <artifactId>mastercom-api-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'mastercom-api-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'mastercom-api-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.bp4.mastercom-api-client-app:mastercom-api-client:1.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/mastercom-api-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import fiserv.mastercom_api_client.ApiClient;
import fiserv.mastercom_api_client.ApiException;
import fiserv.mastercom_api_client.Configuration;
import bp4.mastercom_api_client.models.*;
import api.fiserv.mastercom_api_client.CaseFilingApi;

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

## Documentation for API Endpoints

All URIs are relative to *https://api.mastercard.com/mastercom*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CaseFilingApi* | [**createCaseFiling**](docs/CaseFilingApi.md#createCaseFiling) | **POST** /v6/cases | 
*CaseFilingApi* | [**getCaseFilingDoc**](docs/CaseFilingApi.md#getCaseFilingDoc) | **GET** /v6/cases/{case-id}/documents | 
*CaseFilingApi* | [**retrieveCaseFilingImageStatus**](docs/CaseFilingApi.md#retrieveCaseFilingImageStatus) | **PUT** /v6/cases/imagestatus | 
*CaseFilingApi* | [**retrieveCaseFilingStatus**](docs/CaseFilingApi.md#retrieveCaseFilingStatus) | **PUT** /v6/cases/status | 
*CaseFilingApi* | [**retrieveClaims**](docs/CaseFilingApi.md#retrieveClaims) | **PUT** /v6/cases/retrieve/claims | 
*CaseFilingApi* | [**updateCaseFiling**](docs/CaseFilingApi.md#updateCaseFiling) | **PUT** /v6/cases/{case-id} | 
*ChargebacksApi* | [**acknowledgeChargebacks**](docs/ChargebacksApi.md#acknowledgeChargebacks) | **PUT** /v6/chargebacks/acknowledge | 
*ChargebacksApi* | [**createChargeback**](docs/ChargebacksApi.md#createChargeback) | **POST** /v6/claims/{claim-id}/chargebacks | 
*ChargebacksApi* | [**createChargebackReversal**](docs/ChargebacksApi.md#createChargebackReversal) | **POST** /v6/claims/{claim-id}/chargebacks/{chargeback-id}/reversal | 
*ChargebacksApi* | [**getChargebackDoc**](docs/ChargebacksApi.md#getChargebackDoc) | **GET** /v6/claims/{claim-id}/chargebacks/{chargeback-id}/documents | 
*ChargebacksApi* | [**getDataForCreateChargeback**](docs/ChargebacksApi.md#getDataForCreateChargeback) | **POST** /v6/claims/{claim-id}/chargebacks/loaddataforchargebacks | 
*ChargebacksApi* | [**retrieveChargebackImageStatus**](docs/ChargebacksApi.md#retrieveChargebackImageStatus) | **PUT** /v6/chargebacks/imagestatus | 
*ChargebacksApi* | [**retrieveChargebackStatus**](docs/ChargebacksApi.md#retrieveChargebackStatus) | **PUT** /v6/chargebacks/status | 
*ChargebacksApi* | [**updateChargeback**](docs/ChargebacksApi.md#updateChargeback) | **PUT** /v6/claims/{claim-id}/chargebacks/{chargeback-id} | 
*ChargebacksDebitMasterCardAndEuropeDualAcquirerApi* | [**acknowledgeChargebacksDebitMC**](docs/ChargebacksDebitMasterCardAndEuropeDualAcquirerApi.md#acknowledgeChargebacksDebitMC) | **PUT** /v6/chargebacks/debitmc/acknowledge | 
*ChargebacksDebitMasterCardAndEuropeDualAcquirerApi* | [**createChargebackDebitMC**](docs/ChargebacksDebitMasterCardAndEuropeDualAcquirerApi.md#createChargebackDebitMC) | **POST** /v6/claims/{claim-id}/chargebacks/debitmc | 
*ChargebacksDebitMasterCardAndEuropeDualAcquirerApi* | [**createChargebackReversalDebitMC**](docs/ChargebacksDebitMasterCardAndEuropeDualAcquirerApi.md#createChargebackReversalDebitMC) | **POST** /v6/claims/{claim-id}/chargebacks/debitmc/{chargeback-id}/reversal | 
*ChargebacksDebitMasterCardAndEuropeDualAcquirerApi* | [**getChargebackDocDebitMC**](docs/ChargebacksDebitMasterCardAndEuropeDualAcquirerApi.md#getChargebackDocDebitMC) | **GET** /v6/claims/{claim-id}/chargebacks/debitmc/{chargeback-id}/documents | 
*ChargebacksDebitMasterCardAndEuropeDualAcquirerApi* | [**retrieveChargebackImageStatusDebitMC**](docs/ChargebacksDebitMasterCardAndEuropeDualAcquirerApi.md#retrieveChargebackImageStatusDebitMC) | **PUT** /v6/chargebacks/debitmc/imagestatus | 
*ChargebacksDebitMasterCardAndEuropeDualAcquirerApi* | [**retrieveChargebackStatusDebitMC**](docs/ChargebacksDebitMasterCardAndEuropeDualAcquirerApi.md#retrieveChargebackStatusDebitMC) | **PUT** /v6/chargebacks/debitmc/status | 
*ChargebacksDebitMasterCardAndEuropeDualAcquirerApi* | [**updateChargebackDebitMC**](docs/ChargebacksDebitMasterCardAndEuropeDualAcquirerApi.md#updateChargebackDebitMC) | **PUT** /v6/claims/{claim-id}/chargebacks/debitmc/{chargeback-id} | 
*ClaimsApi* | [**createClaim**](docs/ClaimsApi.md#createClaim) | **POST** /v6/claims | 
*ClaimsApi* | [**getClaimDetail**](docs/ClaimsApi.md#getClaimDetail) | **GET** /v6/claims/{claim-id} | 
*ClaimsApi* | [**updateClaim**](docs/ClaimsApi.md#updateClaim) | **PUT** /v6/claims/{claim-id} | 
*FeesApi* | [**createFee**](docs/FeesApi.md#createFee) | **POST** /v6/claims/{claim-id}/fee | 
*FeesApi* | [**getDataForCreateFee**](docs/FeesApi.md#getDataForCreateFee) | **POST** /v6/claims/{claim-id}/fees/loaddataforfees | 
*FeesDebitMasterCardAndEuropeDualAcquirerApi* | [**createFeeDebitMC**](docs/FeesDebitMasterCardAndEuropeDualAcquirerApi.md#createFeeDebitMC) | **POST** /v6/claims/{claim-id}/fee/debitmc | 
*FraudApi* | [**createFraudMasterCard**](docs/FraudApi.md#createFraudMasterCard) | **POST** /v6/claims/{claim-id}/fraud/mastercard | 
*FraudApi* | [**getDataForCreateFraud**](docs/FraudApi.md#getDataForCreateFraud) | **GET** /v6/claims/{claim-id}/fraud/loaddataforfraud | 
*HealthCheckApi* | [**healthcheck**](docs/HealthCheckApi.md#healthcheck) | **GET** /v6/healthcheck | 
*QueuesApi* | [**getQueueSummary**](docs/QueuesApi.md#getQueueSummary) | **GET** /v6/queues | 
*QueuesApi* | [**getQueueSummaryPost**](docs/QueuesApi.md#getQueueSummaryPost) | **POST** /v6/queues | 
*QueuesApi* | [**getQueues**](docs/QueuesApi.md#getQueues) | **GET** /v6/queues/names | 
*ReconciliationApi* | [**reconReportDataAcknowledge**](docs/ReconciliationApi.md#reconReportDataAcknowledge) | **POST** /v6/reconreport/data/request | 
*ReconciliationApi* | [**reconReportDataRetrieval**](docs/ReconciliationApi.md#reconReportDataRetrieval) | **POST** /v6/reconreport/data/retrieval/{reportIdentifier} | 
*RetrievalsApi* | [**acqFulfillRetrievalRequest**](docs/RetrievalsApi.md#acqFulfillRetrievalRequest) | **POST** /v6/claims/{claim-id}/retrievalrequests/{request-id}/fulfillments | 
*RetrievalsApi* | [**createRetrievalRequest**](docs/RetrievalsApi.md#createRetrievalRequest) | **POST** /v6/claims/{claim-id}/retrievalrequests | 
*RetrievalsApi* | [**getDataForCreateRetrievalRequest**](docs/RetrievalsApi.md#getDataForCreateRetrievalRequest) | **GET** /v6/claims/{claim-id}/retrievalrequests/loaddataforretrievalrequests | 
*RetrievalsApi* | [**getRetrievalDoc**](docs/RetrievalsApi.md#getRetrievalDoc) | **GET** /v6/claims/{claim-id}/retrievalrequests/{request-id}/documents | 
*RetrievalsApi* | [**issuerResponseRetrievalRequest**](docs/RetrievalsApi.md#issuerResponseRetrievalRequest) | **POST** /v6/claims/{claim-id}/retrievalrequests/{request-id}/fulfillments/response | 
*RetrievalsApi* | [**retrieveFulfillmentImageStatus**](docs/RetrievalsApi.md#retrieveFulfillmentImageStatus) | **PUT** /v6/retrievalrequests/imagestatus | 
*RetrievalsApi* | [**retrieveFulfillmentStatus**](docs/RetrievalsApi.md#retrieveFulfillmentStatus) | **PUT** /v6/retrievalrequests/status | 
*RetrievalsDebitMasterCardAndEuropeDualAcquirerApi* | [**createRetrievalRequestDebitMC**](docs/RetrievalsDebitMasterCardAndEuropeDualAcquirerApi.md#createRetrievalRequestDebitMC) | **POST** /v6/claims/{claim-id}/retrievalrequests/debitmc | 
*RetrievalsDebitMasterCardAndEuropeDualAcquirerApi* | [**getRetrievalDocDebitMC**](docs/RetrievalsDebitMasterCardAndEuropeDualAcquirerApi.md#getRetrievalDocDebitMC) | **GET** /v6/claims/{claim-id}/retrievalrequests/debitmc/{request-id}/documents | 
*RetrievalsDebitMasterCardAndEuropeDualAcquirerApi* | [**issuerResponseRetrievalDebitMCRequest**](docs/RetrievalsDebitMasterCardAndEuropeDualAcquirerApi.md#issuerResponseRetrievalDebitMCRequest) | **POST** /v6/claims/{claim-id}/retrievalrequests/debitmc/{request-id}/fulfillments/response | 
*RetrievalsDebitMasterCardAndEuropeDualAcquirerApi* | [**retrieveFulfillmentDebitMCImageStatus**](docs/RetrievalsDebitMasterCardAndEuropeDualAcquirerApi.md#retrieveFulfillmentDebitMCImageStatus) | **PUT** /v6/retrievalrequests/debitmc/imagestatus | 
*RetrievalsDebitMasterCardAndEuropeDualAcquirerApi* | [**retrieveFulfillmentDebitMCStatus**](docs/RetrievalsDebitMasterCardAndEuropeDualAcquirerApi.md#retrieveFulfillmentDebitMCStatus) | **PUT** /v6/retrievalrequests/debitmc/status | 
*TransactionsApi* | [**getTransactionClearingDetail**](docs/TransactionsApi.md#getTransactionClearingDetail) | **GET** /v6/claims/{claim-id}/transactions/clearing/{transaction-id} | 
*TransactionsApi* | [**retrieveAuthorizationDetail**](docs/TransactionsApi.md#retrieveAuthorizationDetail) | **GET** /v6/claims/{claim-id}/transactions/authorization/{transaction-id} | 
*TransactionsApi* | [**transactionSearch**](docs/TransactionsApi.md#transactionSearch) | **POST** /v6/transactions/search | 
*TransactionsDebitMasterCardAndEuropeDualAcquirerApi* | [**transactionDebitMCMessageDetail**](docs/TransactionsDebitMasterCardAndEuropeDualAcquirerApi.md#transactionDebitMCMessageDetail) | **GET** /v6/{claim-id}/transactions/debitmc/detail | 
*TransactionsDebitMasterCardAndEuropeDualAcquirerApi* | [**transactionMessageSearchDebitMC**](docs/TransactionsDebitMasterCardAndEuropeDualAcquirerApi.md#transactionMessageSearchDebitMC) | **POST** /v6/transactions/debitmc/search | 


## Documentation for Models

 - [AcquirerFulfillmentRequest](docs/AcquirerFulfillmentRequest.md)
 - [AcquirerFulfillmentResponse](docs/AcquirerFulfillmentResponse.md)
 - [AuthorizationDetail](docs/AuthorizationDetail.md)
 - [AuthorizationSummary](docs/AuthorizationSummary.md)
 - [CardholderDisputeChargebackDrfDocumentStructure](docs/CardholderDisputeChargebackDrfDocumentStructure.md)
 - [CardholderVerificationMethodStructure](docs/CardholderVerificationMethodStructure.md)
 - [CaseFilingClaim](docs/CaseFilingClaim.md)
 - [CaseFilingClaimsRequest](docs/CaseFilingClaimsRequest.md)
 - [CaseFilingClaimsResponse](docs/CaseFilingClaimsResponse.md)
 - [CaseFilingDetails](docs/CaseFilingDetails.md)
 - [CaseFilingEbdfStructure](docs/CaseFilingEbdfStructure.md)
 - [CaseFilingIdSourceRequest](docs/CaseFilingIdSourceRequest.md)
 - [CaseFilingImageStatusRequest](docs/CaseFilingImageStatusRequest.md)
 - [CaseFilingImageStatusResponse](docs/CaseFilingImageStatusResponse.md)
 - [CaseFilingImageStatusResponseStructure](docs/CaseFilingImageStatusResponseStructure.md)
 - [CaseFilingLifeCycle](docs/CaseFilingLifeCycle.md)
 - [CaseFilingRespHistory](docs/CaseFilingRespHistory.md)
 - [CaseFilingResponse](docs/CaseFilingResponse.md)
 - [CaseFilingStatusRequest](docs/CaseFilingStatusRequest.md)
 - [CaseFilingStatusRequestStructure](docs/CaseFilingStatusRequestStructure.md)
 - [CaseFilingStatusResponse](docs/CaseFilingStatusResponse.md)
 - [CaseFilingStatusResponseStructure](docs/CaseFilingStatusResponseStructure.md)
 - [ChargebackAmountNameValueDetail](docs/ChargebackAmountNameValueDetail.md)
 - [ChargebackDetails](docs/ChargebackDetails.md)
 - [ChargebackDocIndicatorsNameValueDetail](docs/ChargebackDocIndicatorsNameValueDetail.md)
 - [ChargebackEbdfStructure](docs/ChargebackEbdfStructure.md)
 - [ChargebackImageStatusRequest](docs/ChargebackImageStatusRequest.md)
 - [ChargebackImageStatusResponse](docs/ChargebackImageStatusResponse.md)
 - [ChargebackImageStatusResponseStructure](docs/ChargebackImageStatusResponseStructure.md)
 - [ChargebackMarkProcessedRequest](docs/ChargebackMarkProcessedRequest.md)
 - [ChargebackMarkProcessedRequestStructure](docs/ChargebackMarkProcessedRequestStructure.md)
 - [ChargebackMarkProcessedResponse](docs/ChargebackMarkProcessedResponse.md)
 - [ChargebackMarkProcessedResponseStructure](docs/ChargebackMarkProcessedResponseStructure.md)
 - [ChargebackMessageTextsNameValueDetail](docs/ChargebackMessageTextsNameValueDetail.md)
 - [ChargebackReasonCodesNameValueDetail](docs/ChargebackReasonCodesNameValueDetail.md)
 - [ChargebackResponse](docs/ChargebackResponse.md)
 - [ChargebackStatusRequest](docs/ChargebackStatusRequest.md)
 - [ChargebackStatusRequestStructure](docs/ChargebackStatusRequestStructure.md)
 - [ChargebackStatusResponse](docs/ChargebackStatusResponse.md)
 - [ChargebackStatusResponseStructure](docs/ChargebackStatusResponseStructure.md)
 - [ClaimDetail](docs/ClaimDetail.md)
 - [ClaimResponse](docs/ClaimResponse.md)
 - [ClaimSummary](docs/ClaimSummary.md)
 - [ClearingDetail](docs/ClearingDetail.md)
 - [ClearingSummary](docs/ClearingSummary.md)
 - [CreateCaseRequest](docs/CreateCaseRequest.md)
 - [CreateChargebackRequest](docs/CreateChargebackRequest.md)
 - [CreateChargebackSingleRequest](docs/CreateChargebackSingleRequest.md)
 - [CreateChargebackSingleReversalRequest](docs/CreateChargebackSingleReversalRequest.md)
 - [CreateClaimRequest](docs/CreateClaimRequest.md)
 - [CreateFeeRequest](docs/CreateFeeRequest.md)
 - [CreateFeeRequestSingle](docs/CreateFeeRequestSingle.md)
 - [CreateFraudMasterCardRequest](docs/CreateFraudMasterCardRequest.md)
 - [CreateRetrievalRequest](docs/CreateRetrievalRequest.md)
 - [CreateRetrievalRequestSingle](docs/CreateRetrievalRequestSingle.md)
 - [CreateRetrievalResponse](docs/CreateRetrievalResponse.md)
 - [CurrenciesNameValueDetail](docs/CurrenciesNameValueDetail.md)
 - [Cycle](docs/Cycle.md)
 - [DocumentResponseStructure](docs/DocumentResponseStructure.md)
 - [DocumentStructure](docs/DocumentStructure.md)
 - [DocumentStructureResp](docs/DocumentStructureResp.md)
 - [Error](docs/Error.md)
 - [ErrorDetail](docs/ErrorDetail.md)
 - [Errors](docs/Errors.md)
 - [ExpeditedBillingDrfDocumentStructure](docs/ExpeditedBillingDrfDocumentStructure.md)
 - [FeeCountryCodesNameValueDetail](docs/FeeCountryCodesNameValueDetail.md)
 - [FeeDetails](docs/FeeDetails.md)
 - [FeeMessageTextsNameValueDetail](docs/FeeMessageTextsNameValueDetail.md)
 - [FeeReasonCodesNameValueDetail](docs/FeeReasonCodesNameValueDetail.md)
 - [FeeResponse](docs/FeeResponse.md)
 - [FeeSingleResponse](docs/FeeSingleResponse.md)
 - [FraudAcctDeviceTypesNameValueDetail](docs/FraudAcctDeviceTypesNameValueDetail.md)
 - [FraudAcctStatusesNameValueDetail](docs/FraudAcctStatusesNameValueDetail.md)
 - [FraudCardValidCodesNameValueDetail](docs/FraudCardValidCodesNameValueDetail.md)
 - [FraudDrfDocumentStructure](docs/FraudDrfDocumentStructure.md)
 - [FraudResponse](docs/FraudResponse.md)
 - [FraudSubTypesNameValueDetail](docs/FraudSubTypesNameValueDetail.md)
 - [GetQueueContentRequest](docs/GetQueueContentRequest.md)
 - [HealthCheckResponse](docs/HealthCheckResponse.md)
 - [InstallmentParameters](docs/InstallmentParameters.md)
 - [IssuerFulfillmentRequest](docs/IssuerFulfillmentRequest.md)
 - [LoadDataForChargebackResponse](docs/LoadDataForChargebackResponse.md)
 - [LoadDataForChargebacksRequest](docs/LoadDataForChargebacksRequest.md)
 - [LoadDataForFeeResponse](docs/LoadDataForFeeResponse.md)
 - [LoadDataForFeesRequest](docs/LoadDataForFeesRequest.md)
 - [LoadDataForFraudResponse](docs/LoadDataForFraudResponse.md)
 - [LoadDataForRetrievalResponse](docs/LoadDataForRetrievalResponse.md)
 - [OriginalInformationInstallments](docs/OriginalInformationInstallments.md)
 - [PointOfInteractionErrorsDrfDocumentStructure](docs/PointOfInteractionErrorsDrfDocumentStructure.md)
 - [Queue](docs/Queue.md)
 - [QueueContentSummary](docs/QueueContentSummary.md)
 - [ReconReportDataAcknowledgeRequest](docs/ReconReportDataAcknowledgeRequest.md)
 - [ReconReportDataAcknowledgeResponse](docs/ReconReportDataAcknowledgeResponse.md)
 - [ReconReportDataRetrivalResponse](docs/ReconReportDataRetrivalResponse.md)
 - [RetrievalDocNeededNameValueDetail](docs/RetrievalDocNeededNameValueDetail.md)
 - [RetrievalReasonCodesNameValueDetail](docs/RetrievalReasonCodesNameValueDetail.md)
 - [RetrievalResponse](docs/RetrievalResponse.md)
 - [RetrievalStatusRequest](docs/RetrievalStatusRequest.md)
 - [RetrievalStatusRequestStructure](docs/RetrievalStatusRequestStructure.md)
 - [RetrievalStatusResponse](docs/RetrievalStatusResponse.md)
 - [RetrievalStatusResponseStructure](docs/RetrievalStatusResponseStructure.md)
 - [RetrievalSummary](docs/RetrievalSummary.md)
 - [RetrievalsImageStatusRequest](docs/RetrievalsImageStatusRequest.md)
 - [RetrievalsImageStatusResponse](docs/RetrievalsImageStatusResponse.md)
 - [RetrievalsImageStatusResponseStructure](docs/RetrievalsImageStatusResponseStructure.md)
 - [SingleMessageDetail](docs/SingleMessageDetail.md)
 - [SingleMessageSummary](docs/SingleMessageSummary.md)
 - [SingleMessageSummaryDetails](docs/SingleMessageSummaryDetails.md)
 - [SmsLinkedCaseFilingDrfDocumentStructure](docs/SmsLinkedCaseFilingDrfDocumentStructure.md)
 - [TransactionInformationEbdfStructure](docs/TransactionInformationEbdfStructure.md)
 - [TransactionSearchRequest](docs/TransactionSearchRequest.md)
 - [TransactionSingleMessageDetail](docs/TransactionSingleMessageDetail.md)
 - [TransactionSingleMessageSummary](docs/TransactionSingleMessageSummary.md)
 - [TransactionSingleMessageSummaryList](docs/TransactionSingleMessageSummaryList.md)
 - [TransactionSingleSearchRequest](docs/TransactionSingleSearchRequest.md)
 - [TransactionSummary](docs/TransactionSummary.md)
 - [UpdateCaseRequest](docs/UpdateCaseRequest.md)
 - [UpdateChargebackRequest](docs/UpdateChargebackRequest.md)
 - [UpdateClaimRequest](docs/UpdateClaimRequest.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



