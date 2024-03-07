package com.xignite.sdk.api.webservices.XigniteGlobalNews.Models;

import lombok.Data;

@Data
public class SecurityHeadline {
   public String Title;
   public String Date;
   public String Time;
   public Double UTCOffset;
   public String Source;
   public String Url;
   public String[] Images;
   public TagGroup[] Tags;
   public String PaywallType;
   public String Summary;
}
