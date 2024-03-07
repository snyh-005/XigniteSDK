package com.xignite.sdk.api.webservices.XigniteGlobalHistoricalV3.Models;

import lombok.Data;

@Data
public class CashDividendHistory {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String CorporateActionsAdjusted;
   public String Identifier;
   public String IdentifierType;
   public String IdentifierAsOfDate;
   public Security Security;
   public String StartDate;
   public String EndDate;
   public Double CumulativeCashDividend;
   public CashDividend[] CashDividends;
}
