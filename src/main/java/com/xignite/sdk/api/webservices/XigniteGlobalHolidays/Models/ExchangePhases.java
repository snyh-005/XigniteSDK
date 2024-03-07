package com.xignite.sdk.api.webservices.XigniteGlobalHolidays.Models;

import lombok.Data;

@Data
public class ExchangePhases {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Exchange;
   public String Date;
   public int UTCOffset;
   public String IsOpen;
   public String Day;
   public String DayType;
   public Phase[] Phases;
}
