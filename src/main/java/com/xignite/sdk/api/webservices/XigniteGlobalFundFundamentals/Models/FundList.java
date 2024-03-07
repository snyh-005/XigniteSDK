package com.xignite.sdk.api.webservices.XigniteGlobalFundFundamentals.Models;

import lombok.Data;

@Data
public class FundList {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public FundDescription[] FundDescriptions;
}
