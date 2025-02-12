package com.xignite.sdk.api.webservices.XigniteGlobalRealTimeFutures.Models;

import lombok.Data;

@Data
public class FutureChartBars {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Timing;
   public FutureDescription FutureDescription;
   public ChartBar[] ChartBars;
}
