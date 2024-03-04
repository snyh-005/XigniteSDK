package com.xignite.sdk.api.webservices.XigniteEdgar;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xignite.sdk.api.ApiBase;
import com.xignite.sdk.api.webservices.XigniteEdgar.Models.CIKLookup;
import com.xignite.sdk.api.webservices.XigniteEdgar.Models.DayTypes;
import com.xignite.sdk.api.webservices.XigniteEdgar.Models.Filing;
import com.xignite.sdk.api.webservices.XigniteEdgar.Models.FilingDetails;
import com.xignite.sdk.api.webservices.XigniteEdgar.Models.FilingOccurrence;
import com.xignite.sdk.api.webservices.XigniteEdgar.Models.IdentifierTypes;
import com.xignite.sdk.api.webservices.XigniteEdgar.Models.LastFormTypes;
import com.xignite.sdk.api.webservices.XigniteEdgar.Models.MasterDocumentsResult;
import com.xignite.sdk.api.webservices.XigniteEdgar.Models.OutputTypes;
import com.xignite.sdk.api.webservices.XigniteEdgar.Models.OwnershipFormTypes;
import com.xignite.sdk.api.webservices.XigniteEdgar.Models.PredefinedQueryTypes;
import com.xignite.sdk.api.webservices.XigniteEdgar.Models.QueryResult;
import com.xignite.sdk.api.webservices.XigniteEdgar.Models.RecentFormTypes;
import com.xignite.sdk.api.webservices.XigniteEdgar.Models.SICCode;
import com.xignite.sdk.api.webservices.XigniteEdgar.Models.SearchResult;
import com.xignite.sdk.api.webservices.XigniteEdgar.Models.Security;
import com.xignite.sdk.api.webservices.XigniteEdgar.Models.Submission;
import com.xignite.sdk.exceptions.XigniteApiException;
import com.xignite.sdk.utilities.RestClient;
import java.util.LinkedHashMap;

public class XigniteEdgar extends ApiBase {
   public XigniteEdgar(String apiToken) {
      this.apiToken = apiToken;
      this.endPointUrl = "http://www.xignite.com/xEdgar.json";
   }

   public SICCode[] listSICCodes(String name) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Name", String.valueOf(name));
         String json = RestClient.get(this.endPointUrl + "/ListSICCodes", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SICCode[])mapper.readValue(json, SICCode[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public SICCode[] listSICCodesHTTP(String name) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Name", String.valueOf(name));
         String json = RestClient.get(this.endPointUrl + "/ListSICCodes", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SICCode[])mapper.readValue(json, SICCode[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public Submission[] listSECFilingTypes(String name) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Name", String.valueOf(name));
         String json = RestClient.get(this.endPointUrl + "/ListSECFilingTypes", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Submission[])mapper.readValue(json, Submission[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public Submission[] listSECFilingTypesHTTP(String name) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Name", String.valueOf(name));
         String json = RestClient.get(this.endPointUrl + "/ListSECFilingTypes", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Submission[])mapper.readValue(json, Submission[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public CIKLookup[] lookupCIK(String name) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Name", String.valueOf(name));
         String json = RestClient.get(this.endPointUrl + "/LookupCIK", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CIKLookup[])mapper.readValue(json, CIKLookup[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public CIKLookup[] lookupCIKHTTP(String name) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Name", String.valueOf(name));
         String json = RestClient.get(this.endPointUrl + "/LookupCIK", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (CIKLookup[])mapper.readValue(json, CIKLookup[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public Security getCIK(String symbol) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         String json = RestClient.get(this.endPointUrl + "/GetCIK", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Security)mapper.readValue(json, Security.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public Security getCIKHTTP(String symbol) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Symbol", String.valueOf(symbol));
         String json = RestClient.get(this.endPointUrl + "/GetCIK", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Security)mapper.readValue(json, Security.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public SearchResult searchFilings(String identifier, IdentifierTypes identifierType, String form, OwnershipFormTypes ownershipForms, String priorToDate, OutputTypes outputType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Form", String.valueOf(form));
         params.put("OwnershipForms", String.valueOf(ownershipForms));
         params.put("PriorToDate", String.valueOf(priorToDate));
         params.put("OutputType", String.valueOf(outputType));
         String json = RestClient.get(this.endPointUrl + "/SearchFilings", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SearchResult)mapper.readValue(json, SearchResult.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public SearchResult searchFilingsHTTP(String identifier, IdentifierTypes identifierType, String form, OwnershipFormTypes ownershipForms, String priorToDate, OutputTypes outputType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Form", String.valueOf(form));
         params.put("OwnershipForms", String.valueOf(ownershipForms));
         params.put("PriorToDate", String.valueOf(priorToDate));
         params.put("OutputType", String.valueOf(outputType));
         String json = RestClient.get(this.endPointUrl + "/SearchFilings", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (SearchResult)mapper.readValue(json, SearchResult.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public QueryResult predefinedQueryFilings(String identifier, IdentifierTypes identifierType, PredefinedQueryTypes predefinedQueryType, String fromDate, String toDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("PredefinedQueryType", String.valueOf(predefinedQueryType));
         params.put("FromDate", String.valueOf(fromDate));
         params.put("ToDate", String.valueOf(toDate));
         String json = RestClient.get(this.endPointUrl + "/PredefinedQueryFilings", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (QueryResult)mapper.readValue(json, QueryResult.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public QueryResult predefinedQueryFilingsHTTP(String identifier, IdentifierTypes identifierType, PredefinedQueryTypes predefinedQueryType, String fromDate, String toDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("PredefinedQueryType", String.valueOf(predefinedQueryType));
         params.put("FromDate", String.valueOf(fromDate));
         params.put("ToDate", String.valueOf(toDate));
         String json = RestClient.get(this.endPointUrl + "/PredefinedQueryFilings", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (QueryResult)mapper.readValue(json, QueryResult.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public QueryResult queryFilings(String identifier, IdentifierTypes identifierType, String form, OwnershipFormTypes ownershipForms, String fromDate, String toDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Form", String.valueOf(form));
         params.put("OwnershipForms", String.valueOf(ownershipForms));
         params.put("FromDate", String.valueOf(fromDate));
         params.put("ToDate", String.valueOf(toDate));
         String json = RestClient.get(this.endPointUrl + "/QueryFilings", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (QueryResult)mapper.readValue(json, QueryResult.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public QueryResult queryFilingsHTTP(String identifier, IdentifierTypes identifierType, String form, OwnershipFormTypes ownershipForms, String fromDate, String toDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Form", String.valueOf(form));
         params.put("OwnershipForms", String.valueOf(ownershipForms));
         params.put("FromDate", String.valueOf(fromDate));
         params.put("ToDate", String.valueOf(toDate));
         String json = RestClient.get(this.endPointUrl + "/QueryFilings", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (QueryResult)mapper.readValue(json, QueryResult.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public MasterDocumentsResult queryMasterDocuments(String identifier, IdentifierTypes identifierType, String form, OwnershipFormTypes ownershipForms, String fromDate, String toDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Form", String.valueOf(form));
         params.put("OwnershipForms", String.valueOf(ownershipForms));
         params.put("FromDate", String.valueOf(fromDate));
         params.put("ToDate", String.valueOf(toDate));
         String json = RestClient.get(this.endPointUrl + "/QueryMasterDocuments", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (MasterDocumentsResult)mapper.readValue(json, MasterDocumentsResult.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public MasterDocumentsResult queryMasterDocumentsHTTP(String identifier, IdentifierTypes identifierType, String form, OwnershipFormTypes ownershipForms, String fromDate, String toDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Form", String.valueOf(form));
         params.put("OwnershipForms", String.valueOf(ownershipForms));
         params.put("FromDate", String.valueOf(fromDate));
         params.put("ToDate", String.valueOf(toDate));
         String json = RestClient.get(this.endPointUrl + "/QueryMasterDocuments", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (MasterDocumentsResult)mapper.readValue(json, MasterDocumentsResult.class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public FilingOccurrence[] getFilingOccurrences(String identifier, IdentifierTypes identifierType, String fromDate, String toDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("FromDate", String.valueOf(fromDate));
         params.put("ToDate", String.valueOf(toDate));
         String json = RestClient.get(this.endPointUrl + "/GetFilingOccurrences", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FilingOccurrence[])mapper.readValue(json, FilingOccurrence[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public FilingOccurrence[] getFilingOccurrencesHTTP(String identifier, IdentifierTypes identifierType, String fromDate, String toDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("FromDate", String.valueOf(fromDate));
         params.put("ToDate", String.valueOf(toDate));
         String json = RestClient.get(this.endPointUrl + "/GetFilingOccurrences", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FilingOccurrence[])mapper.readValue(json, FilingOccurrence[].class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public Filing getLastFiling(String identifier, IdentifierTypes identifierType, LastFormTypes form) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Form", String.valueOf(form));
         String json = RestClient.get(this.endPointUrl + "/GetLastFiling", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Filing)mapper.readValue(json, Filing.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public Filing getLastFilingHTTP(String identifier, IdentifierTypes identifierType, LastFormTypes form) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("Form", String.valueOf(form));
         String json = RestClient.get(this.endPointUrl + "/GetLastFiling", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Filing)mapper.readValue(json, Filing.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public Filing[] getRecentFilings(DayTypes day, RecentFormTypes form) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Day", String.valueOf(day));
         params.put("Form", String.valueOf(form));
         String json = RestClient.get(this.endPointUrl + "/GetRecentFilings", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Filing[])mapper.readValue(json, Filing[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public Filing[] getRecentFilingsHTTP(DayTypes day, RecentFormTypes form) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Day", String.valueOf(day));
         params.put("Form", String.valueOf(form));
         String json = RestClient.get(this.endPointUrl + "/GetRecentFilings", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Filing[])mapper.readValue(json, Filing[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public FilingDetails getFilingDetails(String htmlFileUrl) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("HtmlFileUrl", String.valueOf(htmlFileUrl));
         String json = RestClient.get(this.endPointUrl + "/GetFilingDetails", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FilingDetails)mapper.readValue(json, FilingDetails.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public FilingDetails getFilingDetailsHTTP(String htmlFileUrl) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("HtmlFileUrl", String.valueOf(htmlFileUrl));
         String json = RestClient.get(this.endPointUrl + "/GetFilingDetails", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FilingDetails)mapper.readValue(json, FilingDetails.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }
}
