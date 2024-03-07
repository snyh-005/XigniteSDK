package com.xignite.sdk.api.webservices.XigniteMoneyMarkets.Models;

import lombok.Data;

@Data
public class InterestRate {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Type;
   public String Date;
   public Double Value;
   public String Price;
   public Double Spread;
   public Double Change;
   public String Text;
   public RateDescription Description;
}
