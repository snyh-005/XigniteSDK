package com.xignite.sdk.api.webservices.XigniteGlobalRealTime.Models;

import lombok.Data;

@Data
public class MarketMover {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String MarketMoverType;
   public String Symbol;
   public String Name;
   public String InstrumentClass;
   public String Market;
   public String MarketIdentificationCode;
   public String Date;
   public String Time;
   public Double UTCOffset;
   public Double Last;
   public Double ChangeFromPreviousClose;
   public Double PercentChangeFromPreviousClose;
   public Double Volume;
   public String Currency;
}
