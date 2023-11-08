

# CreateFraudMasterCardRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acctStatus** | [**AcctStatusEnum**](#AcctStatusEnum) | Account status.   Length: 12-20   Valid Values/Format: ACCT_IS_OPEN, ACCT_HAS_BEEN_CLOSED |  [optional] |
|**chgbkIndicator** | [**ChgbkIndicatorEnum**](#ChgbkIndicatorEnum) | Chargeback Indicator.   Length:    Valid Values/Format: (VALUES)/(Numeric, Alphanumeric, Special Char) |  |
|**cvcInvalidIndicator** | [**CvcInvalidIndicatorEnum**](#CvcInvalidIndicatorEnum) | CVC Invalid Indicator.   Length: 1   Valid Values/Format: Y, *, M, N, P, U, ?, E |  |
|**deviceType** | [**DeviceTypeEnum**](#DeviceTypeEnum) | Account Device Type.   Length: 1   Valid Values/Format: 1, 2, 3, 4, A, B, C, D, E, F, G, H, I, J |  [optional] |
|**fraudType** | [**FraudTypeEnum**](#FraudTypeEnum) | Fraud Type.   Length: 2   Valid Values/Format: 00, 01, 02, 03 ,04 ,05, 06, 07, 51 |  |
|**reportDate** | **String** | Fraud Report Date.   Length: 10   Valid Values/Format: Date (yyyy-MM-dd) |  |
|**subType** | [**SubTypeEnum**](#SubTypeEnum) | Fraud Sub Type.   Length: 1   Valid Values/Format: K, N, P, U |  |



## Enum: AcctStatusEnum

| Name | Value |
|---- | -----|
| IS_OPEN | &quot;ACCT_IS_OPEN&quot; |
| HAS_BEEN_CLOSED | &quot;ACCT_HAS_BEEN_CLOSED&quot; |



## Enum: ChgbkIndicatorEnum

| Name | Value |
|---- | -----|
| _0 | &quot;0&quot; |
| _1 | &quot;1&quot; |



## Enum: CvcInvalidIndicatorEnum

| Name | Value |
|---- | -----|
| Y | &quot;Y&quot; |
| STAR | &quot;*&quot; |
| M | &quot;M&quot; |
| N | &quot;N&quot; |
| P | &quot;P&quot; |
| U | &quot;U&quot; |
| QUESTION_MARK | &quot;?&quot; |
| E | &quot;E&quot; |



## Enum: DeviceTypeEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _2 | &quot;2&quot; |
| _3 | &quot;3&quot; |
| _4 | &quot;4&quot; |
| A | &quot;A&quot; |
| B | &quot;B&quot; |
| C | &quot;C&quot; |
| D | &quot;D&quot; |
| E | &quot;E&quot; |
| F | &quot;F&quot; |
| G | &quot;G&quot; |
| H | &quot;H&quot; |
| I | &quot;I&quot; |
| J | &quot;J&quot; |



## Enum: FraudTypeEnum

| Name | Value |
|---- | -----|
| _00 | &quot;00&quot; |
| _01 | &quot;01&quot; |
| _02 | &quot;02&quot; |
| _03 | &quot;03&quot; |
| _04 | &quot;04&quot; |
| _05 | &quot;05&quot; |
| _06 | &quot;06&quot; |
| _07 | &quot;07&quot; |
| _51 | &quot;51&quot; |



## Enum: SubTypeEnum

| Name | Value |
|---- | -----|
| K | &quot;K&quot; |
| N | &quot;N&quot; |
| P | &quot;P&quot; |
| U | &quot;U&quot; |



