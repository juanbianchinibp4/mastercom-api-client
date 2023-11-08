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
 * CreateChargebackSingleReversalRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-07T19:57:39.604201-03:00[America/Buenos_Aires]")
public class CreateChargebackSingleReversalRequest {
  public static final String SERIALIZED_NAME_REPLACEMENT_AMOUNT = "replacementAmount";
  @SerializedName(SERIALIZED_NAME_REPLACEMENT_AMOUNT)
  private String replacementAmount;

  /**
   * Dispute reason code for reversing the chargeback item.   Length: 2   Valid Values/Format: 03 / 82
   */
  @JsonAdapter(ReversalReasonCodeEnum.Adapter.class)
  public enum ReversalReasonCodeEnum {
    _03("03"),
    
    _82("82");

    private String value;

    ReversalReasonCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReversalReasonCodeEnum fromValue(String value) {
      for (ReversalReasonCodeEnum b : ReversalReasonCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ReversalReasonCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReversalReasonCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReversalReasonCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ReversalReasonCodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REVERSAL_REASON_CODE = "reversalReasonCode";
  @SerializedName(SERIALIZED_NAME_REVERSAL_REASON_CODE)
  private ReversalReasonCodeEnum reversalReasonCode;

  public static final String SERIALIZED_NAME_CONTROL_NUMBER = "controlNumber";
  @SerializedName(SERIALIZED_NAME_CONTROL_NUMBER)
  private String controlNumber;

  public CreateChargebackSingleReversalRequest() {
  }

  public CreateChargebackSingleReversalRequest replacementAmount(String replacementAmount) {
    
    this.replacementAmount = replacementAmount;
    return this;
  }

   /**
   * Replacement Amount.  The replacement amount should reflect the final amount of the transaction value that should remain applied to the cardholder balance.   Length: 3-12   Valid Values/Format: Numeric
   * @return replacementAmount
  **/
  @javax.annotation.Nonnull
  public String getReplacementAmount() {
    return replacementAmount;
  }


  public void setReplacementAmount(String replacementAmount) {
    this.replacementAmount = replacementAmount;
  }


  public CreateChargebackSingleReversalRequest reversalReasonCode(ReversalReasonCodeEnum reversalReasonCode) {
    
    this.reversalReasonCode = reversalReasonCode;
    return this;
  }

   /**
   * Dispute reason code for reversing the chargeback item.   Length: 2   Valid Values/Format: 03 / 82
   * @return reversalReasonCode
  **/
  @javax.annotation.Nonnull
  public ReversalReasonCodeEnum getReversalReasonCode() {
    return reversalReasonCode;
  }


  public void setReversalReasonCode(ReversalReasonCodeEnum reversalReasonCode) {
    this.reversalReasonCode = reversalReasonCode;
  }


  public CreateChargebackSingleReversalRequest controlNumber(String controlNumber) {
    
    this.controlNumber = controlNumber;
    return this;
  }

   /**
   * Control Number.  Discretionary data input field used by issuers, acquirers, and  Mastercard.   Length: 1-5   Valid Values/Format: Numeric
   * @return controlNumber
  **/
  @javax.annotation.Nullable
  public String getControlNumber() {
    return controlNumber;
  }


  public void setControlNumber(String controlNumber) {
    this.controlNumber = controlNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateChargebackSingleReversalRequest createChargebackSingleReversalRequest = (CreateChargebackSingleReversalRequest) o;
    return Objects.equals(this.replacementAmount, createChargebackSingleReversalRequest.replacementAmount) &&
        Objects.equals(this.reversalReasonCode, createChargebackSingleReversalRequest.reversalReasonCode) &&
        Objects.equals(this.controlNumber, createChargebackSingleReversalRequest.controlNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replacementAmount, reversalReasonCode, controlNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChargebackSingleReversalRequest {\n");
    sb.append("    replacementAmount: ").append(toIndentedString(replacementAmount)).append("\n");
    sb.append("    reversalReasonCode: ").append(toIndentedString(reversalReasonCode)).append("\n");
    sb.append("    controlNumber: ").append(toIndentedString(controlNumber)).append("\n");
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
    openapiFields.add("replacementAmount");
    openapiFields.add("reversalReasonCode");
    openapiFields.add("controlNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("replacementAmount");
    openapiRequiredFields.add("reversalReasonCode");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateChargebackSingleReversalRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateChargebackSingleReversalRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateChargebackSingleReversalRequest is not found in the empty JSON string", CreateChargebackSingleReversalRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateChargebackSingleReversalRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateChargebackSingleReversalRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateChargebackSingleReversalRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("replacementAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `replacementAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("replacementAmount").toString()));
      }
      if (!jsonObj.get("reversalReasonCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reversalReasonCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reversalReasonCode").toString()));
      }
      if ((jsonObj.get("controlNumber") != null && !jsonObj.get("controlNumber").isJsonNull()) && !jsonObj.get("controlNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `controlNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("controlNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateChargebackSingleReversalRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateChargebackSingleReversalRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateChargebackSingleReversalRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateChargebackSingleReversalRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateChargebackSingleReversalRequest>() {
           @Override
           public void write(JsonWriter out, CreateChargebackSingleReversalRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateChargebackSingleReversalRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateChargebackSingleReversalRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateChargebackSingleReversalRequest
  * @throws IOException if the JSON string is invalid with respect to CreateChargebackSingleReversalRequest
  */
  public static CreateChargebackSingleReversalRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateChargebackSingleReversalRequest.class);
  }

 /**
  * Convert an instance of CreateChargebackSingleReversalRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
