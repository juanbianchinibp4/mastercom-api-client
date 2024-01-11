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
import com.google.gson.annotations.JsonAdapter;
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
 * CreateClaimRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-07T19:57:39.604201-03:00[America/Buenos_Aires]")
public class CreateClaimRequest {
  public static final String SERIALIZED_NAME_DISPUTED_AMOUNT = "disputedAmount";
  @SerializedName(SERIALIZED_NAME_DISPUTED_AMOUNT)
  private String disputedAmount;

  public static final String SERIALIZED_NAME_DISPUTED_CURRENCY = "disputedCurrency";
  @SerializedName(SERIALIZED_NAME_DISPUTED_CURRENCY)
  private String disputedCurrency;

  /**
   * Type of claim to be created.   Length: 8   Valid Values/Format: Standard
   */
  @JsonAdapter(ClaimTypeEnum.Adapter.class)
  public enum ClaimTypeEnum {
    STANDARD("Standard");

    private String value;

    ClaimTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ClaimTypeEnum fromValue(String value) {
      for (ClaimTypeEnum b : ClaimTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ClaimTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ClaimTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ClaimTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ClaimTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CLAIM_TYPE = "claimType";
  @SerializedName(SERIALIZED_NAME_CLAIM_TYPE)
  private ClaimTypeEnum claimType;

  public static final String SERIALIZED_NAME_CLEARING_TRANSACTION_ID = "clearingTransactionId";
  @SerializedName(SERIALIZED_NAME_CLEARING_TRANSACTION_ID)
  private String clearingTransactionId;

  public static final String SERIALIZED_NAME_AUTH_TRANSACTION_ID = "authTransactionId";
  @SerializedName(SERIALIZED_NAME_AUTH_TRANSACTION_ID)
  private String authTransactionId;

  public CreateClaimRequest() {
  }

  public CreateClaimRequest disputedAmount(String disputedAmount) {
    
    this.disputedAmount = disputedAmount;
    return this;
  }

   /**
   * Amount disputed in the claim   Length: 4-12   Valid Values/Format: Numeric
   * @return disputedAmount
  **/
  @javax.annotation.Nonnull
  public String getDisputedAmount() {
    return disputedAmount;
  }


  public void setDisputedAmount(String disputedAmount) {
    this.disputedAmount = disputedAmount;
  }


  public CreateClaimRequest disputedCurrency(String disputedCurrency) {
    
    this.disputedCurrency = disputedCurrency;
    return this;
  }

   /**
   * Currency of amount disputed in the claim. disputedCurrency can be provided as standard alpha code or numeric code   Length: 3   Valid Values/Format: A-Z (Uppercase Alphabetic Letter) / Numeric
   * @return disputedCurrency
  **/
  @javax.annotation.Nonnull
  public String getDisputedCurrency() {
    return disputedCurrency;
  }


  public void setDisputedCurrency(String disputedCurrency) {
    this.disputedCurrency = disputedCurrency;
  }


  public CreateClaimRequest claimType(ClaimTypeEnum claimType) {
    
    this.claimType = claimType;
    return this;
  }

   /**
   * Type of claim to be created.   Length: 8   Valid Values/Format: Standard
   * @return claimType
  **/
  @javax.annotation.Nonnull
  public ClaimTypeEnum getClaimType() {
    return claimType;
  }


  public void setClaimType(ClaimTypeEnum claimType) {
    this.claimType = claimType;
  }


  public CreateClaimRequest clearingTransactionId(String clearingTransactionId) {
    
    this.clearingTransactionId = clearingTransactionId;
    return this;
  }

   /**
   * The Clearing Transaction Identifier from Clearing Summary Results.   Length: N/A   Valid Values/Format: Alphanumeric, Special Char (~!@#$%^&amp;*()_+{}|:\&quot;&lt;&gt;?,./;&#39;[]-&#x3D;)
   * @return clearingTransactionId
  **/
  @javax.annotation.Nonnull
  public String getClearingTransactionId() {
    return clearingTransactionId;
  }


  public void setClearingTransactionId(String clearingTransactionId) {
    this.clearingTransactionId = clearingTransactionId;
  }


  public CreateClaimRequest authTransactionId(String authTransactionId) {
    
    this.authTransactionId = authTransactionId;
    return this;
  }

   /**
   * The Authorization Transaction Identifier from Authorization Summary Results.   Length: N/A   Valid Values/Format: Alphanumeric, Special Char (~!@#$%^&amp;*()_+{}|:\&quot;&lt;&gt;?,./;&#39;[]-&#x3D;)
   * @return authTransactionId
  **/
  @javax.annotation.Nullable
  public String getAuthTransactionId() {
    return authTransactionId;
  }


  public void setAuthTransactionId(String authTransactionId) {
    this.authTransactionId = authTransactionId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateClaimRequest createClaimRequest = (CreateClaimRequest) o;
    return Objects.equals(this.disputedAmount, createClaimRequest.disputedAmount) &&
        Objects.equals(this.disputedCurrency, createClaimRequest.disputedCurrency) &&
        Objects.equals(this.claimType, createClaimRequest.claimType) &&
        Objects.equals(this.clearingTransactionId, createClaimRequest.clearingTransactionId) &&
        Objects.equals(this.authTransactionId, createClaimRequest.authTransactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disputedAmount, disputedCurrency, claimType, clearingTransactionId, authTransactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateClaimRequest {\n");
    sb.append("    disputedAmount: ").append(toIndentedString(disputedAmount)).append("\n");
    sb.append("    disputedCurrency: ").append(toIndentedString(disputedCurrency)).append("\n");
    sb.append("    claimType: ").append(toIndentedString(claimType)).append("\n");
    sb.append("    clearingTransactionId: ").append(toIndentedString(clearingTransactionId)).append("\n");
    sb.append("    authTransactionId: ").append(toIndentedString(authTransactionId)).append("\n");
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
    openapiFields.add("disputedAmount");
    openapiFields.add("disputedCurrency");
    openapiFields.add("claimType");
    openapiFields.add("clearingTransactionId");
    openapiFields.add("authTransactionId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("disputedAmount");
    openapiRequiredFields.add("disputedCurrency");
    openapiRequiredFields.add("claimType");
    openapiRequiredFields.add("clearingTransactionId");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateClaimRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateClaimRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateClaimRequest is not found in the empty JSON string", CreateClaimRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateClaimRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateClaimRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateClaimRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("disputedAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `disputedAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("disputedAmount").toString()));
      }
      if (!jsonObj.get("disputedCurrency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `disputedCurrency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("disputedCurrency").toString()));
      }
      if (!jsonObj.get("claimType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `claimType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("claimType").toString()));
      }
      if (!jsonObj.get("clearingTransactionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clearingTransactionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clearingTransactionId").toString()));
      }
      if ((jsonObj.get("authTransactionId") != null && !jsonObj.get("authTransactionId").isJsonNull()) && !jsonObj.get("authTransactionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authTransactionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authTransactionId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateClaimRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateClaimRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateClaimRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateClaimRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateClaimRequest>() {
           @Override
           public void write(JsonWriter out, CreateClaimRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateClaimRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateClaimRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateClaimRequest
  * @throws IOException if the JSON string is invalid with respect to CreateClaimRequest
  */
  public static CreateClaimRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateClaimRequest.class);
  }

 /**
  * Convert an instance of CreateClaimRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
