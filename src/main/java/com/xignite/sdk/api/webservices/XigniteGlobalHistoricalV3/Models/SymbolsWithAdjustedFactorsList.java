package com.xignite.sdk.api.webservices.XigniteGlobalHistoricalV3.Models;

import lombok.Data;

@Data
public class SymbolsWithAdjustedFactorsList {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public EventSymbol[] EventSymbols;
}
