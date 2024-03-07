package com.xignite.sdk.api.webservices.XigniteInsider.Models;

import lombok.Data;

@Data
public class OwnershipDocument {
   public String Outcome;
   public String Message;
   public String Identity;
   public Double Delay;
   public String schemaVersion;
   public String documentType;
   public String periodOfReport;
   public String notSubjectToSection16;
   public String form3HoldingsReported;
   public String form4TransactionsReported;
   public Issuer issuer;
   public ReportingOwner[] ReportingOwners;
   public DerivativeTable[] DerivativeTable;
   public NonDerivativeTable[] NonDerivativeTable;
   public Footnote[] Footnotes;
   public OwnerSignature ownerSignature;
}
