

# UpdateCaseRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**ActionEnum**](#ActionEnum) | Action to be performed on case.   CONDITIONAL: ESCALATE is applicable on pre compliance and pre arbitration cases.   Length: 5-8   Valid Values/Format: ACCEPT, REJECT, REBUT, ESCALATE, WITHDRAW, DOC_RETRY. |  |
|**fileAttachment** | [**DocumentStructure**](DocumentStructure.md) |  |  [optional] |
|**memo** | **String** | Memo pertaining to the case.   CONDITIONAL:  This field is mandatory and applicable if the action code is ACCEPT, REJECT, REBUT or DOC_RETRY.   Length: 0-100   Valid Values/Format: Alphanumeric |  [optional] |
|**rebuttedAs** | [**RebuttedAsEnum**](#RebuttedAsEnum) | Rebutted as Sender or Receiver.   CONDITIONAL: This field is mandatory and applicable if the action code is REBUT.   Length: 3   Valid Values/Format: SND,REC |  [optional] |
|**docRetryAs** | [**DocRetryAsEnum**](#DocRetryAsEnum) | Uploading document as Sender or Receiver.   CONDITIONAL: This field is mandatory and applicable, if the action code is DOC_RETRY and not applicable for any Actions.   Length: 3   Valid Values/Format: SND,REC |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| ACCEPT | &quot;ACCEPT&quot; |
| REJECT | &quot;REJECT&quot; |
| REBUT | &quot;REBUT&quot; |
| ESCALATE | &quot;ESCALATE&quot; |
| WITHDRAW | &quot;WITHDRAW&quot; |
| DOC_RETRY | &quot;DOC_RETRY&quot; |



## Enum: RebuttedAsEnum

| Name | Value |
|---- | -----|
| SND | &quot;SND&quot; |
| REC | &quot;REC&quot; |



## Enum: DocRetryAsEnum

| Name | Value |
|---- | -----|
| SND | &quot;SND&quot; |
| REC | &quot;REC&quot; |



