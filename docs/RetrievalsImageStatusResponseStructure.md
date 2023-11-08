

# RetrievalsImageStatusResponseStructure


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**claimId** | **String** | Claim Id |  [optional] |
|**requestId** | **String** | Request Id |  [optional] |
|**status** | **String** | When retrieving status of an image, the valid values are: COMPLETED, FAILED, PENDING, UNAVAILABLE AND DOC_NOT_APPLICABLE. COMPLETED: Image was processed and no further action required. FAILED: Some failure happened during image process flow, i.e,The image could not be converted, The image is not imported, Image extension not supported etc. PENDING: The image is pending to be processed. DOC_NOT_APPLICABLE: The dispute does not require a document. UNAVAILABLE: The image is unavailable because it is not picked up by mastercom internal processes yet. |  [optional] |



