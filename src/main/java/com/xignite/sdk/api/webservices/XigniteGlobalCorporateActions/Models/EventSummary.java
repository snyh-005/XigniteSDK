package com.xignite.sdk.api.webservices.XigniteGlobalCorporateActions.Models;

import lombok.Data;

@Data
public class EventSummary {
   public String EventType;
   public String EffectiveDate;
   public String CompositeIdentifier;
   public String EventIdentifier;
   public String EventNotes;
   public String Created;
   public String LastUpdated;
}
