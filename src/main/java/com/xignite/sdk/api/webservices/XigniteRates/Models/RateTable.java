package com.xignite.sdk.api.webservices.XigniteRates.Models;

import lombok.Data;

@Data
public class RateTable {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public RateTableLine[] RateTableLines;
}
