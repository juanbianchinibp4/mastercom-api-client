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
 * ChargebackResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-07T19:57:39.604201-03:00[America/Buenos_Aires]")
public class ChargebackResponse {
  public static final String SERIALIZED_NAME_CHARGEBACK_ID = "chargebackId";
  @SerializedName(SERIALIZED_NAME_CHARGEBACK_ID)
  private String chargebackId;

  public ChargebackResponse() {
  }

  public ChargebackResponse chargebackId(String chargebackId) {
    
    this.chargebackId = chargebackId;
    return this;
  }

   /**
   * Identifier assigned to the Chargeback
   * @return chargebackId
  **/
  @javax.annotation.Nullable
  public String getChargebackId() {
    return chargebackId;
  }


  public void setChargebackId(String chargebackId) {
    this.chargebackId = chargebackId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargebackResponse chargebackResponse = (ChargebackResponse) o;
    return Objects.equals(this.chargebackId, chargebackResponse.chargebackId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargebackId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargebackResponse {\n");
    sb.append("    chargebackId: ").append(toIndentedString(chargebackId)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ChargebackResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChargebackResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChargebackResponse is not found in the empty JSON string", ChargebackResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ChargebackResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChargebackResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("chargebackId") != null && !jsonObj.get("chargebackId").isJsonNull()) && !jsonObj.get("chargebackId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chargebackId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chargebackId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChargebackResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChargebackResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChargebackResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChargebackResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ChargebackResponse>() {
           @Override
           public void write(JsonWriter out, ChargebackResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChargebackResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChargebackResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChargebackResponse
  * @throws IOException if the JSON string is invalid with respect to ChargebackResponse
  */
  public static ChargebackResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChargebackResponse.class);
  }

 /**
  * Convert an instance of ChargebackResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
