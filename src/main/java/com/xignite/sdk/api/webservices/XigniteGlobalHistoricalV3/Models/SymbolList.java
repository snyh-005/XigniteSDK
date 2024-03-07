package com.xignite.sdk.api.webservices.XigniteGlobalHistoricalV3.Models;

import lombok.Data;

@Data
public class SymbolList {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public ExchangeDescription Exchange;
   public SecurityDescription[] SecurityDescriptions;
}
