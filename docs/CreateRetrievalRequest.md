

# CreateRetrievalRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**retrievalRequestReason** | [**RetrievalRequestReasonEnum**](#RetrievalRequestReasonEnum) | Retrieval Request Reason Codes.   NOTE: Below retrievalRequestReason code will be accepted for creation of retrieval request starting on October 24th, 2021.&lt;br&gt;  6343 - IIAS Audit (for healthcare transactions only)   Length: 1-4   Valid Values/Format: 6343 - IIAS Audit (for healthcare transactions only) |  |
|**docNeeded** | [**DocNeededEnum**](#DocNeededEnum) | Documentation Needed Indicator.   Length: 1   Valid Values/Format: 2 - Copy or image (photocopy, microfilm, fax) of original document, 4 - Substitute draft |  |
|**instructionsForHealthcare** | **String** | Instructions for Healthcare.   CONDITIONAL: Required when retrievalRequestReason &#x3D; 6343.   Length: 16-200   Valid Values/Format: Alphanumeric, Special Char (~!@#$%^&amp;*()_+{}|:\&quot;&lt;&gt;?,./;&#39;[]-&#x3D;) |  [optional] |



## Enum: RetrievalRequestReasonEnum

| Name | Value |
|---- | -----|
| _6343 | &quot;6343&quot; |



## Enum: DocNeededEnum

| Name | Value |
|---- | -----|
| _2 | &quot;2&quot; |
| _4 | &quot;4&quot; |



