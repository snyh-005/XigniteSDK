package com.xignite.sdk.api.webservices.XigniteEarningsCalendar.Models;

import lombok.Data;

@Data
public class FundamentalTypesItems {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public EarningCalenderItem[] EarningCalenderItems;
}
