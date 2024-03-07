package com.xignite.sdk.api.webservices.XigniteFactSetFundamentals.Models;

import lombok.Data;

@Data
public class FinancialStatement {
   public String StatementType;
   public String ReportType;
   public String StatementTemplate;
   public String FiscalPeriodEndDate;
   public String IsRestated;
   public String Currency;
   public Item[] Items;
   public String FilingStatus;
}
