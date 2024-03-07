package com.xignite.sdk.api.webservices.XigniteInsider.Models;

import lombok.Data;

@Data
public class InsiderOwnerships {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public Insider Insider;
   public InsiderOwnership[] Ownerships;
}
