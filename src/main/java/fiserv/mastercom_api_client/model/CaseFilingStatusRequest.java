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
import com.google.gson.JsonArray;
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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * CaseFilingStatusRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-07T19:57:39.604201-03:00[America/Buenos_Aires]")
public class CaseFilingStatusRequest {
  public static final String SERIALIZED_NAME_CASE_FILING_LIST = "caseFilingList";
  @SerializedName(SERIALIZED_NAME_CASE_FILING_LIST)
  private List<CaseFilingStatusRequestStructure> caseFilingList = new ArrayList<>();

  public CaseFilingStatusRequest() {
  }

  public CaseFilingStatusRequest caseFilingList(List<CaseFilingStatusRequestStructure> caseFilingList) {
    
    this.caseFilingList = caseFilingList;
    return this;
  }

  public CaseFilingStatusRequest addCaseFilingListItem(CaseFilingStatusRequestStructure caseFilingListItem) {
    if (this.caseFilingList == null) {
      this.caseFilingList = new ArrayList<>();
    }
    this.caseFilingList.add(caseFilingListItem);
    return this;
  }

   /**
   * A list of case filing ids to query, maximum list size is 2000
   * @return caseFilingList
  **/
  @javax.annotation.Nonnull
  public List<CaseFilingStatusRequestStructure> getCaseFilingList() {
    return caseFilingList;
  }


  public void setCaseFilingList(List<CaseFilingStatusRequestStructure> caseFilingList) {
    this.caseFilingList = caseFilingList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseFilingStatusRequest caseFilingStatusRequest = (CaseFilingStatusRequest) o;
    return Objects.equals(this.caseFilingList, caseFilingStatusRequest.caseFilingList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caseFilingList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseFilingStatusRequest {\n");
    sb.append("    caseFilingList: ").append(toIndentedString(caseFilingList)).append("\n");
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
    openapiFields.add("caseFilingList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("caseFilingList");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CaseFilingStatusRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CaseFilingStatusRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CaseFilingStatusRequest is not found in the empty JSON string", CaseFilingStatusRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CaseFilingStatusRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CaseFilingStatusRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CaseFilingStatusRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("caseFilingList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `caseFilingList` to be an array in the JSON string but got `%s`", jsonObj.get("caseFilingList").toString()));
      }

      JsonArray jsonArraycaseFilingList = jsonObj.getAsJsonArray("caseFilingList");
      // validate the required field `caseFilingList` (array)
      for (int i = 0; i < jsonArraycaseFilingList.size(); i++) {
        CaseFilingStatusRequestStructure.validateJsonElement(jsonArraycaseFilingList.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CaseFilingStatusRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CaseFilingStatusRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CaseFilingStatusRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CaseFilingStatusRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CaseFilingStatusRequest>() {
           @Override
           public void write(JsonWriter out, CaseFilingStatusRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CaseFilingStatusRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CaseFilingStatusRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CaseFilingStatusRequest
  * @throws IOException if the JSON string is invalid with respect to CaseFilingStatusRequest
  */
  public static CaseFilingStatusRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CaseFilingStatusRequest.class);
  }

 /**
  * Convert an instance of CaseFilingStatusRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
