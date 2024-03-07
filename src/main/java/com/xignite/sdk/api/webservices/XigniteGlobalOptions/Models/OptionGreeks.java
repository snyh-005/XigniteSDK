package com.xignite.sdk.api.webservices.XigniteGlobalOptions.Models;

import lombok.Data;

@Data
public class OptionGreeks {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String CalculationType;
   public String Symbol;
   public String SymbologyType;
   public OptionSummary OptionSummary;
   public Greeks Greeks;
}
