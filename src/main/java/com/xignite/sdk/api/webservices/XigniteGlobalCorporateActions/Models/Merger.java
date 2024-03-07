package com.xignite.sdk.api.webservices.XigniteGlobalCorporateActions.Models;

import lombok.Data;

@Data
public class Merger {
   public String EffectiveDate;
   public String EventStatus;
   public String CompositeIdentifier;
   public String EventIdentifier;
   public String RelatedCompositeIdentifier;
   public String RecordDate;
   public String AppointedDate;
   public String PayDate;
   public String OptionElectionDate;
   public String IsDefaultOption;
   public String PayType;
   public String NumberOfInitialInstruments;
   public String NumberOfNewInstruments;
   public String Amount;
   public String Currency;
   public String WithdrawalFromDate;
   public String WithdrawalToDate;
   public String WithdrawalRights;
   public Security PaidSecurity;
}
