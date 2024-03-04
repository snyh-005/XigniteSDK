package com.xignite.sdk.api.webservices.XigniteFactSetFundamentals;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xignite.sdk.api.ApiBase;
import com.xignite.sdk.api.webservices.XigniteFactSetFundamentals.Models.CompanyBalanceSheet;
import com.xignite.sdk.api.webservices.XigniteFactSetFundamentals.Models.CompanyCashFlowStatement;
import com.xignite.sdk.api.webservices.XigniteFactSetFundamentals.Models.CompanyFinancialStatements;
import com.xignite.sdk.api.webservices.XigniteFactSetFundamentals.Models.CompanyFundamentals;
import com.xignite.sdk.api.webservices.XigniteFactSetFundamentals.Models.CompanyIncomeStatement;
import com.xignite.sdk.api.webservices.XigniteFactSetFundamentals.Models.CompanyList;
import com.xignite.sdk.api.webservices.XigniteFactSetFundamentals.Models.ExchangeList;
import com.xignite.sdk.api.webservices.XigniteFactSetFundamentals.Models.FundamentalDescriptionList;
import com.xignite.sdk.api.webservices.XigniteFactSetFundamentals.Models.SectorList;
import com.xignite.sdk.exceptions.XigniteApiException;
import com.xignite.sdk.utilities.RestClient;
import java.util.LinkedHashMap;

public class XigniteFactSetFundamentals extends ApiBase {
   public XigniteFactSetFundamentals(String apiToken) {
      this.apiToken = apiToken;
      this.endPointUrl = "http://factsetfundamentals.xignite.com/xFactSetFundamentals.json";
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

   public ExchangeList listExchangesByRegion(String regions) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Regions", String.valueOf(regions));
         String json = RestClient.get(this.endPointUrl + "/ListExchangesByRegion", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeList)mapper.readValue(json, ExchangeList.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public ExchangeList listExchangesByRegionHTTP(String regions) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Regions", String.valueOf(regions));
         String json = RestClient.get(this.endPointUrl + "/ListExchangesByRegion", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeList)mapper.readValue(json, ExchangeList.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public FundamentalDescriptionList listFundamentals() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListFundamentals", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundamentalDescriptionList)mapper.readValue(json, FundamentalDescriptionList.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public FundamentalDescriptionList listFundamentalsHTTP() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListFundamentals", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundamentalDescriptionList)mapper.readValue(json, FundamentalDescriptionList.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public FundamentalDescriptionList listFundamentalsByDataGroup(String dataGroups) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("DataGroups", String.valueOf(dataGroups));
         String json = RestClient.get(this.endPointUrl + "/ListFundamentalsByDataGroup", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundamentalDescriptionList)mapper.readValue(json, FundamentalDescriptionList.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public FundamentalDescriptionList listFundamentalsByDataGroupHTTP(String dataGroups) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("DataGroups", String.valueOf(dataGroups));
         String json = RestClient.get(this.endPointUrl + "/ListFundamentalsByDataGroup", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundamentalDescriptionList)mapper.readValue(json, FundamentalDescriptionList.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public SectorList listSectorsAndIndustries() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListSectorsAndIndustries", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SectorList)mapper.readValue(json, SectorList.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public SectorList listSectorsAndIndustriesHTTP() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListSectorsAndIndustries", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SectorList)mapper.readValue(json, SectorList.class);
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

   public FundamentalDescriptionList searchFundamentals(String pattern) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Pattern", String.valueOf(pattern));
         String json = RestClient.get(this.endPointUrl + "/SearchFundamentals", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundamentalDescriptionList)mapper.readValue(json, FundamentalDescriptionList.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public FundamentalDescriptionList searchFundamentalsHTTP(String pattern) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Pattern", String.valueOf(pattern));
         String json = RestClient.get(this.endPointUrl + "/SearchFundamentals", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundamentalDescriptionList)mapper.readValue(json, FundamentalDescriptionList.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public CompanyFundamentals[] getFundamentals(String identifiers, String identifierType, String fundamentalTypes, String asOfDate, String reportType, String excludeRestated, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("FundamentalTypes", String.valueOf(fundamentalTypes));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("ReportType", String.valueOf(reportType));
         params.put("ExcludeRestated", String.valueOf(excludeRestated));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetFundamentals", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CompanyFundamentals[])mapper.readValue(json, CompanyFundamentals[].class);
      } catch (Exception var11) {
         throw new XigniteApiException(var11.getMessage());
      }
   }

   public CompanyFundamentals[] getFundamentalsHTTP(String identifiers, String identifierType, String fundamentalTypes, String asOfDate, String reportType, String excludeRestated, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("FundamentalTypes", String.valueOf(fundamentalTypes));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("ReportType", String.valueOf(reportType));
         params.put("ExcludeRestated", String.valueOf(excludeRestated));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetFundamentals", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CompanyFundamentals[])mapper.readValue(json, CompanyFundamentals[].class);
      } catch (Exception var11) {
         throw new XigniteApiException(var11.getMessage());
      }
   }

   public CompanyFundamentals[] getLatestFundamentals(String identifiers, String identifierType, String fundamentalTypes, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("FundamentalTypes", String.valueOf(fundamentalTypes));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetLatestFundamentals", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CompanyFundamentals[])mapper.readValue(json, CompanyFundamentals[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public CompanyFundamentals[] getLatestFundamentalsHTTP(String identifiers, String identifierType, String fundamentalTypes, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("FundamentalTypes", String.valueOf(fundamentalTypes));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetLatestFundamentals", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CompanyFundamentals[])mapper.readValue(json, CompanyFundamentals[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public CompanyFundamentals[] getFundamentalsDailyRange(String identifiers, String identifierType, String fundamentalTypes, String startDate, String endDate, String reportType, String excludeRestated, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("FundamentalTypes", String.valueOf(fundamentalTypes));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("ReportType", String.valueOf(reportType));
         params.put("ExcludeRestated", String.valueOf(excludeRestated));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetFundamentalsDailyRange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CompanyFundamentals[])mapper.readValue(json, CompanyFundamentals[].class);
      } catch (Exception var12) {
         throw new XigniteApiException(var12.getMessage());
      }
   }

   public CompanyFundamentals[] getFundamentalsDailyRangeHTTP(String identifiers, String identifierType, String fundamentalTypes, String startDate, String endDate, String reportType, String excludeRestated, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("FundamentalTypes", String.valueOf(fundamentalTypes));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("ReportType", String.valueOf(reportType));
         params.put("ExcludeRestated", String.valueOf(excludeRestated));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetFundamentalsDailyRange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CompanyFundamentals[])mapper.readValue(json, CompanyFundamentals[].class);
      } catch (Exception var12) {
         throw new XigniteApiException(var12.getMessage());
      }
   }

   public CompanyFundamentals[] getFundamentalsFiscalRange(String identifiers, String identifierType, String fundamentalTypes, String startDate, String endDate, String reportType, String excludeRestated, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("FundamentalTypes", String.valueOf(fundamentalTypes));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("ReportType", String.valueOf(reportType));
         params.put("ExcludeRestated", String.valueOf(excludeRestated));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetFundamentalsFiscalRange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CompanyFundamentals[])mapper.readValue(json, CompanyFundamentals[].class);
      } catch (Exception var12) {
         throw new XigniteApiException(var12.getMessage());
      }
   }

   public CompanyFundamentals[] getFundamentalsFiscalRangeHTTP(String identifiers, String identifierType, String fundamentalTypes, String startDate, String endDate, String reportType, String excludeRestated, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("FundamentalTypes", String.valueOf(fundamentalTypes));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("ReportType", String.valueOf(reportType));
         params.put("ExcludeRestated", String.valueOf(excludeRestated));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetFundamentalsFiscalRange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CompanyFundamentals[])mapper.readValue(json, CompanyFundamentals[].class);
      } catch (Exception var12) {
         throw new XigniteApiException(var12.getMessage());
      }
   }

   public CompanyFinancialStatements[] getFinancialStatements(String identifiers, String identifierType, String statementTypes, String asOfDate, String reportType, String excludeRestated) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("StatementTypes", String.valueOf(statementTypes));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("ReportType", String.valueOf(reportType));
         params.put("ExcludeRestated", String.valueOf(excludeRestated));
         String json = RestClient.get(this.endPointUrl + "/GetFinancialStatements", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CompanyFinancialStatements[])mapper.readValue(json, CompanyFinancialStatements[].class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public CompanyFinancialStatements[] getFinancialStatementsHTTP(String identifiers, String identifierType, String statementTypes, String asOfDate, String reportType, String excludeRestated) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("StatementTypes", String.valueOf(statementTypes));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("ReportType", String.valueOf(reportType));
         params.put("ExcludeRestated", String.valueOf(excludeRestated));
         String json = RestClient.get(this.endPointUrl + "/GetFinancialStatements", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CompanyFinancialStatements[])mapper.readValue(json, CompanyFinancialStatements[].class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public CompanyBalanceSheet[] getBalanceSheets(String identifiers, String identifierType, String asOfDate, String reportType, String excludeRestated, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("ReportType", String.valueOf(reportType));
         params.put("ExcludeRestated", String.valueOf(excludeRestated));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetBalanceSheets", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CompanyBalanceSheet[])mapper.readValue(json, CompanyBalanceSheet[].class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public CompanyBalanceSheet[] getBalanceSheetsHTTP(String identifiers, String identifierType, String asOfDate, String reportType, String excludeRestated, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("ReportType", String.valueOf(reportType));
         params.put("ExcludeRestated", String.valueOf(excludeRestated));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetBalanceSheets", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CompanyBalanceSheet[])mapper.readValue(json, CompanyBalanceSheet[].class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public CompanyCashFlowStatement[] getCashFlowStatements(String identifiers, String identifierType, String asOfDate, String reportType, String excludeRestated, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("ReportType", String.valueOf(reportType));
         params.put("ExcludeRestated", String.valueOf(excludeRestated));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetCashFlowStatements", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CompanyCashFlowStatement[])mapper.readValue(json, CompanyCashFlowStatement[].class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public CompanyCashFlowStatement[] getCashFlowStatementsHTTP(String identifiers, String identifierType, String asOfDate, String reportType, String excludeRestated, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("ReportType", String.valueOf(reportType));
         params.put("ExcludeRestated", String.valueOf(excludeRestated));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetCashFlowStatements", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CompanyCashFlowStatement[])mapper.readValue(json, CompanyCashFlowStatement[].class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public CompanyIncomeStatement[] getIncomeStatements(String identifiers, String identifierType, String asOfDate, String reportType, String excludeRestated, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("ReportType", String.valueOf(reportType));
         params.put("ExcludeRestated", String.valueOf(excludeRestated));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetIncomeStatements", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CompanyIncomeStatement[])mapper.readValue(json, CompanyIncomeStatement[].class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public CompanyIncomeStatement[] getIncomeStatementsHTTP(String identifiers, String identifierType, String asOfDate, String reportType, String excludeRestated, String updatedSince) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("ReportType", String.valueOf(reportType));
         params.put("ExcludeRestated", String.valueOf(excludeRestated));
         params.put("UpdatedSince", String.valueOf(updatedSince));
         String json = RestClient.get(this.endPointUrl + "/GetIncomeStatements", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CompanyIncomeStatement[])mapper.readValue(json, CompanyIncomeStatement[].class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }
}
