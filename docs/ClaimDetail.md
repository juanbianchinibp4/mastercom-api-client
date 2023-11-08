

# ClaimDetail


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acquirerId** | **String** | Acquirer Inst Id |  [optional] |
|**acquirerRefNum** | **String** | Acquirer Reference Number |  [optional] |
|**primaryAccountNum** | **String** | Card Number for which the Claim is opened |  [optional] |
|**claimId** | **String** | Claim Id |  [optional] |
|**claimType** | **String** | Claim Type |  [optional] |
|**claimValue** | **String** | The value of the claim |  [optional] |
|**standardClaims** | **String** | Contain all Standard Claim Ids associated with the claimType of CaseFiling.  This field will contain a comma delimited list. |  [optional] |
|**clearingDueDate** | **String** | The clearing due date of the claim |  [optional] |
|**clearingNetwork** | **String** | Clearing Network |  [optional] |
|**createDate** | **String** | This is the date of the Claim creation |  [optional] |
|**dueDate** | **String** | The due date of the claim |  [optional] |
|**transactionId** | **String** | An alphanumeric identifier that ties the clearingTransactionId and authTransactionId to the Claim. The format is TI:&lt;ClearingSummary.transactionId&gt;#&lt;AuthorizationSummary.transactionId&gt; |  [optional] |
|**isAccurate** | **String** | True if the claim value is accurate |  [optional] |
|**isAcquirer** | **String** | True if the claim is acquirer |  [optional] |
|**isIssuer** | **String** | True if the claim is issuer |  [optional] |
|**isOpen** | **String** | True if the claim is open |  [optional] |
|**issuerId** | **String** | The issuer institution identifier |  [optional] |
|**lastModifiedBy** | **String** | User who signed this event |  [optional] |
|**lastModifiedDate** | **String** | The date of the last claim modification |  [optional] |
|**merchantId** | **String** | Returns the related merchant identifier |  [optional] |
|**queueName** | **String** | The queue name to which the claim has been allocated |  [optional] |
|**switchSerialNumber** | **String** | The Switch Serial Number is a unique transaction identification number generated (or assigned) by the Single Message System |  [optional] |
|**caseFilingDetails** | [**CaseFilingLifeCycle**](CaseFilingLifeCycle.md) |  |  [optional] |
|**retrievalDetails** | [**RetrievalSummary**](RetrievalSummary.md) |  |  [optional] |
|**chargebackDetails** | [**List&lt;ChargebackDetails&gt;**](ChargebackDetails.md) |  |  [optional] |
|**feeDetails** | [**List&lt;FeeDetails&gt;**](FeeDetails.md) |  |  [optional] |
|**retrievalDetailsList** | [**List&lt;RetrievalSummary&gt;**](RetrievalSummary.md) |  |  [optional] |



