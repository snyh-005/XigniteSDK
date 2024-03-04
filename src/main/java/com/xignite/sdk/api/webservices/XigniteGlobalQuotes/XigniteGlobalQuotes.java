package com.xignite.sdk.api.webservices.XigniteGlobalQuotes;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xignite.sdk.api.ApiBase;
import com.xignite.sdk.api.webservices.XigniteGlobalQuotes.Models.EquityChartBars;
import com.xignite.sdk.api.webservices.XigniteGlobalQuotes.Models.ExchangeList;
import com.xignite.sdk.api.webservices.XigniteGlobalQuotes.Models.GlobalAuctionQuote;
import com.xignite.sdk.api.webservices.XigniteGlobalQuotes.Models.GlobalBar;
import com.xignite.sdk.api.webservices.XigniteGlobalQuotes.Models.GlobalBars;
import com.xignite.sdk.api.webservices.XigniteGlobalQuotes.Models.GlobalExtendedQuote;
import com.xignite.sdk.api.webservices.XigniteGlobalQuotes.Models.GlobalQuote;
import com.xignite.sdk.api.webservices.XigniteGlobalQuotes.Models.IdentifierTypes;
import com.xignite.sdk.api.webservices.XigniteGlobalQuotes.Models.IntradayVWAP;
import com.xignite.sdk.api.webservices.XigniteGlobalQuotes.Models.MarketMoverTypes;
import com.xignite.sdk.api.webservices.XigniteGlobalQuotes.Models.MarketMovers;
import com.xignite.sdk.api.webservices.XigniteGlobalQuotes.Models.SymbolChangeList;
import com.xignite.sdk.api.webservices.XigniteGlobalQuotes.Models.SymbolList;
import com.xignite.sdk.api.webservices.XigniteGlobalQuotes.Models.TickPrecisions;
import com.xignite.sdk.exceptions.XigniteApiException;
import com.xignite.sdk.utilities.RestClient;
import java.util.LinkedHashMap;

public class XigniteGlobalQuotes extends ApiBase {
   public XigniteGlobalQuotes(String apiToken) {
      this.apiToken = apiToken;
      this.endPointUrl = "http://globalquotes.xignite.com/v3/xGlobalQuotes.json";
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

   public GlobalQuote getGlobalDelayedQuote(String identifier, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetGlobalDelayedQuote", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalQuote)mapper.readValue(json, GlobalQuote.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public GlobalQuote getGlobalDelayedQuoteHTTP(String identifier, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetGlobalDelayedQuote", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalQuote)mapper.readValue(json, GlobalQuote.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public GlobalQuote[] getGlobalDelayedQuotes(String identifiers, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetGlobalDelayedQuotes", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalQuote[])mapper.readValue(json, GlobalQuote[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public GlobalQuote[] getGlobalDelayedQuotesHTTP(String identifiers, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetGlobalDelayedQuotes", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalQuote[])mapper.readValue(json, GlobalQuote[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public GlobalExtendedQuote getGlobalExtendedQuote(String identifier, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetGlobalExtendedQuote", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalExtendedQuote)mapper.readValue(json, GlobalExtendedQuote.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public GlobalExtendedQuote getGlobalExtendedQuoteHTTP(String identifier, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetGlobalExtendedQuote", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalExtendedQuote)mapper.readValue(json, GlobalExtendedQuote.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public GlobalExtendedQuote[] getGlobalExtendedQuotes(String identifiers, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetGlobalExtendedQuotes", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalExtendedQuote[])mapper.readValue(json, GlobalExtendedQuote[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public GlobalExtendedQuote[] getGlobalExtendedQuotesHTTP(String identifiers, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetGlobalExtendedQuotes", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalExtendedQuote[])mapper.readValue(json, GlobalExtendedQuote[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public IntradayVWAP getGlobalDelayedVWAP(String identifier, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetGlobalDelayedVWAP", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IntradayVWAP)mapper.readValue(json, IntradayVWAP.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public IntradayVWAP getGlobalDelayedVWAPHTTP(String identifier, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetGlobalDelayedVWAP", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IntradayVWAP)mapper.readValue(json, IntradayVWAP.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public IntradayVWAP getGlobalIntradayVWAP(String identifier, IdentifierTypes identifierType, String startTime, String endTime) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("StartTime", String.valueOf(startTime));
         params.put("EndTime", String.valueOf(endTime));
         String json = RestClient.get(this.endPointUrl + "/GetGlobalIntradayVWAP", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IntradayVWAP)mapper.readValue(json, IntradayVWAP.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public IntradayVWAP getGlobalIntradayVWAPHTTP(String identifier, IdentifierTypes identifierType, String startTime, String endTime) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("StartTime", String.valueOf(startTime));
         params.put("EndTime", String.valueOf(endTime));
         String json = RestClient.get(this.endPointUrl + "/GetGlobalIntradayVWAP", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IntradayVWAP)mapper.readValue(json, IntradayVWAP.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public GlobalBar getBar(String identifier, IdentifierTypes identifierType, String endTime, TickPrecisions precision, int period) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("EndTime", String.valueOf(endTime));
         params.put("Precision", String.valueOf(precision));
         params.put("Period", String.valueOf(period));
         String json = RestClient.get(this.endPointUrl + "/GetBar", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalBar)mapper.readValue(json, GlobalBar.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public GlobalBar getBarHTTP(String identifier, IdentifierTypes identifierType, String endTime, TickPrecisions precision, int period) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("EndTime", String.valueOf(endTime));
         params.put("Precision", String.valueOf(precision));
         params.put("Period", String.valueOf(period));
         String json = RestClient.get(this.endPointUrl + "/GetBar", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalBar)mapper.readValue(json, GlobalBar.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public GlobalBars getBars(String identifier, IdentifierTypes identifierType, String startTime, String endTime, TickPrecisions precision, int period) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("StartTime", String.valueOf(startTime));
         params.put("EndTime", String.valueOf(endTime));
         params.put("Precision", String.valueOf(precision));
         params.put("Period", String.valueOf(period));
         String json = RestClient.get(this.endPointUrl + "/GetBars", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalBars)mapper.readValue(json, GlobalBars.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public GlobalBars getBarsHTTP(String identifier, IdentifierTypes identifierType, String startTime, String endTime, TickPrecisions precision, int period) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("StartTime", String.valueOf(startTime));
         params.put("EndTime", String.valueOf(endTime));
         params.put("Precision", String.valueOf(precision));
         params.put("Period", String.valueOf(period));
         String json = RestClient.get(this.endPointUrl + "/GetBars", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalBars)mapper.readValue(json, GlobalBars.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public EquityChartBars getChartBars(String identifier, IdentifierTypes identifierType, String startTime, String endTime, String precision, int period, String adjustmentMethod, boolean includeExtended) throws XigniteApiException {
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
         return (EquityChartBars)mapper.readValue(json, EquityChartBars.class);
      } catch (Exception var12) {
         throw new XigniteApiException(var12.getMessage());
      }
   }

   public EquityChartBars getChartBarsHTTP(String identifier, IdentifierTypes identifierType, String startTime, String endTime, String precision, int period, String adjustmentMethod, boolean includeExtended) throws XigniteApiException {
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
         return (EquityChartBars)mapper.readValue(json, EquityChartBars.class);
      } catch (Exception var12) {
         throw new XigniteApiException(var12.getMessage());
      }
   }

   public MarketMovers getTopMarketMovers(MarketMoverTypes marketMoverType, int numberOfMarketMovers, String exchanges) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("MarketMoverType", String.valueOf(marketMoverType));
         params.put("NumberOfMarketMovers", String.valueOf(numberOfMarketMovers));
         params.put("Exchanges", String.valueOf(exchanges));
         String json = RestClient.get(this.endPointUrl + "/GetTopMarketMovers", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (MarketMovers)mapper.readValue(json, MarketMovers.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public MarketMovers getTopMarketMoversHTTP(MarketMoverTypes marketMoverType, int numberOfMarketMovers, String exchanges) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("MarketMoverType", String.valueOf(marketMoverType));
         params.put("NumberOfMarketMovers", String.valueOf(numberOfMarketMovers));
         params.put("Exchanges", String.valueOf(exchanges));
         String json = RestClient.get(this.endPointUrl + "/GetTopMarketMovers", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (MarketMovers)mapper.readValue(json, MarketMovers.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public GlobalAuctionQuote[] getAuctionPrices(String identifiers, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetAuctionPrices", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalAuctionQuote[])mapper.readValue(json, GlobalAuctionQuote[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public GlobalAuctionQuote[] getAuctionPricesHTTP(String identifiers, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetAuctionPrices", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalAuctionQuote[])mapper.readValue(json, GlobalAuctionQuote[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }
}
