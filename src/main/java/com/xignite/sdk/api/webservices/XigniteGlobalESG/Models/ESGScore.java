package com.xignite.sdk.api.webservices.XigniteGlobalESG.Models;

import lombok.Data;

@Data
public class ESGScore {
   public String AsOfDate;
   public Double ESG;
   public Double Environmental;
   public Double Social;
   public Double Governance;
   public String Version;
}
