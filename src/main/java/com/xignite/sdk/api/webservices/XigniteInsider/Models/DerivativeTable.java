package com.xignite.sdk.api.webservices.XigniteInsider.Models;

import lombok.Data;

@Data
public class DerivativeTable {
   public DerivativeTransaction[] DerivativeTransactions;
   public DerivativeHolding[] DerivativeHoldings;
}
