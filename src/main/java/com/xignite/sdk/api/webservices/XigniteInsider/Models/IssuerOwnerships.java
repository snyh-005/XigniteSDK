package com.xignite.sdk.api.webservices.XigniteInsider.Models;

import lombok.Data;

@Data
public class IssuerOwnerships {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public Security Security;
   public SharesAsOf ShareOutstanding;
   public IssuerOwnership[] Ownerships;
}
