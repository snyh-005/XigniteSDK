package com.xignite.sdk.api.webservices.XigniteLogos.Models;

import lombok.Data;

@Data
public class LogosByExchange {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String NextPage;
   public int TotalLogosByExchange;
   public Logo[] Logos;
}
