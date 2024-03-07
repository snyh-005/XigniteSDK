package com.xignite.sdk.api.webservices.XigniteInsider.Models;

import lombok.Data;

@Data
public class Relationship {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String IsDirector;
   public String IsOfficer;
   public String OfficerTitle;
   public String IsTenPercentOwner;
   public String IsOther;
}
