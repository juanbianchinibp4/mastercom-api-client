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
 * RetrievalsImageStatusRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-07T19:57:39.604201-03:00[America/Buenos_Aires]")
public class RetrievalsImageStatusRequest {
  /**
   * Status of fulfillment image to query.   Length: 6-18   Valid Values/Format: COMPLETED, FAILED, PENDING, UNAVAILABLE AND DOC_NOT_APPLICABLE.   COMPLETED: Image was processed and no further action required.   FAILED: Some failure happened during image process flow, i.e,The image could not be converted, The image is not imported, Image extension not supported etc.   PENDING: The image is pending to be processed.   DOC_NOT_APPLICABLE: The dispute does not require a document.   UNAVAILABLE: The image is unavailable because it is not picked up by mastercom internal processes yet.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    COMPLETED("COMPLETED"),
    
    FAILED("FAILED"),
    
    PENDING("PENDING"),
    
    UNAVAILABLE("UNAVAILABLE"),
    
    DOC_NOT_APPLICABLE("DOC_NOT_APPLICABLE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public RetrievalsImageStatusRequest() {
  }

  public RetrievalsImageStatusRequest status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status of fulfillment image to query.   Length: 6-18   Valid Values/Format: COMPLETED, FAILED, PENDING, UNAVAILABLE AND DOC_NOT_APPLICABLE.   COMPLETED: Image was processed and no further action required.   FAILED: Some failure happened during image process flow, i.e,The image could not be converted, The image is not imported, Image extension not supported etc.   PENDING: The image is pending to be processed.   DOC_NOT_APPLICABLE: The dispute does not require a document.   UNAVAILABLE: The image is unavailable because it is not picked up by mastercom internal processes yet.
   * @return status
  **/
  @javax.annotation.Nonnull
  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public RetrievalsImageStatusRequest startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Start Date.   Length: 10   Valid Values/Format: Date (yyyy-MM-dd)
   * @return startDate
  **/
  @javax.annotation.Nonnull
  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public RetrievalsImageStatusRequest endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * End Date.   Length: 10   Valid Values/Format: Date (yyyy-MM-dd)
   * @return endDate
  **/
  @javax.annotation.Nonnull
  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrievalsImageStatusRequest retrievalsImageStatusRequest = (RetrievalsImageStatusRequest) o;
    return Objects.equals(this.status, retrievalsImageStatusRequest.status) &&
        Objects.equals(this.startDate, retrievalsImageStatusRequest.startDate) &&
        Objects.equals(this.endDate, retrievalsImageStatusRequest.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrievalsImageStatusRequest {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("startDate");
    openapiFields.add("endDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("startDate");
    openapiRequiredFields.add("endDate");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RetrievalsImageStatusRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RetrievalsImageStatusRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RetrievalsImageStatusRequest is not found in the empty JSON string", RetrievalsImageStatusRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RetrievalsImageStatusRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RetrievalsImageStatusRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RetrievalsImageStatusRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (!jsonObj.get("startDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startDate").toString()));
      }
      if (!jsonObj.get("endDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endDate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RetrievalsImageStatusRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RetrievalsImageStatusRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RetrievalsImageStatusRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RetrievalsImageStatusRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<RetrievalsImageStatusRequest>() {
           @Override
           public void write(JsonWriter out, RetrievalsImageStatusRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RetrievalsImageStatusRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RetrievalsImageStatusRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RetrievalsImageStatusRequest
  * @throws IOException if the JSON string is invalid with respect to RetrievalsImageStatusRequest
  */
  public static RetrievalsImageStatusRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RetrievalsImageStatusRequest.class);
  }

 /**
  * Convert an instance of RetrievalsImageStatusRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

