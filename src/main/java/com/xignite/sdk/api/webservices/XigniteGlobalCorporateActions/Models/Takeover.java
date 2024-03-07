package com.xignite.sdk.api.webservices.XigniteGlobalCorporateActions.Models;

import lombok.Data;

@Data
public class Takeover {
   public String EffectiveDate;
   public String EventStatus;
   public String EventIdentifier;
   public String OpenDate;
   public String CloseDate;
   public String RecordDate;
   public String UnconditionalDate;
   public String RegistrationDate;
   public String OptionElectionDate;
   public String WithdrawalFromDate;
   public String WithdrawalToDate;
   public String WithdrawalRights;
   public String IsDefaultOption;
   public String PayType;
   public String PayDate;
   public String NumberOfInitialInstruments;
   public String NumberOfNewInstruments;
   public String MinimumAmount;
   public String MaximumAmount;
   public String Currency;
   public String OfferorCompanyIdentifier;
   public String OfferorCompanyName;
   public String IsHostile;
   public String TargetQuantity;
   public String TargetPercent;
   public String PreOfferQuantity;
   public String PreOfferPercent;
   public String DutchAuction;
   public Security PaidSecurity;
}
