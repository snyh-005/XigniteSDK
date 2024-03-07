package com.xignite.sdk.api.webservices.XigniteFactSetEstimates.Models;

import lombok.Data;

@Data
public class TrailingActuals {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public Company Company;
   public String ReportType;
   public String Currency;
   public Actual[] Actuals;
   public String Identifier;
   public String IdentifierType;
}
