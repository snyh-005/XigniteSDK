package com.xignite.sdk.api.webservices.XigniteRates.Models;

import lombok.Data;

@Data
public class FamilyRates {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String RateFamilyType;
   public HistoricalInterestRates[] HistoricalInterestRate;
}
