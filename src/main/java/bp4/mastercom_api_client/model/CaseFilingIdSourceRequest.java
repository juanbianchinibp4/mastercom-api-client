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
 * CaseFilingIdSourceRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-07T19:57:39.604201-03:00[America/Buenos_Aires]")
public class CaseFilingIdSourceRequest {
  public static final String SERIALIZED_NAME_CASE_ID = "caseId";
  @SerializedName(SERIALIZED_NAME_CASE_ID)
  private String caseId;

  public static final String SERIALIZED_NAME_IS_ISSUER = "isIssuer";
  @SerializedName(SERIALIZED_NAME_IS_ISSUER)
  private Boolean isIssuer;

  public CaseFilingIdSourceRequest() {
  }

  public CaseFilingIdSourceRequest caseId(String caseId) {
    
    this.caseId = caseId;
    return this;
  }

   /**
   * The case filing id.   Length: 1-19   Valid Values/Format: Numeric
   * @return caseId
  **/
  @javax.annotation.Nonnull
  public String getCaseId() {
    return caseId;
  }


  public void setCaseId(String caseId) {
    this.caseId = caseId;
  }


  public CaseFilingIdSourceRequest isIssuer(Boolean isIssuer) {
    
    this.isIssuer = isIssuer;
    return this;
  }

   /**
   * In a case filling context, if &#39;true&#39; the caller is on the sender side, if &#39;false&#39; on the receiver side.   Length: 4-5   Valid Values/Format: true / false
   * @return isIssuer
  **/
  @javax.annotation.Nonnull
  public Boolean getIsIssuer() {
    return isIssuer;
  }


  public void setIsIssuer(Boolean isIssuer) {
    this.isIssuer = isIssuer;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseFilingIdSourceRequest caseFilingIdSourceRequest = (CaseFilingIdSourceRequest) o;
    return Objects.equals(this.caseId, caseFilingIdSourceRequest.caseId) &&
        Objects.equals(this.isIssuer, caseFilingIdSourceRequest.isIssuer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caseId, isIssuer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseFilingIdSourceRequest {\n");
    sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
    sb.append("    isIssuer: ").append(toIndentedString(isIssuer)).append("\n");
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
    openapiFields.add("caseId");
    openapiFields.add("isIssuer");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("caseId");
    openapiRequiredFields.add("isIssuer");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CaseFilingIdSourceRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CaseFilingIdSourceRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CaseFilingIdSourceRequest is not found in the empty JSON string", CaseFilingIdSourceRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CaseFilingIdSourceRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CaseFilingIdSourceRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CaseFilingIdSourceRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("caseId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caseId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caseId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CaseFilingIdSourceRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CaseFilingIdSourceRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CaseFilingIdSourceRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CaseFilingIdSourceRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CaseFilingIdSourceRequest>() {
           @Override
           public void write(JsonWriter out, CaseFilingIdSourceRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CaseFilingIdSourceRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CaseFilingIdSourceRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CaseFilingIdSourceRequest
  * @throws IOException if the JSON string is invalid with respect to CaseFilingIdSourceRequest
  */
  public static CaseFilingIdSourceRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CaseFilingIdSourceRequest.class);
  }

 /**
  * Convert an instance of CaseFilingIdSourceRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
