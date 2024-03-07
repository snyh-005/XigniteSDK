package com.xignite.sdk.api.webservices.XigniteEarningsCalendar.Models;

import lombok.Data;

@Data
public class SymbolDescription {
   public String CompanyName;
   public String CompanyIdentifier;
   public String CompanyDomicile;
   public String CompanyRegion;
   public String SecurityName;
   public String Symbol;
   public String Currency;
   public String DividendStatus;
}
