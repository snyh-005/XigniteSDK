package com.xignite.sdk.api.webservices.XigniteBondMaster.Models;

import lombok.Data;

@Data
public class BondInstrument {
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
   public String ProductName;
   public String BondType;
   public String Domicile;
   public String DistributionFrequency;
   public String DistributionFrequencyUnit;
   public String DayCountConvention;
   public String PaysAtMonthEnd;
   public String WithoutPhysicalCoupon;
   public String OriginalIssuePrice;
   public String IssueDate;
   public String IssueTime;
   public String InstrumentForm;
   public String TradesWithAllIncluded;
   public String DatedDate;
   public String Senior;
   public String LiquidationRight;
   public String DistributionType;
   public String IssueStatus;
   public String Amortization;
   public String Guarantor;
   public String GuaranteeType;
}
