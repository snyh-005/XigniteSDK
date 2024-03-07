package com.xignite.sdk.api.webservices.XigniteInsider.Models;

import lombok.Data;

@Data
public class IssuerOwnership {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public Insider Insider;
   public Relationship Relationship;
   public int Shares;
   public int Options;
   public Double Price;
   public Double MarketValue;
   public Double PercentageOwnership;
}
