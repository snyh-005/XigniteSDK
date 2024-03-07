package com.xignite.sdk.api.webservices.XigniteInsider.Models;

import lombok.Data;

@Data
public class NonDerivativeTable {
   public NonDerivativeTransaction[] NonDerivativeTransactions;
   public NonDerivativeHolding[] NonDerivativeHoldings;
}
