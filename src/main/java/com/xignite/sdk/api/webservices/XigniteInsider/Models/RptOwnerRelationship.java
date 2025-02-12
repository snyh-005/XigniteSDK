package com.xignite.sdk.api.webservices.XigniteInsider.Models;

import lombok.Data;

@Data
public class RptOwnerRelationship {
   public int isDirector;
   public int isOfficer;
   public int isTenPercentOwner;
   public int isOther;
   public String officerTitle;
   public String otherText;
}
