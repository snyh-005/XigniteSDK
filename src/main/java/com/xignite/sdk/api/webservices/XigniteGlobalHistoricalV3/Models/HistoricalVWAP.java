package com.xignite.sdk.api.webservices.XigniteGlobalHistoricalV3.Models;

import lombok.Data;

@Data
public class HistoricalVWAP {
   public String StartTime;
   public String EndTime;
   public String VWAPType;
   public Double VWAP;
   public Double High;
   public Double Low;
   public Double Volume;
   public Double Change;
   public Double PercentChange;
   public Double TWAP;
   public Double Amount;
   public Double Trades;
   public String Currency;
   public Double CumulativeAdjustmentFactor;
}
