package com.xignite.sdk.api.webservices.XigniteGlobalCurrencies.Models;

import lombok.Data;

@Data
public class ForwardRate {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String BaseCurrency;
   public String QuoteCurrency;
   public String Symbol;
   public String QuoteType;
   public String Date;
   public String Time;
   public ForwardContract[] ForwardRates;
}
