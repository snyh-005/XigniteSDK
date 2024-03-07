package com.xignite.sdk.api.webservices.XigniteGlobalETFs.Models;

import lombok.Data;

@Data
public class Flows {
   public Double NetFlowsInception;
   public Double NetFlows10Year;
   public Double NetFlows5Year;
   public Double NetFlows3Year;
   public Double NetFlows1Year;
   public Double NetFlows3Month;
   public Double NetFlows1Month;
   public Double NetFlowsYTD;
   public long AssetsUnderManagement;
   public String AsOfDate;
}
