package com.xignite.sdk.api.webservices.XigniteGlobalRealTimeOptions.Models;

import lombok.Data;

@Data
public class Expiration {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String ExpirationDate;
   public int Month;
   public int Year;
   public Option[] Calls;
   public Option[] Puts;
}
