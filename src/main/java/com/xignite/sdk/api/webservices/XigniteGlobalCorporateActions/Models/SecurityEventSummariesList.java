package com.xignite.sdk.api.webservices.XigniteGlobalCorporateActions.Models;

import lombok.Data;

@Data
public class SecurityEventSummariesList {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public SecurityEvent[] SecurityEventSummaries;
}
