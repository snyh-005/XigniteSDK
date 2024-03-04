package com.xignite.sdk.api.webservices.XigniteEstimates;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xignite.sdk.api.ApiBase;
import com.xignite.sdk.api.webservices.XigniteEstimates.Models.EstimateFieldTypes;
import com.xignite.sdk.api.webservices.XigniteEstimates.Models.EstimateGroups;
import com.xignite.sdk.api.webservices.XigniteEstimates.Models.EstimatesResearchField;
import com.xignite.sdk.api.webservices.XigniteEstimates.Models.EstimatesResearchFieldList;
import com.xignite.sdk.api.webservices.XigniteEstimates.Models.EstimatesResearchReportTypes;
import com.xignite.sdk.api.webservices.XigniteEstimates.Models.IdentifierTypes;
import com.xignite.sdk.api.webservices.XigniteEstimates.Models.ResearchReport;
import com.xignite.sdk.api.webservices.XigniteEstimates.Models.ResearchReportTemplate;
import com.xignite.sdk.exceptions.XigniteApiException;
import com.xignite.sdk.utilities.RestClient;
import java.util.LinkedHashMap;

public class XigniteEstimates extends ApiBase {
   public XigniteEstimates(String apiToken) {
      this.apiToken = apiToken;
      this.endPointUrl = "http://www.xignite.com/xEstimates.json";
   }

   public EstimatesResearchField[] listResearchFields() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListResearchFields", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (EstimatesResearchField[])mapper.readValue(json, EstimatesResearchField[].class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public EstimatesResearchField[] listResearchFieldsHTTP() throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         String json = RestClient.get(this.endPointUrl + "/ListResearchFields", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (EstimatesResearchField[])mapper.readValue(json, EstimatesResearchField[].class);
      } catch (Exception var4) {
         throw new XigniteApiException(var4.getMessage());
      }
   }

   public EstimatesResearchField[] searchResearchFields(String pattern) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("pattern", String.valueOf(pattern));
         String json = RestClient.get(this.endPointUrl + "/SearchResearchFields", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (EstimatesResearchField[])mapper.readValue(json, EstimatesResearchField[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public EstimatesResearchField[] searchResearchFieldsHTTP(String pattern) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("pattern", String.valueOf(pattern));
         String json = RestClient.get(this.endPointUrl + "/SearchResearchFields", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (EstimatesResearchField[])mapper.readValue(json, EstimatesResearchField[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public EstimatesResearchField getResearchField(String identifier, IdentifierTypes identifierType, EstimateFieldTypes estimateFieldType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("EstimateFieldType", String.valueOf(estimateFieldType));
         String json = RestClient.get(this.endPointUrl + "/GetResearchField", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (EstimatesResearchField)mapper.readValue(json, EstimatesResearchField.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public EstimatesResearchField getResearchFieldHTTP(String identifier, IdentifierTypes identifierType, EstimateFieldTypes estimateFieldType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("EstimateFieldType", String.valueOf(estimateFieldType));
         String json = RestClient.get(this.endPointUrl + "/GetResearchField", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (EstimatesResearchField)mapper.readValue(json, EstimatesResearchField.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public EstimatesResearchFieldList getResearchFieldList(String identifier, IdentifierTypes identifierType, EstimateGroups estimateGroup) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("EstimateGroup", String.valueOf(estimateGroup));
         String json = RestClient.get(this.endPointUrl + "/GetResearchFieldList", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (EstimatesResearchFieldList)mapper.readValue(json, EstimatesResearchFieldList.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public EstimatesResearchFieldList getResearchFieldListHTTP(String identifier, IdentifierTypes identifierType, EstimateGroups estimateGroup) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("EstimateGroup", String.valueOf(estimateGroup));
         String json = RestClient.get(this.endPointUrl + "/GetResearchFieldList", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (EstimatesResearchFieldList)mapper.readValue(json, EstimatesResearchFieldList.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public EstimatesResearchFieldList[] getResearchFieldLists(String identifiers, IdentifierTypes identifierType, EstimateGroups estimateGroup) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("EstimateGroup", String.valueOf(estimateGroup));
         String json = RestClient.get(this.endPointUrl + "/GetResearchFieldLists", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (EstimatesResearchFieldList[])mapper.readValue(json, EstimatesResearchFieldList[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public EstimatesResearchFieldList[] getResearchFieldListsHTTP(String identifiers, IdentifierTypes identifierType, EstimateGroups estimateGroup) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("EstimateGroup", String.valueOf(estimateGroup));
         String json = RestClient.get(this.endPointUrl + "/GetResearchFieldLists", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (EstimatesResearchFieldList[])mapper.readValue(json, EstimatesResearchFieldList[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public EstimatesResearchField[] getResearchFields(String identifiers, IdentifierTypes identifierType, EstimateFieldTypes estimateFieldType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("EstimateFieldType", String.valueOf(estimateFieldType));
         String json = RestClient.get(this.endPointUrl + "/GetResearchFields", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (EstimatesResearchField[])mapper.readValue(json, EstimatesResearchField[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public EstimatesResearchField[] getResearchFieldsHTTP(String identifiers, IdentifierTypes identifierType, EstimateFieldTypes estimateFieldType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifiers", String.valueOf(identifiers));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("EstimateFieldType", String.valueOf(estimateFieldType));
         String json = RestClient.get(this.endPointUrl + "/GetResearchFields", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (EstimatesResearchField[])mapper.readValue(json, EstimatesResearchField[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public ResearchReport getResearchReport(String identifier, IdentifierTypes identifierType, EstimatesResearchReportTypes estimatesResearchReportType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("EstimatesResearchReportType", String.valueOf(estimatesResearchReportType));
         String json = RestClient.get(this.endPointUrl + "/GetResearchReport", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ResearchReport)mapper.readValue(json, ResearchReport.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public ResearchReport getResearchReportHTTP(String identifier, IdentifierTypes identifierType, EstimatesResearchReportTypes estimatesResearchReportType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("Identifier", String.valueOf(identifier));
         params.put("IdentifierType", String.valueOf(identifierType));
         params.put("EstimatesResearchReportType", String.valueOf(estimatesResearchReportType));
         String json = RestClient.get(this.endPointUrl + "/GetResearchReport", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ResearchReport)mapper.readValue(json, ResearchReport.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public ResearchReportTemplate getResearchReportTemplate(EstimatesResearchReportTypes estimatesResearchReportType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("EstimatesResearchReportType", String.valueOf(estimatesResearchReportType));
         String json = RestClient.get(this.endPointUrl + "/GetResearchReportTemplate", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ResearchReportTemplate)mapper.readValue(json, ResearchReportTemplate.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public ResearchReportTemplate getResearchReportTemplateHTTP(EstimatesResearchReportTypes estimatesResearchReportType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("EstimatesResearchReportType", String.valueOf(estimatesResearchReportType));
         String json = RestClient.get(this.endPointUrl + "/GetResearchReportTemplate", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (ResearchReportTemplate)mapper.readValue(json, ResearchReportTemplate.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }
}
