package com.xignite.sdk.api.webservices.XigniteEdgar.Models;

import lombok.Data;

@Data
public class SearchResult {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String CIK;
   public String Company;
   public SICCode SICCode;
   public String State;
   public String StateOfIncorporation;
   public String FiscalYearEnd;
   public String BusinessAddress;
   public String MailingAddress;
   public Filing[] Filings;
}
