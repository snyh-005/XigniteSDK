package com.xignite.sdk.api.webservices.XigniteInsider.Models;

import lombok.Data;

@Data
public class Role {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String CIK;
   public String Name;
   public Address Address;
   public Relationship Relationship;
   public Security Security;
}
