package com.xignite.sdk.api.webservices.XigniteGlobalESG.Models;

import lombok.Data;

@Data
public class CategoryList {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public CategoryDescription[] CategoryDescriptions;
}
