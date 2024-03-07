package com.xignite.sdk.api.webservices.XigniteFactSetEstimates.Models;

import lombok.Data;

@Data
public class Estimate {
   public String Date;
   public String RelativeFiscalPeriod;
   public String Value;
   public String Estimates;
   public String UpRevisions;
   public String DownRevisions;
   public String Low;
   public String High;
   public String StandardDeviation;
   public String Median;
   public String LastUpdated;
}
