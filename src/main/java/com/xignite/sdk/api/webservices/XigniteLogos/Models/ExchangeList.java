package com.xignite.sdk.api.webservices.XigniteLogos.Models;

import lombok.Data;

@Data
public class ExchangeList {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public ExchangeDescription[] ExchangeDescriptions;
}
