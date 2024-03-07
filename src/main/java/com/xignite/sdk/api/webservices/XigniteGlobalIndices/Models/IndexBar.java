package com.xignite.sdk.api.webservices.XigniteGlobalIndices.Models;

import lombok.Data;

@Data
public class IndexBar {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public IndexDescriptionDto Index;
   public Bar Bar;
}
