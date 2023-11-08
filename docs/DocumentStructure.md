

# DocumentStructure

CONDITIONAL: Unless specified as REQUIRED, fileAttachment object is OPTIONAL. When fileAttachment is provided, then fileName and file parameters are required. The base64 encoded string must represent a ZIP, JPG, TIFF, or PDF file. Please note: ZIP files may contain JPG, TIFF or PDF files.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**filename** | **String** | File name of image.   Length: 1-16   Valid Values/Format: Alphanumeric |  [optional] |
|**_file** | **String** | File converted to a base64 encoded string.   Length: 1-22000000   Valid Values/Format: Alphanumeric |  [optional] |



