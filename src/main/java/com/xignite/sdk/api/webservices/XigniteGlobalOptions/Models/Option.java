package com.xignite.sdk.api.webservices.XigniteGlobalOptions.Models;

import lombok.Data;

@Data
public class Option {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Symbol;
   public String SymbologyType;
   public String BaseSymbol;
   public String Type;
   public String ExpirationDate;
   public int Month;
   public int Year;
   public Double StrikePrice;
   public String Currency;
   public String Date;
   public String Time;
   public Double Last;
   public Double LastSize;
   public Double Open;
   public Double Close;
   public Double High;
   public Double Low;
   public Double Volume;
   public Double OpenInterest;
   public String OpenInterestDate;
   public Double PreviousClose;
   public String PreviousCloseDate;
   public Double Change;
   public Double PercentChange;
   public Double Bid;
   public String BidDate;
   public String BidTime;
   public Double BidSize;
   public Double Ask;
   public String AskDate;
   public String AskTime;
   public Double AskSize;
   public String InTheMoney;
   public String Exchange;
}
