

# IssuerFulfillmentRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**memo** | **String** | This is a test memo.   Length: 1-100   Valid Values/Format: Alphanumeric, Special Char (~!@#$%^&amp;*()_+{}|:\&quot;&lt;&gt;?,./;&#39;[]-&#x3D;) |  [optional] |
|**issuerResponseCd** | [**IssuerResponseCdEnum**](#IssuerResponseCdEnum) | Issuer Response Code.   Length: 7-36   Valid Values/Format: APPROVE, REJECT_DOCUMENTATION_NOT_AS_REQUIRED, REJECT_ILLEGIBLE_OR_MISSING |  |
|**rejectReasonCd** | [**RejectReasonCdEnum**](#RejectReasonCdEnum) | Reject Reason Code.   Length: 1   Valid Values/Format: A - TRANSACTION AMOUNT MISSING/ILLEGIBLE, M - MERCHANT NAME MISSING/ILLEGIBLE, P - PRIMARY ACCOUNT NUMBER MISSING/ILLEGIBLE, D - TRANSACTION DATE MISSING/ILLEGIBLE, O - OTHER (it can also be used for NOT A SUBSTITUTE DRAFT |  [optional] |



## Enum: IssuerResponseCdEnum

| Name | Value |
|---- | -----|
| APPROVE | &quot;APPROVE&quot; |
| REJECT_DOCUMENTATION_NOT_AS_REQUIRED | &quot;REJECT_DOCUMENTATION_NOT_AS_REQUIRED&quot; |
| REJECT_ILLEGIBLE_OR_MISSING | &quot;REJECT_ILLEGIBLE_OR_MISSING&quot; |



## Enum: RejectReasonCdEnum

| Name | Value |
|---- | -----|
| A | &quot;A&quot; |
| M | &quot;M&quot; |
| P | &quot;P&quot; |
| D | &quot;D&quot; |
| O | &quot;O&quot; |



