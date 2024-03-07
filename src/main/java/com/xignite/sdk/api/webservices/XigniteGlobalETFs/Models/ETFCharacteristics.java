package com.xignite.sdk.api.webservices.XigniteGlobalETFs.Models;

import lombok.Data;

@Data
public class ETFCharacteristics {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public Security Security;
   public Characteristic[] Characteristics;
   public String IdentifierType;
   public String Identifier;
}
