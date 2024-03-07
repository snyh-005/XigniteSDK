package com.xignite.sdk.api.webservices.XigniteGlobalESG.Models;

import lombok.Data;

@Data
public class ExchangeList {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Region;
   public ExchangeDescription[] ExchangeDescriptions;
}
