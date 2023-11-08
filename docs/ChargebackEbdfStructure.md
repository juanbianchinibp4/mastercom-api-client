

# ChargebackEbdfStructure

NOTE: When chargebackEbdfDocuments is used for automatic EBDF document generation for transactionInformation (or) fraudDrfDocument (or) cardholderDisputeChargebackDrfDocument (or) pointOfInteractionErrorsDrfDocument, no other documents should be attached on the call and documentIndicator must be set to true. Attaching documents or setting documentIndicator to false will lead to call failure.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionInformation** | [**TransactionInformationEbdfStructure**](TransactionInformationEbdfStructure.md) |  |  [optional] |
|**fraudDrfDocument** | [**FraudDrfDocumentStructure**](FraudDrfDocumentStructure.md) |  |  [optional] |
|**cardholderDisputeChargebackDrfDocument** | [**CardholderDisputeChargebackDrfDocumentStructure**](CardholderDisputeChargebackDrfDocumentStructure.md) |  |  [optional] |
|**pointOfInteractionErrorsDrfDocument** | [**PointOfInteractionErrorsDrfDocumentStructure**](PointOfInteractionErrorsDrfDocumentStructure.md) |  |  [optional] |



