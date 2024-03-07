package com.xignite.sdk.api.webservices.XigniteGlobalHistoricalV3.Models;

import lombok.Data;

@Data
public class AdjustmentFactor {
   public String Event;
   public String Exdate;
   public String EventDescription;
   public Double Factor;
   public Double CumulativeAdjustmentFactor;
   public String FIGI;
}
