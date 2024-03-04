package com.xignite.sdk.api.webservices.XigniteAnalysts;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xignite.sdk.api.ApiBase;
import com.xignite.sdk.api.webservices.XigniteAnalysts.Models.AnalysisGroups;
import com.xignite.sdk.api.webservices.XigniteAnalysts.Models.AnalystFieldTypes;
import com.xignite.sdk.api.webservices.XigniteAnalysts.Models.AnalystsResearchField;
import com.xignite.sdk.api.webservices.XigniteAnalysts.Models.AnalystsResearchFieldList;
import com.xignite.sdk.api.webservices.XigniteAnalysts.Models.AnalystsResearchReportTypes;
import com.xignite.sdk.api.webservices.XigniteAnalysts.Models.IdentifierTypes;
import com.xignite.sdk.api.webservices.XigniteAnalysts.Models.ResearchReport;
import com.xignite.sdk.api.webservices.XigniteAnalysts.Models.ResearchReportTemplate;
import com.xignite.sdk.exceptions.XigniteApiException;
import com.xignite.sdk.utilities.RestClient;
import java.util.LinkedHashMap;

public class XigniteAnalysts extends ApiBase {
   public XigniteAnalysts(String apiToken) {
      this.apiToken = apiToken;
      this.endPointUrl = "http://www.xignite.com/xAnalysts.json";
   }

   public AnalystsResearchField[] listResearchFields() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListResearchFields", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (AnalystsResearchField[])mapper.readValue(json, AnalystsResearchField[].class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public AnalystsResearchField[] listResearchFieldsHTTP() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListResearchFields", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (AnalystsResearchField[])mapper.readValue(json, AnalystsResearchField[].class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public AnalystsResearchField[] searchResearchFields(String pattern) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("pattern", String.valueOf(pattern));
         String json = RestClient.get(this.endPointUrl + "/SearchResearchFields", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (AnalystsResearchField[])mapper.readValue(json, AnalystsResearchField[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public AnalystsResearchField[] searchResearchFieldsHTTP(String pattern) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("pattern", String.valueOf(pattern));
         String json = RestClient.get(this.endPointUrl + "/SearchResearchFields", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (AnalystsResearchField[])mapper.readValue(json, AnalystsResearchField[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public AnalystsResearchField getResearchField(String identifier, IdentifierTypes identifierType, AnalystFieldTypes analystFieldType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("AnalystFieldType", String.valueOf(analystFieldType));
         String json = RestClient.get(this.endPointUrl + "/GetResearchField", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (AnalystsResearchField)mapper.readValue(json, AnalystsResearchField.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public AnalystsResearchField getResearchFieldHTTP(String identifier, IdentifierTypes identifierType, AnalystFieldTypes analystFieldType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("AnalystFieldType", String.valueOf(analystFieldType));
         String json = RestClient.get(this.endPointUrl + "/GetResearchField", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (AnalystsResearchField)mapper.readValue(json, AnalystsResearchField.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public AnalystsResearchFieldList getResearchFieldList(String identifier, IdentifierTypes identifierType, AnalysisGroups analysisGroup) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("AnalysisGroup", String.valueOf(analysisGroup));
         String json = RestClient.get(this.endPointUrl + "/GetResearchFieldList", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (AnalystsResearchFieldList)mapper.readValue(json, AnalystsResearchFieldList.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public AnalystsResearchFieldList getResearchFieldListHTTP(String identifier, IdentifierTypes identifierType, AnalysisGroups analysisGroup) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("AnalysisGroup", String.valueOf(analysisGroup));
         String json = RestClient.get(this.endPointUrl + "/GetResearchFieldList", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (AnalystsResearchFieldList)mapper.readValue(json, AnalystsResearchFieldList.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public AnalystsResearchFieldList[] getResearchFieldLists(String identifiers, IdentifierTypes identifierType, AnalysisGroups analysisGroup) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("AnalysisGroup", String.valueOf(analysisGroup));
         String json = RestClient.get(this.endPointUrl + "/GetResearchFieldLists", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (AnalystsResearchFieldList[])mapper.readValue(json, AnalystsResearchFieldList[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public AnalystsResearchFieldList[] getResearchFieldListsHTTP(String identifiers, IdentifierTypes identifierType, AnalysisGroups analysisGroup) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("AnalysisGroup", String.valueOf(analysisGroup));
         String json = RestClient.get(this.endPointUrl + "/GetResearchFieldLists", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (AnalystsResearchFieldList[])mapper.readValue(json, AnalystsResearchFieldList[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public AnalystsResearchField[] getResearchFields(String identifiers, IdentifierTypes identifierType, AnalystFieldTypes analystFieldType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("AnalystFieldType", String.valueOf(analystFieldType));
         String json = RestClient.get(this.endPointUrl + "/GetResearchFields", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (AnalystsResearchField[])mapper.readValue(json, AnalystsResearchField[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public AnalystsResearchField[] getResearchFieldsHTTP(String identifiers, IdentifierTypes identifierType, AnalystFieldTypes analystFieldType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("AnalystFieldType", String.valueOf(analystFieldType));
         String json = RestClient.get(this.endPointUrl + "/GetResearchFields", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (AnalystsResearchField[])mapper.readValue(json, AnalystsResearchField[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public ResearchReport getResearchReport(String identifier, IdentifierTypes identifierType, AnalystsResearchReportTypes analystsResearchReportType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("AnalystsResearchReportType", String.valueOf(analystsResearchReportType));
         String json = RestClient.get(this.endPointUrl + "/GetResearchReport", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ResearchReport)mapper.readValue(json, ResearchReport.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public ResearchReport getResearchReportHTTP(String identifier, IdentifierTypes identifierType, AnalystsResearchReportTypes analystsResearchReportType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("AnalystsResearchReportType", String.valueOf(analystsResearchReportType));
         String json = RestClient.get(this.endPointUrl + "/GetResearchReport", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ResearchReport)mapper.readValue(json, ResearchReport.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public ResearchReportTemplate getResearchReportTemplate(AnalystsResearchReportTypes analystsResearchReportType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("AnalystsResearchReportType", String.valueOf(analystsResearchReportType));
         String json = RestClient.get(this.endPointUrl + "/GetResearchReportTemplate", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ResearchReportTemplate)mapper.readValue(json, ResearchReportTemplate.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public ResearchReportTemplate getResearchReportTemplateHTTP(AnalystsResearchReportTypes analystsResearchReportType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("AnalystsResearchReportType", String.valueOf(analystsResearchReportType));
         String json = RestClient.get(this.endPointUrl + "/GetResearchReportTemplate", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ResearchReportTemplate)mapper.readValue(json, ResearchReportTemplate.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }
}
