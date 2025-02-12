package com.xignite.sdk.api.webservices.XigniteGlobalIndicesRealTime.Models;

import lombok.Data;

@Data
public class IndexValue {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Identifier;
   public String IdentifierType;
   public IndexDescriptionDto Index;
   public IndexQuote Value;
}
