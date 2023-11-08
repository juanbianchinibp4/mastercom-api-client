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
import bp4.mastercom_api_client.model.RetrievalStatusResponseStructure;
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
 * RetrievalStatusResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-07T19:57:39.604201-03:00[America/Buenos_Aires]")
public class RetrievalStatusResponse {
  public static final String SERIALIZED_NAME_RETRIEVAL_RESPONSE_LIST = "retrievalResponseList";
  @SerializedName(SERIALIZED_NAME_RETRIEVAL_RESPONSE_LIST)
  private List<RetrievalStatusResponseStructure> retrievalResponseList;

  public RetrievalStatusResponse() {
  }

  public RetrievalStatusResponse retrievalResponseList(List<RetrievalStatusResponseStructure> retrievalResponseList) {
    
    this.retrievalResponseList = retrievalResponseList;
    return this;
  }

  public RetrievalStatusResponse addRetrievalResponseListItem(RetrievalStatusResponseStructure retrievalResponseListItem) {
    if (this.retrievalResponseList == null) {
      this.retrievalResponseList = new ArrayList<>();
    }
    this.retrievalResponseList.add(retrievalResponseListItem);
    return this;
  }

   /**
   * A list of retrieval image statuses
   * @return retrievalResponseList
  **/
  @javax.annotation.Nullable
  public List<RetrievalStatusResponseStructure> getRetrievalResponseList() {
    return retrievalResponseList;
  }


  public void setRetrievalResponseList(List<RetrievalStatusResponseStructure> retrievalResponseList) {
    this.retrievalResponseList = retrievalResponseList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrievalStatusResponse retrievalStatusResponse = (RetrievalStatusResponse) o;
    return Objects.equals(this.retrievalResponseList, retrievalStatusResponse.retrievalResponseList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retrievalResponseList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrievalStatusResponse {\n");
    sb.append("    retrievalResponseList: ").append(toIndentedString(retrievalResponseList)).append("\n");
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
    openapiFields.add("retrievalResponseList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RetrievalStatusResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RetrievalStatusResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RetrievalStatusResponse is not found in the empty JSON string", RetrievalStatusResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RetrievalStatusResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RetrievalStatusResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("retrievalResponseList") != null && !jsonObj.get("retrievalResponseList").isJsonNull()) {
        JsonArray jsonArrayretrievalResponseList = jsonObj.getAsJsonArray("retrievalResponseList");
        if (jsonArrayretrievalResponseList != null) {
          // ensure the json data is an array
          if (!jsonObj.get("retrievalResponseList").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `retrievalResponseList` to be an array in the JSON string but got `%s`", jsonObj.get("retrievalResponseList").toString()));
          }

          // validate the optional field `retrievalResponseList` (array)
          for (int i = 0; i < jsonArrayretrievalResponseList.size(); i++) {
            RetrievalStatusResponseStructure.validateJsonElement(jsonArrayretrievalResponseList.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RetrievalStatusResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RetrievalStatusResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RetrievalStatusResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RetrievalStatusResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<RetrievalStatusResponse>() {
           @Override
           public void write(JsonWriter out, RetrievalStatusResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RetrievalStatusResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RetrievalStatusResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RetrievalStatusResponse
  * @throws IOException if the JSON string is invalid with respect to RetrievalStatusResponse
  */
  public static RetrievalStatusResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RetrievalStatusResponse.class);
  }

 /**
  * Convert an instance of RetrievalStatusResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

