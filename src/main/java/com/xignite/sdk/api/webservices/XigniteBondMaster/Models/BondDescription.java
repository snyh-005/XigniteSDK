package com.xignite.sdk.api.webservices.XigniteBondMaster.Models;

import lombok.Data;

@Data
public class BondDescription {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public InstrumentIdentifier InstrumentIdentifier;
   public Issuer Issuer;
   public BondInstrument BondInstrument;
}
