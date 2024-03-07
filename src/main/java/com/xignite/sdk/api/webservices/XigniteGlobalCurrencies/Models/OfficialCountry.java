package com.xignite.sdk.api.webservices.XigniteGlobalCurrencies.Models;

import lombok.Data;

@Data
public class OfficialCountry {
   public String Country;
   public OfficialCurrency[] OfficialCurrencies;
}
