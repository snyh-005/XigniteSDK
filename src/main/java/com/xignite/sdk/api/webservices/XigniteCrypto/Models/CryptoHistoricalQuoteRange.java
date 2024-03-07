package com.xignite.sdk.api.webservices.XigniteCrypto.Models;

import lombok.Data;

@Data
public class CryptoHistoricalQuoteRange {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public HistoricalQuote[] CryptoHistoricalQuotes;
}
