

# ClearingDetail


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountLevelManagementAccountCategoryCode** | **String** | Describes the category code of Account Level Management assigned |  [optional] |
|**acquirerReferenceData** | **String** | Data an acquirer supplies in an acquirer-originated message that may be required for an issuer to return to the acquirer in a subsequent message |  [optional] |
|**acquiringInstitutionIdCode** | **String** | Identifies the acquiring institution (for example, merchant bank) or its agent. |  [optional] |
|**approvalCode** | **String** | A code the authorizing institution assigns indicating approval |  [optional] |
|**businessCycle** | **String** | A two-digit numeric subfield (such as 01, 02, or 03) that identifies a reconciliation period in a Business Date |  [optional] |
|**businessServiceArrangementTypeCode** | **String** | A one position numeric value that identifies the business relationship between the transaction&#39;s participants |  [optional] |
|**businessServiceIdCode** | **String** | A six-position value that identifies the business service to which the transaction is assigned for reconciliation and rules basis |  [optional] |
|**cardAcceptorBusinessCode** | **String** | Classifies the type of business applicable to the card acceptor |  [optional] |
|**cardAcceptorCity** | **String** | Contains the card acceptor city of the merchant or, if a payment facilitator is involved in the transaction, the sub-merchant |  [optional] |
|**cardAcceptorClassificationOverrideIndicator** | **String** | Indicate whether Card Acceptor Business Code (MCC) override rates, Card Acceptor Business (CAB) Type override rates, or neither, were used in the interchange fee amount |  [optional] |
|**cardAcceptorCountry** | **String** | Contains the card acceptor county of the merchant or, if a payment facilitator is involved in the transaction, the sub-merchant |  [optional] |
|**cardAcceptorIdCode** | **String** | Identifies the card acceptor ID assigned by the acquirer |  [optional] |
|**cardAcceptorName** | **String** | Contains the card acceptor&#39;s name |  [optional] |
|**cardAcceptorPostalCode** | **String** | Contains the card acceptor&#39;s postal code |  [optional] |
|**cardAcceptorState** | **String** | Contains the card acceptor&#39;s state |  [optional] |
|**cardAcceptorStreetAddress** | **String** | Contains the card acceptor&#39;s street address |  [optional] |
|**cardAcceptorTerminalId** | **String** | A unique code identifying a terminal at the card acceptor location |  [optional] |
|**cardAcceptorUrl** | **String** | Contains the card website URL address |  [optional] |
|**cardCaptureCapability** | **String** | Indicates whether the terminal has card capture capabilities |  [optional] |
|**cardDataInputCapability** | **String** | Indicates the terminal capabilities for transferring the data on the card into the terminal |  [optional] |
|**cardDataInputMode** | **String** | Indicates how the card data was entered at the terminal |  [optional] |
|**cardDataOutputCapability** | **String** | Indicates the ability of the terminal to write or output data to a card |  [optional] |
|**cardholderAuthenticationCapability** | **String** | Describes the capability of the terminal device to support/accept authentication data |  [optional] |
|**cardholderAuthenticationEntity** | **String** | Indicates the entity through which the cardholder&#39;s identity was verified at the point of service |  [optional] |
|**cardholderAuthenticationMethod** | **String** | Indicates the method by which the cardholder&#39;s identity was verified at the point of service |  [optional] |
|**cardholderBillingAmount** | **String** | The transaction amount in the issuers currency |  [optional] |
|**cardholderBillingCurrencyCode** | **String** | Identifies the currency code of the cardholder billing amount |  [optional] |
|**cardholderFromAccountCode** | **String** | Describes the cardholder from account type |  [optional] |
|**cardholderPresentData** | **String** | Indicates whether the cardholder is present at the point of service and explains the condition if the cardholder is not present |  [optional] |
|**cardholderToAccountCode** | **String** | Describes the cardholder to account type |  [optional] |
|**cardIssuerReferenceData** | **String** | Issuer provided when processing retrieval or chargeback messages |  [optional] |
|**cardPresentData** | **String** | Indicates if the card is present at the point of service |  [optional] |
|**cardProgramIdentifier** | **String** | A three-character code that identifies the card program or financial network to which a transaction belongs |  [optional] |
|**centralSiteBusinessDate** | **String** | Identifies the official business processing date when the business service reconciles a transaction |  [optional] |
|**centralSiteProcessingDateOriginalMessage** | **String** | Central site processing date of original message |  [optional] |
|**currencyCodeCardholderBilling** | **String** | Defines the cardholder billing amount currency |  [optional] |
|**currencyCodeReconciliation** | **String** | Defines the reconciliation amount currency |  [optional] |
|**currencyCodeTransaction** | **String** | Defines the local transaction amount currency |  [optional] |
|**currencyExponentCardholderBilling** | **String** | Explicitly identifies the implicit decimal point locations associated with cardholder billing amount |  [optional] |
|**currencyExponentReconciliation** | **String** | Explicitly identifies the implicit decimal point locations associated with reconciliation amount |  [optional] |
|**currencyExponentTransaction** | **String** | Explicitly identifies the implicit decimal point locations associated with transaction amount |  [optional] |
|**dataRecord** | **String** | Contains message text data, file update data, or other information as specified in individual IPM messages |  [optional] |
|**electronicCommerceCardAuth** | **String** | Indicates the type of Cardholder Authentication used in the authorization process |  [optional] |
|**electronicCommerceSecurityLevelIndicator** | **String** | Indicates the presence and type of security protocol present in the authorization process |  [optional] |
|**electronicCommerceUcafCollectionIndicator** | **String** | Identifies the level of UCAF™ supported in the authorization process |  [optional] |
|**forwardingInstitutionIdCode** | **String** | Identifies a message&#39;s forwarding institution |  [optional] |
|**installmentAmount** | **String** | Contains total installment amount |  [optional] |
|**installmentFee** | **String** | Installment fee contains any fee paid to or by the issuer in an installment transaction. Numeric value where the last 2 are decimal |  [optional] |
|**installmentNumber** | **String** | Indicates which installment number is being submitted |  [optional] |
|**installmentPaymentDataBrazil** | **String** | The field will contain installment payment data for Brazilian intracountry transactions |  [optional] |
|**additionalAmountDataCode** | **String** | The field will contain the Additional Amount Data |  [optional] |
|**installmentParameters** | [**InstallmentParameters**](InstallmentParameters.md) |  |  [optional] |
|**originalInformationInstallments** | [**OriginalInformationInstallments**](OriginalInformationInstallments.md) |  |  [optional] |
|**installmentPlanType** | **String** | Indicates the specific installment plan types ... 21,22,23 |  [optional] |
|**functionCode** | **String** | Indicates a message&#39;s specific purpose |  [optional] |
|**gcmsProductIndentifier** | **String** | Identifies the product recognized by GCMS for the combination of issuer account range and Card Program Identifier |  [optional] |
|**installmentPaymentData** | **String** | Contains the type of financing applicable for the installment |  [optional] |
|**installmentPaymentDataAnnualPercentageRate** | **String** | Contains the annual percentage rate (XXX.XX%) an issuer will charge the cardholder for the installment payments. For installmentpayments, the default is all spaces |  [optional] |
|**installmentPaymentDataFirstInstallmentAmount** | **String** | Identifies the amount of the first installment payment |  [optional] |
|**installmentPaymentDataInstallmentFee** | **String** | Contains the fee amount an issuer will charge the cardholder for the installment payments in cardholder billing currency. The default is all spaces. |  [optional] |
|**installmentPaymentDataInterestRate** | **String** | Identifies the interest rate of intallment payments |  [optional] |
|**installmentPaymentDataNumberInstallments** | **String** | Identifies the number of installment payments |  [optional] |
|**installmentPaymentDataSubsequentInstallmentAmount** | **String** | Contains the fee amount an issuer will charge the cardholder for the installment payments in cardholder billing currency. The default is all spaces. |  [optional] |
|**integratedCircuitCardRelatedData** | **String** | Contains data related to ICC systems |  [optional] |
|**interchangeRateDesignator** | **String** | Indicates the interchange rate and editing rules applied to the transaction |  [optional] |
|**licensedProductIndentifier** | **String** | Identifies the actual product code assigned by Mastercard when licensing the combination of issuer account range and Card Program Identifier |  [optional] |
|**legalCorporateName** | **String** | Provides the card acceptor&#39;s legal corporation name |  [optional] |
|**localMessageReasonCode** | **String** | Indicate a particular chargeback domestic reason code(only for Chargebacks) |  [optional] |
|**localTax1IVA** | **String** | Contains the VAT amount for the installment fee. Numeric value where the last 2 are decimal. |  [optional] |
|**localTransactionDateTime** | **String** | The local year, month, day, and time at which the transaction takes place at the card acceptor location.The seconds in time will always be set to 00 |  [optional] |
|**mastercardAssignedId** | **String** | Identifier assigned by Mastercard |  [optional] |
|**mastercardAssignedIdOverrideIndicator** | **String** | Indicates whether override rates were used in the interchange fee amount |  [optional] |
|**mastercardMappingServiceAccountNumber** | **String** | Provides either the virtual account number/token or the primary account number in a transaction for which Mastercard performed the mapping service |  [optional] |
|**masterPassIncentiveIndicator** | **String** | Populated by GCMS and identifies the transaction as having received the Masterpass-Enabled Merchant Incentive |  [optional] |
|**messageReasonCode** | **String** | Contains the initial transaction&#39;s Message Reason Code |  [optional] |
|**messageReversalIndicator** | **String** | Identifies a message as a reversal of a previous message |  [optional] |
|**numberOfInstallments** | **String** | Total number of installments to be submitted |  [optional] |
|**originatingMessageFormat** | **String** | Provides the message format in which the clearing system received a message |  [optional] |
|**partnerIdCode** | **String** | Identifies a specific partnership agreement, generally between specific card acceptors and issuers. |  [optional] |
|**pinCaptureCapability** | **String** | Indicates the maximum number of PIN characters that the POS terminal can capture |  [optional] |
|**primaryAccountNumber** | **String** | Account number associated with transaction in question  |  [optional] |
|**processingCode** | **String** | Identifies the entity to be debited and the entity to be credited for the fee amount |  [optional] |
|**productOverrideIndicator** | **String** | Product Class value to indicate whether product class override interchange rates were used in the interchange fee amount |  [optional] |
|**programRegistrationId** | **String** | Monitors and tracks a participant&#39;s activity in special promotion programs (primarily U.S.-defined). |  [optional] |
|**qpsPaypassEligibilityIndicator** | **String** | Indicates whether or not the Quick Payment Service (QPS) or PayPass transaction qualifies for chargeback protection |  [optional] |
|**rateIndicator** | **String** | Indicates the rate applied by GCMS to the transaction |  [optional] |
|**receivingInstitutionIdCode** | **String** | Identifies the receiving institution |  [optional] |
|**reconciliationAmount** | **String** | The transaction amount value converted to the customer&#39;s reconciliation (that is, the customer&#39;s payment or settlement) currency |  [optional] |
|**reconciliationCurrencyCode** | **String** | Identifies the currency code of the reconciliation amount |  [optional] |
|**remotePaymentsProgramData** | **String** | Identifies the domain in which the Service Manager (program originator) of the Mobile Remote Payments Program is operating |  [optional] |
|**serviceCode** | **String** | Provides codes that increase issuers&#39; flexibility in defining card acceptance parameters. |  [optional] |
|**settlementData** | **String** | Provides reconciliation and settlement information for each clearing system transaction that has settlement impact |  [optional] |
|**settlementIndicator** | **String** | Indicates the settlement impact of amounts in an IPM message |  [optional] |
|**specialConditionsIndicator** | **String** | Indicates whether an adjustment was included in the Fee amount |  [optional] |
|**terminalDataOutputCapability** | **String** | Indicates the print and display capabilities of the terminal |  [optional] |
|**terminalOperatingEnvironment** | **String** | Indicates whether the card acceptor is attending the terminal and the location of the terminal |  [optional] |
|**terminalType** | **String** | Identifies the type of terminal used at the point of interaction |  [optional] |
|**tokenRequestorId** | **String** | Contains the ID assigned by the token service provider to the token requestor |  [optional] |
|**totalTransactionAmount** | **String** | Contains total transaction amount |  [optional] |
|**transactionAmountLocal** | **String** | Transaction amount in local currency |  [optional] |
|**transactionCategoryIndicator** | **String** | Provides information about the transaction that cannot be determined from other transaction information, such as Primary Account Number or Point of Service Data Code |  [optional] |
|**transactionCurrencyCode** | **String** | Defines the currency code of the transaction |  [optional] |
|**transactionDestinationInstitutionIdCode** | **String** | Identifies the transaction destination institution |  [optional] |
|**transactionLifeCycleId** | **String** | Contains all life cycle messages such as Authorizations, Financials, Reversals, Retrievals, Fulfillments and Chargebacks |  [optional] |
|**transactionOriginatorInstitutionIdCode** | **String** | Identifies the transaction originator institution |  [optional] |
|**transactionType** | **String** | Describes the specific cardholder transaction type |  [optional] |
|**transitProgramCode** | **String** | Provides data related to the transit transaction type and the transaction mode |  [optional] |
|**walletIdentifierMdes** | **String** | Provides information about transactions initiated through the use of a digital wallet |  [optional] |
|**currencyConversionAssessmentAmount** | **String** | DE 111 (Amount, Currency Conversion Assessment) is the amount based on the result of applying the multi-currency conversion rate (Currency Conversion Assessment) adjustment to the currency conversion rate used to convert DE 4 (Amount, Transaction) to DE 6 (Amount, Cardholder Billing) for qualified transactions |  [optional] |
|**japanCommonMerchantCode** | **String** | Identifies the merchant&#39;s category in Japan referred to as the Common Merchant Category Code (CMC). Mastercard uses this value to identify a link to a corresponding Mastercard Assigned ID. |  [optional] |
|**installmentData** | **String** | Provides information about the installment payment option selected by the cardholder at the point of interaction. |  [optional] |
|**flexCode** | **String** | Specific to Brazil Flex Card transactions to communicate the product code used for clearing. |  [optional] |



