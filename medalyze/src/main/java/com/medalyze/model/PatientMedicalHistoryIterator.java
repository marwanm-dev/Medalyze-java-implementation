package com.medalyze.model;

import java.util.List;

public class PatientMedicalHistoryIterator implements MedicalHistoryIterator {

    private List<String> records;
    private int position = 0;

    public PatientMedicalHistoryIterator(PatientMedicalHistory history) {
        this.records = history.getRecords();
    }

    public boolean hasNext() {
        return position < records.size();
    }

    public String next() {
        return records.get(position++);
    }
}