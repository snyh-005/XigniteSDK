package com.xignite.sdk.api.webservices.XigniteGlobalETFs.Models;

import lombok.Data;

@Data
public class CharacteristicList {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public CharacteristicDescription[] CharacteristicDescriptions;
}
