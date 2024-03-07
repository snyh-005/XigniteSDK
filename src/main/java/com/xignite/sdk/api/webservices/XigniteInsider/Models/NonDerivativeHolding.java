package com.xignite.sdk.api.webservices.XigniteInsider.Models;

import lombok.Data;

@Data
public class NonDerivativeHolding {
   public Value securityTitle;
   public PostTransactionAmounts postTransactionAmounts;
   public OwnershipNature ownershipNature;
}
