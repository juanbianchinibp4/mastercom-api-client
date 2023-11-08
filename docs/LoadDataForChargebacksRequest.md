

# LoadDataForChargebacksRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**chargebackType** | [**ChargebackTypeEnum**](#ChargebackTypeEnum) | The type of chargeback.The default value is CHARGEBACK   Length: 10-18   Valid Values/Format: CHARGEBACK, SECOND_PRESENTMENT |  |
|**reasonCode** | **String** | Reason Code    Length: 4   Valid Values/Format: Numeric |  [optional] |
|**currency** | **String** | The currency in with the chargeback will be created.   Length: 3   Valid Values/Format: A-Z (uppercase alphabetic letter) |  [optional] |



## Enum: ChargebackTypeEnum

| Name | Value |
|---- | -----|
| CHARGEBACK | &quot;CHARGEBACK&quot; |
| SECOND_PRESENTMENT | &quot;SECOND_PRESENTMENT&quot; |



