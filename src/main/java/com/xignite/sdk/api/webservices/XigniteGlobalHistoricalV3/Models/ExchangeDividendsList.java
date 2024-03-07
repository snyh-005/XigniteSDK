package com.xignite.sdk.api.webservices.XigniteGlobalHistoricalV3.Models;

import lombok.Data;

@Data
public class ExchangeDividendsList {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Exchange;
   public String ExDate;
   public String CorporateActionsAdjusted;
   public ExchangeDividend[] ExchangeDividends;
}
