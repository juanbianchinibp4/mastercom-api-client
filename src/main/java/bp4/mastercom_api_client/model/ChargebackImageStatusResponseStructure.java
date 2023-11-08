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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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
 * ChargebackImageStatusResponseStructure
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-07T19:57:39.604201-03:00[America/Buenos_Aires]")
public class ChargebackImageStatusResponseStructure {
  public static final String SERIALIZED_NAME_CHARGEBACK_ID = "chargebackId";
  @SerializedName(SERIALIZED_NAME_CHARGEBACK_ID)
  private String chargebackId;

  public static final String SERIALIZED_NAME_CLAIM_ID = "claimId";
  @SerializedName(SERIALIZED_NAME_CLAIM_ID)
  private String claimId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public ChargebackImageStatusResponseStructure() {
  }

  public ChargebackImageStatusResponseStructure chargebackId(String chargebackId) {
    
    this.chargebackId = chargebackId;
    return this;
  }

   /**
   * Chargeback Id
   * @return chargebackId
  **/
  @javax.annotation.Nullable
  public String getChargebackId() {
    return chargebackId;
  }


  public void setChargebackId(String chargebackId) {
    this.chargebackId = chargebackId;
  }


  public ChargebackImageStatusResponseStructure claimId(String claimId) {
    
    this.claimId = claimId;
    return this;
  }

   /**
   * Claim Id
   * @return claimId
  **/
  @javax.annotation.Nullable
  public String getClaimId() {
    return claimId;
  }


  public void setClaimId(String claimId) {
    this.claimId = claimId;
  }


  public ChargebackImageStatusResponseStructure status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * When retrieving status of an image, the valid values are: COMPLETED, FAILED, PENDING, UNAVAILABLE AND DOC_NOT_APPLICABLE. COMPLETED: Image was processed and no further action required. FAILED: Some failure happened during image process flow, i.e,The image could not be converted, The image is not imported, Image extension not supported etc. PENDING: The image is pending to be processed. DOC_NOT_APPLICABLE: The dispute does not require a document. UNAVAILABLE: The image is unavailable because it is not picked up by mastercom internal processes yet.
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargebackImageStatusResponseStructure chargebackImageStatusResponseStructure = (ChargebackImageStatusResponseStructure) o;
    return Objects.equals(this.chargebackId, chargebackImageStatusResponseStructure.chargebackId) &&
        Objects.equals(this.claimId, chargebackImageStatusResponseStructure.claimId) &&
        Objects.equals(this.status, chargebackImageStatusResponseStructure.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargebackId, claimId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargebackImageStatusResponseStructure {\n");
    sb.append("    chargebackId: ").append(toIndentedString(chargebackId)).append("\n");
    sb.append("    claimId: ").append(toIndentedString(claimId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("chargebackId");
    openapiFields.add("claimId");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ChargebackImageStatusResponseStructure
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChargebackImageStatusResponseStructure.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChargebackImageStatusResponseStructure is not found in the empty JSON string", ChargebackImageStatusResponseStructure.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ChargebackImageStatusResponseStructure.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChargebackImageStatusResponseStructure` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("chargebackId") != null && !jsonObj.get("chargebackId").isJsonNull()) && !jsonObj.get("chargebackId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chargebackId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chargebackId").toString()));
      }
      if ((jsonObj.get("claimId") != null && !jsonObj.get("claimId").isJsonNull()) && !jsonObj.get("claimId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `claimId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("claimId").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChargebackImageStatusResponseStructure.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChargebackImageStatusResponseStructure' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChargebackImageStatusResponseStructure> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChargebackImageStatusResponseStructure.class));

       return (TypeAdapter<T>) new TypeAdapter<ChargebackImageStatusResponseStructure>() {
           @Override
           public void write(JsonWriter out, ChargebackImageStatusResponseStructure value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChargebackImageStatusResponseStructure read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChargebackImageStatusResponseStructure given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChargebackImageStatusResponseStructure
  * @throws IOException if the JSON string is invalid with respect to ChargebackImageStatusResponseStructure
  */
  public static ChargebackImageStatusResponseStructure fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChargebackImageStatusResponseStructure.class);
  }

 /**
  * Convert an instance of ChargebackImageStatusResponseStructure to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

