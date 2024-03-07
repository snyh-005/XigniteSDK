package com.xignite.sdk.api.webservices.XigniteGlobalCurrencies.Models;

import lombok.Data;

@Data
public class ForwardContract {
   public String Expiration;
   public Double Bid;
   public Double Mid;
   public Double Ask;
   public Double SpotRate;
   public Double Points;
}
