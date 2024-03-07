package com.xignite.sdk.api.webservices.XigniteBonds.Models;

import lombok.Data;

@Data
public class TradedPrice {
   public String ShortName;
   public String Symbol;
   public String PriceSource;
   public String Currency;
   public Double LastSale;
   public String LastSaleDate;
   public String LastSaleTime;
   public int LastSaleSize;
   public Double DailyOpen;
   public String DailyOpenDate;
   public String DailyOpenTime;
   public Double DailyHigh;
   public String DailyHighDate;
   public String DailyHighTime;
   public Double DailyLow;
   public String DailyLowDate;
   public String DailyLowTime;
   public Double YearlyHigh;
   public String YearlyHighDate;
   public Double YearlyLow;
   public String YearlyLowDate;
   public Double LastYearClose;
   public String LastYearCloseDate;
   public Double YieldToMaturity;
   public Double PriceUsedForCalculations;
   public String PriceUsedForCalculationsDate;
   public String PriceUsedForCalculationsTime;
}
