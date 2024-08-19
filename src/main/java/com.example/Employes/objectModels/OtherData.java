package com.example.Employes.objectModels;

public class OtherData {
   public String informationAboutMaritalStatus;
   public String contractNumber;

   public OtherData(String informationAboutMaritalStatus, String contractNumber) {
      this.informationAboutMaritalStatus = informationAboutMaritalStatus;
      this.contractNumber = contractNumber;
   }

   public String getInformationAboutMaritalStatus() {
      return informationAboutMaritalStatus;
   }

   public void setInformationAboutMaritalStatus(String informationAboutMaritalStatus) {
      this.informationAboutMaritalStatus = informationAboutMaritalStatus;
   }

   public String getContractNumber() {
      return contractNumber;
   }

   public void setContractNumber(String contractNumber) {
      this.contractNumber = contractNumber;
   }

   @Override
   public String toString() {
      return informationAboutMaritalStatus + "," +contractNumber ;
   }
}
