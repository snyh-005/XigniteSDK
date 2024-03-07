package com.xignite.sdk.api.webservices.XigniteGlobalNews.Models;

import lombok.Data;

@Data
public class SectorList {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String[] Sectors;
}
