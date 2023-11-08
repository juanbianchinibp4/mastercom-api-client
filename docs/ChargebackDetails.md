

# ChargebackDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**currency** | **String** | The chargeback currency.  The data should be standard currency alpha code |  [optional] |
|**createDate** | **String** | This is the date of the chargeback creation |  [optional] |
|**documentIndicator** | **String** | Document Indicator |  [optional] |
|**messageText** | **String** | Member message text to be used for the chargeback |  [optional] |
|**amount** | **String** | Chargeback Amount |  [optional] |
|**reasonCode** | **String** | Chargeback Reason Code |  [optional] |
|**isPartialChargeback** | **Boolean** | Indicates a partial chargeback |  [optional] |
|**chargebackType** | [**ChargebackTypeEnum**](#ChargebackTypeEnum) | Provide the chargeback type.  The following values are valid - CHARGEBACK, SECOND_PRESENTMENT |  [optional] |
|**chargebackId** | **String** | Identifier assigned to the Chargeback |  [optional] |
|**claimId** | **String** | Claim identifier |  [optional] |
|**reversed** | **Boolean** | Indicates this chargeback has been reversed |  [optional] |
|**reversal** | **Boolean** | Indicates this chargeback is a reversal chargeback |  [optional] |
|**chargebackRefNum** | **String** | Contains card issuer reference data for a specific cardholder transaction. This number must be unique within BIN. It is used to track the chargeback throughout its life cycle |  [optional] |
|**documentStatus** | **String** | The document status on chargebacks is helpful for customers to identify the chargebacks that need documents to be uploaded within the stipulated 8 days limit for uploading documentation after chargeback creation. |  [optional] |
|**reconciliationAmount** | **String** | Reconciliation amount of the chargeback type. Amount will only be retrieved by the receiver side of the dispute cycle. |  [optional] |
|**reconciliationCurrency** | **String** | Reconciliation currency of the chargeback type. Currency will only be retrieved by the receiver side of the dispute cycle. |  [optional] |
|**rejectReason** | **String** | Chargeback reject reason.  Bridged chargeback reject reason - Possible values:   Code1&#x3D;2802(00):D0025/000;DE072&#x3D;D0025\\\\\\\\0000\\\\\\\\\\\\\\\\ - Ineligible chargeback reject reason codes &#39;FNS COUNTER EXCEEDED&#39;   Code1&#x3D;2801(00):D0025/000;DE072&#x3D;D0025\\\\\\\\0000\\\\\\\\\\\\\\\\ - Ineligible chargeback reject reason codes &#39;FNS DATE EXCEEDED&#39;   Code1&#x3D;2570(00):D0025/000;DE072&#x3D;D0025\\\\\\\\0000\\\\\\\\\\\\\\\\ - Chargeback not allowed beyond 120 days of transaction date   Code1&#x3D;5050(00):D0025/000;DE072&#x3D;D0025\\\\\\\\0000\\\\\\\\\\\\\\\\ - New amount and Org amount can&#39;t be equal   Code1&#x3D;5051(00):D0025/000;DE072&#x3D;D0025\\\\\\\\0000\\\\\\\\\\\\\\\\ - Other errors                |  [optional] |
|**editExclusionCode** | **String** | Edit exclusion code to bypass clearing system edits. Valid Values - Y ,B0,B1,B2,B3,B4,B5,B6,B7,B8,B9,BA,BB,BC,BD,BE,BF,BG,BH,BI,BJ,BK,BL,BM,BN,BO,BP,BQ,BR,BS,BT,BU,BV,BW,BX,BY,BZ,SPACES. |  [optional] |
|**refundNotReceivedIndicator** | **String** | Cardholder/Issuer did not receive refund when a first chargeback was rejected by Collaboration with reason code 5000 indicating refund provided. 20 days after rejection of CB through collaboration. This field is only applicable if chargebackType is CHARGEBACK. Valid values are: true, false. |  [optional] |
|**creditVoucherStatus** | **String** | The actual status of the credit voucher |  [optional] |
|**currencyConversionAssessmentCCAIncluded** | **String** | Currency Conversion Assessment amount applied for full first chargeback, to indicate, if Currency Conversion Assessment was included or not for qualified transactions. |  [optional] |
|**currencyConversionAssessmentCCAAmount** | **String** | Currency Conversion Assessment amount Fee associated with full first chargeback. |  [optional] |
|**japanCommonMerchantCode** | **String** | Identifies the merchant&#39;s category in Japan referred to as the Common Merchant Category Code (CMC). Mastercard uses this value to identify a link to a corresponding Mastercard Assigned ID. |  [optional] |
|**installmentData** | **String** | Provides information about the installment payment option selected by the cardholder at the point of interaction. |  [optional] |
|**flexCode** | **String** | Specific to Brazil Flex Card transactions to communicate the product code used for clearing. |  [optional] |



## Enum: ChargebackTypeEnum

| Name | Value |
|---- | -----|
| CHARGEBACK | &quot;CHARGEBACK&quot; |
| SECOND_PRESENTMENT | &quot;SECOND_PRESENTMENT&quot; |



