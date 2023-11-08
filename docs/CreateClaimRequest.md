

# CreateClaimRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**disputedAmount** | **String** | Amount disputed in the claim   Length: 4-12   Valid Values/Format: Numeric |  |
|**disputedCurrency** | **String** | Currency of amount disputed in the claim. disputedCurrency can be provided as standard alpha code or numeric code   Length: 3   Valid Values/Format: A-Z (Uppercase Alphabetic Letter) / Numeric |  |
|**claimType** | [**ClaimTypeEnum**](#ClaimTypeEnum) | Type of claim to be created.   Length: 8   Valid Values/Format: Standard |  |
|**clearingTransactionId** | **String** | The Clearing Transaction Identifier from Clearing Summary Results.   Length: N/A   Valid Values/Format: Alphanumeric, Special Char (~!@#$%^&amp;*()_+{}|:\&quot;&lt;&gt;?,./;&#39;[]-&#x3D;) |  |
|**authTransactionId** | **String** | The Authorization Transaction Identifier from Authorization Summary Results.   Length: N/A   Valid Values/Format: Alphanumeric, Special Char (~!@#$%^&amp;*()_+{}|:\&quot;&lt;&gt;?,./;&#39;[]-&#x3D;) |  [optional] |



## Enum: ClaimTypeEnum

| Name | Value |
|---- | -----|
| STANDARD | &quot;Standard&quot; |



