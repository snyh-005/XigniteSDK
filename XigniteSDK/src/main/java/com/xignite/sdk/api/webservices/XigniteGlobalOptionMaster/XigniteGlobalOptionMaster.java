package com.xignite.sdk.api.webservices.XigniteGlobalOptionMaster;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xignite.sdk.api.ApiBase;
import com.xignite.sdk.api.webservices.XigniteGlobalOptionMaster.Models.ExchangeList;
import com.xignite.sdk.api.webservices.XigniteGlobalOptionMaster.Models.IdentifierTypes;
import com.xignite.sdk.api.webservices.XigniteGlobalOptionMaster.Models.InstrumentBrief;
import com.xignite.sdk.api.webservices.XigniteGlobalOptionMaster.Models.OptionChain;
import com.xignite.sdk.api.webservices.XigniteGlobalOptionMaster.Models.OptionDescription;
import com.xignite.sdk.exceptions.XigniteApiException;
import com.xignite.sdk.utilities.RestClient;
import java.util.LinkedHashMap;

public class XigniteGlobalOptionMaster extends ApiBase {
   public XigniteGlobalOptionMaster(String apiToken) {
      this.apiToken = apiToken;
      this.endPointUrl = "http://globaloptionmaster.xignite.com/xGlobalOptionMaster.json";
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

   public InstrumentBrief[] getUnderlyingForOption(String symbol, String symbologyType, String optionExchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("SymbologyType", String.valueOf(symbologyType));
         params.put("OptionExchange", String.valueOf(optionExchange));
         String json = RestClient.get(this.endPointUrl + "/GetUnderlyingForOption", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (InstrumentBrief[])mapper.readValue(json, InstrumentBrief[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public InstrumentBrief[] getUnderlyingForOptionHTTP(String symbol, String symbologyType, String optionExchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("SymbologyType", String.valueOf(symbologyType));
         params.put("OptionExchange", String.valueOf(optionExchange));
         String json = RestClient.get(this.endPointUrl + "/GetUnderlyingForOption", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (InstrumentBrief[])mapper.readValue(json, InstrumentBrief[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public OptionDescription[] getOptionBySymbol(String symbol, String symbologyType, String optionExchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("SymbologyType", String.valueOf(symbologyType));
         params.put("OptionExchange", String.valueOf(optionExchange));
         String json = RestClient.get(this.endPointUrl + "/GetOptionBySymbol", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (OptionDescription[])mapper.readValue(json, OptionDescription[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public OptionDescription[] getOptionBySymbolHTTP(String symbol, String symbologyType, String optionExchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("SymbologyType", String.valueOf(symbologyType));
         params.put("OptionExchange", String.valueOf(optionExchange));
         String json = RestClient.get(this.endPointUrl + "/GetOptionBySymbol", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (OptionDescription[])mapper.readValue(json, OptionDescription[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public OptionChain getOptionChain(String identifier, IdentifierTypes identifierType, String optionExchange, String month, String day, String year) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("OptionExchange", String.valueOf(optionExchange));
         params.put("Month", String.valueOf(month));
         params.put("Day", String.valueOf(day));
         params.put("Year", String.valueOf(year));
         String json = RestClient.get(this.endPointUrl + "/GetOptionChain", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (OptionChain)mapper.readValue(json, OptionChain.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public OptionChain getOptionChainHTTP(String identifier, IdentifierTypes identifierType, String optionExchange, String month, String day, String year) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("OptionExchange", String.valueOf(optionExchange));
         params.put("Month", String.valueOf(month));
         params.put("Day", String.valueOf(day));
         params.put("Year", String.valueOf(year));
         String json = RestClient.get(this.endPointUrl + "/GetOptionChain", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (OptionChain)mapper.readValue(json, OptionChain.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }
}
