package com.xignite.sdk.api.webservices.XigniteGlobalRealTimeOptions.Models;

import lombok.Data;

@Data
public class ExtendedOptionChain {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String ExpirationDate;
   public QuickQuote Quote;
   public ExtendedOption[] Calls;
   public ExtendedOption[] Puts;
   public Security Security;
}
