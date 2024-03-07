package com.xignite.sdk.api.webservices.XigniteGlobalHistoricalV3.Models;

import lombok.Data;

@Data
public class ChartBar {
   public String StartDateTime;
   public String EndDateTime;
   public Double UTCOffset;
   public Double Open;
   public Double High;
   public Double Low;
   public Double Close;
   public Double Volume;
   public int Trades;
   public Double TWAP;
   public Double VWAP;
   public String Currency;
   public Double CumulativeAdjustmentFactor;
}
