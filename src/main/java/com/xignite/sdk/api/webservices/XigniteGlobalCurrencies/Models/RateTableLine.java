package com.xignite.sdk.api.webservices.XigniteGlobalCurrencies.Models;

import lombok.Data;

@Data
public class RateTableLine {
   public String BaseCurrency;
   public QuoteCurrencyItem[] Columns;
}
