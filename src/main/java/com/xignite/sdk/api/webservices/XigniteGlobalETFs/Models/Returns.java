package com.xignite.sdk.api.webservices.XigniteGlobalETFs.Models;

import lombok.Data;

@Data
public class Returns {
   public Double ReturnInception;
   public Double Return10Year;
   public Double Return5Year;
   public Double Return3Year;
   public Double Return1Year;
   public Double Return3Month;
   public Double Return1Month;
   public Double ReturnYTD;
   public Double Return1Day;
   public String LastModified;
   public String AsOfDate;
}
