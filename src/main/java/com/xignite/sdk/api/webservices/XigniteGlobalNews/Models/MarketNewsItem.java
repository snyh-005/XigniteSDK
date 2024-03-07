package com.xignite.sdk.api.webservices.XigniteGlobalNews.Models;

import lombok.Data;

@Data
public class MarketNewsItem {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Headline;
   public String Time;
   public String Source;
   public String Url;
   public String Summary;
   public TagGroup[] Tags;
   public String PaywallType;
}
