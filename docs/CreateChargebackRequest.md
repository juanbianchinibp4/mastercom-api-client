

# CreateChargebackRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **String** | Amount of CB should be OT amount (DE4). US Issuers should always submit in USD. For more details refer to the GCMS Reference Manual.   Length: 1-12   Valid Values/Format: Numeric |  |
|**chargebackType** | [**ChargebackTypeEnum**](#ChargebackTypeEnum) | Provide the chargeback.   Length: 10-18   Valid Values/Format: CHARGEBACK, SECOND_PRESENTMENT |  |
|**currency** | **String** | The chargeback currency. The data should be standard currency alpha code or numeric code. Currency should correspond with the amount submitted for chargeback creation Length: 3 Valid Values/Format: A-Z (Uppercase Alphabetic Letter) OR Numeric |  |
|**documentIndicator** | **String** | Document Indicator defines if a document is required for the dispute.   Length: 4-5   Valid Values/Format: true / false |  |
|**reasonCode** | **String** | Chargeback Reason Code provides the chargeback receiver with the reason for sending the chargeback.   Length: 1-4   Valid Values/Format: Numeric |  |
|**credPostedAsPurchase** | **Boolean** | Indicator to notify this is a credit posted as a purchase.   Only applicable to reason codes of 4853 and 4860.  Defaults to false.   Length: 4-5   Valid Values/Format: true / false |  [optional] |
|**isPartialChargeback** | **Boolean** | Indicates a partial chargeback.  Defaults to false.   Length: 4-5   Valid Values/Format: true / false |  [optional] |
|**messageText** | **String** | Member message text to be used for the chargeback.   Length: 0-100   Valid Values/Format: Only Alphanumeric |  [optional] |
|**settlementDate** | **String** | CONDITIONAL: Required for Argentina and Uruguay&#39;s Settlement Service participation ID codes (LA00003201, LA00003202, LA00085801, LA00085802, LA00084011, LA00084012). The date may not be prior to the current date or beyond 90 days from the current date.   Length: 10   Valid Values/Format: Date (yyyy-MM-dd) |  [optional] |
|**disputeChargebackID** | **String** | Accepts a chargeback ID when &#39;chargebackType&#39; is set to &#39;SECOND_PRESENTMENT&#39;   Length: 1-19   Valid Values/Format: Numeric |  [optional] |
|**localTax1IVA** | **String** | Applies only to LAC installments (Argentina and Uruguay). PDS 1015. Contains the VAT amount for the installment fee.   Length: 4-6   Valid Values/Format: Numeric (2 Decimals) |  [optional] |
|**installmentFee** | **String** | Applies only to LAC installments (Argentina and Uruguay). PDS 1028. Contains the VAT amount for the installment fee.   Length: 1-12   Valid Values/Format: Numeric |  [optional] |
|**editExclusionCode** | **String** | Edit exclusion code to bypass clearing system edits.   Length: 1-2   Valid Values/Format: Alphanumeric / Spaces. (Y,B0,B1,B2,B3,B4,B5,B6,B7,B8,B9,BA,BB,BC,BD,BE,BF,BG,BH,BI,BJ,BK,BL,BM,BN,BO,BP,BQ,BR,BS,BT,BU,BV,BW,BX,BY,BZ,SPACES). |  [optional] |
|**refundNotReceivedIndicator** | **String** | Cardholder/Issuer did not receive refund when a first chargeback was rejected by Collaboration with reason code 5000 indicating refund provided. 20 days after rejection of CB through collaboration.   CONDITIONAL: this field is only applicable if chargebackType is CHARGEBACK.   Length: 4-5   Valid Values/Format: true, false |  [optional] |
|**includeCurrencyConversionAssessmentCCA** | **String** | Currency Conversion Assessment amount applied for full first chargeback, to indicate, if Currency Conversion Assessment was included or not for qualified transactions. |  [optional] |
|**fileAttachment** | [**DocumentStructure**](DocumentStructure.md) |  |  [optional] |
|**chargebackEbdfDocuments** | [**ChargebackEbdfStructure**](ChargebackEbdfStructure.md) |  |  [optional] |



## Enum: ChargebackTypeEnum

| Name | Value |
|---- | -----|
| CHARGEBACK | &quot;CHARGEBACK&quot; |
| SECOND_PRESENTMENT | &quot;SECOND_PRESENTMENT&quot; |



