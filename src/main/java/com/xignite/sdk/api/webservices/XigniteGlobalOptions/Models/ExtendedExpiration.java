package com.xignite.sdk.api.webservices.XigniteGlobalOptions.Models;

import lombok.Data;

@Data
public class ExtendedExpiration {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String ExpirationDate;
   public int Month;
   public int Year;
   public ExtendedOption[] Calls;
   public ExtendedOption[] Puts;
}
