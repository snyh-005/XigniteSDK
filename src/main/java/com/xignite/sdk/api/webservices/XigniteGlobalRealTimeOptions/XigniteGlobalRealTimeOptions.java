package com.xignite.sdk.api.webservices.XigniteGlobalRealTimeOptions;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xignite.sdk.api.ApiBase;
import com.xignite.sdk.api.webservices.XigniteGlobalRealTimeOptions.Models.ExtendedOption;
import com.xignite.sdk.api.webservices.XigniteGlobalRealTimeOptions.Models.ExtendedOptionChain;
import com.xignite.sdk.api.webservices.XigniteGlobalRealTimeOptions.Models.ExtendedOptions;
import com.xignite.sdk.api.webservices.XigniteGlobalRealTimeOptions.Models.IdentifierTypes;
import com.xignite.sdk.api.webservices.XigniteGlobalRealTimeOptions.Models.NumericResult;
import com.xignite.sdk.api.webservices.XigniteGlobalRealTimeOptions.Models.Option;
import com.xignite.sdk.api.webservices.XigniteGlobalRealTimeOptions.Models.OptionChain;
import com.xignite.sdk.api.webservices.XigniteGlobalRealTimeOptions.Models.OptionChartBars;
import com.xignite.sdk.api.webservices.XigniteGlobalRealTimeOptions.Models.OptionSymbol;
import com.xignite.sdk.api.webservices.XigniteGlobalRealTimeOptions.Models.OptionTypes;
import com.xignite.sdk.api.webservices.XigniteGlobalRealTimeOptions.Models.Options;
import com.xignite.sdk.api.webservices.XigniteGlobalRealTimeOptions.Models.UnderlyingSymbolList;
import com.xignite.sdk.exceptions.XigniteApiException;
import com.xignite.sdk.utilities.RestClient;
import java.util.LinkedHashMap;

public class XigniteGlobalRealTimeOptions extends ApiBase {
   public XigniteGlobalRealTimeOptions(String apiToken) {
      this.apiToken = apiToken;
      this.endPointUrl = "http://globalrealtimeoptions.xignite.com/xglobalrealtimeoptions.json";
   }

   public UnderlyingSymbolList listUnderlyingSymbols(String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/ListUnderlyingSymbols", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (UnderlyingSymbolList)mapper.readValue(json, UnderlyingSymbolList.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public UnderlyingSymbolList listUnderlyingSymbolsHTTP(String exchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Exchange", String.valueOf(exchange));
         String json = RestClient.get(this.endPointUrl + "/ListUnderlyingSymbols", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (UnderlyingSymbolList)mapper.readValue(json, UnderlyingSymbolList.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public Options getAllEquityOptionChain(String identifier, IdentifierTypes identifierType, String symbologyType, String optionExchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("SymbologyType", String.valueOf(symbologyType));
         params.put("OptionExchange", String.valueOf(optionExchange));
         String json = RestClient.get(this.endPointUrl + "/GetAllEquityOptionChain", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Options)mapper.readValue(json, Options.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public Options getAllEquityOptionChainHTTP(String identifier, IdentifierTypes identifierType, String symbologyType, String optionExchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("SymbologyType", String.valueOf(symbologyType));
         params.put("OptionExchange", String.valueOf(optionExchange));
         String json = RestClient.get(this.endPointUrl + "/GetAllEquityOptionChain", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Options)mapper.readValue(json, Options.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public ExtendedOptions getAllExtendedEquityOptionChain(String identifier, IdentifierTypes identifierType, String symbologyType, String optionExchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("SymbologyType", String.valueOf(symbologyType));
         params.put("OptionExchange", String.valueOf(optionExchange));
         String json = RestClient.get(this.endPointUrl + "/GetAllExtendedEquityOptionChain", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExtendedOptions)mapper.readValue(json, ExtendedOptions.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public ExtendedOptions getAllExtendedEquityOptionChainHTTP(String identifier, IdentifierTypes identifierType, String symbologyType, String optionExchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("SymbologyType", String.valueOf(symbologyType));
         params.put("OptionExchange", String.valueOf(optionExchange));
         String json = RestClient.get(this.endPointUrl + "/GetAllExtendedEquityOptionChain", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExtendedOptions)mapper.readValue(json, ExtendedOptions.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public Options getEquityOptionChain(String identifier, IdentifierTypes identifierType, int month, int year, String symbologyType, String optionExchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Month", String.valueOf(month));
         params.put("Year", String.valueOf(year));
         params.put("SymbologyType", String.valueOf(symbologyType));
         params.put("OptionExchange", String.valueOf(optionExchange));
         String json = RestClient.get(this.endPointUrl + "/GetEquityOptionChain", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Options)mapper.readValue(json, Options.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public Options getEquityOptionChainHTTP(String identifier, IdentifierTypes identifierType, int month, int year, String symbologyType, String optionExchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Month", String.valueOf(month));
         params.put("Year", String.valueOf(year));
         params.put("SymbologyType", String.valueOf(symbologyType));
         params.put("OptionExchange", String.valueOf(optionExchange));
         String json = RestClient.get(this.endPointUrl + "/GetEquityOptionChain", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Options)mapper.readValue(json, Options.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public ExtendedOptions getExtendedEquityOptionChain(String identifier, IdentifierTypes identifierType, int month, int year, String symbologyType, String optionExchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Month", String.valueOf(month));
         params.put("Year", String.valueOf(year));
         params.put("SymbologyType", String.valueOf(symbologyType));
         params.put("OptionExchange", String.valueOf(optionExchange));
         String json = RestClient.get(this.endPointUrl + "/GetExtendedEquityOptionChain", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExtendedOptions)mapper.readValue(json, ExtendedOptions.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public ExtendedOptions getExtendedEquityOptionChainHTTP(String identifier, IdentifierTypes identifierType, int month, int year, String symbologyType, String optionExchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Month", String.valueOf(month));
         params.put("Year", String.valueOf(year));
         params.put("SymbologyType", String.valueOf(symbologyType));
         params.put("OptionExchange", String.valueOf(optionExchange));
         String json = RestClient.get(this.endPointUrl + "/GetExtendedEquityOptionChain", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExtendedOptions)mapper.readValue(json, ExtendedOptions.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public ExtendedOptionChain getExtendedOptionChain(String identifier, String identifierType, String expirationDate, String callPutType, String symbologyType, String optionExchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("ExpirationDate", String.valueOf(expirationDate));
         params.put("CallPutType", String.valueOf(callPutType));
         params.put("SymbologyType", String.valueOf(symbologyType));
         params.put("OptionExchange", String.valueOf(optionExchange));
         String json = RestClient.get(this.endPointUrl + "/GetExtendedOptionChain", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExtendedOptionChain)mapper.readValue(json, ExtendedOptionChain.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public ExtendedOptionChain getExtendedOptionChainHTTP(String identifier, String identifierType, String expirationDate, String callPutType, String symbologyType, String optionExchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("ExpirationDate", String.valueOf(expirationDate));
         params.put("CallPutType", String.valueOf(callPutType));
         params.put("SymbologyType", String.valueOf(symbologyType));
         params.put("OptionExchange", String.valueOf(optionExchange));
         String json = RestClient.get(this.endPointUrl + "/GetExtendedOptionChain", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExtendedOptionChain)mapper.readValue(json, ExtendedOptionChain.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public OptionChain getOptionChain(String identifier, String identifierType, String expirationDate, String callPutType, String symbologyType, String optionExchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("ExpirationDate", String.valueOf(expirationDate));
         params.put("CallPutType", String.valueOf(callPutType));
         params.put("SymbologyType", String.valueOf(symbologyType));
         params.put("OptionExchange", String.valueOf(optionExchange));
         String json = RestClient.get(this.endPointUrl + "/GetOptionChain", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (OptionChain)mapper.readValue(json, OptionChain.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public OptionChain getOptionChainHTTP(String identifier, String identifierType, String expirationDate, String callPutType, String symbologyType, String optionExchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("ExpirationDate", String.valueOf(expirationDate));
         params.put("CallPutType", String.valueOf(callPutType));
         params.put("SymbologyType", String.valueOf(symbologyType));
         params.put("OptionExchange", String.valueOf(optionExchange));
         String json = RestClient.get(this.endPointUrl + "/GetOptionChain", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (OptionChain)mapper.readValue(json, OptionChain.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public OptionSymbol getEquityOptionSymbol(String identifier, IdentifierTypes identifierType, OptionTypes type, int month, int year, double strikePrice, String symbologyType, String optionExchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Type", String.valueOf(type));
         params.put("Month", String.valueOf(month));
         params.put("Year", String.valueOf(year));
         params.put("StrikePrice", String.valueOf(strikePrice));
         params.put("SymbologyType", String.valueOf(symbologyType));
         params.put("OptionExchange", String.valueOf(optionExchange));
         String json = RestClient.get(this.endPointUrl + "/GetEquityOptionSymbol", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (OptionSymbol)mapper.readValue(json, OptionSymbol.class);
      } catch (Exception var13) {
         throw new XigniteApiException(var13.getMessage());
      }
   }

   public OptionSymbol getEquityOptionSymbolHTTP(String identifier, IdentifierTypes identifierType, OptionTypes type, int month, int year, double strikePrice, String symbologyType, String optionExchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Type", String.valueOf(type));
         params.put("Month", String.valueOf(month));
         params.put("Year", String.valueOf(year));
         params.put("StrikePrice", String.valueOf(strikePrice));
         params.put("SymbologyType", String.valueOf(symbologyType));
         params.put("OptionExchange", String.valueOf(optionExchange));
         String json = RestClient.get(this.endPointUrl + "/GetEquityOptionSymbol", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (OptionSymbol)mapper.readValue(json, OptionSymbol.class);
      } catch (Exception var13) {
         throw new XigniteApiException(var13.getMessage());
      }
   }

   public Option getEquityOption(String identifier, IdentifierTypes identifierType, OptionTypes type, int month, int year, double strikePrice, String symbologyType, String optionExchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Type", String.valueOf(type));
         params.put("Month", String.valueOf(month));
         params.put("Year", String.valueOf(year));
         params.put("StrikePrice", String.valueOf(strikePrice));
         params.put("SymbologyType", String.valueOf(symbologyType));
         params.put("OptionExchange", String.valueOf(optionExchange));
         String json = RestClient.get(this.endPointUrl + "/GetEquityOption", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Option)mapper.readValue(json, Option.class);
      } catch (Exception var13) {
         throw new XigniteApiException(var13.getMessage());
      }
   }

   public Option getEquityOptionHTTP(String identifier, IdentifierTypes identifierType, OptionTypes type, int month, int year, double strikePrice, String symbologyType, String optionExchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Type", String.valueOf(type));
         params.put("Month", String.valueOf(month));
         params.put("Year", String.valueOf(year));
         params.put("StrikePrice", String.valueOf(strikePrice));
         params.put("SymbologyType", String.valueOf(symbologyType));
         params.put("OptionExchange", String.valueOf(optionExchange));
         String json = RestClient.get(this.endPointUrl + "/GetEquityOption", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Option)mapper.readValue(json, Option.class);
      } catch (Exception var13) {
         throw new XigniteApiException(var13.getMessage());
      }
   }

   public ExtendedOption getExtendedEquityOption(String identifier, IdentifierTypes identifierType, OptionTypes type, int month, int year, double strikePrice, String symbologyType, String optionExchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Type", String.valueOf(type));
         params.put("Month", String.valueOf(month));
         params.put("Year", String.valueOf(year));
         params.put("StrikePrice", String.valueOf(strikePrice));
         params.put("SymbologyType", String.valueOf(symbologyType));
         params.put("OptionExchange", String.valueOf(optionExchange));
         String json = RestClient.get(this.endPointUrl + "/GetExtendedEquityOption", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExtendedOption)mapper.readValue(json, ExtendedOption.class);
      } catch (Exception var13) {
         throw new XigniteApiException(var13.getMessage());
      }
   }

   public ExtendedOption getExtendedEquityOptionHTTP(String identifier, IdentifierTypes identifierType, OptionTypes type, int month, int year, double strikePrice, String symbologyType, String optionExchange) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Type", String.valueOf(type));
         params.put("Month", String.valueOf(month));
         params.put("Year", String.valueOf(year));
         params.put("StrikePrice", String.valueOf(strikePrice));
         params.put("SymbologyType", String.valueOf(symbologyType));
         params.put("OptionExchange", String.valueOf(optionExchange));
         String json = RestClient.get(this.endPointUrl + "/GetExtendedEquityOption", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExtendedOption)mapper.readValue(json, ExtendedOption.class);
      } catch (Exception var13) {
         throw new XigniteApiException(var13.getMessage());
      }
   }

   public Option getEquityOptionBySymbol(String symbol, String symbologyType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("SymbologyType", String.valueOf(symbologyType));
         String json = RestClient.get(this.endPointUrl + "/GetEquityOptionBySymbol", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Option)mapper.readValue(json, Option.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public Option getEquityOptionBySymbolHTTP(String symbol, String symbologyType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("SymbologyType", String.valueOf(symbologyType));
         String json = RestClient.get(this.endPointUrl + "/GetEquityOptionBySymbol", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Option)mapper.readValue(json, Option.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public ExtendedOption getExtendedEquityOptionBySymbol(String symbol, String symbologyType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("SymbologyType", String.valueOf(symbologyType));
         String json = RestClient.get(this.endPointUrl + "/GetExtendedEquityOptionBySymbol", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExtendedOption)mapper.readValue(json, ExtendedOption.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public ExtendedOption getExtendedEquityOptionBySymbolHTTP(String symbol, String symbologyType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("SymbologyType", String.valueOf(symbologyType));
         String json = RestClient.get(this.endPointUrl + "/GetExtendedEquityOptionBySymbol", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExtendedOption)mapper.readValue(json, ExtendedOption.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public Option[] getEquityOptionBySymbols(String symbols, String symbologyType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbols", String.valueOf(symbols));
         params.put("SymbologyType", String.valueOf(symbologyType));
         String json = RestClient.get(this.endPointUrl + "/GetEquityOptionBySymbols", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Option[])mapper.readValue(json, Option[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public Option[] getEquityOptionBySymbolsHTTP(String symbols, String symbologyType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbols", String.valueOf(symbols));
         params.put("SymbologyType", String.valueOf(symbologyType));
         String json = RestClient.get(this.endPointUrl + "/GetEquityOptionBySymbols", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Option[])mapper.readValue(json, Option[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public ExtendedOption[] getExtendedEquityOptionBySymbols(String symbols, String symbologyType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbols", String.valueOf(symbols));
         params.put("SymbologyType", String.valueOf(symbologyType));
         String json = RestClient.get(this.endPointUrl + "/GetExtendedEquityOptionBySymbols", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExtendedOption[])mapper.readValue(json, ExtendedOption[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public ExtendedOption[] getExtendedEquityOptionBySymbolsHTTP(String symbols, String symbologyType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbols", String.valueOf(symbols));
         params.put("SymbologyType", String.valueOf(symbologyType));
         String json = RestClient.get(this.endPointUrl + "/GetExtendedEquityOptionBySymbols", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ExtendedOption[])mapper.readValue(json, ExtendedOption[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public NumericResult getBlackScholesOptionValue(OptionTypes type, double stockPrice, double strikePrice, double yearsToMaturity, double riskFreeRate, double volatility) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("StockPrice", String.valueOf(stockPrice));
         params.put("StrikePrice", String.valueOf(strikePrice));
         params.put("YearsToMaturity", String.valueOf(yearsToMaturity));
         params.put("RiskFreeRate", String.valueOf(riskFreeRate));
         params.put("Volatility", String.valueOf(volatility));
         String json = RestClient.get(this.endPointUrl + "/GetBlackScholesOptionValue", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (NumericResult)mapper.readValue(json, NumericResult.class);
      } catch (Exception var15) {
         throw new XigniteApiException(var15.getMessage());
      }
   }

   public NumericResult getBlackScholesOptionValueHTTP(OptionTypes type, double stockPrice, double strikePrice, double yearsToMaturity, double riskFreeRate, double volatility) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Type", String.valueOf(type));
         params.put("StockPrice", String.valueOf(stockPrice));
         params.put("StrikePrice", String.valueOf(strikePrice));
         params.put("YearsToMaturity", String.valueOf(yearsToMaturity));
         params.put("RiskFreeRate", String.valueOf(riskFreeRate));
         params.put("Volatility", String.valueOf(volatility));
         String json = RestClient.get(this.endPointUrl + "/GetBlackScholesOptionValue", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (NumericResult)mapper.readValue(json, NumericResult.class);
      } catch (Exception var15) {
         throw new XigniteApiException(var15.getMessage());
      }
   }

   public OptionChartBars getChartBars(String symbol, String symbologyType, String startTime, String endTime, String precision, int period, boolean includeExtended) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("SymbologyType", String.valueOf(symbologyType));
         params.put("StartTime", String.valueOf(startTime));
         params.put("EndTime", String.valueOf(endTime));
         params.put("Precision", String.valueOf(precision));
         params.put("Period", String.valueOf(period));
         params.put("IncludeExtended", String.valueOf(includeExtended));
         String json = RestClient.get(this.endPointUrl + "/GetChartBars", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (OptionChartBars)mapper.readValue(json, OptionChartBars.class);
      } catch (Exception var11) {
         throw new XigniteApiException(var11.getMessage());
      }
   }

   public OptionChartBars getChartBarsHTTP(String symbol, String symbologyType, String startTime, String endTime, String precision, int period, boolean includeExtended) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         params.put("SymbologyType", String.valueOf(symbologyType));
         params.put("StartTime", String.valueOf(startTime));
         params.put("EndTime", String.valueOf(endTime));
         params.put("Precision", String.valueOf(precision));
         params.put("Period", String.valueOf(period));
         params.put("IncludeExtended", String.valueOf(includeExtended));
         String json = RestClient.get(this.endPointUrl + "/GetChartBars", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (OptionChartBars)mapper.readValue(json, OptionChartBars.class);
      } catch (Exception var11) {
         throw new XigniteApiException(var11.getMessage());
      }
   }
}
