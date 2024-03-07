package com.xignite.sdk.api.webservices.XigniteInsider.Models;

import lombok.Data;

@Data
public class InsiderTransactions {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public Insider Insider;
   public Transaction[] Transactions;
}
