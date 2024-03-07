package com.xignite.sdk.api.webservices.XigniteGlobalETFs.Models;

import lombok.Data;

@Data
public class FundFlowsRange {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public Security Security;
   public Flows[] FundFlows;
   public String IdentifierType;
   public String Identifier;
}
