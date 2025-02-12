package com.xignite.sdk.api.webservices.XigniteGlobalRealTime.Models;

import lombok.Data;

@Data
public class GlobalBar {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public Bar Bar;
   public String Identifier;
   public String IdentifierType;
   public Security Security;
}
