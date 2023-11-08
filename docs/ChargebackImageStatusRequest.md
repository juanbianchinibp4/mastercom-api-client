

# ChargebackImageStatusRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | Status of chargeback image to query.   Length: 6-18   Valid Values/Format: COMPLETED, FAILED, PENDING, UNAVAILABLE AND DOC_NOT_APPLICABLE.   COMPLETED: Image was processed and no further action required.   FAILED: Some failure happened during image process flow, i.e,The image could not be converted, The image is not imported, Image extension not supported etc.   PENDING: The image is pending to be processed.   DOC_NOT_APPLICABLE: The dispute does not require a document.   UNAVAILABLE: The image is unavailable because it is not picked up by mastercom internal processes yet. |  |
|**startDate** | **String** | Start Date.   CONDITIONAL: If startDate is provided then endDate is required.   Length: 10   Valid Values/Format: Date (yyyy-MM-dd) |  |
|**endDate** | **String** | End Date.   CONDITIONAL: If endDate is provided then startDate is required.   Length: 10   Valid Values/Format: Date (yyyy-MM-dd) |  |
|**ica** | **String** | The ICA value to return the Image Status |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |
| PENDING | &quot;PENDING&quot; |
| UNAVAILABLE | &quot;UNAVAILABLE&quot; |
| DOC_NOT_APPLICABLE | &quot;DOC_NOT_APPLICABLE&quot; |



