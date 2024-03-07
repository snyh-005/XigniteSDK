package com.xignite.sdk.api.webservices.XigniteIPOs.Models;

import lombok.Data;

@Data
public class IPODescription {
   public String IPOIdentifier;
   public String Name;
   public String Symbol;
   public String Market;
   public String MarketIdentificationCode;
   public String Status;
   public String FilingDate;
   public String TradeDate;
   public String EstimatedOfferDate;
   public String OfferDate;
   public Double OfferLowPrice;
   public String OfferLowPriceSpecified;
   public Double OfferHighPrice;
   public String OfferHighPriceSpecified;
   public long OfferSize;
   public String OfferSizeSpecified;
   public Double OfferPrice;
   public String OfferPriceSpecified;
   public long OfferAmount;
   public String OfferAmountSpecified;
   public String Currency;
   public String SmallMarketCap;
   public String SmallMarketCapSpecified;
   public String SpecialPurposeAcquisitionCompany;
   public String SpecialPurposeAcquisitionCompanySpecified;
}
