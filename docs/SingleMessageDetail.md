

# SingleMessageDetail


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acqLocCntry** | **String** | Acquirer Country |  [optional] |
|**acquirerAddress** | **String** | Acquirer Address City |  [optional] |
|**acquirerAdjustmentSettlementAmount** | **String** | Acquirer Adjustment Settlement Amount |  [optional] |
|**acquirerAdjustmentSettlementAmountIndicator** | **String** | Acquirer Adjustment Settlement Amount Indicator |  [optional] |
|**acquirerAdjustmentSettlementCompletionAmount** | **String** | Acquirer Adjustment Settlement Completion Amount |  [optional] |
|**acquirerAdjustmentSettlementCurrency** | **String** | Acquirer Adjustment Settlement Currency |  [optional] |
|**acquirerAdviceReason** | **String** | Acquirer Advice Reason Code |  [optional] |
|**acquirerBridgedICA** | **String** | Acquirer Bridged ICA  |  [optional] |
|**acquirerCity** | **String** | Acquirer Address City |  [optional] |
|**acquirerCurrencyConversionRate** | **String** | Acquirer Currency Conversion Rate |  [optional] |
|**acquirerInstitutionNumber** | **String** | Displays the routing and transit number of the customer |  [optional] |
|**acquirerInterchangeAmount** | **String** | Acquirer Interchange Amount |  [optional] |
|**acquirerInterchangeCurrency** | **String** | Acquirer Interchange Currency |  [optional] |
|**acquirerName** | **String** | Debit Mastercard field only. Acquirer Name is a card acceptor identification code assigned by the merchant. |  [optional] |
|**acquirerProcessorID** | **String** | Acquirer processor number |  [optional] |
|**acquirerReferenceNumber** | **String** | Contains the acquirers reference number. |  [optional] |
|**acquirerSettlementCompletionAmount** | **String** | Acquirer Settlement Completion Amount |  [optional] |
|**acquirerSettlementCompletionCurrency** | **String** | Acquirer Settlement Completion Currency |  [optional] |
|**acquirerSettlementConversionRate** | **String** | Acquirer Settlement Conversion Rate |  [optional] |
|**additionalAdvice** | **String** | Additional Advice |  [optional] |
|**additionalPOSData** | **String** | Additional POS Data |  [optional] |
|**additionalResponse** | **String** | A code that provides additional supporting data pertaining to the response code associated with the transaction |  [optional] |
|**adjustmentAdviceReason** | **String** | Adjustment Advice Reason |  [optional] |
|**adjustmentCashbackAmount** | **String** | Adjustment Cashback Amount |  [optional] |
|**adjustmentDate** | **String** | Date the adjustment is performed. YYMMDD |  [optional] |
|**adjustmentPurchaseAmount** | **String** | Adjustment Purchase Amount |  [optional] |
|**afaMember** | **String** | AFA Member |  [optional] |
|**alternatePrimaryAccountNumber** | **String** | Alternate Primary Account Number |  [optional] |
|**amountICCR** | **String** | Amount ICCR |  [optional] |
|**atmPosFlag** | **String** | ATM Pos Flag |  [optional] |
|**banknetReferenceNumber** | **String** | Banknet Reference Number |  [optional] |
|**bridgingICA** | **String** | Bridging ICA |  [optional] |
|**businessActivity** | **String** | Business Activity |  [optional] |
|**cashBackAmount** | **String** | Cash Back Amount |  [optional] |
|**cashBackCurrency** | **String** | Cash Back Currency |  [optional] |
|**catLevel** | **String** | This field indicates the specific conditions present at the point of service (POS) at the time that a transaction takes place. |  [optional] |
|**cccaIssuerBankName** | **String** | For Mexico domestic credit card cash advance ATM transactions |  [optional] |
|**chipFlag** | **String** | Indicates if chip was present or not. |  [optional] |
|**conditionCode** | **String** | Code that describes the PAN entry, PIN entry, and authorization mode of a transaction. |  [optional] |
|**corporateCardIndicator** | **String** | Corporate Card Indicator |  [optional] |
|**creditLineUsageFee** | **String** | For Mexico domestic credit card cash advance ATM transactions. |  [optional] |
|**crossBorderIndicator** | **String** | Any transaction on a credit or debit card branded by Mastercard processed through the Single Message System in which the cardholder country code differs from the merchant country code |  [optional] |
|**currencyConversionAssesementAmount** | **String** | Currency Conversion Assessment amount |  [optional] |
|**currencyConversionAssesementCurrency** | **String** | Currency Conversion Assesement Currency |  [optional] |
|**currencyConversionIndicator** | **String** | Compares the currency of the cardholder with the merchant’s country currency when the cardholder performs a transaction in another country |  [optional] |
|**cvc2ProgramValidationCode** | **String** | Debit Mastercard field only. A value of C indicates that the merchant participates in the Mastercard CVC 2 Validation Program |  [optional] |
|**documentIndicator** | **String** | The document Indicator field indicates whether documentation is sent supporting the chargeback |  [optional] |
|**feesInterChgAcqLoc** | **String** | Fees Inter Chg Acq Loc |  [optional] |
|**financialInstitutionID** | **String** | Financial Institution ID |  [optional] |
|**fraudDate** | **String** | Fraud Date |  [optional] |
|**fraudDeviceType** | **String** | Fraud Device Type |  [optional] |
|**fraudType** | **String** | Fraud Type |  [optional] |
|**gcmsAdviceCode** | **String** | Advice reason code that identifies the Global Clearing Management System (GCMS) message reason code when an exception item is processed |  [optional] |
|**gcmsSettlementDate** | **String** | GCMS Settlement Date |  [optional] |
|**issuerAdjustmentSettlementAmount** | **String** | Issuer Adjustment Settlement Amount |  [optional] |
|**issuerAdjustmentSettlementAmountIndicator** | **String** | Issuer Adjustment Settlement Amount Indicator |  [optional] |
|**issuerAdjustmentSettlementCompletionAmount** | **String** | Issuer Adjustment Settlement Completion Amount |  [optional] |
|**issuerAdjustmentSettlementCurrency** | **String** | Issuer Adjustment Settlement Currency |  [optional] |
|**issuerAdviceReason** | **String** | Issuer Advice Reason Code. |  [optional] |
|**issuerCurrencyConversionRate** | **String** | Conversion rate used to convert amounts from the local transaction currency to the settlement currency. |  [optional] |
|**issuerICA** | **String** | Issuer ICA |  [optional] |
|**issuerInstitutionNumber** | **String** | Issuer institution ID Displays the routing and transit number of the customer. If the customer has no routing and transit number, i.e., the institution is International, then the number displayed is the pseudo number assigned by Mastercard. |  [optional] |
|**issuerInterchangeAmount** | **String** | Issuer Interchange Amount |  [optional] |
|**issuerInterchangeCurrency** | **String** | Issuer Interchange Currency |  [optional] |
|**issuerProcessorID** | **String** | Issuer processor number |  [optional] |
|**issuerSettlementCompletionAmount** | **String** | The settlement amount is displayed in the issuers chosen settlement currency, as processed in the Single Message System |  [optional] |
|**issuerSettlementCompletionCurrency** | **String** | Current issuer settlement currency code. |  [optional] |
|**issuerSettlementConversionRate** | **String** | Issuer Settlement Conversion Rate |  [optional] |
|**localCompletionAmount** | **String** | The monetary value appearing in this field represents the original completed amount of the transaction expressed in local currency. |  [optional] |
|**localCurrencyCode** | **String** | The code defining the currency of the transaction as it was submitted to the Single Message System. The Single Message System uses it to specify the currency used in localRequestedAmount |  [optional] |
|**localRequestedAmount** | **String** | The amount of funds requested by the cardholder in the local currency of the acquirer or source location of the transaction. |  [optional] |
|**mcElectronicIndicator** | **String** | MC Electronic Indicator |  [optional] |
|**mcResponseValue** | **String** | MC Response Value |  [optional] |
|**merchantCategoryCodeInfo** | **String** | Merchant Category Code Info |  [optional] |
|**merchantType** | **String** | Card Acceptor Business Code. Identifies the card acceptor’s primary business. |  [optional] |
|**originalCardHolderBillingAmount** | **String** | Amount the cardholder is billed by the issuing institution. The Cardholder Billing Amount is displayed with the local currency code and the decimal positioning of the local currency code. |  [optional] |
|**originalCardHolderBillingCurrency** | **String** | Original CardHolder Billing Currency |  [optional] |
|**originalCashbackAmount** | **String** | Original Cashback Amount |  [optional] |
|**originalCashbackCurrency** | **String** | Original Cashback Currency |  [optional] |
|**originalPurchaseAmount** | **String** | This field is displayed only for partial approval transactions. The monetary value appearing in this field represents the original transaction amount expressed in local currency. |  [optional] |
|**ownerID** | **String** | Owner ID |  [optional] |
|**pointOfServiceAmount** | **String** | Point Of Service Amount |  [optional] |
|**pointOfServiceCurrency** | **String** | Point Of Service Currency |  [optional] |
|**posData** | **String** | Displays the contents of Point of Service [POS] Data, which contain terminal and other Point of Service information |  [optional] |
|**posEntry** | **String** |  Indicates the method used to enter the PAN into the terminal device and the PIN entry capability of that device. |  [optional] |
|**primaryAccountNumber** | **String** | Series of digits used to identify a customer account or relationship. |  [optional] |
|**primaryAccountNumberSequenceNumber** | **String** | Primary Account Number Sequence Number |  [optional] |
|**processingCode** | **String** | Series of digits used to describe the effect of a transaction on the customer account and the type of accounts affected. |  [optional] |
|**productIdentifierCode** | **String** | Provides issuers additional information about Product ID, also known as product code |  [optional] |
|**programIndicator** | **String** | A special Debit Mastercard promotion program code displayed from GCMS. |  [optional] |
|**qpsPayPassChargebackElgibility** | **String** | Debit Mastercard field only. A value of I indicates that the transaction is not eligible for a chargeback with reason codes 0001, 0002 or 0037 |  [optional] |
|**referenceNumber** | **String** | The retrieval reference number from the original transaction is typically printed on the cardholders transaction receipt. This field is populated by the acquirer. |  [optional] |
|**responseCode** | **String** | This field displays the disposition of a message. |  [optional] |
|**responseSource** | **String** | M &#x3D; The decline was initiated by the member/issuer, S &#x3D; The decline was initiated by the Single Message System. |  [optional] |
|**serviceCode** | **String** | This field displays the extended service code of Track 2 data indicating the transaction acceptance parameters of a magnetic stripe card. When paired with the POS Entry Mode, acquirers will be able to validate whether the issuer is properly utilizing the Chip Liability Shift chargeback |  [optional] |
|**serviceLevelIndicator** | **String** | Service Level Indicator |  [optional] |
|**settlementDate** | **String** | Date (month and day) that Mastercard uses to group the transactions for reporting and for subsequent settlement: Format: MMDDYY |  [optional] |
|**settlementDatePosition** | **String** | Settlement Date Position |  [optional] |
|**settlementServiceConfiguration** | **String** | Settlement Service Configuration (SSC) records define the business day and time of settlement for a transaction. The Settlement Service Configuration Indicator (SSC ID) describes which Single Message System Settlemetn Service record was used for the transaction.�� The SSC ID is assigned to a transaction based on a combination of the following values: product, interchange type, ISIS agreement, and region. |  [optional] |
|**surchargeFreeIndicator** | **String** | This field will identify an eligible transaction with the a specific identifier of the related program.� Transactions that are not eligible will be identified with value N. |  [optional] |
|**switchDateTime** | **String** | Date and time Mastercard routes the transaction to the issuer  (MMDDHHMMSS) |  [optional] |
|**switchSerialNumber** | **String** | Describes a unique transaction identification number generated (or assigned) by the Single Message System |  [optional] |
|**switchSerialNumberPosition** | **String** | Switch Serial Number Position |  [optional] |
|**switchTime** | **String** | Time that Mastercard routes the transaction to the issuer |  [optional] |
|**terminalID** | **String** | The Terminal ID is the unique identification number assigned by the acquirer to each terminal |  [optional] |
|**trace** | **String** | Unique identifier assigned to each transaction by the originator of the message |  [optional] |
|**transactionCategoryCode** | **String** | Transaction Category Code |  [optional] |
|**transactionClass** | **String** | Displays the Transaction Class. For transactions submitted to the Single Message System, this field consists of the following: the source product type, the entry device, and fee classification |  [optional] |
|**transactionDateTime** | **String** | Date and time a message was transmitted by a processing entity, to be expressed in Coordinated Universal Time (UTC). |  [optional] |
|**transitData** | **String** | Transit Data |  [optional] |
|**tranType** | **String** | Tran Type |  [optional] |
|**universalCardAuthenticationFee** | **String** | Universal Cardholder Authentication Field (UCAF) displays data systems used to communicate authentication information among cardholder, issuer, merchant, and acquirer communities |  [optional] |
|**usageCode** | **String** | Chargeback and retrieval request usage codes. The usage code indicates the type of chargeback record processed. |  [optional] |



