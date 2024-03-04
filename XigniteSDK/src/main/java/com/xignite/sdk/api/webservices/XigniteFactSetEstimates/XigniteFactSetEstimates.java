package com.xignite.sdk.api.webservices.XigniteFactSetEstimates;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xignite.sdk.api.ApiBase;
import com.xignite.sdk.api.webservices.XigniteFactSetEstimates.Models.ActualsDescriptionList;
import com.xignite.sdk.api.webservices.XigniteFactSetEstimates.Models.CompanyActuals;
import com.xignite.sdk.api.webservices.XigniteFactSetEstimates.Models.CompanyEstimates;
import com.xignite.sdk.api.webservices.XigniteFactSetEstimates.Models.CompanyList;
import com.xignite.sdk.api.webservices.XigniteFactSetEstimates.Models.CompanyRecommendationSummary;
import com.xignite.sdk.api.webservices.XigniteFactSetEstimates.Models.EstimateDescriptionList;
import com.xignite.sdk.api.webservices.XigniteFactSetEstimates.Models.ExchangeList;
import com.xignite.sdk.api.webservices.XigniteFactSetEstimates.Models.TargetPriceSummaries;
import com.xignite.sdk.api.webservices.XigniteFactSetEstimates.Models.TrailingActuals;
import com.xignite.sdk.exceptions.XigniteApiException;
import com.xignite.sdk.utilities.RestClient;
import java.util.LinkedHashMap;

public class XigniteFactSetEstimates extends ApiBase {
   public XigniteFactSetEstimates(String apiToken) {
      this.apiToken = apiToken;
      this.endPointUrl = "http://factsetestimates.xignite.com/xFactSetEstimates.json";
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

   public CompanyList listCompanies(String marketIdentificationCode, String startSymbol, String endSymbol) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("MarketIdentificationCode", String.valueOf(marketIdentificationCode));
         params.put("StartSymbol", String.valueOf(startSymbol));
         params.put("EndSymbol", String.valueOf(endSymbol));
         String json = RestClient.get(this.endPointUrl + "/ListCompanies", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CompanyList)mapper.readValue(json, CompanyList.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public CompanyList listCompaniesHTTP(String marketIdentificationCode, String startSymbol, String endSymbol) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("MarketIdentificationCode", String.valueOf(marketIdentificationCode));
         params.put("StartSymbol", String.valueOf(startSymbol));
         params.put("EndSymbol", String.valueOf(endSymbol));
         String json = RestClient.get(this.endPointUrl + "/ListCompanies", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CompanyList)mapper.readValue(json, CompanyList.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public EstimateDescriptionList listEstimates() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListEstimates", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (EstimateDescriptionList)mapper.readValue(json, EstimateDescriptionList.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public EstimateDescriptionList listEstimatesHTTP() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListEstimates", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (EstimateDescriptionList)mapper.readValue(json, EstimateDescriptionList.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public ActualsDescriptionList listActuals() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListActuals", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ActualsDescriptionList)mapper.readValue(json, ActualsDescriptionList.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public ActualsDescriptionList listActualsHTTP() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListActuals", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ActualsDescriptionList)mapper.readValue(json, ActualsDescriptionList.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public CompanyEstimates[] getEstimates(String identifiers, String identifierType, String estimateTypes, String reportType, String estimateFiscalPeriod, String asOfDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("EstimateTypes", String.valueOf(estimateTypes));
         params.put("ReportType", String.valueOf(reportType));
         params.put("EstimateFiscalPeriod", String.valueOf(estimateFiscalPeriod));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetEstimates", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CompanyEstimates[])mapper.readValue(json, CompanyEstimates[].class);
      } catch (Exception var11) {
         throw new XigniteApiException(var11.getMessage());
      }
   }

   public CompanyEstimates[] getEstimatesHTTP(String identifiers, String identifierType, String estimateTypes, String reportType, String estimateFiscalPeriod, String asOfDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("EstimateTypes", String.valueOf(estimateTypes));
         params.put("ReportType", String.valueOf(reportType));
         params.put("EstimateFiscalPeriod", String.valueOf(estimateFiscalPeriod));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetEstimates", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CompanyEstimates[])mapper.readValue(json, CompanyEstimates[].class);
      } catch (Exception var11) {
         throw new XigniteApiException(var11.getMessage());
      }
   }

   public CompanyEstimates[] getLatestEstimates(String identifiers, String identifierType, String estimateTypes, String reportType, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("EstimateTypes", String.valueOf(estimateTypes));
         params.put("ReportType", String.valueOf(reportType));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetLatestEstimates", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CompanyEstimates[])mapper.readValue(json, CompanyEstimates[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public CompanyEstimates[] getLatestEstimatesHTTP(String identifiers, String identifierType, String estimateTypes, String reportType, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("EstimateTypes", String.valueOf(estimateTypes));
         params.put("ReportType", String.valueOf(reportType));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetLatestEstimates", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CompanyEstimates[])mapper.readValue(json, CompanyEstimates[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public CompanyEstimates getEstimatesRange(String identifier, String identifierType, String estimateTypes, String reportType, String estimateFiscalPeriod, String startDate, String endDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("EstimateTypes", String.valueOf(estimateTypes));
         params.put("ReportType", String.valueOf(reportType));
         params.put("EstimateFiscalPeriod", String.valueOf(estimateFiscalPeriod));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetEstimatesRange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CompanyEstimates)mapper.readValue(json, CompanyEstimates.class);
      } catch (Exception var12) {
         throw new XigniteApiException(var12.getMessage());
      }
   }

   public CompanyEstimates getEstimatesRangeHTTP(String identifier, String identifierType, String estimateTypes, String reportType, String estimateFiscalPeriod, String startDate, String endDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("EstimateTypes", String.valueOf(estimateTypes));
         params.put("ReportType", String.valueOf(reportType));
         params.put("EstimateFiscalPeriod", String.valueOf(estimateFiscalPeriod));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetEstimatesRange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CompanyEstimates)mapper.readValue(json, CompanyEstimates.class);
      } catch (Exception var12) {
         throw new XigniteApiException(var12.getMessage());
      }
   }

   public CompanyEstimates[] getAllLatestEstimates(String identifiers, String identifierType, String estimateTypes, String reportType, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("EstimateTypes", String.valueOf(estimateTypes));
         params.put("ReportType", String.valueOf(reportType));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetAllLatestEstimates", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CompanyEstimates[])mapper.readValue(json, CompanyEstimates[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public CompanyEstimates[] getAllLatestEstimatesHTTP(String identifiers, String identifierType, String estimateTypes, String reportType, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("EstimateTypes", String.valueOf(estimateTypes));
         params.put("ReportType", String.valueOf(reportType));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetAllLatestEstimates", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CompanyEstimates[])mapper.readValue(json, CompanyEstimates[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public CompanyEstimates[] getAllHistoricalEstimates(String identifiers, String identifierType, String estimateTypes, String reportType, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("EstimateTypes", String.valueOf(estimateTypes));
         params.put("ReportType", String.valueOf(reportType));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetAllHistoricalEstimates", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CompanyEstimates[])mapper.readValue(json, CompanyEstimates[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public CompanyEstimates[] getAllHistoricalEstimatesHTTP(String identifiers, String identifierType, String estimateTypes, String reportType, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("EstimateTypes", String.valueOf(estimateTypes));
         params.put("ReportType", String.valueOf(reportType));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetAllHistoricalEstimates", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CompanyEstimates[])mapper.readValue(json, CompanyEstimates[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public CompanyRecommendationSummary[] getLatestRecommendationSummaries(String identifiers, String identifierType, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetLatestRecommendationSummaries", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CompanyRecommendationSummary[])mapper.readValue(json, CompanyRecommendationSummary[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public CompanyRecommendationSummary[] getLatestRecommendationSummariesHTTP(String identifiers, String identifierType, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetLatestRecommendationSummaries", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CompanyRecommendationSummary[])mapper.readValue(json, CompanyRecommendationSummary[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public CompanyRecommendationSummary[] getRecommendationSummaries(String identifiers, String identifierType, String asOfDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetRecommendationSummaries", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CompanyRecommendationSummary[])mapper.readValue(json, CompanyRecommendationSummary[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public CompanyRecommendationSummary[] getRecommendationSummariesHTTP(String identifiers, String identifierType, String asOfDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetRecommendationSummaries", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CompanyRecommendationSummary[])mapper.readValue(json, CompanyRecommendationSummary[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public CompanyRecommendationSummary getRecommendationSummaryRange(String identifier, String identifierType, String startDate, String endDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetRecommendationSummaryRange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CompanyRecommendationSummary)mapper.readValue(json, CompanyRecommendationSummary.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public CompanyRecommendationSummary getRecommendationSummaryRangeHTTP(String identifier, String identifierType, String startDate, String endDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetRecommendationSummaryRange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CompanyRecommendationSummary)mapper.readValue(json, CompanyRecommendationSummary.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public TargetPriceSummaries[] getTargetPriceSummaries(String identifiers, String identifierType, String asOfDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetTargetPriceSummaries", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (TargetPriceSummaries[])mapper.readValue(json, TargetPriceSummaries[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public TargetPriceSummaries[] getTargetPriceSummariesHTTP(String identifiers, String identifierType, String asOfDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetTargetPriceSummaries", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (TargetPriceSummaries[])mapper.readValue(json, TargetPriceSummaries[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public TargetPriceSummaries getTargetPriceSummaryRange(String identifier, String identifierType, String startDate, String endDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetTargetPriceSummaryRange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (TargetPriceSummaries)mapper.readValue(json, TargetPriceSummaries.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public TargetPriceSummaries getTargetPriceSummaryRangeHTTP(String identifier, String identifierType, String startDate, String endDate, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetTargetPriceSummaryRange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (TargetPriceSummaries)mapper.readValue(json, TargetPriceSummaries.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public TargetPriceSummaries[] getLatestTargetPriceSummaries(String identifiers, String identifierType, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetLatestTargetPriceSummaries", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (TargetPriceSummaries[])mapper.readValue(json, TargetPriceSummaries[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public TargetPriceSummaries[] getLatestTargetPriceSummariesHTTP(String identifiers, String identifierType, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetLatestTargetPriceSummaries", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (TargetPriceSummaries[])mapper.readValue(json, TargetPriceSummaries[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public CompanyActuals[] getActuals(String identifiers, String identifierType, String actualTypes, String reportType, String fiscalPeriod) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("ActualTypes", String.valueOf(actualTypes));
         params.put("ReportType", String.valueOf(reportType));
         params.put("FiscalPeriod", String.valueOf(fiscalPeriod));
         String json = RestClient.get(this.endPointUrl + "/GetActuals", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CompanyActuals[])mapper.readValue(json, CompanyActuals[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public CompanyActuals[] getActualsHTTP(String identifiers, String identifierType, String actualTypes, String reportType, String fiscalPeriod) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("ActualTypes", String.valueOf(actualTypes));
         params.put("ReportType", String.valueOf(reportType));
         params.put("FiscalPeriod", String.valueOf(fiscalPeriod));
         String json = RestClient.get(this.endPointUrl + "/GetActuals", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CompanyActuals[])mapper.readValue(json, CompanyActuals[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public TrailingActuals[] getTrailingActuals(String identifiers, String identifierType, String actualType, String reportType, int numberOfActuals) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("ActualType", String.valueOf(actualType));
         params.put("ReportType", String.valueOf(reportType));
         params.put("NumberOfActuals", String.valueOf(numberOfActuals));
         String json = RestClient.get(this.endPointUrl + "/GetTrailingActuals", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (TrailingActuals[])mapper.readValue(json, TrailingActuals[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public TrailingActuals[] getTrailingActualsHTTP(String identifiers, String identifierType, String actualType, String reportType, int numberOfActuals) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("ActualType", String.valueOf(actualType));
         params.put("ReportType", String.valueOf(reportType));
         params.put("NumberOfActuals", String.valueOf(numberOfActuals));
         String json = RestClient.get(this.endPointUrl + "/GetTrailingActuals", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (TrailingActuals[])mapper.readValue(json, TrailingActuals[].class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public CompanyActuals[] getLatestActuals(String identifiers, String identifierType, String actualTypes, String reportType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("ActualTypes", String.valueOf(actualTypes));
         params.put("ReportType", String.valueOf(reportType));
         String json = RestClient.get(this.endPointUrl + "/GetLatestActuals", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CompanyActuals[])mapper.readValue(json, CompanyActuals[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public CompanyActuals[] getLatestActualsHTTP(String identifiers, String identifierType, String actualTypes, String reportType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("ActualTypes", String.valueOf(actualTypes));
         params.put("ReportType", String.valueOf(reportType));
         String json = RestClient.get(this.endPointUrl + "/GetLatestActuals", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CompanyActuals[])mapper.readValue(json, CompanyActuals[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }
}
