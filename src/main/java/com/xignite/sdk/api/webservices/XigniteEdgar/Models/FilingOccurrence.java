package com.xignite.sdk.api.webservices.XigniteEdgar.Models;

import lombok.Data;

@Data
public class FilingOccurrence {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public Submission Submission;
   public int Count;
}
