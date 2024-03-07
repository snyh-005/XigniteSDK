package com.xignite.sdk.api.webservices.XigniteGlobalFundFundamentals.Models;

import lombok.Data;

@Data
public class Dividend {
   public String Type;
   public String PaymentFrequency;
   public String ExDate;
   public String PayDate;
   public String RecordDate;
   public String DeclaredDate;
   public Double DividendAmount;
   public String Currency;
}
