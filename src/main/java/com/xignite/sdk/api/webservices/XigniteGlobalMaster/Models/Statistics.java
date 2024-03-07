package com.xignite.sdk.api.webservices.XigniteGlobalMaster.Models;

import lombok.Data;

@Data
public class Statistics {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public long Count;
   public String Exchange;
}
