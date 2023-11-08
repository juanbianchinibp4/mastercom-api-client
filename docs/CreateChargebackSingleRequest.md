

# CreateChargebackSingleRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**brand** | [**BrandEnum**](#BrandEnum) | The brand of service or program.   Length: 2   Valid Values/Format: MC - Mastercard, CI - Cirrus®, MS - Maestro®, MD - Debit Mastercard ®card, PL - Plus®, PV(L) - Private Label, VI - VISA |  |
|**replacementAmount** | **String** | Replacement Amount.  The replacement amount should reflect the final amount of the transaction value that should remain applied to the cardholder balance.   Length: 3-12   Valid Values/Format: Numeric |  |
|**reversalReasonCode** | **String** | MDS dispute reason code for creating the dispute item   Length: 1-2   Valid Values/Format: Alphanumeric |  |
|**usageCode** | [**UsageCodeEnum**](#UsageCodeEnum) | The usage code indicates the type of chargeback record processed.   Length: 1   Valid Values/Format: 1 &#x3D; first chargeback, 2 &#x3D; second presentment |  |
|**chargebackType** | [**ChargebackTypeEnum**](#ChargebackTypeEnum) | If 0.00 is entered in the Replacement Amount local field, you will be requested to define the Chargeback as Single or Double. Select chargebackType, either Single Chargeback or Double Chargeback. A double chargeback is used to reverse a credit posted as a debit.   Length: 1   Valid Values/Format: S or D |  [optional] |
|**acquirerFirstReferenceNumber** | **String** | CONDITIONAL: Mandatory when brand is MD and reason code is 34 (Duplicate processing). A unique identifier assigned by the acquirer of Debit Mastercard transactions.   Length: 23   Valid Values/Format: Numeric |  [optional] |
|**additionalInformation** | **String** | Any additional information or note may be entered in this field.   Length: 1-38   Valid Values/Format: Alphanumeric, Special Char (~!@#$%^&amp;*()_+{}|:\&quot;&lt;&gt;?,./;&#39;[]-&#x3D;) |  [optional] |
|**adjustmentContactFax** | **String** | CONDITIONAL: The chargeback contact fax number. Required when brand not MD and reversalReasonCode in one of the following...12, 30, 69, 70, 71, 73, 75, 79, 80, 95, 96, 97, 98.   Length: 1-15   Valid Values/Format: Numeric, Special Char(-) |  [optional] |
|**adjustmentContactName** | **String** | CONDITIONAL: The chargeback contact name. Required when brand not MD and reversalReasonCode in one of the following...12, 30, 69, 70, 71, 73, 75, 79, 80, 95, 96, 97, 98.   Length: 1-24   Valid Values/Format: Character and Space |  [optional] |
|**adjustmentContactPhone** | **String** | CONDITIONAL: The chargeback contact phone number.  Required when brand not MD and reversalReasonCode in one of the following...12, 30, 69, 70, 71, 73, 75, 79, 80, 95, 96, 97, 98   Length: 1-15   Valid Values/Format: Numeric |  [optional] |
|**controlNumber** | **String** | Control Number.  Used to identify the specific transaction for internal auditing and tracing purposes.   Length: 1-5   Valid Values/Format: Numeric |  [optional] |
|**dataRecordText** | [**DataRecordTextEnum**](#DataRecordTextEnum) | Data Record Text.   Length: 2-3   Valid Values/Format: R3,RS7   Note: RS5 (Guarantee No Show) is not supported, customers must use field reversalReasonCode 53 instead |  [optional] |
|**documentIndicator** | [**DocumentIndicatorEnum**](#DocumentIndicatorEnum) | CONDITIONAL: Required when brand is MD and for the following reversalReasonCodes when brand is not MD...70, 71.   Length: 1   Valid Values/Format: 0-No Documentation, 1-Document will follow |  [optional] |
|**documentType** | [**DocumentTypeEnum**](#DocumentTypeEnum) | CONDITIONAL: This field is mandatory when reversalReasonCode is 02.   Length: 1   Valid Values/Format: 1, 2, 4 |  [optional] |
|**illegibleItemCd** | [**IllegibleItemCdEnum**](#IllegibleItemCdEnum) | CONDITIONAL: The supporting documentation was illegible. This field is mandatory when reversalReasonCode is 02.   Length: 1   Valid Values/Format: 1, 2, 3, 4, 5, 6 |  [optional] |
|**program** | [**ProgramEnum**](#ProgramEnum) | CONDITIONAL: The type of card program bearing the account number. This field is mandatory when reversalReasonCode is 49.   Length: 4-5   Valid Values/Format: QMAP, GMAP, INVAL. |  [optional] |
|**retrievalRequestDate** | **String** | CONDITIONAL: The date of the retrieval request.  This field is mandatory when brand is MD and reversalReasonCode is 02.   Length: 6   Valid Values/Format: Date |  [optional] |
|**securityBulletinNumber** | **String** | OPTIONAL: This is three-digit Global Security Bulletin number using a YMM format (for example, bulletin number 6 June 2008 would be entered as 806).  Mandatory when brand is MD and reason code is 49. YMM is the format.   Length: 3   Valid Values/Format: Numeric |  [optional] |
|**fileAttachment** | [**DocumentStructure**](DocumentStructure.md) |  |  [optional] |
|**refundNotReceivedIndicator** | **String** | Cardholder/Issuer did not receive refund when a first chargeback was rejected by Collaboration with reason code 5000 indicating refund provided. 20 days after rejection of CB through collaboration.   CONDITIONAL: this field is only applicable if chargebackType is CHARGEBACK.   Length: 4-5   Valid Values/Format: true, false |  [optional] |



## Enum: BrandEnum

| Name | Value |
|---- | -----|
| MC | &quot;MC&quot; |
| CI | &quot;CI&quot; |
| MS | &quot;MS&quot; |
| MD | &quot;MD&quot; |
| PL | &quot;PL&quot; |
| PV | &quot;PV&quot; |
| VI | &quot;VI&quot; |



## Enum: UsageCodeEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _2 | &quot;2&quot; |



## Enum: ChargebackTypeEnum

| Name | Value |
|---- | -----|
| S | &quot;S&quot; |
| D | &quot;D&quot; |



## Enum: DataRecordTextEnum

| Name | Value |
|---- | -----|
| R3 | &quot;R3&quot; |
| RS7 | &quot;RS7&quot; |



## Enum: DocumentIndicatorEnum

| Name | Value |
|---- | -----|
| _0 | &quot;0&quot; |
| _1 | &quot;1&quot; |



## Enum: DocumentTypeEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _2 | &quot;2&quot; |
| _4 | &quot;4&quot; |



## Enum: IllegibleItemCdEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _2 | &quot;2&quot; |
| _3 | &quot;3&quot; |
| _4 | &quot;4&quot; |
| _5 | &quot;5&quot; |
| _6 | &quot;6&quot; |



## Enum: ProgramEnum

| Name | Value |
|---- | -----|
| QMAP | &quot;QMAP&quot; |
| GMAP | &quot;GMAP&quot; |
| INVAL | &quot;INVAL&quot; |



