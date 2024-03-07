package com.xignite.sdk.api.webservices.XigniteGlobalFundFundamentals.Models;

import lombok.Data;

@Data
public class HoldingsSet {
   public String PortfolioDate;
   public HoldingsBreakdown[] Holdings;
}
