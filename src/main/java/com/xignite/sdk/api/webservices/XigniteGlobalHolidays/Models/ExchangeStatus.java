package com.xignite.sdk.api.webservices.XigniteGlobalHolidays.Models;

import lombok.Data;

@Data
public class ExchangeStatus {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Symbol;
   public String Open;
}
