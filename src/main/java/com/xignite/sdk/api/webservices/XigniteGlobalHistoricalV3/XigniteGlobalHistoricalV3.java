package com.xignite.sdk.api.webservices.XigniteGlobalHistoricalV3;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xignite.sdk.api.ApiBase;
import com.xignite.sdk.api.webservices.XigniteGlobalHistoricalV3.Models.AdjustmentFactors;
import com.xignite.sdk.api.webservices.XigniteGlobalHistoricalV3.Models.CashDividendHistory;
import com.xignite.sdk.api.webservices.XigniteGlobalHistoricalV3.Models.ChartBarsSet;
import com.xignite.sdk.api.webservices.XigniteGlobalHistoricalV3.Models.ExchangeDividendsList;
import com.xignite.sdk.api.webservices.XigniteGlobalHistoricalV3.Models.ExchangeList;
import com.xignite.sdk.api.webservices.XigniteGlobalHistoricalV3.Models.ExchangeSplitsList;
import com.xignite.sdk.api.webservices.XigniteGlobalHistoricalV3.Models.GlobalHistoricalQuote;
import com.xignite.sdk.api.webservices.XigniteGlobalHistoricalV3.Models.GlobalHistoricalQuotes;
import com.xignite.sdk.api.webservices.XigniteGlobalHistoricalV3.Models.GlobalHistoricalVWAPs;
import com.xignite.sdk.api.webservices.XigniteGlobalHistoricalV3.Models.SplitHistory;
import com.xignite.sdk.api.webservices.XigniteGlobalHistoricalV3.Models.SymbolChangeList;
import com.xignite.sdk.api.webservices.XigniteGlobalHistoricalV3.Models.SymbolList;
import com.xignite.sdk.api.webservices.XigniteGlobalHistoricalV3.Models.SymbolsWithAdjustedFactorsList;
import com.xignite.sdk.exceptions.XigniteApiException;
import com.xignite.sdk.utilities.RestClient;
import java.util.LinkedHashMap;

public class XigniteGlobalHistoricalV3 extends ApiBase {
   public XigniteGlobalHistoricalV3(String apiToken) {
      this.apiToken = apiToken;
      this.endPointUrl = "http://globalhistorical.xignite.com/v3/xGlobalHistorical.json";
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

   public SymbolList listSymbols(String exchange, String startSymbol, String endSymbol) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("StartSymbol", String.valueOf(startSymbol));
         params.put("EndSymbol", String.valueOf(endSymbol));
         String json = RestClient.get(this.endPointUrl + "/ListSymbols", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SymbolList)mapper.readValue(json, SymbolList.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public SymbolList listSymbolsHTTP(String exchange, String startSymbol, String endSymbol) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("StartSymbol", String.valueOf(startSymbol));
         params.put("EndSymbol", String.valueOf(endSymbol));
         String json = RestClient.get(this.endPointUrl + "/ListSymbols", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SymbolList)mapper.readValue(json, SymbolList.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public SymbolChangeList listSymbolChanges(String exchange, String changesSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("ChangesSince", String.valueOf(changesSince));
         String json = RestClient.get(this.endPointUrl + "/ListSymbolChanges", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SymbolChangeList)mapper.readValue(json, SymbolChangeList.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public SymbolChangeList listSymbolChangesHTTP(String exchange, String changesSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("ChangesSince", String.valueOf(changesSince));
         String json = RestClient.get(this.endPointUrl + "/ListSymbolChanges", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SymbolChangeList)mapper.readValue(json, SymbolChangeList.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public SymbolsWithAdjustedFactorsList listSymbolsWithAdjustedFactors(String exchange, String changesSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("ChangesSince", String.valueOf(changesSince));
         String json = RestClient.get(this.endPointUrl + "/ListSymbolsWithAdjustedFactors", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SymbolsWithAdjustedFactorsList)mapper.readValue(json, SymbolsWithAdjustedFactorsList.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public SymbolsWithAdjustedFactorsList listSymbolsWithAdjustedFactorsHTTP(String exchange, String changesSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("ChangesSince", String.valueOf(changesSince));
         String json = RestClient.get(this.endPointUrl + "/ListSymbolsWithAdjustedFactors", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SymbolsWithAdjustedFactorsList)mapper.readValue(json, SymbolsWithAdjustedFactorsList.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public GlobalHistoricalQuote[] getGlobalHistoricalQuotes(String identifiers, String identifierType, String identifierAsOfDate, String adjustmentMethod, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("AdjustmentMethod", String.valueOf(adjustmentMethod));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetGlobalHistoricalQuotes", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalHistoricalQuote[])mapper.readValue(json, GlobalHistoricalQuote[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public GlobalHistoricalQuote[] getGlobalHistoricalQuotesHTTP(String identifiers, String identifierType, String identifierAsOfDate, String adjustmentMethod, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("AdjustmentMethod", String.valueOf(adjustmentMethod));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetGlobalHistoricalQuotes", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalHistoricalQuote[])mapper.readValue(json, GlobalHistoricalQuote[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public GlobalHistoricalQuotes getGlobalHistoricalQuotesTrailing(String identifier, String identifierType, String identifierAsOfDate, String adjustmentMethod, String endDate, String periodType, String periods) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("AdjustmentMethod", String.valueOf(adjustmentMethod));
         params.put("EndDate", String.valueOf(endDate));
         params.put("PeriodType", String.valueOf(periodType));
         params.put("Periods", String.valueOf(periods));
         String json = RestClient.get(this.endPointUrl + "/GetGlobalHistoricalQuotesTrailing", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalHistoricalQuotes)mapper.readValue(json, GlobalHistoricalQuotes.class);
      } catch (Exception var11) {
         throw new XigniteApiException(var11.getMessage());
      }
   }

   public GlobalHistoricalQuotes getGlobalHistoricalQuotesTrailingHTTP(String identifier, String identifierType, String identifierAsOfDate, String adjustmentMethod, String endDate, String periodType, String periods) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("AdjustmentMethod", String.valueOf(adjustmentMethod));
         params.put("EndDate", String.valueOf(endDate));
         params.put("PeriodType", String.valueOf(periodType));
         params.put("Periods", String.valueOf(periods));
         String json = RestClient.get(this.endPointUrl + "/GetGlobalHistoricalQuotesTrailing", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalHistoricalQuotes)mapper.readValue(json, GlobalHistoricalQuotes.class);
      } catch (Exception var11) {
         throw new XigniteApiException(var11.getMessage());
      }
   }

   public GlobalHistoricalQuote[] getGlobalHistoricalTrades(String identifiers, String identifierType, String identifierAsOfDate, String adjustmentMethod, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("AdjustmentMethod", String.valueOf(adjustmentMethod));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetGlobalHistoricalTrades", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalHistoricalQuote[])mapper.readValue(json, GlobalHistoricalQuote[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public GlobalHistoricalQuote[] getGlobalHistoricalTradesHTTP(String identifiers, String identifierType, String identifierAsOfDate, String adjustmentMethod, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("AdjustmentMethod", String.valueOf(adjustmentMethod));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetGlobalHistoricalTrades", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalHistoricalQuote[])mapper.readValue(json, GlobalHistoricalQuote[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public GlobalHistoricalQuotes getGlobalHistoricalTradesRange(String identifier, String identifierType, String identifierAsOfDate, String adjustmentMethod, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("AdjustmentMethod", String.valueOf(adjustmentMethod));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetGlobalHistoricalTradesRange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalHistoricalQuotes)mapper.readValue(json, GlobalHistoricalQuotes.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public GlobalHistoricalQuotes getGlobalHistoricalTradesRangeHTTP(String identifier, String identifierType, String identifierAsOfDate, String adjustmentMethod, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("AdjustmentMethod", String.valueOf(adjustmentMethod));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetGlobalHistoricalTradesRange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalHistoricalQuotes)mapper.readValue(json, GlobalHistoricalQuotes.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public GlobalHistoricalQuotes getGlobalHistoricalQuotesRange(String identifier, String identifierType, String identifierAsOfDate, String adjustmentMethod, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("AdjustmentMethod", String.valueOf(adjustmentMethod));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetGlobalHistoricalQuotesRange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalHistoricalQuotes)mapper.readValue(json, GlobalHistoricalQuotes.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public GlobalHistoricalQuotes getGlobalHistoricalQuotesRangeHTTP(String identifier, String identifierType, String identifierAsOfDate, String adjustmentMethod, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("AdjustmentMethod", String.valueOf(adjustmentMethod));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetGlobalHistoricalQuotesRange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalHistoricalQuotes)mapper.readValue(json, GlobalHistoricalQuotes.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public GlobalHistoricalQuotes getGlobalHistoricalWeeklyQuotesRange(String identifier, String identifierType, String identifierAsOfDate, String adjustmentMethod, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("AdjustmentMethod", String.valueOf(adjustmentMethod));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetGlobalHistoricalWeeklyQuotesRange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalHistoricalQuotes)mapper.readValue(json, GlobalHistoricalQuotes.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public GlobalHistoricalQuotes getGlobalHistoricalWeeklyQuotesRangeHTTP(String identifier, String identifierType, String identifierAsOfDate, String adjustmentMethod, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("AdjustmentMethod", String.valueOf(adjustmentMethod));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetGlobalHistoricalWeeklyQuotesRange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalHistoricalQuotes)mapper.readValue(json, GlobalHistoricalQuotes.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public GlobalHistoricalQuotes getGlobalHistoricalMonthlyQuotesRange(String identifier, String identifierType, String identifierAsOfDate, String adjustmentMethod, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("AdjustmentMethod", String.valueOf(adjustmentMethod));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetGlobalHistoricalMonthlyQuotesRange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalHistoricalQuotes)mapper.readValue(json, GlobalHistoricalQuotes.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public GlobalHistoricalQuotes getGlobalHistoricalMonthlyQuotesRangeHTTP(String identifier, String identifierType, String identifierAsOfDate, String adjustmentMethod, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("AdjustmentMethod", String.valueOf(adjustmentMethod));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetGlobalHistoricalMonthlyQuotesRange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalHistoricalQuotes)mapper.readValue(json, GlobalHistoricalQuotes.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public GlobalHistoricalQuotes getGlobalHistoricalQuarterlyQuotesRange(String identifier, String identifierType, String identifierAsOfDate, String adjustmentMethod, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("AdjustmentMethod", String.valueOf(adjustmentMethod));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetGlobalHistoricalQuarterlyQuotesRange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalHistoricalQuotes)mapper.readValue(json, GlobalHistoricalQuotes.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public GlobalHistoricalQuotes getGlobalHistoricalQuarterlyQuotesRangeHTTP(String identifier, String identifierType, String identifierAsOfDate, String adjustmentMethod, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("AdjustmentMethod", String.valueOf(adjustmentMethod));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetGlobalHistoricalQuarterlyQuotesRange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalHistoricalQuotes)mapper.readValue(json, GlobalHistoricalQuotes.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public ChartBarsSet getChartBars(String identifier, String identifierType, String identifierAsOfDate, String startTime, String endTime, String precision, int period, String adjustmentMethod, boolean includeExtended) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
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
      } catch (Exception var13) {
         throw new XigniteApiException(var13.getMessage());
      }
   }

   public ChartBarsSet getChartBarsHTTP(String identifier, String identifierType, String identifierAsOfDate, String startTime, String endTime, String precision, int period, String adjustmentMethod, boolean includeExtended) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
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
      } catch (Exception var13) {
         throw new XigniteApiException(var13.getMessage());
      }
   }

   public GlobalHistoricalVWAPs getGlobalHistoricalVWAP(String identifier, String identifierType, String identifierAsOfDate, String historicalVWAPType, String adjustmentMethod, String startTime, String endTime) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("HistoricalVWAPType", String.valueOf(historicalVWAPType));
         params.put("AdjustmentMethod", String.valueOf(adjustmentMethod));
         params.put("StartTime", String.valueOf(startTime));
         params.put("EndTime", String.valueOf(endTime));
         String json = RestClient.get(this.endPointUrl + "/GetGlobalHistoricalVWAP", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalHistoricalVWAPs)mapper.readValue(json, GlobalHistoricalVWAPs.class);
      } catch (Exception var11) {
         throw new XigniteApiException(var11.getMessage());
      }
   }

   public GlobalHistoricalVWAPs getGlobalHistoricalVWAPHTTP(String identifier, String identifierType, String identifierAsOfDate, String historicalVWAPType, String adjustmentMethod, String startTime, String endTime) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("HistoricalVWAPType", String.valueOf(historicalVWAPType));
         params.put("AdjustmentMethod", String.valueOf(adjustmentMethod));
         params.put("StartTime", String.valueOf(startTime));
         params.put("EndTime", String.valueOf(endTime));
         String json = RestClient.get(this.endPointUrl + "/GetGlobalHistoricalVWAP", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalHistoricalVWAPs)mapper.readValue(json, GlobalHistoricalVWAPs.class);
      } catch (Exception var11) {
         throw new XigniteApiException(var11.getMessage());
      }
   }

   public AdjustmentFactors getAdjustmentFactors(String identifier, String identifierType, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetAdjustmentFactors", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (AdjustmentFactors)mapper.readValue(json, AdjustmentFactors.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public AdjustmentFactors getAdjustmentFactorsHTTP(String identifier, String identifierType, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetAdjustmentFactors", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (AdjustmentFactors)mapper.readValue(json, AdjustmentFactors.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public SplitHistory getSplitHistory(String identifier, String identifierType, String identifierAsOfDate, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetSplitHistory", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SplitHistory)mapper.readValue(json, SplitHistory.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public SplitHistory getSplitHistoryHTTP(String identifier, String identifierType, String identifierAsOfDate, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetSplitHistory", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SplitHistory)mapper.readValue(json, SplitHistory.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public ExchangeSplitsList getSplitsByExchange(String exchange, String exDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("ExDate", String.valueOf(exDate));
         String json = RestClient.get(this.endPointUrl + "/GetSplitsByExchange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeSplitsList)mapper.readValue(json, ExchangeSplitsList.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public ExchangeSplitsList getSplitsByExchangeHTTP(String exchange, String exDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("ExDate", String.valueOf(exDate));
         String json = RestClient.get(this.endPointUrl + "/GetSplitsByExchange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeSplitsList)mapper.readValue(json, ExchangeSplitsList.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public CashDividendHistory getCashDividendHistory(String identifier, String identifierType, String identifierAsOfDate, String startDate, String endDate, String corporateActionsAdjusted) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("CorporateActionsAdjusted", String.valueOf(corporateActionsAdjusted));
         String json = RestClient.get(this.endPointUrl + "/GetCashDividendHistory", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CashDividendHistory)mapper.readValue(json, CashDividendHistory.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public CashDividendHistory getCashDividendHistoryHTTP(String identifier, String identifierType, String identifierAsOfDate, String startDate, String endDate, String corporateActionsAdjusted) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("CorporateActionsAdjusted", String.valueOf(corporateActionsAdjusted));
         String json = RestClient.get(this.endPointUrl + "/GetCashDividendHistory", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CashDividendHistory)mapper.readValue(json, CashDividendHistory.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public ExchangeDividendsList getCashDividendsByExchange(String exchange, String exDate, String corporateActionsAdjusted) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("ExDate", String.valueOf(exDate));
         params.put("CorporateActionsAdjusted", String.valueOf(corporateActionsAdjusted));
         String json = RestClient.get(this.endPointUrl + "/GetCashDividendsByExchange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeDividendsList)mapper.readValue(json, ExchangeDividendsList.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public ExchangeDividendsList getCashDividendsByExchangeHTTP(String exchange, String exDate, String corporateActionsAdjusted) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("ExDate", String.valueOf(exDate));
         params.put("CorporateActionsAdjusted", String.valueOf(corporateActionsAdjusted));
         String json = RestClient.get(this.endPointUrl + "/GetCashDividendsByExchange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeDividendsList)mapper.readValue(json, ExchangeDividendsList.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }
}
