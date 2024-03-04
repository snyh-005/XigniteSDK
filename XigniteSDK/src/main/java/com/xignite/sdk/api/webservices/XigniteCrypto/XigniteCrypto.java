package com.xignite.sdk.api.webservices.XigniteCrypto;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xignite.sdk.api.ApiBase;
import com.xignite.sdk.api.webservices.XigniteCrypto.Models.CryptoChartBars;
import com.xignite.sdk.api.webservices.XigniteCrypto.Models.CryptoExchangeHistoricalQuote;
import com.xignite.sdk.api.webservices.XigniteCrypto.Models.CryptoExchangeQuote;
import com.xignite.sdk.api.webservices.XigniteCrypto.Models.CryptoHistoricalQuote;
import com.xignite.sdk.api.webservices.XigniteCrypto.Models.CryptoHistoricalQuoteRange;
import com.xignite.sdk.api.webservices.XigniteCrypto.Models.CryptoList;
import com.xignite.sdk.api.webservices.XigniteCrypto.Models.CryptoQuote;
import com.xignite.sdk.api.webservices.XigniteCrypto.Models.CryptoReferenceData;
import com.xignite.sdk.api.webservices.XigniteCrypto.Models.ExchangeList;
import com.xignite.sdk.api.webservices.XigniteCrypto.Models.NewsCategoryList;
import com.xignite.sdk.api.webservices.XigniteCrypto.Models.NewsSourceList;
import com.xignite.sdk.api.webservices.XigniteCrypto.Models.ReferenceDataList;
import com.xignite.sdk.api.webservices.XigniteCrypto.Models.TopCoinList;
import com.xignite.sdk.api.webservices.XigniteCrypto.Models.TopCryptoHeadlines;
import com.xignite.sdk.api.webservices.XigniteCrypto.Models.TopMarketHeadlines;
import com.xignite.sdk.exceptions.XigniteApiException;
import com.xignite.sdk.utilities.RestClient;
import java.util.LinkedHashMap;

public class XigniteCrypto extends ApiBase {
   public XigniteCrypto(String apiToken) {
      this.apiToken = apiToken;
      this.endPointUrl = "http://crypto.xignite.com/xCrypto.json";
   }

   public CryptoList listCryptos(String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/ListCryptos", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CryptoList)mapper.readValue(json, CryptoList.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public CryptoList listCryptosHTTP(String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/ListCryptos", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CryptoList)mapper.readValue(json, CryptoList.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
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

   public NewsCategoryList listNewsCategories() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListNewsCategories", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (NewsCategoryList)mapper.readValue(json, NewsCategoryList.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public NewsCategoryList listNewsCategoriesHTTP() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListNewsCategories", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (NewsCategoryList)mapper.readValue(json, NewsCategoryList.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public NewsSourceList listNewsSources() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListNewsSources", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (NewsSourceList)mapper.readValue(json, NewsSourceList.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public NewsSourceList listNewsSourcesHTTP() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListNewsSources", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (NewsSourceList)mapper.readValue(json, NewsSourceList.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public ReferenceDataList listReferenceData() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListReferenceData", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ReferenceDataList)mapper.readValue(json, ReferenceDataList.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public ReferenceDataList listReferenceDataHTTP() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListReferenceData", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ReferenceDataList)mapper.readValue(json, ReferenceDataList.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public TopCoinList listTopCoins(String type, int count) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("type", String.valueOf(type));
         params.put("count", String.valueOf(count));
         String json = RestClient.get(this.endPointUrl + "/ListTopCoins", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (TopCoinList)mapper.readValue(json, TopCoinList.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public TopCoinList listTopCoinsHTTP(String type, int count) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("type", String.valueOf(type));
         params.put("count", String.valueOf(count));
         String json = RestClient.get(this.endPointUrl + "/ListTopCoins", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (TopCoinList)mapper.readValue(json, TopCoinList.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public CryptoQuote[] getQuotes(String symbols, String currency) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("symbols", String.valueOf(symbols));
         params.put("currency", String.valueOf(currency));
         String json = RestClient.get(this.endPointUrl + "/GetQuotes", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CryptoQuote[])mapper.readValue(json, CryptoQuote[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public CryptoQuote[] getQuotesHTTP(String symbols, String currency) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("symbols", String.valueOf(symbols));
         params.put("currency", String.valueOf(currency));
         String json = RestClient.get(this.endPointUrl + "/GetQuotes", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CryptoQuote[])mapper.readValue(json, CryptoQuote[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public CryptoExchangeQuote[] getExchangeQuotes(String identifiers, String currency) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("identifiers", String.valueOf(identifiers));
         params.put("currency", String.valueOf(currency));
         String json = RestClient.get(this.endPointUrl + "/GetExchangeQuotes", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CryptoExchangeQuote[])mapper.readValue(json, CryptoExchangeQuote[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public CryptoExchangeQuote[] getExchangeQuotesHTTP(String identifiers, String currency) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("identifiers", String.valueOf(identifiers));
         params.put("currency", String.valueOf(currency));
         String json = RestClient.get(this.endPointUrl + "/GetExchangeQuotes", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CryptoExchangeQuote[])mapper.readValue(json, CryptoExchangeQuote[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public CryptoHistoricalQuote[] getHistoricalQuotes(String symbols, String currency, String asOfDate, String fixingTime) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("symbols", String.valueOf(symbols));
         params.put("currency", String.valueOf(currency));
         params.put("asOfDate", String.valueOf(asOfDate));
         params.put("fixingTime", String.valueOf(fixingTime));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalQuotes", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CryptoHistoricalQuote[])mapper.readValue(json, CryptoHistoricalQuote[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public CryptoHistoricalQuote[] getHistoricalQuotesHTTP(String symbols, String currency, String asOfDate, String fixingTime) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("symbols", String.valueOf(symbols));
         params.put("currency", String.valueOf(currency));
         params.put("asOfDate", String.valueOf(asOfDate));
         params.put("fixingTime", String.valueOf(fixingTime));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalQuotes", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CryptoHistoricalQuote[])mapper.readValue(json, CryptoHistoricalQuote[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public CryptoHistoricalQuoteRange getHistoricalQuoteRange(String symbol, String currency, String startDate, String endDate, String fixingTime, String periodType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("symbol", String.valueOf(symbol));
         params.put("currency", String.valueOf(currency));
         params.put("startDate", String.valueOf(startDate));
         params.put("endDate", String.valueOf(endDate));
         params.put("fixingTime", String.valueOf(fixingTime));
         params.put("periodType", String.valueOf(periodType));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalQuoteRange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CryptoHistoricalQuoteRange)mapper.readValue(json, CryptoHistoricalQuoteRange.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public CryptoHistoricalQuoteRange getHistoricalQuoteRangeHTTP(String symbol, String currency, String startDate, String endDate, String fixingTime, String periodType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("symbol", String.valueOf(symbol));
         params.put("currency", String.valueOf(currency));
         params.put("startDate", String.valueOf(startDate));
         params.put("endDate", String.valueOf(endDate));
         params.put("fixingTime", String.valueOf(fixingTime));
         params.put("periodType", String.valueOf(periodType));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalQuoteRange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CryptoHistoricalQuoteRange)mapper.readValue(json, CryptoHistoricalQuoteRange.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public CryptoExchangeHistoricalQuote[] getExchangeHistoricalQuoteRange(String identifier, String currency, String startDate, String endDate, String fixingTime, String periodType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("identifier", String.valueOf(identifier));
         params.put("currency", String.valueOf(currency));
         params.put("startDate", String.valueOf(startDate));
         params.put("endDate", String.valueOf(endDate));
         params.put("fixingTime", String.valueOf(fixingTime));
         params.put("periodType", String.valueOf(periodType));
         String json = RestClient.get(this.endPointUrl + "/GetExchangeHistoricalQuoteRange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CryptoExchangeHistoricalQuote[])mapper.readValue(json, CryptoExchangeHistoricalQuote[].class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public CryptoExchangeHistoricalQuote[] getExchangeHistoricalQuoteRangeHTTP(String identifier, String currency, String startDate, String endDate, String fixingTime, String periodType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("identifier", String.valueOf(identifier));
         params.put("currency", String.valueOf(currency));
         params.put("startDate", String.valueOf(startDate));
         params.put("endDate", String.valueOf(endDate));
         params.put("fixingTime", String.valueOf(fixingTime));
         params.put("periodType", String.valueOf(periodType));
         String json = RestClient.get(this.endPointUrl + "/GetExchangeHistoricalQuoteRange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CryptoExchangeHistoricalQuote[])mapper.readValue(json, CryptoExchangeHistoricalQuote[].class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public TopMarketHeadlines getTopMarketHeadlines(String newsSources, String categories, String excludeCategories, String startDateTime, String count) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("newsSources", String.valueOf(newsSources));
         params.put("categories", String.valueOf(categories));
         params.put("excludeCategories", String.valueOf(excludeCategories));
         params.put("startDateTime", String.valueOf(startDateTime));
         params.put("count", String.valueOf(count));
         String json = RestClient.get(this.endPointUrl + "/GetTopMarketHeadlines", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (TopMarketHeadlines)mapper.readValue(json, TopMarketHeadlines.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public TopMarketHeadlines getTopMarketHeadlinesHTTP(String newsSources, String categories, String excludeCategories, String startDateTime, String count) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("newsSources", String.valueOf(newsSources));
         params.put("categories", String.valueOf(categories));
         params.put("excludeCategories", String.valueOf(excludeCategories));
         params.put("startDateTime", String.valueOf(startDateTime));
         params.put("count", String.valueOf(count));
         String json = RestClient.get(this.endPointUrl + "/GetTopMarketHeadlines", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (TopMarketHeadlines)mapper.readValue(json, TopMarketHeadlines.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public TopCryptoHeadlines getTopCryptoHeadlines(String symbols, String excludeCategories, String startDateTime, String count) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("symbols", String.valueOf(symbols));
         params.put("excludeCategories", String.valueOf(excludeCategories));
         params.put("startDateTime", String.valueOf(startDateTime));
         params.put("count", String.valueOf(count));
         String json = RestClient.get(this.endPointUrl + "/GetTopCryptoHeadlines", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (TopCryptoHeadlines)mapper.readValue(json, TopCryptoHeadlines.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public TopCryptoHeadlines getTopCryptoHeadlinesHTTP(String symbols, String excludeCategories, String startDateTime, String count) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("symbols", String.valueOf(symbols));
         params.put("excludeCategories", String.valueOf(excludeCategories));
         params.put("startDateTime", String.valueOf(startDateTime));
         params.put("count", String.valueOf(count));
         String json = RestClient.get(this.endPointUrl + "/GetTopCryptoHeadlines", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (TopCryptoHeadlines)mapper.readValue(json, TopCryptoHeadlines.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public CryptoReferenceData[] getReferenceData(String symbols, String dataTypes, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("symbols", String.valueOf(symbols));
         params.put("dataTypes", String.valueOf(dataTypes));
         params.put("asOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetReferenceData", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CryptoReferenceData[])mapper.readValue(json, CryptoReferenceData[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public CryptoReferenceData[] getReferenceDataHTTP(String symbols, String dataTypes, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("symbols", String.valueOf(symbols));
         params.put("dataTypes", String.valueOf(dataTypes));
         params.put("asOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetReferenceData", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CryptoReferenceData[])mapper.readValue(json, CryptoReferenceData[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public CryptoChartBars getChartBars(String identifier, String startTime, String endTime, String precision, int period, String currency) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("identifier", String.valueOf(identifier));
         params.put("startTime", String.valueOf(startTime));
         params.put("endTime", String.valueOf(endTime));
         params.put("precision", String.valueOf(precision));
         params.put("period", String.valueOf(period));
         params.put("currency", String.valueOf(currency));
         String json = RestClient.get(this.endPointUrl + "/GetChartBars", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CryptoChartBars)mapper.readValue(json, CryptoChartBars.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public CryptoChartBars getChartBarsHTTP(String identifier, String startTime, String endTime, String precision, int period, String currency) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("identifier", String.valueOf(identifier));
         params.put("startTime", String.valueOf(startTime));
         params.put("endTime", String.valueOf(endTime));
         params.put("precision", String.valueOf(precision));
         params.put("period", String.valueOf(period));
         params.put("currency", String.valueOf(currency));
         String json = RestClient.get(this.endPointUrl + "/GetChartBars", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CryptoChartBars)mapper.readValue(json, CryptoChartBars.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }
}
