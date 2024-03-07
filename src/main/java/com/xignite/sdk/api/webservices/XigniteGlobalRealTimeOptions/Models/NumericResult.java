package com.xignite.sdk.api.webservices.XigniteGlobalRealTimeOptions.Models;

import lombok.Data;

@Data
public class NumericResult {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public Double Value;
}
