package com.example.Employes.objectModels;

public class Emloyes {
    public String id;
    public OtherData otherData;
    public PerformanceEvaluatuionAndFeedback performanceEvaluationAndFeedback;
    public WorkBook workBook;
    public PersonalData personalData;

    public Emloyes(String id, OtherData otherData, PerformanceEvaluatuionAndFeedback performanceEvaluationAndFeedback, WorkBook workBook, PersonalData personalData) {
        this.id = id;
        this.otherData = otherData;
        this.performanceEvaluationAndFeedback = performanceEvaluationAndFeedback;
        this.workBook = workBook;
        this.personalData = personalData;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OtherData getOtherData() {
        return otherData;
    }

    public void setOtherData(OtherData otherData) {
        this.otherData = otherData;
    }

    public PerformanceEvaluatuionAndFeedback getPerformanceEvaluationAndFeedback() {
        return performanceEvaluationAndFeedback;
    }

    public void setPerformanceEvaluationAndFeedback(PerformanceEvaluatuionAndFeedback performanceEvaluationAndFeedback) {
        this.performanceEvaluationAndFeedback = performanceEvaluationAndFeedback;
    }

    public WorkBook getWorkBook() {
        return workBook;
    }

    public void setWorkBook(WorkBook workBook) {
        this.workBook = workBook;
    }

    public PersonalData getPersonalData() {
        return personalData;
    }

    public void setPersonalData(PersonalData personalData) {
        this.personalData = personalData;
    }

    @Override
    public String toString() {
        return
                 id + ","
                + otherData.toString()
                + performanceEvaluationAndFeedback.toString() + ","
                + workBook.toString() + ","
                + personalData.toString()
                ;
    }}

