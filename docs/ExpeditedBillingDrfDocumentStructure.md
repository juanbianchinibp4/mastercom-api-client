

# ExpeditedBillingDrfDocumentStructure


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cardholderName** | **String** | CONDITIONAL: The cardholder&#39;s name is optional on Dispute Resolution Form - Pre-Compliance/Compliance form.   Length: 1-30   Valid Values/Format: Alphanumeric, Special Char (~!@#$%^&amp;*()_+{}|:\&quot;&lt;&gt;?,./;&#39;[]-&#x3D;) |  [optional] |
|**acquirerRefData** | **String** | The Acquirer’s Reference Data.   Length: 1-23   Valid Values/Format: Numeric |  [optional] |
|**transactionDate** | **String** | The transaction date.   Length: 11   Valid Values/Format: Date (dd-MMM-yyyy) |  [optional] |
|**transactionAmount** | **String** | The total transaction amount.   Length: 4-12   Valid Values/Format: Numeric |  [optional] |
|**disputeDescription** | **String** | Give a reasonably specific description of the dispute.   Length: 1-1500   Valid Values/Format: Alphanumeric, Special Char (~!@#$%^&amp;*()_+{}|:\&quot;&lt;&gt;?,./;&#39;[]-&#x3D;) |  [optional] |
|**certification** | **String** | Who is the company representative or government agency representative on behalf of the corporate card.   Length: 1-24   Valid Values/Format: Alphanumeric, Special Char (~!@#$%^&amp;*()_+{}|:\&quot;&lt;&gt;?,./;&#39;[]-&#x3D;) |  [optional] |
|**chargebackRepresentative** | **String** | Customer Service/Chargeback Representative.   Length: 1-25   Valid Values/Format: Alphanumeric, Special Char (~!@#$%^&amp;*()_+{}|:\&quot;&lt;&gt;?,./;&#39;[]-&#x3D;) |  [optional] |



