package com.xignite.sdk.api.webservices.XigniteEstimates.Models;

import lombok.Data;

@Data
public class ResearchReportLine {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String ResearchReportLineType;
   public String Name;
   public String Description;
   public String[] Values;
}
