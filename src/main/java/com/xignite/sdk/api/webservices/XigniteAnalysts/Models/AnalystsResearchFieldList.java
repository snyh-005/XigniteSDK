package com.xignite.sdk.api.webservices.XigniteAnalysts.Models;

import lombok.Data;

@Data
public class AnalystsResearchFieldList {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public Security Security;
   public AnalystsResearchField[] AnalystsResearchFields;
}
