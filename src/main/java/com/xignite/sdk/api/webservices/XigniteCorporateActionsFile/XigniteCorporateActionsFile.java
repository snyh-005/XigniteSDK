package com.xignite.sdk.api.webservices.XigniteCorporateActionsFile;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xignite.sdk.api.ApiBase;
import com.xignite.sdk.api.webservices.XigniteCorporateActionsFile.Models.CorporateActionsFile;
import com.xignite.sdk.exceptions.XigniteApiException;
import com.xignite.sdk.utilities.RestClient;
import java.util.LinkedHashMap;

public class XigniteCorporateActionsFile extends ApiBase {
   public XigniteCorporateActionsFile(String apiToken) {
      this.apiToken = apiToken;
      this.endPointUrl = "http://cloudfiles.xignite.com/xCorporateActionsFile.json";
   }

   public CorporateActionsFile getFile(String date, String region, String version) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Date", String.valueOf(date));
         params.put("Region", String.valueOf(region));
         params.put("Version", String.valueOf(version));
         String json = RestClient.get(this.endPointUrl + "/GetFile", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CorporateActionsFile)mapper.readValue(json, CorporateActionsFile.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public CorporateActionsFile getFileHTTP(String date, String region, String version) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Date", String.valueOf(date));
         params.put("Region", String.valueOf(region));
         params.put("Version", String.valueOf(version));
         String json = RestClient.get(this.endPointUrl + "/GetFile", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CorporateActionsFile)mapper.readValue(json, CorporateActionsFile.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }
}
