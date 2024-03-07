package com.xignite.sdk.api.webservices.XigniteGlobalOptionMaster.Models;

import lombok.Data;

@Data
public class OptionChain {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public InstrumentBrief Underlying;
   public Expiration[] Expirations;
}
