package com.xignite.sdk.api.webservices.XigniteGlobalFundFundamentals.Models;

import lombok.Data;

@Data
public class Breakdown {
   public String BreakdownType;
   public BreakdownSet[] BreakdownSets;
   public String PortfolioDate;
}
