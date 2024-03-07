package com.xignite.sdk.api.webservices.XigniteGlobalHolidays.Models;

import lombok.Data;

@Data
public class ExchangeDateTime {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Exchange;
   public String Date;
   public String Time;
   public Double UTCOffset;
}
