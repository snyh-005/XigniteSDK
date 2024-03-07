package com.xignite.sdk.api.webservices.XigniteBondMaster.Models;

import lombok.Data;

@Data
public class EarlyRedemptionScheduleComposite {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public InstrumentIdentifierBrief InstrumentIdentifierBrief;
   public EarlyRedemptionSchedule[] EarlyRedemptionSchedules;
}
