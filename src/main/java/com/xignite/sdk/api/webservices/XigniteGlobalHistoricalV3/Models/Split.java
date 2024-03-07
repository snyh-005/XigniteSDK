package com.xignite.sdk.api.webservices.XigniteGlobalHistoricalV3.Models;

import lombok.Data;

@Data
public class Split {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String ExDate;
   public Double Numerator;
   public Double Denominator;
   public Double SplitRatio;
}
