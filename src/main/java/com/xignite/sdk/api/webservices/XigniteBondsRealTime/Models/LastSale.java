package com.xignite.sdk.api.webservices.XigniteBondsRealTime.Models;

import lombok.Data;

@Data
public class LastSale {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public InstrumentIdentifierBrief InstrumentIdentifierBrief;
   public BondLastSale BondLastSale;
   public String Identifier;
   public String IdentifierType;
}
