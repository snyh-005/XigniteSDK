package com.xignite.sdk.api.webservices.XigniteLogos.Models;

import lombok.Data;

@Data
public class LogosResult {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String IdentifierType;
   public String Identifier;
   public Logo Logo;
}
