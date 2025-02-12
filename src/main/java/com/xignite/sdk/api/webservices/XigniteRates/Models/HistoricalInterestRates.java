package com.xignite.sdk.api.webservices.XigniteRates.Models;

import lombok.Data;

@Data
public class HistoricalInterestRates {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Type;
   public RateDescription Description;
   public Rate[] Rates;
}
