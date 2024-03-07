package com.xignite.sdk.api.webservices.XigniteGlobalIndicesRealTime.Models;

import lombok.Data;

@Data
public class Bar {
   public String StartDate;
   public String StartTime;
   public String EndDate;
   public String EndTime;
   public Double UTCOffset;
   public Double Open;
   public Double High;
   public Double Low;
   public Double Close;
   public Double Volume;
}
