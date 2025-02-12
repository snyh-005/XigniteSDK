package com.xignite.sdk.api.webservices.XigniteGlobalMetals.Models;

import lombok.Data;

@Data
public class MetalChartBars {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Timing;
   public String PriceType;
   public MetalDescription MetalDescription;
   public ChartBar[] ChartBars;
}
