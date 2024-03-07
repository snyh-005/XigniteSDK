package com.xignite.sdk.api.webservices.XigniteCrypto.Models;

import lombok.Data;

@Data
public class TopCoin {
   public String Symbol;
   public String Name;
   public String Currency;
   public Double MarketCapitalization;
   public Double Volume;
}
