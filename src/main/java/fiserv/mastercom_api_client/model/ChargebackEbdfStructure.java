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


package fiserv.mastercom_api_client.model;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import fiserv.mastercom_api_client.JSON;

import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * NOTE: When chargebackEbdfDocuments is used for automatic EBDF document generation for transactionInformation (or) fraudDrfDocument (or) cardholderDisputeChargebackDrfDocument (or) pointOfInteractionErrorsDrfDocument, no other documents should be attached on the call and documentIndicator must be set to true. Attaching documents or setting documentIndicator to false will lead to call failure.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-07T19:57:39.604201-03:00[America/Buenos_Aires]")
public class ChargebackEbdfStructure {
  public static final String SERIALIZED_NAME_TRANSACTION_INFORMATION = "transactionInformation";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_INFORMATION)
  private TransactionInformationEbdfStructure transactionInformation;

  public static final String SERIALIZED_NAME_FRAUD_DRF_DOCUMENT = "fraudDrfDocument";
  @SerializedName(SERIALIZED_NAME_FRAUD_DRF_DOCUMENT)
  private FraudDrfDocumentStructure fraudDrfDocument;

  public static final String SERIALIZED_NAME_CARDHOLDER_DISPUTE_CHARGEBACK_DRF_DOCUMENT = "cardholderDisputeChargebackDrfDocument";
  @SerializedName(SERIALIZED_NAME_CARDHOLDER_DISPUTE_CHARGEBACK_DRF_DOCUMENT)
  private CardholderDisputeChargebackDrfDocumentStructure cardholderDisputeChargebackDrfDocument;

  public static final String SERIALIZED_NAME_POINT_OF_INTERACTION_ERRORS_DRF_DOCUMENT = "pointOfInteractionErrorsDrfDocument";
  @SerializedName(SERIALIZED_NAME_POINT_OF_INTERACTION_ERRORS_DRF_DOCUMENT)
  private PointOfInteractionErrorsDrfDocumentStructure pointOfInteractionErrorsDrfDocument;

  public ChargebackEbdfStructure() {
  }

  public ChargebackEbdfStructure transactionInformation(TransactionInformationEbdfStructure transactionInformation) {
    
    this.transactionInformation = transactionInformation;
    return this;
  }

   /**
   * Get transactionInformation
   * @return transactionInformation
  **/
  @javax.annotation.Nullable
  public TransactionInformationEbdfStructure getTransactionInformation() {
    return transactionInformation;
  }


  public void setTransactionInformation(TransactionInformationEbdfStructure transactionInformation) {
    this.transactionInformation = transactionInformation;
  }


  public ChargebackEbdfStructure fraudDrfDocument(FraudDrfDocumentStructure fraudDrfDocument) {
    
    this.fraudDrfDocument = fraudDrfDocument;
    return this;
  }

   /**
   * Get fraudDrfDocument
   * @return fraudDrfDocument
  **/
  @javax.annotation.Nullable
  public FraudDrfDocumentStructure getFraudDrfDocument() {
    return fraudDrfDocument;
  }


  public void setFraudDrfDocument(FraudDrfDocumentStructure fraudDrfDocument) {
    this.fraudDrfDocument = fraudDrfDocument;
  }


  public ChargebackEbdfStructure cardholderDisputeChargebackDrfDocument(CardholderDisputeChargebackDrfDocumentStructure cardholderDisputeChargebackDrfDocument) {
    
    this.cardholderDisputeChargebackDrfDocument = cardholderDisputeChargebackDrfDocument;
    return this;
  }

   /**
   * Get cardholderDisputeChargebackDrfDocument
   * @return cardholderDisputeChargebackDrfDocument
  **/
  @javax.annotation.Nullable
  public CardholderDisputeChargebackDrfDocumentStructure getCardholderDisputeChargebackDrfDocument() {
    return cardholderDisputeChargebackDrfDocument;
  }


  public void setCardholderDisputeChargebackDrfDocument(CardholderDisputeChargebackDrfDocumentStructure cardholderDisputeChargebackDrfDocument) {
    this.cardholderDisputeChargebackDrfDocument = cardholderDisputeChargebackDrfDocument;
  }


  public ChargebackEbdfStructure pointOfInteractionErrorsDrfDocument(PointOfInteractionErrorsDrfDocumentStructure pointOfInteractionErrorsDrfDocument) {
    
    this.pointOfInteractionErrorsDrfDocument = pointOfInteractionErrorsDrfDocument;
    return this;
  }

   /**
   * Get pointOfInteractionErrorsDrfDocument
   * @return pointOfInteractionErrorsDrfDocument
  **/
  @javax.annotation.Nullable
  public PointOfInteractionErrorsDrfDocumentStructure getPointOfInteractionErrorsDrfDocument() {
    return pointOfInteractionErrorsDrfDocument;
  }


  public void setPointOfInteractionErrorsDrfDocument(PointOfInteractionErrorsDrfDocumentStructure pointOfInteractionErrorsDrfDocument) {
    this.pointOfInteractionErrorsDrfDocument = pointOfInteractionErrorsDrfDocument;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargebackEbdfStructure chargebackEbdfStructure = (ChargebackEbdfStructure) o;
    return Objects.equals(this.transactionInformation, chargebackEbdfStructure.transactionInformation) &&
        Objects.equals(this.fraudDrfDocument, chargebackEbdfStructure.fraudDrfDocument) &&
        Objects.equals(this.cardholderDisputeChargebackDrfDocument, chargebackEbdfStructure.cardholderDisputeChargebackDrfDocument) &&
        Objects.equals(this.pointOfInteractionErrorsDrfDocument, chargebackEbdfStructure.pointOfInteractionErrorsDrfDocument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionInformation, fraudDrfDocument, cardholderDisputeChargebackDrfDocument, pointOfInteractionErrorsDrfDocument);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargebackEbdfStructure {\n");
    sb.append("    transactionInformation: ").append(toIndentedString(transactionInformation)).append("\n");
    sb.append("    fraudDrfDocument: ").append(toIndentedString(fraudDrfDocument)).append("\n");
    sb.append("    cardholderDisputeChargebackDrfDocument: ").append(toIndentedString(cardholderDisputeChargebackDrfDocument)).append("\n");
    sb.append("    pointOfInteractionErrorsDrfDocument: ").append(toIndentedString(pointOfInteractionErrorsDrfDocument)).append("\n");
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
    openapiFields.add("transactionInformation");
    openapiFields.add("fraudDrfDocument");
    openapiFields.add("cardholderDisputeChargebackDrfDocument");
    openapiFields.add("pointOfInteractionErrorsDrfDocument");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ChargebackEbdfStructure
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChargebackEbdfStructure.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChargebackEbdfStructure is not found in the empty JSON string", ChargebackEbdfStructure.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ChargebackEbdfStructure.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChargebackEbdfStructure` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `transactionInformation`
      if (jsonObj.get("transactionInformation") != null && !jsonObj.get("transactionInformation").isJsonNull()) {
        TransactionInformationEbdfStructure.validateJsonElement(jsonObj.get("transactionInformation"));
      }
      // validate the optional field `fraudDrfDocument`
      if (jsonObj.get("fraudDrfDocument") != null && !jsonObj.get("fraudDrfDocument").isJsonNull()) {
        FraudDrfDocumentStructure.validateJsonElement(jsonObj.get("fraudDrfDocument"));
      }
      // validate the optional field `cardholderDisputeChargebackDrfDocument`
      if (jsonObj.get("cardholderDisputeChargebackDrfDocument") != null && !jsonObj.get("cardholderDisputeChargebackDrfDocument").isJsonNull()) {
        CardholderDisputeChargebackDrfDocumentStructure.validateJsonElement(jsonObj.get("cardholderDisputeChargebackDrfDocument"));
      }
      // validate the optional field `pointOfInteractionErrorsDrfDocument`
      if (jsonObj.get("pointOfInteractionErrorsDrfDocument") != null && !jsonObj.get("pointOfInteractionErrorsDrfDocument").isJsonNull()) {
        PointOfInteractionErrorsDrfDocumentStructure.validateJsonElement(jsonObj.get("pointOfInteractionErrorsDrfDocument"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChargebackEbdfStructure.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChargebackEbdfStructure' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChargebackEbdfStructure> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChargebackEbdfStructure.class));

       return (TypeAdapter<T>) new TypeAdapter<ChargebackEbdfStructure>() {
           @Override
           public void write(JsonWriter out, ChargebackEbdfStructure value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChargebackEbdfStructure read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChargebackEbdfStructure given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChargebackEbdfStructure
  * @throws IOException if the JSON string is invalid with respect to ChargebackEbdfStructure
  */
  public static ChargebackEbdfStructure fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChargebackEbdfStructure.class);
  }

 /**
  * Convert an instance of ChargebackEbdfStructure to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
