package com.xignite.sdk.api.webservices.XigniteRates.Models;

import lombok.Data;

@Data
public class FHLBankRate {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String BankType;
   public String RateType;
   public String MaturityType;
   public String TermType;
   public String Date;
   public Double Value;
   public String Text;
   public String Note;
}
