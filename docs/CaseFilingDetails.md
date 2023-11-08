

# CaseFilingDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**claimId** | **String** | Claim identifier associated with the standard claimId |  [optional] |
|**claimType** | **String** | Claim Type |  [optional] |
|**caseId** | **String** | Identifier assigned to the case filing |  [optional] |
|**caseType** | **String** | Type of Case Filing. The following number values represent each case type.  1-Pre-arbitration  2-Arbitration  3-Pre-compliance 4-Compliance |  [optional] |
|**chargebackRefNum** | **List&lt;String&gt;** | A list of Chargeback Reference numbers |  [optional] |
|**currencyCode** | **String** | The case currency. Value should be standard alpha currency code.   For domestic transactions: domestic currency or USD   For cross-border transactions: USD or EUR, per Global Clearing Management System rules   Length: 3   Valid values/format: USD, EUR, GBP, MXN etc and A-Z (uppercase alphabetic letter)   |  [optional] |
|**customerFilingNumber** | **String** | Customer filing number which is the filing party&#39;s internal number |  [optional] |
|**creditDate** | **String** | Credit date when the violationCode is 1.4 in the case of pre-compliance or compliance case filing. The format should be yyyy-MM-dd |  [optional] |
|**chargebackDate** | **String** | Chargeback date when the violationCode is 1.4 in the case of pre-compliance or compliance case filing. The format should be yyyy-MM-dd |  [optional] |
|**reasonCode** | **String** | Reason code is returned when the case type is pre-arbitration or arbitration. |  [optional] |
|**disputeAmount** | **String** | Dispute amount.  The currency will be determined by the ICA region entered in the Filed ICA and Filed Against ICA |  [optional] |
|**dueDate** | **String** | Due date when the response is required.  The format should be yyyy-MM-dd |  [optional] |
|**filingAgaintstIca** | **String** | Filed Against ICA |  [optional] |
|**filingAs** | **String** | Filing case as Issuer or Acquirer. Following values represents each type I-ISSUER  A-ACQUIRER |  [optional] |
|**filingIca** | **String** | Filing ICA |  [optional] |
|**merchantName** | **String** | Merchant name for filing pre-arbitration and arbitration case |  [optional] |
|**primaryAccountNum** | **String** | The primary account number |  [optional] |
|**violationCode** | **String** | Violation code |  [optional] |
|**violationDate** | **String** | Violation Date |  [optional] |
|**rulingDate** | **String** | Ruling Date |  [optional] |
|**rulingStatus** | **String** | Ruling Status.  Valid values are Reviewed, Filed In Error, Declined, Expired, Favor Sender, Favor Receiver |  [optional] |
|**virtualAccountNum** | **String** | The virtual account number |  [optional] |



