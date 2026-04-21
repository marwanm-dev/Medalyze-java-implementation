package com.medalyze.model;

import java.util.ArrayList;
import java.util.List;

public class PatientMedicalHistory implements MedicalHistoryCollection {

    private List<String> records = new ArrayList<>();

    public void addRecord(String record) {
        records.add(record);
    }

    public List<String> getRecords() {
        return records;
    }

    public MedicalHistoryIterator createIterator() {
        return new PatientMedicalHistoryIterator(this);
    }
}