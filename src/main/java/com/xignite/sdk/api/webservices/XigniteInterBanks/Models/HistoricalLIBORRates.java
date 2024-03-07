package com.xignite.sdk.api.webservices.XigniteInterBanks.Models;

import lombok.Data;

@Data
public class HistoricalLIBORRates {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Type;
   public String Currency;
   public String Source;
   public RateDescription Description;
   public Rate[] Rates;
}
