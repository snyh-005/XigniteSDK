package com.xignite.sdk.api.webservices.XigniteBondMaster.Models;

import lombok.Data;

@Data
public class ListBondsResult {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Domicile;
   public String IssuerType;
   public String BondType;
   public String StartSymbol;
   public String EndSymbol;
   public BondResult[] Securities;
}
