package com.xignite.sdk.api.webservices.XigniteGlobalOptionMaster.Models;

import lombok.Data;

@Data
public class Expiration {
   public String ExpirationDate;
   public int Month;
   public int Year;
   public OptionDescription[] Calls;
   public OptionDescription[] Puts;
}
