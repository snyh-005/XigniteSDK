package com.xignite.sdk.api.webservices.XigniteGlobalHolidays;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xignite.sdk.api.ApiBase;
import com.xignite.sdk.api.webservices.XigniteGlobalHolidays.Models.Currency;
import com.xignite.sdk.api.webservices.XigniteGlobalHolidays.Models.Exchange;
import com.xignite.sdk.api.webservices.XigniteGlobalHolidays.Models.ExchangeDateTime;
import com.xignite.sdk.api.webservices.XigniteGlobalHolidays.Models.ExchangeHours;
import com.xignite.sdk.api.webservices.XigniteGlobalHolidays.Models.ExchangePhases;
import com.xignite.sdk.api.webservices.XigniteGlobalHolidays.Models.ExchangeSchedule;
import com.xignite.sdk.api.webservices.XigniteGlobalHolidays.Models.ExchangeStatus;
import com.xignite.sdk.api.webservices.XigniteGlobalHolidays.Models.FinancialCenter;
import com.xignite.sdk.api.webservices.XigniteGlobalHolidays.Models.Holiday;
import com.xignite.sdk.api.webservices.XigniteGlobalHolidays.Models.IntegerResult;
import com.xignite.sdk.api.webservices.XigniteGlobalHolidays.Models.LocationTypes;
import com.xignite.sdk.api.webservices.XigniteGlobalHolidays.Models.SettlementSchedule;
import com.xignite.sdk.api.webservices.XigniteGlobalHolidays.Models.StringResult;
import com.xignite.sdk.api.webservices.XigniteGlobalHolidays.Models.TimeZones;
import com.xignite.sdk.exceptions.XigniteApiException;
import com.xignite.sdk.utilities.RestClient;
import java.util.LinkedHashMap;

public class XigniteGlobalHolidays extends ApiBase {
   public XigniteGlobalHolidays(String apiToken) {
      this.apiToken = apiToken;
      this.endPointUrl = "http://globalholidays.xignite.com/xGlobalHolidays.json";
   }

   public Currency[] listCurrencies() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListCurrencies", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Currency[])mapper.readValue(json, Currency[].class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public Currency[] listCurrenciesHTTP() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListCurrencies", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Currency[])mapper.readValue(json, Currency[].class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public Exchange[] listExchanges() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListExchanges", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Exchange[])mapper.readValue(json, Exchange[].class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public Exchange[] listExchangesHTTP() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListExchanges", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Exchange[])mapper.readValue(json, Exchange[].class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public FinancialCenter[] listFinancialCenters() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListFinancialCenters", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FinancialCenter[])mapper.readValue(json, FinancialCenter[].class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public FinancialCenter[] listFinancialCentersHTTP() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListFinancialCenters", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FinancialCenter[])mapper.readValue(json, FinancialCenter[].class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public Holiday[] listHolidays(String location, LocationTypes locationType, int year) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Location", String.valueOf(location));
         params.put("LocationType", String.valueOf(locationType));
         params.put("Year", String.valueOf(year));
         String json = RestClient.get(this.endPointUrl + "/ListHolidays", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Holiday[])mapper.readValue(json, Holiday[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public Holiday[] listHolidaysHTTP(String location, LocationTypes locationType, int year) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Location", String.valueOf(location));
         params.put("LocationType", String.valueOf(locationType));
         params.put("Year", String.valueOf(year));
         String json = RestClient.get(this.endPointUrl + "/ListHolidays", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Holiday[])mapper.readValue(json, Holiday[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
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

   public ExchangeSchedule isSettlementDate(String exchange, String date) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("Date", String.valueOf(date));
         String json = RestClient.get(this.endPointUrl + "/IsSettlementDate", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeSchedule)mapper.readValue(json, ExchangeSchedule.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public ExchangeSchedule isSettlementDateHTTP(String exchange, String date) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("Date", String.valueOf(date));
         String json = RestClient.get(this.endPointUrl + "/IsSettlementDate", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeSchedule)mapper.readValue(json, ExchangeSchedule.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public ExchangeSchedule isExchangeOpenOnDate(String exchange, String date) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("Date", String.valueOf(date));
         String json = RestClient.get(this.endPointUrl + "/IsExchangeOpenOnDate", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeSchedule)mapper.readValue(json, ExchangeSchedule.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public ExchangeSchedule isExchangeOpenOnDateHTTP(String exchange, String date) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("Date", String.valueOf(date));
         String json = RestClient.get(this.endPointUrl + "/IsExchangeOpenOnDate", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeSchedule)mapper.readValue(json, ExchangeSchedule.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public IntegerResult getDayCount(String location, LocationTypes locationType, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Location", String.valueOf(location));
         params.put("LocationType", String.valueOf(locationType));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetDayCount", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IntegerResult)mapper.readValue(json, IntegerResult.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public IntegerResult getDayCountHTTP(String location, LocationTypes locationType, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Location", String.valueOf(location));
         params.put("LocationType", String.valueOf(locationType));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetDayCount", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IntegerResult)mapper.readValue(json, IntegerResult.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public ExchangeDateTime getExchangeDateTime(String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/GetExchangeDateTime", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeDateTime)mapper.readValue(json, ExchangeDateTime.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public ExchangeDateTime getExchangeDateTimeHTTP(String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/GetExchangeDateTime", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeDateTime)mapper.readValue(json, ExchangeDateTime.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public ExchangeHours getExchangeHours(String exchange, String date, TimeZones timeZone) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("Date", String.valueOf(date));
         params.put("TimeZone", String.valueOf(timeZone));
         String json = RestClient.get(this.endPointUrl + "/GetExchangeHours", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeHours)mapper.readValue(json, ExchangeHours.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public ExchangeHours getExchangeHoursHTTP(String exchange, String date, TimeZones timeZone) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("Date", String.valueOf(date));
         params.put("TimeZone", String.valueOf(timeZone));
         String json = RestClient.get(this.endPointUrl + "/GetExchangeHours", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeHours)mapper.readValue(json, ExchangeHours.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public ExchangeHours[] getExchangeHoursRange(String exchange, String startDate, String endDate, TimeZones timeZone) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("TimeZone", String.valueOf(timeZone));
         String json = RestClient.get(this.endPointUrl + "/GetExchangeHoursRange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeHours[])mapper.readValue(json, ExchangeHours[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public ExchangeHours[] getExchangeHoursRangeHTTP(String exchange, String startDate, String endDate, TimeZones timeZone) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("TimeZone", String.valueOf(timeZone));
         String json = RestClient.get(this.endPointUrl + "/GetExchangeHoursRange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeHours[])mapper.readValue(json, ExchangeHours[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public ExchangePhases getExchangePhases(String exchange, String date, TimeZones timeZone) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("Date", String.valueOf(date));
         params.put("TimeZone", String.valueOf(timeZone));
         String json = RestClient.get(this.endPointUrl + "/GetExchangePhases", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangePhases)mapper.readValue(json, ExchangePhases.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public ExchangePhases getExchangePhasesHTTP(String exchange, String date, TimeZones timeZone) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("Date", String.valueOf(date));
         params.put("TimeZone", String.valueOf(timeZone));
         String json = RestClient.get(this.endPointUrl + "/GetExchangePhases", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangePhases)mapper.readValue(json, ExchangePhases.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public Holiday[] getHolidays(String location, LocationTypes locationType, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Location", String.valueOf(location));
         params.put("LocationType", String.valueOf(locationType));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetHolidays", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Holiday[])mapper.readValue(json, Holiday[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public Holiday[] getHolidaysHTTP(String location, LocationTypes locationType, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Location", String.valueOf(location));
         params.put("LocationType", String.valueOf(locationType));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetHolidays", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Holiday[])mapper.readValue(json, Holiday[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public StringResult getNextDate(String location, LocationTypes locationType, String date) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Location", String.valueOf(location));
         params.put("LocationType", String.valueOf(locationType));
         params.put("Date", String.valueOf(date));
         String json = RestClient.get(this.endPointUrl + "/GetNextDate", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (StringResult)mapper.readValue(json, StringResult.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public StringResult getNextDateHTTP(String location, LocationTypes locationType, String date) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Location", String.valueOf(location));
         params.put("LocationType", String.valueOf(locationType));
         params.put("Date", String.valueOf(date));
         String json = RestClient.get(this.endPointUrl + "/GetNextDate", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (StringResult)mapper.readValue(json, StringResult.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public StringResult getPriorDate(String location, LocationTypes locationType, String date) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Location", String.valueOf(location));
         params.put("LocationType", String.valueOf(locationType));
         params.put("Date", String.valueOf(date));
         String json = RestClient.get(this.endPointUrl + "/GetPriorDate", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (StringResult)mapper.readValue(json, StringResult.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public StringResult getPriorDateHTTP(String location, LocationTypes locationType, String date) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Location", String.valueOf(location));
         params.put("LocationType", String.valueOf(locationType));
         params.put("Date", String.valueOf(date));
         String json = RestClient.get(this.endPointUrl + "/GetPriorDate", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (StringResult)mapper.readValue(json, StringResult.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public SettlementSchedule getSettlementDate(String exchange, String date) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("Date", String.valueOf(date));
         String json = RestClient.get(this.endPointUrl + "/GetSettlementDate", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SettlementSchedule)mapper.readValue(json, SettlementSchedule.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public SettlementSchedule getSettlementDateHTTP(String exchange, String date) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("Date", String.valueOf(date));
         String json = RestClient.get(this.endPointUrl + "/GetSettlementDate", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SettlementSchedule)mapper.readValue(json, SettlementSchedule.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }
}
