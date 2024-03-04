package com.xignite.sdk.api.webservices.XigniteGlobalBondMaster;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xignite.sdk.api.ApiBase;
import com.xignite.sdk.api.webservices.XigniteGlobalBondMaster.Models.BondDescription;
import com.xignite.sdk.api.webservices.XigniteGlobalBondMaster.Models.Countries;
import com.xignite.sdk.api.webservices.XigniteGlobalBondMaster.Models.IdentifierTypes;
import com.xignite.sdk.api.webservices.XigniteGlobalBondMaster.Models.ProvisionsFlag;
import com.xignite.sdk.api.webservices.XigniteGlobalBondMaster.Models.ScreenBondResult;
import com.xignite.sdk.exceptions.XigniteApiException;
import com.xignite.sdk.utilities.RestClient;
import java.util.LinkedHashMap;

public class XigniteGlobalBondMaster extends ApiBase {
   public XigniteGlobalBondMaster(String apiToken) {
      this.apiToken = apiToken;
      this.endPointUrl = "http://globalbondmaster.xignite.com/xGlobalBondMaster.json";
   }

   public BondDescription getBondDescription(String identifier, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetBondDescription", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (BondDescription)mapper.readValue(json, BondDescription.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public BondDescription getBondDescriptionHTTP(String identifier, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetBondDescription", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (BondDescription)mapper.readValue(json, BondDescription.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public ScreenBondResult[] screenBonds(String issuer, Countries domicile, String startMaturityDate, String endMaturityDate, String startCouponRate, String endCouponRate, ProvisionsFlag callable, ProvisionsFlag convertible, boolean includeNonactive, int maxResultCount) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Issuer", String.valueOf(issuer));
         params.put("Domicile", String.valueOf(domicile));
         params.put("StartMaturityDate", String.valueOf(startMaturityDate));
         params.put("EndMaturityDate", String.valueOf(endMaturityDate));
         params.put("StartCouponRate", String.valueOf(startCouponRate));
         params.put("EndCouponRate", String.valueOf(endCouponRate));
         params.put("Callable", String.valueOf(callable));
         params.put("Convertible", String.valueOf(convertible));
         params.put("IncludeNonactive", String.valueOf(includeNonactive));
         params.put("MaxResultCount", String.valueOf(maxResultCount));
         String json = RestClient.get(this.endPointUrl + "/ScreenBonds", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ScreenBondResult[])mapper.readValue(json, ScreenBondResult[].class);
      } catch (Exception var14) {
         throw new XigniteApiException(var14.getMessage());
      }
   }

   public ScreenBondResult[] screenBondsHTTP(String issuer, Countries domicile, String startMaturityDate, String endMaturityDate, String startCouponRate, String endCouponRate, ProvisionsFlag callable, ProvisionsFlag convertible, boolean includeNonactive, int maxResultCount) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Issuer", String.valueOf(issuer));
         params.put("Domicile", String.valueOf(domicile));
         params.put("StartMaturityDate", String.valueOf(startMaturityDate));
         params.put("EndMaturityDate", String.valueOf(endMaturityDate));
         params.put("StartCouponRate", String.valueOf(startCouponRate));
         params.put("EndCouponRate", String.valueOf(endCouponRate));
         params.put("Callable", String.valueOf(callable));
         params.put("Convertible", String.valueOf(convertible));
         params.put("IncludeNonactive", String.valueOf(includeNonactive));
         params.put("MaxResultCount", String.valueOf(maxResultCount));
         String json = RestClient.get(this.endPointUrl + "/ScreenBonds", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ScreenBondResult[])mapper.readValue(json, ScreenBondResult[].class);
      } catch (Exception var14) {
         throw new XigniteApiException(var14.getMessage());
      }
   }
}
