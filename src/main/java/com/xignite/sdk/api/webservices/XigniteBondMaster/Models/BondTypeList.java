package com.xignite.sdk.api.webservices.XigniteBondMaster.Models;

import lombok.Data;

@Data
public class BondTypeList {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public BondType[] BondTypes;
}
