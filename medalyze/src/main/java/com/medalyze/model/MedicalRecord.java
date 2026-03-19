package com.medalyze.model;

import com.medalyze.singleton.DatabaseConnection;

public class MedicalRecord {

    private String recordID;
    private String historySummary;
    private Patient patient;

    public MedicalRecord(String recordID, String historySummary, Patient patient) {
        this.recordID = recordID;
        this.historySummary = historySummary;
        this.patient = patient;
    }

    public String getRecordID() {
        return recordID;
    }

    public String getHistorySummary() {
        return historySummary;
    }

    public void updateSummary(String newSummary) {
        this.historySummary = newSummary;
    }
    
    public void saveRecord() {
        DatabaseConnection db = DatabaseConnection.getInstance();
        db.executeQuery("Saving medical record: " + recordID);
    }
}