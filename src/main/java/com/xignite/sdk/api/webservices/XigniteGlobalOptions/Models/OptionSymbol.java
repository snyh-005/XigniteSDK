package com.xignite.sdk.api.webservices.XigniteGlobalOptions.Models;

import lombok.Data;

@Data
public class OptionSymbol {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Symbol;
   public String SymbologyType;
   public String BaseSymbol;
   public String Type;
   public String ExpirationDate;
   public int Month;
   public int Year;
   public Double StrikePrice;
}
