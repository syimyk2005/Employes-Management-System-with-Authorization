package com.example.Employes.objectModels;

public class WorkBook {
    public String privatedata;
    public String workExperiance;
    public String vacationsAndSickleave;

    public WorkBook(String privatedata, String workExperiance, String vacationsAndSickleave) {
        this.privatedata = privatedata;
        this.workExperiance = workExperiance;
        this.vacationsAndSickleave = vacationsAndSickleave;
    }
    public String getPrivatedata() {
        return privatedata;
    }

    public void setPrivatedata(String privatedata) {
        this.privatedata = privatedata;
    }

    public String getWorkExperiance() {
        return workExperiance;
    }

    public void setWorkExperiance(String workExperiance) {
        this.workExperiance = workExperiance;
    }

    public String getVacationsAndSickleave() {
        return vacationsAndSickleave;
    }

    public void setVacationsAndSickleave(String vacationsAndSickleave) {
        this.vacationsAndSickleave = vacationsAndSickleave;
    }
    @Override
    public String toString() {
        return privatedata + "," +workExperiance + "," +vacationsAndSickleave;
    }
}


