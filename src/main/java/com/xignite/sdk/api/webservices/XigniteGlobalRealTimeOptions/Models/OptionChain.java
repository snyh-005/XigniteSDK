package com.xignite.sdk.api.webservices.XigniteGlobalRealTimeOptions.Models;

import lombok.Data;

@Data
public class OptionChain {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String ExpirationDate;
   public QuickQuote Quote;
   public Option[] Calls;
   public Option[] Puts;
   public Security Security;
}
