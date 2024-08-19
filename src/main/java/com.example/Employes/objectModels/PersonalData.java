package com.example.Employes.objectModels;

public class PersonalData {
    public String name;
    public String adress;
    public String phonNumber;

    public PersonalData(String name, String adress, String phonNumber) {
        this.name = name;
        this.adress = adress;
        this.phonNumber = phonNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhonNumber() {
        return phonNumber;
    }

    public void setPhonNumber(String phonNumber) {
        this.phonNumber = phonNumber;
    }
    @Override
    public String toString() {
        return name + "," +adress  + ", " +phonNumber;
    }
}
