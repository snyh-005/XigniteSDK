package com.xignite.sdk.api.webservices.XigniteBondMaster.Models;

import lombok.Data;

@Data
public class EarlyRedemptionSchedule {
   public String Date;
   public String Currency;
   public Double Price;
   public String Mandatory;
   public String Partial;
   public Double Amount;
}
