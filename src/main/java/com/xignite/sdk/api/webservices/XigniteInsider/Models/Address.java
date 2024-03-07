package com.xignite.sdk.api.webservices.XigniteInsider.Models;

import lombok.Data;

@Data
public class Address {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String Street1;
   public String Street2;
   public String City;
   public String State;
   public String ZipCode;
   public String StateDescription;
}
