package com.xignite.sdk.api.webservices.XigniteEarningsCalendar.Models;

import lombok.Data;

@Data
public class ReplayInformation {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String IdentifierType;
   public String Identifier;
   public Security Security;
   public String Date;
   public String EndDate;
   public String WebcastURL;
   public String WebcastEndDate;
}
