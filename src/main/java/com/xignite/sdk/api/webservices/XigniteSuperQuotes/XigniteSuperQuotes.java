package com.xignite.sdk.api.webservices.XigniteSuperQuotes;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xignite.sdk.api.ApiBase;
import com.xignite.sdk.api.webservices.XigniteSuperQuotes.Models.ChartBarsSet;
import com.xignite.sdk.api.webservices.XigniteSuperQuotes.Models.IdentifierTypes;
import com.xignite.sdk.api.webservices.XigniteSuperQuotes.Models.Quote;
import com.xignite.sdk.exceptions.XigniteApiException;
import com.xignite.sdk.utilities.RestClient;
import java.util.LinkedHashMap;

public class XigniteSuperQuotes extends ApiBase {
   public XigniteSuperQuotes(String apiToken) {
      this.apiToken = apiToken;
      this.endPointUrl = "http://superquotes.xignite.com/xSuperQuotes.json";
   }

   public Quote getQuote(String identifier, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetQuote", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Quote)mapper.readValue(json, Quote.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public Quote getQuoteHTTP(String identifier, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetQuote", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Quote)mapper.readValue(json, Quote.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public Quote[] getQuotes(String identifiers, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetQuotes", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Quote[])mapper.readValue(json, Quote[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public Quote[] getQuotesHTTP(String identifiers, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetQuotes", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Quote[])mapper.readValue(json, Quote[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public ChartBarsSet getChartBars(String identifier, IdentifierTypes identifierType, String startTime, String endTime, String precision, int period, String adjustmentMethod, boolean includeExtended) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("StartTime", String.valueOf(startTime));
         params.put("EndTime", String.valueOf(endTime));
         params.put("Precision", String.valueOf(precision));
         params.put("Period", String.valueOf(period));
         params.put("AdjustmentMethod", String.valueOf(adjustmentMethod));
         params.put("IncludeExtended", String.valueOf(includeExtended));
         String json = RestClient.get(this.endPointUrl + "/GetChartBars", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ChartBarsSet)mapper.readValue(json, ChartBarsSet.class);
      } catch (Exception var12) {
         throw new XigniteApiException(var12.getMessage());
      }
   }

   public ChartBarsSet getChartBarsHTTP(String identifier, IdentifierTypes identifierType, String startTime, String endTime, String precision, int period, String adjustmentMethod, boolean includeExtended) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("StartTime", String.valueOf(startTime));
         params.put("EndTime", String.valueOf(endTime));
         params.put("Precision", String.valueOf(precision));
         params.put("Period", String.valueOf(period));
         params.put("AdjustmentMethod", String.valueOf(adjustmentMethod));
         params.put("IncludeExtended", String.valueOf(includeExtended));
         String json = RestClient.get(this.endPointUrl + "/GetChartBars", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ChartBarsSet)mapper.readValue(json, ChartBarsSet.class);
      } catch (Exception var12) {
         throw new XigniteApiException(var12.getMessage());
      }
   }
}
