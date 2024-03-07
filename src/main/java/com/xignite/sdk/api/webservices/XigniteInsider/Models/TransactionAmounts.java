package com.xignite.sdk.api.webservices.XigniteInsider.Models;

import lombok.Data;

@Data
public class TransactionAmounts {
   public Value transactionShares;
   public Value transactionPricePerShare;
   public Value transactionAcquiredDisposedCode;
}
