package com.xignite.sdk.api.webservices.XigniteSuperQuotes.Models;

import lombok.Data;

@Data
public class ChartBarsSet {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Identifier;
   public String IdentifierType;
   public Security Security;
   public ChartBar[] ChartBars;
}
