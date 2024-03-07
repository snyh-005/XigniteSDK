package com.xignite.sdk.api.webservices.XigniteBATSRealTime.Models;

import lombok.Data;

@Data
public class EquityChartBars {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public Security Security;
   public ChartBar[] ChartBars;
   public String Identifier;
   public String IdentifierType;
   public String Timing;
}
