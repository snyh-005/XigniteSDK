package com.xignite.sdk.api.webservices.XigniteGlobalFundFundamentals.Models;

import lombok.Data;

@Data
public class FundamentalsSet {
   public String AsOfDate;
   public String Currency;
   public Fundamental[] Fundamentals;
}
