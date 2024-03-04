package com.xignite.sdk.api.webservices.XigniteGlobalCurrenciesFile;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xignite.sdk.api.ApiBase;
import com.xignite.sdk.api.webservices.XigniteGlobalCurrenciesFile.Models.CurrenciesUniverse;
import com.xignite.sdk.api.webservices.XigniteGlobalCurrenciesFile.Models.GlobalCurrenciesFile;
import com.xignite.sdk.exceptions.XigniteApiException;
import com.xignite.sdk.utilities.RestClient;
import java.util.LinkedHashMap;

public class XigniteGlobalCurrenciesFile extends ApiBase {
   public XigniteGlobalCurrenciesFile(String apiToken) {
      this.apiToken = apiToken;
      this.endPointUrl = "http://cloudfiles.xignite.com/xGlobalCurrenciesFile.json";
   }

   public GlobalCurrenciesFile getFile(String date, CurrenciesUniverse universe) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Date", String.valueOf(date));
         params.put("Universe", String.valueOf(universe));
         String json = RestClient.get(this.endPointUrl + "/GetFile", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalCurrenciesFile)mapper.readValue(json, GlobalCurrenciesFile.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public GlobalCurrenciesFile getFileHTTP(String date, CurrenciesUniverse universe) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Date", String.valueOf(date));
         params.put("Universe", String.valueOf(universe));
         String json = RestClient.get(this.endPointUrl + "/GetFile", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalCurrenciesFile)mapper.readValue(json, GlobalCurrenciesFile.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }
}
