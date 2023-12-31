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
import bp4.mastercom_api_client.model.CaseFilingStatusResponseStructure;
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
 * CaseFilingStatusResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-07T19:57:39.604201-03:00[America/Buenos_Aires]")
public class CaseFilingStatusResponse {
  public static final String SERIALIZED_NAME_CASE_FILING_RESPONSE_LIST = "caseFilingResponseList";
  @SerializedName(SERIALIZED_NAME_CASE_FILING_RESPONSE_LIST)
  private List<CaseFilingStatusResponseStructure> caseFilingResponseList;

  public CaseFilingStatusResponse() {
  }

  public CaseFilingStatusResponse caseFilingResponseList(List<CaseFilingStatusResponseStructure> caseFilingResponseList) {
    
    this.caseFilingResponseList = caseFilingResponseList;
    return this;
  }

  public CaseFilingStatusResponse addCaseFilingResponseListItem(CaseFilingStatusResponseStructure caseFilingResponseListItem) {
    if (this.caseFilingResponseList == null) {
      this.caseFilingResponseList = new ArrayList<>();
    }
    this.caseFilingResponseList.add(caseFilingResponseListItem);
    return this;
  }

   /**
   * A list of case filing statuses
   * @return caseFilingResponseList
  **/
  @javax.annotation.Nullable
  public List<CaseFilingStatusResponseStructure> getCaseFilingResponseList() {
    return caseFilingResponseList;
  }


  public void setCaseFilingResponseList(List<CaseFilingStatusResponseStructure> caseFilingResponseList) {
    this.caseFilingResponseList = caseFilingResponseList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseFilingStatusResponse caseFilingStatusResponse = (CaseFilingStatusResponse) o;
    return Objects.equals(this.caseFilingResponseList, caseFilingStatusResponse.caseFilingResponseList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caseFilingResponseList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseFilingStatusResponse {\n");
    sb.append("    caseFilingResponseList: ").append(toIndentedString(caseFilingResponseList)).append("\n");
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
    openapiFields.add("caseFilingResponseList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CaseFilingStatusResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CaseFilingStatusResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CaseFilingStatusResponse is not found in the empty JSON string", CaseFilingStatusResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CaseFilingStatusResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CaseFilingStatusResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("caseFilingResponseList") != null && !jsonObj.get("caseFilingResponseList").isJsonNull()) {
        JsonArray jsonArraycaseFilingResponseList = jsonObj.getAsJsonArray("caseFilingResponseList");
        if (jsonArraycaseFilingResponseList != null) {
          // ensure the json data is an array
          if (!jsonObj.get("caseFilingResponseList").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `caseFilingResponseList` to be an array in the JSON string but got `%s`", jsonObj.get("caseFilingResponseList").toString()));
          }

          // validate the optional field `caseFilingResponseList` (array)
          for (int i = 0; i < jsonArraycaseFilingResponseList.size(); i++) {
            CaseFilingStatusResponseStructure.validateJsonElement(jsonArraycaseFilingResponseList.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CaseFilingStatusResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CaseFilingStatusResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CaseFilingStatusResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CaseFilingStatusResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CaseFilingStatusResponse>() {
           @Override
           public void write(JsonWriter out, CaseFilingStatusResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CaseFilingStatusResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CaseFilingStatusResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CaseFilingStatusResponse
  * @throws IOException if the JSON string is invalid with respect to CaseFilingStatusResponse
  */
  public static CaseFilingStatusResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CaseFilingStatusResponse.class);
  }

 /**
  * Convert an instance of CaseFilingStatusResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

