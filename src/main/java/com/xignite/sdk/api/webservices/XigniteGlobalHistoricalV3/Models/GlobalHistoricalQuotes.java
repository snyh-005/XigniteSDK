package com.xignite.sdk.api.webservices.XigniteGlobalHistoricalV3.Models;

import lombok.Data;

@Data
public class GlobalHistoricalQuotes {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Identifier;
   public String IdentifierType;
   public Security Security;
   public String StartDate;
   public String EndDate;
   public HistoricalQuote[] HistoricalQuotes;
}
