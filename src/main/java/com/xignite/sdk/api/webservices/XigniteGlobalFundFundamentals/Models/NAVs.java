package com.xignite.sdk.api.webservices.XigniteGlobalFundFundamentals.Models;

import lombok.Data;

@Data
public class NAVs {
   public String Date;
   public Double NAV;
   public Double PreviousNAV;
   public Double Change;
   public Double PercentChange;
   public Double SevenDayYield;
   public Double PreviousSevenDayYield;
   public Double PremiumDiscount;
   public String Currency;
}
