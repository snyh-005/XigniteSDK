package com.xignite.sdk.api.webservices.XigniteGlobalIndicesRealTime.Models;

import lombok.Data;

@Data
public class IndexSymbolMapping {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public IndexDescriptionDto Index;
   public String OldSymbol;
}
