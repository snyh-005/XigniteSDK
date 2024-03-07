package com.xignite.sdk.api.webservices.XigniteGlobalETFs.Models;

import lombok.Data;

@Data
public class FundFlows {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public Security Security;
   public Flows Flows;
   public String IdentifierType;
   public String Identifier;
}
