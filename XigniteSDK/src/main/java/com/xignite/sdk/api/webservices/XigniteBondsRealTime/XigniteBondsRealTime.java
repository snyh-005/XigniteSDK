package com.xignite.sdk.api.webservices.XigniteBondsRealTime;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xignite.sdk.api.ApiBase;
import com.xignite.sdk.api.webservices.XigniteBondsRealTime.Models.DailyOpenHighLowClosePrice;
import com.xignite.sdk.api.webservices.XigniteBondsRealTime.Models.IdentifierTypes;
import com.xignite.sdk.api.webservices.XigniteBondsRealTime.Models.LastSale;
import com.xignite.sdk.api.webservices.XigniteBondsRealTime.Models.PriceComposite;
import com.xignite.sdk.api.webservices.XigniteBondsRealTime.Models.PriceSources;
import com.xignite.sdk.exceptions.XigniteApiException;
import com.xignite.sdk.utilities.RestClient;
import java.util.LinkedHashMap;

public class XigniteBondsRealTime extends ApiBase {
   public XigniteBondsRealTime(String apiToken) {
      this.apiToken = apiToken;
      this.endPointUrl = "http://bondsrealtime.xignite.com/xBondsRealTime.json";
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
