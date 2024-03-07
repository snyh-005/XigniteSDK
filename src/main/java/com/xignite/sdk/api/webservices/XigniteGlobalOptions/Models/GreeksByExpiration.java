package com.xignite.sdk.api.webservices.XigniteGlobalOptions.Models;

import lombok.Data;

@Data
public class GreeksByExpiration {
   public String ExpirationDate;
   public OptionGreeks[] CallOptionGreeks;
   public OptionGreeks[] PutOptionGreeks;
}
