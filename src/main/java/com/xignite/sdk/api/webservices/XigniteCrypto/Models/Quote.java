package com.xignite.sdk.api.webservices.XigniteCrypto.Models;

import lombok.Data;

@Data
public class Quote {
   public String Symbol;
   public String Exchange;
   public String DateTime;
   public Double Open;
   public Double High;
   public Double Low;
   public Double Last;
   public Double Median;
   public Double Volume;
   public Double MarketCapitalization;
   public Double Change;
   public Double PercentChange;
   public Double High52Weeks;
   public Double Low52Weeks;
   public String Currency;
}
