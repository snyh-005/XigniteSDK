package com.xignite.sdk.api.webservices.XigniteBondsRealTime.Models;

import lombok.Data;

@Data
public class BondLastSale {
   public String ShortName;
   public String Symbol;
   public String PriceSource;
   public String Currency;
   public Double LastSale;
   public int LastSaleSize;
   public String LastSaleDate;
   public String LastSaleTime;
   public Double YieldToMaturity;
   public Double PriceUsedForCalculations;
   public String PriceUsedForCalculationsDate;
   public String PriceUsedForCalculationsTime;
}
