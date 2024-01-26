package models;

public class Room {
    String roomId;
    boolean occupied;
    Patient p;
    Doctor d;
    public Room(String roomId,Patient p, Doctor d) {
        this.roomId = roomId;
        this.p = p;
        this.d = d;
    }
}
