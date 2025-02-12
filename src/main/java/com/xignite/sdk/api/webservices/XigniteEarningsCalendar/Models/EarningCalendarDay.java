package com.xignite.sdk.api.webservices.XigniteEarningsCalendar.Models;

import lombok.Data;

@Data
public class EarningCalendarDay {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Date;
   public int Count;
   public Announcement[] Announcements;
}
