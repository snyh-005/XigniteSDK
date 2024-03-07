package com.xignite.sdk.api.webservices.XigniteEdgar.Models;

import lombok.Data;

@Data
public class SECHeader {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Number;
   public String AccessionNumber;
   public String ConformedSubmissionType;
   public String PublicDocumentCount;
   public String ConformedPeriodOfReport;
   public String ItemInformation;
   public String FiledAsOfDate;
   public String DateOfFilingChange;
   public String SROS;
   public SECFiler Filer;
}
