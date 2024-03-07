package com.xignite.sdk.api.webservices.XigniteIPOs.Models;

import lombok.Data;

@Data
public class IPOsPerformance {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public IPOPerformance[] IPOPerformances;
}
