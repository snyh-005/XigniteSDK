package com.xignite.sdk.api.webservices.XigniteGlobalETFs;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xignite.sdk.api.ApiBase;
import com.xignite.sdk.api.webservices.XigniteGlobalETFs.Models.CharacteristicList;
import com.xignite.sdk.api.webservices.XigniteGlobalETFs.Models.ETFCharacteristics;
import com.xignite.sdk.api.webservices.XigniteGlobalETFs.Models.ETFList;
import com.xignite.sdk.api.webservices.XigniteGlobalETFs.Models.ExchangeList;
import com.xignite.sdk.api.webservices.XigniteGlobalETFs.Models.FundFlows;
import com.xignite.sdk.api.webservices.XigniteGlobalETFs.Models.FundFlowsRange;
import com.xignite.sdk.api.webservices.XigniteGlobalETFs.Models.HistoricalNAVs;
import com.xignite.sdk.api.webservices.XigniteGlobalETFs.Models.Holdings;
import com.xignite.sdk.api.webservices.XigniteGlobalETFs.Models.NAVs;
import com.xignite.sdk.api.webservices.XigniteGlobalETFs.Models.SearchETFBySecurityExposureResult;
import com.xignite.sdk.api.webservices.XigniteGlobalETFs.Models.SearchETFResult;
import com.xignite.sdk.api.webservices.XigniteGlobalETFs.Models.TrailingReturns;
import com.xignite.sdk.api.webservices.XigniteGlobalETFs.Models.VolatilityStatistics;
import com.xignite.sdk.exceptions.XigniteApiException;
import com.xignite.sdk.utilities.RestClient;
import java.util.LinkedHashMap;

public class XigniteGlobalETFs extends ApiBase {
   public XigniteGlobalETFs(String apiToken) {
      this.apiToken = apiToken;
      this.endPointUrl = "http://globaletfs.xignite.com/xGlobalETFs.json";
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

   public ETFList listETFs(String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/ListETFs", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ETFList)mapper.readValue(json, ETFList.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public ETFList listETFsHTTP(String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/ListETFs", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ETFList)mapper.readValue(json, ETFList.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public CharacteristicList listCharacteristics() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListCharacteristics", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CharacteristicList)mapper.readValue(json, CharacteristicList.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public CharacteristicList listCharacteristicsHTTP() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListCharacteristics", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CharacteristicList)mapper.readValue(json, CharacteristicList.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public SearchETFResult searchETFs(String searchType, String searchValue, String region) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("SearchType", String.valueOf(searchType));
         params.put("SearchValue", String.valueOf(searchValue));
         params.put("Region", String.valueOf(region));
         String json = RestClient.get(this.endPointUrl + "/SearchETFs", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SearchETFResult)mapper.readValue(json, SearchETFResult.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public SearchETFResult searchETFsHTTP(String searchType, String searchValue, String region) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("SearchType", String.valueOf(searchType));
         params.put("SearchValue", String.valueOf(searchValue));
         params.put("Region", String.valueOf(region));
         String json = RestClient.get(this.endPointUrl + "/SearchETFs", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SearchETFResult)mapper.readValue(json, SearchETFResult.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public SearchETFBySecurityExposureResult searchETFsBySecurityExposure(String identifiers, String identifierType, String identifierAsOfDate, String region, String percentThreshold) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("Region", String.valueOf(region));
         params.put("PercentThreshold", String.valueOf(percentThreshold));
         String json = RestClient.get(this.endPointUrl + "/SearchETFsBySecurityExposure", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SearchETFBySecurityExposureResult)mapper.readValue(json, SearchETFBySecurityExposureResult.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public SearchETFBySecurityExposureResult searchETFsBySecurityExposureHTTP(String identifiers, String identifierType, String identifierAsOfDate, String region, String percentThreshold) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("Region", String.valueOf(region));
         params.put("PercentThreshold", String.valueOf(percentThreshold));
         String json = RestClient.get(this.endPointUrl + "/SearchETFsBySecurityExposure", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SearchETFBySecurityExposureResult)mapper.readValue(json, SearchETFBySecurityExposureResult.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public ETFCharacteristics[] getETFCharacteristics(String identifiers, String identifierType, String identifierAsOfDate, String characteristicTypes, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("CharacteristicTypes", String.valueOf(characteristicTypes));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetETFCharacteristics", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ETFCharacteristics[])mapper.readValue(json, ETFCharacteristics[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public ETFCharacteristics[] getETFCharacteristicsHTTP(String identifiers, String identifierType, String identifierAsOfDate, String characteristicTypes, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("CharacteristicTypes", String.valueOf(characteristicTypes));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetETFCharacteristics", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ETFCharacteristics[])mapper.readValue(json, ETFCharacteristics[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public Holdings getHoldings(String identifier, String identifierType, String identifierAsOfDate, String asOfDate, String pageSize, String nextPage) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("PageSize", String.valueOf(pageSize));
         params.put("NextPage", String.valueOf(nextPage));
         String json = RestClient.get(this.endPointUrl + "/GetHoldings", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Holdings)mapper.readValue(json, Holdings.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public Holdings getHoldingsHTTP(String identifier, String identifierType, String identifierAsOfDate, String asOfDate, String pageSize, String nextPage) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("PageSize", String.valueOf(pageSize));
         params.put("NextPage", String.valueOf(nextPage));
         String json = RestClient.get(this.endPointUrl + "/GetHoldings", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Holdings)mapper.readValue(json, Holdings.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public NAVs[] getNAVs(String identifiers, String identifierType, String identifierAsOfDate, String asOfDate, String adjustmentMethod) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("AdjustmentMethod", String.valueOf(adjustmentMethod));
         String json = RestClient.get(this.endPointUrl + "/GetNAVs", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (NAVs[])mapper.readValue(json, NAVs[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public NAVs[] getNAVsHTTP(String identifiers, String identifierType, String identifierAsOfDate, String asOfDate, String adjustmentMethod) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("AdjustmentMethod", String.valueOf(adjustmentMethod));
         String json = RestClient.get(this.endPointUrl + "/GetNAVs", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (NAVs[])mapper.readValue(json, NAVs[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public HistoricalNAVs getHistoricalNAVs(String identifier, String identifierType, String identifierAsOfDate, String startDate, String endDate, String adjustmentMethod) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("AdjustmentMethod", String.valueOf(adjustmentMethod));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalNAVs", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalNAVs)mapper.readValue(json, HistoricalNAVs.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public HistoricalNAVs getHistoricalNAVsHTTP(String identifier, String identifierType, String identifierAsOfDate, String startDate, String endDate, String adjustmentMethod) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("AdjustmentMethod", String.valueOf(adjustmentMethod));
         String json = RestClient.get(this.endPointUrl + "/GetHistoricalNAVs", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (HistoricalNAVs)mapper.readValue(json, HistoricalNAVs.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public FundFlows[] getFundFlows(String identifiers, String identifierType, String identifierAsOfDate, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetFundFlows", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundFlows[])mapper.readValue(json, FundFlows[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public FundFlows[] getFundFlowsHTTP(String identifiers, String identifierType, String identifierAsOfDate, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetFundFlows", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundFlows[])mapper.readValue(json, FundFlows[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public FundFlowsRange getFundFlowsRange(String identifier, String identifierType, String identifierAsOfDate, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetFundFlowsRange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundFlowsRange)mapper.readValue(json, FundFlowsRange.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public FundFlowsRange getFundFlowsRangeHTTP(String identifier, String identifierType, String identifierAsOfDate, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetFundFlowsRange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundFlowsRange)mapper.readValue(json, FundFlowsRange.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public TrailingReturns[] getTrailingReturns(String identifiers, String identifierType, String identifierAsOfDate, String asOfDate, String adjustmentMethod, String calculationMethod) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("AdjustmentMethod", String.valueOf(adjustmentMethod));
         params.put("CalculationMethod", String.valueOf(calculationMethod));
         String json = RestClient.get(this.endPointUrl + "/GetTrailingReturns", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (TrailingReturns[])mapper.readValue(json, TrailingReturns[].class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public TrailingReturns[] getTrailingReturnsHTTP(String identifiers, String identifierType, String identifierAsOfDate, String asOfDate, String adjustmentMethod, String calculationMethod) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("AdjustmentMethod", String.valueOf(adjustmentMethod));
         params.put("CalculationMethod", String.valueOf(calculationMethod));
         String json = RestClient.get(this.endPointUrl + "/GetTrailingReturns", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (TrailingReturns[])mapper.readValue(json, TrailingReturns[].class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public VolatilityStatistics[] getVolatilityStatistics(String identifiers, String identifierType, String identifierAsOfDate, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetVolatilityStatistics", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (VolatilityStatistics[])mapper.readValue(json, VolatilityStatistics[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public VolatilityStatistics[] getVolatilityStatisticsHTTP(String identifiers, String identifierType, String identifierAsOfDate, String asOfDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("AsOfDate", String.valueOf(asOfDate));
         String json = RestClient.get(this.endPointUrl + "/GetVolatilityStatistics", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (VolatilityStatistics[])mapper.readValue(json, VolatilityStatistics[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }
}
