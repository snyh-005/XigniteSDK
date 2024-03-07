package com.xignite.sdk.api.webservices.XigniteInsider.Models;

import lombok.Data;

@Data
public class TransactionCoding {
   public String transactionFormType;
   public String transactionCode;
   public int equitySwapInvolved;
   public Footnote[] Footnotes;
}
