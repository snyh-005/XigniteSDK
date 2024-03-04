package com.xignite.sdk.api.webservices.XigniteGlobalMetals;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xignite.sdk.api.ApiBase;
import com.xignite.sdk.api.webservices.XigniteGlobalMetals.Models.Bar;
import com.xignite.sdk.api.webservices.XigniteGlobalMetals.Models.BaseMetalPrice;
import com.xignite.sdk.api.webservices.XigniteGlobalMetals.Models.ExtendedMetalQuote;
import com.xignite.sdk.api.webservices.XigniteGlobalMetals.Models.HistoricalMetalQuote;
import com.xignite.sdk.api.webservices.XigniteGlobalMetals.Models.LondonFixing;
import com.xignite.sdk.api.webservices.XigniteGlobalMetals.Models.MarketNews;
import com.xignite.sdk.api.webservices.XigniteGlobalMetals.Models.MetalChartBars;
import com.xignite.sdk.api.webservices.XigniteGlobalMetals.Models.MetalQuote;
import com.xignite.sdk.api.webservices.XigniteGlobalMetals.Models.Metals;
import com.xignite.sdk.exceptions.XigniteApiException;
import com.xignite.sdk.utilities.RestClient;
import java.util.LinkedHashMap;

public class XigniteGlobalMetals extends ApiBase {
   public XigniteGlobalMetals(String apiToken) {
      this.apiToken = apiToken;
      this.endPointUrl = "http://globalmetals.xignite.com/xGlobalMetals.json";
   }

   public Metals listMetals() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListMetals", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Metals)mapper.readValue(json, Metals.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public Metals listMetalsHTTP() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListMetals", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Metals)mapper.readValue(json, Metals.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public MetalQuote getRealTimeMetalQuote(String symbol, String currency) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("Currency", String.valueOf(currency));
         String json = RestClient.get(this.endPointUrl + "/GetRealTimeMetalQuote", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (MetalQuote)mapper.readValue(json, MetalQuote.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public MetalQuote getRealTimeMetalQuoteHTTP(String symbol, String currency) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("Currency", String.valueOf(currency));
         String json = RestClient.get(this.endPointUrl + "/GetRealTimeMetalQuote", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (MetalQuote)mapper.readValue(json, MetalQuote.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public MetalQuote[] getRealTimeMetalQuotes(String symbols, String currency) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbols", String.valueOf(symbols));
         params.put("Currency", String.valueOf(currency));
         String json = RestClient.get(this.endPointUrl + "/GetRealTimeMetalQuotes", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (MetalQuote[])mapper.readValue(json, MetalQuote[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public MetalQuote[] getRealTimeMetalQuotesHTTP(String symbols, String currency) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbols", String.valueOf(symbols));
         params.put("Currency", String.valueOf(currency));
         String json = RestClient.get(this.endPointUrl + "/GetRealTimeMetalQuotes", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (MetalQuote[])mapper.readValue(json, MetalQuote[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public ExtendedMetalQuote getRealTimeExtendedMetalQuote(String symbol, String currency) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("Currency", String.valueOf(currency));
         String json = RestClient.get(this.endPointUrl + "/GetRealTimeExtendedMetalQuote", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExtendedMetalQuote)mapper.readValue(json, ExtendedMetalQuote.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public ExtendedMetalQuote getRealTimeExtendedMetalQuoteHTTP(String symbol, String currency) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("Currency", String.valueOf(currency));
         String json = RestClient.get(this.endPointUrl + "/GetRealTimeExtendedMetalQuote", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExtendedMetalQuote)mapper.readValue(json, ExtendedMetalQuote.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public HistoricalMetalQuote getLatestHistoricalMetalQuote(String symbol, String currency, String asOfDate, String fixingTime, String priceType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("Currency", String.valueOf(currency));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("FixingTime", String.valueOf(fixingTime));
         params.put("PriceType", String.valueOf(priceType));
         String json = RestClient.get(this.endPointUrl + "/GetLatestHistoricalMetalQuote", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalMetalQuote)mapper.readValue(json, HistoricalMetalQuote.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public HistoricalMetalQuote getLatestHistoricalMetalQuoteHTTP(String symbol, String currency, String asOfDate, String fixingTime, String priceType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("Currency", String.valueOf(currency));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("FixingTime", String.valueOf(fixingTime));
         params.put("PriceType", String.valueOf(priceType));
         String json = RestClient.get(this.endPointUrl + "/GetLatestHistoricalMetalQuote", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalMetalQuote)mapper.readValue(json, HistoricalMetalQuote.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public HistoricalMetalQuote[] getLatestHistoricalMetalQuotes(String symbols, String currency, String asOfDate, String fixingTime, String priceType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbols", String.valueOf(symbols));
         params.put("Currency", String.valueOf(currency));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("FixingTime", String.valueOf(fixingTime));
         params.put("PriceType", String.valueOf(priceType));
         String json = RestClient.get(this.endPointUrl + "/GetLatestHistoricalMetalQuotes", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalMetalQuote[])mapper.readValue(json, HistoricalMetalQuote[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public HistoricalMetalQuote[] getLatestHistoricalMetalQuotesHTTP(String symbols, String currency, String asOfDate, String fixingTime, String priceType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbols", String.valueOf(symbols));
         params.put("Currency", String.valueOf(currency));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("FixingTime", String.valueOf(fixingTime));
         params.put("PriceType", String.valueOf(priceType));
         String json = RestClient.get(this.endPointUrl + "/GetLatestHistoricalMetalQuotes", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalMetalQuote[])mapper.readValue(json, HistoricalMetalQuote[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public HistoricalMetalQuote getHistoricalMetalQuote(String symbol, String currency, String asOfDate, String fixingTime, String priceType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("Currency", String.valueOf(currency));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("FixingTime", String.valueOf(fixingTime));
         params.put("PriceType", String.valueOf(priceType));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalMetalQuote", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalMetalQuote)mapper.readValue(json, HistoricalMetalQuote.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public HistoricalMetalQuote getHistoricalMetalQuoteHTTP(String symbol, String currency, String asOfDate, String fixingTime, String priceType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("Currency", String.valueOf(currency));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("FixingTime", String.valueOf(fixingTime));
         params.put("PriceType", String.valueOf(priceType));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalMetalQuote", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalMetalQuote)mapper.readValue(json, HistoricalMetalQuote.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public HistoricalMetalQuote[] getHistoricalMetalQuotes(String symbols, String currency, String asOfDate, String fixingTime, String priceType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbols", String.valueOf(symbols));
         params.put("Currency", String.valueOf(currency));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("FixingTime", String.valueOf(fixingTime));
         params.put("PriceType", String.valueOf(priceType));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalMetalQuotes", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalMetalQuote[])mapper.readValue(json, HistoricalMetalQuote[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public HistoricalMetalQuote[] getHistoricalMetalQuotesHTTP(String symbols, String currency, String asOfDate, String fixingTime, String priceType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbols", String.valueOf(symbols));
         params.put("Currency", String.valueOf(currency));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("FixingTime", String.valueOf(fixingTime));
         params.put("PriceType", String.valueOf(priceType));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalMetalQuotes", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalMetalQuote[])mapper.readValue(json, HistoricalMetalQuote[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public HistoricalMetalQuote[] getHistoricalMetalQuotesRange(String symbol, String currency, String startDate, String endDate, String fixingTime, String periodType, String priceType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("Currency", String.valueOf(currency));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("FixingTime", String.valueOf(fixingTime));
         params.put("PeriodType", String.valueOf(periodType));
         params.put("PriceType", String.valueOf(priceType));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalMetalQuotesRange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalMetalQuote[])mapper.readValue(json, HistoricalMetalQuote[].class);
      } catch (Exception var11) {
         throw new XigniteApiException(var11.getMessage());
      }
   }

   public HistoricalMetalQuote[] getHistoricalMetalQuotesRangeHTTP(String symbol, String currency, String startDate, String endDate, String fixingTime, String periodType, String priceType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("Currency", String.valueOf(currency));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("FixingTime", String.valueOf(fixingTime));
         params.put("PeriodType", String.valueOf(periodType));
         params.put("PriceType", String.valueOf(priceType));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalMetalQuotesRange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalMetalQuote[])mapper.readValue(json, HistoricalMetalQuote[].class);
      } catch (Exception var11) {
         throw new XigniteApiException(var11.getMessage());
      }
   }

   public HistoricalMetalQuote[] getLondonHistoricalMetalQuotesRange(String symbol, String currency, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("Currency", String.valueOf(currency));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetLondonHistoricalMetalQuotesRange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalMetalQuote[])mapper.readValue(json, HistoricalMetalQuote[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public HistoricalMetalQuote[] getLondonHistoricalMetalQuotesRangeHTTP(String symbol, String currency, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("Currency", String.valueOf(currency));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetLondonHistoricalMetalQuotesRange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalMetalQuote[])mapper.readValue(json, HistoricalMetalQuote[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public Bar getBar(String symbol, String currency, String asOfDate, String asOfTime, String priceType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("Currency", String.valueOf(currency));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("AsOfTime", String.valueOf(asOfTime));
         params.put("PriceType", String.valueOf(priceType));
         String json = RestClient.get(this.endPointUrl + "/GetBar", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Bar)mapper.readValue(json, Bar.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public Bar getBarHTTP(String symbol, String currency, String asOfDate, String asOfTime, String priceType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("Currency", String.valueOf(currency));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("AsOfTime", String.valueOf(asOfTime));
         params.put("PriceType", String.valueOf(priceType));
         String json = RestClient.get(this.endPointUrl + "/GetBar", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Bar)mapper.readValue(json, Bar.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public Bar[] getBars(String symbol, String currency, String asOfDate, String startTime, String endTime, String priceType, String tickPrecision, int tickPeriods) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("Currency", String.valueOf(currency));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("StartTime", String.valueOf(startTime));
         params.put("EndTime", String.valueOf(endTime));
         params.put("PriceType", String.valueOf(priceType));
         params.put("TickPrecision", String.valueOf(tickPrecision));
         params.put("TickPeriods", String.valueOf(tickPeriods));
         String json = RestClient.get(this.endPointUrl + "/GetBars", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Bar[])mapper.readValue(json, Bar[].class);
      } catch (Exception var12) {
         throw new XigniteApiException(var12.getMessage());
      }
   }

   public Bar[] getBarsHTTP(String symbol, String currency, String asOfDate, String startTime, String endTime, String priceType, String tickPrecision, int tickPeriods) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("Currency", String.valueOf(currency));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("StartTime", String.valueOf(startTime));
         params.put("EndTime", String.valueOf(endTime));
         params.put("PriceType", String.valueOf(priceType));
         params.put("TickPrecision", String.valueOf(tickPrecision));
         params.put("TickPeriods", String.valueOf(tickPeriods));
         String json = RestClient.get(this.endPointUrl + "/GetBars", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Bar[])mapper.readValue(json, Bar[].class);
      } catch (Exception var12) {
         throw new XigniteApiException(var12.getMessage());
      }
   }

   public MetalChartBars getChartBars(String symbol, String currency, String startTime, String endTime, String priceType, String precision, int period) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("Currency", String.valueOf(currency));
         params.put("StartTime", String.valueOf(startTime));
         params.put("EndTime", String.valueOf(endTime));
         params.put("PriceType", String.valueOf(priceType));
         params.put("Precision", String.valueOf(precision));
         params.put("Period", String.valueOf(period));
         String json = RestClient.get(this.endPointUrl + "/GetChartBars", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (MetalChartBars)mapper.readValue(json, MetalChartBars.class);
      } catch (Exception var11) {
         throw new XigniteApiException(var11.getMessage());
      }
   }

   public MetalChartBars getChartBarsHTTP(String symbol, String currency, String startTime, String endTime, String priceType, String precision, int period) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("Currency", String.valueOf(currency));
         params.put("StartTime", String.valueOf(startTime));
         params.put("EndTime", String.valueOf(endTime));
         params.put("PriceType", String.valueOf(priceType));
         params.put("Precision", String.valueOf(precision));
         params.put("Period", String.valueOf(period));
         String json = RestClient.get(this.endPointUrl + "/GetChartBars", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (MetalChartBars)mapper.readValue(json, MetalChartBars.class);
      } catch (Exception var11) {
         throw new XigniteApiException(var11.getMessage());
      }
   }

   public BaseMetalPrice getBaseMetalPrice(String metalType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("MetalType", String.valueOf(metalType));
         String json = RestClient.get(this.endPointUrl + "/GetBaseMetalPrice", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (BaseMetalPrice)mapper.readValue(json, BaseMetalPrice.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public BaseMetalPrice getBaseMetalPriceHTTP(String metalType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("MetalType", String.valueOf(metalType));
         String json = RestClient.get(this.endPointUrl + "/GetBaseMetalPrice", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (BaseMetalPrice)mapper.readValue(json, BaseMetalPrice.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public LondonFixing getLondonFixing(String symbol, String currency) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("Currency", String.valueOf(currency));
         String json = RestClient.get(this.endPointUrl + "/GetLondonFixing", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (LondonFixing)mapper.readValue(json, LondonFixing.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public LondonFixing getLondonFixingHTTP(String symbol, String currency) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("Currency", String.valueOf(currency));
         String json = RestClient.get(this.endPointUrl + "/GetLondonFixing", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (LondonFixing)mapper.readValue(json, LondonFixing.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public LondonFixing[] getHistoricalLondonFixingRange(String symbol, String currency, String fixingType, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("Currency", String.valueOf(currency));
         params.put("FixingType", String.valueOf(fixingType));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalLondonFixingRange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (LondonFixing[])mapper.readValue(json, LondonFixing[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public LondonFixing[] getHistoricalLondonFixingRangeHTTP(String symbol, String currency, String fixingType, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("Currency", String.valueOf(currency));
         params.put("FixingType", String.valueOf(fixingType));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalLondonFixingRange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (LondonFixing[])mapper.readValue(json, LondonFixing[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public MarketNews[] getTopIndustryHeadlines(int count) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Count", String.valueOf(count));
         String json = RestClient.get(this.endPointUrl + "/GetTopIndustryHeadlines", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (MarketNews[])mapper.readValue(json, MarketNews[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public MarketNews[] getTopIndustryHeadlinesHTTP(int count) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Count", String.valueOf(count));
         String json = RestClient.get(this.endPointUrl + "/GetTopIndustryHeadlines", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (MarketNews[])mapper.readValue(json, MarketNews[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }
}
