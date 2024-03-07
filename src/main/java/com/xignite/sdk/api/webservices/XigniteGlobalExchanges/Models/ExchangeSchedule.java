package com.xignite.sdk.api.webservices.XigniteGlobalExchanges.Models;

import lombok.Data;

@Data
public class ExchangeSchedule {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Symbol;
   public String Date;
   public String Open;
   public String OpenTime;
   public String CloseTime;
}
