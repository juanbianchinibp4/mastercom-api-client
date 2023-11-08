

# CardholderDisputeChargebackDrfDocumentStructure


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionAmount** | **String** | The transaction amount.   Length: 0-12   Valid Values/Format: Numeric |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of Carholder Dispute.   Length: 11-22   Valid Values/Format: PRODUCT_DISPUTE,NOT_PROVIDED,DIGITAL_GOODS,CREDIT_NOT_PROCESSED,COUNTERFEIT,RECURRING_CANCELLED,RECURRING_DISCLOSURE,ADDENDUM_DISPUTE,HOTEL_NO_SHOW,PURCHASE_INCOMPLETE,CANCELLATION_AGREEMENT,POSTED_CREDIT,FAILED_TRAVEL |  [optional] |
|**deliveryDateOfGoodsOrServices** | **String** | CONDITIONAL: In case of PRODUCT_DISPUTE, delivery date of the goods or services.   Length: 11   Valid Values/Format: Date (dd-MMM-yyyy) |  [optional] |
|**expectedDeliveryDateOfGoodOrServices** | **String** | CONDITIONAL: In case of NOT_PROVIDED, expected delivery date of the goods or services.   Length: 11   Valid Values/Format: Date (dd-MMM-yyyy) |  [optional] |
|**returnDate** | **String** | CONDITIONAL: In case of DIGITAL_GOODS, return or cancellation of the goods or services.   Length: 11   Valid Values/Format: Date (dd-MMM-yyyy) |  [optional] |
|**cancellationDate** | **String** | CONDITIONAL: In case of RECURRING_CANCELLED, cancellation of the goods or services.   Length: 11   Valid Values/Format: Date (dd-MMM-yyyy) |  [optional] |
|**cardholderParticipation** | **Boolean** | Did the cardholder participate in the transaction?   Length: 4-5   Valid Values/Format: true / false |  [optional] |
|**disputeDetails** | **String** | Describe the cardholder’s compliant in sufficient detail to meet the requirements for the chargeback as described in the Chargeback Guide and to enable all parties to understand the dispute.   Length: 0-3000   Valid Values/Format: Alphanumeric / Special Char (~!@#$%^&amp;*()_+{}|:\&quot;&lt;&gt;?,./;&#39;[]-&#x3D;) |  [optional] |
|**chargebackRepresentative** | **String** | Customer Service/Chargeback Representative.   Length: 0-25   Valid Values/Format: Alphanumeric / Special Char (~!@#$%^&amp;*()_+{}|:\&quot;&lt;&gt;?,./;&#39;[]-&#x3D;) |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PRODUCT_DISPUTE | &quot;PRODUCT_DISPUTE&quot; |
| NOT_PROVIDED | &quot;NOT_PROVIDED&quot; |
| DIGITAL_GOODS | &quot;DIGITAL_GOODS&quot; |
| CREDIT_NOT_PROCESSED | &quot;CREDIT_NOT_PROCESSED&quot; |
| COUNTERFEIT | &quot;COUNTERFEIT&quot; |
| RECURRING_CANCELLED | &quot;RECURRING_CANCELLED&quot; |
| RECURRING_DISCLOSURE | &quot;RECURRING_DISCLOSURE&quot; |
| ADDENDUM_DISPUTE | &quot;ADDENDUM_DISPUTE&quot; |
| HOTEL_NO_SHOW | &quot;HOTEL_NO_SHOW&quot; |
| PURCHASE_INCOMPLETE | &quot;PURCHASE_INCOMPLETE&quot; |
| CANCELLATION_AGREEMENT | &quot;CANCELLATION_AGREEMENT&quot; |
| POSTED_CREDIT | &quot;POSTED_CREDIT&quot; |
| FAILED_TRAVEL | &quot;FAILED_TRAVEL&quot; |



