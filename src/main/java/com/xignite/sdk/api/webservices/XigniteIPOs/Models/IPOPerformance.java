package com.xignite.sdk.api.webservices.XigniteIPOs.Models;

import lombok.Data;

@Data
public class IPOPerformance {
   public String Symbol;
   public String Name;
   public Double OfferPrice;
   public String OfferDate;
   public String TradeDate;
   public String Currency;
   public Double ClosePrice;
   public String ClosePriceDate;
   public Double PercentChange;
}
