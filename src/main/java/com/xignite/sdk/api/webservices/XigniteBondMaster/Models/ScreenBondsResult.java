package com.xignite.sdk.api.webservices.XigniteBondMaster.Models;

import lombok.Data;

@Data
public class ScreenBondsResult {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Domicile;
   public String IssuerType;
   public String BondType;
   public String Callable;
   public String Convertible;
   public String StartMaturityDate;
   public String EndMaturityDate;
   public String MinCouponRate;
   public String MaxCouponRate;
   public String Issuer;
   public String IncludeNonActive;
   public int MaxResultCount;
   public BondResult[] BondResults;
}
