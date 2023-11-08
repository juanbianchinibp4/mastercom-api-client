

# ReconReportDataAcknowledgeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ica** | **List&lt;String&gt;** | Interbank Card Association number used to identify the member in transaction.   Length: 1-11   Valid Values/Format: Numeric |  [optional] |
|**startDate** | **String** | Start date for the reconciliation report.   Length: 10   Valid Values/Format: Date (yyyy-MM-dd) |  |
|**endDate** | **String** | End date for the reconciliation report.   Length: 10   Valid Values/Format: Date (yyyy-MM-dd) |  |
|**cycles** | **List&lt;Cycle&gt;** | It represents the cycle(s) where the clearing data was exchanged.   Length: 1   Valid Values/Format: 1, 2, 3, 4, 5, 6, 7 |  [optional] |
|**enhancedReconciliationReportFlag** | **Boolean** | It is set to \&quot;true\&quot; because the enhanced reconciliation report is available.   Length: 4-5   Valid Values/Format: true / false |  [optional] |



