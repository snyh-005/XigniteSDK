package com.xignite.sdk.api.webservices.XigniteGlobalHistoricalV3.Models;

import lombok.Data;

@Data
public class CashDividend {
   public String Type;
   public String PaymentFrequency;
   public String DeclaredDate;
   public String RecordDate;
   public String PayDate;
   public String ExDate;
   public Double DividendAmount;
   public String Currency;
}
