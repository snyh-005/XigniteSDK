package com.xignite.sdk.api.webservices.XigniteGlobalRealTimeOptions.Models;

import lombok.Data;

@Data
public class ExtendedOptions {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public QuickQuote Quote;
   public ExtendedExpiration[] Expirations;
   public Security Security;
}
