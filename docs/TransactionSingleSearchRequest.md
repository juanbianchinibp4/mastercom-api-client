

# TransactionSingleSearchRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**primaryAccountNumber** | **String** | Primary Account Number [PAN] is a series of digits used to identify a customer account or relationship.   Length: 12-19   Valid Values/Format: Numeric |  |
|**settlementFromDate** | **String** | From date of Settlement date range to search for a transaction. Mastercard uses Settlement Date to group the transactions for reporting and for subsequent settlement. The search range is a maximum of 30 days, and searches can be completed for up to 180 days of history.   Length: 10   Valid Values/Format: Date (yyyy-MM-dd) |  |
|**settlementToDate** | **String** | To date of Settlement date range to search for a transaction. Mastercard uses Settlement Date to group the transactions for reporting and for subsequent settlement. The search range is a maximum of 30 days, and searches can be completed for up to 180 days of history.   Length: 10   Valid Values/Format: Date (yyyy-MM-dd) |  |
|**acquirerRefNumber** | **String** | Acquirer Reference Data is data an acquirer supplies in an acquirer-originated message that may be required for an issuer to return to the acquirer in a subsequent message |  [optional] |
|**switchSerialNumber** | **String** | The Switch Serial Number is a unique transaction identification number generated (or assigned) by the Single Message.   Length: 9   Valid Values/Format: Numeric |  [optional] |



