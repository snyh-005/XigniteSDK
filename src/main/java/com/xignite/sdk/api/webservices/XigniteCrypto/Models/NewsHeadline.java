package com.xignite.sdk.api.webservices.XigniteCrypto.Models;

import lombok.Data;

@Data
public class NewsHeadline {
   public String DateTime;
   public String Title;
   public String Url;
   public NewsSource NewsSource;
   public String Summary;
   public String ImageUrl;
   public String[] Tags;
   public String[] Categories;
}
