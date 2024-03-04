package com.xignite.sdk.api.webservices.XigniteGlobalESG;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xignite.sdk.api.ApiBase;
import com.xignite.sdk.api.webservices.XigniteGlobalESG.Models.CategoryList;
import com.xignite.sdk.api.webservices.XigniteGlobalESG.Models.ESGCategories;
import com.xignite.sdk.api.webservices.XigniteGlobalESG.Models.ESGScores;
import com.xignite.sdk.api.webservices.XigniteGlobalESG.Models.Emissions;
import com.xignite.sdk.api.webservices.XigniteGlobalESG.Models.ExchangeList;
import com.xignite.sdk.api.webservices.XigniteGlobalESG.Models.GlobalCompactScores;
import com.xignite.sdk.api.webservices.XigniteGlobalESG.Models.HistoricalESGCategoriesRange;
import com.xignite.sdk.api.webservices.XigniteGlobalESG.Models.HistoricalESGScoresRange;
import com.xignite.sdk.api.webservices.XigniteGlobalESG.Models.HistoricalGlobalCompactScoresRange;
import com.xignite.sdk.api.webservices.XigniteGlobalESG.Models.InvolvementList;
import com.xignite.sdk.api.webservices.XigniteGlobalESG.Models.Involvements;
import com.xignite.sdk.api.webservices.XigniteGlobalESG.Models.ScreenByInvolvementsResult;
import com.xignite.sdk.api.webservices.XigniteGlobalESG.Models.SymbolList;
import com.xignite.sdk.api.webservices.XigniteGlobalESG.Models.TemperatureScores;
import com.xignite.sdk.exceptions.XigniteApiException;
import com.xignite.sdk.utilities.RestClient;
import java.util.LinkedHashMap;

public class XigniteGlobalESG extends ApiBase {
   public XigniteGlobalESG(String apiToken) {
      this.apiToken = apiToken;
      this.endPointUrl = "http://globalesg.xignite.com/xGlobalESG.json";
   }

   public CategoryList listCategories() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListCategories", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CategoryList)mapper.readValue(json, CategoryList.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public CategoryList listCategoriesHTTP() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListCategories", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CategoryList)mapper.readValue(json, CategoryList.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public ExchangeList listExchanges(String region) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Region", String.valueOf(region));
         String json = RestClient.get(this.endPointUrl + "/ListExchanges", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeList)mapper.readValue(json, ExchangeList.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public ExchangeList listExchangesHTTP(String region) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Region", String.valueOf(region));
         String json = RestClient.get(this.endPointUrl + "/ListExchanges", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeList)mapper.readValue(json, ExchangeList.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public InvolvementList listInvolvements() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListInvolvements", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (InvolvementList)mapper.readValue(json, InvolvementList.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public InvolvementList listInvolvementsHTTP() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListInvolvements", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (InvolvementList)mapper.readValue(json, InvolvementList.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public SymbolList listSymbols(String exchange, String dataPackage) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("DataPackage", String.valueOf(dataPackage));
         String json = RestClient.get(this.endPointUrl + "/ListSymbols", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SymbolList)mapper.readValue(json, SymbolList.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public SymbolList listSymbolsHTTP(String exchange, String dataPackage) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("DataPackage", String.valueOf(dataPackage));
         String json = RestClient.get(this.endPointUrl + "/ListSymbols", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SymbolList)mapper.readValue(json, SymbolList.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public ESGCategories[] getESGCategories(String identifierType, String identifiers, String identifierAsOfDate, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetESGCategories", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ESGCategories[])mapper.readValue(json, ESGCategories[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public ESGCategories[] getESGCategoriesHTTP(String identifierType, String identifiers, String identifierAsOfDate, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetESGCategories", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ESGCategories[])mapper.readValue(json, ESGCategories[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public ESGScores[] getESGScores(String identifierType, String identifiers, String identifierAsOfDate, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetESGScores", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ESGScores[])mapper.readValue(json, ESGScores[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public ESGScores[] getESGScoresHTTP(String identifierType, String identifiers, String identifierAsOfDate, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetESGScores", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ESGScores[])mapper.readValue(json, ESGScores[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public HistoricalESGCategoriesRange getHistoricalESGCategoriesRange(String identifierType, String identifier, String identifierAsOfDate, String startDate, String endDate, String version) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("Version", String.valueOf(version));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalESGCategoriesRange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalESGCategoriesRange)mapper.readValue(json, HistoricalESGCategoriesRange.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public HistoricalESGCategoriesRange getHistoricalESGCategoriesRangeHTTP(String identifierType, String identifier, String identifierAsOfDate, String startDate, String endDate, String version) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("Version", String.valueOf(version));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalESGCategoriesRange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalESGCategoriesRange)mapper.readValue(json, HistoricalESGCategoriesRange.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public HistoricalESGScoresRange getHistoricalESGScoresRange(String identifierType, String identifier, String identifierAsOfDate, String startDate, String endDate, String version) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("Version", String.valueOf(version));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalESGScoresRange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalESGScoresRange)mapper.readValue(json, HistoricalESGScoresRange.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public HistoricalESGScoresRange getHistoricalESGScoresRangeHTTP(String identifierType, String identifier, String identifierAsOfDate, String startDate, String endDate, String version) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("Version", String.valueOf(version));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalESGScoresRange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalESGScoresRange)mapper.readValue(json, HistoricalESGScoresRange.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public GlobalCompactScores[] getGlobalCompactScores(String identifierType, String identifiers, String identifierAsOfDate, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetGlobalCompactScores", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalCompactScores[])mapper.readValue(json, GlobalCompactScores[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public GlobalCompactScores[] getGlobalCompactScoresHTTP(String identifierType, String identifiers, String identifierAsOfDate, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetGlobalCompactScores", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalCompactScores[])mapper.readValue(json, GlobalCompactScores[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public HistoricalGlobalCompactScoresRange getHistoricalGlobalCompactScoresRange(String identifierType, String identifier, String identifierAsOfDate, String startDate, String endDate, String version) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("Version", String.valueOf(version));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalGlobalCompactScoresRange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalGlobalCompactScoresRange)mapper.readValue(json, HistoricalGlobalCompactScoresRange.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public HistoricalGlobalCompactScoresRange getHistoricalGlobalCompactScoresRangeHTTP(String identifierType, String identifier, String identifierAsOfDate, String startDate, String endDate, String version) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("Version", String.valueOf(version));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalGlobalCompactScoresRange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalGlobalCompactScoresRange)mapper.readValue(json, HistoricalGlobalCompactScoresRange.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public Emissions[] getEmissions(String identifierType, String identifiers, String identifierAsOfDate, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetEmissions", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Emissions[])mapper.readValue(json, Emissions[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public Emissions[] getEmissionsHTTP(String identifierType, String identifiers, String identifierAsOfDate, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetEmissions", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Emissions[])mapper.readValue(json, Emissions[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public TemperatureScores[] getTemperatureScores(String identifierType, String identifiers, String identifierAsOfDate, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetTemperatureScores", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (TemperatureScores[])mapper.readValue(json, TemperatureScores[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public TemperatureScores[] getTemperatureScoresHTTP(String identifierType, String identifiers, String identifierAsOfDate, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetTemperatureScores", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (TemperatureScores[])mapper.readValue(json, TemperatureScores[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public Involvements[] getInvolvements(String identifierType, String identifiers, String identifierAsOfDate, String involvementTypes, String percentThreshold, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("InvolvementTypes", String.valueOf(involvementTypes));
         params.put("PercentThreshold", String.valueOf(percentThreshold));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetInvolvements", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Involvements[])mapper.readValue(json, Involvements[].class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public Involvements[] getInvolvementsHTTP(String identifierType, String identifiers, String identifierAsOfDate, String involvementTypes, String percentThreshold, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("InvolvementTypes", String.valueOf(involvementTypes));
         params.put("PercentThreshold", String.valueOf(percentThreshold));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetInvolvements", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Involvements[])mapper.readValue(json, Involvements[].class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public ScreenByInvolvementsResult screenByInvolvements(String involvementTypes, String sector, String industry, String exchange, String region, String percentThreshold, String involvement) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("InvolvementTypes", String.valueOf(involvementTypes));
         params.put("Sector", String.valueOf(sector));
         params.put("Industry", String.valueOf(industry));
         params.put("Exchange", String.valueOf(exchange));
         params.put("Region", String.valueOf(region));
         params.put("PercentThreshold", String.valueOf(percentThreshold));
         params.put("Involvement", String.valueOf(involvement));
         String json = RestClient.get(this.endPointUrl + "/ScreenByInvolvements", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ScreenByInvolvementsResult)mapper.readValue(json, ScreenByInvolvementsResult.class);
      } catch (Exception var11) {
         throw new XigniteApiException(var11.getMessage());
      }
   }

   public ScreenByInvolvementsResult screenByInvolvementsHTTP(String involvementTypes, String sector, String industry, String exchange, String region, String percentThreshold, String involvement) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("InvolvementTypes", String.valueOf(involvementTypes));
         params.put("Sector", String.valueOf(sector));
         params.put("Industry", String.valueOf(industry));
         params.put("Exchange", String.valueOf(exchange));
         params.put("Region", String.valueOf(region));
         params.put("PercentThreshold", String.valueOf(percentThreshold));
         params.put("Involvement", String.valueOf(involvement));
         String json = RestClient.get(this.endPointUrl + "/ScreenByInvolvements", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ScreenByInvolvementsResult)mapper.readValue(json, ScreenByInvolvementsResult.class);
      } catch (Exception var11) {
         throw new XigniteApiException(var11.getMessage());
      }
   }
}
