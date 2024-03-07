package com.xignite.sdk.api.webservices.XigniteInsider.Models;

import lombok.Data;

@Data
public class InsiderOwnership {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public Security Security;
   public Relationship Relationship;
   public int Shares;
   public Double Price;
   public Double MarketValue;
   public int Options;
   public Double PercentageOwnership;
}
