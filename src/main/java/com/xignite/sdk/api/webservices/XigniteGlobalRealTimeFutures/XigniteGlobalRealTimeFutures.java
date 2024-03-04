package com.xignite.sdk.api.webservices.XigniteGlobalRealTimeFutures;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xignite.sdk.api.ApiBase;
import com.xignite.sdk.api.webservices.XigniteGlobalRealTimeFutures.Models.Future;
import com.xignite.sdk.api.webservices.XigniteGlobalRealTimeFutures.Models.FutureChartBars;
import com.xignite.sdk.api.webservices.XigniteGlobalRealTimeFutures.Models.FutureExchange;
import com.xignite.sdk.api.webservices.XigniteGlobalRealTimeFutures.Models.FutureOption;
import com.xignite.sdk.api.webservices.XigniteGlobalRealTimeFutures.Models.FutureOptionQuote;
import com.xignite.sdk.api.webservices.XigniteGlobalRealTimeFutures.Models.FutureQuote;
import com.xignite.sdk.api.webservices.XigniteGlobalRealTimeFutures.Models.IdentifierTypes;
import com.xignite.sdk.exceptions.XigniteApiException;
import com.xignite.sdk.utilities.RestClient;
import java.util.LinkedHashMap;

public class XigniteGlobalRealTimeFutures extends ApiBase {
   public XigniteGlobalRealTimeFutures(String apiToken) {
      this.apiToken = apiToken;
      this.endPointUrl = "http://globalrealtimefutures.xignite.com/v2/xGlobalRealTimeFutures.json";
   }

   public Future[] searchFutures(String name) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Name", String.valueOf(name));
         String json = RestClient.get(this.endPointUrl + "/SearchFutures", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Future[])mapper.readValue(json, Future[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public Future[] searchFuturesHTTP(String name) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Name", String.valueOf(name));
         String json = RestClient.get(this.endPointUrl + "/SearchFutures", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Future[])mapper.readValue(json, Future[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public Future[] listBaseFutures(String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/ListBaseFutures", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Future[])mapper.readValue(json, Future[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public Future[] listBaseFuturesHTTP(String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/ListBaseFutures", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Future[])mapper.readValue(json, Future[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public Future[] listFutureChain(String baseSymbol, String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("BaseSymbol", String.valueOf(baseSymbol));
         params.put("Exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/ListFutureChain", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Future[])mapper.readValue(json, Future[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public Future[] listFutureChainHTTP(String baseSymbol, String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("BaseSymbol", String.valueOf(baseSymbol));
         params.put("Exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/ListFutureChain", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Future[])mapper.readValue(json, Future[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public FutureExchange[] listFutureExchanges() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListFutureExchanges", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FutureExchange[])mapper.readValue(json, FutureExchange[].class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public FutureExchange[] listFutureExchangesHTTP() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListFutureExchanges", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FutureExchange[])mapper.readValue(json, FutureExchange[].class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public FutureOption[] listOptionChain(String futureSymbol, String exchange, String style) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("FutureSymbol", String.valueOf(futureSymbol));
         params.put("Exchange", String.valueOf(exchange));
         params.put("Style", String.valueOf(style));
         String json = RestClient.get(this.endPointUrl + "/ListOptionChain", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FutureOption[])mapper.readValue(json, FutureOption[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public FutureOption[] listOptionChainHTTP(String futureSymbol, String exchange, String style) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("FutureSymbol", String.valueOf(futureSymbol));
         params.put("Exchange", String.valueOf(exchange));
         params.put("Style", String.valueOf(style));
         String json = RestClient.get(this.endPointUrl + "/ListOptionChain", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FutureOption[])mapper.readValue(json, FutureOption[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public FutureQuote getSpotFutureQuote(String identifier, String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("Exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/GetSpotFutureQuote", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FutureQuote)mapper.readValue(json, FutureQuote.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public FutureQuote getSpotFutureQuoteHTTP(String identifier, String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("Exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/GetSpotFutureQuote", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FutureQuote)mapper.readValue(json, FutureQuote.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public FutureQuote[] getLatestFrontMonthFutureQuotes(String identifiers) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         String json = RestClient.get(this.endPointUrl + "/GetLatestFrontMonthFutureQuotes", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FutureQuote[])mapper.readValue(json, FutureQuote[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public FutureQuote[] getLatestFrontMonthFutureQuotesHTTP(String identifiers) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         String json = RestClient.get(this.endPointUrl + "/GetLatestFrontMonthFutureQuotes", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FutureQuote[])mapper.readValue(json, FutureQuote[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public FutureOptionQuote getLatestFutureOptionQuote(String identifier) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         String json = RestClient.get(this.endPointUrl + "/GetLatestFutureOptionQuote", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FutureOptionQuote)mapper.readValue(json, FutureOptionQuote.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public FutureOptionQuote getLatestFutureOptionQuoteHTTP(String identifier) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         String json = RestClient.get(this.endPointUrl + "/GetLatestFutureOptionQuote", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FutureOptionQuote)mapper.readValue(json, FutureOptionQuote.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public FutureOptionQuote[] getLatestFutureOptionQuotes(String identifiers) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         String json = RestClient.get(this.endPointUrl + "/GetLatestFutureOptionQuotes", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FutureOptionQuote[])mapper.readValue(json, FutureOptionQuote[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public FutureOptionQuote[] getLatestFutureOptionQuotesHTTP(String identifiers) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         String json = RestClient.get(this.endPointUrl + "/GetLatestFutureOptionQuotes", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FutureOptionQuote[])mapper.readValue(json, FutureOptionQuote[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public FutureQuote getLatestFutureQuote(String identifier) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         String json = RestClient.get(this.endPointUrl + "/GetLatestFutureQuote", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FutureQuote)mapper.readValue(json, FutureQuote.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public FutureQuote getLatestFutureQuoteHTTP(String identifier) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         String json = RestClient.get(this.endPointUrl + "/GetLatestFutureQuote", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FutureQuote)mapper.readValue(json, FutureQuote.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public FutureQuote[] getLatestFutureQuotes(String identifiers) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         String json = RestClient.get(this.endPointUrl + "/GetLatestFutureQuotes", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FutureQuote[])mapper.readValue(json, FutureQuote[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public FutureQuote[] getLatestFutureQuotesHTTP(String identifiers) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         String json = RestClient.get(this.endPointUrl + "/GetLatestFutureQuotes", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FutureQuote[])mapper.readValue(json, FutureQuote[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public FutureQuote[] getAllFutureQuotes(String identifier, String exchange, int count) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("Exchange", String.valueOf(exchange));
         params.put("Count", String.valueOf(count));
         String json = RestClient.get(this.endPointUrl + "/GetAllFutureQuotes", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FutureQuote[])mapper.readValue(json, FutureQuote[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public FutureQuote[] getAllFutureQuotesHTTP(String identifier, String exchange, int count) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("Exchange", String.valueOf(exchange));
         params.put("Count", String.valueOf(count));
         String json = RestClient.get(this.endPointUrl + "/GetAllFutureQuotes", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FutureQuote[])mapper.readValue(json, FutureQuote[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public FutureOptionQuote[] getAllOptionQuotes(String identifier, String exchange, boolean tradeOnly) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("Exchange", String.valueOf(exchange));
         params.put("TradeOnly", String.valueOf(tradeOnly));
         String json = RestClient.get(this.endPointUrl + "/GetAllOptionQuotes", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FutureOptionQuote[])mapper.readValue(json, FutureOptionQuote[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public FutureOptionQuote[] getAllOptionQuotesHTTP(String identifier, String exchange, boolean tradeOnly) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("Exchange", String.valueOf(exchange));
         params.put("TradeOnly", String.valueOf(tradeOnly));
         String json = RestClient.get(this.endPointUrl + "/GetAllOptionQuotes", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FutureOptionQuote[])mapper.readValue(json, FutureOptionQuote[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public Future getFrontMonthFuture(String identifier, String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("Exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/GetFrontMonthFuture", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Future)mapper.readValue(json, Future.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public Future getFrontMonthFutureHTTP(String identifier, String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("Exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/GetFrontMonthFuture", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Future)mapper.readValue(json, Future.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public Future getFuture(String identifier, String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("Exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/GetFuture", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Future)mapper.readValue(json, Future.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public Future getFutureHTTP(String identifier, String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("Exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/GetFuture", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Future)mapper.readValue(json, Future.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public FutureOptionQuote getFutureOptionQuote(String identifier, String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("Exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/GetFutureOptionQuote", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FutureOptionQuote)mapper.readValue(json, FutureOptionQuote.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public FutureOptionQuote getFutureOptionQuoteHTTP(String identifier, String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("Exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/GetFutureOptionQuote", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FutureOptionQuote)mapper.readValue(json, FutureOptionQuote.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public FutureOptionQuote[] getFutureOptionQuotes(String identifiers, String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/GetFutureOptionQuotes", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FutureOptionQuote[])mapper.readValue(json, FutureOptionQuote[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public FutureOptionQuote[] getFutureOptionQuotesHTTP(String identifiers, String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/GetFutureOptionQuotes", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FutureOptionQuote[])mapper.readValue(json, FutureOptionQuote[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public FutureQuote getFutureQuote(String identifier, String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("Exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/GetFutureQuote", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FutureQuote)mapper.readValue(json, FutureQuote.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public FutureQuote getFutureQuoteHTTP(String identifier, String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("Exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/GetFutureQuote", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FutureQuote)mapper.readValue(json, FutureQuote.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public FutureQuote[] getFutureQuotes(String identifiers, String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("Exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/GetFutureQuotes", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FutureQuote[])mapper.readValue(json, FutureQuote[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public FutureQuote[] getFutureQuotesHTTP(String identifiers, String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("Exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/GetFutureQuotes", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FutureQuote[])mapper.readValue(json, FutureQuote[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public FutureQuote[] getHistoricalFutureQuotesRange(String identifier, String exchange, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("Exchange", String.valueOf(exchange));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalFutureQuotesRange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FutureQuote[])mapper.readValue(json, FutureQuote[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public FutureQuote[] getHistoricalFutureQuotesRangeHTTP(String identifier, String exchange, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("Exchange", String.valueOf(exchange));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalFutureQuotesRange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FutureQuote[])mapper.readValue(json, FutureQuote[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public FutureQuote[] getHistoricalSwapQuotes(String identifier, String exchange, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("Exchange", String.valueOf(exchange));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalSwapQuotes", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FutureQuote[])mapper.readValue(json, FutureQuote[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public FutureQuote[] getHistoricalSwapQuotesHTTP(String identifier, String exchange, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("Exchange", String.valueOf(exchange));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalSwapQuotes", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FutureQuote[])mapper.readValue(json, FutureQuote[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public FutureQuote getSwapQuote(String identifier, String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("Exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/GetSwapQuote", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FutureQuote)mapper.readValue(json, FutureQuote.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public FutureQuote getSwapQuoteHTTP(String identifier, String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("Exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/GetSwapQuote", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FutureQuote)mapper.readValue(json, FutureQuote.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public FutureChartBars getChartBars(String identifier, IdentifierTypes identifierType, String startTime, String endTime, String precision, int period, boolean includeExtended) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("StartTime", String.valueOf(startTime));
         params.put("EndTime", String.valueOf(endTime));
         params.put("Precision", String.valueOf(precision));
         params.put("Period", String.valueOf(period));
         params.put("IncludeExtended", String.valueOf(includeExtended));
         String json = RestClient.get(this.endPointUrl + "/GetChartBars", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FutureChartBars)mapper.readValue(json, FutureChartBars.class);
      } catch (Exception var11) {
         throw new XigniteApiException(var11.getMessage());
      }
   }

   public FutureChartBars getChartBarsHTTP(String identifier, IdentifierTypes identifierType, String startTime, String endTime, String precision, int period, boolean includeExtended) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("StartTime", String.valueOf(startTime));
         params.put("EndTime", String.valueOf(endTime));
         params.put("Precision", String.valueOf(precision));
         params.put("Period", String.valueOf(period));
         params.put("IncludeExtended", String.valueOf(includeExtended));
         String json = RestClient.get(this.endPointUrl + "/GetChartBars", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FutureChartBars)mapper.readValue(json, FutureChartBars.class);
      } catch (Exception var11) {
         throw new XigniteApiException(var11.getMessage());
      }
   }
}
