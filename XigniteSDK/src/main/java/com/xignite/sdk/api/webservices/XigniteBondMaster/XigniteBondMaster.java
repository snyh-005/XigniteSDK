package com.xignite.sdk.api.webservices.XigniteBondMaster;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xignite.sdk.api.ApiBase;
import com.xignite.sdk.api.webservices.XigniteBondMaster.Models.BondDescription;
import com.xignite.sdk.api.webservices.XigniteBondMaster.Models.BondTypeList;
import com.xignite.sdk.api.webservices.XigniteBondMaster.Models.DataPointsList;
import com.xignite.sdk.api.webservices.XigniteBondMaster.Models.DomicileList;
import com.xignite.sdk.api.webservices.XigniteBondMaster.Models.EarlyRedemptionScheduleComposite;
import com.xignite.sdk.api.webservices.XigniteBondMaster.Models.GenericDataPoints;
import com.xignite.sdk.api.webservices.XigniteBondMaster.Models.IdentifierTypes;
import com.xignite.sdk.api.webservices.XigniteBondMaster.Models.IssuerTypeList;
import com.xignite.sdk.api.webservices.XigniteBondMaster.Models.ListBondsResult;
import com.xignite.sdk.api.webservices.XigniteBondMaster.Models.ScreenBondsResult;
import com.xignite.sdk.exceptions.XigniteApiException;
import com.xignite.sdk.utilities.RestClient;
import java.util.LinkedHashMap;

public class XigniteBondMaster extends ApiBase {
   public XigniteBondMaster(String apiToken) {
      this.apiToken = apiToken;
      this.endPointUrl = "http://bondmaster.xignite.com/xBondMaster.json";
   }

   public BondTypeList listBondTypes() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListBondTypes", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (BondTypeList)mapper.readValue(json, BondTypeList.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public BondTypeList listBondTypesHTTP() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListBondTypes", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (BondTypeList)mapper.readValue(json, BondTypeList.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public IssuerTypeList listIssuerTypes() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListIssuerTypes", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IssuerTypeList)mapper.readValue(json, IssuerTypeList.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public IssuerTypeList listIssuerTypesHTTP() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListIssuerTypes", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IssuerTypeList)mapper.readValue(json, IssuerTypeList.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public DomicileList listBondDomiciles() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListBondDomiciles", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (DomicileList)mapper.readValue(json, DomicileList.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public DomicileList listBondDomicilesHTTP() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListBondDomiciles", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (DomicileList)mapper.readValue(json, DomicileList.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public ListBondsResult listBonds(String domicileCode, String issuerType, String bondType, String startSymbol, String endSymbol) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("DomicileCode", String.valueOf(domicileCode));
         params.put("IssuerType", String.valueOf(issuerType));
         params.put("BondType", String.valueOf(bondType));
         params.put("StartSymbol", String.valueOf(startSymbol));
         params.put("EndSymbol", String.valueOf(endSymbol));
         String json = RestClient.get(this.endPointUrl + "/ListBonds", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ListBondsResult)mapper.readValue(json, ListBondsResult.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public ListBondsResult listBondsHTTP(String domicileCode, String issuerType, String bondType, String startSymbol, String endSymbol) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("DomicileCode", String.valueOf(domicileCode));
         params.put("IssuerType", String.valueOf(issuerType));
         params.put("BondType", String.valueOf(bondType));
         params.put("StartSymbol", String.valueOf(startSymbol));
         params.put("EndSymbol", String.valueOf(endSymbol));
         String json = RestClient.get(this.endPointUrl + "/ListBonds", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ListBondsResult)mapper.readValue(json, ListBondsResult.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public DataPointsList listBondDataPoints() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListBondDataPoints", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (DataPointsList)mapper.readValue(json, DataPointsList.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public DataPointsList listBondDataPointsHTTP() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListBondDataPoints", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (DataPointsList)mapper.readValue(json, DataPointsList.class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
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

   public BondDescription[] getBondDescriptions(String identifiers, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetBondDescriptions", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (BondDescription[])mapper.readValue(json, BondDescription[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public BondDescription[] getBondDescriptionsHTTP(String identifiers, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetBondDescriptions", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (BondDescription[])mapper.readValue(json, BondDescription[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public GenericDataPoints[] getBondDataPoints(String identifierType, String identifiers, String dataPointTypes) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("DataPointTypes", String.valueOf(dataPointTypes));
         String json = RestClient.get(this.endPointUrl + "/GetBondDataPoints", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GenericDataPoints[])mapper.readValue(json, GenericDataPoints[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public GenericDataPoints[] getBondDataPointsHTTP(String identifierType, String identifiers, String dataPointTypes) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("DataPointTypes", String.valueOf(dataPointTypes));
         String json = RestClient.get(this.endPointUrl + "/GetBondDataPoints", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (GenericDataPoints[])mapper.readValue(json, GenericDataPoints[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public EarlyRedemptionScheduleComposite[] getEarlyRedemptionSchedule(String identifiers, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetEarlyRedemptionSchedule", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (EarlyRedemptionScheduleComposite[])mapper.readValue(json, EarlyRedemptionScheduleComposite[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public EarlyRedemptionScheduleComposite[] getEarlyRedemptionScheduleHTTP(String identifiers, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetEarlyRedemptionSchedule", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (EarlyRedemptionScheduleComposite[])mapper.readValue(json, EarlyRedemptionScheduleComposite[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public ScreenBondsResult screenBonds(String issuer, String domicileCode, String issuerType, String bondType, String startMaturityDate, String endMaturityDate, String minCouponRate, String maxCouponRate, String callable, String convertible, boolean includeNonactive, String maxResultCount) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Issuer", String.valueOf(issuer));
         params.put("DomicileCode", String.valueOf(domicileCode));
         params.put("IssuerType", String.valueOf(issuerType));
         params.put("BondType", String.valueOf(bondType));
         params.put("StartMaturityDate", String.valueOf(startMaturityDate));
         params.put("EndMaturityDate", String.valueOf(endMaturityDate));
         params.put("MinCouponRate", String.valueOf(minCouponRate));
         params.put("MaxCouponRate", String.valueOf(maxCouponRate));
         params.put("Callable", String.valueOf(callable));
         params.put("Convertible", String.valueOf(convertible));
         params.put("IncludeNonactive", String.valueOf(includeNonactive));
         params.put("MaxResultCount", String.valueOf(maxResultCount));
         String json = RestClient.get(this.endPointUrl + "/ScreenBonds", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ScreenBondsResult)mapper.readValue(json, ScreenBondsResult.class);
      } catch (Exception var16) {
         throw new XigniteApiException(var16.getMessage());
      }
   }

   public ScreenBondsResult screenBondsHTTP(String issuer, String domicileCode, String issuerType, String bondType, String startMaturityDate, String endMaturityDate, String minCouponRate, String maxCouponRate, String callable, String convertible, boolean includeNonactive, String maxResultCount) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Issuer", String.valueOf(issuer));
         params.put("DomicileCode", String.valueOf(domicileCode));
         params.put("IssuerType", String.valueOf(issuerType));
         params.put("BondType", String.valueOf(bondType));
         params.put("StartMaturityDate", String.valueOf(startMaturityDate));
         params.put("EndMaturityDate", String.valueOf(endMaturityDate));
         params.put("MinCouponRate", String.valueOf(minCouponRate));
         params.put("MaxCouponRate", String.valueOf(maxCouponRate));
         params.put("Callable", String.valueOf(callable));
         params.put("Convertible", String.valueOf(convertible));
         params.put("IncludeNonactive", String.valueOf(includeNonactive));
         params.put("MaxResultCount", String.valueOf(maxResultCount));
         String json = RestClient.get(this.endPointUrl + "/ScreenBonds", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ScreenBondsResult)mapper.readValue(json, ScreenBondsResult.class);
      } catch (Exception var16) {
         throw new XigniteApiException(var16.getMessage());
      }
   }
}
