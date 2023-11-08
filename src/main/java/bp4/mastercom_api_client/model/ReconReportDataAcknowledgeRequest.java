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
import bp4.mastercom_api_client.model.Cycle;
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
 * ReconReportDataAcknowledgeRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-07T19:57:39.604201-03:00[America/Buenos_Aires]")
public class ReconReportDataAcknowledgeRequest {
  public static final String SERIALIZED_NAME_ICA = "ica";
  @SerializedName(SERIALIZED_NAME_ICA)
  private List<String> ica;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_CYCLES = "cycles";
  @SerializedName(SERIALIZED_NAME_CYCLES)
  private List<Cycle> cycles;

  public static final String SERIALIZED_NAME_ENHANCED_RECONCILIATION_REPORT_FLAG = "enhancedReconciliationReportFlag";
  @SerializedName(SERIALIZED_NAME_ENHANCED_RECONCILIATION_REPORT_FLAG)
  private Boolean enhancedReconciliationReportFlag;

  public ReconReportDataAcknowledgeRequest() {
  }

  public ReconReportDataAcknowledgeRequest ica(List<String> ica) {
    
    this.ica = ica;
    return this;
  }

  public ReconReportDataAcknowledgeRequest addIcaItem(String icaItem) {
    if (this.ica == null) {
      this.ica = new ArrayList<>();
    }
    this.ica.add(icaItem);
    return this;
  }

   /**
   * Interbank Card Association number used to identify the member in transaction.   Length: 1-11   Valid Values/Format: Numeric
   * @return ica
  **/
  @javax.annotation.Nullable
  public List<String> getIca() {
    return ica;
  }


  public void setIca(List<String> ica) {
    this.ica = ica;
  }


  public ReconReportDataAcknowledgeRequest startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Start date for the reconciliation report.   Length: 10   Valid Values/Format: Date (yyyy-MM-dd)
   * @return startDate
  **/
  @javax.annotation.Nonnull
  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public ReconReportDataAcknowledgeRequest endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * End date for the reconciliation report.   Length: 10   Valid Values/Format: Date (yyyy-MM-dd)
   * @return endDate
  **/
  @javax.annotation.Nonnull
  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public ReconReportDataAcknowledgeRequest cycles(List<Cycle> cycles) {
    
    this.cycles = cycles;
    return this;
  }

  public ReconReportDataAcknowledgeRequest addCyclesItem(Cycle cyclesItem) {
    if (this.cycles == null) {
      this.cycles = new ArrayList<>();
    }
    this.cycles.add(cyclesItem);
    return this;
  }

   /**
   * It represents the cycle(s) where the clearing data was exchanged.   Length: 1   Valid Values/Format: 1, 2, 3, 4, 5, 6, 7
   * @return cycles
  **/
  @javax.annotation.Nullable
  public List<Cycle> getCycles() {
    return cycles;
  }


  public void setCycles(List<Cycle> cycles) {
    this.cycles = cycles;
  }


  public ReconReportDataAcknowledgeRequest enhancedReconciliationReportFlag(Boolean enhancedReconciliationReportFlag) {
    
    this.enhancedReconciliationReportFlag = enhancedReconciliationReportFlag;
    return this;
  }

   /**
   * It is set to \&quot;true\&quot; because the enhanced reconciliation report is available.   Length: 4-5   Valid Values/Format: true / false
   * @return enhancedReconciliationReportFlag
  **/
  @javax.annotation.Nullable
  public Boolean getEnhancedReconciliationReportFlag() {
    return enhancedReconciliationReportFlag;
  }


  public void setEnhancedReconciliationReportFlag(Boolean enhancedReconciliationReportFlag) {
    this.enhancedReconciliationReportFlag = enhancedReconciliationReportFlag;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReconReportDataAcknowledgeRequest reconReportDataAcknowledgeRequest = (ReconReportDataAcknowledgeRequest) o;
    return Objects.equals(this.ica, reconReportDataAcknowledgeRequest.ica) &&
        Objects.equals(this.startDate, reconReportDataAcknowledgeRequest.startDate) &&
        Objects.equals(this.endDate, reconReportDataAcknowledgeRequest.endDate) &&
        Objects.equals(this.cycles, reconReportDataAcknowledgeRequest.cycles) &&
        Objects.equals(this.enhancedReconciliationReportFlag, reconReportDataAcknowledgeRequest.enhancedReconciliationReportFlag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ica, startDate, endDate, cycles, enhancedReconciliationReportFlag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReconReportDataAcknowledgeRequest {\n");
    sb.append("    ica: ").append(toIndentedString(ica)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    cycles: ").append(toIndentedString(cycles)).append("\n");
    sb.append("    enhancedReconciliationReportFlag: ").append(toIndentedString(enhancedReconciliationReportFlag)).append("\n");
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
    openapiFields.add("ica");
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("cycles");
    openapiFields.add("enhancedReconciliationReportFlag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("startDate");
    openapiRequiredFields.add("endDate");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ReconReportDataAcknowledgeRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReconReportDataAcknowledgeRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReconReportDataAcknowledgeRequest is not found in the empty JSON string", ReconReportDataAcknowledgeRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReconReportDataAcknowledgeRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReconReportDataAcknowledgeRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReconReportDataAcknowledgeRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("ica") != null && !jsonObj.get("ica").isJsonNull() && !jsonObj.get("ica").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ica` to be an array in the JSON string but got `%s`", jsonObj.get("ica").toString()));
      }
      if (!jsonObj.get("startDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startDate").toString()));
      }
      if (!jsonObj.get("endDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endDate").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("cycles") != null && !jsonObj.get("cycles").isJsonNull() && !jsonObj.get("cycles").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cycles` to be an array in the JSON string but got `%s`", jsonObj.get("cycles").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReconReportDataAcknowledgeRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReconReportDataAcknowledgeRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReconReportDataAcknowledgeRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReconReportDataAcknowledgeRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ReconReportDataAcknowledgeRequest>() {
           @Override
           public void write(JsonWriter out, ReconReportDataAcknowledgeRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReconReportDataAcknowledgeRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReconReportDataAcknowledgeRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReconReportDataAcknowledgeRequest
  * @throws IOException if the JSON string is invalid with respect to ReconReportDataAcknowledgeRequest
  */
  public static ReconReportDataAcknowledgeRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReconReportDataAcknowledgeRequest.class);
  }

 /**
  * Convert an instance of ReconReportDataAcknowledgeRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

