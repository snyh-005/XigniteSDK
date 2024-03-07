package com.xignite.sdk.api.webservices.XigniteGlobalCorporateActions.Models;

import lombok.Data;

@Data
public class SecurityEvent {
   public Security Security;
   public EventSummary[] EventSummaries;
}
