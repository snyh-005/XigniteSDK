package com.xignite.sdk.api.webservices.XigniteGlobalESG.Models;

import lombok.Data;

@Data
public class TemperatureScore {
   public String AsOfDate;
   public String NearTerm;
   public String LongTerm;
   public String Trend;
   public String Target;
   public String Scope3Reporting;
   public String InternationalEnergyAgencySector;
}
