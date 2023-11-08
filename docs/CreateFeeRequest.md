

# CreateFeeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cardAcceptorIdCode** | **String** | Merchant Id associated with this fee collection..if any.   Length: 1-15   Valid Values/Format: Alphanumeric |  [optional] |
|**cardNumber** | **String** | Card number when required by the reason code.   Length: 1-19   Valid Values/Format: Numeric |  [optional] |
|**countryCode** | **String** | Code identifying the country.   Length: 3   Valid Values/Format: A-Z (Uppercase alphabetic letters) |  [optional] |
|**currency** | **String** | Currency of the fee.   Length: 3   Valid Values/Format: A-Z (Uppercase alphabetic letters) |  |
|**feeDate** | **String** | Date the fee was attached to the claim.   Length: 10   Valid Values/Format: Date (yyyy-MM-dd) |  |
|**destinationMember** | **String** | Destination member for the fee collection.   Length: 1-6   Valid Values/Format: Numeric |  |
|**feeAmount** | **String** | Amount of the fee.   Length: 4-9   Valid Values/Format: Numeric |  |
|**creditSender** | **Boolean** | Credit the Sender   Length: 4-5   Valid Values/Format: true / false |  |
|**creditReceiver** | **Boolean** | Credit the Receiver.   Length: 4-5   Valid Values/Format: true / false |  |
|**mastercomControlNumber** | **String** | Used in routing chargeback and retrieval documentation. It contain either a MasterCom endpoint suffix, in case of 2 characters, or a full MasterCom endpoint in case of 7 characters. When mastercomControlNumber is present, it cannot be all spaces or all zeros.   Length: 1-7   Valid Values/Format: Numeric |  [optional] |
|**message** | **String** | Message regarding fee..   Length: 1-100   Valid Values/Format: Alphanumeric, Special Char (~!@#$%^&amp;*()_+{}|:\&quot;&lt;&gt;?,./;&#39;[]-&#x3D;) |  [optional] |
|**reason** | **String** | Collection Reason Code.   Length: 1-4   Valid Values/Format: Numeric |  |
|**settlementDate** | **String** | CONDITIONAL: settlementDate is a conditional field and is required for Argentina and Uruguay&#39;s Settlement Service participation ID codes (LA00003201, LA00003202, LA00085801, LA00085802, LA00084011, LA00084012). The date may not be prior to the current date or beyond 90 days from the current date.   Length: 10   Valid Values/Format: Date (yyyy-MM-dd) |  [optional] |
|**replyFeeId** | **String** | Fee identifier to be sent to reply to created Fee.   CONDITIONAL: This field is only applicable, if feeType is REPLY to an existing created feeId.   Length: 1-19   Valid Values/Format: Numeric |  [optional] |
|**feeType** | **String** | The fee type.   The default value is CREATE   Valid Values/Format: CREATE, REPLY. |  [optional] |



