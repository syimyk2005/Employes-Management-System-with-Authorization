package com.example.Employes.objectModels;
public class PerformanceEvaluatuionAndFeedback {
    public String reportData;
    public String awards;
    public PerformanceEvaluatuionAndFeedback(String report, String awards) {
        this.reportData = report;
        this.awards = awards;
    }
    public String getReport() {
        return reportData;
    }
    public void setReport(String report) {
        this.reportData = report;
    }
    public String getAwards() {
        return awards;
    }
    public void setAwards(String awards) {
        this.awards = awards;
    }
    @Override
    public String toString() {
        return reportData + "," +awards ;
    }
}
