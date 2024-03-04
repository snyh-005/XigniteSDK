package com.xignite.sdk.api.webservices.XigniteRates;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xignite.sdk.api.ApiBase;
import com.xignite.sdk.api.webservices.XigniteRates.Models.FHLBankRate;
import com.xignite.sdk.api.webservices.XigniteRates.Models.FHLBankRateTypes;
import com.xignite.sdk.api.webservices.XigniteRates.Models.FHLBankTypes;
import com.xignite.sdk.api.webservices.XigniteRates.Models.FamilyRates;
import com.xignite.sdk.api.webservices.XigniteRates.Models.FederalRateTypes;
import com.xignite.sdk.api.webservices.XigniteRates.Models.HistoricalInterestRates;
import com.xignite.sdk.api.webservices.XigniteRates.Models.InterestRate;
import com.xignite.sdk.api.webservices.XigniteRates.Models.PeriodTypes;
import com.xignite.sdk.api.webservices.XigniteRates.Models.RateDescription;
import com.xignite.sdk.api.webservices.XigniteRates.Models.RateFamilyTypes;
import com.xignite.sdk.api.webservices.XigniteRates.Models.RateStatistics;
import com.xignite.sdk.api.webservices.XigniteRates.Models.RateTable;
import com.xignite.sdk.api.webservices.XigniteRates.Models.RateTypes;
import com.xignite.sdk.api.webservices.XigniteRates.Models.StateRateTypes;
import com.xignite.sdk.exceptions.XigniteApiException;
import com.xignite.sdk.utilities.RestClient;
import java.util.LinkedHashMap;

public class XigniteRates extends ApiBase {
   public XigniteRates(String apiToken) {
      this.apiToken = apiToken;
      this.endPointUrl = "http://www.xignite.com/xRates.json";
   }

   public RateDescription[] listRates() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListRates", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (RateDescription[])mapper.readValue(json, RateDescription[].class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public RateDescription[] listRatesHTTP() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListRates", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (RateDescription[])mapper.readValue(json, RateDescription[].class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public RateDescription[] searchRates(String pattern) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Pattern", String.valueOf(pattern));
         String json = RestClient.get(this.endPointUrl + "/SearchRates", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (RateDescription[])mapper.readValue(json, RateDescription[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public RateDescription[] searchRatesHTTP(String pattern) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Pattern", String.valueOf(pattern));
         String json = RestClient.get(this.endPointUrl + "/SearchRates", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (RateDescription[])mapper.readValue(json, RateDescription[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public InterestRate getRate(RateTypes rateType, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("RateType", String.valueOf(rateType));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetRate", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (InterestRate)mapper.readValue(json, InterestRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public InterestRate getRateHTTP(RateTypes rateType, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("RateType", String.valueOf(rateType));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetRate", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (InterestRate)mapper.readValue(json, InterestRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public InterestRate getTodaysRate(RateTypes rateType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("RateType", String.valueOf(rateType));
         String json = RestClient.get(this.endPointUrl + "/GetTodaysRate", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (InterestRate)mapper.readValue(json, InterestRate.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public InterestRate getTodaysRateHTTP(RateTypes rateType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("RateType", String.valueOf(rateType));
         String json = RestClient.get(this.endPointUrl + "/GetTodaysRate", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (InterestRate)mapper.readValue(json, InterestRate.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public InterestRate getLatestRate(RateTypes rateType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("RateType", String.valueOf(rateType));
         String json = RestClient.get(this.endPointUrl + "/GetLatestRate", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (InterestRate)mapper.readValue(json, InterestRate.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public InterestRate getLatestRateHTTP(RateTypes rateType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("RateType", String.valueOf(rateType));
         String json = RestClient.get(this.endPointUrl + "/GetLatestRate", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (InterestRate)mapper.readValue(json, InterestRate.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public InterestRate getRateAsOfTime(RateTypes rateType, String time) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("RateType", String.valueOf(rateType));
         params.put("Time", String.valueOf(time));
         String json = RestClient.get(this.endPointUrl + "/GetRateAsOfTime", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (InterestRate)mapper.readValue(json, InterestRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public InterestRate getRateAsOfTimeHTTP(RateTypes rateType, String time) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("RateType", String.valueOf(rateType));
         params.put("Time", String.valueOf(time));
         String json = RestClient.get(this.endPointUrl + "/GetRateAsOfTime", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (InterestRate)mapper.readValue(json, InterestRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public InterestRate[] getRateFamily(RateFamilyTypes rateFamilyType, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("RateFamilyType", String.valueOf(rateFamilyType));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetRateFamily", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (InterestRate[])mapper.readValue(json, InterestRate[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public InterestRate[] getRateFamilyHTTP(RateFamilyTypes rateFamilyType, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("RateFamilyType", String.valueOf(rateFamilyType));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetRateFamily", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (InterestRate[])mapper.readValue(json, InterestRate[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public RateTable getRateFamilyTable(RateFamilyTypes rateFamilyType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("RateFamilyType", String.valueOf(rateFamilyType));
         String json = RestClient.get(this.endPointUrl + "/GetRateFamilyTable", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (RateTable)mapper.readValue(json, RateTable.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public RateTable getRateFamilyTableHTTP(RateFamilyTypes rateFamilyType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("RateFamilyType", String.valueOf(rateFamilyType));
         String json = RestClient.get(this.endPointUrl + "/GetRateFamilyTable", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (RateTable)mapper.readValue(json, RateTable.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public InterestRate[] getLatestRateFamily(RateFamilyTypes rateFamilyType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("RateFamilyType", String.valueOf(rateFamilyType));
         String json = RestClient.get(this.endPointUrl + "/GetLatestRateFamily", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (InterestRate[])mapper.readValue(json, InterestRate[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public InterestRate[] getLatestRateFamilyHTTP(RateFamilyTypes rateFamilyType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("RateFamilyType", String.valueOf(rateFamilyType));
         String json = RestClient.get(this.endPointUrl + "/GetLatestRateFamily", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (InterestRate[])mapper.readValue(json, InterestRate[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public InterestRate getAverageRate(RateTypes rateType, PeriodTypes periodType, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("RateType", String.valueOf(rateType));
         params.put("PeriodType", String.valueOf(periodType));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetAverageRate", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (InterestRate)mapper.readValue(json, InterestRate.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public InterestRate getAverageRateHTTP(RateTypes rateType, PeriodTypes periodType, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("RateType", String.valueOf(rateType));
         params.put("PeriodType", String.valueOf(periodType));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetAverageRate", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (InterestRate)mapper.readValue(json, InterestRate.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public HistoricalInterestRates getAverageRates(RateTypes rateType, PeriodTypes periodType, String fromDate, String toDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("RateType", String.valueOf(rateType));
         params.put("PeriodType", String.valueOf(periodType));
         params.put("FromDate", String.valueOf(fromDate));
         params.put("ToDate", String.valueOf(toDate));
         String json = RestClient.get(this.endPointUrl + "/GetAverageRates", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalInterestRates)mapper.readValue(json, HistoricalInterestRates.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public HistoricalInterestRates getAverageRatesHTTP(RateTypes rateType, PeriodTypes periodType, String fromDate, String toDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("RateType", String.valueOf(rateType));
         params.put("PeriodType", String.valueOf(periodType));
         params.put("FromDate", String.valueOf(fromDate));
         params.put("ToDate", String.valueOf(toDate));
         String json = RestClient.get(this.endPointUrl + "/GetAverageRates", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalInterestRates)mapper.readValue(json, HistoricalInterestRates.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public HistoricalInterestRates getRateMovingAverage(RateTypes rateType, PeriodTypes periodType, int averagePeriods, String fromDate, String toDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("RateType", String.valueOf(rateType));
         params.put("PeriodType", String.valueOf(periodType));
         params.put("AveragePeriods", String.valueOf(averagePeriods));
         params.put("FromDate", String.valueOf(fromDate));
         params.put("ToDate", String.valueOf(toDate));
         String json = RestClient.get(this.endPointUrl + "/GetRateMovingAverage", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalInterestRates)mapper.readValue(json, HistoricalInterestRates.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public HistoricalInterestRates getRateMovingAverageHTTP(RateTypes rateType, PeriodTypes periodType, int averagePeriods, String fromDate, String toDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("RateType", String.valueOf(rateType));
         params.put("PeriodType", String.valueOf(periodType));
         params.put("AveragePeriods", String.valueOf(averagePeriods));
         params.put("FromDate", String.valueOf(fromDate));
         params.put("ToDate", String.valueOf(toDate));
         String json = RestClient.get(this.endPointUrl + "/GetRateMovingAverage", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalInterestRates)mapper.readValue(json, HistoricalInterestRates.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public HistoricalInterestRates getHistoricalRates(RateTypes rateType, PeriodTypes periodType, String fromDate, String toDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("RateType", String.valueOf(rateType));
         params.put("PeriodType", String.valueOf(periodType));
         params.put("FromDate", String.valueOf(fromDate));
         params.put("ToDate", String.valueOf(toDate));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalRates", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalInterestRates)mapper.readValue(json, HistoricalInterestRates.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public HistoricalInterestRates getHistoricalRatesHTTP(RateTypes rateType, PeriodTypes periodType, String fromDate, String toDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("RateType", String.valueOf(rateType));
         params.put("PeriodType", String.valueOf(periodType));
         params.put("FromDate", String.valueOf(fromDate));
         params.put("ToDate", String.valueOf(toDate));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalRates", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalInterestRates)mapper.readValue(json, HistoricalInterestRates.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public FamilyRates getHistoricalRateFamily(RateFamilyTypes rateFamilyType, String fromDate, String toDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("RateFamilyType", String.valueOf(rateFamilyType));
         params.put("FromDate", String.valueOf(fromDate));
         params.put("ToDate", String.valueOf(toDate));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalRateFamily", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FamilyRates)mapper.readValue(json, FamilyRates.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public FamilyRates getHistoricalRateFamilyHTTP(RateFamilyTypes rateFamilyType, String fromDate, String toDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("RateFamilyType", String.valueOf(rateFamilyType));
         params.put("FromDate", String.valueOf(fromDate));
         params.put("ToDate", String.valueOf(toDate));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalRateFamily", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FamilyRates)mapper.readValue(json, FamilyRates.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public FHLBankRate[] getFHLBankRates(FHLBankTypes fHLBankType, FHLBankRateTypes fHLBankRateType, String asOfDate, String fHLBankTerm) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("FHLBankType", String.valueOf(fHLBankType));
         params.put("FHLBankRateType", String.valueOf(fHLBankRateType));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("FHLBankTerm", String.valueOf(fHLBankTerm));
         String json = RestClient.get(this.endPointUrl + "/GetFHLBankRates", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FHLBankRate[])mapper.readValue(json, FHLBankRate[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public FHLBankRate[] getFHLBankRatesHTTP(FHLBankTypes fHLBankType, FHLBankRateTypes fHLBankRateType, String asOfDate, String fHLBankTerm) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("FHLBankType", String.valueOf(fHLBankType));
         params.put("FHLBankRateType", String.valueOf(fHLBankRateType));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("FHLBankTerm", String.valueOf(fHLBankTerm));
         String json = RestClient.get(this.endPointUrl + "/GetFHLBankRates", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FHLBankRate[])mapper.readValue(json, FHLBankRate[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public InterestRate getStateRate(StateRateTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetStateRate", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (InterestRate)mapper.readValue(json, InterestRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public InterestRate getStateRateHTTP(StateRateTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetStateRate", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (InterestRate)mapper.readValue(json, InterestRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public InterestRate[] getStateRates(StateRateTypes type, String fromDate, String toDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("FromDate", String.valueOf(fromDate));
         params.put("ToDate", String.valueOf(toDate));
         String json = RestClient.get(this.endPointUrl + "/GetStateRates", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (InterestRate[])mapper.readValue(json, InterestRate[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public InterestRate[] getStateRatesHTTP(StateRateTypes type, String fromDate, String toDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("FromDate", String.valueOf(fromDate));
         params.put("ToDate", String.valueOf(toDate));
         String json = RestClient.get(this.endPointUrl + "/GetStateRates", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (InterestRate[])mapper.readValue(json, InterestRate[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public InterestRate getFederalRate(FederalRateTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetFederalRate", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (InterestRate)mapper.readValue(json, InterestRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public InterestRate getFederalRateHTTP(FederalRateTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetFederalRate", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (InterestRate)mapper.readValue(json, InterestRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public InterestRate[] getFederalRates(FederalRateTypes type, String fromDate, String toDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("FromDate", String.valueOf(fromDate));
         params.put("ToDate", String.valueOf(toDate));
         String json = RestClient.get(this.endPointUrl + "/GetFederalRates", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (InterestRate[])mapper.readValue(json, InterestRate[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public InterestRate[] getFederalRatesHTTP(FederalRateTypes type, String fromDate, String toDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("FromDate", String.valueOf(fromDate));
         params.put("ToDate", String.valueOf(toDate));
         String json = RestClient.get(this.endPointUrl + "/GetFederalRates", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (InterestRate[])mapper.readValue(json, InterestRate[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public RateDescription getRateDescription(RateTypes rateType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("RateType", String.valueOf(rateType));
         String json = RestClient.get(this.endPointUrl + "/GetRateDescription", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (RateDescription)mapper.readValue(json, RateDescription.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public RateDescription getRateDescriptionHTTP(RateTypes rateType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("RateType", String.valueOf(rateType));
         String json = RestClient.get(this.endPointUrl + "/GetRateDescription", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (RateDescription)mapper.readValue(json, RateDescription.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public RateStatistics[] getRateStatistics() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/GetRateStatistics", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (RateStatistics[])mapper.readValue(json, RateStatistics[].class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public RateStatistics[] getRateStatisticsHTTP() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/GetRateStatistics", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (RateStatistics[])mapper.readValue(json, RateStatistics[].class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }
}
