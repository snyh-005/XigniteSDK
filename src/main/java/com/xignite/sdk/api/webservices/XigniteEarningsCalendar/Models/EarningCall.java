package com.xignite.sdk.api.webservices.XigniteEarningsCalendar.Models;

import lombok.Data;

@Data
public class EarningCall {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String IdentifierType;
   public String Identifier;
   public Security Security;
   public String EarningsQuarter;
   public String EarningsDateQuarter;
   public String EarningsDate;
   public String TimeType;
   public String DateType;
   public String ConfirmationDate;
}
