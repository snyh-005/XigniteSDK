package com.xignite.sdk.api.webservices.XigniteFactSetEstimates.Models;

import lombok.Data;

@Data
public class TargetPriceSummaries {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public Company Company;
   public TargetPriceSummary[] TargetPriceSummary;
   public String IdentifierType;
   public String Identifier;
}
