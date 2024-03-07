package com.xignite.sdk.api.webservices.XigniteFactSetFundamentals.Models;

import lombok.Data;

@Data
public class CompanyBalanceSheet {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public Company Company;
   public FinancialStatement BalanceSheet;
}
