package com.xignite.sdk.api.webservices.XigniteFactSetEstimates.Models;

import lombok.Data;

@Data
public class CompanyRecommendationSummary {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public Company Company;
   public RecommendationSummary[] RecommendationSummarySet;
}
