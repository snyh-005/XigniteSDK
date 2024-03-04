package com.xignite.sdk.api.webservices.XigniteBonds;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xignite.sdk.api.ApiBase;
import com.xignite.sdk.api.webservices.XigniteBonds.Models.DailyOpenHighLowClosePrice;
import com.xignite.sdk.api.webservices.XigniteBonds.Models.IdentifierTypes;
import com.xignite.sdk.api.webservices.XigniteBonds.Models.LastSale;
import com.xignite.sdk.api.webservices.XigniteBonds.Models.ListBondsResult;
import com.xignite.sdk.api.webservices.XigniteBonds.Models.PriceComposite;
import com.xignite.sdk.api.webservices.XigniteBonds.Models.PriceSources;
import com.xignite.sdk.exceptions.XigniteApiException;
import com.xignite.sdk.utilities.RestClient;
import java.util.LinkedHashMap;

public class XigniteBonds extends ApiBase {
   public XigniteBonds(String apiToken) {
      this.apiToken = apiToken;
      this.endPointUrl = "http://bonds.xignite.com/xBonds.json";
   }

   public ListBondsResult listBonds(String priceSource, String bondType, String startSymbol, String endSymbol) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("PriceSource", String.valueOf(priceSource));
         params.put("BondType", String.valueOf(bondType));
         params.put("StartSymbol", String.valueOf(startSymbol));
         params.put("EndSymbol", String.valueOf(endSymbol));
         String json = RestClient.get(this.endPointUrl + "/ListBonds", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ListBondsResult)mapper.readValue(json, ListBondsResult.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public ListBondsResult listBondsHTTP(String priceSource, String bondType, String startSymbol, String endSymbol) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("PriceSource", String.valueOf(priceSource));
         params.put("BondType", String.valueOf(bondType));
         params.put("StartSymbol", String.valueOf(startSymbol));
         params.put("EndSymbol", String.valueOf(endSymbol));
         String json = RestClient.get(this.endPointUrl + "/ListBonds", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ListBondsResult)mapper.readValue(json, ListBondsResult.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public LastSale getLastSale(String identifier, IdentifierTypes identifierType, PriceSources priceSource) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("PriceSource", String.valueOf(priceSource));
         String json = RestClient.get(this.endPointUrl + "/GetLastSale", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (LastSale)mapper.readValue(json, LastSale.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public LastSale getLastSaleHTTP(String identifier, IdentifierTypes identifierType, PriceSources priceSource) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("PriceSource", String.valueOf(priceSource));
         String json = RestClient.get(this.endPointUrl + "/GetLastSale", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (LastSale)mapper.readValue(json, LastSale.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public LastSale[] getLastSales(String identifiers, IdentifierTypes identifierType, PriceSources priceSource) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("PriceSource", String.valueOf(priceSource));
         String json = RestClient.get(this.endPointUrl + "/GetLastSales", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (LastSale[])mapper.readValue(json, LastSale[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public LastSale[] getLastSalesHTTP(String identifiers, IdentifierTypes identifierType, PriceSources priceSource) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("PriceSource", String.valueOf(priceSource));
         String json = RestClient.get(this.endPointUrl + "/GetLastSales", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (LastSale[])mapper.readValue(json, LastSale[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public PriceComposite getPriceComposite(String identifier, IdentifierTypes identifierType, PriceSources priceSource) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("PriceSource", String.valueOf(priceSource));
         String json = RestClient.get(this.endPointUrl + "/GetPriceComposite", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (PriceComposite)mapper.readValue(json, PriceComposite.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public PriceComposite getPriceCompositeHTTP(String identifier, IdentifierTypes identifierType, PriceSources priceSource) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("PriceSource", String.valueOf(priceSource));
         String json = RestClient.get(this.endPointUrl + "/GetPriceComposite", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (PriceComposite)mapper.readValue(json, PriceComposite.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public PriceComposite[] getPriceComposites(String identifiers, IdentifierTypes identifierType, PriceSources priceSource) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("PriceSource", String.valueOf(priceSource));
         String json = RestClient.get(this.endPointUrl + "/GetPriceComposites", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (PriceComposite[])mapper.readValue(json, PriceComposite[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public PriceComposite[] getPriceCompositesHTTP(String identifiers, IdentifierTypes identifierType, PriceSources priceSource) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("PriceSource", String.valueOf(priceSource));
         String json = RestClient.get(this.endPointUrl + "/GetPriceComposites", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (PriceComposite[])mapper.readValue(json, PriceComposite[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public DailyOpenHighLowClosePrice getDailyOpenHighLowClosePrice(String identifier, IdentifierTypes identifierType, PriceSources priceSource) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("PriceSource", String.valueOf(priceSource));
         String json = RestClient.get(this.endPointUrl + "/GetDailyOpenHighLowClosePrice", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (DailyOpenHighLowClosePrice)mapper.readValue(json, DailyOpenHighLowClosePrice.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public DailyOpenHighLowClosePrice getDailyOpenHighLowClosePriceHTTP(String identifier, IdentifierTypes identifierType, PriceSources priceSource) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("PriceSource", String.valueOf(priceSource));
         String json = RestClient.get(this.endPointUrl + "/GetDailyOpenHighLowClosePrice", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (DailyOpenHighLowClosePrice)mapper.readValue(json, DailyOpenHighLowClosePrice.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public DailyOpenHighLowClosePrice[] getDailyOpenHighLowClosePrices(String identifiers, IdentifierTypes identifierType, PriceSources priceSource) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("PriceSource", String.valueOf(priceSource));
         String json = RestClient.get(this.endPointUrl + "/GetDailyOpenHighLowClosePrices", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (DailyOpenHighLowClosePrice[])mapper.readValue(json, DailyOpenHighLowClosePrice[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public DailyOpenHighLowClosePrice[] getDailyOpenHighLowClosePricesHTTP(String identifiers, IdentifierTypes identifierType, PriceSources priceSource) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("PriceSource", String.valueOf(priceSource));
         String json = RestClient.get(this.endPointUrl + "/GetDailyOpenHighLowClosePrices", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (DailyOpenHighLowClosePrice[])mapper.readValue(json, DailyOpenHighLowClosePrice[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }
}
