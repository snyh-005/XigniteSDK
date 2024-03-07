package com.xignite.sdk.api.webservices.XigniteEdgar.Models;

import lombok.Data;

@Data
public class SECFiler {
   public SECCompanyData CompanyData;
   public SECFilingValues FilingValues;
   public SECBusinessAddress BusinessAddress;
   public SECBusinessAddress MailAddress;
   public SECFormerCompanyName[] FormerCompanyNames;
}
