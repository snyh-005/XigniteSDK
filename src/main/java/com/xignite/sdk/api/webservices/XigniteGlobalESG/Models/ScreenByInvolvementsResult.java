package com.xignite.sdk.api.webservices.XigniteGlobalESG.Models;

import lombok.Data;

@Data
public class ScreenByInvolvementsResult {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Sector;
   public String Industry;
   public String Exchange;
   public String Region;
   public String PercentThreshold;
   public String Involvement;
   public CompanyDescription[] Companies;
}
