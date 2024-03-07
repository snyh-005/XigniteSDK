package com.xignite.sdk.api.webservices.XigniteGlobalMaster.Models;

import lombok.Data;

@Data
public class LookupItems {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Name;
   public LookUpSecurity[] Securities;
}
