package com.xignite.sdk.api.webservices.XigniteGlobalCorporateActions;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xignite.sdk.api.ApiBase;
import com.xignite.sdk.api.webservices.XigniteGlobalCorporateActions.Models.DistributionsList;
import com.xignite.sdk.api.webservices.XigniteGlobalCorporateActions.Models.EventSummaryList;
import com.xignite.sdk.api.webservices.XigniteGlobalCorporateActions.Models.EventTypeList;
import com.xignite.sdk.api.webservices.XigniteGlobalCorporateActions.Models.ExchangeList;
import com.xignite.sdk.api.webservices.XigniteGlobalCorporateActions.Models.ExchangeSplitList;
import com.xignite.sdk.api.webservices.XigniteGlobalCorporateActions.Models.IdentifierChangeList;
import com.xignite.sdk.api.webservices.XigniteGlobalCorporateActions.Models.IdentifierTypes;
import com.xignite.sdk.api.webservices.XigniteGlobalCorporateActions.Models.ListingChangeList;
import com.xignite.sdk.api.webservices.XigniteGlobalCorporateActions.Models.MergersList;
import com.xignite.sdk.api.webservices.XigniteGlobalCorporateActions.Models.RightsList;
import com.xignite.sdk.api.webservices.XigniteGlobalCorporateActions.Models.SecurityDistributionsList;
import com.xignite.sdk.api.webservices.XigniteGlobalCorporateActions.Models.SecurityEventSummariesList;
import com.xignite.sdk.api.webservices.XigniteGlobalCorporateActions.Models.SecurityRightsList;
import com.xignite.sdk.api.webservices.XigniteGlobalCorporateActions.Models.SecuritySwapsList;
import com.xignite.sdk.api.webservices.XigniteGlobalCorporateActions.Models.SpinoffList;
import com.xignite.sdk.api.webservices.XigniteGlobalCorporateActions.Models.SplitList;
import com.xignite.sdk.api.webservices.XigniteGlobalCorporateActions.Models.SymbolList;
import com.xignite.sdk.api.webservices.XigniteGlobalCorporateActions.Models.TakeoversList;
import com.xignite.sdk.api.webservices.XigniteGlobalCorporateActions.Models.TenderOffersList;
import com.xignite.sdk.exceptions.XigniteApiException;
import com.xignite.sdk.utilities.RestClient;
import java.util.LinkedHashMap;

public class XigniteGlobalCorporateActions extends ApiBase {
   public XigniteGlobalCorporateActions(String apiToken) {
      this.apiToken = apiToken;
      this.endPointUrl = "http://globalcorporateactions.xignite.com/xGlobalCorporateActions.json";
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

   public SymbolList listSymbols(String exchange, String startSymbol, String endSymbol) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("StartSymbol", String.valueOf(startSymbol));
         params.put("EndSymbol", String.valueOf(endSymbol));
         String json = RestClient.get(this.endPointUrl + "/ListSymbols", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SymbolList)mapper.readValue(json, SymbolList.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public SymbolList listSymbolsHTTP(String exchange, String startSymbol, String endSymbol) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("StartSymbol", String.valueOf(startSymbol));
         params.put("EndSymbol", String.valueOf(endSymbol));
         String json = RestClient.get(this.endPointUrl + "/ListSymbols", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SymbolList)mapper.readValue(json, SymbolList.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public EventTypeList listEventTypes() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListEventTypes", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (EventTypeList)mapper.readValue(json, EventTypeList.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public EventTypeList listEventTypesHTTP() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListEventTypes", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (EventTypeList)mapper.readValue(json, EventTypeList.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public IdentifierChangeList listIdentifierChanges(String exchange, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/ListIdentifierChanges", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IdentifierChangeList)mapper.readValue(json, IdentifierChangeList.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public IdentifierChangeList listIdentifierChangesHTTP(String exchange, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/ListIdentifierChanges", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IdentifierChangeList)mapper.readValue(json, IdentifierChangeList.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public ListingChangeList listListingChanges(String exchange, String startDate, String endDate, String type) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("Type", String.valueOf(type));
         String json = RestClient.get(this.endPointUrl + "/ListListingChanges", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ListingChangeList)mapper.readValue(json, ListingChangeList.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public ListingChangeList listListingChangesHTTP(String exchange, String startDate, String endDate, String type) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("Type", String.valueOf(type));
         String json = RestClient.get(this.endPointUrl + "/ListListingChanges", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ListingChangeList)mapper.readValue(json, ListingChangeList.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public EventSummaryList getEventSummaries(String identifier, IdentifierTypes identifierType, String identifierAsOfDate, String startDate, String endDate, boolean includeEventNotes) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("IncludeEventNotes", String.valueOf(includeEventNotes));
         String json = RestClient.get(this.endPointUrl + "/GetEventSummaries", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (EventSummaryList)mapper.readValue(json, EventSummaryList.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public EventSummaryList getEventSummariesHTTP(String identifier, IdentifierTypes identifierType, String identifierAsOfDate, String startDate, String endDate, boolean includeEventNotes) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("IncludeEventNotes", String.valueOf(includeEventNotes));
         String json = RestClient.get(this.endPointUrl + "/GetEventSummaries", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (EventSummaryList)mapper.readValue(json, EventSummaryList.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public SecurityEventSummariesList getEventSummariesByExchange(String exchange, String exDate, boolean includeEventNotes) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("ExDate", String.valueOf(exDate));
         params.put("IncludeEventNotes", String.valueOf(includeEventNotes));
         String json = RestClient.get(this.endPointUrl + "/GetEventSummariesByExchange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SecurityEventSummariesList)mapper.readValue(json, SecurityEventSummariesList.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public SecurityEventSummariesList getEventSummariesByExchangeHTTP(String exchange, String exDate, boolean includeEventNotes) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("ExDate", String.valueOf(exDate));
         params.put("IncludeEventNotes", String.valueOf(includeEventNotes));
         String json = RestClient.get(this.endPointUrl + "/GetEventSummariesByExchange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SecurityEventSummariesList)mapper.readValue(json, SecurityEventSummariesList.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public DistributionsList getDistributions(String identifier, IdentifierTypes identifierType, String identifierAsOfDate, String startDate, String endDate, boolean includeOptionalPayments) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("IncludeOptionalPayments", String.valueOf(includeOptionalPayments));
         String json = RestClient.get(this.endPointUrl + "/GetDistributions", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (DistributionsList)mapper.readValue(json, DistributionsList.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public DistributionsList getDistributionsHTTP(String identifier, IdentifierTypes identifierType, String identifierAsOfDate, String startDate, String endDate, boolean includeOptionalPayments) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         params.put("IncludeOptionalPayments", String.valueOf(includeOptionalPayments));
         String json = RestClient.get(this.endPointUrl + "/GetDistributions", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (DistributionsList)mapper.readValue(json, DistributionsList.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public SecurityDistributionsList getDistributionsByExchange(String exchange, String date, String dateType, boolean includeOptionalPayments) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("Date", String.valueOf(date));
         params.put("DateType", String.valueOf(dateType));
         params.put("IncludeOptionalPayments", String.valueOf(includeOptionalPayments));
         String json = RestClient.get(this.endPointUrl + "/GetDistributionsByExchange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SecurityDistributionsList)mapper.readValue(json, SecurityDistributionsList.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public SecurityDistributionsList getDistributionsByExchangeHTTP(String exchange, String date, String dateType, boolean includeOptionalPayments) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("Date", String.valueOf(date));
         params.put("DateType", String.valueOf(dateType));
         params.put("IncludeOptionalPayments", String.valueOf(includeOptionalPayments));
         String json = RestClient.get(this.endPointUrl + "/GetDistributionsByExchange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SecurityDistributionsList)mapper.readValue(json, SecurityDistributionsList.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public SplitList getSplits(String identifier, IdentifierTypes identifierType, String identifierAsOfDate, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetSplits", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SplitList)mapper.readValue(json, SplitList.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public SplitList getSplitsHTTP(String identifier, IdentifierTypes identifierType, String identifierAsOfDate, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetSplits", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SplitList)mapper.readValue(json, SplitList.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public ExchangeSplitList getSplitsByExchange(String exchange, String exDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("ExDate", String.valueOf(exDate));
         String json = RestClient.get(this.endPointUrl + "/GetSplitsByExchange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeSplitList)mapper.readValue(json, ExchangeSplitList.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public ExchangeSplitList getSplitsByExchangeHTTP(String exchange, String exDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("ExDate", String.valueOf(exDate));
         String json = RestClient.get(this.endPointUrl + "/GetSplitsByExchange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeSplitList)mapper.readValue(json, ExchangeSplitList.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public SpinoffList getSpinoffs(String identifier, IdentifierTypes identifierType, String identifierAsOfDate, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetSpinoffs", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SpinoffList)mapper.readValue(json, SpinoffList.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public SpinoffList getSpinoffsHTTP(String identifier, IdentifierTypes identifierType, String identifierAsOfDate, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetSpinoffs", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SpinoffList)mapper.readValue(json, SpinoffList.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public MergersList getMergers(String identifier, IdentifierTypes identifierType, String identifierAsOfDate, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetMergers", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (MergersList)mapper.readValue(json, MergersList.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public MergersList getMergersHTTP(String identifier, IdentifierTypes identifierType, String identifierAsOfDate, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetMergers", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (MergersList)mapper.readValue(json, MergersList.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public TakeoversList getTakeovers(String identifier, IdentifierTypes identifierType, String identifierAsOfDate, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetTakeovers", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (TakeoversList)mapper.readValue(json, TakeoversList.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public TakeoversList getTakeoversHTTP(String identifier, IdentifierTypes identifierType, String identifierAsOfDate, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetTakeovers", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (TakeoversList)mapper.readValue(json, TakeoversList.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public TenderOffersList getTenderOffers(String identifier, IdentifierTypes identifierType, String identifierAsOfDate, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetTenderOffers", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (TenderOffersList)mapper.readValue(json, TenderOffersList.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public TenderOffersList getTenderOffersHTTP(String identifier, IdentifierTypes identifierType, String identifierAsOfDate, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetTenderOffers", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (TenderOffersList)mapper.readValue(json, TenderOffersList.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public RightsList getRights(String identifier, IdentifierTypes identifierType, String identifierAsOfDate, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetRights", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (RightsList)mapper.readValue(json, RightsList.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public RightsList getRightsHTTP(String identifier, IdentifierTypes identifierType, String identifierAsOfDate, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetRights", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (RightsList)mapper.readValue(json, RightsList.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public SecurityRightsList getRightsByExchange(String exchange, String exDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("ExDate", String.valueOf(exDate));
         String json = RestClient.get(this.endPointUrl + "/GetRightsByExchange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SecurityRightsList)mapper.readValue(json, SecurityRightsList.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public SecurityRightsList getRightsByExchangeHTTP(String exchange, String exDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         params.put("ExDate", String.valueOf(exDate));
         String json = RestClient.get(this.endPointUrl + "/GetRightsByExchange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SecurityRightsList)mapper.readValue(json, SecurityRightsList.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public SecuritySwapsList getSecuritySwap(String identifier, IdentifierTypes identifierType, String identifierAsOfDate, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetSecuritySwap", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SecuritySwapsList)mapper.readValue(json, SecuritySwapsList.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public SecuritySwapsList getSecuritySwapHTTP(String identifier, IdentifierTypes identifierType, String identifierAsOfDate, String startDate, String endDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("IdentifierAsOfDate", String.valueOf(identifierAsOfDate));
         params.put("StartDate", String.valueOf(startDate));
         params.put("EndDate", String.valueOf(endDate));
         String json = RestClient.get(this.endPointUrl + "/GetSecuritySwap", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SecuritySwapsList)mapper.readValue(json, SecuritySwapsList.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }
}
