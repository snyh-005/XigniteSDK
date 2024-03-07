package com.xignite.sdk.api.webservices.XigniteRates.Models;

import lombok.Data;

@Data
public class RateTableCell {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String CellType;
   public Double Value;
   public String Text;
}
