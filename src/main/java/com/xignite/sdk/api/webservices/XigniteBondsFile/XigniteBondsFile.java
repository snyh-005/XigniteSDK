package com.xignite.sdk.api.webservices.XigniteBondsFile;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xignite.sdk.api.ApiBase;
import com.xignite.sdk.api.webservices.XigniteBondsFile.Models.BondsFile;
import com.xignite.sdk.exceptions.XigniteApiException;
import com.xignite.sdk.utilities.RestClient;
import java.util.LinkedHashMap;

public class XigniteBondsFile extends ApiBase {
   public XigniteBondsFile(String apiToken) {
      this.apiToken = apiToken;
      this.endPointUrl = "http://cloudfiles.xignite.com/xBondsFile.json";
   }

   public BondsFile getFile(String date, String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Date", String.valueOf(date));
         params.put("Exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/GetFile", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (BondsFile)mapper.readValue(json, BondsFile.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public BondsFile getFileHTTP(String date, String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Date", String.valueOf(date));
         params.put("Exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/GetFile", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (BondsFile)mapper.readValue(json, BondsFile.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }
}
