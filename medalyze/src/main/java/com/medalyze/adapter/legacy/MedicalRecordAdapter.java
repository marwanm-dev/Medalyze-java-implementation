package com.medalyze.adapter.legacy;

public class MedicalRecordAdapter implements MedicalRecord {

    private LegacyMedicalRecord legacyRecord;

    public MedicalRecordAdapter(LegacyMedicalRecord legacyRecord) {
        this.legacyRecord = legacyRecord;
    }

    @Override
    public String getHistory() {
        // Adapt method
        return legacyRecord.getPatientInfo();
    }
}