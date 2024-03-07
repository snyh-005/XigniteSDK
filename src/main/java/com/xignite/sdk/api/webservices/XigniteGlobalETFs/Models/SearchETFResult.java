package com.xignite.sdk.api.webservices.XigniteGlobalETFs.Models;

import lombok.Data;

@Data
public class SearchETFResult {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String SearchValue;
   public String Region;
   public Security[] ETFs;
}
