package com.xignite.sdk.api.webservices.XigniteInterBanks.Models;

import lombok.Data;

@Data
public class KIBORRate {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Type;
   public String Currency;
   public String Date;
   public Double Value;
   public String Text;
   public String Source;
   public RateDescription Description;
}
