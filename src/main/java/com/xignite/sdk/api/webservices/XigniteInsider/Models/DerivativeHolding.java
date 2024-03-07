package com.xignite.sdk.api.webservices.XigniteInsider.Models;

import lombok.Data;

@Data
public class DerivativeHolding {
   public Value securityTitle;
   public Value conversionOrExercisePrice;
   public Value exerciseDate;
   public Value expirationDate;
   public UnderlyingSecurity underlyingSecurity;
   public OwnershipNature ownershipNature;
}
