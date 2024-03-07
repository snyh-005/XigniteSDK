package com.xignite.sdk.api.webservices.XigniteNAVs.Models;

import lombok.Data;

@Data
public class GlobalNAV {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public Fund Fund;
   public String Date;
   public String Time;
   public Double UTCOffset;
   public Double NAV;
   public Double PreviousNAV;
   public Double Change;
   public Double PercentChange;
   public Double SevenDayYield;
   public Double PreviousSevenDayYield;
   public Double PremiumDiscount;
   public String Currency;
   public Double CumulativeAdjustmentFactor;
}
