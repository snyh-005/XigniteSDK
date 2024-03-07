package com.xignite.sdk.api.webservices.XigniteGlobalFundFundamentals.Models;

import lombok.Data;

@Data
public class CountryDescription {
   public String CountryName;
   public String CountryCode;
   public String Region;
   public String MarketSize;
   public FundType[] FundTypes;
}
