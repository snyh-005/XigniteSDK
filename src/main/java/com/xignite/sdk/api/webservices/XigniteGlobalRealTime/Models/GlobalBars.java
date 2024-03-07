package com.xignite.sdk.api.webservices.XigniteGlobalRealTime.Models;

import lombok.Data;

@Data
public class GlobalBars {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Identifier;
   public String IdentifierType;
   public Bar[] Bars;
   public Security Security;
}
