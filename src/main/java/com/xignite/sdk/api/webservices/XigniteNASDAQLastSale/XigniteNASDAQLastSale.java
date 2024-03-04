package com.xignite.sdk.api.webservices.XigniteNASDAQLastSale;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xignite.sdk.api.ApiBase;
import com.xignite.sdk.api.webservices.XigniteNASDAQLastSale.Models.EquityChartBars;
import com.xignite.sdk.api.webservices.XigniteNASDAQLastSale.Models.ExtendedQuote;
import com.xignite.sdk.api.webservices.XigniteNASDAQLastSale.Models.GlobalBar;
import com.xignite.sdk.api.webservices.XigniteNASDAQLastSale.Models.GlobalBars;
import com.xignite.sdk.api.webservices.XigniteNASDAQLastSale.Models.IdentifierTypes;
import com.xignite.sdk.api.webservices.XigniteNASDAQLastSale.Models.LastSaleQuote;
import com.xignite.sdk.api.webservices.XigniteNASDAQLastSale.Models.Quote;
import com.xignite.sdk.api.webservices.XigniteNASDAQLastSale.Models.SymbolList;
import com.xignite.sdk.api.webservices.XigniteNASDAQLastSale.Models.TickPrecisions;
import com.xignite.sdk.exceptions.XigniteApiException;
import com.xignite.sdk.utilities.RestClient;
import java.util.LinkedHashMap;

public class XigniteNASDAQLastSale extends ApiBase {
   public XigniteNASDAQLastSale(String apiToken) {
      this.apiToken = apiToken;
      this.endPointUrl = "http://nasdaqlastsale.xignite.com/xNASDAQLastSale.json";
   }

   public SymbolList listTradedSymbols(int numberOfDays, String startSymbol, String endSymbol) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("NumberOfDays", String.valueOf(numberOfDays));
         params.put("StartSymbol", String.valueOf(startSymbol));
         params.put("EndSymbol", String.valueOf(endSymbol));
         String json = RestClient.get(this.endPointUrl + "/ListTradedSymbols", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SymbolList)mapper.readValue(json, SymbolList.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public SymbolList listTradedSymbolsHTTP(int numberOfDays, String startSymbol, String endSymbol) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("NumberOfDays", String.valueOf(numberOfDays));
         params.put("StartSymbol", String.valueOf(startSymbol));
         params.put("EndSymbol", String.valueOf(endSymbol));
         String json = RestClient.get(this.endPointUrl + "/ListTradedSymbols", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SymbolList)mapper.readValue(json, SymbolList.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public LastSaleQuote getLastSale(String symbol) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         String json = RestClient.get(this.endPointUrl + "/GetLastSale", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (LastSaleQuote)mapper.readValue(json, LastSaleQuote.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public LastSaleQuote getLastSaleHTTP(String symbol) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         String json = RestClient.get(this.endPointUrl + "/GetLastSale", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (LastSaleQuote)mapper.readValue(json, LastSaleQuote.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public LastSaleQuote[] getLastSales(String symbols) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbols", String.valueOf(symbols));
         String json = RestClient.get(this.endPointUrl + "/GetLastSales", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (LastSaleQuote[])mapper.readValue(json, LastSaleQuote[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public LastSaleQuote[] getLastSalesHTTP(String symbols) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbols", String.valueOf(symbols));
         String json = RestClient.get(this.endPointUrl + "/GetLastSales", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (LastSaleQuote[])mapper.readValue(json, LastSaleQuote[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public LastSaleQuote getLastSaleByIdentifier(String identifier, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetLastSaleByIdentifier", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (LastSaleQuote)mapper.readValue(json, LastSaleQuote.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public LastSaleQuote getLastSaleByIdentifierHTTP(String identifier, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetLastSaleByIdentifier", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (LastSaleQuote)mapper.readValue(json, LastSaleQuote.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public LastSaleQuote[] getLastSalesByIdentifiers(String identifiers, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetLastSalesByIdentifiers", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (LastSaleQuote[])mapper.readValue(json, LastSaleQuote[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public LastSaleQuote[] getLastSalesByIdentifiersHTTP(String identifiers, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetLastSalesByIdentifiers", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (LastSaleQuote[])mapper.readValue(json, LastSaleQuote[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
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

   public ExtendedQuote getExtendedQuote(String identifier, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetExtendedQuote", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExtendedQuote)mapper.readValue(json, ExtendedQuote.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public ExtendedQuote getExtendedQuoteHTTP(String identifier, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetExtendedQuote", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExtendedQuote)mapper.readValue(json, ExtendedQuote.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public ExtendedQuote[] getExtendedQuotes(String identifiers, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetExtendedQuotes", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExtendedQuote[])mapper.readValue(json, ExtendedQuote[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public ExtendedQuote[] getExtendedQuotesHTTP(String identifiers, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetExtendedQuotes", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExtendedQuote[])mapper.readValue(json, ExtendedQuote[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public GlobalBar getBar(String symbol, String endTime, TickPrecisions precision, int period) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("EndTime", String.valueOf(endTime));
         params.put("Precision", String.valueOf(precision));
         params.put("Period", String.valueOf(period));
         String json = RestClient.get(this.endPointUrl + "/GetBar", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalBar)mapper.readValue(json, GlobalBar.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public GlobalBar getBarHTTP(String symbol, String endTime, TickPrecisions precision, int period) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("EndTime", String.valueOf(endTime));
         params.put("Precision", String.valueOf(precision));
         params.put("Period", String.valueOf(period));
         String json = RestClient.get(this.endPointUrl + "/GetBar", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalBar)mapper.readValue(json, GlobalBar.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public GlobalBars getBars(String symbol, String startTime, String endTime, TickPrecisions precision, int period) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("StartTime", String.valueOf(startTime));
         params.put("EndTime", String.valueOf(endTime));
         params.put("Precision", String.valueOf(precision));
         params.put("Period", String.valueOf(period));
         String json = RestClient.get(this.endPointUrl + "/GetBars", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalBars)mapper.readValue(json, GlobalBars.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public GlobalBars getBarsHTTP(String symbol, String startTime, String endTime, TickPrecisions precision, int period) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("StartTime", String.valueOf(startTime));
         params.put("EndTime", String.valueOf(endTime));
         params.put("Precision", String.valueOf(precision));
         params.put("Period", String.valueOf(period));
         String json = RestClient.get(this.endPointUrl + "/GetBars", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GlobalBars)mapper.readValue(json, GlobalBars.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
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
}
