

# ReconReportDataRetrivalResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **String** | Status of polling request. This can be Available, Unavailable or Failed. Failed status occurs if the data processing underwent some kind of error leading to unavailability of the report. |  [optional] |
|**data** | **String** | Base64 encoded String containing binary data for the CSV document. Decode the field to get a byte array that can be converted into a CSV file or String/Stream |  [optional] |



