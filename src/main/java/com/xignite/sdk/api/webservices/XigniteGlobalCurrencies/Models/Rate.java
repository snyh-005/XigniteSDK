package com.xignite.sdk.api.webservices.XigniteGlobalCurrencies.Models;

import lombok.Data;

@Data
public class Rate {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String BaseCurrency;
   public String QuoteCurrency;
   public String Symbol;
   public String Date;
   public String Time;
   public String QuoteType;
   public Double Bid;
   public Double Mid;
   public Double Ask;
   public Double Spread;
   public String Text;
   public String Source;
}
