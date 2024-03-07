package com.xignite.sdk.api.webservices.XigniteNASDAQLastSale.Models;

import lombok.Data;

@Data
public class LastSaleQuote {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Symbol;
   public String CompanyName;
   public String Date;
   public String Time;
   public Double Open;
   public Double Close;
   public Double High;
   public Double Low;
   public Double Last;
   public Double Volume;
   public Double PreviousClose;
   public String PreviousCloseDate;
   public Double Change;
   public Double PercentChange;
   public String TradingHalted;
   public String Identifier;
   public String IdentifierType;
}
