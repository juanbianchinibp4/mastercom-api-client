

# RetrievalSummary


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acquirerRefNum** | **String** | Acquirer Reference Number is a unique number that tags a credit card transaction when it goes from the merchants bank (The Acquiring Bank) through the card scheme to the cardholders bank (The Issuer) |  [optional] |
|**acquirerResponseCd** | **String** | Predetermined response code chosen by the Acquirer |  [optional] |
|**acquirerMemo** | **String** | The memo the acquirer created when fulfilling the retrieval request |  [optional] |
|**acquirerResponseDt** | **String** | Date the acquirer responded to the fulfillment request |  [optional] |
|**amount** | **String** | Amount of the claim |  [optional] |
|**currency** | **String** | The retrieval currency.  The data should be standard currency alpha code |  [optional] |
|**claimId** | **String** | Claim identifier |  [optional] |
|**createDate** | **String** | This is the date of the Retrieval Request creation |  [optional] |
|**cancelDate** | **String** | This is the date of the Retrieval Request cancelation |  [optional] |
|**reverseDate** | **String** | This is the date of the Retrieval Request reversion |  [optional] |
|**rejectDate** | **String** | This is the date of the Retrieval Request rejection by GCMS |  [optional] |
|**docNeeded** | **String** | Documentation Needed Indicator. Possible values are    - NONE: Present when acquirer has not yet responded to a Collaboration request or present for issuers when the acquirer has responded with response code A (funds movement request)    - Refund: Present when acquirer has responded to a Collaboration request with response code B (Refunded) and provided refund details or when acquirer has responded with response code C (Initiating refund)    - Credit Voucher: Present when acquirer has responded to a Collaboration request with response code B (Refunded) and provided a credit voucher    - null: Present when no other values are applicable    **Note:** The following apply only to U.S. healthcare transactions.    - 2 (Copy or image such as a photocopy, microfilm, fax of original document)    - 4 (Substitute draft)    |  [optional] |
|**issuerResponseCd** | **String** | Predetermined response code chosen by the Issuer |  [optional] |
|**issuerRejectRsnCd** | **String** | Predetermined reject reason codes |  [optional] |
|**issuerMemo** | **String** | Memo pertaining to the case |  [optional] |
|**issuerResponseDt** | **String** | Date the issuer responded to the fulfillment |  [optional] |
|**imageReviewDecision** | **String** | The image review decision |  [optional] |
|**imageReviewDt** | **String** | Date the image review decision occurred |  [optional] |
|**primaryAcctNum** | **String** | Primary Account Number |  [optional] |
|**rejectReason** | **String** | Retrieval Request reject reason. |  [optional] |
|**requestId** | **String** | Identifier assigned to the fulfillment |  [optional] |
|**retrievalRequestReason** | **String** | Retrieval Request Reason |  [optional] |
|**chargebackRefNum** | **String** | Contains card issuer reference data for a specific cardholder transaction. This number must be unique within BIN. It is used to track the chargeback throughout its life cycle |  [optional] |
|**acquirerResponseNotificationStatus** | **String** | The field would show Processed or Rejected or Pending or Cancelled status depending on the GCMS processing of the retrieval request. Pending- Item created but NOT yet sent to GCMS Cancelled- Item discarded without being sent to GCMS Processed- Item is being sent for clearing (via ipmClearingOutput batch job) Rejected- If item being rejected from GCMS (No update on Issuer side claim). |  [optional] |
|**instructionsForHealthcare** | **String** | Instructions for healthcare |  [optional] |
|**refundReversalDate** | **String** | Refund/Reversal Date |  [optional] |
|**refundReversalAmount** | **String** | Refund/Reversal Amount |  [optional] |
|**refundReversalCurrency** | **String** | Refund/Reversal Currency |  [optional] |
|**refundReversalType** | **String** | Refund/Reversal Type |  [optional] |
|**refundReversalReferenceId** | **String** | Refund/Reversal reference ID |  [optional] |
|**memo** | **String** | Memo |  [optional] |
|**flexCode** | **String** | Specific to Brazil Flex Card transactions to communicate the product code used for clearing. |  [optional] |
|**collaborationExpirationDateTime** | **String** | Date and time by which the acquirer can respond to a Collaboration request. |  [optional] |



