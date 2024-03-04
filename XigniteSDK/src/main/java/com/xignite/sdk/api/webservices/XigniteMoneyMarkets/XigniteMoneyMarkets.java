package com.xignite.sdk.api.webservices.XigniteMoneyMarkets;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xignite.sdk.api.ApiBase;
import com.xignite.sdk.api.webservices.XigniteMoneyMarkets.Models.ForwardRateAgreement;
import com.xignite.sdk.api.webservices.XigniteMoneyMarkets.Models.InterestRate;
import com.xignite.sdk.api.webservices.XigniteMoneyMarkets.Models.LIBORCurrencyTypes;
import com.xignite.sdk.api.webservices.XigniteMoneyMarkets.Models.LIBORTypes;
import com.xignite.sdk.api.webservices.XigniteMoneyMarkets.Models.RateDescription;
import com.xignite.sdk.api.webservices.XigniteMoneyMarkets.Models.SwapCurrencyTypes;
import com.xignite.sdk.api.webservices.XigniteMoneyMarkets.Models.SwapRate;
import com.xignite.sdk.api.webservices.XigniteMoneyMarkets.Models.SwapRateDescription;
import com.xignite.sdk.api.webservices.XigniteMoneyMarkets.Models.SwapRateExtended;
import com.xignite.sdk.api.webservices.XigniteMoneyMarkets.Models.SwapRateTypes;
import com.xignite.sdk.api.webservices.XigniteMoneyMarkets.Models.Swaption;
import com.xignite.sdk.api.webservices.XigniteMoneyMarkets.Models.SwaptionTypes;
import com.xignite.sdk.api.webservices.XigniteMoneyMarkets.Models.TreasuryCurrencyTypes;
import com.xignite.sdk.api.webservices.XigniteMoneyMarkets.Models.TreasuryRateTypes;
import com.xignite.sdk.exceptions.XigniteApiException;
import com.xignite.sdk.utilities.RestClient;
import java.util.LinkedHashMap;

public class XigniteMoneyMarkets extends ApiBase {
   public XigniteMoneyMarkets(String apiToken) {
      this.apiToken = apiToken;
      this.endPointUrl = "http://moneymarkets.xignite.com/xMoneyMarkets.json";
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

   public SwapRateDescription[] listSwapRates(String swapType, String currency) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("SwapType", String.valueOf(swapType));
         params.put("Currency", String.valueOf(currency));
         String json = RestClient.get(this.endPointUrl + "/ListSwapRates", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SwapRateDescription[])mapper.readValue(json, SwapRateDescription[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public SwapRateDescription[] listSwapRatesHTTP(String swapType, String currency) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("SwapType", String.valueOf(swapType));
         params.put("Currency", String.valueOf(currency));
         String json = RestClient.get(this.endPointUrl + "/ListSwapRates", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SwapRateDescription[])mapper.readValue(json, SwapRateDescription[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
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

   public SwapRate getSwapRate(SwapRateTypes type, SwapCurrencyTypes currency) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("Currency", String.valueOf(currency));
         String json = RestClient.get(this.endPointUrl + "/GetSwapRate", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SwapRate)mapper.readValue(json, SwapRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public SwapRate getSwapRateHTTP(SwapRateTypes type, SwapCurrencyTypes currency) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("Currency", String.valueOf(currency));
         String json = RestClient.get(this.endPointUrl + "/GetSwapRate", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SwapRate)mapper.readValue(json, SwapRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public SwapRate[] getSwapRateFamily(SwapCurrencyTypes currency) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Currency", String.valueOf(currency));
         String json = RestClient.get(this.endPointUrl + "/GetSwapRateFamily", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SwapRate[])mapper.readValue(json, SwapRate[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public SwapRate[] getSwapRateFamilyHTTP(SwapCurrencyTypes currency) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Currency", String.valueOf(currency));
         String json = RestClient.get(this.endPointUrl + "/GetSwapRateFamily", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SwapRate[])mapper.readValue(json, SwapRate[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public SwapRateExtended getSwapRateExtended(String swapType, String currency, String tenor, String floatingReferenceRate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("SwapType", String.valueOf(swapType));
         params.put("Currency", String.valueOf(currency));
         params.put("Tenor", String.valueOf(tenor));
         params.put("FloatingReferenceRate", String.valueOf(floatingReferenceRate));
         String json = RestClient.get(this.endPointUrl + "/GetSwapRateExtended", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SwapRateExtended)mapper.readValue(json, SwapRateExtended.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public SwapRateExtended getSwapRateExtended(String swapType, String currency, String tenor) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("SwapType", String.valueOf(swapType));
         params.put("Currency", String.valueOf(currency));
         params.put("Tenor", String.valueOf(tenor));
         String json = RestClient.get(this.endPointUrl + "/GetSwapRateExtended", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SwapRateExtended)mapper.readValue(json, SwapRateExtended.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public SwapRateExtended getSwapRateExtendedHTTP(String swapType, String currency, String tenor, String floatingReferenceRate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("SwapType", String.valueOf(swapType));
         params.put("Currency", String.valueOf(currency));
         params.put("Tenor", String.valueOf(tenor));
         params.put("FloatingReferenceRate", String.valueOf(floatingReferenceRate));
         String json = RestClient.get(this.endPointUrl + "/GetSwapRateExtended", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SwapRateExtended)mapper.readValue(json, SwapRateExtended.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public SwapRateExtended getSwapRateExtendedHTTP(String swapType, String currency, String tenor) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("SwapType", String.valueOf(swapType));
         params.put("Currency", String.valueOf(currency));
         params.put("Tenor", String.valueOf(tenor));
         String json = RestClient.get(this.endPointUrl + "/GetSwapRateExtended", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SwapRateExtended)mapper.readValue(json, SwapRateExtended.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public SwapRateExtended[] getSwapRateFamilyExtended(String swapType, String currency, String floatingReferenceRate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("SwapType", String.valueOf(swapType));
         params.put("Currency", String.valueOf(currency));
         params.put("FloatingReferenceRate", String.valueOf(floatingReferenceRate));
         String json = RestClient.get(this.endPointUrl + "/GetSwapRateFamilyExtended", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SwapRateExtended[])mapper.readValue(json, SwapRateExtended[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public SwapRateExtended[] getSwapRateFamilyExtended(String swapType, String currency) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("SwapType", String.valueOf(swapType));
         params.put("Currency", String.valueOf(currency));
         String json = RestClient.get(this.endPointUrl + "/GetSwapRateFamilyExtended", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SwapRateExtended[])mapper.readValue(json, SwapRateExtended[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public SwapRateExtended[] getSwapRateFamilyExtendedHTTP(String swapType, String currency, String floatingReferenceRate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("SwapType", String.valueOf(swapType));
         params.put("Currency", String.valueOf(currency));
         params.put("FloatingReferenceRate", String.valueOf(floatingReferenceRate));
         String json = RestClient.get(this.endPointUrl + "/GetSwapRateFamilyExtended", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SwapRateExtended[])mapper.readValue(json, SwapRateExtended[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public SwapRateExtended[] getSwapRateFamilyExtendedHTTP(String swapType, String currency) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("SwapType", String.valueOf(swapType));
         params.put("Currency", String.valueOf(currency));
         String json = RestClient.get(this.endPointUrl + "/GetSwapRateFamilyExtended", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SwapRateExtended[])mapper.readValue(json, SwapRateExtended[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public SwapRate getHistoricalSwapRate(SwapRateTypes type, SwapCurrencyTypes currency, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("Currency", String.valueOf(currency));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalSwapRate", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SwapRate)mapper.readValue(json, SwapRate.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public SwapRate getHistoricalSwapRateHTTP(SwapRateTypes type, SwapCurrencyTypes currency, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("Currency", String.valueOf(currency));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalSwapRate", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SwapRate)mapper.readValue(json, SwapRate.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public SwapRate[] getHistoricalSwapRateRange(SwapRateTypes type, SwapCurrencyTypes currency, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("Currency", String.valueOf(currency));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalSwapRateRange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SwapRate[])mapper.readValue(json, SwapRate[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public SwapRate[] getHistoricalSwapRateRangeHTTP(SwapRateTypes type, SwapCurrencyTypes currency, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("Currency", String.valueOf(currency));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalSwapRateRange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SwapRate[])mapper.readValue(json, SwapRate[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public SwapRateExtended getHistoricalSwapRateExtended(String swapType, String currency, String tenor, String asOfDate, String floatingReferenceRate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("SwapType", String.valueOf(swapType));
         params.put("Currency", String.valueOf(currency));
         params.put("Tenor", String.valueOf(tenor));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("FloatingReferenceRate", String.valueOf(floatingReferenceRate));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalSwapRateExtended", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SwapRateExtended)mapper.readValue(json, SwapRateExtended.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public SwapRateExtended getHistoricalSwapRateExtended(String swapType, String currency, String tenor, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("SwapType", String.valueOf(swapType));
         params.put("Currency", String.valueOf(currency));
         params.put("Tenor", String.valueOf(tenor));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalSwapRateExtended", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SwapRateExtended)mapper.readValue(json, SwapRateExtended.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public SwapRateExtended getHistoricalSwapRateExtendedHTTP(String swapType, String currency, String tenor, String asOfDate, String floatingReferenceRate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("SwapType", String.valueOf(swapType));
         params.put("Currency", String.valueOf(currency));
         params.put("Tenor", String.valueOf(tenor));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("FloatingReferenceRate", String.valueOf(floatingReferenceRate));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalSwapRateExtended", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SwapRateExtended)mapper.readValue(json, SwapRateExtended.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public SwapRateExtended getHistoricalSwapRateExtendedHTTP(String swapType, String currency, String tenor, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("SwapType", String.valueOf(swapType));
         params.put("Currency", String.valueOf(currency));
         params.put("Tenor", String.valueOf(tenor));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalSwapRateExtended", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SwapRateExtended)mapper.readValue(json, SwapRateExtended.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public SwapRateExtended[] getHistoricalSwapRateExtendedRange(String swapType, String currency, String tenor, String startDate, String endDate, String floatingReferenceRate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("SwapType", String.valueOf(swapType));
         params.put("Currency", String.valueOf(currency));
         params.put("Tenor", String.valueOf(tenor));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("FloatingReferenceRate", String.valueOf(floatingReferenceRate));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalSwapRateExtendedRange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SwapRateExtended[])mapper.readValue(json, SwapRateExtended[].class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public SwapRateExtended[] getHistoricalSwapRateExtendedRange(String swapType, String currency, String tenor, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("SwapType", String.valueOf(swapType));
         params.put("Currency", String.valueOf(currency));
         params.put("Tenor", String.valueOf(tenor));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalSwapRateExtendedRange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SwapRateExtended[])mapper.readValue(json, SwapRateExtended[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public SwapRateExtended[] getHistoricalSwapRateExtendedRangeHTTP(String swapType, String currency, String tenor, String startDate, String endDate, String floatingReferenceRate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("SwapType", String.valueOf(swapType));
         params.put("Currency", String.valueOf(currency));
         params.put("Tenor", String.valueOf(tenor));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("FloatingReferenceRate", String.valueOf(floatingReferenceRate));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalSwapRateExtendedRange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SwapRateExtended[])mapper.readValue(json, SwapRateExtended[].class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public SwapRateExtended[] getHistoricalSwapRateExtendedRangeHTTP(String swapType, String currency, String tenor, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("SwapType", String.valueOf(swapType));
         params.put("Currency", String.valueOf(currency));
         params.put("Tenor", String.valueOf(tenor));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalSwapRateExtendedRange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SwapRateExtended[])mapper.readValue(json, SwapRateExtended[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public InterestRate getTreasuryRate(TreasuryRateTypes type, TreasuryCurrencyTypes currency) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("Currency", String.valueOf(currency));
         String json = RestClient.get(this.endPointUrl + "/GetTreasuryRate", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (InterestRate)mapper.readValue(json, InterestRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public InterestRate getTreasuryRateHTTP(TreasuryRateTypes type, TreasuryCurrencyTypes currency) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("Currency", String.valueOf(currency));
         String json = RestClient.get(this.endPointUrl + "/GetTreasuryRate", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (InterestRate)mapper.readValue(json, InterestRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public InterestRate[] getTreasuryRateFamily(TreasuryCurrencyTypes currency) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Currency", String.valueOf(currency));
         String json = RestClient.get(this.endPointUrl + "/GetTreasuryRateFamily", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (InterestRate[])mapper.readValue(json, InterestRate[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public InterestRate[] getTreasuryRateFamilyHTTP(TreasuryCurrencyTypes currency) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Currency", String.valueOf(currency));
         String json = RestClient.get(this.endPointUrl + "/GetTreasuryRateFamily", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (InterestRate[])mapper.readValue(json, InterestRate[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public Swaption getSwaption(SwaptionTypes firstType, SwaptionTypes secondType, SwapCurrencyTypes currency) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("FirstType", String.valueOf(firstType));
         params.put("SecondType", String.valueOf(secondType));
         params.put("Currency", String.valueOf(currency));
         String json = RestClient.get(this.endPointUrl + "/GetSwaption", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Swaption)mapper.readValue(json, Swaption.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public Swaption getSwaptionHTTP(SwaptionTypes firstType, SwaptionTypes secondType, SwapCurrencyTypes currency) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("FirstType", String.valueOf(firstType));
         params.put("SecondType", String.valueOf(secondType));
         params.put("Currency", String.valueOf(currency));
         String json = RestClient.get(this.endPointUrl + "/GetSwaption", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Swaption)mapper.readValue(json, Swaption.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public Swaption[] getSwaptionFamily(SwapCurrencyTypes currency) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Currency", String.valueOf(currency));
         String json = RestClient.get(this.endPointUrl + "/GetSwaptionFamily", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Swaption[])mapper.readValue(json, Swaption[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public Swaption[] getSwaptionFamilyHTTP(SwapCurrencyTypes currency) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Currency", String.valueOf(currency));
         String json = RestClient.get(this.endPointUrl + "/GetSwaptionFamily", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Swaption[])mapper.readValue(json, Swaption[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public Swaption getHistoricalSwaption(SwaptionTypes firstType, SwaptionTypes secondType, SwapCurrencyTypes currency, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("FirstType", String.valueOf(firstType));
         params.put("SecondType", String.valueOf(secondType));
         params.put("Currency", String.valueOf(currency));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalSwaption", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Swaption)mapper.readValue(json, Swaption.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public Swaption getHistoricalSwaptionHTTP(SwaptionTypes firstType, SwaptionTypes secondType, SwapCurrencyTypes currency, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("FirstType", String.valueOf(firstType));
         params.put("SecondType", String.valueOf(secondType));
         params.put("Currency", String.valueOf(currency));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalSwaption", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Swaption)mapper.readValue(json, Swaption.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public Swaption[] getHistoricalSwaptionFamily(SwapCurrencyTypes currency, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Currency", String.valueOf(currency));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalSwaptionFamily", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Swaption[])mapper.readValue(json, Swaption[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public Swaption[] getHistoricalSwaptionFamilyHTTP(SwapCurrencyTypes currency, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Currency", String.valueOf(currency));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalSwaptionFamily", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Swaption[])mapper.readValue(json, Swaption[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public ForwardRateAgreement getForwardRateAgreement(LIBORTypes firstType, LIBORTypes secondType, LIBORCurrencyTypes currency, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("FirstType", String.valueOf(firstType));
         params.put("SecondType", String.valueOf(secondType));
         params.put("Currency", String.valueOf(currency));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetForwardRateAgreement", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ForwardRateAgreement)mapper.readValue(json, ForwardRateAgreement.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public ForwardRateAgreement getForwardRateAgreementHTTP(LIBORTypes firstType, LIBORTypes secondType, LIBORCurrencyTypes currency, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("FirstType", String.valueOf(firstType));
         params.put("SecondType", String.valueOf(secondType));
         params.put("Currency", String.valueOf(currency));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetForwardRateAgreement", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ForwardRateAgreement)mapper.readValue(json, ForwardRateAgreement.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }
}
