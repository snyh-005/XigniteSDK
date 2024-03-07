package com.xignite.sdk.api.webservices.XigniteGlobalFundFundamentals.Models;

import lombok.Data;

@Data
public class FundQuarterEndTrailingReturns {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public Fund Fund;
   public QuarterEndTrailingReturnsSet[] QuarterEndTrailingReturnsSets;
}
