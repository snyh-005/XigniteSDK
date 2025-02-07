package com.xignite.sdk.api.webservices.XigniteSuperQuotes.Models;

import lombok.Data;

@Data
public class Quote {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String SourceAPI;
   public String InstrumentType;
   public String Name;
   public String Identifier;
   public String IdentifierType;
   public String Market;
   public String MarketIdentificationCode;
   public String DateTime;
   public Double UTCOffset;
   public String Currency;
   public Double Open;
   public Double High;
   public Double Low;
   public Double Last;
   public Double LastSize;
   public Double Volume;
   public String VolumeDate;
   public Double PreviousClose;
   public String PreviousCloseDate;
   public Double Change;
   public Double PercentChange;
   public String ExtendedHoursType;
   public String ExtendedHoursDateTime;
   public Double ExtendedHoursPrice;
   public Double ExtendedHoursChange;
   public Double ExtendedHoursPercentChange;
   public Double Bid;
   public Double BidSize;
   public String BidDateTime;
   public Double Ask;
   public Double AskSize;
   public String AskDateTime;
   public String TradingHalted;
}
