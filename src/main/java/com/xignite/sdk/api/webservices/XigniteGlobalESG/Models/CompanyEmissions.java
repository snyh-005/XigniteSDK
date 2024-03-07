package com.xignite.sdk.api.webservices.XigniteGlobalESG.Models;

import lombok.Data;

@Data
public class CompanyEmissions {
   public String AsOfDate;
   public Double Scope1Emissions;
   public Double Scope2Emissions;
   public Double Scope3Emissions;
   public String ReportDate;
   public String InternationalEnergyAgencySector;
}
