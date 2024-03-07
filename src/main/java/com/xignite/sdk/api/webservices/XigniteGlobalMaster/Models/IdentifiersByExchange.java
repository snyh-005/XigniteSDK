package com.xignite.sdk.api.webservices.XigniteGlobalMaster.Models;

import lombok.Data;

@Data
public class IdentifiersByExchange {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String IdentifierType;
   public String Exchange;
   public String InstrumentClass;
   public int Count;
   public IdentifierRecord[] ArrayOfIdentifierRecords;
}
