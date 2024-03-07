package com.xignite.sdk.api.webservices.XigniteGlobalCorporateActions.Models;

import lombok.Data;

@Data
public class SecuritySwap {
   public String ExDate;
   public String RecordDate;
   public String PayDate;
   public String NumberOfInitialInstruments;
   public String NumberOfNewInstruments;
   public Security DistributedSecurity;
   public String EventIdentifier;
   public String IsDefaultOption;
}
