

# UpdateChargebackRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**memo** | **String** | Memo.   Length: 1-100   Valid Values/Format: Alphanumeric / Special Char (~!@#$%^&amp;*()_+{}|:\&quot;&lt;&gt;?,./;&#39;[]-&#x3D;) |  [optional] |
|**creditVoucherAction** | **String** | Action to be performed on 1st chargeback.   CONDITIONAL: This field is required and only applicable if fileAttachment is not provided. Length: 6-7   Valid Values/Format: ACCEPT, DECLINE |  [optional] |
|**fileAttachment** | [**DocumentStructure**](DocumentStructure.md) |  |  [optional] |



