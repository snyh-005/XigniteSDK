package com.xignite.sdk.api.webservices.XigniteBonds.Models;

import lombok.Data;

@Data
public class BondResult {
   public String Symbol;
   public String FIGI;
   public String CUSIP;
   public String ISIN;
   public String Description;
   public String PriceSource;
}
