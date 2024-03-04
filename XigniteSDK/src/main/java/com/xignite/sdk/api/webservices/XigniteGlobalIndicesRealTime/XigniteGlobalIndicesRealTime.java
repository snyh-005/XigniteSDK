package com.xignite.sdk.api.webservices.XigniteGlobalIndicesRealTime;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xignite.sdk.api.ApiBase;
import com.xignite.sdk.api.webservices.XigniteGlobalIndicesRealTime.Models.BarPrecision;
import com.xignite.sdk.api.webservices.XigniteGlobalIndicesRealTime.Models.IdentifierTypes;
import com.xignite.sdk.api.webservices.XigniteGlobalIndicesRealTime.Models.IndexBar;
import com.xignite.sdk.api.webservices.XigniteGlobalIndicesRealTime.Models.IndexBars;
import com.xignite.sdk.api.webservices.XigniteGlobalIndicesRealTime.Models.IndexChartBars;
import com.xignite.sdk.api.webservices.XigniteGlobalIndicesRealTime.Models.IndexDescription;
import com.xignite.sdk.api.webservices.XigniteGlobalIndicesRealTime.Models.IndexGroup;
import com.xignite.sdk.api.webservices.XigniteGlobalIndicesRealTime.Models.IndexSymbolMapping;
import com.xignite.sdk.api.webservices.XigniteGlobalIndicesRealTime.Models.IndexValue;
import com.xignite.sdk.exceptions.XigniteApiException;
import com.xignite.sdk.utilities.RestClient;
import java.util.LinkedHashMap;

public class XigniteGlobalIndicesRealTime extends ApiBase {
   public XigniteGlobalIndicesRealTime(String apiToken) {
      this.apiToken = apiToken;
      this.endPointUrl = "http://globalindicesrealtime.xignite.com/xglobalindicesrealtime.json";
   }

   public IndexGroup[] listIndexGroups() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListIndexGroups", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IndexGroup[])mapper.readValue(json, IndexGroup[].class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public IndexGroup[] listIndexGroupsHTTP() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListIndexGroups", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IndexGroup[])mapper.readValue(json, IndexGroup[].class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public IndexDescription[] listIndicesByIndexGroup(String indexGroup) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("IndexGroup", String.valueOf(indexGroup));
         String json = RestClient.get(this.endPointUrl + "/ListIndicesByIndexGroup", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IndexDescription[])mapper.readValue(json, IndexDescription[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public IndexDescription[] listIndicesByIndexGroupHTTP(String indexGroup) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("IndexGroup", String.valueOf(indexGroup));
         String json = RestClient.get(this.endPointUrl + "/ListIndicesByIndexGroup", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IndexDescription[])mapper.readValue(json, IndexDescription[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public IndexDescription[] searchIndicesByName(String indexName) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("IndexName", String.valueOf(indexName));
         String json = RestClient.get(this.endPointUrl + "/SearchIndicesByName", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IndexDescription[])mapper.readValue(json, IndexDescription[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public IndexDescription[] searchIndicesByNameHTTP(String indexName) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("IndexName", String.valueOf(indexName));
         String json = RestClient.get(this.endPointUrl + "/SearchIndicesByName", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IndexDescription[])mapper.readValue(json, IndexDescription[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public IndexValue getRealTimeIndexValue(String identifier, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetRealTimeIndexValue", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IndexValue)mapper.readValue(json, IndexValue.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public IndexValue getRealTimeIndexValueHTTP(String identifier, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetRealTimeIndexValue", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IndexValue)mapper.readValue(json, IndexValue.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public IndexValue[] getRealTimeIndicesValue(String identifiers, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetRealTimeIndicesValue", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IndexValue[])mapper.readValue(json, IndexValue[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public IndexValue[] getRealTimeIndicesValueHTTP(String identifiers, IdentifierTypes identifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         String json = RestClient.get(this.endPointUrl + "/GetRealTimeIndicesValue", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IndexValue[])mapper.readValue(json, IndexValue[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public IndexBar getIndexBar(String identifier, IdentifierTypes identifierType, String endTime, BarPrecision precision, int period) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("EndTime", String.valueOf(endTime));
         params.put("Precision", String.valueOf(precision));
         params.put("Period", String.valueOf(period));
         String json = RestClient.get(this.endPointUrl + "/GetIndexBar", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IndexBar)mapper.readValue(json, IndexBar.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public IndexBar getIndexBarHTTP(String identifier, IdentifierTypes identifierType, String endTime, BarPrecision precision, int period) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("EndTime", String.valueOf(endTime));
         params.put("Precision", String.valueOf(precision));
         params.put("Period", String.valueOf(period));
         String json = RestClient.get(this.endPointUrl + "/GetIndexBar", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IndexBar)mapper.readValue(json, IndexBar.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public IndexBars getIndexBars(String identifier, IdentifierTypes identifierType, String startTime, String endTime, BarPrecision precision, int period) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("StartTime", String.valueOf(startTime));
         params.put("EndTime", String.valueOf(endTime));
         params.put("Precision", String.valueOf(precision));
         params.put("Period", String.valueOf(period));
         String json = RestClient.get(this.endPointUrl + "/GetIndexBars", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IndexBars)mapper.readValue(json, IndexBars.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public IndexBars getIndexBarsHTTP(String identifier, IdentifierTypes identifierType, String startTime, String endTime, BarPrecision precision, int period) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("StartTime", String.valueOf(startTime));
         params.put("EndTime", String.valueOf(endTime));
         params.put("Precision", String.valueOf(precision));
         params.put("Period", String.valueOf(period));
         String json = RestClient.get(this.endPointUrl + "/GetIndexBars", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IndexBars)mapper.readValue(json, IndexBars.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public IndexChartBars getChartBars(String identifier, IdentifierTypes identifierType, String startTime, String endTime, String precision, int period, String adjustmentMethod, boolean includeExtended) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("StartTime", String.valueOf(startTime));
         params.put("EndTime", String.valueOf(endTime));
         params.put("Precision", String.valueOf(precision));
         params.put("Period", String.valueOf(period));
         params.put("AdjustmentMethod", String.valueOf(adjustmentMethod));
         params.put("IncludeExtended", String.valueOf(includeExtended));
         String json = RestClient.get(this.endPointUrl + "/GetChartBars", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IndexChartBars)mapper.readValue(json, IndexChartBars.class);
      } catch (Exception var12) {
         throw new XigniteApiException(var12.getMessage());
      }
   }

   public IndexChartBars getChartBarsHTTP(String identifier, IdentifierTypes identifierType, String startTime, String endTime, String precision, int period, String adjustmentMethod, boolean includeExtended) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("StartTime", String.valueOf(startTime));
         params.put("EndTime", String.valueOf(endTime));
         params.put("Precision", String.valueOf(precision));
         params.put("Period", String.valueOf(period));
         params.put("AdjustmentMethod", String.valueOf(adjustmentMethod));
         params.put("IncludeExtended", String.valueOf(includeExtended));
         String json = RestClient.get(this.endPointUrl + "/GetChartBars", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IndexChartBars)mapper.readValue(json, IndexChartBars.class);
      } catch (Exception var12) {
         throw new XigniteApiException(var12.getMessage());
      }
   }

   public IndexSymbolMapping getIndexSymbolMappingByOldSymbol(String oldSymbol) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("OldSymbol", String.valueOf(oldSymbol));
         String json = RestClient.get(this.endPointUrl + "/GetIndexSymbolMappingByOldSymbol", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IndexSymbolMapping)mapper.readValue(json, IndexSymbolMapping.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public IndexSymbolMapping getIndexSymbolMappingByOldSymbolHTTP(String oldSymbol) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("OldSymbol", String.valueOf(oldSymbol));
         String json = RestClient.get(this.endPointUrl + "/GetIndexSymbolMappingByOldSymbol", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IndexSymbolMapping)mapper.readValue(json, IndexSymbolMapping.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public IndexSymbolMapping[] getIndexSymbolMappingsByOldSymbols(String oldSymbols) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("OldSymbols", String.valueOf(oldSymbols));
         String json = RestClient.get(this.endPointUrl + "/GetIndexSymbolMappingsByOldSymbols", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IndexSymbolMapping[])mapper.readValue(json, IndexSymbolMapping[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public IndexSymbolMapping[] getIndexSymbolMappingsByOldSymbolsHTTP(String oldSymbols) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("OldSymbols", String.valueOf(oldSymbols));
         String json = RestClient.get(this.endPointUrl + "/GetIndexSymbolMappingsByOldSymbols", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IndexSymbolMapping[])mapper.readValue(json, IndexSymbolMapping[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }
}
