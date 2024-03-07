package com.xignite.sdk.api.webservices.XigniteBonds.Models;

import lombok.Data;

@Data
public class PriceComposite {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public InstrumentIdentifierBrief InstrumentIdentifierBrief;
   public TradedPrice TradedPrice;
   public String Identifier;
   public String IdentifierType;
}
