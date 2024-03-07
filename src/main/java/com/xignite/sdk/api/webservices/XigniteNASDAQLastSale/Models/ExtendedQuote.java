package com.xignite.sdk.api.webservices.XigniteNASDAQLastSale.Models;

import lombok.Data;

@Data
public class ExtendedQuote {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public Security Security;
   public String Date;
   public String Time;
   public Double UTCOffset;
   public Double Open;
   public Double Close;
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
   public Double Bid;
   public Double BidSize;
   public String BidDate;
   public String BidTime;
   public Double Ask;
   public Double AskSize;
   public String AskDate;
   public String AskTime;
   public String TradingHalted;
   public String Identifier;
   public String IdentifierType;
   public String ExtendedHoursDate;
   public String ExtendedHoursTime;
   public String ExtendedHoursType;
   public Double ExtendedHoursPrice;
   public Double ExtendedHoursChange;
   public Double ExtendedHoursPercentChange;
}
