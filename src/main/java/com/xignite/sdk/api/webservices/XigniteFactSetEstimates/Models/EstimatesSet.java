package com.xignite.sdk.api.webservices.XigniteFactSetEstimates.Models;

import lombok.Data;

@Data
public class EstimatesSet {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String EstimateType;
   public String ReportType;
   public String Currency;
   public String EstimateFiscalPeriod;
   public String EstimateFiscalPeriodEndDate;
   public Estimate[] Estimates;
   public String Unit;
}
