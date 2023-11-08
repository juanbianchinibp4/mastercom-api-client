

# GetQueueContentRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**queueName** | **String** | The queue to be queried for a list of claims.   Length: 1-30   Valid Values/Format: Alpha |  |
|**lastModifiedDateFrom** | **String** | Start of claim’s last modified date range.   CONDITIONAL: If lastModifiedDateFrom is provided then lastModifiedDateTo is required.   Length: 16   Valid Values/Format: Date (yyyy-MM-ddTHH:mm) |  [optional] |
|**lastModifiedDateTo** | **String** | End of claim’s last modified date range.   CONDITIONAL: If lastModifiedDateTo is provided then lastModifiedDateFrom is required.   Length: 16   Valid Values/Format: Date (yyyy-MM-ddTHH:mm) |  [optional] |
|**pageNb** | **String** | The queue data will be retrieved in separate sets.  The pageNb field indicates which page should be returned.  The total page counts available in a date range will be returned in the pageCount field. Possible values are 1,2,3 etc. If page number is not provided, value will default to 1.   Length: 1-3   Valid Values/Format: Numeric |  [optional] |



