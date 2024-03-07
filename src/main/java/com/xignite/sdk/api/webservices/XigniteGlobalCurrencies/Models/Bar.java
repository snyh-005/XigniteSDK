package com.xignite.sdk.api.webservices.XigniteGlobalCurrencies.Models;

import lombok.Data;

@Data
public class Bar {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Symbol;
   public String StartDate;
   public String StartTime;
   public String EndDate;
   public String EndTime;
   public Double Open;
   public Double High;
   public Double Low;
   public Double Close;
   public Double Average;
   public Double Volume;
}
