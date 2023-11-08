

# FeeDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cardAcceptorIdCode** | **String** | Merchant Id associated with this fee collection..if any |  [optional] |
|**cardNumber** | **String** | Card number when required by the reason code |  [optional] |
|**countryCode** | **String** | Code identifying the country |  [optional] |
|**currency** | **String** | Currency of the fee |  [optional] |
|**feeDate** | **String** | Date the fee was attached to the claim |  [optional] |
|**destinationMember** | **String** | Destination member for the fee collection |  [optional] |
|**feeId** | **String** | Identifier assigned to the fee |  [optional] |
|**feeAmount** | **String** | Amount of the fee.    - When the amount is a credit to the sender of the fee collection, the value of feeAmount is positive.    - When the amount is a debit to the sender of the fee collection, the value of feeAmount is negative.    - When the amount is a credit to the receiver of the fee collection, the value of feeAmount is negative.    - When the amount is a debit to the receiver of the fee collection, the value of feeAmount is positive.    See also the creditSender and creditReceiver parameters. |  [optional] |
|**creditSender** | **Boolean** | Credit the Sender |  [optional] |
|**creditReceiver** | **Boolean** | Credit the Receiver |  [optional] |
|**message** | **String** | Message regarding fee |  [optional] |
|**reason** | **String** | Collection Reason Code |  [optional] |
|**rejectReason** | **String** | Fee reject reason. |  [optional] |
|**chargebackRefNum** | **String** | Contains card issuer reference data for a specific cardholder transaction. This number must be unique within BIN. It is used to track the chargeback throughout its life cycle |  [optional] |
|**reconciliationAmount** | **String** | Reconciliation amount of the fee. Amount will only be retrieved by the receiver side of the fee |  [optional] |
|**reconciliationCurrency** | **String** | Reconciliation currency of the fee. Currency will only be retrieved by the receiver side of the fee |  [optional] |
|**japanCommonMerchantCode** | **String** | Identifies the merchant&#39;s category in Japan referred to as the Common Merchant Category Code (CMC). Mastercard uses this value to identify a link to a corresponding Mastercard Assigned ID. |  [optional] |
|**installmentData** | **String** | Provides information about the installment payment option selected by the cardholder at the point of interaction. |  [optional] |
|**flexCode** | **String** | Specific to Brazil Flex Card transactions to communicate the product code used for clearing. |  [optional] |



