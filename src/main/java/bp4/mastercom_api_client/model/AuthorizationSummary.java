/*
 * MasterCom
 * MasterCom
 *
 * The version of the OpenAPI document: v6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package bp4.mastercom_api_client.model;

import java.util.Objects;
import bp4.mastercom_api_client.model.ClearingSummary;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import bp4.mastercom_api_client.JSON;

/**
 * AuthorizationSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-07T19:57:39.604201-03:00[America/Buenos_Aires]")
public class AuthorizationSummary {
  public static final String SERIALIZED_NAME_ORIGINAL_MESSAGE_TYPE_IDENTIFIER = "originalMessageTypeIdentifier";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_MESSAGE_TYPE_IDENTIFIER)
  private String originalMessageTypeIdentifier;

  public static final String SERIALIZED_NAME_BANKNET_DATE = "banknetDate";
  @SerializedName(SERIALIZED_NAME_BANKNET_DATE)
  private String banknetDate;

  public static final String SERIALIZED_NAME_TRANSACTION_AMOUNT_USD = "transactionAmountUsd";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_AMOUNT_USD)
  private String transactionAmountUsd;

  public static final String SERIALIZED_NAME_PRIMARY_ACCOUNT_NUMBER = "primaryAccountNumber";
  @SerializedName(SERIALIZED_NAME_PRIMARY_ACCOUNT_NUMBER)
  private String primaryAccountNumber;

  public static final String SERIALIZED_NAME_PROCESSING_CODE = "processingCode";
  @SerializedName(SERIALIZED_NAME_PROCESSING_CODE)
  private String processingCode;

  public static final String SERIALIZED_NAME_TRANSACTION_AMOUNT_LOCAL = "transactionAmountLocal";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_AMOUNT_LOCAL)
  private String transactionAmountLocal;

  public static final String SERIALIZED_NAME_AUTHORIZATION_DATE_AND_TIME = "authorizationDateAndTime";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION_DATE_AND_TIME)
  private String authorizationDateAndTime;

  public static final String SERIALIZED_NAME_AUTHENTICATION_ID = "authenticationId";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_ID)
  private String authenticationId;

  public static final String SERIALIZED_NAME_CARD_ACCEPTOR_NAME = "cardAcceptorName";
  @SerializedName(SERIALIZED_NAME_CARD_ACCEPTOR_NAME)
  private String cardAcceptorName;

  public static final String SERIALIZED_NAME_CARD_ACCEPTOR_CITY = "cardAcceptorCity";
  @SerializedName(SERIALIZED_NAME_CARD_ACCEPTOR_CITY)
  private String cardAcceptorCity;

  public static final String SERIALIZED_NAME_CARD_ACCEPTOR_STATE = "cardAcceptorState";
  @SerializedName(SERIALIZED_NAME_CARD_ACCEPTOR_STATE)
  private String cardAcceptorState;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_CHIP_PRESENT = "chipPresent";
  @SerializedName(SERIALIZED_NAME_CHIP_PRESENT)
  private String chipPresent;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_TRACK1 = "track1";
  @SerializedName(SERIALIZED_NAME_TRACK1)
  private String track1;

  public static final String SERIALIZED_NAME_TRACK2 = "track2";
  @SerializedName(SERIALIZED_NAME_TRACK2)
  private String track2;

  public static final String SERIALIZED_NAME_CLEARING_SUMMARY = "clearingSummary";
  @SerializedName(SERIALIZED_NAME_CLEARING_SUMMARY)
  private List<ClearingSummary> clearingSummary;

  public AuthorizationSummary() {
  }

  public AuthorizationSummary originalMessageTypeIdentifier(String originalMessageTypeIdentifier) {
    
    this.originalMessageTypeIdentifier = originalMessageTypeIdentifier;
    return this;
  }

   /**
   * Indicates the Message Type Identifier (MTI) of the original message
   * @return originalMessageTypeIdentifier
  **/
  @javax.annotation.Nullable
  public String getOriginalMessageTypeIdentifier() {
    return originalMessageTypeIdentifier;
  }


  public void setOriginalMessageTypeIdentifier(String originalMessageTypeIdentifier) {
    this.originalMessageTypeIdentifier = originalMessageTypeIdentifier;
  }


  public AuthorizationSummary banknetDate(String banknetDate) {
    
    this.banknetDate = banknetDate;
    return this;
  }

   /**
   * The date/time when the SAFE record is matched to the Authorization transaction
   * @return banknetDate
  **/
  @javax.annotation.Nullable
  public String getBanknetDate() {
    return banknetDate;
  }


  public void setBanknetDate(String banknetDate) {
    this.banknetDate = banknetDate;
  }


  public AuthorizationSummary transactionAmountUsd(String transactionAmountUsd) {
    
    this.transactionAmountUsd = transactionAmountUsd;
    return this;
  }

   /**
   * Transaction amount in USD
   * @return transactionAmountUsd
  **/
  @javax.annotation.Nullable
  public String getTransactionAmountUsd() {
    return transactionAmountUsd;
  }


  public void setTransactionAmountUsd(String transactionAmountUsd) {
    this.transactionAmountUsd = transactionAmountUsd;
  }


  public AuthorizationSummary primaryAccountNumber(String primaryAccountNumber) {
    
    this.primaryAccountNumber = primaryAccountNumber;
    return this;
  }

   /**
   * Primary account number
   * @return primaryAccountNumber
  **/
  @javax.annotation.Nullable
  public String getPrimaryAccountNumber() {
    return primaryAccountNumber;
  }


  public void setPrimaryAccountNumber(String primaryAccountNumber) {
    this.primaryAccountNumber = primaryAccountNumber;
  }


  public AuthorizationSummary processingCode(String processingCode) {
    
    this.processingCode = processingCode;
    return this;
  }

   /**
   * A series of digits used to describe the effect of a transaction on the customer account and the type of accounts affected
   * @return processingCode
  **/
  @javax.annotation.Nullable
  public String getProcessingCode() {
    return processingCode;
  }


  public void setProcessingCode(String processingCode) {
    this.processingCode = processingCode;
  }


  public AuthorizationSummary transactionAmountLocal(String transactionAmountLocal) {
    
    this.transactionAmountLocal = transactionAmountLocal;
    return this;
  }

   /**
   * Transaction amount in local currency
   * @return transactionAmountLocal
  **/
  @javax.annotation.Nullable
  public String getTransactionAmountLocal() {
    return transactionAmountLocal;
  }


  public void setTransactionAmountLocal(String transactionAmountLocal) {
    this.transactionAmountLocal = transactionAmountLocal;
  }


  public AuthorizationSummary authorizationDateAndTime(String authorizationDateAndTime) {
    
    this.authorizationDateAndTime = authorizationDateAndTime;
    return this;
  }

   /**
   * The date and time that a message is entered into the Mastercard Network
   * @return authorizationDateAndTime
  **/
  @javax.annotation.Nullable
  public String getAuthorizationDateAndTime() {
    return authorizationDateAndTime;
  }


  public void setAuthorizationDateAndTime(String authorizationDateAndTime) {
    this.authorizationDateAndTime = authorizationDateAndTime;
  }


  public AuthorizationSummary authenticationId(String authenticationId) {
    
    this.authenticationId = authenticationId;
    return this;
  }

   /**
   * Defined by the Authorization Platform and is passed to the issuer to indicate that the transaction qualified for Authentication service
   * @return authenticationId
  **/
  @javax.annotation.Nullable
  public String getAuthenticationId() {
    return authenticationId;
  }


  public void setAuthenticationId(String authenticationId) {
    this.authenticationId = authenticationId;
  }


  public AuthorizationSummary cardAcceptorName(String cardAcceptorName) {
    
    this.cardAcceptorName = cardAcceptorName;
    return this;
  }

   /**
   * Name the card acceptor that defines the point of interaction in both local and interchange environments (excluding ATM and Card-Activated Public Phones)
   * @return cardAcceptorName
  **/
  @javax.annotation.Nullable
  public String getCardAcceptorName() {
    return cardAcceptorName;
  }


  public void setCardAcceptorName(String cardAcceptorName) {
    this.cardAcceptorName = cardAcceptorName;
  }


  public AuthorizationSummary cardAcceptorCity(String cardAcceptorCity) {
    
    this.cardAcceptorCity = cardAcceptorCity;
    return this;
  }

   /**
   * City of the card acceptor that defines the point of interaction in both local and interchange environments (excluding ATM and Card-Activated Public Phones)
   * @return cardAcceptorCity
  **/
  @javax.annotation.Nullable
  public String getCardAcceptorCity() {
    return cardAcceptorCity;
  }


  public void setCardAcceptorCity(String cardAcceptorCity) {
    this.cardAcceptorCity = cardAcceptorCity;
  }


  public AuthorizationSummary cardAcceptorState(String cardAcceptorState) {
    
    this.cardAcceptorState = cardAcceptorState;
    return this;
  }

   /**
   * State of the card acceptor that defines the point of interaction in both local and interchange environments (excluding ATM and Card-Activated Public Phones)
   * @return cardAcceptorState
  **/
  @javax.annotation.Nullable
  public String getCardAcceptorState() {
    return cardAcceptorState;
  }


  public void setCardAcceptorState(String cardAcceptorState) {
    this.cardAcceptorState = cardAcceptorState;
  }


  public AuthorizationSummary currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Currency code the issuer will be charging the cardholder for repayment
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public AuthorizationSummary chipPresent(String chipPresent) {
    
    this.chipPresent = chipPresent;
    return this;
  }

   /**
   * Indicates if chip was present or not
   * @return chipPresent
  **/
  @javax.annotation.Nullable
  public String getChipPresent() {
    return chipPresent;
  }


  public void setChipPresent(String chipPresent) {
    this.chipPresent = chipPresent;
  }


  public AuthorizationSummary transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * The host&#39;s identifier
   * @return transactionId
  **/
  @javax.annotation.Nullable
  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public AuthorizationSummary track1(String track1) {
    
    this.track1 = track1;
    return this;
  }

   /**
   * The information encoded on track 1 of the card&#39;s magnetic stripe as defined in the ISO 7813 specification, including data element separators but excluding beginning and ending sentinels and LRC characters as defined in this data element definition
   * @return track1
  **/
  @javax.annotation.Nullable
  public String getTrack1() {
    return track1;
  }


  public void setTrack1(String track1) {
    this.track1 = track1;
  }


  public AuthorizationSummary track2(String track2) {
    
    this.track2 = track2;
    return this;
  }

   /**
   * The information encoded on track 2 of the card magnetic stripe as defined in the ISO 7813 specification, including data element separators but excluding beginning and ending sentinels and longitudinal redundancy check (LRC) characters as defined therein
   * @return track2
  **/
  @javax.annotation.Nullable
  public String getTrack2() {
    return track2;
  }


  public void setTrack2(String track2) {
    this.track2 = track2;
  }


  public AuthorizationSummary clearingSummary(List<ClearingSummary> clearingSummary) {
    
    this.clearingSummary = clearingSummary;
    return this;
  }

  public AuthorizationSummary addClearingSummaryItem(ClearingSummary clearingSummaryItem) {
    if (this.clearingSummary == null) {
      this.clearingSummary = new ArrayList<>();
    }
    this.clearingSummary.add(clearingSummaryItem);
    return this;
  }

   /**
   * Get clearingSummary
   * @return clearingSummary
  **/
  @javax.annotation.Nullable
  public List<ClearingSummary> getClearingSummary() {
    return clearingSummary;
  }


  public void setClearingSummary(List<ClearingSummary> clearingSummary) {
    this.clearingSummary = clearingSummary;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizationSummary authorizationSummary = (AuthorizationSummary) o;
    return Objects.equals(this.originalMessageTypeIdentifier, authorizationSummary.originalMessageTypeIdentifier) &&
        Objects.equals(this.banknetDate, authorizationSummary.banknetDate) &&
        Objects.equals(this.transactionAmountUsd, authorizationSummary.transactionAmountUsd) &&
        Objects.equals(this.primaryAccountNumber, authorizationSummary.primaryAccountNumber) &&
        Objects.equals(this.processingCode, authorizationSummary.processingCode) &&
        Objects.equals(this.transactionAmountLocal, authorizationSummary.transactionAmountLocal) &&
        Objects.equals(this.authorizationDateAndTime, authorizationSummary.authorizationDateAndTime) &&
        Objects.equals(this.authenticationId, authorizationSummary.authenticationId) &&
        Objects.equals(this.cardAcceptorName, authorizationSummary.cardAcceptorName) &&
        Objects.equals(this.cardAcceptorCity, authorizationSummary.cardAcceptorCity) &&
        Objects.equals(this.cardAcceptorState, authorizationSummary.cardAcceptorState) &&
        Objects.equals(this.currencyCode, authorizationSummary.currencyCode) &&
        Objects.equals(this.chipPresent, authorizationSummary.chipPresent) &&
        Objects.equals(this.transactionId, authorizationSummary.transactionId) &&
        Objects.equals(this.track1, authorizationSummary.track1) &&
        Objects.equals(this.track2, authorizationSummary.track2) &&
        Objects.equals(this.clearingSummary, authorizationSummary.clearingSummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalMessageTypeIdentifier, banknetDate, transactionAmountUsd, primaryAccountNumber, processingCode, transactionAmountLocal, authorizationDateAndTime, authenticationId, cardAcceptorName, cardAcceptorCity, cardAcceptorState, currencyCode, chipPresent, transactionId, track1, track2, clearingSummary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationSummary {\n");
    sb.append("    originalMessageTypeIdentifier: ").append(toIndentedString(originalMessageTypeIdentifier)).append("\n");
    sb.append("    banknetDate: ").append(toIndentedString(banknetDate)).append("\n");
    sb.append("    transactionAmountUsd: ").append(toIndentedString(transactionAmountUsd)).append("\n");
    sb.append("    primaryAccountNumber: ").append(toIndentedString(primaryAccountNumber)).append("\n");
    sb.append("    processingCode: ").append(toIndentedString(processingCode)).append("\n");
    sb.append("    transactionAmountLocal: ").append(toIndentedString(transactionAmountLocal)).append("\n");
    sb.append("    authorizationDateAndTime: ").append(toIndentedString(authorizationDateAndTime)).append("\n");
    sb.append("    authenticationId: ").append(toIndentedString(authenticationId)).append("\n");
    sb.append("    cardAcceptorName: ").append(toIndentedString(cardAcceptorName)).append("\n");
    sb.append("    cardAcceptorCity: ").append(toIndentedString(cardAcceptorCity)).append("\n");
    sb.append("    cardAcceptorState: ").append(toIndentedString(cardAcceptorState)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    chipPresent: ").append(toIndentedString(chipPresent)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    track1: ").append(toIndentedString(track1)).append("\n");
    sb.append("    track2: ").append(toIndentedString(track2)).append("\n");
    sb.append("    clearingSummary: ").append(toIndentedString(clearingSummary)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("originalMessageTypeIdentifier");
    openapiFields.add("banknetDate");
    openapiFields.add("transactionAmountUsd");
    openapiFields.add("primaryAccountNumber");
    openapiFields.add("processingCode");
    openapiFields.add("transactionAmountLocal");
    openapiFields.add("authorizationDateAndTime");
    openapiFields.add("authenticationId");
    openapiFields.add("cardAcceptorName");
    openapiFields.add("cardAcceptorCity");
    openapiFields.add("cardAcceptorState");
    openapiFields.add("currencyCode");
    openapiFields.add("chipPresent");
    openapiFields.add("transactionId");
    openapiFields.add("track1");
    openapiFields.add("track2");
    openapiFields.add("clearingSummary");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AuthorizationSummary
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AuthorizationSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthorizationSummary is not found in the empty JSON string", AuthorizationSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AuthorizationSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthorizationSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("originalMessageTypeIdentifier") != null && !jsonObj.get("originalMessageTypeIdentifier").isJsonNull()) && !jsonObj.get("originalMessageTypeIdentifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `originalMessageTypeIdentifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("originalMessageTypeIdentifier").toString()));
      }
      if ((jsonObj.get("banknetDate") != null && !jsonObj.get("banknetDate").isJsonNull()) && !jsonObj.get("banknetDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `banknetDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("banknetDate").toString()));
      }
      if ((jsonObj.get("transactionAmountUsd") != null && !jsonObj.get("transactionAmountUsd").isJsonNull()) && !jsonObj.get("transactionAmountUsd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionAmountUsd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionAmountUsd").toString()));
      }
      if ((jsonObj.get("primaryAccountNumber") != null && !jsonObj.get("primaryAccountNumber").isJsonNull()) && !jsonObj.get("primaryAccountNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primaryAccountNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primaryAccountNumber").toString()));
      }
      if ((jsonObj.get("processingCode") != null && !jsonObj.get("processingCode").isJsonNull()) && !jsonObj.get("processingCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `processingCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("processingCode").toString()));
      }
      if ((jsonObj.get("transactionAmountLocal") != null && !jsonObj.get("transactionAmountLocal").isJsonNull()) && !jsonObj.get("transactionAmountLocal").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionAmountLocal` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionAmountLocal").toString()));
      }
      if ((jsonObj.get("authorizationDateAndTime") != null && !jsonObj.get("authorizationDateAndTime").isJsonNull()) && !jsonObj.get("authorizationDateAndTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorizationDateAndTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorizationDateAndTime").toString()));
      }
      if ((jsonObj.get("authenticationId") != null && !jsonObj.get("authenticationId").isJsonNull()) && !jsonObj.get("authenticationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authenticationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authenticationId").toString()));
      }
      if ((jsonObj.get("cardAcceptorName") != null && !jsonObj.get("cardAcceptorName").isJsonNull()) && !jsonObj.get("cardAcceptorName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardAcceptorName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardAcceptorName").toString()));
      }
      if ((jsonObj.get("cardAcceptorCity") != null && !jsonObj.get("cardAcceptorCity").isJsonNull()) && !jsonObj.get("cardAcceptorCity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardAcceptorCity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardAcceptorCity").toString()));
      }
      if ((jsonObj.get("cardAcceptorState") != null && !jsonObj.get("cardAcceptorState").isJsonNull()) && !jsonObj.get("cardAcceptorState").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardAcceptorState` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardAcceptorState").toString()));
      }
      if ((jsonObj.get("currencyCode") != null && !jsonObj.get("currencyCode").isJsonNull()) && !jsonObj.get("currencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyCode").toString()));
      }
      if ((jsonObj.get("chipPresent") != null && !jsonObj.get("chipPresent").isJsonNull()) && !jsonObj.get("chipPresent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chipPresent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chipPresent").toString()));
      }
      if ((jsonObj.get("transactionId") != null && !jsonObj.get("transactionId").isJsonNull()) && !jsonObj.get("transactionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionId").toString()));
      }
      if ((jsonObj.get("track1") != null && !jsonObj.get("track1").isJsonNull()) && !jsonObj.get("track1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `track1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("track1").toString()));
      }
      if ((jsonObj.get("track2") != null && !jsonObj.get("track2").isJsonNull()) && !jsonObj.get("track2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `track2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("track2").toString()));
      }
      if (jsonObj.get("clearingSummary") != null && !jsonObj.get("clearingSummary").isJsonNull()) {
        JsonArray jsonArrayclearingSummary = jsonObj.getAsJsonArray("clearingSummary");
        if (jsonArrayclearingSummary != null) {
          // ensure the json data is an array
          if (!jsonObj.get("clearingSummary").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `clearingSummary` to be an array in the JSON string but got `%s`", jsonObj.get("clearingSummary").toString()));
          }

          // validate the optional field `clearingSummary` (array)
          for (int i = 0; i < jsonArrayclearingSummary.size(); i++) {
            ClearingSummary.validateJsonElement(jsonArrayclearingSummary.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthorizationSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthorizationSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthorizationSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthorizationSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthorizationSummary>() {
           @Override
           public void write(JsonWriter out, AuthorizationSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthorizationSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuthorizationSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthorizationSummary
  * @throws IOException if the JSON string is invalid with respect to AuthorizationSummary
  */
  public static AuthorizationSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthorizationSummary.class);
  }

 /**
  * Convert an instance of AuthorizationSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

