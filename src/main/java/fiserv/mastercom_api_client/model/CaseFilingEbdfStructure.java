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
 * When CaseFilingEbdfDocuments is used for automatic EBDF document generation of expeditedBillingDrfDocument  (form name of Dispute Resolution Form - Pre-Compliance/Compliance)  or smsLinkedCaseFilingDrfDocument no other documents should be attached on the call. Attaching documents will lead to call failure.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-07T19:57:39.604201-03:00[America/Buenos_Aires]")
public class CaseFilingEbdfStructure {
  public static final String SERIALIZED_NAME_EXPEDITED_BILLING_DRF_DOCUMENT = "expeditedBillingDrfDocument";
  @SerializedName(SERIALIZED_NAME_EXPEDITED_BILLING_DRF_DOCUMENT)
  private ExpeditedBillingDrfDocumentStructure expeditedBillingDrfDocument;

  public static final String SERIALIZED_NAME_SMS_LINKED_CASE_FILING_DRF_DOCUMENT = "smsLinkedCaseFilingDrfDocument";
  @SerializedName(SERIALIZED_NAME_SMS_LINKED_CASE_FILING_DRF_DOCUMENT)
  private SmsLinkedCaseFilingDrfDocumentStructure smsLinkedCaseFilingDrfDocument;

  public CaseFilingEbdfStructure() {
  }

  public CaseFilingEbdfStructure expeditedBillingDrfDocument(ExpeditedBillingDrfDocumentStructure expeditedBillingDrfDocument) {
    
    this.expeditedBillingDrfDocument = expeditedBillingDrfDocument;
    return this;
  }

   /**
   * Get expeditedBillingDrfDocument
   * @return expeditedBillingDrfDocument
  **/
  @javax.annotation.Nullable
  public ExpeditedBillingDrfDocumentStructure getExpeditedBillingDrfDocument() {
    return expeditedBillingDrfDocument;
  }


  public void setExpeditedBillingDrfDocument(ExpeditedBillingDrfDocumentStructure expeditedBillingDrfDocument) {
    this.expeditedBillingDrfDocument = expeditedBillingDrfDocument;
  }


  public CaseFilingEbdfStructure smsLinkedCaseFilingDrfDocument(SmsLinkedCaseFilingDrfDocumentStructure smsLinkedCaseFilingDrfDocument) {
    
    this.smsLinkedCaseFilingDrfDocument = smsLinkedCaseFilingDrfDocument;
    return this;
  }

   /**
   * Get smsLinkedCaseFilingDrfDocument
   * @return smsLinkedCaseFilingDrfDocument
  **/
  @javax.annotation.Nullable
  public SmsLinkedCaseFilingDrfDocumentStructure getSmsLinkedCaseFilingDrfDocument() {
    return smsLinkedCaseFilingDrfDocument;
  }


  public void setSmsLinkedCaseFilingDrfDocument(SmsLinkedCaseFilingDrfDocumentStructure smsLinkedCaseFilingDrfDocument) {
    this.smsLinkedCaseFilingDrfDocument = smsLinkedCaseFilingDrfDocument;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseFilingEbdfStructure caseFilingEbdfStructure = (CaseFilingEbdfStructure) o;
    return Objects.equals(this.expeditedBillingDrfDocument, caseFilingEbdfStructure.expeditedBillingDrfDocument) &&
        Objects.equals(this.smsLinkedCaseFilingDrfDocument, caseFilingEbdfStructure.smsLinkedCaseFilingDrfDocument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expeditedBillingDrfDocument, smsLinkedCaseFilingDrfDocument);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseFilingEbdfStructure {\n");
    sb.append("    expeditedBillingDrfDocument: ").append(toIndentedString(expeditedBillingDrfDocument)).append("\n");
    sb.append("    smsLinkedCaseFilingDrfDocument: ").append(toIndentedString(smsLinkedCaseFilingDrfDocument)).append("\n");
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
    openapiFields.add("expeditedBillingDrfDocument");
    openapiFields.add("smsLinkedCaseFilingDrfDocument");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CaseFilingEbdfStructure
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CaseFilingEbdfStructure.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CaseFilingEbdfStructure is not found in the empty JSON string", CaseFilingEbdfStructure.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CaseFilingEbdfStructure.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CaseFilingEbdfStructure` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `expeditedBillingDrfDocument`
      if (jsonObj.get("expeditedBillingDrfDocument") != null && !jsonObj.get("expeditedBillingDrfDocument").isJsonNull()) {
        ExpeditedBillingDrfDocumentStructure.validateJsonElement(jsonObj.get("expeditedBillingDrfDocument"));
      }
      // validate the optional field `smsLinkedCaseFilingDrfDocument`
      if (jsonObj.get("smsLinkedCaseFilingDrfDocument") != null && !jsonObj.get("smsLinkedCaseFilingDrfDocument").isJsonNull()) {
        SmsLinkedCaseFilingDrfDocumentStructure.validateJsonElement(jsonObj.get("smsLinkedCaseFilingDrfDocument"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CaseFilingEbdfStructure.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CaseFilingEbdfStructure' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CaseFilingEbdfStructure> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CaseFilingEbdfStructure.class));

       return (TypeAdapter<T>) new TypeAdapter<CaseFilingEbdfStructure>() {
           @Override
           public void write(JsonWriter out, CaseFilingEbdfStructure value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CaseFilingEbdfStructure read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CaseFilingEbdfStructure given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CaseFilingEbdfStructure
  * @throws IOException if the JSON string is invalid with respect to CaseFilingEbdfStructure
  */
  public static CaseFilingEbdfStructure fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CaseFilingEbdfStructure.class);
  }

 /**
  * Convert an instance of CaseFilingEbdfStructure to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
