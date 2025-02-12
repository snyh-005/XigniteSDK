package com.xignite.sdk.api.webservices.XigniteEstimates.Models;

import lombok.Data;

@Data
public class ResearchReport {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Title;
   public String AsOfDate;
   public String ResearchReportType;
   public ResearchReportLine[] ResearchReportLines;
}
