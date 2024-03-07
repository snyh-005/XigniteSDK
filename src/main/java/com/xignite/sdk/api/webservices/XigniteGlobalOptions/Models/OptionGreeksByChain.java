package com.xignite.sdk.api.webservices.XigniteGlobalOptions.Models;

import lombok.Data;

@Data
public class OptionGreeksByChain {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public GreeksByExpiration[] GreeksByExpirations;
   public Security Security;
}
