package com.xignite.sdk.api.webservices.XigniteGlobalCorporateActions.Models;

import lombok.Data;

@Data
public class IdentifierChangeList {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public IdentifierChange[] IdentifierChanges;
}
