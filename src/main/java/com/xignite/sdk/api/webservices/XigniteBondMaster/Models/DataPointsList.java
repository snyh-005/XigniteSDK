package com.xignite.sdk.api.webservices.XigniteBondMaster.Models;

import lombok.Data;

@Data
public class DataPointsList {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public DataPoint[] DataPoints;
}
