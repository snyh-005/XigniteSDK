package com.xignite.sdk.api.webservices.XigniteGlobalETFs.Models;

import lombok.Data;

@Data
public class NAV {
   public String AsOfDate;
   public long AssetsUnderManagement;
   public Double NetAssetValue;
   public Double PercentChange;
   public Double Change;
   public Double PreviousNetAssetValue;
   public long SharesOutstanding;
   public String Currency;
}
