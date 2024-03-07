package com.xignite.sdk.api.webservices.XigniteGlobalMaster.Models;

import lombok.Data;

@Data
public class Issuer {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Name;
   public String CIK;
   public String Industry;
   public String Sector;
   public String ActiveDate;
   public String InactiveDate;
   public String CompanyIdentifier;
   public String Domicile;
   public String Active;
   public CustomAttribute[] CustomAttributes;
   public Instrument[] Instruments;
   public String DataProvider;
   public Classification[] Classifications;
   public String FactSetEntityId;
}
