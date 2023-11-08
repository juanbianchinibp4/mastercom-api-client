

# CreateCaseRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**caseType** | [**CaseTypeEnum**](#CaseTypeEnum) | Type of Case Filing.   Length: 1   Valid Values/Format: 1-Pre-arbitration, 2-Arbitration, 3-Pre-compliance, 4-Compliance |  |
|**chargebackRefNum** | **List&lt;String&gt;** | A list of Chargeback Reference numbers.   CONDITIONAL: This field is mandatory and applicable if the case type is pre-arbitration or arbitration or if the primary account number field is not populated.   Pre-Arbitration and Arbitration case will have one chargeback to one case filing. Pre-Compliance and Compliance case can have many chargeback to one case filing.   Length: 0-10   Valid Values/Format: Numeric |  [optional] |
|**customerFilingNumber** | **String** | Customer filing number which is the filing party&#39;s internal number.   Length: 0-15   Valid Values/Format: Numeric |  [optional] |
|**disputeAmount** | **String** | Dispute amount. The currency will be determined by the ICA region entered in the Filed ICA and Filed Against ICA.   Length: 1-10 (Integer Part). 2 (Decimal Part)   Valid Values/Format: Decimal |  |
|**currencyCode** | **String** | The case currency. Value should be standard alpha currency code.   For domestic transactions: domestic currency or USD   For cross-border transactions: USD or EUR, per Global Clearing Management System rules   Length: 3   Valid values/format: USD, EUR, GBP, MXN etc and A-Z (uppercase alphabetic letter)   |  |
|**dueDate** | **String** | Due date when the response is required.   Length: 10   Valid Values/Format: Date (yyyy-MM-dd) |  [optional] |
|**fileAttachment** | [**DocumentStructure**](DocumentStructure.md) |  |  [optional] |
|**filedAgainstIca** | **String** | Filed Against ICA.   Length: 1-11   Valid Values/Format: Numeric |  |
|**filingAs** | [**FilingAsEnum**](#FilingAsEnum) | Filing case as Issuer or Acquirer.   Length: 1   Valid Values/Format: I, A |  |
|**filingIca** | **String** | Filing ICA.   Length: 1-11   Valid Values/Format: Numeric |  |
|**memo** | **String** | Enter a Memo pertaining to the case.   Length: 1-13000   Valid Values/Format: Alphanumeric and Special Characters (~!@#$%^&amp;*()_+{}|:\&quot;&lt;&gt;?,./;&#39;[]-&#x3D;) |  |
|**messageText** | **String** | Enter a MessageText pertaining to the case.   CONDITIONAL: Applicable only for filing pre-arbitration and arbitration case for sender while creating the case.   Length: 1-100   Valid Values/Format: Alphanumeric and Special Characters (~!@#$%^&amp;*()_+{}|:\&quot;&lt;&gt;?,./;&#39;[]-&#x3D;) |  [optional] |
|**changeReasonCodeFlag** | **String** | Change reason code Flag.   CONDITIONAL: Applicable only for filing pre-arbitration and arbitration case for sender while creating the case.   Length: 1   Valid Values/Format: Y,N |  [optional] |
|**updatedChargebackReasonCode** | [**UpdatedChargebackReasonCodeEnum**](#UpdatedChargebackReasonCodeEnum) | Updated Chargeback Reason Code.   CONDITIONAL: Required and applicable for filing pre-arbitration and arbitration case for sender while creating the case and if changeReasonCodeFlag is Y.   Length: 2-4   Valid Values/Format: 4863,4899,2001,2002,2003,2004,2005,2008,2011,2700,2701,2702,2703,2704,2705,2706,2707,2708,2709,2710,2711,2712,2713,4801,4802,4807,4808,4809,4812,4831,4834,4835,4837,4840,4841,4842,4846,4847,4849,4850,4853,4854,4855,4856,4857,4859,4860,4862,4900,4901,4902,4903,4905,4908,2000,4870,4871,03,06,17,30,69,70,71,73,74,75,79,80,82,85,95,96,97,98,13,10,20,24,25,26,27,28,29 |  [optional] |
|**changeReasonCodeReason** | **String** | Change reason Code reason.   CONDITIONAL: Required and applicable for filing pre-arbitration and arbitration case for sender while creating the case and if changeReasonCodeFlag is Y.   Length: 1-1000   Valid Values/Format: Alphanumeric and Special Characters (~!@#$%^&amp;*()_+{}|:\&quot;&lt;&gt;?,./;&#39;[]-&#x3D;) |  [optional] |
|**primaryAccountNum** | **String** | The primary account number.   CONDITIONAL: This field is mandatory and applicable if the chargeback ref number field is not populated.   Length: 1-19   Valid Values/Format: Numeric |  [optional] |
|**acquirerRefNum** | **String** | The acquirer reference number.   CONDITIONAL: This field is mandatory and applicable if case is created using primary account number.   Length: 1-23   Valid Values/Format: Numeric |  [optional] |
|**chargebackReasonCode** | [**ChargebackReasonCodeEnum**](#ChargebackReasonCodeEnum) | Chargeback Reason Code.   CONDITIONAL: Required and applicable for filing pre-arbitration and arbitration case.   Length: 2-4   Valid Values/Format: 4863,4899,2001,2002,2003,2004,2005,2008,2011,2700,2701,2702,2703,2704,2705,2706,2707,2708,2709,2710,2711,2712,2713,4801,4802,4807,4808,4809,4812,4831,4834,4835,4837,4840,4841,4842,4846,4847,4849,4850,4853,4854,4855,4856,4857,4859,4860,4862,4900,4901,4902,4903,4905,4908,2000,4870,4871,03,06,17,30,69,70,71,73,74,75,79,80,82,85,95,96,97,98,13,10,20,24,25,26,27,28,29 |  [optional] |
|**merchantName** | **String** | Merchant name.   CONDITIONAL: This is required and applicable for filing pre-arbitration and arbitration case.   Length: 0-100   Valid Values/Format: Alphanumeric and Special Characters (~!@#$%^&amp;*()_+{}|:\&quot;&lt;&gt;?,./;&#39;[]-&#x3D;) |  [optional] |
|**violationCode** | **String** | Violation code.   CONDITIONAL: This is only applicable and mandatory in case of pre-compliance and compliance types of cases   Length: 1-20   Valid Values/Format: Alphanumeric and Special Character (.) |  [optional] |
|**violationDate** | **String** | Violation Date.   CONDITIONAL: This is only applicable and mandatory in case of pre-compliance and compliance types of cases.   Length: 10   Valid Values/Format: Date (yyyy-MM-dd) |  [optional] |
|**chargebackDate** | **String** | Chargeback Date.   CONDITIONAL:  This is only applicable and mandatory in case of pre-compliance and compliance types of cases with a violation code of 1.4.   Length: 10   Valid Values/Format: Date (yyyy-MM-dd) |  [optional] |
|**creditDate** | **String** | Credit Date.   CONDITIONAL:  This is only applicable and mandatory in case of pre-compliance and compliance types of cases with a violation code of 1.4.   Length: 10   Valid Values/Format: Date (yyyy-MM-dd) |  [optional] |
|**caseFilingEbdfDocuments** | [**CaseFilingEbdfStructure**](CaseFilingEbdfStructure.md) |  |  [optional] |



## Enum: CaseTypeEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _2 | &quot;2&quot; |
| _3 | &quot;3&quot; |
| _4 | &quot;4&quot; |



## Enum: FilingAsEnum

| Name | Value |
|---- | -----|
| I | &quot;I&quot; |
| A | &quot;A&quot; |



## Enum: UpdatedChargebackReasonCodeEnum

| Name | Value |
|---- | -----|
| _4863 | &quot;4863&quot; |
| _4899 | &quot;4899&quot; |
| _2001 | &quot;2001&quot; |
| _2002 | &quot;2002&quot; |
| _2003 | &quot;2003&quot; |
| _2004 | &quot;2004&quot; |
| _2005 | &quot;2005&quot; |
| _2008 | &quot;2008&quot; |
| _2011 | &quot;2011&quot; |
| _2700 | &quot;2700&quot; |
| _2701 | &quot;2701&quot; |
| _2702 | &quot;2702&quot; |
| _2703 | &quot;2703&quot; |
| _2704 | &quot;2704&quot; |
| _2705 | &quot;2705&quot; |
| _2706 | &quot;2706&quot; |
| _2707 | &quot;2707&quot; |
| _2708 | &quot;2708&quot; |
| _2709 | &quot;2709&quot; |
| _2710 | &quot;2710&quot; |
| _2711 | &quot;2711&quot; |
| _2712 | &quot;2712&quot; |
| _2713 | &quot;2713&quot; |
| _4801 | &quot;4801&quot; |
| _4802 | &quot;4802&quot; |
| _4807 | &quot;4807&quot; |
| _4808 | &quot;4808&quot; |
| _4809 | &quot;4809&quot; |
| _4812 | &quot;4812&quot; |
| _4831 | &quot;4831&quot; |
| _4834 | &quot;4834&quot; |
| _4835 | &quot;4835&quot; |
| _4837 | &quot;4837&quot; |
| _4840 | &quot;4840&quot; |
| _4841 | &quot;4841&quot; |
| _4842 | &quot;4842&quot; |
| _4846 | &quot;4846&quot; |
| _4847 | &quot;4847&quot; |
| _4849 | &quot;4849&quot; |
| _4850 | &quot;4850&quot; |
| _4853 | &quot;4853&quot; |
| _4854 | &quot;4854&quot; |
| _4855 | &quot;4855&quot; |
| _4856 | &quot;4856&quot; |
| _4857 | &quot;4857&quot; |
| _4859 | &quot;4859&quot; |
| _4860 | &quot;4860&quot; |
| _4862 | &quot;4862&quot; |
| _4900 | &quot;4900&quot; |
| _4901 | &quot;4901&quot; |
| _4902 | &quot;4902&quot; |
| _4903 | &quot;4903&quot; |
| _4905 | &quot;4905&quot; |
| _4908 | &quot;4908&quot; |
| _2000 | &quot;2000&quot; |
| _4870 | &quot;4870&quot; |
| _4871 | &quot;4871&quot; |
| _03 | &quot;03&quot; |
| _06 | &quot;06&quot; |
| _17 | &quot;17&quot; |
| _30 | &quot;30&quot; |
| _69 | &quot;69&quot; |
| _70 | &quot;70&quot; |
| _71 | &quot;71&quot; |
| _73 | &quot;73&quot; |
| _74 | &quot;74&quot; |
| _75 | &quot;75&quot; |
| _79 | &quot;79&quot; |
| _80 | &quot;80&quot; |
| _82 | &quot;82&quot; |
| _85 | &quot;85&quot; |
| _95 | &quot;95&quot; |
| _96 | &quot;96&quot; |
| _97 | &quot;97&quot; |
| _98 | &quot;98&quot; |
| _13 | &quot;13&quot; |
| _10 | &quot;10&quot; |
| _20 | &quot;20&quot; |
| _24 | &quot;24&quot; |
| _25 | &quot;25&quot; |
| _26 | &quot;26&quot; |
| _27 | &quot;27&quot; |
| _28 | &quot;28&quot; |
| _29 | &quot;29&quot; |



## Enum: ChargebackReasonCodeEnum

| Name | Value |
|---- | -----|
| _4863 | &quot;4863&quot; |
| _4899 | &quot;4899&quot; |
| _2001 | &quot;2001&quot; |
| _2002 | &quot;2002&quot; |
| _2003 | &quot;2003&quot; |
| _2004 | &quot;2004&quot; |
| _2005 | &quot;2005&quot; |
| _2008 | &quot;2008&quot; |
| _2011 | &quot;2011&quot; |
| _2700 | &quot;2700&quot; |
| _2701 | &quot;2701&quot; |
| _2702 | &quot;2702&quot; |
| _2703 | &quot;2703&quot; |
| _2704 | &quot;2704&quot; |
| _2705 | &quot;2705&quot; |
| _2706 | &quot;2706&quot; |
| _2707 | &quot;2707&quot; |
| _2708 | &quot;2708&quot; |
| _2709 | &quot;2709&quot; |
| _2710 | &quot;2710&quot; |
| _2711 | &quot;2711&quot; |
| _2712 | &quot;2712&quot; |
| _2713 | &quot;2713&quot; |
| _4801 | &quot;4801&quot; |
| _4802 | &quot;4802&quot; |
| _4807 | &quot;4807&quot; |
| _4808 | &quot;4808&quot; |
| _4809 | &quot;4809&quot; |
| _4812 | &quot;4812&quot; |
| _4831 | &quot;4831&quot; |
| _4834 | &quot;4834&quot; |
| _4835 | &quot;4835&quot; |
| _4837 | &quot;4837&quot; |
| _4840 | &quot;4840&quot; |
| _4841 | &quot;4841&quot; |
| _4842 | &quot;4842&quot; |
| _4846 | &quot;4846&quot; |
| _4847 | &quot;4847&quot; |
| _4849 | &quot;4849&quot; |
| _4850 | &quot;4850&quot; |
| _4853 | &quot;4853&quot; |
| _4854 | &quot;4854&quot; |
| _4855 | &quot;4855&quot; |
| _4856 | &quot;4856&quot; |
| _4857 | &quot;4857&quot; |
| _4859 | &quot;4859&quot; |
| _4860 | &quot;4860&quot; |
| _4862 | &quot;4862&quot; |
| _4900 | &quot;4900&quot; |
| _4901 | &quot;4901&quot; |
| _4902 | &quot;4902&quot; |
| _4903 | &quot;4903&quot; |
| _4905 | &quot;4905&quot; |
| _4908 | &quot;4908&quot; |
| _2000 | &quot;2000&quot; |
| _4870 | &quot;4870&quot; |
| _4871 | &quot;4871&quot; |
| _03 | &quot;03&quot; |
| _06 | &quot;06&quot; |
| _17 | &quot;17&quot; |
| _30 | &quot;30&quot; |
| _69 | &quot;69&quot; |
| _70 | &quot;70&quot; |
| _71 | &quot;71&quot; |
| _73 | &quot;73&quot; |
| _74 | &quot;74&quot; |
| _75 | &quot;75&quot; |
| _79 | &quot;79&quot; |
| _80 | &quot;80&quot; |
| _82 | &quot;82&quot; |
| _85 | &quot;85&quot; |
| _95 | &quot;95&quot; |
| _96 | &quot;96&quot; |
| _97 | &quot;97&quot; |
| _98 | &quot;98&quot; |
| _13 | &quot;13&quot; |
| _10 | &quot;10&quot; |
| _20 | &quot;20&quot; |
| _24 | &quot;24&quot; |
| _25 | &quot;25&quot; |
| _26 | &quot;26&quot; |
| _27 | &quot;27&quot; |
| _28 | &quot;28&quot; |
| _29 | &quot;29&quot; |



