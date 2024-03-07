package com.xignite.sdk.api.webservices.XigniteGlobalRealTimeOptions.Models;

import lombok.Data;

@Data
public class ChartBar {
   public String StartDate;
   public String StartTime;
   public String EndDate;
   public String EndTime;
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
   public String Session;
   public Double AdjustmentRatio;
}
