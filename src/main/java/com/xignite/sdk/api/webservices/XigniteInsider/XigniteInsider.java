package com.xignite.sdk.api.webservices.XigniteInsider;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xignite.sdk.api.ApiBase;
import com.xignite.sdk.api.webservices.XigniteInsider.Models.FilingAsText;
import com.xignite.sdk.api.webservices.XigniteInsider.Models.IdentifierTypes;
import com.xignite.sdk.api.webservices.XigniteInsider.Models.Insider;
import com.xignite.sdk.api.webservices.XigniteInsider.Models.InsiderOwnerships;
import com.xignite.sdk.api.webservices.XigniteInsider.Models.InsiderTransactions;
import com.xignite.sdk.api.webservices.XigniteInsider.Models.IssuerChange;
import com.xignite.sdk.api.webservices.XigniteInsider.Models.IssuerOwnerships;
import com.xignite.sdk.api.webservices.XigniteInsider.Models.IssuerTransactions;
import com.xignite.sdk.api.webservices.XigniteInsider.Models.OwnershipDocument;
import com.xignite.sdk.api.webservices.XigniteInsider.Models.OwnershipTypes;
import com.xignite.sdk.api.webservices.XigniteInsider.Models.Role;
import com.xignite.sdk.api.webservices.XigniteInsider.Models.Roster;
import com.xignite.sdk.api.webservices.XigniteInsider.Models.SecurityTypes;
import com.xignite.sdk.api.webservices.XigniteInsider.Models.TransactionCodes;
import com.xignite.sdk.exceptions.XigniteApiException;
import com.xignite.sdk.utilities.RestClient;
import java.util.LinkedHashMap;

public class XigniteInsider extends ApiBase {
   public XigniteInsider(String apiToken) {
      this.apiToken = apiToken;
      this.endPointUrl = "http://www.xignite.com/xInsider.json";
   }

   public Insider[] getInsiders(String insiderCIK, String insiderName, String insiderAddress) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("InsiderCIK", String.valueOf(insiderCIK));
         params.put("InsiderName", String.valueOf(insiderName));
         params.put("InsiderAddress", String.valueOf(insiderAddress));
         String json = RestClient.get(this.endPointUrl + "/GetInsiders", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Insider[])mapper.readValue(json, Insider[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public Insider[] getInsidersHTTP(String insiderCIK, String insiderName, String insiderAddress) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("InsiderCIK", String.valueOf(insiderCIK));
         params.put("InsiderName", String.valueOf(insiderName));
         params.put("InsiderAddress", String.valueOf(insiderAddress));
         String json = RestClient.get(this.endPointUrl + "/GetInsiders", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Insider[])mapper.readValue(json, Insider[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public Role[] getRoles(String insiderCIK, String insiderName, String insiderAddress) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("InsiderCIK", String.valueOf(insiderCIK));
         params.put("InsiderName", String.valueOf(insiderName));
         params.put("InsiderAddress", String.valueOf(insiderAddress));
         String json = RestClient.get(this.endPointUrl + "/GetRoles", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Role[])mapper.readValue(json, Role[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public Role[] getRolesHTTP(String insiderCIK, String insiderName, String insiderAddress) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("InsiderCIK", String.valueOf(insiderCIK));
         params.put("InsiderName", String.valueOf(insiderName));
         params.put("InsiderAddress", String.valueOf(insiderAddress));
         String json = RestClient.get(this.endPointUrl + "/GetRoles", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Role[])mapper.readValue(json, Role[].class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public Role[] getRole(String insiderCIK, String insiderName, String insiderAddress, String issuerIdentifier, IdentifierTypes issuerIdentifierType, String issuerName) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("InsiderCIK", String.valueOf(insiderCIK));
         params.put("InsiderName", String.valueOf(insiderName));
         params.put("InsiderAddress", String.valueOf(insiderAddress));
         params.put("IssuerIdentifier", String.valueOf(issuerIdentifier));
         params.put("IssuerIdentifierType", String.valueOf(issuerIdentifierType));
         params.put("IssuerName", String.valueOf(issuerName));
         String json = RestClient.get(this.endPointUrl + "/GetRole", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Role[])mapper.readValue(json, Role[].class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public Role[] getRoleHTTP(String insiderCIK, String insiderName, String insiderAddress, String issuerIdentifier, IdentifierTypes issuerIdentifierType, String issuerName) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("InsiderCIK", String.valueOf(insiderCIK));
         params.put("InsiderName", String.valueOf(insiderName));
         params.put("InsiderAddress", String.valueOf(insiderAddress));
         params.put("IssuerIdentifier", String.valueOf(issuerIdentifier));
         params.put("IssuerIdentifierType", String.valueOf(issuerIdentifierType));
         params.put("IssuerName", String.valueOf(issuerName));
         String json = RestClient.get(this.endPointUrl + "/GetRole", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Role[])mapper.readValue(json, Role[].class);
      } catch (Exception var10) {
         throw new XigniteApiException(var10.getMessage());
      }
   }

   public Roster getRoster(String issuerIdentifier, IdentifierTypes issuerIdentifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("IssuerIdentifier", String.valueOf(issuerIdentifier));
         params.put("IssuerIdentifierType", String.valueOf(issuerIdentifierType));
         String json = RestClient.get(this.endPointUrl + "/GetRoster", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Roster)mapper.readValue(json, Roster.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public Roster getRosterHTTP(String issuerIdentifier, IdentifierTypes issuerIdentifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("IssuerIdentifier", String.valueOf(issuerIdentifier));
         params.put("IssuerIdentifierType", String.valueOf(issuerIdentifierType));
         String json = RestClient.get(this.endPointUrl + "/GetRoster", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Roster)mapper.readValue(json, Roster.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public Roster getDirectors(String issuerIdentifier, IdentifierTypes issuerIdentifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("IssuerIdentifier", String.valueOf(issuerIdentifier));
         params.put("IssuerIdentifierType", String.valueOf(issuerIdentifierType));
         String json = RestClient.get(this.endPointUrl + "/GetDirectors", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Roster)mapper.readValue(json, Roster.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public Roster getDirectorsHTTP(String issuerIdentifier, IdentifierTypes issuerIdentifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("IssuerIdentifier", String.valueOf(issuerIdentifier));
         params.put("IssuerIdentifierType", String.valueOf(issuerIdentifierType));
         String json = RestClient.get(this.endPointUrl + "/GetDirectors", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Roster)mapper.readValue(json, Roster.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public Roster getCEO(String issuerIdentifier, IdentifierTypes issuerIdentifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("IssuerIdentifier", String.valueOf(issuerIdentifier));
         params.put("IssuerIdentifierType", String.valueOf(issuerIdentifierType));
         String json = RestClient.get(this.endPointUrl + "/GetCEO", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Roster)mapper.readValue(json, Roster.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public Roster getCEOHTTP(String issuerIdentifier, IdentifierTypes issuerIdentifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("IssuerIdentifier", String.valueOf(issuerIdentifier));
         params.put("IssuerIdentifierType", String.valueOf(issuerIdentifierType));
         String json = RestClient.get(this.endPointUrl + "/GetCEO", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Roster)mapper.readValue(json, Roster.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public Roster getOfficers(String issuerIdentifier, IdentifierTypes issuerIdentifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("IssuerIdentifier", String.valueOf(issuerIdentifier));
         params.put("IssuerIdentifierType", String.valueOf(issuerIdentifierType));
         String json = RestClient.get(this.endPointUrl + "/GetOfficers", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Roster)mapper.readValue(json, Roster.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public Roster getOfficersHTTP(String issuerIdentifier, IdentifierTypes issuerIdentifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("IssuerIdentifier", String.valueOf(issuerIdentifier));
         params.put("IssuerIdentifierType", String.valueOf(issuerIdentifierType));
         String json = RestClient.get(this.endPointUrl + "/GetOfficers", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (Roster)mapper.readValue(json, Roster.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public IssuerOwnerships getIssuerOwnerships(String issuerIdentifier, IdentifierTypes issuerIdentifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("IssuerIdentifier", String.valueOf(issuerIdentifier));
         params.put("IssuerIdentifierType", String.valueOf(issuerIdentifierType));
         String json = RestClient.get(this.endPointUrl + "/GetIssuerOwnerships", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IssuerOwnerships)mapper.readValue(json, IssuerOwnerships.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public IssuerOwnerships getIssuerOwnershipsHTTP(String issuerIdentifier, IdentifierTypes issuerIdentifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("IssuerIdentifier", String.valueOf(issuerIdentifier));
         params.put("IssuerIdentifierType", String.valueOf(issuerIdentifierType));
         String json = RestClient.get(this.endPointUrl + "/GetIssuerOwnerships", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IssuerOwnerships)mapper.readValue(json, IssuerOwnerships.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public IssuerOwnerships getInsiderOwnership(String insiderCIK, String insiderName, String insiderAddress, String issuerIdentifier, IdentifierTypes issuerIdentifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("InsiderCIK", String.valueOf(insiderCIK));
         params.put("InsiderName", String.valueOf(insiderName));
         params.put("InsiderAddress", String.valueOf(insiderAddress));
         params.put("IssuerIdentifier", String.valueOf(issuerIdentifier));
         params.put("IssuerIdentifierType", String.valueOf(issuerIdentifierType));
         String json = RestClient.get(this.endPointUrl + "/GetInsiderOwnership", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IssuerOwnerships)mapper.readValue(json, IssuerOwnerships.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public IssuerOwnerships getInsiderOwnershipHTTP(String insiderCIK, String insiderName, String insiderAddress, String issuerIdentifier, IdentifierTypes issuerIdentifierType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("InsiderCIK", String.valueOf(insiderCIK));
         params.put("InsiderName", String.valueOf(insiderName));
         params.put("InsiderAddress", String.valueOf(insiderAddress));
         params.put("IssuerIdentifier", String.valueOf(issuerIdentifier));
         params.put("IssuerIdentifierType", String.valueOf(issuerIdentifierType));
         String json = RestClient.get(this.endPointUrl + "/GetInsiderOwnership", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IssuerOwnerships)mapper.readValue(json, IssuerOwnerships.class);
      } catch (Exception var9) {
         throw new XigniteApiException(var9.getMessage());
      }
   }

   public InsiderOwnerships getInsiderOwnerships(String insiderCIK, String insiderName, String insiderAddress) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("InsiderCIK", String.valueOf(insiderCIK));
         params.put("InsiderName", String.valueOf(insiderName));
         params.put("InsiderAddress", String.valueOf(insiderAddress));
         String json = RestClient.get(this.endPointUrl + "/GetInsiderOwnerships", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (InsiderOwnerships)mapper.readValue(json, InsiderOwnerships.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public InsiderOwnerships getInsiderOwnershipsHTTP(String insiderCIK, String insiderName, String insiderAddress) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("InsiderCIK", String.valueOf(insiderCIK));
         params.put("InsiderName", String.valueOf(insiderName));
         params.put("InsiderAddress", String.valueOf(insiderAddress));
         String json = RestClient.get(this.endPointUrl + "/GetInsiderOwnerships", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (InsiderOwnerships)mapper.readValue(json, InsiderOwnerships.class);
      } catch (Exception var7) {
         throw new XigniteApiException(var7.getMessage());
      }
   }

   public InsiderTransactions getInsiderTransactions(String insiderCIK, String insiderName, String insiderAddress, String issuerIdentifier, IdentifierTypes issuerIdentifierType, String fromDate, String toDate, TransactionCodes transactionCode, SecurityTypes securityType, OwnershipTypes ownershipType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("InsiderCIK", String.valueOf(insiderCIK));
         params.put("InsiderName", String.valueOf(insiderName));
         params.put("InsiderAddress", String.valueOf(insiderAddress));
         params.put("IssuerIdentifier", String.valueOf(issuerIdentifier));
         params.put("IssuerIdentifierType", String.valueOf(issuerIdentifierType));
         params.put("FromDate", String.valueOf(fromDate));
         params.put("ToDate", String.valueOf(toDate));
         params.put("TransactionCode", String.valueOf(transactionCode));
         params.put("SecurityType", String.valueOf(securityType));
         params.put("OwnershipType", String.valueOf(ownershipType));
         String json = RestClient.get(this.endPointUrl + "/GetInsiderTransactions", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (InsiderTransactions)mapper.readValue(json, InsiderTransactions.class);
      } catch (Exception var14) {
         throw new XigniteApiException(var14.getMessage());
      }
   }

   public InsiderTransactions getInsiderTransactionsHTTP(String insiderCIK, String insiderName, String insiderAddress, String issuerIdentifier, IdentifierTypes issuerIdentifierType, String fromDate, String toDate, TransactionCodes transactionCode, SecurityTypes securityType, OwnershipTypes ownershipType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("InsiderCIK", String.valueOf(insiderCIK));
         params.put("InsiderName", String.valueOf(insiderName));
         params.put("InsiderAddress", String.valueOf(insiderAddress));
         params.put("IssuerIdentifier", String.valueOf(issuerIdentifier));
         params.put("IssuerIdentifierType", String.valueOf(issuerIdentifierType));
         params.put("FromDate", String.valueOf(fromDate));
         params.put("ToDate", String.valueOf(toDate));
         params.put("TransactionCode", String.valueOf(transactionCode));
         params.put("SecurityType", String.valueOf(securityType));
         params.put("OwnershipType", String.valueOf(ownershipType));
         String json = RestClient.get(this.endPointUrl + "/GetInsiderTransactions", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (InsiderTransactions)mapper.readValue(json, InsiderTransactions.class);
      } catch (Exception var14) {
         throw new XigniteApiException(var14.getMessage());
      }
   }

   public InsiderTransactions getAllInsiderTransactions(String insiderCIK, String insiderName, String insiderAddress, String fromDate, String toDate, TransactionCodes transactionCode, SecurityTypes securityType, OwnershipTypes ownershipType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("InsiderCIK", String.valueOf(insiderCIK));
         params.put("InsiderName", String.valueOf(insiderName));
         params.put("InsiderAddress", String.valueOf(insiderAddress));
         params.put("FromDate", String.valueOf(fromDate));
         params.put("ToDate", String.valueOf(toDate));
         params.put("TransactionCode", String.valueOf(transactionCode));
         params.put("SecurityType", String.valueOf(securityType));
         params.put("OwnershipType", String.valueOf(ownershipType));
         String json = RestClient.get(this.endPointUrl + "/GetAllInsiderTransactions", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (InsiderTransactions)mapper.readValue(json, InsiderTransactions.class);
      } catch (Exception var12) {
         throw new XigniteApiException(var12.getMessage());
      }
   }

   public InsiderTransactions getAllInsiderTransactionsHTTP(String insiderCIK, String insiderName, String insiderAddress, String fromDate, String toDate, TransactionCodes transactionCode, SecurityTypes securityType, OwnershipTypes ownershipType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("InsiderCIK", String.valueOf(insiderCIK));
         params.put("InsiderName", String.valueOf(insiderName));
         params.put("InsiderAddress", String.valueOf(insiderAddress));
         params.put("FromDate", String.valueOf(fromDate));
         params.put("ToDate", String.valueOf(toDate));
         params.put("TransactionCode", String.valueOf(transactionCode));
         params.put("SecurityType", String.valueOf(securityType));
         params.put("OwnershipType", String.valueOf(ownershipType));
         String json = RestClient.get(this.endPointUrl + "/GetAllInsiderTransactions", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (InsiderTransactions)mapper.readValue(json, InsiderTransactions.class);
      } catch (Exception var12) {
         throw new XigniteApiException(var12.getMessage());
      }
   }

   public IssuerTransactions getIssuerTransactions(String issuerIdentifier, IdentifierTypes issuerIdentifierType, String fromDate, String toDate, TransactionCodes transactionCode, SecurityTypes securityType, OwnershipTypes ownershipType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("IssuerIdentifier", String.valueOf(issuerIdentifier));
         params.put("IssuerIdentifierType", String.valueOf(issuerIdentifierType));
         params.put("FromDate", String.valueOf(fromDate));
         params.put("ToDate", String.valueOf(toDate));
         params.put("TransactionCode", String.valueOf(transactionCode));
         params.put("SecurityType", String.valueOf(securityType));
         params.put("OwnershipType", String.valueOf(ownershipType));
         String json = RestClient.get(this.endPointUrl + "/GetIssuerTransactions", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IssuerTransactions)mapper.readValue(json, IssuerTransactions.class);
      } catch (Exception var11) {
         throw new XigniteApiException(var11.getMessage());
      }
   }

   public IssuerTransactions getIssuerTransactionsHTTP(String issuerIdentifier, IdentifierTypes issuerIdentifierType, String fromDate, String toDate, TransactionCodes transactionCode, SecurityTypes securityType, OwnershipTypes ownershipType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("IssuerIdentifier", String.valueOf(issuerIdentifier));
         params.put("IssuerIdentifierType", String.valueOf(issuerIdentifierType));
         params.put("FromDate", String.valueOf(fromDate));
         params.put("ToDate", String.valueOf(toDate));
         params.put("TransactionCode", String.valueOf(transactionCode));
         params.put("SecurityType", String.valueOf(securityType));
         params.put("OwnershipType", String.valueOf(ownershipType));
         String json = RestClient.get(this.endPointUrl + "/GetIssuerTransactions", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IssuerTransactions)mapper.readValue(json, IssuerTransactions.class);
      } catch (Exception var11) {
         throw new XigniteApiException(var11.getMessage());
      }
   }

   public IssuerTransactions getAllIssuerTransactions(String onDate, TransactionCodes transactionCode, SecurityTypes securityType, OwnershipTypes ownershipType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("OnDate", String.valueOf(onDate));
         params.put("TransactionCode", String.valueOf(transactionCode));
         params.put("SecurityType", String.valueOf(securityType));
         params.put("OwnershipType", String.valueOf(ownershipType));
         String json = RestClient.get(this.endPointUrl + "/GetAllIssuerTransactions", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IssuerTransactions)mapper.readValue(json, IssuerTransactions.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public IssuerTransactions getAllIssuerTransactionsHTTP(String onDate, TransactionCodes transactionCode, SecurityTypes securityType, OwnershipTypes ownershipType) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("OnDate", String.valueOf(onDate));
         params.put("TransactionCode", String.valueOf(transactionCode));
         params.put("SecurityType", String.valueOf(securityType));
         params.put("OwnershipType", String.valueOf(ownershipType));
         String json = RestClient.get(this.endPointUrl + "/GetAllIssuerTransactions", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IssuerTransactions)mapper.readValue(json, IssuerTransactions.class);
      } catch (Exception var8) {
         throw new XigniteApiException(var8.getMessage());
      }
   }

   public IssuerChange[] getAllIssuerTransactionsRange(String fromDate, String toDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("FromDate", String.valueOf(fromDate));
         params.put("ToDate", String.valueOf(toDate));
         String json = RestClient.get(this.endPointUrl + "/GetAllIssuerTransactionsRange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IssuerChange[])mapper.readValue(json, IssuerChange[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public IssuerChange[] getAllIssuerTransactionsRange(String fromDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("FromDate", String.valueOf(fromDate));
         String json = RestClient.get(this.endPointUrl + "/GetAllIssuerTransactionsRange", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IssuerChange[])mapper.readValue(json, IssuerChange[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public IssuerChange[] getAllIssuerTransactionsRangeHTTP(String fromDate, String toDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("FromDate", String.valueOf(fromDate));
         params.put("ToDate", String.valueOf(toDate));
         String json = RestClient.get(this.endPointUrl + "/GetAllIssuerTransactionsRange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IssuerChange[])mapper.readValue(json, IssuerChange[].class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public IssuerChange[] getAllIssuerTransactionsRangeHTTP(String fromDate) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("FromDate", String.valueOf(fromDate));
         String json = RestClient.get(this.endPointUrl + "/GetAllIssuerTransactionsRange", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (IssuerChange[])mapper.readValue(json, IssuerChange[].class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public OwnershipDocument getOwnershipForm(String htmlFileUrl) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("HtmlFileUrl", String.valueOf(htmlFileUrl));
         String json = RestClient.get(this.endPointUrl + "/GetOwnershipForm", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (OwnershipDocument)mapper.readValue(json, OwnershipDocument.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public OwnershipDocument getOwnershipFormHTTP(String htmlFileUrl) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("HtmlFileUrl", String.valueOf(htmlFileUrl));
         String json = RestClient.get(this.endPointUrl + "/GetOwnershipForm", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (OwnershipDocument)mapper.readValue(json, OwnershipDocument.class);
      } catch (Exception var5) {
         throw new XigniteApiException(var5.getMessage());
      }
   }

   public FilingAsText getFilingAsText(String textFileUrl, boolean hTMLize) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("TextFileUrl", String.valueOf(textFileUrl));
         params.put("HTMLize", String.valueOf(hTMLize));
         String json = RestClient.get(this.endPointUrl + "/GetFilingAsText", params);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FilingAsText)mapper.readValue(json, FilingAsText.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }

   public FilingAsText getFilingAsTextHTTP(String textFileUrl, boolean hTMLize) throws XigniteApiException {
      try {
         LinkedHashMap<String, String> params = new LinkedHashMap();
         params.put("_token", this.apiToken);
         params.put("TextFileUrl", String.valueOf(textFileUrl));
         params.put("HTMLize", String.valueOf(hTMLize));
         String json = RestClient.get(this.endPointUrl + "/GetFilingAsText", params, false);
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         return (FilingAsText)mapper.readValue(json, FilingAsText.class);
      } catch (Exception var6) {
         throw new XigniteApiException(var6.getMessage());
      }
   }
}
