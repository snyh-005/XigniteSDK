package com.xignite.sdk.api.webservices.XigniteGlobalCurrencies.Models;

import lombok.Data;

@Data
public class RateConversion {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String FromCurrencySymbol;
   public String FromCurrencyName;
   public String ToCurrencySymbol;
   public String ToCurrencyName;
   public String Date;
   public String Time;
   public Double Amount;
   public Double Result;
   public Double Rate;
   public String Source;
}
