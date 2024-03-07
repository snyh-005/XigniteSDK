package com.xignite.sdk.api.webservices.XigniteGlobalQuotes.Models;

import lombok.Data;

@Data
public class SymbolChange {
   public String Symbol;
   public String OldSymbol;
   public String Name;
   public String OldName;
   public String Exchange;
   public String OldExchange;
   public String Currency;
   public String OldCurrency;
   public String Type;
   public String InstrumentClass;
}
