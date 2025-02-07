package com.xignite.sdk.api.webservices.XigniteCrypto.Models;

import lombok.Data;

@Data
public class CryptoChartBars {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Symbol;
   public String Currency;
   public String Exchange;
   public ChartBar[] ChartBars;
}
