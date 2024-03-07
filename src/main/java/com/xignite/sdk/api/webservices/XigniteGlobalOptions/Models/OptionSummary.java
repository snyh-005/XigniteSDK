package com.xignite.sdk.api.webservices.XigniteGlobalOptions.Models;

import lombok.Data;

@Data
public class OptionSummary {
   public String BaseSymbol;
   public String Type;
   public Double StrikePrice;
   public String ExpirationDate;
}
