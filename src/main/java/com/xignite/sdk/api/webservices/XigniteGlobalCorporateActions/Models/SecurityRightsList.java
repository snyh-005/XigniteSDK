package com.xignite.sdk.api.webservices.XigniteGlobalCorporateActions.Models;

import lombok.Data;

@Data
public class SecurityRightsList {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Market;
   public String MarketIdentificationCode;
   public String ExDate;
   public SecurityRights[] ExchangeRights;
}
