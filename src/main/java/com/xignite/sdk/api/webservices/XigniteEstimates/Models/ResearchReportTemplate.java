package com.xignite.sdk.api.webservices.XigniteEstimates.Models;

import lombok.Data;

@Data
public class ResearchReportTemplate {
   public String Title;
   public ResearchReportLineTemplate[] ResearchReportLineTemplates;
   public String Outcome;
   public String Message;
}
