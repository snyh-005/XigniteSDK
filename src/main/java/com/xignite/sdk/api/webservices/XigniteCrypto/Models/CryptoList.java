package com.xignite.sdk.api.webservices.XigniteCrypto.Models;

import lombok.Data;

@Data
public class CryptoList {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public Crypto[] Cryptos;
}
