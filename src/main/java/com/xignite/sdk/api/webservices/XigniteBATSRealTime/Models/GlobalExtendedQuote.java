package com.xignite.sdk.api.webservices.XigniteBATSRealTime.Models;

import lombok.Data;

@Data
public class GlobalExtendedQuote {
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
   public Double PreviousClose;
   public String PreviousCloseDate;
   public Double ChangeFromPreviousClose;
   public Double PercentChangeFromPreviousClose;
   public Double Bid;
   public Double BidSize;
   public String BidDate;
   public String BidTime;
   public Double Ask;
   public Double AskSize;
   public String AskDate;
   public String AskTime;
   public Double High52Weeks;
   public Double Low52Weeks;
   public String Currency;
   public String TradingHalted;
   public String BidMarketIdentificationCode;
   public String AskMarketIdentificationCode;
   public String LastMarketIdentificationCode;
   public String Identifier;
   public String IdentifierType;
   public String VolumeDate;
   public String ExtendedHoursDate;
   public String ExtendedHoursTime;
   public String ExtendedHoursType;
   public Double ExtendedHoursPrice;
   public Double ExtendedHoursChange;
   public Double ExtendedHoursPercentChange;
   public String LimitDate;
   public String LimitTime;
   public Double LimitDown;
   public Double LimitUp;
}
