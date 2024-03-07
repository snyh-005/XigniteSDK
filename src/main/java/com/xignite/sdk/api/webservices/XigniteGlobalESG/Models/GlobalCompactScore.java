package com.xignite.sdk.api.webservices.XigniteGlobalESG.Models;

import lombok.Data;

@Data
public class GlobalCompactScore {
   public String AsOfDate;
   public Double GlobalCompact;
   public Double HumanRights;
   public Double LabourRights;
   public Double Environment;
   public Double AntiCorruption;
   public String Version;
}
