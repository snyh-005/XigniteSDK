package com.xignite.sdk.api.webservices.XigniteGlobalBondMaster.Models;

import lombok.Data;

@Data
public class ScreenBondResult {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public Issuer Issuer;
   public BondInstrumentComposite[] BondInstrumentComposites;
}
