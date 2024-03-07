package com.xignite.sdk.api.webservices.XigniteEdgar.Models;

import lombok.Data;

@Data
public class QueryResult {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public Security Security;
   public ShortFiling[] Filings;
}
