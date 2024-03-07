package com.xignite.sdk.api.webservices.XigniteInsider.Models;

import lombok.Data;

@Data
public class NonDerivativeTransaction {
   public Value securityTitle;
   public Value transactionDate;
   public Value deemedExecutionDate;
   public TransactionCoding transactionCoding;
   public Value transactionTimeliness;
   public TransactionAmounts transactionAmounts;
   public PostTransactionAmounts postTransactionAmounts;
   public OwnershipNature ownershipNature;
}
