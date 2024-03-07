package com.xignite.sdk.api.webservices.XigniteEdgar.Models;

import lombok.Data;

@Data
public class FilingDetails {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String FileUrl;
   public SECHeader Header;
   public Document[] Documents;
   public String ContentIfFormatWasInvalid;
}
