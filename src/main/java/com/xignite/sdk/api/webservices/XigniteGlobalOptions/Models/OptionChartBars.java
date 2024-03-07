package com.xignite.sdk.api.webservices.XigniteGlobalOptions.Models;

import lombok.Data;

@Data
public class OptionChartBars {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Symbol;
   public String SymbologyType;
   public String BaseSymbol;
   public String Type;
   public String ExpirationDate;
   public Double StrikePrice;
   public String Currency;
   public Double ContractSize;
   public String CFI;
   public String Exchange;
   public String Timing;
   public ChartBar[] ChartBars;
}
