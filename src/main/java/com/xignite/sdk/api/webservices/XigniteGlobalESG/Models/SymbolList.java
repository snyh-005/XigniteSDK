package com.xignite.sdk.api.webservices.XigniteGlobalESG.Models;

import lombok.Data;

@Data
public class SymbolList {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String DataPackage;
   public String Market;
   public String MarketIdentificationCode;
   public SymbolDescription[] SymbolDescriptions;
}
