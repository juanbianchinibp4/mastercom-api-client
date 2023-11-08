

# AcquirerFulfillmentRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acquirerResponseCd** | [**AcquirerResponseCdEnum**](#AcquirerResponseCdEnum) | Acquirer Response Code.   NOTE: Acquirers can no longer respond to retrieval requests using the existing process in production, except for transactions related to U.S. healthcare.   NOTE: Below acquirerResponseCd codes will be accepted starting on February 26th, 2023.    A - Funds Movement Request, B - Refunded, C - Initiating Refund, E - Reject Collaboration, F - IIAS Unfulfillable, G - IIAS Invalid request information, H - IIAS Fulfilled outside MasterCom system   Length: 1   Valid Values/Format: A - Funds Movement Request, B - Refunded, C - Initiating Refund, E - Reject Collaboration, F - IIAS Unfulfillable, G - IIAS Invalid request information, H - IIAS Fulfilled outside MasterCom system |  |
|**refundReversalType** | **String** | Refund/Reversal Type.   CONDITIONAL: This field is not valid if acquirerResponseCd is A, E, F, G or H.   If acquirerResponseCd is C, then CREDIT VOUCHER is not a valid value.   Required if acquirerResponseCd is B.   Length: 6-14   Valid Values/Format: REFUND, CREDIT VOUCHER |  [optional] |
|**refundReversalDate** | **String** | Refund/Reversal Date.   CONDITIONAL: This field is not valid if acquirerResponseCd is A, E, F, G or H.   Not valid if refundReversalType is not provided.   Required if acquirerResponseCd is B or C and refundReversalType is REFUND.   Length: 16   Valid Values/Format: Date (yyyy-MM-ddTHH:mm) |  [optional] |
|**refundReversalAmount** | **String** | Refund/Reversal Amount.   CONDITIONAL: This field is not valid if acquirerResponseCd is A, E, F, G or H.   This field is only valid if acquirerResponseCd is B and refundReversalType is CREDIT VOUCHER.   Not valid if refundReversalType is not provided.   Valid Values/Format: Numeric |  [optional] |
|**refundReversalCurrency** | **String** | Refund/Reversal Currency.   CONDITIONAL: This field is not valid if acquirerResponseCd is A, E, F, G or H.   This field is only valid if acquirerResponseCd is B and refundReversalType is CREDIT VOUCHER.   Not valid if refundReversalType is not provided.   Length: 3   Valid Values/Format: A-Z (Uppercase Alphabetic Letter) |  [optional] |
|**refundReversalReferenceId** | **String** | For Transaction type Authorized transactions:&lt;br&gt; First 12 positions of Data Element (DE) 63 (Network Data) from one of the following:&lt;br&gt; – Authorized refund message (Authorization Request Response/0110 or Financial Transaction Request Response/0210)&lt;br&gt; – Reversal message (Reversal Request Response/ 0410 or Acquirer Reversal Advice Response/ 0430)&lt;br&gt; – Automated fuel dispenser transaction (MCC &#x3D; 5542 and CAT Level 2) (Authorization Advice Response/0130)   For Transaction type Cleared transactions:&lt;br&gt;  DE 63 (Network Data), subfield 2 (Trace ID) in the First Presentment/1240 message   For Transaction type Not authorized but cleared transactions:&lt;br&gt;  Either Private Data Subelement (PDS) 0105 (File ID) or PDS 158, subfield 5 (Central Site Business Date) and subfield 6 (Business Cycle) with no spaces   CONDITIONAL: This field is not valid if acquirerResponseCd is A, E, F, G or H.   Not valid if refundReversalType is not provided.   Required if acquirerResponseCd is B or C and refundReversalType is REFUND.   Length: 8-25   Valid Values/Format: Alphanumeric |  [optional] |
|**memo** | **String** | Memo.   Length: 1-100   Valid Values/Format: Alphanumeric, Special Char (~!@#$%^&amp;*()_+{}|:\&quot;&lt;&gt;?,./;&#39;[]-&#x3D;) |  [optional] |



## Enum: AcquirerResponseCdEnum

| Name | Value |
|---- | -----|
| A | &quot;A&quot; |
| B | &quot;B&quot; |
| C | &quot;C&quot; |
| E | &quot;E&quot; |
| F | &quot;F&quot; |
| G | &quot;G&quot; |
| H | &quot;H&quot; |



