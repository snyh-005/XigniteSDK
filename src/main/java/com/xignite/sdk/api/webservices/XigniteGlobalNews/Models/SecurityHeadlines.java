package com.xignite.sdk.api.webservices.XigniteGlobalNews.Models;

import lombok.Data;

@Data
public class SecurityHeadlines {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public Security Security;
   public SecurityHeadline[] Headlines;
}
