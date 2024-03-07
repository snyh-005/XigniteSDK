package com.xignite.sdk.api.webservices.XigniteGlobalCurrencies.Models;

import lombok.Data;

@Data
public class HistoricalRateBidAsk {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String BaseCurrency;
   public String QuoteCurrency;
   public String Symbol;
   public String StartDate;
   public String StartTime;
   public String EndDate;
   public String EndTime;
   public Double Open;
   public Double High;
   public Double Low;
   public Double Close;
   public Double Average;
   public Double Bid;
   public Double Ask;
   public String Source;
}
