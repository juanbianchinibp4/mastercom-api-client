

# AuthorizationSummary


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**originalMessageTypeIdentifier** | **String** | Indicates the Message Type Identifier (MTI) of the original message |  [optional] |
|**banknetDate** | **String** | The date/time when the SAFE record is matched to the Authorization transaction |  [optional] |
|**transactionAmountUsd** | **String** | Transaction amount in USD |  [optional] |
|**primaryAccountNumber** | **String** | Primary account number |  [optional] |
|**processingCode** | **String** | A series of digits used to describe the effect of a transaction on the customer account and the type of accounts affected |  [optional] |
|**transactionAmountLocal** | **String** | Transaction amount in local currency |  [optional] |
|**authorizationDateAndTime** | **String** | The date and time that a message is entered into the Mastercard Network |  [optional] |
|**authenticationId** | **String** | Defined by the Authorization Platform and is passed to the issuer to indicate that the transaction qualified for Authentication service |  [optional] |
|**cardAcceptorName** | **String** | Name the card acceptor that defines the point of interaction in both local and interchange environments (excluding ATM and Card-Activated Public Phones) |  [optional] |
|**cardAcceptorCity** | **String** | City of the card acceptor that defines the point of interaction in both local and interchange environments (excluding ATM and Card-Activated Public Phones) |  [optional] |
|**cardAcceptorState** | **String** | State of the card acceptor that defines the point of interaction in both local and interchange environments (excluding ATM and Card-Activated Public Phones) |  [optional] |
|**currencyCode** | **String** | Currency code the issuer will be charging the cardholder for repayment |  [optional] |
|**chipPresent** | **String** | Indicates if chip was present or not |  [optional] |
|**transactionId** | **String** | The host&#39;s identifier |  [optional] |
|**track1** | **String** | The information encoded on track 1 of the card&#39;s magnetic stripe as defined in the ISO 7813 specification, including data element separators but excluding beginning and ending sentinels and LRC characters as defined in this data element definition |  [optional] |
|**track2** | **String** | The information encoded on track 2 of the card magnetic stripe as defined in the ISO 7813 specification, including data element separators but excluding beginning and ending sentinels and longitudinal redundancy check (LRC) characters as defined therein |  [optional] |
|**clearingSummary** | [**List&lt;ClearingSummary&gt;**](ClearingSummary.md) |  |  [optional] |



