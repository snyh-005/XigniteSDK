package com.xignite.sdk.api.webservices.XigniteLogos;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xignite.sdk.api.ApiBase;
import com.xignite.sdk.api.webservices.XigniteLogos.Models.ExchangeList;
import com.xignite.sdk.api.webservices.XigniteLogos.Models.LogosByExchange;
import com.xignite.sdk.api.webservices.XigniteLogos.Models.LogosResult;
import com.xignite.sdk.api.webservices.XigniteLogos.Models.SymbolList;
import com.xignite.sdk.exceptions.XigniteApiException;
import com.xignite.sdk.utilities.RestClient;
import java.util.LinkedHashMap;

public class XigniteLogos extends ApiBase {
   public XigniteLogos(String apiToken) {
      this.apiToken = apiToken;
      this.endPointUrl = "http://logos.xignite.com/xLogos.json";
   }

   public ExchangeList listExchanges() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListExchanges", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeList)mapper.readValue(json, ExchangeList.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public ExchangeList listExchangesHTTP() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListExchanges", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeList)mapper.readValue(json, ExchangeList.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public SymbolList listSymbols(String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/ListSymbols", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SymbolList)mapper.readValue(json, SymbolList.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public SymbolList listSymbolsHTTP(String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/ListSymbols", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SymbolList)mapper.readValue(json, SymbolList.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public LogosResult[] getLogos(String identifierType, String identifiers, String identifierAsOfDate, String scale) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("Scale", String.valueOf(scale));
         String json = RestClient.get(this.endPointUrl + "/GetLogos", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (LogosResult[])mapper.readValue(json, LogosResult[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public LogosResult[] getLogosHTTP(String identifierType, String identifiers, String identifierAsOfDate, String scale) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("Scale", String.valueOf(scale));
         String json = RestClient.get(this.endPointUrl + "/GetLogos", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (LogosResult[])mapper.readValue(json, LogosResult[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public LogosByExchange getLogosByExchange(String exchange, String updatedSince, String pageSize, String nextPage) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         params.put("PageSize", String.valueOf(pageSize));
         params.put("NextPage", String.valueOf(nextPage));
         String json = RestClient.get(this.endPointUrl + "/GetLogosByExchange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (LogosByExchange)mapper.readValue(json, LogosByExchange.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public LogosByExchange getLogosByExchangeHTTP(String exchange, String updatedSince, String pageSize, String nextPage) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         params.put("PageSize", String.valueOf(pageSize));
         params.put("NextPage", String.valueOf(nextPage));
         String json = RestClient.get(this.endPointUrl + "/GetLogosByExchange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (LogosByExchange)mapper.readValue(json, LogosByExchange.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }
}
