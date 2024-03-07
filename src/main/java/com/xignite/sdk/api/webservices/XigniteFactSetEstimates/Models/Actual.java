package com.xignite.sdk.api.webservices.XigniteFactSetEstimates.Models;

import lombok.Data;

@Data
public class Actual {
   public String Outcome;
   public String Message;
   public String ActualType;
   public String Value;
   public String ReportDate;
   public String PublicationDate;
   public String FiscalPeriod;
   public String FiscalPeriodEndDate;
   public String ActualFlag;
}
