package com.xignite.sdk.api.webservices.XigniteGlobalMaster.Models;

import lombok.Data;

@Data
public class Instrument {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String InstrumentClass;
   public String Name;
   public String CUSIP;
   public String ISIN;
   public String Valoren;
   public String ActiveDate;
   public String InactiveDate;
   public String MostLiquidExchange;
   public String Identifier;
   public String IdentifierType;
   public String CFICode;
   public String Description;
   public String Active;
   public CustomAttribute[] CustomAttributes;
   public Security[] Securities;
   public String DataProvider;
   public String Security;
}
