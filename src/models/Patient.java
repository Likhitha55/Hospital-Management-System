package models;

public class Patient {
    String patientId;
    String patientName;
    String decease;
    Long phoneNumber;
    int age;
    Doctor doctor;
    Room room;

    public Patient(String patientId, String patientName, String decease, Long phoneNumber, int age,Doctor doctor,Room room) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.decease = decease;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.doctor = doctor;
        this.room = room;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDecease() {
        return decease;
    }

    public void setDecease(String decease) {
        this.decease = decease;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
