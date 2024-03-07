package com.xignite.sdk.api.webservices.XigniteGlobalETFs.Models;

import lombok.Data;

@Data
public class Holdings {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public Security Security;
   public Holding[] ETFHoldings;
   public int TotalHoldings;
   public String NextPage;
   public String AsOfDate;
   public String IdentifierType;
   public String Identifier;
}
