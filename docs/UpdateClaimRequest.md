

# UpdateClaimRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**openClaimDueDate** | **String** | The due date for opening the claim.   Length: 10   Valid Values/Format: Date (yyyy-MM-dd) |  [optional] |
|**action** | [**ActionEnum**](#ActionEnum) | Action to perform on claim.   Length: 5-6   Valid Values/Format: REOPEN, CLOSE |  |
|**closeClaimReasonCode** | [**CloseClaimReasonCodeEnum**](#CloseClaimReasonCodeEnum) | Reason code for closing the claim.   Length: 2   Valid Values/Format: 10, 20, 30, 40 |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| REOPEN | &quot;REOPEN&quot; |
| CLOSE | &quot;CLOSE&quot; |



## Enum: CloseClaimReasonCodeEnum

| Name | Value |
|---- | -----|
| _10 | &quot;10&quot; |
| _20 | &quot;20&quot; |
| _30 | &quot;30&quot; |
| _40 | &quot;40&quot; |



