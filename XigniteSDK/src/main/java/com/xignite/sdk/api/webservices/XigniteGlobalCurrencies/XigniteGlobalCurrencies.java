package com.xignite.sdk.api.webservices.XigniteGlobalCurrencies;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xignite.sdk.api.ApiBase;
import com.xignite.sdk.api.webservices.XigniteGlobalCurrencies.Models.Bar;
import com.xignite.sdk.api.webservices.XigniteGlobalCurrencies.Models.Currencies;
import com.xignite.sdk.api.webservices.XigniteGlobalCurrencies.Models.CurrencyChartBars;
import com.xignite.sdk.api.webservices.XigniteGlobalCurrencies.Models.ForwardRate;
import com.xignite.sdk.api.webservices.XigniteGlobalCurrencies.Models.HistoricalRate;
import com.xignite.sdk.api.webservices.XigniteGlobalCurrencies.Models.HistoricalRateBidAsk;
import com.xignite.sdk.api.webservices.XigniteGlobalCurrencies.Models.OfficialRates;
import com.xignite.sdk.api.webservices.XigniteGlobalCurrencies.Models.Rate;
import com.xignite.sdk.api.webservices.XigniteGlobalCurrencies.Models.RateConversion;
import com.xignite.sdk.api.webservices.XigniteGlobalCurrencies.Models.RateTable;
import com.xignite.sdk.exceptions.XigniteApiException;
import com.xignite.sdk.utilities.RestClient;
import java.util.LinkedHashMap;

public class XigniteGlobalCurrencies extends ApiBase {
   public XigniteGlobalCurrencies(String apiToken) {
      this.apiToken = apiToken;
      this.endPointUrl = "http://globalcurrencies.xignite.com/xGlobalCurrencies.json";
   }

   public Currencies listCurrencies() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListCurrencies", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Currencies)mapper.readValue(json, Currencies.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public Currencies listCurrenciesHTTP() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListCurrencies", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Currencies)mapper.readValue(json, Currencies.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public Currencies listActiveCurrencies() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListActiveCurrencies", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Currencies)mapper.readValue(json, Currencies.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public Currencies listActiveCurrenciesHTTP() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListActiveCurrencies", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Currencies)mapper.readValue(json, Currencies.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public OfficialRates listOfficialRates() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListOfficialRates", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (OfficialRates)mapper.readValue(json, OfficialRates.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public OfficialRates listOfficialRatesHTTP() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListOfficialRates", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (OfficialRates)mapper.readValue(json, OfficialRates.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public Rate getRealTimeRate(String symbol) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         String json = RestClient.get(this.endPointUrl + "/GetRealTimeRate", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Rate)mapper.readValue(json, Rate.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public Rate getRealTimeRateHTTP(String symbol) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         String json = RestClient.get(this.endPointUrl + "/GetRealTimeRate", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Rate)mapper.readValue(json, Rate.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public Rate[] getRealTimeRates(String symbols) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbols", String.valueOf(symbols));
         String json = RestClient.get(this.endPointUrl + "/GetRealTimeRates", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Rate[])mapper.readValue(json, Rate[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public Rate[] getRealTimeRatesHTTP(String symbols) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbols", String.valueOf(symbols));
         String json = RestClient.get(this.endPointUrl + "/GetRealTimeRates", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Rate[])mapper.readValue(json, Rate[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public RateTable getRealTimeRateTable(String symbols, String priceType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbols", String.valueOf(symbols));
         params.put("PriceType", String.valueOf(priceType));
         String json = RestClient.get(this.endPointUrl + "/GetRealTimeRateTable", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (RateTable)mapper.readValue(json, RateTable.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public RateTable getRealTimeRateTableHTTP(String symbols, String priceType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbols", String.valueOf(symbols));
         params.put("PriceType", String.valueOf(priceType));
         String json = RestClient.get(this.endPointUrl + "/GetRealTimeRateTable", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (RateTable)mapper.readValue(json, RateTable.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public Rate[] getAllRealTimeRates(String symbols) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbols", String.valueOf(symbols));
         String json = RestClient.get(this.endPointUrl + "/GetAllRealTimeRates", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Rate[])mapper.readValue(json, Rate[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public Rate[] getAllRealTimeRatesHTTP(String symbols) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbols", String.valueOf(symbols));
         String json = RestClient.get(this.endPointUrl + "/GetAllRealTimeRates", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Rate[])mapper.readValue(json, Rate[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public RateConversion convertRealTimeValue(String from, String to, double amount) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("From", String.valueOf(from));
         params.put("To", String.valueOf(to));
         params.put("Amount", String.valueOf(amount));
         String json = RestClient.get(this.endPointUrl + "/ConvertRealTimeValue", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (RateConversion)mapper.readValue(json, RateConversion.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public RateConversion convertRealTimeValueHTTP(String from, String to, double amount) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("From", String.valueOf(from));
         params.put("To", String.valueOf(to));
         params.put("Amount", String.valueOf(amount));
         String json = RestClient.get(this.endPointUrl + "/ConvertRealTimeValue", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (RateConversion)mapper.readValue(json, RateConversion.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public RateConversion convertHistoricalValue(String from, String to, double amount, String asOfDate, String fixingTime) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("From", String.valueOf(from));
         params.put("To", String.valueOf(to));
         params.put("Amount", String.valueOf(amount));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("FixingTime", String.valueOf(fixingTime));
         String json = RestClient.get(this.endPointUrl + "/ConvertHistoricalValue", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (RateConversion)mapper.readValue(json, RateConversion.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public RateConversion convertHistoricalValueHTTP(String from, String to, double amount, String asOfDate, String fixingTime) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("From", String.valueOf(from));
         params.put("To", String.valueOf(to));
         params.put("Amount", String.valueOf(amount));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("FixingTime", String.valueOf(fixingTime));
         String json = RestClient.get(this.endPointUrl + "/ConvertHistoricalValue", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (RateConversion)mapper.readValue(json, RateConversion.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public HistoricalRate getLatestHistoricalRate(String symbol, String asOfDate, String fixingTime, String priceType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("FixingTime", String.valueOf(fixingTime));
         params.put("PriceType", String.valueOf(priceType));
         String json = RestClient.get(this.endPointUrl + "/GetLatestHistoricalRate", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalRate)mapper.readValue(json, HistoricalRate.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public HistoricalRate getLatestHistoricalRateHTTP(String symbol, String asOfDate, String fixingTime, String priceType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("FixingTime", String.valueOf(fixingTime));
         params.put("PriceType", String.valueOf(priceType));
         String json = RestClient.get(this.endPointUrl + "/GetLatestHistoricalRate", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalRate)mapper.readValue(json, HistoricalRate.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public HistoricalRate[] getLatestHistoricalRates(String symbols, String asOfDate, String fixingTime, String priceType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbols", String.valueOf(symbols));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("FixingTime", String.valueOf(fixingTime));
         params.put("PriceType", String.valueOf(priceType));
         String json = RestClient.get(this.endPointUrl + "/GetLatestHistoricalRates", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalRate[])mapper.readValue(json, HistoricalRate[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public HistoricalRate[] getLatestHistoricalRatesHTTP(String symbols, String asOfDate, String fixingTime, String priceType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbols", String.valueOf(symbols));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("FixingTime", String.valueOf(fixingTime));
         params.put("PriceType", String.valueOf(priceType));
         String json = RestClient.get(this.endPointUrl + "/GetLatestHistoricalRates", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalRate[])mapper.readValue(json, HistoricalRate[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public HistoricalRate getHistoricalRate(String symbol, String asOfDate, String fixingTime, String priceType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("FixingTime", String.valueOf(fixingTime));
         params.put("PriceType", String.valueOf(priceType));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalRate", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalRate)mapper.readValue(json, HistoricalRate.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public HistoricalRate getHistoricalRateHTTP(String symbol, String asOfDate, String fixingTime, String priceType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("FixingTime", String.valueOf(fixingTime));
         params.put("PriceType", String.valueOf(priceType));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalRate", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalRate)mapper.readValue(json, HistoricalRate.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public HistoricalRate[] getHistoricalRates(String symbols, String asOfDate, String fixingTime, String priceType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbols", String.valueOf(symbols));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("FixingTime", String.valueOf(fixingTime));
         params.put("PriceType", String.valueOf(priceType));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalRates", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalRate[])mapper.readValue(json, HistoricalRate[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public HistoricalRate[] getHistoricalRatesHTTP(String symbols, String asOfDate, String fixingTime, String priceType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbols", String.valueOf(symbols));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("FixingTime", String.valueOf(fixingTime));
         params.put("PriceType", String.valueOf(priceType));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalRates", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalRate[])mapper.readValue(json, HistoricalRate[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public HistoricalRate[] getHistoricalRatesRange(String symbol, String startDate, String endDate, String fixingTime, String periodType, String priceType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("FixingTime", String.valueOf(fixingTime));
         params.put("PeriodType", String.valueOf(periodType));
         params.put("PriceType", String.valueOf(priceType));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalRatesRange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalRate[])mapper.readValue(json, HistoricalRate[].class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public HistoricalRate[] getHistoricalRatesRangeHTTP(String symbol, String startDate, String endDate, String fixingTime, String periodType, String priceType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("FixingTime", String.valueOf(fixingTime));
         params.put("PeriodType", String.valueOf(periodType));
         params.put("PriceType", String.valueOf(priceType));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalRatesRange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalRate[])mapper.readValue(json, HistoricalRate[].class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public HistoricalRate[] getHistoricalRatesRanges(String symbols, String startDate, String endDate, String fixingTime, String periodType, String priceType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbols", String.valueOf(symbols));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("FixingTime", String.valueOf(fixingTime));
         params.put("PeriodType", String.valueOf(periodType));
         params.put("PriceType", String.valueOf(priceType));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalRatesRanges", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalRate[])mapper.readValue(json, HistoricalRate[].class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public HistoricalRate[] getHistoricalRatesRangesHTTP(String symbols, String startDate, String endDate, String fixingTime, String periodType, String priceType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbols", String.valueOf(symbols));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("FixingTime", String.valueOf(fixingTime));
         params.put("PeriodType", String.valueOf(periodType));
         params.put("PriceType", String.valueOf(priceType));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalRatesRanges", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalRate[])mapper.readValue(json, HistoricalRate[].class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public HistoricalRate[] getLondonHistoricalRatesRange(String symbol, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetLondonHistoricalRatesRange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalRate[])mapper.readValue(json, HistoricalRate[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public HistoricalRate[] getLondonHistoricalRatesRangeHTTP(String symbol, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetLondonHistoricalRatesRange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalRate[])mapper.readValue(json, HistoricalRate[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public Bar getBar(String symbol, String asOfDate, String asOfTime, String priceType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("AsOfTime", String.valueOf(asOfTime));
         params.put("PriceType", String.valueOf(priceType));
         String json = RestClient.get(this.endPointUrl + "/GetBar", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Bar)mapper.readValue(json, Bar.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public Bar getBarHTTP(String symbol, String asOfDate, String asOfTime, String priceType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("AsOfTime", String.valueOf(asOfTime));
         params.put("PriceType", String.valueOf(priceType));
         String json = RestClient.get(this.endPointUrl + "/GetBar", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Bar)mapper.readValue(json, Bar.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public Bar[] getBars(String symbol, String asOfDate, String startTime, String endTime, String priceType, String tickPrecision, int tickPeriods) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
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
      } catch (Exception var11) {
         throw new XigniteApiException(var11.getMessage());
      }
   }

   public Bar[] getBarsHTTP(String symbol, String asOfDate, String startTime, String endTime, String priceType, String tickPrecision, int tickPeriods) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
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
      } catch (Exception var11) {
         throw new XigniteApiException(var11.getMessage());
      }
   }

   public CurrencyChartBars getChartBars(String symbol, String startTime, String endTime, String priceType, String precision, int period) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("StartTime", String.valueOf(startTime));
         params.put("EndTime", String.valueOf(endTime));
         params.put("PriceType", String.valueOf(priceType));
         params.put("Precision", String.valueOf(precision));
         params.put("Period", String.valueOf(period));
         String json = RestClient.get(this.endPointUrl + "/GetChartBars", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CurrencyChartBars)mapper.readValue(json, CurrencyChartBars.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public CurrencyChartBars getChartBarsHTTP(String symbol, String startTime, String endTime, String priceType, String precision, int period) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("StartTime", String.valueOf(startTime));
         params.put("EndTime", String.valueOf(endTime));
         params.put("PriceType", String.valueOf(priceType));
         params.put("Precision", String.valueOf(precision));
         params.put("Period", String.valueOf(period));
         String json = RestClient.get(this.endPointUrl + "/GetChartBars", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CurrencyChartBars)mapper.readValue(json, CurrencyChartBars.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public HistoricalRateBidAsk getOfficialRate(String country, String symbol, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Country", String.valueOf(country));
         params.put("Symbol", String.valueOf(symbol));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetOfficialRate", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalRateBidAsk)mapper.readValue(json, HistoricalRateBidAsk.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public HistoricalRateBidAsk getOfficialRateHTTP(String country, String symbol, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Country", String.valueOf(country));
         params.put("Symbol", String.valueOf(symbol));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetOfficialRate", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalRateBidAsk)mapper.readValue(json, HistoricalRateBidAsk.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public HistoricalRateBidAsk[] getOfficialRates(String country, String symbols, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Country", String.valueOf(country));
         params.put("Symbols", String.valueOf(symbols));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetOfficialRates", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalRateBidAsk[])mapper.readValue(json, HistoricalRateBidAsk[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public HistoricalRateBidAsk[] getOfficialRatesHTTP(String country, String symbols, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Country", String.valueOf(country));
         params.put("Symbols", String.valueOf(symbols));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetOfficialRates", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalRateBidAsk[])mapper.readValue(json, HistoricalRateBidAsk[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public HistoricalRate getOfficialHistoricalRate(String country, String symbol, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Country", String.valueOf(country));
         params.put("Symbol", String.valueOf(symbol));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetOfficialHistoricalRate", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalRate)mapper.readValue(json, HistoricalRate.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public HistoricalRate getOfficialHistoricalRateHTTP(String country, String symbol, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Country", String.valueOf(country));
         params.put("Symbol", String.valueOf(symbol));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetOfficialHistoricalRate", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalRate)mapper.readValue(json, HistoricalRate.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public HistoricalRate[] getOfficialHistoricalRates(String country, String symbols, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Country", String.valueOf(country));
         params.put("Symbols", String.valueOf(symbols));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetOfficialHistoricalRates", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalRate[])mapper.readValue(json, HistoricalRate[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public HistoricalRate[] getOfficialHistoricalRatesHTTP(String country, String symbols, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Country", String.valueOf(country));
         params.put("Symbols", String.valueOf(symbols));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetOfficialHistoricalRates", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalRate[])mapper.readValue(json, HistoricalRate[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public ForwardRate getForwardRate(String symbol) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         String json = RestClient.get(this.endPointUrl + "/GetForwardRate", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ForwardRate)mapper.readValue(json, ForwardRate.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public ForwardRate getForwardRateHTTP(String symbol) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         String json = RestClient.get(this.endPointUrl + "/GetForwardRate", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ForwardRate)mapper.readValue(json, ForwardRate.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }
}
