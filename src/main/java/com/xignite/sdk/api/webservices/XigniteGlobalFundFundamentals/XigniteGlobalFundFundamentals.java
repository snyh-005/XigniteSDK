package com.xignite.sdk.api.webservices.XigniteGlobalFundFundamentals;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xignite.sdk.api.ApiBase;
import com.xignite.sdk.api.webservices.XigniteGlobalFundFundamentals.Models.CountryList;
import com.xignite.sdk.api.webservices.XigniteGlobalFundFundamentals.Models.FundBreakdowns;
import com.xignite.sdk.api.webservices.XigniteGlobalFundFundamentals.Models.FundDividendHistory;
import com.xignite.sdk.api.webservices.XigniteGlobalFundFundamentals.Models.FundFeeSchedules;
import com.xignite.sdk.api.webservices.XigniteGlobalFundFundamentals.Models.FundFundamentalDescriptionList;
import com.xignite.sdk.api.webservices.XigniteGlobalFundFundamentals.Models.FundFundamentals;
import com.xignite.sdk.api.webservices.XigniteGlobalFundFundamentals.Models.FundHoldings;
import com.xignite.sdk.api.webservices.XigniteGlobalFundFundamentals.Models.FundList;
import com.xignite.sdk.api.webservices.XigniteGlobalFundFundamentals.Models.FundManagers;
import com.xignite.sdk.api.webservices.XigniteGlobalFundFundamentals.Models.FundMonthEndTrailingReturns;
import com.xignite.sdk.api.webservices.XigniteGlobalFundFundamentals.Models.FundNAV;
import com.xignite.sdk.api.webservices.XigniteGlobalFundFundamentals.Models.FundNAVHistory;
import com.xignite.sdk.api.webservices.XigniteGlobalFundFundamentals.Models.FundProfiles;
import com.xignite.sdk.api.webservices.XigniteGlobalFundFundamentals.Models.FundQuarterEndTrailingReturns;
import com.xignite.sdk.api.webservices.XigniteGlobalFundFundamentals.Models.FundTypeList;
import com.xignite.sdk.exceptions.XigniteApiException;
import com.xignite.sdk.utilities.RestClient;
import java.util.LinkedHashMap;

public class XigniteGlobalFundFundamentals extends ApiBase {
   public XigniteGlobalFundFundamentals(String apiToken) {
      this.apiToken = apiToken;
      this.endPointUrl = "http://globalfundfundamentals.xignite.com/V2/xGlobalFundFundamentals.json";
   }

   public CountryList listCountries() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListCountries", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CountryList)mapper.readValue(json, CountryList.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public CountryList listCountriesHTTP() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListCountries", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CountryList)mapper.readValue(json, CountryList.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public FundFundamentalDescriptionList listFundFundamentals() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListFundFundamentals", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundFundamentalDescriptionList)mapper.readValue(json, FundFundamentalDescriptionList.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public FundFundamentalDescriptionList listFundFundamentalsHTTP() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListFundFundamentals", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundFundamentalDescriptionList)mapper.readValue(json, FundFundamentalDescriptionList.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public FundList listFundsByCountry(String countryCode, String fundTypes, String startName, String endName) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("CountryCode", String.valueOf(countryCode));
         params.put("FundTypes", String.valueOf(fundTypes));
         params.put("StartName", String.valueOf(startName));
         params.put("EndName", String.valueOf(endName));
         String json = RestClient.get(this.endPointUrl + "/ListFundsByCountry", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundList)mapper.readValue(json, FundList.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public FundList listFundsByCountryHTTP(String countryCode, String fundTypes, String startName, String endName) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("CountryCode", String.valueOf(countryCode));
         params.put("FundTypes", String.valueOf(fundTypes));
         params.put("StartName", String.valueOf(startName));
         params.put("EndName", String.valueOf(endName));
         String json = RestClient.get(this.endPointUrl + "/ListFundsByCountry", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundList)mapper.readValue(json, FundList.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public FundTypeList listFundTypes() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListFundTypes", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundTypeList)mapper.readValue(json, FundTypeList.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public FundTypeList listFundTypesHTTP() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListFundTypes", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundTypeList)mapper.readValue(json, FundTypeList.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public FundFundamentals[] getFundFundamentals(String identifiers, String identifierType, String fundFundamentalTypes, String asOfDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("FundFundamentalTypes", String.valueOf(fundFundamentalTypes));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetFundFundamentals", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundFundamentals[])mapper.readValue(json, FundFundamentals[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public FundFundamentals[] getFundFundamentalsHTTP(String identifiers, String identifierType, String fundFundamentalTypes, String asOfDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("FundFundamentalTypes", String.valueOf(fundFundamentalTypes));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetFundFundamentals", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundFundamentals[])mapper.readValue(json, FundFundamentals[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public FundFundamentals[] getFundFundamentalsRange(String identifiers, String identifierType, String fundFundamentalTypes, String startDate, String endDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("FundFundamentalTypes", String.valueOf(fundFundamentalTypes));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetFundFundamentalsRange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundFundamentals[])mapper.readValue(json, FundFundamentals[].class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public FundFundamentals[] getFundFundamentalsRangeHTTP(String identifiers, String identifierType, String fundFundamentalTypes, String startDate, String endDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("FundFundamentalTypes", String.valueOf(fundFundamentalTypes));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetFundFundamentalsRange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundFundamentals[])mapper.readValue(json, FundFundamentals[].class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public FundProfiles[] getFundProfiles(String identifiers, String identifierType, String asOfDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetFundProfiles", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundProfiles[])mapper.readValue(json, FundProfiles[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public FundProfiles[] getFundProfilesHTTP(String identifiers, String identifierType, String asOfDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetFundProfiles", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundProfiles[])mapper.readValue(json, FundProfiles[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public FundFeeSchedules[] getFundFeeSchedules(String identifiers, String identifierType, String feeScheduleTypes, String asOfDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("FeeScheduleTypes", String.valueOf(feeScheduleTypes));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetFundFeeSchedules", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundFeeSchedules[])mapper.readValue(json, FundFeeSchedules[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public FundFeeSchedules[] getFundFeeSchedulesHTTP(String identifiers, String identifierType, String feeScheduleTypes, String asOfDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("FeeScheduleTypes", String.valueOf(feeScheduleTypes));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetFundFeeSchedules", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundFeeSchedules[])mapper.readValue(json, FundFeeSchedules[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public FundHoldings[] getFundHoldings(String identifiers, String identifierType, String asOfDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetFundHoldings", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundHoldings[])mapper.readValue(json, FundHoldings[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public FundHoldings[] getFundHoldingsHTTP(String identifiers, String identifierType, String asOfDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetFundHoldings", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundHoldings[])mapper.readValue(json, FundHoldings[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public FundHoldings[] getFundHoldingsRange(String identifier, String identifierType, String startDate, String endDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetFundHoldingsRange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundHoldings[])mapper.readValue(json, FundHoldings[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public FundHoldings[] getFundHoldingsRangeHTTP(String identifier, String identifierType, String startDate, String endDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetFundHoldingsRange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundHoldings[])mapper.readValue(json, FundHoldings[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public FundBreakdowns[] getFundFullHoldings(String identifiers, String identifierType, String asOfDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetFundFullHoldings", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundBreakdowns[])mapper.readValue(json, FundBreakdowns[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public FundBreakdowns[] getFundFullHoldingsHTTP(String identifiers, String identifierType, String asOfDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetFundFullHoldings", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundBreakdowns[])mapper.readValue(json, FundBreakdowns[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public FundBreakdowns[] getFundFullHoldingsRange(String identifier, String identifierType, String startDate, String endDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetFundFullHoldingsRange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundBreakdowns[])mapper.readValue(json, FundBreakdowns[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public FundBreakdowns[] getFundFullHoldingsRangeHTTP(String identifier, String identifierType, String startDate, String endDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetFundFullHoldingsRange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundBreakdowns[])mapper.readValue(json, FundBreakdowns[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public FundManagers[] getFundManagers(String identifiers, String identifierType, String asOfDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetFundManagers", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundManagers[])mapper.readValue(json, FundManagers[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public FundManagers[] getFundManagersHTTP(String identifiers, String identifierType, String asOfDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetFundManagers", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundManagers[])mapper.readValue(json, FundManagers[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public FundManagers[] getFundManagersRange(String identifier, String identifierType, String startDate, String endDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetFundManagersRange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundManagers[])mapper.readValue(json, FundManagers[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public FundManagers[] getFundManagersRangeHTTP(String identifier, String identifierType, String startDate, String endDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetFundManagersRange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundManagers[])mapper.readValue(json, FundManagers[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public FundMonthEndTrailingReturns[] getFundMonthEndTrailingReturns(String identifiers, String identifierType, String asOfDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetFundMonthEndTrailingReturns", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundMonthEndTrailingReturns[])mapper.readValue(json, FundMonthEndTrailingReturns[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public FundMonthEndTrailingReturns[] getFundMonthEndTrailingReturnsHTTP(String identifiers, String identifierType, String asOfDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetFundMonthEndTrailingReturns", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundMonthEndTrailingReturns[])mapper.readValue(json, FundMonthEndTrailingReturns[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public FundMonthEndTrailingReturns[] getFundMonthEndTrailingReturnsRange(String identifier, String identifierType, String startDate, String endDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetFundMonthEndTrailingReturnsRange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundMonthEndTrailingReturns[])mapper.readValue(json, FundMonthEndTrailingReturns[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public FundMonthEndTrailingReturns[] getFundMonthEndTrailingReturnsRangeHTTP(String identifier, String identifierType, String startDate, String endDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetFundMonthEndTrailingReturnsRange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundMonthEndTrailingReturns[])mapper.readValue(json, FundMonthEndTrailingReturns[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public FundQuarterEndTrailingReturns[] getFundQuarterEndTrailingReturns(String identifiers, String identifierType, String asOfDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetFundQuarterEndTrailingReturns", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundQuarterEndTrailingReturns[])mapper.readValue(json, FundQuarterEndTrailingReturns[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public FundQuarterEndTrailingReturns[] getFundQuarterEndTrailingReturnsHTTP(String identifiers, String identifierType, String asOfDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetFundQuarterEndTrailingReturns", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundQuarterEndTrailingReturns[])mapper.readValue(json, FundQuarterEndTrailingReturns[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public FundQuarterEndTrailingReturns[] getFundQuarterEndTrailingReturnsRange(String identifier, String identifierType, String startDate, String endDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetFundQuarterEndTrailingReturnsRange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundQuarterEndTrailingReturns[])mapper.readValue(json, FundQuarterEndTrailingReturns[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public FundQuarterEndTrailingReturns[] getFundQuarterEndTrailingReturnsRangeHTTP(String identifier, String identifierType, String startDate, String endDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetFundQuarterEndTrailingReturnsRange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundQuarterEndTrailingReturns[])mapper.readValue(json, FundQuarterEndTrailingReturns[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public FundBreakdowns[] getFundBreakdowns(String identifiers, String identifierType, String breakdown, String asOfDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Breakdown", String.valueOf(breakdown));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetFundBreakdowns", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundBreakdowns[])mapper.readValue(json, FundBreakdowns[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public FundBreakdowns[] getFundBreakdownsHTTP(String identifiers, String identifierType, String breakdown, String asOfDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Breakdown", String.valueOf(breakdown));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetFundBreakdowns", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundBreakdowns[])mapper.readValue(json, FundBreakdowns[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public FundBreakdowns[] getFundBreakdownsRange(String identifier, String identifierType, String breakdown, String startDate, String endDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Breakdown", String.valueOf(breakdown));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetFundBreakdownsRange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundBreakdowns[])mapper.readValue(json, FundBreakdowns[].class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public FundBreakdowns[] getFundBreakdownsRangeHTTP(String identifier, String identifierType, String breakdown, String startDate, String endDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Breakdown", String.valueOf(breakdown));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetFundBreakdownsRange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundBreakdowns[])mapper.readValue(json, FundBreakdowns[].class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public FundNAV[] getFundNAVs(String identifiers, String identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetFundNAVs", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundNAV[])mapper.readValue(json, FundNAV[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public FundNAV[] getFundNAVsHTTP(String identifiers, String identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetFundNAVs", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundNAV[])mapper.readValue(json, FundNAV[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public FundDividendHistory getFundDividendHistory(String identifier, String identifierType, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetFundDividendHistory", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundDividendHistory)mapper.readValue(json, FundDividendHistory.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public FundDividendHistory getFundDividendHistoryHTTP(String identifier, String identifierType, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetFundDividendHistory", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundDividendHistory)mapper.readValue(json, FundDividendHistory.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public FundNAVHistory getFundHistoricalNAVs(String identifier, String identifierType, String startDate, String endDate, String adjustmentMethod) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("AdjustmentMethod", String.valueOf(adjustmentMethod));
         String json = RestClient.get(this.endPointUrl + "/GetFundHistoricalNAVs", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundNAVHistory)mapper.readValue(json, FundNAVHistory.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public FundNAVHistory getFundHistoricalNAVsHTTP(String identifier, String identifierType, String startDate, String endDate, String adjustmentMethod) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("AdjustmentMethod", String.valueOf(adjustmentMethod));
         String json = RestClient.get(this.endPointUrl + "/GetFundHistoricalNAVs", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundNAVHistory)mapper.readValue(json, FundNAVHistory.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }
}
