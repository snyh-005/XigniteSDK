package com.xignite.sdk.api.webservices.XigniteEstimates.Models;

import lombok.Data;

@Data
public class EstimatesResearchFieldList {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public Security Security;
   public EstimatesResearchField[] EstimatesResearchFields;
}
