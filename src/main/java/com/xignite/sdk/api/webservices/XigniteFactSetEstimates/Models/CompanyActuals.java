package com.xignite.sdk.api.webservices.XigniteFactSetEstimates.Models;

import lombok.Data;

@Data
public class CompanyActuals {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public Company Company;
   public Actual[] Actuals;
   public String ReportType;
   public String Currency;
   public String IdentifierType;
   public String Identifier;
}
