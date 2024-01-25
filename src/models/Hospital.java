package models;

public class Hospital {
    String hospitalName;
    String hospitalAddress;
    Long phoneNumber;
    String emailId;

    public Hospital(String hospitalName, String hospitalAddress, Long phoneNumber, String emailId) {
        this.hospitalName = hospitalName;
        this.hospitalAddress = hospitalAddress;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
