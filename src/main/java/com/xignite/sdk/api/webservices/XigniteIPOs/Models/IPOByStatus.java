package com.xignite.sdk.api.webservices.XigniteIPOs.Models;

import lombok.Data;

@Data
public class IPOByStatus {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public IPODescription[] IPODescriptions;
}
