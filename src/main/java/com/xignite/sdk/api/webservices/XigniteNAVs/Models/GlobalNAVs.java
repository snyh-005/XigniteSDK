package com.xignite.sdk.api.webservices.XigniteNAVs.Models;

import lombok.Data;

@Data
public class GlobalNAVs {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public Fund Fund;
   public String StartDate;
   public String EndDate;
   public GlobalNAV[] NAVs;
}
