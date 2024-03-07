package com.xignite.sdk.api.webservices.XigniteGlobalCurrencies.Models;

import lombok.Data;

@Data
public class CurrencyChartBars {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Timing;
   public String PriceType;
   public CurrencyDescription CurrencyDescription;
   public ChartBar[] ChartBars;
}
