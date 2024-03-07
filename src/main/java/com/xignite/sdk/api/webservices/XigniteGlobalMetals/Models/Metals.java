package com.xignite.sdk.api.webservices.XigniteGlobalMetals.Models;

import lombok.Data;

@Data
public class Metals {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public Metal[] MetalList;
}
