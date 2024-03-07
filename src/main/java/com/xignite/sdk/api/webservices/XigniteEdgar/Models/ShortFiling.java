package com.xignite.sdk.api.webservices.XigniteEdgar.Models;

import lombok.Data;

@Data
public class ShortFiling {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String CIK;
   public String Date;
   public String Type;
   public String Amendment;
   public String TextFileUrl;
   public String HtmlFileUrl;
   public String AlternateHtmlFileUrl;
   public int FilingId;
}
