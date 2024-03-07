package com.xignite.sdk.api.webservices.XigniteMoneyMarkets.Models;

import lombok.Data;

@Data
public class SwapRateDescription {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String SwapType;
   public String Currency;
   public String Tenor;
   public String Symbol;
   public String FloatingReferenceRate;
   public String Description;
}
