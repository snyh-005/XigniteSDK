package com.xignite.sdk.api.webservices.XigniteGlobalHistoricalV3.Models;

import lombok.Data;

@Data
public class ExchangeSplitsList {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public ExchangeSplit[] ExchangeSplits;
}
