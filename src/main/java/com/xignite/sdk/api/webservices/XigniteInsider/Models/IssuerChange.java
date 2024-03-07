package com.xignite.sdk.api.webservices.XigniteInsider.Models;

import lombok.Data;

@Data
public class IssuerChange {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String CIK;
   public int Transactions;
   public String StartDate;
   public String EndDate;
}
