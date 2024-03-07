package com.xignite.sdk.api.webservices.XigniteGlobalIndicesHistorical.Models;

import lombok.Data;

@Data
public class IndexBars {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public IndexDescriptionDto Index;
   public Bar[] Bars;
}
