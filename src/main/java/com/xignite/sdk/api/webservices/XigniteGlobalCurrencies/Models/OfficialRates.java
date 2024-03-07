package com.xignite.sdk.api.webservices.XigniteGlobalCurrencies.Models;

import lombok.Data;

@Data
public class OfficialRates {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public OfficialCountry[] CountryList;
}
