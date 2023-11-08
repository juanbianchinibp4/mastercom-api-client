

# PointOfInteractionErrorsDrfDocumentStructure


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionAmount** | **String** | The transaction amount.   Length: 0-12   Valid Values/Format: Numeric |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the error.   Length: 15-27   Valid Values/Format: DUPLICATE_DEBIT, INCORRECT_AMOUNT, LTD_TRANSACTION, CURRENCY_DISPUTE, UNREASONABLE_AMOUNT, DUPLICATE_TRANSACTION, MERCHANT_CREDIT, IMPROPER_MERCHANT_SURCHARGE |  [optional] |
|**alternateMeansOfPaymentDetails** | **String** | CONDITIONAL: in case of DUPLICATE_DEBIT, Alternate means of payment details.   Length: 0-55   Valid Values/Format: Alphanumeric / Special Char (~!@#$%^&amp;*()_+{}|:\&quot;&lt;&gt;?,./;&#39;[]-&#x3D;) |  [optional] |
|**disputeDetails** | **String** | Describe the cardholder’s compliant in sufficient detail to meet the requirements for the chargeback as described in the Chargeback Guide and to enable all parties to understand the dispute.   Length: 0-4800   Valid Values/Format: Alphanumeric / Special Char (~!@#$%^&amp;*()_+{}|:\&quot;&lt;&gt;?,./;&#39;[]-&#x3D;) |  [optional] |
|**chargebackRepresentative** | **String** | Customer Service/Chargeback Representative.   Length: 0-25   Valid Values/Format: Alphanumeric / Special Char (~!@#$%^&amp;*()_+{}|:\&quot;&lt;&gt;?,./;&#39;[]-&#x3D;) |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DUPLICATE_DEBIT | &quot;DUPLICATE_DEBIT&quot; |
| INCORRECT_AMOUNT | &quot;INCORRECT_AMOUNT&quot; |
| LTD_TRANSACTION | &quot;LTD_TRANSACTION&quot; |
| CURRENCY_DISPUTE | &quot;CURRENCY_DISPUTE&quot; |
| UNREASONABLE_AMOUNT | &quot;UNREASONABLE_AMOUNT&quot; |
| DUPLICATE_TRANSACTION | &quot;DUPLICATE_TRANSACTION&quot; |
| MERCHANT_CREDIT | &quot;MERCHANT_CREDIT&quot; |
| IMPROPER_MERCHANT_SURCHARGE | &quot;IMPROPER_MERCHANT_SURCHARGE&quot; |



