package com.xignite.sdk.api.webservices.XigniteFactSetFundamentals.Models;

import lombok.Data;

@Data
public class CompanyList {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public Company[] Companies;
}
