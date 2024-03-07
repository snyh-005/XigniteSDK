package com.xignite.sdk.api.webservices.XigniteGlobalMaster.Models;

import lombok.Data;

@Data
public class LookUpSecurity {
   public String CIK;
   public String CUSIP;
   public String Currency;
   public String Symbol;
   public String ISIN;
   public String Valoren;
   public String SEDOL;
   public String FIGI;
   public String CompositeFIGI;
   public String Name;
   public String InstrumentClass;
   public String Market;
   public String MarketIdentificationCode;
   public String Sector;
   public String Industry;
   public String HomeTradingPlace;
   public String Active;
   public String MostLiquidExchange;
}
