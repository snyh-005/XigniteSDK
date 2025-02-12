package com.xignite.sdk.api.webservices.XigniteGlobalRealTimeOptions.Models;

import lombok.Data;

@Data
public class UnderlyingSymbolList {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public ExchangeDescription Exchange;
   public UnderlyingSecurity[] UnderlyingSecurityDescriptions;
}
