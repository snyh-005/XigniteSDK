package com.xignite.sdk.api.webservices.XigniteGlobalRealTimeFutures.Models;

import lombok.Data;

@Data
public class FutureOption {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Symbol;
   public long Valoren;
   public String Name;
   public int Month;
   public int Year;
   public String Exchange;
   public String BaseSymbol;
   public String StrikeDate;
   public Double StrikePrice;
   public String Type;
   public String ISIN;
   public String CUSIP;
}
