package com.xignite.sdk.api.webservices.XigniteGlobalRealTimeOptions.Models;

import lombok.Data;

@Data
public class Options {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public QuickQuote Quote;
   public Expiration[] Expirations;
   public Security Security;
}
