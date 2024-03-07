package com.xignite.sdk.api.webservices.XigniteGlobalQuotes.Models;

import lombok.Data;

@Data
public class GlobalAuctionQuote {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public Security Security;
   public Double OpeningAuction;
   public Double OpeningAuctionSize;
   public String OpeningAuctionDate;
   public String OpeningAuctionTime;
   public Double ClosingAuction;
   public Double ClosingAuctionSize;
   public String ClosingAuctionDate;
   public String ClosingAuctionTime;
   public Double LastAuction;
   public Double LastAuctionSize;
   public Double PreviousClosingAuction;
   public String PreviousClosingAuctionDate;
   public Double UTCOffset;
   public String Date;
   public String Time;
   public String Identifier;
   public String IdentifierType;
}
