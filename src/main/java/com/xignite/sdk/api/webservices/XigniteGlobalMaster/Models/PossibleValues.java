package com.xignite.sdk.api.webservices.XigniteGlobalMaster.Models;

import lombok.Data;

@Data
public class PossibleValues {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String DataProvider;
   public String PossibleValuesOf;
   public PossibleValue[] Values;
}
