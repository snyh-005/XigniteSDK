package com.xignite.sdk.api.webservices.XigniteGlobalHolidays.Models;

import lombok.Data;

@Data
public class FinancialCenter {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String FinancialCenterCode;
   public String CurrencyCode;
   public String CountryCode;
   public String FinancialCenterName;
}
