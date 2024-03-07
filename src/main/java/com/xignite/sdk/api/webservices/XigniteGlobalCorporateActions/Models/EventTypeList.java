package com.xignite.sdk.api.webservices.XigniteGlobalCorporateActions.Models;

import lombok.Data;

@Data
public class EventTypeList {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public CorporateActionsEventType[] EventTypes;
}
