package com.xignite.sdk.api.webservices.XigniteGlobalOptionsFile;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xignite.sdk.api.ApiBase;
import com.xignite.sdk.api.webservices.XigniteGlobalOptionsFile.Models.GlobalOptionsFile;
import com.xignite.sdk.api.webservices.XigniteGlobalOptionsFile.Models.OptionsType;
import com.xignite.sdk.exceptions.XigniteApiException;
import com.xignite.sdk.utilities.RestClient;
import java.util.LinkedHashMap;

public class XigniteGlobalOptionsFile extends ApiBase {
   public XigniteGlobalOptionsFile(String apiToken) {
      this.apiToken = apiToken;
      this.endPointUrl = "http://cloudfiles.xignite.com/xGlobalOptionsFile.json";
   }

   public GlobalOptionsFile getFile(String date, String exchange, OptionsType type) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Date", String.valueOf(date));
         params.put("Exchange", String.valueOf(exchange));
         params.put("Type", String.valueOf(type));
         String json = RestClient.get(this.endPointUrl + "/GetFile", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalOptionsFile)mapper.readValue(json, GlobalOptionsFile.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public GlobalOptionsFile getFileHTTP(String date, String exchange, OptionsType type) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Date", String.valueOf(date));
         params.put("Exchange", String.valueOf(exchange));
         params.put("Type", String.valueOf(type));
         String json = RestClient.get(this.endPointUrl + "/GetFile", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalOptionsFile)mapper.readValue(json, GlobalOptionsFile.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }
}
