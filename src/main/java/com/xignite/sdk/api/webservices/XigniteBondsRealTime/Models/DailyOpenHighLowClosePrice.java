package com.xignite.sdk.api.webservices.XigniteBondsRealTime.Models;

import lombok.Data;

@Data
public class DailyOpenHighLowClosePrice {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public InstrumentIdentifierBrief InstrumentIdentifierBrief;
   public DailyOpenHighLowClose DailyOpenHighLowClose;
   public String Identifier;
   public String IdentifierType;
}
