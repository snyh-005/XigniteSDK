package com.xignite.sdk.api.webservices.XigniteGlobalFundFundamentals.Models;

import lombok.Data;

@Data
public class FundNAVHistory {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Identifier;
   public String IdentifierType;
   public String AdjustmentMethod;
   public Fund Fund;
   public String StartDate;
   public String EndDate;
   public NAVs[] NAVs;
}
