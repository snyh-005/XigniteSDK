package com.xignite.sdk.api.webservices.XigniteGlobalOptionMaster.Models;

import lombok.Data;

@Data
public class OptionDescription {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public InstrumentBrief Underlying;
   public String Description;
   public String Valoren;
   public String Type;
   public String ExpirationDate;
   public int Month;
   public int Year;
   public Double StrikePrice;
   public String Currency;
   public String Exchange;
   public String ExerciseStyle;
   public Double ContractSize;
   public String ContractSizeUnit;
   public String PriceUnit;
   public String VolumeUnit;
   public String IsActive;
   public String IsAdjustedOption;
   public OptionSymbol[] OptionSymbols;
}
