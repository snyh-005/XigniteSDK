package com.xignite.sdk.api.webservices.XigniteGlobalBondMaster.Models;

import lombok.Data;

@Data
public class BondInstrumentBrief {
   public String Description;
   public String MaturityDate;
   public Double CouponRate;
   public String CouponType;
   public String ConvertibleByIssuer;
   public String ConvertibleByHolder;
   public String CallableByIssuer;
   public String CallableByHolder;
   public String Denomination;
   public String DenominationCurrency;
}
