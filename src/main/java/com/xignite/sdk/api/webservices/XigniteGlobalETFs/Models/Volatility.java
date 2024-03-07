package com.xignite.sdk.api.webservices.XigniteGlobalETFs.Models;

import lombok.Data;

@Data
public class Volatility {
   public Double Volatility5Year;
   public Double Volatility3Year;
   public Double Volatility1Year;
   public Double AverageDailyVolume6Month;
   public Double AverageDailyVolume3Month;
   public Double AverageDailyVolume1Month;
   public String LastModified;
   public String AsOfDate;
}
