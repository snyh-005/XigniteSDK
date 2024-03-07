package com.xignite.sdk.api.webservices.XigniteInsider.Models;

import lombok.Data;

@Data
public class FilingAsText {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String FileUrl;
   public SECHeader Header;
   public String Content;
}
