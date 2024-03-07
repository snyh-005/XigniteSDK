package com.xignite.sdk.api.webservices.XigniteFactSetFundamentals.Models;

import lombok.Data;

@Data
public class FundamentalDescriptionList {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public FundamentalDescription[] FundamentalDescriptions;
}
