package com.xignite.sdk.api.webservices.XigniteGlobalRealTime.Models;

import lombok.Data;

@Data
public class IntradayVWAP {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public Security Security;
   public String Date;
   public String StartTime;
   public String EndTime;
   public Double UTCOffset;
   public String VWAPType;
   public Double VWAP;
   public Double High;
   public Double Low;
   public Double Average;
   public Double Amount;
   public Double Volume;
   public int Trades;
   public String Identifier;
   public String IdentifierType;
}
