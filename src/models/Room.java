package models;

public class Room {
    String roomId;
    boolean occupied;
    Patient p;
    Doctor d;
    public Room(String roomId, String patientId, String doctorId, Patient p, Doctor d) {
        this.roomId = roomId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.p = p;
        this.d = d;
    }
}
