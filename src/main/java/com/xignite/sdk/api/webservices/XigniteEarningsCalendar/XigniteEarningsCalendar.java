package com.xignite.sdk.api.webservices.XigniteEarningsCalendar;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xignite.sdk.api.ApiBase;
import com.xignite.sdk.api.webservices.XigniteEarningsCalendar.Models.Announcement;
import com.xignite.sdk.api.webservices.XigniteEarningsCalendar.Models.BoardMeeting;
import com.xignite.sdk.api.webservices.XigniteEarningsCalendar.Models.ConferenceCallInformation;
import com.xignite.sdk.api.webservices.XigniteEarningsCalendar.Models.EarningCalendarDay;
import com.xignite.sdk.api.webservices.XigniteEarningsCalendar.Models.EarningCalendarItem;
import com.xignite.sdk.api.webservices.XigniteEarningsCalendar.Models.EarningCalendarItemTypes;
import com.xignite.sdk.api.webservices.XigniteEarningsCalendar.Models.EarningCall;
import com.xignite.sdk.api.webservices.XigniteEarningsCalendar.Models.EarningDates;
import com.xignite.sdk.api.webservices.XigniteEarningsCalendar.Models.ExchangeList;
import com.xignite.sdk.api.webservices.XigniteEarningsCalendar.Models.FundamentalTypesItems;
import com.xignite.sdk.api.webservices.XigniteEarningsCalendar.Models.IdentifierTypes;
import com.xignite.sdk.api.webservices.XigniteEarningsCalendar.Models.ReplayInformation;
import com.xignite.sdk.api.webservices.XigniteEarningsCalendar.Models.SecurityItemsSets;
import com.xignite.sdk.api.webservices.XigniteEarningsCalendar.Models.SymbolList;
import com.xignite.sdk.exceptions.XigniteApiException;
import com.xignite.sdk.utilities.RestClient;
import java.util.LinkedHashMap;

public class XigniteEarningsCalendar extends ApiBase {
   public XigniteEarningsCalendar(String apiToken) {
      this.apiToken = apiToken;
      this.endPointUrl = "http://earningscalendar.xignite.com/xEarningsCalendar.json";
   }

   public ExchangeList listExchanges(String region) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Region", String.valueOf(region));
         String json = RestClient.get(this.endPointUrl + "/ListExchanges", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeList)mapper.readValue(json, ExchangeList.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public ExchangeList listExchangesHTTP(String region) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Region", String.valueOf(region));
         String json = RestClient.get(this.endPointUrl + "/ListExchanges", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExchangeList)mapper.readValue(json, ExchangeList.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public SymbolList listSymbols(String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/ListSymbols", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SymbolList)mapper.readValue(json, SymbolList.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public SymbolList listSymbolsHTTP(String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/ListSymbols", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SymbolList)mapper.readValue(json, SymbolList.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public FundamentalTypesItems listEarningCalendarItems() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListEarningCalendarItems", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundamentalTypesItems)mapper.readValue(json, FundamentalTypesItems.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public FundamentalTypesItems listEarningCalendarItemsHTTP() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListEarningCalendarItems", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FundamentalTypesItems)mapper.readValue(json, FundamentalTypesItems.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public EarningCalendarItem getEarningCalendarItem(EarningCalendarItemTypes type, String identifier, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetEarningCalendarItem", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (EarningCalendarItem)mapper.readValue(json, EarningCalendarItem.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public EarningCalendarItem getEarningCalendarItemHTTP(EarningCalendarItemTypes type, String identifier, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetEarningCalendarItem", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (EarningCalendarItem)mapper.readValue(json, EarningCalendarItem.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public SecurityItemsSets getEarningCalendarItems(String types, String identifiers, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Types", String.valueOf(types));
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetEarningCalendarItems", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SecurityItemsSets)mapper.readValue(json, SecurityItemsSets.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public SecurityItemsSets getEarningCalendarItemsHTTP(String types, String identifiers, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Types", String.valueOf(types));
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetEarningCalendarItems", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SecurityItemsSets)mapper.readValue(json, SecurityItemsSets.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public EarningCall getEarningCall(String identifier, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetEarningCall", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (EarningCall)mapper.readValue(json, EarningCall.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public EarningCall getEarningCallHTTP(String identifier, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetEarningCall", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (EarningCall)mapper.readValue(json, EarningCall.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public ConferenceCallInformation getConferenceCallInformation(String identifier, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetConferenceCallInformation", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ConferenceCallInformation)mapper.readValue(json, ConferenceCallInformation.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public ConferenceCallInformation getConferenceCallInformationHTTP(String identifier, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetConferenceCallInformation", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ConferenceCallInformation)mapper.readValue(json, ConferenceCallInformation.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public ReplayInformation getReplayInformation(String identifier, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetReplayInformation", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ReplayInformation)mapper.readValue(json, ReplayInformation.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public ReplayInformation getReplayInformationHTTP(String identifier, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetReplayInformation", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ReplayInformation)mapper.readValue(json, ReplayInformation.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public Announcement getAnnouncement(String identifier, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetAnnouncement", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Announcement)mapper.readValue(json, Announcement.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public Announcement getAnnouncementHTTP(String identifier, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetAnnouncement", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Announcement)mapper.readValue(json, Announcement.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public EarningCalendarDay getEarningCalendarDay(String asOfDate, double minimumMarketCap) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("MinimumMarketCap", String.valueOf(minimumMarketCap));
         String json = RestClient.get(this.endPointUrl + "/GetEarningCalendarDay", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (EarningCalendarDay)mapper.readValue(json, EarningCalendarDay.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public EarningCalendarDay getEarningCalendarDayHTTP(String asOfDate, double minimumMarketCap) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("AsOfDate", String.valueOf(asOfDate));
         params.put("MinimumMarketCap", String.valueOf(minimumMarketCap));
         String json = RestClient.get(this.endPointUrl + "/GetEarningCalendarDay", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (EarningCalendarDay)mapper.readValue(json, EarningCalendarDay.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public EarningDates getEarningDates(String identifier, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetEarningDates", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (EarningDates)mapper.readValue(json, EarningDates.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public EarningDates getEarningDatesHTTP(String identifier, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetEarningDates", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (EarningDates)mapper.readValue(json, EarningDates.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public BoardMeeting getBoardMeeting(String identifier, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetBoardMeeting", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (BoardMeeting)mapper.readValue(json, BoardMeeting.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public BoardMeeting getBoardMeetingHTTP(String identifier, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetBoardMeeting", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (BoardMeeting)mapper.readValue(json, BoardMeeting.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }
}
