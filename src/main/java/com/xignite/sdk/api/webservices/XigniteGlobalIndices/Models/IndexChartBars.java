package com.xignite.sdk.api.webservices.XigniteGlobalIndices.Models;

import lombok.Data;

@Data
public class IndexChartBars {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Timing;
   public IndexDescriptionDto Index;
   public ChartBar[] ChartBars;
}
