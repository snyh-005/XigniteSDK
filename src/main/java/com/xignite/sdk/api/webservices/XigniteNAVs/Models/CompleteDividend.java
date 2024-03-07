package com.xignite.sdk.api.webservices.XigniteNAVs.Models;

import lombok.Data;

@Data
public class CompleteDividend {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public Security Security;
   public String Currency;
   public String Code;
   public String Type;
   public String PaymentFrequency;
   public String DeclaredDate;
   public String RecordDate;
   public String PayDate;
   public String ExDate;
   public Double DividendAmount;
   public String DataConfidence;
}
