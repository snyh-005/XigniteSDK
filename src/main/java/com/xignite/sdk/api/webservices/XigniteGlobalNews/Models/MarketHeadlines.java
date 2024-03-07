package com.xignite.sdk.api.webservices.XigniteGlobalNews.Models;

import lombok.Data;

@Data
public class MarketHeadlines {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public MarketHeadline[] Headlines;
}
