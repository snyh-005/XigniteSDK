package com.xignite.sdk.api.webservices.XigniteGlobalExchanges.Models;

import lombok.Data;

@Data
public class ExchangeHours {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Exchange;
   public String Date;
   public String IsOpen;
   public String OpenTime;
   public String CloseTime;
   public Double UTCOffset;
}
