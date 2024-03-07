package com.xignite.sdk.api.webservices.XigniteInsider.Models;

import lombok.Data;

@Data
public class SECCompanyData {
   public String CompanyConformedName;
   public String CentralIndexKey;
   public SICCode SICCode;
   public String IRSNumber;
   public String StateOfIncorporation;
   public String FiscalYearEnd;
}
