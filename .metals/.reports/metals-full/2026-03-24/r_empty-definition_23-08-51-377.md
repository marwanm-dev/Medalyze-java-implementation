error id: file://<HOME>/projects/Medalyze-java-implementation/Deliverable%20%231/medalyze/src/main/java/com/medalyze/model/MedicalRecord.java:com/medalyze/singleton/DatabaseConnection#
file://<HOME>/projects/Medalyze-java-implementation/Deliverable%20%231/medalyze/src/main/java/com/medalyze/model/MedicalRecord.java
empty definition using pc, found symbol in pc: com/medalyze/singleton/DatabaseConnection#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 79
uri: file://<HOME>/projects/Medalyze-java-implementation/Deliverable%20%231/medalyze/src/main/java/com/medalyze/model/MedicalRecord.java
text:
```scala
package com.medalyze.model;

import com.medalyze.singleton.DatabaseConnection@@;

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
```


#### Short summary: 

empty definition using pc, found symbol in pc: com/medalyze/singleton/DatabaseConnection#