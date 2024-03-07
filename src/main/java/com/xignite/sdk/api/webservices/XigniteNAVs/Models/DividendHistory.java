package com.xignite.sdk.api.webservices.XigniteNAVs.Models;

import lombok.Data;

@Data
public class DividendHistory {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Symbol;
   public Dividend[] Dividends;
}
