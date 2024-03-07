package com.xignite.sdk.api.webservices.XigniteGlobalFundFundamentals.Models;

import lombok.Data;

@Data
public class FeeSchedule {
   public String RecordNumber;
   public String FeeValue;
   public String FeeUnit;
   public String LowBreakpoint;
   public String HighBreakpoint;
   public String BreakpointUnit;
}
