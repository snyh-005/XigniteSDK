package com.xignite.sdk.api.webservices.XigniteGlobalETFs.Models;

import lombok.Data;

@Data
public class SearchETFBySecurityExposureResult {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Region;
   public Security[] Security;
   public ETFWithWeight[] ETFs;
}
