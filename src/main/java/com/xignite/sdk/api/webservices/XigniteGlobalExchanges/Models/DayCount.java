package com.xignite.sdk.api.webservices.XigniteGlobalExchanges.Models;

import lombok.Data;

@Data
public class DayCount {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Symbol;
   public String StartDate;
   public String EndDate;
   public int Count;
}
