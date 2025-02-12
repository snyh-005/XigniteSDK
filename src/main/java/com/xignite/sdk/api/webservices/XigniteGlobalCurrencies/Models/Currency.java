package com.xignite.sdk.api.webservices.XigniteGlobalCurrencies.Models;

import lombok.Data;

@Data
public class Currency {
   public String Symbol;
   public String Name;
   public String Plural;
   public String Active;
   public String Digital;
   public String Message;
   public Country[] Countries;
}
