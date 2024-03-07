package com.xignite.sdk.api.webservices.XigniteGlobalHolidays.Models;

import lombok.Data;

@Data
public class IntegerResult {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public int Value;
}
