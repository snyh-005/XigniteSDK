package com.xignite.sdk.api.webservices.XigniteInsider.Models;

public class DerivativeTransaction {
   public Value securityTitle;
   public Value conversionOrExercisePrice;
   public Value transactionDate;
   public Value deemedExecutionDate;
   public TransactionCoding transactionCoding;
   public Value transactionTimeliness;
   public TransactionAmounts transactionAmounts;
   public Value exerciseDate;
   public Value expirationDate;
   public UnderlyingSecurity underlyingSecurity;
   public PostTransactionAmounts postTransactionAmounts;
   public OwnershipNature ownershipNature;
}
