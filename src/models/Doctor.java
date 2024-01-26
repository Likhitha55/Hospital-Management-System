package models;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    String docName;
    String docId;
    String docDegree;
    int docSalary;
    String speciality;
    String timeSlot;
    List<Patient> patientsList;

    public Doctor(String docName, String docId, String docDegree, int docSalary, String speciality) {
        this.docName = docName;
        this.docId = docId;
        this.docDegree = docDegree;
        this.docSalary = docSalary;
        this.speciality = speciality;
        this.patientsList = new ArrayList<>();
    }
}
