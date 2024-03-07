package com.xignite.sdk.api.webservices.XigniteGlobalCorporateActions.Models;

import lombok.Data;

@Data
public class ListingChange {
   public String EffectiveDate;
   public String Type;
   public String Name;
   public String Symbol;
   public String Currency;
   public String OldExchange;
   public String Exchange;
   public String EventIdentifier;
}
