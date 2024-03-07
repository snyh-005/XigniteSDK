package com.xignite.sdk.api.webservices.XigniteEarningsCalendar.Models;

import lombok.Data;

@Data
public class EarningDates {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String IdentifierType;
   public String Identifier;
   public Security Security;
   public String Q1EarningDate;
   public String Q2EarningDate;
   public String Q3EarningDate;
   public String Q4EarningDate;
}
