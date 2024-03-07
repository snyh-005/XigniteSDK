package com.xignite.sdk.api.webservices.XigniteGlobalETFs.Models;

import lombok.Data;

@Data
public class NAVs {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public Security Security;
   public NAV NAV;
   public String IdentifierType;
   public String Identifier;
}
