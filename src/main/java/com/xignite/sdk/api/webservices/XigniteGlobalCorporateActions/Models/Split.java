package com.xignite.sdk.api.webservices.XigniteGlobalCorporateActions.Models;

import lombok.Data;

@Data
public class Split {
   public Double SplitRatio;
   public Double Denominator;
   public Double Numerator;
   public String ExDate;
   public String EventIdentifier;
}
