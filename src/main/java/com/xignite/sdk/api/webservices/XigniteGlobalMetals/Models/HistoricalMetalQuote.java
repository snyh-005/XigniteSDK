package com.xignite.sdk.api.webservices.XigniteGlobalMetals.Models;

import lombok.Data;

@Data
public class HistoricalMetalQuote {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Name;
   public String Symbol;
   public String QuoteType;
   public String Currency;
   public String StartDate;
   public String StartTime;
   public String EndDate;
   public String EndTime;
   public Double Open;
   public Double High;
   public Double Low;
   public Double Close;
   public Double Average;
}
