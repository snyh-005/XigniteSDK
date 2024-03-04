package com.xignite.sdk.api.webservices.XigniteGlobalExchanges;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xignite.sdk.api.ApiBase;
import com.xignite.sdk.api.webservices.XigniteGlobalExchanges.Models.BooleanResult;
import com.xignite.sdk.api.webservices.XigniteGlobalExchanges.Models.DayCount;
import com.xignite.sdk.api.webservices.XigniteGlobalExchanges.Models.Exchange;
import com.xignite.sdk.api.webservices.XigniteGlobalExchanges.Models.ExchangeDate;
import com.xignite.sdk.api.webservices.XigniteGlobalExchanges.Models.ExchangeHoliday;
import com.xignite.sdk.api.webservices.XigniteGlobalExchanges.Models.ExchangeHours;
import com.xignite.sdk.api.webservices.XigniteGlobalExchanges.Models.ExchangeSchedule;
import com.xignite.sdk.api.webservices.XigniteGlobalExchanges.Models.ExchangeStatus;
import com.xignite.sdk.api.webservices.XigniteGlobalExchanges.Models.SettlementSchedule;
import com.xignite.sdk.api.webservices.XigniteGlobalExchanges.Models.StringResult;
import com.xignite.sdk.exceptions.XigniteApiException;
import com.xignite.sdk.utilities.RestClient;
import java.util.LinkedHashMap;

public class XigniteGlobalExchanges extends ApiBase {
   public XigniteGlobalExchanges(String apiToken) {
      this.apiToken = apiToken;
      this.endPointUrl = "http://globalexchanges.xignite.com/xGlobalExchanges.json";
   }

   public Exchange[] getExchanges() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/GetExchanges", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Exchange[])mapper.readValue(json, Exchange[].class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public Exchange[] getExchangesHTTP() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/GetExchanges", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Exchange[])mapper.readValue(json, Exchange[].class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public ExchangeSchedule isExchangeOpenOnDate(String exchange, String onDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("OnDate", String.valueOf(onDate));
         String json = RestClient.get(this.endPointUrl + "/IsExchangeOpenOnDate", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeSchedule)mapper.readValue(json, ExchangeSchedule.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public ExchangeSchedule isExchangeOpenOnDateHTTP(String exchange, String onDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("OnDate", String.valueOf(onDate));
         String json = RestClient.get(this.endPointUrl + "/IsExchangeOpenOnDate", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeSchedule)mapper.readValue(json, ExchangeSchedule.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public BooleanResult isExchangeOpen(String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/IsExchangeOpen", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (BooleanResult)mapper.readValue(json, BooleanResult.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public BooleanResult isExchangeOpenHTTP(String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/IsExchangeOpen", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (BooleanResult)mapper.readValue(json, BooleanResult.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public ExchangeStatus[] areExchangesOpen(String exchanges) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchanges", String.valueOf(exchanges));
         String json = RestClient.get(this.endPointUrl + "/AreExchangesOpen", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeStatus[])mapper.readValue(json, ExchangeStatus[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public ExchangeStatus[] areExchangesOpenHTTP(String exchanges) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchanges", String.valueOf(exchanges));
         String json = RestClient.get(this.endPointUrl + "/AreExchangesOpen", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeStatus[])mapper.readValue(json, ExchangeStatus[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public ExchangeDate getNextExchangeDate(String exchange, String forDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("ForDate", String.valueOf(forDate));
         String json = RestClient.get(this.endPointUrl + "/GetNextExchangeDate", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeDate)mapper.readValue(json, ExchangeDate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public ExchangeDate getNextExchangeDateHTTP(String exchange, String forDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("ForDate", String.valueOf(forDate));
         String json = RestClient.get(this.endPointUrl + "/GetNextExchangeDate", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeDate)mapper.readValue(json, ExchangeDate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public ExchangeDate getPriorExchangeDate(String exchange, String forDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("ForDate", String.valueOf(forDate));
         String json = RestClient.get(this.endPointUrl + "/GetPriorExchangeDate", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeDate)mapper.readValue(json, ExchangeDate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public ExchangeDate getPriorExchangeDateHTTP(String exchange, String forDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("ForDate", String.valueOf(forDate));
         String json = RestClient.get(this.endPointUrl + "/GetPriorExchangeDate", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeDate)mapper.readValue(json, ExchangeDate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public StringResult getExchangeDate(String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/GetExchangeDate", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (StringResult)mapper.readValue(json, StringResult.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public StringResult getExchangeDateHTTP(String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/GetExchangeDate", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (StringResult)mapper.readValue(json, StringResult.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public StringResult getExchangeTime(String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/GetExchangeTime", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (StringResult)mapper.readValue(json, StringResult.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public StringResult getExchangeTimeHTTP(String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/GetExchangeTime", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (StringResult)mapper.readValue(json, StringResult.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public StringResult getExchangeDay(String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/GetExchangeDay", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (StringResult)mapper.readValue(json, StringResult.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public StringResult getExchangeDayHTTP(String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/GetExchangeDay", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (StringResult)mapper.readValue(json, StringResult.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public DayCount getExchangeDayCount(String exchange, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetExchangeDayCount", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (DayCount)mapper.readValue(json, DayCount.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public DayCount getExchangeDayCountHTTP(String exchange, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetExchangeDayCount", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (DayCount)mapper.readValue(json, DayCount.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public ExchangeHoliday isExchangeHoliday(String exchange, String forDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("ForDate", String.valueOf(forDate));
         String json = RestClient.get(this.endPointUrl + "/IsExchangeHoliday", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeHoliday)mapper.readValue(json, ExchangeHoliday.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public ExchangeHoliday isExchangeHolidayHTTP(String exchange, String forDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("ForDate", String.valueOf(forDate));
         String json = RestClient.get(this.endPointUrl + "/IsExchangeHoliday", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeHoliday)mapper.readValue(json, ExchangeHoliday.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public ExchangeHoliday[] getExchangeHolidays(String exchange, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetExchangeHolidays", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeHoliday[])mapper.readValue(json, ExchangeHoliday[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public ExchangeHoliday[] getExchangeHolidaysHTTP(String exchange, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetExchangeHolidays", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeHoliday[])mapper.readValue(json, ExchangeHoliday[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public ExchangeHoliday[] listHolidays(String exchange, int forYear) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("ForYear", String.valueOf(forYear));
         String json = RestClient.get(this.endPointUrl + "/ListHolidays", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeHoliday[])mapper.readValue(json, ExchangeHoliday[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public ExchangeHoliday[] listHolidaysHTTP(String exchange, int forYear) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("ForYear", String.valueOf(forYear));
         String json = RestClient.get(this.endPointUrl + "/ListHolidays", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeHoliday[])mapper.readValue(json, ExchangeHoliday[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public ExchangeHours getExchangeHours(String exchange, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetExchangeHours", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeHours)mapper.readValue(json, ExchangeHours.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public ExchangeHours getExchangeHoursHTTP(String exchange, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetExchangeHours", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeHours)mapper.readValue(json, ExchangeHours.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public ExchangeHours[] getExchangeHoursRange(String exchange, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetExchangeHoursRange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeHours[])mapper.readValue(json, ExchangeHours[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public ExchangeHours[] getExchangeHoursRangeHTTP(String exchange, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetExchangeHoursRange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeHours[])mapper.readValue(json, ExchangeHours[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public ExchangeHours getExchangeHoursUTC(String exchange, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetExchangeHoursUTC", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeHours)mapper.readValue(json, ExchangeHours.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public ExchangeHours getExchangeHoursUTCHTTP(String exchange, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetExchangeHoursUTC", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeHours)mapper.readValue(json, ExchangeHours.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public ExchangeHours[] getExchangeHoursUTCRange(String exchange, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetExchangeHoursUTCRange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeHours[])mapper.readValue(json, ExchangeHours[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public ExchangeHours[] getExchangeHoursUTCRangeHTTP(String exchange, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetExchangeHoursUTCRange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeHours[])mapper.readValue(json, ExchangeHours[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public SettlementSchedule getSettlementDate(String exchange, String tradeDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("TradeDate", String.valueOf(tradeDate));
         String json = RestClient.get(this.endPointUrl + "/GetSettlementDate", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SettlementSchedule)mapper.readValue(json, SettlementSchedule.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public SettlementSchedule getSettlementDateHTTP(String exchange, String tradeDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("TradeDate", String.valueOf(tradeDate));
         String json = RestClient.get(this.endPointUrl + "/GetSettlementDate", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SettlementSchedule)mapper.readValue(json, SettlementSchedule.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }
}
