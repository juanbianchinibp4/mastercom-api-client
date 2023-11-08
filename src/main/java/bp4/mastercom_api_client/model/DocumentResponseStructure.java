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
import bp4.mastercom_api_client.model.DocumentStructureResp;
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
 * DocumentResponseStructure
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-07T19:57:39.604201-03:00[America/Buenos_Aires]")
public class DocumentResponseStructure {
  public static final String SERIALIZED_NAME_FILE_ATTACHMENT = "fileAttachment";
  @SerializedName(SERIALIZED_NAME_FILE_ATTACHMENT)
  private DocumentStructureResp fileAttachment;

  public DocumentResponseStructure() {
  }

  public DocumentResponseStructure fileAttachment(DocumentStructureResp fileAttachment) {
    
    this.fileAttachment = fileAttachment;
    return this;
  }

   /**
   * Get fileAttachment
   * @return fileAttachment
  **/
  @javax.annotation.Nullable
  public DocumentStructureResp getFileAttachment() {
    return fileAttachment;
  }


  public void setFileAttachment(DocumentStructureResp fileAttachment) {
    this.fileAttachment = fileAttachment;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentResponseStructure documentResponseStructure = (DocumentResponseStructure) o;
    return Objects.equals(this.fileAttachment, documentResponseStructure.fileAttachment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileAttachment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentResponseStructure {\n");
    sb.append("    fileAttachment: ").append(toIndentedString(fileAttachment)).append("\n");
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
    openapiFields.add("fileAttachment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DocumentResponseStructure
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DocumentResponseStructure.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentResponseStructure is not found in the empty JSON string", DocumentResponseStructure.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DocumentResponseStructure.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DocumentResponseStructure` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `fileAttachment`
      if (jsonObj.get("fileAttachment") != null && !jsonObj.get("fileAttachment").isJsonNull()) {
        DocumentStructureResp.validateJsonElement(jsonObj.get("fileAttachment"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentResponseStructure.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentResponseStructure' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentResponseStructure> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentResponseStructure.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentResponseStructure>() {
           @Override
           public void write(JsonWriter out, DocumentResponseStructure value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DocumentResponseStructure read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DocumentResponseStructure given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DocumentResponseStructure
  * @throws IOException if the JSON string is invalid with respect to DocumentResponseStructure
  */
  public static DocumentResponseStructure fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentResponseStructure.class);
  }

 /**
  * Convert an instance of DocumentResponseStructure to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

