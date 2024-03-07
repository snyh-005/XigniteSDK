package com.xignite.sdk.api.webservices.XigniteGlobalOptions.Models;

import lombok.Data;

@Data
public class Greeks {
   public Double Delta;
   public Double Gamma;
   public Double Theta;
   public Double Vega;
   public Double Rho;
   public Double ImpliedVolatility;
   public String OptionPriceTime;
   public String CalculationTime;
}
