

# SingleMessageSummary


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acquirerReferenceNumber** | **String** | Contains the acquirers reference number. |  [optional] |
|**adviceReasonCode** | **String** | Used to inform processors an action has been taken on the advice messages.  |  [optional] |
|**brand** | **String** | The brand of service or program.  Acceptable values...MC - Mastercard, CI - Cirrus®, MS - Maestro®, MD - Debit Mastercard ®card, PL - Plus®, PV(L) - Private Label, VI - VISA |  [optional] |
|**localCurrencyCode** | **String** | The code defining the currency of the transaction as it was submitted to the Single Message System. The Single Message System uses it to specify the currency used in localRequestedAmount |  [optional] |
|**localRequestedAmount** | **String** | The amount of funds requested by the cardholder in the local currency of the acquirer or source location of the transaction. |  [optional] |
|**merchantName** | **String** | For POS acquirers this is the name of the merchant owning the POS terminal. For ATM acquirers this the ATM owning institution name. |  [optional] |
|**merchantType** | **String** | Card Acceptor Business Code. Identifies the card acceptor’s primary business. |  [optional] |
|**primaryAccountNumber** | **String** | Series of digits used to identify a customer account or relationship. |  [optional] |
|**processingCode** | **String** | Series of digits used to describe the effect of a transaction on the customer account and the type of accounts affected. |  [optional] |
|**responseCode** | **String** | This field displays the disposition of a message. |  [optional] |
|**responseSource** | **String** | M &#x3D; The decline was initiated by the member/issuer, S &#x3D; The decline was initiated by the Single Message System. |  [optional] |
|**settlementDate** | **String** | Date Mastercard uses to group the transactions for reporting and for subsequent settlement: Format: MMDDYY |  [optional] |
|**switchSerialNumber** | **String** | Describes a unique transaction identification number generated (or assigned) by the Single Message System |  [optional] |
|**switchDateTime** | **String** | Date and time Mastercard routes the transaction to the issuer  (MMDDHHMMSS) |  [optional] |
|**trace** | **String** | Unique identifier assigned to each transaction by the originator of the message |  [optional] |
|**tranType** | **String** | Tran Type |  [optional] |



