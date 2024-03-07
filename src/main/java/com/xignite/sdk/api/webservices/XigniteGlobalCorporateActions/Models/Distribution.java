package com.xignite.sdk.api.webservices.XigniteGlobalCorporateActions.Models;

import lombok.Data;

@Data
public class Distribution {
   public String PaymentType;
   public String DividendType;
   public String EventIdentifier;
   public String IsDefaultOption;
   public String OptionElectionDate;
   public String PaymentFrequency;
   public String ExDate;
   public String DeclaredDate;
   public String PayDate;
   public String RecordDate;
   public String GrossDividendAmount;
   public String NetDividendAmount;
   public String Currency;
   public String DeclaredGrossAmount;
   public String DeclaredCurrency;
   public String FXDate;
   public String TaxRate;
   public String NumberOfInitialInstruments;
   public String NumberOfNewInstruments;
   public String IsDistributedSecurityDifferent;
   public Security DistributedSecurity;
}
