package com.xignite.sdk.api.webservices.XigniteInterBanks;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xignite.sdk.api.ApiBase;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.AIDIBORRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.AIDIBORTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.BAIBORRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.BAIBORTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.BKIBORRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.BKIBORTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.BRAZIBORRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.BRAZIBORTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.BUBORRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.BUBORTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.CDORRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.CDORTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.CHIBORRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.CHIBORTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.CHILIBORRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.CHILIBORTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.CIBORRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.CIBORTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.COLIBORRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.COLIBORTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.EURIBORRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.EURIBORTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.FamilyRates;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.HIBORRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.HIBORTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.HistoricalInterestRates;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.HistoricalLIBORRates;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.InterestRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.JIBARRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.JIBARTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.JIBORRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.JIBORTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.KAIBORRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.KAIBORTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.KIBORRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.KIBORTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.KLIBORRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.KLIBORTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.KORIBORRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.KORIBORTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.LIBORCurrencyTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.LIBORRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.LIBORTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.MEXIBORRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.MEXIBORTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.MIBIDRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.MIBIDTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.MIBORRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.MIBORTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.MOSIBORRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.MOSIBORTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.OIBORRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.OIBORTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.PHIBORRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.PHIBORTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.PRIBORRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.PRIBORTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.REIBIDRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.REIBIDTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.REIBORRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.REIBORTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.RIGIBIDRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.RIGIBIDTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.RIGIBORRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.RIGIBORTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.RateDescription;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.RateFamilyTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.RateTable;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.RateTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.SABORRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.SABORTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.SHIBORRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.SHIBORTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.SIBORRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.SIBORTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.SOFIBORRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.SOFIBORTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.STIBORRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.STIBORTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.TAIBORRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.TAIBORTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.TELBORRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.TELBORTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.TIBORRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.TIBORTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.TRLIBORRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.TRLIBORTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.TURKIBORRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.TURKIBORTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.VILIBORRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.VILIBORTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.VNIBORRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.VNIBORTypes;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.WIBORRate;
import com.xignite.sdk.api.webservices.XigniteInterBanks.Models.WIBORTypes;
import com.xignite.sdk.exceptions.XigniteApiException;
import com.xignite.sdk.utilities.RestClient;
import java.util.LinkedHashMap;

public class XigniteInterBanks extends ApiBase {
   public XigniteInterBanks(String apiToken) {
      this.apiToken = apiToken;
      this.endPointUrl = "http://www.xignite.com/xInterBanks.json";
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

   public LIBORRate getLIBOR(LIBORTypes type, LIBORCurrencyTypes currency, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("Currency", String.valueOf(currency));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetLIBOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (LIBORRate)mapper.readValue(json, LIBORRate.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public LIBORRate getLIBORHTTP(LIBORTypes type, LIBORCurrencyTypes currency, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("Currency", String.valueOf(currency));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetLIBOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (LIBORRate)mapper.readValue(json, LIBORRate.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public AIDIBORRate getAIDIBOR(AIDIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetAIDIBOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (AIDIBORRate)mapper.readValue(json, AIDIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public AIDIBORRate getAIDIBORHTTP(AIDIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetAIDIBOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (AIDIBORRate)mapper.readValue(json, AIDIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public BAIBORRate getBAIBOR(BAIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetBAIBOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (BAIBORRate)mapper.readValue(json, BAIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public BAIBORRate getBAIBORHTTP(BAIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetBAIBOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (BAIBORRate)mapper.readValue(json, BAIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public BKIBORRate getBKIBOR(BKIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetBKIBOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (BKIBORRate)mapper.readValue(json, BKIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public BKIBORRate getBKIBORHTTP(BKIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetBKIBOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (BKIBORRate)mapper.readValue(json, BKIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public BRAZIBORRate getBRAZIBOR(BRAZIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetBRAZIBOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (BRAZIBORRate)mapper.readValue(json, BRAZIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public BRAZIBORRate getBRAZIBORHTTP(BRAZIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetBRAZIBOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (BRAZIBORRate)mapper.readValue(json, BRAZIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public BUBORRate getBUBOR(BUBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetBUBOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (BUBORRate)mapper.readValue(json, BUBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public BUBORRate getBUBORHTTP(BUBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetBUBOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (BUBORRate)mapper.readValue(json, BUBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public CDORRate getCDOR(CDORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetCDOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CDORRate)mapper.readValue(json, CDORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public CDORRate getCDORHTTP(CDORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetCDOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CDORRate)mapper.readValue(json, CDORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public CHIBORRate getCHIBOR(CHIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetCHIBOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CHIBORRate)mapper.readValue(json, CHIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public CHIBORRate getCHIBORHTTP(CHIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetCHIBOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CHIBORRate)mapper.readValue(json, CHIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public CHILIBORRate getCHILIBOR(CHILIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetCHILIBOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CHILIBORRate)mapper.readValue(json, CHILIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public CHILIBORRate getCHILIBORHTTP(CHILIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetCHILIBOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CHILIBORRate)mapper.readValue(json, CHILIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public CIBORRate getCIBOR(CIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetCIBOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CIBORRate)mapper.readValue(json, CIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public CIBORRate getCIBORHTTP(CIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetCIBOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CIBORRate)mapper.readValue(json, CIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public COLIBORRate getCOLIBOR(COLIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetCOLIBOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (COLIBORRate)mapper.readValue(json, COLIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public COLIBORRate getCOLIBORHTTP(COLIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetCOLIBOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (COLIBORRate)mapper.readValue(json, COLIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public EURIBORRate getEURIBOR(EURIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetEURIBOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (EURIBORRate)mapper.readValue(json, EURIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public EURIBORRate getEURIBORHTTP(EURIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetEURIBOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (EURIBORRate)mapper.readValue(json, EURIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public HIBORRate getHIBOR(HIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetHIBOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HIBORRate)mapper.readValue(json, HIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public HIBORRate getHIBORHTTP(HIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetHIBOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HIBORRate)mapper.readValue(json, HIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public JIBARRate getJIBAR(JIBARTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetJIBAR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (JIBARRate)mapper.readValue(json, JIBARRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public JIBARRate getJIBARHTTP(JIBARTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetJIBAR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (JIBARRate)mapper.readValue(json, JIBARRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public JIBORRate getJIBOR(JIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetJIBOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (JIBORRate)mapper.readValue(json, JIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public JIBORRate getJIBORHTTP(JIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetJIBOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (JIBORRate)mapper.readValue(json, JIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public KAIBORRate getKAIBOR(KAIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetKAIBOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (KAIBORRate)mapper.readValue(json, KAIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public KAIBORRate getKAIBORHTTP(KAIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetKAIBOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (KAIBORRate)mapper.readValue(json, KAIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public KIBORRate getKIBOR(KIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetKIBOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (KIBORRate)mapper.readValue(json, KIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public KIBORRate getKIBORHTTP(KIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetKIBOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (KIBORRate)mapper.readValue(json, KIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public KLIBORRate getKLIBOR(KLIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetKLIBOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (KLIBORRate)mapper.readValue(json, KLIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public KLIBORRate getKLIBORHTTP(KLIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetKLIBOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (KLIBORRate)mapper.readValue(json, KLIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public KORIBORRate getKORIBOR(KORIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetKORIBOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (KORIBORRate)mapper.readValue(json, KORIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public KORIBORRate getKORIBORHTTP(KORIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetKORIBOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (KORIBORRate)mapper.readValue(json, KORIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public MEXIBORRate getMEXIBOR(MEXIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetMEXIBOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (MEXIBORRate)mapper.readValue(json, MEXIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public MEXIBORRate getMEXIBORHTTP(MEXIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetMEXIBOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (MEXIBORRate)mapper.readValue(json, MEXIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public MIBORRate getMIBOR(MIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetMIBOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (MIBORRate)mapper.readValue(json, MIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public MIBORRate getMIBORHTTP(MIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetMIBOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (MIBORRate)mapper.readValue(json, MIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public MIBIDRate getMIBID(MIBIDTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetMIBID", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (MIBIDRate)mapper.readValue(json, MIBIDRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public MIBIDRate getMIBIDHTTP(MIBIDTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetMIBID", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (MIBIDRate)mapper.readValue(json, MIBIDRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public MOSIBORRate getMOSIBOR(MOSIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetMOSIBOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (MOSIBORRate)mapper.readValue(json, MOSIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public MOSIBORRate getMOSIBORHTTP(MOSIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetMOSIBOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (MOSIBORRate)mapper.readValue(json, MOSIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public OIBORRate getOIBOR(OIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetOIBOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (OIBORRate)mapper.readValue(json, OIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public OIBORRate getOIBORHTTP(OIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetOIBOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (OIBORRate)mapper.readValue(json, OIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public PHIBORRate getPHIBOR(PHIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetPHIBOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (PHIBORRate)mapper.readValue(json, PHIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public PHIBORRate getPHIBORHTTP(PHIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetPHIBOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (PHIBORRate)mapper.readValue(json, PHIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public PRIBORRate getPRIBOR(PRIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetPRIBOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (PRIBORRate)mapper.readValue(json, PRIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public PRIBORRate getPRIBORHTTP(PRIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetPRIBOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (PRIBORRate)mapper.readValue(json, PRIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public REIBORRate getREIBOR(REIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetREIBOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (REIBORRate)mapper.readValue(json, REIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public REIBORRate getREIBORHTTP(REIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetREIBOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (REIBORRate)mapper.readValue(json, REIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public REIBIDRate getREIBID(REIBIDTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetREIBID", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (REIBIDRate)mapper.readValue(json, REIBIDRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public REIBIDRate getREIBIDHTTP(REIBIDTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetREIBID", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (REIBIDRate)mapper.readValue(json, REIBIDRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public RIGIBORRate getRIGIBOR(RIGIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetRIGIBOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (RIGIBORRate)mapper.readValue(json, RIGIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public RIGIBORRate getRIGIBORHTTP(RIGIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetRIGIBOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (RIGIBORRate)mapper.readValue(json, RIGIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public RIGIBIDRate getRIGIBID(RIGIBIDTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetRIGIBID", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (RIGIBIDRate)mapper.readValue(json, RIGIBIDRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public RIGIBIDRate getRIGIBIDHTTP(RIGIBIDTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetRIGIBID", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (RIGIBIDRate)mapper.readValue(json, RIGIBIDRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public SABORRate getSABOR(SABORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetSABOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SABORRate)mapper.readValue(json, SABORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public SABORRate getSABORHTTP(SABORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetSABOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SABORRate)mapper.readValue(json, SABORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public SHIBORRate getSHIBOR(SHIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetSHIBOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SHIBORRate)mapper.readValue(json, SHIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public SHIBORRate getSHIBORHTTP(SHIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetSHIBOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SHIBORRate)mapper.readValue(json, SHIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public SIBORRate getSIBOR(SIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetSIBOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SIBORRate)mapper.readValue(json, SIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public SIBORRate getSIBORHTTP(SIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetSIBOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SIBORRate)mapper.readValue(json, SIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public SOFIBORRate getSOFIBOR(SOFIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetSOFIBOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SOFIBORRate)mapper.readValue(json, SOFIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public SOFIBORRate getSOFIBORHTTP(SOFIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetSOFIBOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SOFIBORRate)mapper.readValue(json, SOFIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public STIBORRate getSTIBOR(STIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetSTIBOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (STIBORRate)mapper.readValue(json, STIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public STIBORRate getSTIBORHTTP(STIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetSTIBOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (STIBORRate)mapper.readValue(json, STIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public TAIBORRate getTAIBOR(TAIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetTAIBOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (TAIBORRate)mapper.readValue(json, TAIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public TAIBORRate getTAIBORHTTP(TAIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetTAIBOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (TAIBORRate)mapper.readValue(json, TAIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public TIBORRate getTIBOR(TIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetTIBOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (TIBORRate)mapper.readValue(json, TIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public TIBORRate getTIBORHTTP(TIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetTIBOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (TIBORRate)mapper.readValue(json, TIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public TELBORRate getTELBOR(TELBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetTELBOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (TELBORRate)mapper.readValue(json, TELBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public TELBORRate getTELBORHTTP(TELBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetTELBOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (TELBORRate)mapper.readValue(json, TELBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public TRLIBORRate getTRLIBOR(TRLIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetTRLIBOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (TRLIBORRate)mapper.readValue(json, TRLIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public TRLIBORRate getTRLIBORHTTP(TRLIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetTRLIBOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (TRLIBORRate)mapper.readValue(json, TRLIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public TURKIBORRate getTURKIBOR(TURKIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetTURKIBOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (TURKIBORRate)mapper.readValue(json, TURKIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public TURKIBORRate getTURKIBORHTTP(TURKIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetTURKIBOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (TURKIBORRate)mapper.readValue(json, TURKIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public VILIBORRate getVILIBOR(VILIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetVILIBOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (VILIBORRate)mapper.readValue(json, VILIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public VILIBORRate getVILIBORHTTP(VILIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetVILIBOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (VILIBORRate)mapper.readValue(json, VILIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public VNIBORRate getVNIBOR(VNIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetVNIBOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (VNIBORRate)mapper.readValue(json, VNIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public VNIBORRate getVNIBORHTTP(VNIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetVNIBOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (VNIBORRate)mapper.readValue(json, VNIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public WIBORRate getWIBOR(WIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetWIBOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (WIBORRate)mapper.readValue(json, WIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public WIBORRate getWIBORHTTP(WIBORTypes type, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetWIBOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (WIBORRate)mapper.readValue(json, WIBORRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public HistoricalLIBORRates getHistoricalLIBOR(LIBORTypes type, LIBORCurrencyTypes currency, String fromDate, String toDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("Currency", String.valueOf(currency));
         params.put("FromDate", String.valueOf(fromDate));
         params.put("ToDate", String.valueOf(toDate));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalLIBOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalLIBORRates)mapper.readValue(json, HistoricalLIBORRates.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public HistoricalLIBORRates getHistoricalLIBORHTTP(LIBORTypes type, LIBORCurrencyTypes currency, String fromDate, String toDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("Currency", String.valueOf(currency));
         params.put("FromDate", String.valueOf(fromDate));
         params.put("ToDate", String.valueOf(toDate));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalLIBOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalLIBORRates)mapper.readValue(json, HistoricalLIBORRates.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public HistoricalInterestRates getHistoricalRates(RateTypes rateType, String fromDate, String toDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("RateType", String.valueOf(rateType));
         params.put("FromDate", String.valueOf(fromDate));
         params.put("ToDate", String.valueOf(toDate));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalRates", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalInterestRates)mapper.readValue(json, HistoricalInterestRates.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public HistoricalInterestRates getHistoricalRatesHTTP(RateTypes rateType, String fromDate, String toDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("RateType", String.valueOf(rateType));
         params.put("FromDate", String.valueOf(fromDate));
         params.put("ToDate", String.valueOf(toDate));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalRates", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalInterestRates)mapper.readValue(json, HistoricalInterestRates.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
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

   public InterestRate getLatestLIBOR(RateTypes rateType, LIBORCurrencyTypes currency) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("RateType", String.valueOf(rateType));
         params.put("Currency", String.valueOf(currency));
         String json = RestClient.get(this.endPointUrl + "/GetLatestLIBOR", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (InterestRate)mapper.readValue(json, InterestRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public InterestRate getLatestLIBORHTTP(RateTypes rateType, LIBORCurrencyTypes currency) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("RateType", String.valueOf(rateType));
         params.put("Currency", String.valueOf(currency));
         String json = RestClient.get(this.endPointUrl + "/GetLatestLIBOR", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (InterestRate)mapper.readValue(json, InterestRate.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
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
}
